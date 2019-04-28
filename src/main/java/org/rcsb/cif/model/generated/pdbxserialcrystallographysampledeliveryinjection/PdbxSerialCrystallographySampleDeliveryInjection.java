package org.rcsb.cif.model.generated.pdbxserialcrystallographysampledeliveryinjection;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxSerialCrystallographySampleDeliveryInjection extends BaseCategory {
    public PdbxSerialCrystallographySampleDeliveryInjection(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxSerialCrystallographySampleDeliveryInjection(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxSerialCrystallographySampleDeliveryInjection(String name) {
        super(name);
    }

    /**
     * The data item is a pointer to _diffrn.id in the DIFFRN
     * category.
     * @return DiffrnId
     */
    public DiffrnId getDiffrnId() {
        return (DiffrnId) (isText ? textFields.computeIfAbsent("diffrn_id",
                DiffrnId::new) : getBinaryColumn("diffrn_id"));
    }

    /**
     * For continuous sample flow experiments, a description of the injector used
     * to move the sample into the beam.
     * @return Description
     */
    public Description getDescription() {
        return (Description) (isText ? textFields.computeIfAbsent("description",
                Description::new) : getBinaryColumn("description"));
    }

    /**
     * For continuous sample flow experiments, the diameter of the
     * injector in micrometres.
     * @return InjectorDiameter
     */
    public InjectorDiameter getInjectorDiameter() {
        return (InjectorDiameter) (isText ? textFields.computeIfAbsent("injector_diameter",
                InjectorDiameter::new) : getBinaryColumn("injector_diameter"));
    }

    /**
     * For continuous sample flow experiments, the temperature in
     * Kelvins of the speciman injected. This may be different from
     * the temperature of the sample.
     * @return InjectorTemperature
     */
    public InjectorTemperature getInjectorTemperature() {
        return (InjectorTemperature) (isText ? textFields.computeIfAbsent("injector_temperature",
                InjectorTemperature::new) : getBinaryColumn("injector_temperature"));
    }

    /**
     * For continuous sample flow experiments, the mean pressure
     * in kilopascals at which the sample is injected into the beam.
     * @return InjectorPressure
     */
    public InjectorPressure getInjectorPressure() {
        return (InjectorPressure) (isText ? textFields.computeIfAbsent("injector_pressure",
                InjectorPressure::new) : getBinaryColumn("injector_pressure"));
    }

    /**
     * For continuous sample flow experiments, the flow rate of
     * solution being injected  measured in ul/min.
     * @return FlowRate
     */
    public FlowRate getFlowRate() {
        return (FlowRate) (isText ? textFields.computeIfAbsent("flow_rate",
                FlowRate::new) : getBinaryColumn("flow_rate"));
    }

    /**
     * For continuous sample flow experiments, the carrier buffer used
     * to move the sample into the beam. Should include protein
     * concentration.
     * @return CarrierSolvent
     */
    public CarrierSolvent getCarrierSolvent() {
        return (CarrierSolvent) (isText ? textFields.computeIfAbsent("carrier_solvent",
                CarrierSolvent::new) : getBinaryColumn("carrier_solvent"));
    }

    /**
     * For continuous sample flow experiments, the concentration of
     * crystals in the solution being injected.
     * 
     * The concentration is measured in million crystals/ml.
     * @return CrystalConcentration
     */
    public CrystalConcentration getCrystalConcentration() {
        return (CrystalConcentration) (isText ? textFields.computeIfAbsent("crystal_concentration",
                CrystalConcentration::new) : getBinaryColumn("crystal_concentration"));
    }

    /**
     * Details of crystal growth and preparation of the crystals
     * @return Preparation
     */
    public Preparation getPreparation() {
        return (Preparation) (isText ? textFields.computeIfAbsent("preparation",
                Preparation::new) : getBinaryColumn("preparation"));
    }

    /**
     * Sample deliver driving force, e.g. Gas, Electronic Potential
     * @return PowerBy
     */
    public PowerBy getPowerBy() {
        return (PowerBy) (isText ? textFields.computeIfAbsent("power_by",
                PowerBy::new) : getBinaryColumn("power_by"));
    }

    /**
     * The type of nozzle to deliver and focus sample jet
     * @return InjectorNozzle
     */
    public InjectorNozzle getInjectorNozzle() {
        return (InjectorNozzle) (isText ? textFields.computeIfAbsent("injector_nozzle",
                InjectorNozzle::new) : getBinaryColumn("injector_nozzle"));
    }

    /**
     * Diameter in micrometres of jet stream of sample delivery
     * @return JetDiameter
     */
    public JetDiameter getJetDiameter() {
        return (JetDiameter) (isText ? textFields.computeIfAbsent("jet_diameter",
                JetDiameter::new) : getBinaryColumn("jet_diameter"));
    }

    /**
     * The size of filter in micrometres in filtering crystals
     * @return FilterSize
     */
    public FilterSize getFilterSize() {
        return (FilterSize) (isText ? textFields.computeIfAbsent("filter_size",
                FilterSize::new) : getBinaryColumn("filter_size"));
    }
}
