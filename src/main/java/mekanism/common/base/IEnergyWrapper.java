package mekanism.common.base;

import mekanism.api.energy.IStrictEnergyAcceptor;
import mekanism.api.energy.IStrictEnergyOutputter;
import mekanism.api.energy.IStrictEnergyStorage;

public interface IEnergyWrapper extends IStrictEnergyStorage, IStrictEnergyAcceptor, IStrictEnergyOutputter {

    double getMaxOutput();
}