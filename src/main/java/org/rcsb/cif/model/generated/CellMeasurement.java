package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the CELL_MEASUREMENT category record details
 * about the measurement of the crystallographic cell parameters.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entry_id", StrColumn::new) :
                getBinaryColumn("entry_id"));
    }

    /**
     * The pressure in kilopascals at which the unit-cell parameters
     * were measured (not the pressure at which the sample was
     * synthesized).
     * @return FloatColumn
     */
    public FloatColumn getPressure() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pressure", FloatColumn::new) :
                getBinaryColumn("pressure"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _cell_measurement.pressure.
     * @return FloatColumn
     */
    public FloatColumn getPressureEsd() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pressure_esd", FloatColumn::new) :
                getBinaryColumn("pressure_esd"));
    }

    /**
     * Description of the radiation used to measure the unit-cell data.
     * See also _cell_measurement.wavelength.
     * @return StrColumn
     */
    public StrColumn getRadiation() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("radiation", StrColumn::new) :
                getBinaryColumn("radiation"));
    }

    /**
     * The total number of reflections used to determine the unit cell.
     * These reflections may be specified as CELL_MEASUREMENT_REFLN
     * data items.
     * @return IntColumn
     */
    public IntColumn getReflnsUsed() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("reflns_used", IntColumn::new) :
                getBinaryColumn("reflns_used"));
    }

    /**
     * The temperature in kelvins at which the unit-cell parameters
     * were measured (not the temperature of synthesis).
     * @return FloatColumn
     */
    public FloatColumn getTemp() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("temp", FloatColumn::new) :
                getBinaryColumn("temp"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _cell_measurement.temp.
     * @return FloatColumn
     */
    public FloatColumn getTempEsd() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("temp_esd", FloatColumn::new) :
                getBinaryColumn("temp_esd"));
    }

    /**
     * The maximum theta angle of reflections used to measure
     * the unit cell in degrees.
     * @return FloatColumn
     */
    public FloatColumn getThetaMax() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("theta_max", FloatColumn::new) :
                getBinaryColumn("theta_max"));
    }

    /**
     * The minimum theta angle of reflections used to measure
     * the unit cell in degrees.
     * @return FloatColumn
     */
    public FloatColumn getThetaMin() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("theta_min", FloatColumn::new) :
                getBinaryColumn("theta_min"));
    }

    /**
     * The wavelength in angstroms of the radiation used to measure
     * the unit cell. If this is not specified, the wavelength is
     * assumed to be that specified in the category
     * DIFFRN_RADIATION_WAVELENGTH.
     * @return FloatColumn
     */
    public FloatColumn getWavelength() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("wavelength", FloatColumn::new) :
                getBinaryColumn("wavelength"));
    }
}
