package org.rcsb.cif.schema.mm.generated;

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
     * @return StrColumn
     */
    public StrColumn getDiffrnId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("diffrn_id", StrColumn::new) :
                getBinaryColumn("diffrn_id"));
    }

    /**
     * For continuous sample flow experiments, a description of the injector used
     * to move the sample into the beam.
     * @return StrColumn
     */
    public StrColumn getDescription() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("description", StrColumn::new) :
                getBinaryColumn("description"));
    }

    /**
     * For continuous sample flow experiments, the diameter of the
     * injector in micrometres.
     * @return FloatColumn
     */
    public FloatColumn getInjectorDiameter() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("injector_diameter", FloatColumn::new) :
                getBinaryColumn("injector_diameter"));
    }

    /**
     * For continuous sample flow experiments, the temperature in
     * Kelvins of the speciman injected. This may be different from
     * the temperature of the sample.
     * @return FloatColumn
     */
    public FloatColumn getInjectorTemperature() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("injector_temperature", FloatColumn::new) :
                getBinaryColumn("injector_temperature"));
    }

    /**
     * For continuous sample flow experiments, the mean pressure
     * in kilopascals at which the sample is injected into the beam.
     * @return FloatColumn
     */
    public FloatColumn getInjectorPressure() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("injector_pressure", FloatColumn::new) :
                getBinaryColumn("injector_pressure"));
    }

    /**
     * For continuous sample flow experiments, the flow rate of
     * solution being injected  measured in ul/min.
     * @return FloatColumn
     */
    public FloatColumn getFlowRate() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("flow_rate", FloatColumn::new) :
                getBinaryColumn("flow_rate"));
    }

    /**
     * For continuous sample flow experiments, the carrier buffer used
     * to move the sample into the beam. Should include protein
     * concentration.
     * @return StrColumn
     */
    public StrColumn getCarrierSolvent() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("carrier_solvent", StrColumn::new) :
                getBinaryColumn("carrier_solvent"));
    }

    /**
     * For continuous sample flow experiments, the concentration of
     * crystals in the solution being injected.
     * 
     * The concentration is measured in million crystals/ml.
     * @return FloatColumn
     */
    public FloatColumn getCrystalConcentration() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("crystal_concentration", FloatColumn::new) :
                getBinaryColumn("crystal_concentration"));
    }

    /**
     * Details of crystal growth and preparation of the crystals
     * @return StrColumn
     */
    public StrColumn getPreparation() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("preparation", StrColumn::new) :
                getBinaryColumn("preparation"));
    }

    /**
     * Sample deliver driving force, e.g. Gas, Electronic Potential
     * @return StrColumn
     */
    public StrColumn getPowerBy() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("power_by", StrColumn::new) :
                getBinaryColumn("power_by"));
    }

    /**
     * The type of nozzle to deliver and focus sample jet
     * @return StrColumn
     */
    public StrColumn getInjectorNozzle() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("injector_nozzle", StrColumn::new) :
                getBinaryColumn("injector_nozzle"));
    }

    /**
     * Diameter in micrometres of jet stream of sample delivery
     * @return FloatColumn
     */
    public FloatColumn getJetDiameter() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("jet_diameter", FloatColumn::new) :
                getBinaryColumn("jet_diameter"));
    }

    /**
     * The size of filter in micrometres in filtering crystals
     * @return FloatColumn
     */
    public FloatColumn getFilterSize() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("filter_size", FloatColumn::new) :
                getBinaryColumn("filter_size"));
    }
}
