package mekanism.common.registries;

import mekanism.common.Mekanism;
import mekanism.common.registration.impl.TileEntityTypeDeferredRegister;
import mekanism.common.registration.impl.TileEntityTypeRegistryObject;
import mekanism.common.tile.TileEntityAdvancedBoundingBlock;
import mekanism.common.tile.TileEntityBin;
import mekanism.common.tile.TileEntityBoilerCasing;
import mekanism.common.tile.TileEntityBoilerValve;
import mekanism.common.tile.TileEntityBoundingBlock;
import mekanism.common.tile.TileEntityCardboardBox;
import mekanism.common.tile.TileEntityChargepad;
import mekanism.common.tile.TileEntityChemicalCrystallizer;
import mekanism.common.tile.TileEntityChemicalDissolutionChamber;
import mekanism.common.tile.TileEntityChemicalInfuser;
import mekanism.common.tile.TileEntityChemicalInjectionChamber;
import mekanism.common.tile.TileEntityChemicalOxidizer;
import mekanism.common.tile.TileEntityChemicalWasher;
import mekanism.common.tile.TileEntityCombiner;
import mekanism.common.tile.TileEntityCrusher;
import mekanism.common.tile.TileEntityDigitalMiner;
import mekanism.common.tile.TileEntityDynamicTank;
import mekanism.common.tile.TileEntityDynamicValve;
import mekanism.common.tile.TileEntityElectricPump;
import mekanism.common.tile.TileEntityElectrolyticSeparator;
import mekanism.common.tile.TileEntityEnergizedSmelter;
import mekanism.common.tile.TileEntityEnergyCube;
import mekanism.common.tile.TileEntityEnrichmentChamber;
import mekanism.common.tile.TileEntityFluidTank;
import mekanism.common.tile.TileEntityFluidicPlenisher;
import mekanism.common.tile.TileEntityFormulaicAssemblicator;
import mekanism.common.tile.TileEntityFuelwoodHeater;
import mekanism.common.tile.TileEntityGasTank;
import mekanism.common.tile.TileEntityInductionCasing;
import mekanism.common.tile.TileEntityInductionCell;
import mekanism.common.tile.TileEntityInductionPort;
import mekanism.common.tile.TileEntityInductionProvider;
import mekanism.common.tile.TileEntityLaser;
import mekanism.common.tile.TileEntityLaserAmplifier;
import mekanism.common.tile.TileEntityLaserTractorBeam;
import mekanism.common.tile.TileEntityLogisticalSorter;
import mekanism.common.tile.TileEntityMetallurgicInfuser;
import mekanism.common.tile.TileEntityOredictionificator;
import mekanism.common.tile.TileEntityOsmiumCompressor;
import mekanism.common.tile.TileEntityPersonalChest;
import mekanism.common.tile.TileEntityPrecisionSawmill;
import mekanism.common.tile.TileEntityPressureDisperser;
import mekanism.common.tile.TileEntityPressurizedReactionChamber;
import mekanism.common.tile.TileEntityPurificationChamber;
import mekanism.common.tile.TileEntityQuantumEntangloporter;
import mekanism.common.tile.TileEntityResistiveHeater;
import mekanism.common.tile.TileEntityRotaryCondensentrator;
import mekanism.common.tile.TileEntitySecurityDesk;
import mekanism.common.tile.TileEntitySeismicVibrator;
import mekanism.common.tile.TileEntitySolarNeutronActivator;
import mekanism.common.tile.TileEntityStructuralGlass;
import mekanism.common.tile.TileEntitySuperheatingElement;
import mekanism.common.tile.TileEntityTeleporter;
import mekanism.common.tile.TileEntityThermalEvaporationBlock;
import mekanism.common.tile.TileEntityThermalEvaporationController;
import mekanism.common.tile.TileEntityThermalEvaporationValve;
import mekanism.common.tile.factory.TileEntityCombiningFactory;
import mekanism.common.tile.factory.TileEntityItemStackGasToItemStackFactory;
import mekanism.common.tile.factory.TileEntityItemStackToItemStackFactory;
import mekanism.common.tile.factory.TileEntityMetallurgicInfuserFactory;
import mekanism.common.tile.factory.TileEntitySawingFactory;
import mekanism.common.tile.transmitter.TileEntityDiversionTransporter;
import mekanism.common.tile.transmitter.TileEntityLogisticalTransporter;
import mekanism.common.tile.transmitter.TileEntityMechanicalPipe;
import mekanism.common.tile.transmitter.TileEntityPressurizedTube;
import mekanism.common.tile.transmitter.TileEntityRestrictiveTransporter;
import mekanism.common.tile.transmitter.TileEntityThermodynamicConductor;
import mekanism.common.tile.transmitter.TileEntityUniversalCable;

public class MekanismTileEntityTypes {

    public static final TileEntityTypeDeferredRegister TILE_ENTITY_TYPES = new TileEntityTypeDeferredRegister(Mekanism.MODID);

    //TODO: Tile types that need to be evaluated further
    public static final TileEntityTypeRegistryObject<TileEntityBoundingBlock> BOUNDING_BLOCK = TILE_ENTITY_TYPES.register(MekanismBlocks.BOUNDING_BLOCK, TileEntityBoundingBlock::new);
    public static final TileEntityTypeRegistryObject<TileEntityBoundingBlock> ADVANCED_BOUNDING_BLOCK = TILE_ENTITY_TYPES.register(MekanismBlocks.ADVANCED_BOUNDING_BLOCK, TileEntityAdvancedBoundingBlock::new);

    //Regular Tiles
    public static final TileEntityTypeRegistryObject<TileEntityBoilerCasing> BOILER_CASING = TILE_ENTITY_TYPES.register(MekanismBlocks.BOILER_CASING, TileEntityBoilerCasing::new);
    public static final TileEntityTypeRegistryObject<TileEntityBoilerValve> BOILER_VALVE = TILE_ENTITY_TYPES.register(MekanismBlocks.BOILER_VALVE, TileEntityBoilerValve::new);
    public static final TileEntityTypeRegistryObject<TileEntityCardboardBox> CARDBOARD_BOX = TILE_ENTITY_TYPES.register(MekanismBlocks.CARDBOARD_BOX, TileEntityCardboardBox::new);
    public static final TileEntityTypeRegistryObject<TileEntityChargepad> CHARGEPAD = TILE_ENTITY_TYPES.register(MekanismBlocks.CHARGEPAD, TileEntityChargepad::new);
    public static final TileEntityTypeRegistryObject<TileEntityChemicalCrystallizer> CHEMICAL_CRYSTALLIZER = TILE_ENTITY_TYPES.register(MekanismBlocks.CHEMICAL_CRYSTALLIZER, TileEntityChemicalCrystallizer::new);
    public static final TileEntityTypeRegistryObject<TileEntityChemicalDissolutionChamber> CHEMICAL_DISSOLUTION_CHAMBER = TILE_ENTITY_TYPES.register(MekanismBlocks.CHEMICAL_DISSOLUTION_CHAMBER, TileEntityChemicalDissolutionChamber::new);
    public static final TileEntityTypeRegistryObject<TileEntityChemicalInfuser> CHEMICAL_INFUSER = TILE_ENTITY_TYPES.register(MekanismBlocks.CHEMICAL_INFUSER, TileEntityChemicalInfuser::new);
    public static final TileEntityTypeRegistryObject<TileEntityChemicalInjectionChamber> CHEMICAL_INJECTION_CHAMBER = TILE_ENTITY_TYPES.register(MekanismBlocks.CHEMICAL_INJECTION_CHAMBER, TileEntityChemicalInjectionChamber::new);
    public static final TileEntityTypeRegistryObject<TileEntityChemicalOxidizer> CHEMICAL_OXIDIZER = TILE_ENTITY_TYPES.register(MekanismBlocks.CHEMICAL_OXIDIZER, TileEntityChemicalOxidizer::new);
    public static final TileEntityTypeRegistryObject<TileEntityChemicalWasher> CHEMICAL_WASHER = TILE_ENTITY_TYPES.register(MekanismBlocks.CHEMICAL_WASHER, TileEntityChemicalWasher::new);
    public static final TileEntityTypeRegistryObject<TileEntityCombiner> COMBINER = TILE_ENTITY_TYPES.register(MekanismBlocks.COMBINER, TileEntityCombiner::new);
    public static final TileEntityTypeRegistryObject<TileEntityCrusher> CRUSHER = TILE_ENTITY_TYPES.register(MekanismBlocks.CRUSHER, TileEntityCrusher::new);
    public static final TileEntityTypeRegistryObject<TileEntityDigitalMiner> DIGITAL_MINER = TILE_ENTITY_TYPES.register(MekanismBlocks.DIGITAL_MINER, TileEntityDigitalMiner::new);
    public static final TileEntityTypeRegistryObject<TileEntityDynamicTank> DYNAMIC_TANK = TILE_ENTITY_TYPES.register(MekanismBlocks.DYNAMIC_TANK, TileEntityDynamicTank::new);
    public static final TileEntityTypeRegistryObject<TileEntityDynamicValve> DYNAMIC_VALVE = TILE_ENTITY_TYPES.register(MekanismBlocks.DYNAMIC_VALVE, TileEntityDynamicValve::new);
    public static final TileEntityTypeRegistryObject<TileEntityElectricPump> ELECTRIC_PUMP = TILE_ENTITY_TYPES.register(MekanismBlocks.ELECTRIC_PUMP, TileEntityElectricPump::new);
    public static final TileEntityTypeRegistryObject<TileEntityElectrolyticSeparator> ELECTROLYTIC_SEPARATOR = TILE_ENTITY_TYPES.register(MekanismBlocks.ELECTROLYTIC_SEPARATOR, TileEntityElectrolyticSeparator::new);
    public static final TileEntityTypeRegistryObject<TileEntityEnergizedSmelter> ENERGIZED_SMELTER = TILE_ENTITY_TYPES.register(MekanismBlocks.ENERGIZED_SMELTER, TileEntityEnergizedSmelter::new);
    public static final TileEntityTypeRegistryObject<TileEntityEnrichmentChamber> ENRICHMENT_CHAMBER = TILE_ENTITY_TYPES.register(MekanismBlocks.ENRICHMENT_CHAMBER, TileEntityEnrichmentChamber::new);
    public static final TileEntityTypeRegistryObject<TileEntityFluidicPlenisher> FLUIDIC_PLENISHER = TILE_ENTITY_TYPES.register(MekanismBlocks.FLUIDIC_PLENISHER, TileEntityFluidicPlenisher::new);
    public static final TileEntityTypeRegistryObject<TileEntityFormulaicAssemblicator> FORMULAIC_ASSEMBLICATOR = TILE_ENTITY_TYPES.register(MekanismBlocks.FORMULAIC_ASSEMBLICATOR, TileEntityFormulaicAssemblicator::new);
    public static final TileEntityTypeRegistryObject<TileEntityFuelwoodHeater> FUELWOOD_HEATER = TILE_ENTITY_TYPES.register(MekanismBlocks.FUELWOOD_HEATER, TileEntityFuelwoodHeater::new);
    public static final TileEntityTypeRegistryObject<TileEntityInductionCasing> INDUCTION_CASING = TILE_ENTITY_TYPES.register(MekanismBlocks.INDUCTION_CASING, TileEntityInductionCasing::new);
    public static final TileEntityTypeRegistryObject<TileEntityInductionPort> INDUCTION_PORT = TILE_ENTITY_TYPES.register(MekanismBlocks.INDUCTION_PORT, TileEntityInductionPort::new);
    public static final TileEntityTypeRegistryObject<TileEntityLaser> LASER = TILE_ENTITY_TYPES.register(MekanismBlocks.LASER, TileEntityLaser::new);
    public static final TileEntityTypeRegistryObject<TileEntityLaserAmplifier> LASER_AMPLIFIER = TILE_ENTITY_TYPES.register(MekanismBlocks.LASER_AMPLIFIER, TileEntityLaserAmplifier::new);
    public static final TileEntityTypeRegistryObject<TileEntityLaserTractorBeam> LASER_TRACTOR_BEAM = TILE_ENTITY_TYPES.register(MekanismBlocks.LASER_TRACTOR_BEAM, TileEntityLaserTractorBeam::new);
    public static final TileEntityTypeRegistryObject<TileEntityLogisticalSorter> LOGISTICAL_SORTER = TILE_ENTITY_TYPES.register(MekanismBlocks.LOGISTICAL_SORTER, TileEntityLogisticalSorter::new);
    public static final TileEntityTypeRegistryObject<TileEntityMetallurgicInfuser> METALLURGIC_INFUSER = TILE_ENTITY_TYPES.register(MekanismBlocks.METALLURGIC_INFUSER, TileEntityMetallurgicInfuser::new);
    public static final TileEntityTypeRegistryObject<TileEntityOredictionificator> OREDICTIONIFICATOR = TILE_ENTITY_TYPES.register(MekanismBlocks.OREDICTIONIFICATOR, TileEntityOredictionificator::new);
    public static final TileEntityTypeRegistryObject<TileEntityOsmiumCompressor> OSMIUM_COMPRESSOR = TILE_ENTITY_TYPES.register(MekanismBlocks.OSMIUM_COMPRESSOR, TileEntityOsmiumCompressor::new);
    public static final TileEntityTypeRegistryObject<TileEntityPersonalChest> PERSONAL_CHEST = TILE_ENTITY_TYPES.register(MekanismBlocks.PERSONAL_CHEST, TileEntityPersonalChest::new);
    public static final TileEntityTypeRegistryObject<TileEntityPrecisionSawmill> PRECISION_SAWMILL = TILE_ENTITY_TYPES.register(MekanismBlocks.PRECISION_SAWMILL, TileEntityPrecisionSawmill::new);
    public static final TileEntityTypeRegistryObject<TileEntityPressureDisperser> PRESSURE_DISPERSER = TILE_ENTITY_TYPES.register(MekanismBlocks.PRESSURE_DISPERSER, TileEntityPressureDisperser::new);
    public static final TileEntityTypeRegistryObject<TileEntityPressurizedReactionChamber> PRESSURIZED_REACTION_CHAMBER = TILE_ENTITY_TYPES.register(MekanismBlocks.PRESSURIZED_REACTION_CHAMBER, TileEntityPressurizedReactionChamber::new);
    public static final TileEntityTypeRegistryObject<TileEntityPurificationChamber> PURIFICATION_CHAMBER = TILE_ENTITY_TYPES.register(MekanismBlocks.PURIFICATION_CHAMBER, TileEntityPurificationChamber::new);
    public static final TileEntityTypeRegistryObject<TileEntityQuantumEntangloporter> QUANTUM_ENTANGLOPORTER = TILE_ENTITY_TYPES.register(MekanismBlocks.QUANTUM_ENTANGLOPORTER, TileEntityQuantumEntangloporter::new);
    public static final TileEntityTypeRegistryObject<TileEntityResistiveHeater> RESISTIVE_HEATER = TILE_ENTITY_TYPES.register(MekanismBlocks.RESISTIVE_HEATER, TileEntityResistiveHeater::new);
    public static final TileEntityTypeRegistryObject<TileEntityRotaryCondensentrator> ROTARY_CONDENSENTRATOR = TILE_ENTITY_TYPES.register(MekanismBlocks.ROTARY_CONDENSENTRATOR, TileEntityRotaryCondensentrator::new);
    public static final TileEntityTypeRegistryObject<TileEntitySecurityDesk> SECURITY_DESK = TILE_ENTITY_TYPES.register(MekanismBlocks.SECURITY_DESK, TileEntitySecurityDesk::new);
    public static final TileEntityTypeRegistryObject<TileEntitySeismicVibrator> SEISMIC_VIBRATOR = TILE_ENTITY_TYPES.register(MekanismBlocks.SEISMIC_VIBRATOR, TileEntitySeismicVibrator::new);
    public static final TileEntityTypeRegistryObject<TileEntitySolarNeutronActivator> SOLAR_NEUTRON_ACTIVATOR = TILE_ENTITY_TYPES.register(MekanismBlocks.SOLAR_NEUTRON_ACTIVATOR, TileEntitySolarNeutronActivator::new);
    public static final TileEntityTypeRegistryObject<TileEntityStructuralGlass> STRUCTURAL_GLASS = TILE_ENTITY_TYPES.register(MekanismBlocks.STRUCTURAL_GLASS, TileEntityStructuralGlass::new);
    public static final TileEntityTypeRegistryObject<TileEntitySuperheatingElement> SUPERHEATING_ELEMENT = TILE_ENTITY_TYPES.register(MekanismBlocks.SUPERHEATING_ELEMENT, TileEntitySuperheatingElement::new);
    public static final TileEntityTypeRegistryObject<TileEntityTeleporter> TELEPORTER = TILE_ENTITY_TYPES.register(MekanismBlocks.TELEPORTER, TileEntityTeleporter::new);
    public static final TileEntityTypeRegistryObject<TileEntityThermalEvaporationBlock> THERMAL_EVAPORATION_BLOCK = TILE_ENTITY_TYPES.register(MekanismBlocks.THERMAL_EVAPORATION_BLOCK, TileEntityThermalEvaporationBlock::new);
    public static final TileEntityTypeRegistryObject<TileEntityThermalEvaporationController> THERMAL_EVAPORATION_CONTROLLER = TILE_ENTITY_TYPES.register(MekanismBlocks.THERMAL_EVAPORATION_CONTROLLER, TileEntityThermalEvaporationController::new);
    public static final TileEntityTypeRegistryObject<TileEntityThermalEvaporationValve> THERMAL_EVAPORATION_VALVE = TILE_ENTITY_TYPES.register(MekanismBlocks.THERMAL_EVAPORATION_VALVE, TileEntityThermalEvaporationValve::new);

    //Transmitters
    public static final TileEntityTypeRegistryObject<TileEntityDiversionTransporter> DIVERSION_TRANSPORTER = TILE_ENTITY_TYPES.register(MekanismBlocks.DIVERSION_TRANSPORTER, TileEntityDiversionTransporter::new);
    public static final TileEntityTypeRegistryObject<TileEntityRestrictiveTransporter> RESTRICTIVE_TRANSPORTER = TILE_ENTITY_TYPES.register(MekanismBlocks.RESTRICTIVE_TRANSPORTER, TileEntityRestrictiveTransporter::new);
    //Logistic Transporters
    public static final TileEntityTypeRegistryObject<TileEntityLogisticalTransporter> BASIC_LOGISTICAL_TRANSPORTER = TILE_ENTITY_TYPES.register(MekanismBlocks.BASIC_LOGISTICAL_TRANSPORTER, () -> new TileEntityLogisticalTransporter(MekanismBlocks.BASIC_LOGISTICAL_TRANSPORTER));
    public static final TileEntityTypeRegistryObject<TileEntityLogisticalTransporter> ADVANCED_LOGISTICAL_TRANSPORTER = TILE_ENTITY_TYPES.register(MekanismBlocks.ADVANCED_LOGISTICAL_TRANSPORTER, () -> new TileEntityLogisticalTransporter(MekanismBlocks.ADVANCED_LOGISTICAL_TRANSPORTER));
    public static final TileEntityTypeRegistryObject<TileEntityLogisticalTransporter> ELITE_LOGISTICAL_TRANSPORTER = TILE_ENTITY_TYPES.register(MekanismBlocks.ELITE_LOGISTICAL_TRANSPORTER, () -> new TileEntityLogisticalTransporter(MekanismBlocks.ELITE_LOGISTICAL_TRANSPORTER));
    public static final TileEntityTypeRegistryObject<TileEntityLogisticalTransporter> ULTIMATE_LOGISTICAL_TRANSPORTER = TILE_ENTITY_TYPES.register(MekanismBlocks.ULTIMATE_LOGISTICAL_TRANSPORTER, () -> new TileEntityLogisticalTransporter(MekanismBlocks.ULTIMATE_LOGISTICAL_TRANSPORTER));
    //Mechanical Pipes
    public static final TileEntityTypeRegistryObject<TileEntityMechanicalPipe> BASIC_MECHANICAL_PIPE = TILE_ENTITY_TYPES.register(MekanismBlocks.BASIC_MECHANICAL_PIPE, () -> new TileEntityMechanicalPipe(MekanismBlocks.BASIC_MECHANICAL_PIPE));
    public static final TileEntityTypeRegistryObject<TileEntityMechanicalPipe> ADVANCED_MECHANICAL_PIPE = TILE_ENTITY_TYPES.register(MekanismBlocks.ADVANCED_MECHANICAL_PIPE, () -> new TileEntityMechanicalPipe(MekanismBlocks.ADVANCED_MECHANICAL_PIPE));
    public static final TileEntityTypeRegistryObject<TileEntityMechanicalPipe> ELITE_MECHANICAL_PIPE = TILE_ENTITY_TYPES.register(MekanismBlocks.ELITE_MECHANICAL_PIPE, () -> new TileEntityMechanicalPipe(MekanismBlocks.ELITE_MECHANICAL_PIPE));
    public static final TileEntityTypeRegistryObject<TileEntityMechanicalPipe> ULTIMATE_MECHANICAL_PIPE = TILE_ENTITY_TYPES.register(MekanismBlocks.ULTIMATE_MECHANICAL_PIPE, () -> new TileEntityMechanicalPipe(MekanismBlocks.ULTIMATE_MECHANICAL_PIPE));
    //Pressurized Tubes
    public static final TileEntityTypeRegistryObject<TileEntityPressurizedTube> BASIC_PRESSURIZED_TUBE = TILE_ENTITY_TYPES.register(MekanismBlocks.BASIC_PRESSURIZED_TUBE, () -> new TileEntityPressurizedTube(MekanismBlocks.BASIC_PRESSURIZED_TUBE));
    public static final TileEntityTypeRegistryObject<TileEntityPressurizedTube> ADVANCED_PRESSURIZED_TUBE = TILE_ENTITY_TYPES.register(MekanismBlocks.ADVANCED_PRESSURIZED_TUBE, () -> new TileEntityPressurizedTube(MekanismBlocks.ADVANCED_PRESSURIZED_TUBE));
    public static final TileEntityTypeRegistryObject<TileEntityPressurizedTube> ELITE_PRESSURIZED_TUBE = TILE_ENTITY_TYPES.register(MekanismBlocks.ELITE_PRESSURIZED_TUBE, () -> new TileEntityPressurizedTube(MekanismBlocks.ELITE_PRESSURIZED_TUBE));
    public static final TileEntityTypeRegistryObject<TileEntityPressurizedTube> ULTIMATE_PRESSURIZED_TUBE = TILE_ENTITY_TYPES.register(MekanismBlocks.ULTIMATE_PRESSURIZED_TUBE, () -> new TileEntityPressurizedTube(MekanismBlocks.ULTIMATE_PRESSURIZED_TUBE));
    //Thermodynamic Conductors
    public static final TileEntityTypeRegistryObject<TileEntityThermodynamicConductor> BASIC_THERMODYNAMIC_CONDUCTOR = TILE_ENTITY_TYPES.register(MekanismBlocks.BASIC_THERMODYNAMIC_CONDUCTOR, () -> new TileEntityThermodynamicConductor(MekanismBlocks.BASIC_THERMODYNAMIC_CONDUCTOR));
    public static final TileEntityTypeRegistryObject<TileEntityThermodynamicConductor> ADVANCED_THERMODYNAMIC_CONDUCTOR = TILE_ENTITY_TYPES.register(MekanismBlocks.ADVANCED_THERMODYNAMIC_CONDUCTOR, () -> new TileEntityThermodynamicConductor(MekanismBlocks.ADVANCED_THERMODYNAMIC_CONDUCTOR));
    public static final TileEntityTypeRegistryObject<TileEntityThermodynamicConductor> ELITE_THERMODYNAMIC_CONDUCTOR = TILE_ENTITY_TYPES.register(MekanismBlocks.ELITE_THERMODYNAMIC_CONDUCTOR, () -> new TileEntityThermodynamicConductor(MekanismBlocks.ELITE_THERMODYNAMIC_CONDUCTOR));
    public static final TileEntityTypeRegistryObject<TileEntityThermodynamicConductor> ULTIMATE_THERMODYNAMIC_CONDUCTOR = TILE_ENTITY_TYPES.register(MekanismBlocks.ULTIMATE_THERMODYNAMIC_CONDUCTOR, () -> new TileEntityThermodynamicConductor(MekanismBlocks.ULTIMATE_THERMODYNAMIC_CONDUCTOR));
    //Universal Cables
    public static final TileEntityTypeRegistryObject<TileEntityUniversalCable> BASIC_UNIVERSAL_CABLE = TILE_ENTITY_TYPES.register(MekanismBlocks.BASIC_UNIVERSAL_CABLE, () -> new TileEntityUniversalCable(MekanismBlocks.BASIC_UNIVERSAL_CABLE));
    public static final TileEntityTypeRegistryObject<TileEntityUniversalCable> ADVANCED_UNIVERSAL_CABLE = TILE_ENTITY_TYPES.register(MekanismBlocks.ADVANCED_UNIVERSAL_CABLE, () -> new TileEntityUniversalCable(MekanismBlocks.ADVANCED_UNIVERSAL_CABLE));
    public static final TileEntityTypeRegistryObject<TileEntityUniversalCable> ELITE_UNIVERSAL_CABLE = TILE_ENTITY_TYPES.register(MekanismBlocks.ELITE_UNIVERSAL_CABLE, () -> new TileEntityUniversalCable(MekanismBlocks.ELITE_UNIVERSAL_CABLE));
    public static final TileEntityTypeRegistryObject<TileEntityUniversalCable> ULTIMATE_UNIVERSAL_CABLE = TILE_ENTITY_TYPES.register(MekanismBlocks.ULTIMATE_UNIVERSAL_CABLE, () -> new TileEntityUniversalCable(MekanismBlocks.ULTIMATE_UNIVERSAL_CABLE));

    //Tiered Tiles
    //Energy Cubes
    public static final TileEntityTypeRegistryObject<TileEntityEnergyCube> BASIC_ENERGY_CUBE = TILE_ENTITY_TYPES.register(MekanismBlocks.BASIC_ENERGY_CUBE, () -> new TileEntityEnergyCube(MekanismBlocks.BASIC_ENERGY_CUBE));
    public static final TileEntityTypeRegistryObject<TileEntityEnergyCube> ADVANCED_ENERGY_CUBE = TILE_ENTITY_TYPES.register(MekanismBlocks.ADVANCED_ENERGY_CUBE, () -> new TileEntityEnergyCube(MekanismBlocks.ADVANCED_ENERGY_CUBE));
    public static final TileEntityTypeRegistryObject<TileEntityEnergyCube> ELITE_ENERGY_CUBE = TILE_ENTITY_TYPES.register(MekanismBlocks.ELITE_ENERGY_CUBE, () -> new TileEntityEnergyCube(MekanismBlocks.ELITE_ENERGY_CUBE));
    public static final TileEntityTypeRegistryObject<TileEntityEnergyCube> ULTIMATE_ENERGY_CUBE = TILE_ENTITY_TYPES.register(MekanismBlocks.ULTIMATE_ENERGY_CUBE, () -> new TileEntityEnergyCube(MekanismBlocks.ULTIMATE_ENERGY_CUBE));
    public static final TileEntityTypeRegistryObject<TileEntityEnergyCube> CREATIVE_ENERGY_CUBE = TILE_ENTITY_TYPES.register(MekanismBlocks.CREATIVE_ENERGY_CUBE, () -> new TileEntityEnergyCube(MekanismBlocks.CREATIVE_ENERGY_CUBE));
    //Gas Tanks
    public static final TileEntityTypeRegistryObject<TileEntityGasTank> BASIC_GAS_TANK = TILE_ENTITY_TYPES.register(MekanismBlocks.BASIC_GAS_TANK, () -> new TileEntityGasTank(MekanismBlocks.BASIC_GAS_TANK));
    public static final TileEntityTypeRegistryObject<TileEntityGasTank> ADVANCED_GAS_TANK = TILE_ENTITY_TYPES.register(MekanismBlocks.ADVANCED_GAS_TANK, () -> new TileEntityGasTank(MekanismBlocks.ADVANCED_GAS_TANK));
    public static final TileEntityTypeRegistryObject<TileEntityGasTank> ELITE_GAS_TANK = TILE_ENTITY_TYPES.register(MekanismBlocks.ELITE_GAS_TANK, () -> new TileEntityGasTank(MekanismBlocks.ELITE_GAS_TANK));
    public static final TileEntityTypeRegistryObject<TileEntityGasTank> ULTIMATE_GAS_TANK = TILE_ENTITY_TYPES.register(MekanismBlocks.ULTIMATE_GAS_TANK, () -> new TileEntityGasTank(MekanismBlocks.ULTIMATE_GAS_TANK));
    public static final TileEntityTypeRegistryObject<TileEntityGasTank> CREATIVE_GAS_TANK = TILE_ENTITY_TYPES.register(MekanismBlocks.CREATIVE_GAS_TANK, () -> new TileEntityGasTank(MekanismBlocks.CREATIVE_GAS_TANK));
    //Fluid Tanks
    public static final TileEntityTypeRegistryObject<TileEntityFluidTank> BASIC_FLUID_TANK = TILE_ENTITY_TYPES.register(MekanismBlocks.BASIC_FLUID_TANK, () -> new TileEntityFluidTank(MekanismBlocks.BASIC_FLUID_TANK));
    public static final TileEntityTypeRegistryObject<TileEntityFluidTank> ADVANCED_FLUID_TANK = TILE_ENTITY_TYPES.register(MekanismBlocks.ADVANCED_FLUID_TANK, () -> new TileEntityFluidTank(MekanismBlocks.ADVANCED_FLUID_TANK));
    public static final TileEntityTypeRegistryObject<TileEntityFluidTank> ELITE_FLUID_TANK = TILE_ENTITY_TYPES.register(MekanismBlocks.ELITE_FLUID_TANK, () -> new TileEntityFluidTank(MekanismBlocks.ELITE_FLUID_TANK));
    public static final TileEntityTypeRegistryObject<TileEntityFluidTank> ULTIMATE_FLUID_TANK = TILE_ENTITY_TYPES.register(MekanismBlocks.ULTIMATE_FLUID_TANK, () -> new TileEntityFluidTank(MekanismBlocks.ULTIMATE_FLUID_TANK));
    public static final TileEntityTypeRegistryObject<TileEntityFluidTank> CREATIVE_FLUID_TANK = TILE_ENTITY_TYPES.register(MekanismBlocks.CREATIVE_FLUID_TANK, () -> new TileEntityFluidTank(MekanismBlocks.CREATIVE_FLUID_TANK));
    //Bins
    public static final TileEntityTypeRegistryObject<TileEntityBin> BASIC_BIN = TILE_ENTITY_TYPES.register(MekanismBlocks.BASIC_BIN, () -> new TileEntityBin(MekanismBlocks.BASIC_BIN));
    public static final TileEntityTypeRegistryObject<TileEntityBin> ADVANCED_BIN = TILE_ENTITY_TYPES.register(MekanismBlocks.ADVANCED_BIN, () -> new TileEntityBin(MekanismBlocks.ADVANCED_BIN));
    public static final TileEntityTypeRegistryObject<TileEntityBin> ELITE_BIN = TILE_ENTITY_TYPES.register(MekanismBlocks.ELITE_BIN, () -> new TileEntityBin(MekanismBlocks.ELITE_BIN));
    public static final TileEntityTypeRegistryObject<TileEntityBin> ULTIMATE_BIN = TILE_ENTITY_TYPES.register(MekanismBlocks.ULTIMATE_BIN, () -> new TileEntityBin(MekanismBlocks.ULTIMATE_BIN));
    public static final TileEntityTypeRegistryObject<TileEntityBin> CREATIVE_BIN = TILE_ENTITY_TYPES.register(MekanismBlocks.CREATIVE_BIN, () -> new TileEntityBin(MekanismBlocks.CREATIVE_BIN));
    //Induction Cells
    public static final TileEntityTypeRegistryObject<TileEntityInductionCell> BASIC_INDUCTION_CELL = TILE_ENTITY_TYPES.register(MekanismBlocks.BASIC_INDUCTION_CELL, () -> new TileEntityInductionCell(MekanismBlocks.BASIC_INDUCTION_CELL));
    public static final TileEntityTypeRegistryObject<TileEntityInductionCell> ADVANCED_INDUCTION_CELL = TILE_ENTITY_TYPES.register(MekanismBlocks.ADVANCED_INDUCTION_CELL, () -> new TileEntityInductionCell(MekanismBlocks.ADVANCED_INDUCTION_CELL));
    public static final TileEntityTypeRegistryObject<TileEntityInductionCell> ELITE_INDUCTION_CELL = TILE_ENTITY_TYPES.register(MekanismBlocks.ELITE_INDUCTION_CELL, () -> new TileEntityInductionCell(MekanismBlocks.ELITE_INDUCTION_CELL));
    public static final TileEntityTypeRegistryObject<TileEntityInductionCell> ULTIMATE_INDUCTION_CELL = TILE_ENTITY_TYPES.register(MekanismBlocks.ULTIMATE_INDUCTION_CELL, () -> new TileEntityInductionCell(MekanismBlocks.ULTIMATE_INDUCTION_CELL));
    //Induction Providers
    public static final TileEntityTypeRegistryObject<TileEntityInductionProvider> BASIC_INDUCTION_PROVIDER = TILE_ENTITY_TYPES.register(MekanismBlocks.BASIC_INDUCTION_PROVIDER, () -> new TileEntityInductionProvider(MekanismBlocks.BASIC_INDUCTION_PROVIDER));
    public static final TileEntityTypeRegistryObject<TileEntityInductionProvider> ADVANCED_INDUCTION_PROVIDER = TILE_ENTITY_TYPES.register(MekanismBlocks.ADVANCED_INDUCTION_PROVIDER, () -> new TileEntityInductionProvider(MekanismBlocks.ADVANCED_INDUCTION_PROVIDER));
    public static final TileEntityTypeRegistryObject<TileEntityInductionProvider> ELITE_INDUCTION_PROVIDER = TILE_ENTITY_TYPES.register(MekanismBlocks.ELITE_INDUCTION_PROVIDER, () -> new TileEntityInductionProvider(MekanismBlocks.ELITE_INDUCTION_PROVIDER));
    public static final TileEntityTypeRegistryObject<TileEntityInductionProvider> ULTIMATE_INDUCTION_PROVIDER = TILE_ENTITY_TYPES.register(MekanismBlocks.ULTIMATE_INDUCTION_PROVIDER, () -> new TileEntityInductionProvider(MekanismBlocks.ULTIMATE_INDUCTION_PROVIDER));

    //Factories
    //Combining
    public static final TileEntityTypeRegistryObject<TileEntityCombiningFactory> BASIC_COMBINING_FACTORY = TILE_ENTITY_TYPES.register(MekanismBlocks.BASIC_COMBINING_FACTORY, () -> new TileEntityCombiningFactory(MekanismBlocks.BASIC_COMBINING_FACTORY));
    public static final TileEntityTypeRegistryObject<TileEntityCombiningFactory> ADVANCED_COMBINING_FACTORY = TILE_ENTITY_TYPES.register(MekanismBlocks.ADVANCED_COMBINING_FACTORY, () -> new TileEntityCombiningFactory(MekanismBlocks.ADVANCED_COMBINING_FACTORY));
    public static final TileEntityTypeRegistryObject<TileEntityCombiningFactory> ELITE_COMBINING_FACTORY = TILE_ENTITY_TYPES.register(MekanismBlocks.ELITE_COMBINING_FACTORY, () -> new TileEntityCombiningFactory(MekanismBlocks.ELITE_COMBINING_FACTORY));
    public static final TileEntityTypeRegistryObject<TileEntityCombiningFactory> ULTIMATE_COMBINING_FACTORY = TILE_ENTITY_TYPES.register(MekanismBlocks.ULTIMATE_COMBINING_FACTORY, () -> new TileEntityCombiningFactory(MekanismBlocks.ULTIMATE_COMBINING_FACTORY));
    //Compressing
    public static final TileEntityTypeRegistryObject<TileEntityItemStackGasToItemStackFactory> BASIC_COMPRESSING_FACTORY = TILE_ENTITY_TYPES.register(MekanismBlocks.BASIC_COMPRESSING_FACTORY, () -> new TileEntityItemStackGasToItemStackFactory(MekanismBlocks.BASIC_COMPRESSING_FACTORY));
    public static final TileEntityTypeRegistryObject<TileEntityItemStackGasToItemStackFactory> ADVANCED_COMPRESSING_FACTORY = TILE_ENTITY_TYPES.register(MekanismBlocks.ADVANCED_COMPRESSING_FACTORY, () -> new TileEntityItemStackGasToItemStackFactory(MekanismBlocks.ADVANCED_COMPRESSING_FACTORY));
    public static final TileEntityTypeRegistryObject<TileEntityItemStackGasToItemStackFactory> ELITE_COMPRESSING_FACTORY = TILE_ENTITY_TYPES.register(MekanismBlocks.ELITE_COMPRESSING_FACTORY, () -> new TileEntityItemStackGasToItemStackFactory(MekanismBlocks.ELITE_COMPRESSING_FACTORY));
    public static final TileEntityTypeRegistryObject<TileEntityItemStackGasToItemStackFactory> ULTIMATE_COMPRESSING_FACTORY = TILE_ENTITY_TYPES.register(MekanismBlocks.ULTIMATE_COMPRESSING_FACTORY, () -> new TileEntityItemStackGasToItemStackFactory(MekanismBlocks.ULTIMATE_COMPRESSING_FACTORY));
    //Crushing
    public static final TileEntityTypeRegistryObject<TileEntityItemStackToItemStackFactory> BASIC_CRUSHING_FACTORY = TILE_ENTITY_TYPES.register(MekanismBlocks.BASIC_CRUSHING_FACTORY, () -> new TileEntityItemStackToItemStackFactory(MekanismBlocks.BASIC_CRUSHING_FACTORY));
    public static final TileEntityTypeRegistryObject<TileEntityItemStackToItemStackFactory> ADVANCED_CRUSHING_FACTORY = TILE_ENTITY_TYPES.register(MekanismBlocks.ADVANCED_CRUSHING_FACTORY, () -> new TileEntityItemStackToItemStackFactory(MekanismBlocks.ADVANCED_CRUSHING_FACTORY));
    public static final TileEntityTypeRegistryObject<TileEntityItemStackToItemStackFactory> ELITE_CRUSHING_FACTORY = TILE_ENTITY_TYPES.register(MekanismBlocks.ELITE_CRUSHING_FACTORY, () -> new TileEntityItemStackToItemStackFactory(MekanismBlocks.ELITE_CRUSHING_FACTORY));
    public static final TileEntityTypeRegistryObject<TileEntityItemStackToItemStackFactory> ULTIMATE_CRUSHING_FACTORY = TILE_ENTITY_TYPES.register(MekanismBlocks.ULTIMATE_CRUSHING_FACTORY, () -> new TileEntityItemStackToItemStackFactory(MekanismBlocks.ULTIMATE_CRUSHING_FACTORY));
    //Enriching
    public static final TileEntityTypeRegistryObject<TileEntityItemStackToItemStackFactory> BASIC_ENRICHING_FACTORY = TILE_ENTITY_TYPES.register(MekanismBlocks.BASIC_ENRICHING_FACTORY, () -> new TileEntityItemStackToItemStackFactory(MekanismBlocks.BASIC_ENRICHING_FACTORY));
    public static final TileEntityTypeRegistryObject<TileEntityItemStackToItemStackFactory> ADVANCED_ENRICHING_FACTORY = TILE_ENTITY_TYPES.register(MekanismBlocks.ADVANCED_ENRICHING_FACTORY, () -> new TileEntityItemStackToItemStackFactory(MekanismBlocks.ADVANCED_ENRICHING_FACTORY));
    public static final TileEntityTypeRegistryObject<TileEntityItemStackToItemStackFactory> ELITE_ENRICHING_FACTORY = TILE_ENTITY_TYPES.register(MekanismBlocks.ELITE_ENRICHING_FACTORY, () -> new TileEntityItemStackToItemStackFactory(MekanismBlocks.ELITE_ENRICHING_FACTORY));
    public static final TileEntityTypeRegistryObject<TileEntityItemStackToItemStackFactory> ULTIMATE_ENRICHING_FACTORY = TILE_ENTITY_TYPES.register(MekanismBlocks.ULTIMATE_ENRICHING_FACTORY, () -> new TileEntityItemStackToItemStackFactory(MekanismBlocks.ULTIMATE_ENRICHING_FACTORY));
    //Infusing
    public static final TileEntityTypeRegistryObject<TileEntityMetallurgicInfuserFactory> BASIC_INFUSING_FACTORY = TILE_ENTITY_TYPES.register(MekanismBlocks.BASIC_INFUSING_FACTORY, () -> new TileEntityMetallurgicInfuserFactory(MekanismBlocks.BASIC_INFUSING_FACTORY));
    public static final TileEntityTypeRegistryObject<TileEntityMetallurgicInfuserFactory> ADVANCED_INFUSING_FACTORY = TILE_ENTITY_TYPES.register(MekanismBlocks.ADVANCED_INFUSING_FACTORY, () -> new TileEntityMetallurgicInfuserFactory(MekanismBlocks.ADVANCED_INFUSING_FACTORY));
    public static final TileEntityTypeRegistryObject<TileEntityMetallurgicInfuserFactory> ELITE_INFUSING_FACTORY = TILE_ENTITY_TYPES.register(MekanismBlocks.ELITE_INFUSING_FACTORY, () -> new TileEntityMetallurgicInfuserFactory(MekanismBlocks.ELITE_INFUSING_FACTORY));
    public static final TileEntityTypeRegistryObject<TileEntityMetallurgicInfuserFactory> ULTIMATE_INFUSING_FACTORY = TILE_ENTITY_TYPES.register(MekanismBlocks.ULTIMATE_INFUSING_FACTORY, () -> new TileEntityMetallurgicInfuserFactory(MekanismBlocks.ULTIMATE_INFUSING_FACTORY));
    //Injecting
    public static final TileEntityTypeRegistryObject<TileEntityItemStackGasToItemStackFactory> BASIC_INJECTING_FACTORY = TILE_ENTITY_TYPES.register(MekanismBlocks.BASIC_INJECTING_FACTORY, () -> new TileEntityItemStackGasToItemStackFactory(MekanismBlocks.BASIC_INJECTING_FACTORY));
    public static final TileEntityTypeRegistryObject<TileEntityItemStackGasToItemStackFactory> ADVANCED_INJECTING_FACTORY = TILE_ENTITY_TYPES.register(MekanismBlocks.ADVANCED_INJECTING_FACTORY, () -> new TileEntityItemStackGasToItemStackFactory(MekanismBlocks.ADVANCED_INJECTING_FACTORY));
    public static final TileEntityTypeRegistryObject<TileEntityItemStackGasToItemStackFactory> ELITE_INJECTING_FACTORY = TILE_ENTITY_TYPES.register(MekanismBlocks.ELITE_INJECTING_FACTORY, () -> new TileEntityItemStackGasToItemStackFactory(MekanismBlocks.ELITE_INJECTING_FACTORY));
    public static final TileEntityTypeRegistryObject<TileEntityItemStackGasToItemStackFactory> ULTIMATE_INJECTING_FACTORY = TILE_ENTITY_TYPES.register(MekanismBlocks.ULTIMATE_INJECTING_FACTORY, () -> new TileEntityItemStackGasToItemStackFactory(MekanismBlocks.ULTIMATE_INJECTING_FACTORY));
    //Purifying
    public static final TileEntityTypeRegistryObject<TileEntityItemStackGasToItemStackFactory> BASIC_PURIFYING_FACTORY = TILE_ENTITY_TYPES.register(MekanismBlocks.BASIC_PURIFYING_FACTORY, () -> new TileEntityItemStackGasToItemStackFactory(MekanismBlocks.BASIC_PURIFYING_FACTORY));
    public static final TileEntityTypeRegistryObject<TileEntityItemStackGasToItemStackFactory> ADVANCED_PURIFYING_FACTORY = TILE_ENTITY_TYPES.register(MekanismBlocks.ADVANCED_PURIFYING_FACTORY, () -> new TileEntityItemStackGasToItemStackFactory(MekanismBlocks.ADVANCED_PURIFYING_FACTORY));
    public static final TileEntityTypeRegistryObject<TileEntityItemStackGasToItemStackFactory> ELITE_PURIFYING_FACTORY = TILE_ENTITY_TYPES.register(MekanismBlocks.ELITE_PURIFYING_FACTORY, () -> new TileEntityItemStackGasToItemStackFactory(MekanismBlocks.ELITE_PURIFYING_FACTORY));
    public static final TileEntityTypeRegistryObject<TileEntityItemStackGasToItemStackFactory> ULTIMATE_PURIFYING_FACTORY = TILE_ENTITY_TYPES.register(MekanismBlocks.ULTIMATE_PURIFYING_FACTORY, () -> new TileEntityItemStackGasToItemStackFactory(MekanismBlocks.ULTIMATE_PURIFYING_FACTORY));
    //Sawing
    public static final TileEntityTypeRegistryObject<TileEntitySawingFactory> BASIC_SAWING_FACTORY = TILE_ENTITY_TYPES.register(MekanismBlocks.BASIC_SAWING_FACTORY, () -> new TileEntitySawingFactory(MekanismBlocks.BASIC_SAWING_FACTORY));
    public static final TileEntityTypeRegistryObject<TileEntitySawingFactory> ADVANCED_SAWING_FACTORY = TILE_ENTITY_TYPES.register(MekanismBlocks.ADVANCED_SAWING_FACTORY, () -> new TileEntitySawingFactory(MekanismBlocks.ADVANCED_SAWING_FACTORY));
    public static final TileEntityTypeRegistryObject<TileEntitySawingFactory> ELITE_SAWING_FACTORY = TILE_ENTITY_TYPES.register(MekanismBlocks.ELITE_SAWING_FACTORY, () -> new TileEntitySawingFactory(MekanismBlocks.ELITE_SAWING_FACTORY));
    public static final TileEntityTypeRegistryObject<TileEntitySawingFactory> ULTIMATE_SAWING_FACTORY = TILE_ENTITY_TYPES.register(MekanismBlocks.ULTIMATE_SAWING_FACTORY, () -> new TileEntitySawingFactory(MekanismBlocks.ULTIMATE_SAWING_FACTORY));
    //Smelting
    public static final TileEntityTypeRegistryObject<TileEntityItemStackToItemStackFactory> BASIC_SMELTING_FACTORY = TILE_ENTITY_TYPES.register(MekanismBlocks.BASIC_SMELTING_FACTORY, () -> new TileEntityItemStackToItemStackFactory(MekanismBlocks.BASIC_SMELTING_FACTORY));
    public static final TileEntityTypeRegistryObject<TileEntityItemStackToItemStackFactory> ADVANCED_SMELTING_FACTORY = TILE_ENTITY_TYPES.register(MekanismBlocks.ADVANCED_SMELTING_FACTORY, () -> new TileEntityItemStackToItemStackFactory(MekanismBlocks.ADVANCED_SMELTING_FACTORY));
    public static final TileEntityTypeRegistryObject<TileEntityItemStackToItemStackFactory> ELITE_SMELTING_FACTORY = TILE_ENTITY_TYPES.register(MekanismBlocks.ELITE_SMELTING_FACTORY, () -> new TileEntityItemStackToItemStackFactory(MekanismBlocks.ELITE_SMELTING_FACTORY));
    public static final TileEntityTypeRegistryObject<TileEntityItemStackToItemStackFactory> ULTIMATE_SMELTING_FACTORY = TILE_ENTITY_TYPES.register(MekanismBlocks.ULTIMATE_SMELTING_FACTORY, () -> new TileEntityItemStackToItemStackFactory(MekanismBlocks.ULTIMATE_SMELTING_FACTORY));
}