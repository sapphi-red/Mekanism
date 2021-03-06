package mekanism.common.base;

import mekanism.api.Coord4D;
import mekanism.api.energy.IStrictEnergyAcceptor;
import mekanism.common.capabilities.Capabilities;
import mekanism.common.integration.forgeenergy.ForgeEnergyIntegration;
import mekanism.common.util.CapabilityUtils;
import mekanism.common.util.MekanismUtils;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Direction;
import net.minecraftforge.energy.CapabilityEnergy;
import net.minecraftforge.energy.IEnergyStorage;

public abstract class EnergyAcceptorWrapper implements IStrictEnergyAcceptor {

    public Coord4D coord;

    public static EnergyAcceptorWrapper get(TileEntity tile, Direction side) {
        if (tile == null || tile.getWorld() == null) {
            return null;
        }
        EnergyAcceptorWrapper wrapper = CapabilityUtils.getCapabilityHelper(tile, Capabilities.ENERGY_ACCEPTOR_CAPABILITY, side).getIfPresentElseDo(
              MekanismAcceptor::new,
              () -> {
                  if (MekanismUtils.useForge()) {
                      return CapabilityUtils.getCapabilityHelper(tile, CapabilityEnergy.ENERGY, side).getIfPresent(ForgeAcceptor::new);
                  }
                  return null;
              }
        );
        if (wrapper != null) {
            wrapper.coord = Coord4D.get(tile);
        }
        return wrapper;
    }

    public abstract boolean needsEnergy(Direction side);

    public static class MekanismAcceptor extends EnergyAcceptorWrapper {

        private IStrictEnergyAcceptor acceptor;

        public MekanismAcceptor(IStrictEnergyAcceptor mekAcceptor) {
            acceptor = mekAcceptor;
        }

        @Override
        public double acceptEnergy(Direction side, double amount, boolean simulate) {
            return acceptor.acceptEnergy(side, amount, simulate);
        }

        @Override
        public boolean canReceiveEnergy(Direction side) {
            return acceptor.canReceiveEnergy(side);
        }

        @Override
        public boolean needsEnergy(Direction side) {
            return acceptor.acceptEnergy(side, 1, true) > 0;
        }
    }

    //TODO: IC2
    /*public static class IC2Acceptor extends EnergyAcceptorWrapper {

        private IEnergySink acceptor;

        public IC2Acceptor(IEnergySink ic2Acceptor) {
            acceptor = ic2Acceptor;
        }

        @Override
        public double acceptEnergy(Direction side, double amount, boolean simulate) {
            double toTransfer = Math.min(acceptor.getDemandedEnergy(), IC2Integration.toEU(amount));
            if (simulate) {
                //IC2 has no built in way to simulate, so we have to calculate it ourselves
                return IC2Integration.fromEU(toTransfer);
            }
            double rejects = acceptor.injectEnergy(side, toTransfer, 0);
            return IC2Integration.fromEU(toTransfer - rejects);
        }

        @Override
        public boolean canReceiveEnergy(Direction side) {
            return acceptor.acceptsEnergyFrom(null, side);
        }

        @Override
        public boolean needsEnergy(Direction side) {
            return acceptor.getDemandedEnergy() > 0;
        }
    }*/

    public static class ForgeAcceptor extends EnergyAcceptorWrapper {

        private IEnergyStorage acceptor;

        public ForgeAcceptor(IEnergyStorage forgeConsumer) {
            acceptor = forgeConsumer;
        }

        @Override
        public double acceptEnergy(Direction side, double amount, boolean simulate) {
            return ForgeEnergyIntegration.fromForge(acceptor.receiveEnergy(ForgeEnergyIntegration.toForge(amount), simulate));
        }

        @Override
        public boolean canReceiveEnergy(Direction side) {
            return acceptor.canReceive();
        }

        @Override
        public boolean needsEnergy(Direction side) {
            return acceptor.receiveEnergy(1, true) > 0;
        }
    }
}