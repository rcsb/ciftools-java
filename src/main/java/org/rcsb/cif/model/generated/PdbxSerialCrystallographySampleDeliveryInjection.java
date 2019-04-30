package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_SERIAL_CRYSTALLOGRAPHY_SAMPLE_DELIVERY_INJECTION
 * category record details about sample delivery by injection
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDiffrnId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("diffrn_id", SingleRowStrColumn::new) :
                getBinaryColumn("diffrn_id"));
    }

    /**
     * For continuous sample flow experiments, a description of the injector used
     * to move the sample into the beam.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDescription() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("description", SingleRowStrColumn::new) :
                getBinaryColumn("description"));
    }

    /**
     * For continuous sample flow experiments, the diameter of the
     * injector in micrometres.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getInjectorDiameter() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("injector_diameter", SingleRowFloatColumn::new) :
                getBinaryColumn("injector_diameter"));
    }

    /**
     * For continuous sample flow experiments, the temperature in
     * Kelvins of the speciman injected. This may be different from
     * the temperature of the sample.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getInjectorTemperature() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("injector_temperature", SingleRowFloatColumn::new) :
                getBinaryColumn("injector_temperature"));
    }

    /**
     * For continuous sample flow experiments, the mean pressure
     * in kilopascals at which the sample is injected into the beam.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getInjectorPressure() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("injector_pressure", SingleRowFloatColumn::new) :
                getBinaryColumn("injector_pressure"));
    }

    /**
     * For continuous sample flow experiments, the flow rate of
     * solution being injected  measured in ul/min.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getFlowRate() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("flow_rate", SingleRowFloatColumn::new) :
                getBinaryColumn("flow_rate"));
    }

    /**
     * For continuous sample flow experiments, the carrier buffer used
     * to move the sample into the beam. Should include protein
     * concentration.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getCarrierSolvent() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("carrier_solvent", SingleRowStrColumn::new) :
                getBinaryColumn("carrier_solvent"));
    }

    /**
     * For continuous sample flow experiments, the concentration of
     * crystals in the solution being injected.
     * 
     * The concentration is measured in million crystals/ml.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getCrystalConcentration() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("crystal_concentration", SingleRowFloatColumn::new) :
                getBinaryColumn("crystal_concentration"));
    }

    /**
     * Details of crystal growth and preparation of the crystals
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getPreparation() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("preparation", SingleRowStrColumn::new) :
                getBinaryColumn("preparation"));
    }

    /**
     * Sample deliver driving force, e.g. Gas, Electronic Potential
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getPowerBy() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("power_by", SingleRowStrColumn::new) :
                getBinaryColumn("power_by"));
    }

    /**
     * The type of nozzle to deliver and focus sample jet
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getInjectorNozzle() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("injector_nozzle", SingleRowStrColumn::new) :
                getBinaryColumn("injector_nozzle"));
    }

    /**
     * Diameter in micrometres of jet stream of sample delivery
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getJetDiameter() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("jet_diameter", SingleRowFloatColumn::new) :
                getBinaryColumn("jet_diameter"));
    }

    /**
     * The size of filter in micrometres in filtering crystals
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getFilterSize() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("filter_size", SingleRowFloatColumn::new) :
                getBinaryColumn("filter_size"));
    }
}
