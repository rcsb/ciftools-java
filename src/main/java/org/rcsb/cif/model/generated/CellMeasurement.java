package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the CELL_MEASUREMENT category record details
 * about the measurement of the crystallographic cell parameters.
 */
@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class CellMeasurement extends BaseCategory {
    public CellMeasurement(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public CellMeasurement(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public CellMeasurement(String name) {
        super(name);
    }

    /**
     * This data item is a pointer to _entry.id in the ENTRY category.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getEntryId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("entry_id", SingleRowStrColumn::new) :
                getBinaryColumn("entry_id"));
    }

    /**
     * The pressure in kilopascals at which the unit-cell parameters
     * were measured (not the pressure at which the sample was
     * synthesized).
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getPressure() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("pressure", SingleRowFloatColumn::new) :
                getBinaryColumn("pressure"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _cell_measurement.pressure.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getPressureEsd() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("pressure_esd", SingleRowFloatColumn::new) :
                getBinaryColumn("pressure_esd"));
    }

    /**
     * Description of the radiation used to measure the unit-cell data.
     * See also _cell_measurement.wavelength.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getRadiation() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("radiation", SingleRowStrColumn::new) :
                getBinaryColumn("radiation"));
    }

    /**
     * The total number of reflections used to determine the unit cell.
     * These reflections may be specified as CELL_MEASUREMENT_REFLN
     * data items.
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getReflnsUsed() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("reflns_used", SingleRowIntColumn::new) :
                getBinaryColumn("reflns_used"));
    }

    /**
     * The temperature in kelvins at which the unit-cell parameters
     * were measured (not the temperature of synthesis).
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getTemp() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("temp", SingleRowFloatColumn::new) :
                getBinaryColumn("temp"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _cell_measurement.temp.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getTempEsd() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("temp_esd", SingleRowFloatColumn::new) :
                getBinaryColumn("temp_esd"));
    }

    /**
     * The maximum theta angle of reflections used to measure
     * the unit cell in degrees.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getThetaMax() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("theta_max", SingleRowFloatColumn::new) :
                getBinaryColumn("theta_max"));
    }

    /**
     * The minimum theta angle of reflections used to measure
     * the unit cell in degrees.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getThetaMin() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("theta_min", SingleRowFloatColumn::new) :
                getBinaryColumn("theta_min"));
    }

    /**
     * The wavelength in angstroms of the radiation used to measure
     * the unit cell. If this is not specified, the wavelength is
     * assumed to be that specified in the category
     * DIFFRN_RADIATION_WAVELENGTH.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getWavelength() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("wavelength", SingleRowFloatColumn::new) :
                getBinaryColumn("wavelength"));
    }
}
