package org.rcsb.cif.model.cellmeasurement;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

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
     * @return EntryId
     */
    public EntryId getEntryId() {
        return (EntryId) (isText ? textFields.computeIfAbsent("entry_id",
                EntryId::new) : getBinaryColumn("entry_id"));
    }

    /**
     * The pressure in kilopascals at which the unit-cell parameters
     * were measured (not the pressure at which the sample was
     * synthesized).
     * @return Pressure
     */
    public Pressure getPressure() {
        return (Pressure) (isText ? textFields.computeIfAbsent("pressure",
                Pressure::new) : getBinaryColumn("pressure"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _cell_measurement.pressure.
     * @return PressureEsd
     */
    public PressureEsd getPressureEsd() {
        return (PressureEsd) (isText ? textFields.computeIfAbsent("pressure_esd",
                PressureEsd::new) : getBinaryColumn("pressure_esd"));
    }

    /**
     * Description of the radiation used to measure the unit-cell data.
     * See also _cell_measurement.wavelength.
     * @return Radiation
     */
    public Radiation getRadiation() {
        return (Radiation) (isText ? textFields.computeIfAbsent("radiation",
                Radiation::new) : getBinaryColumn("radiation"));
    }

    /**
     * The total number of reflections used to determine the unit cell.
     * These reflections may be specified as CELL_MEASUREMENT_REFLN
     * data items.
     * @return ReflnsUsed
     */
    public ReflnsUsed getReflnsUsed() {
        return (ReflnsUsed) (isText ? textFields.computeIfAbsent("reflns_used",
                ReflnsUsed::new) : getBinaryColumn("reflns_used"));
    }

    /**
     * The temperature in kelvins at which the unit-cell parameters
     * were measured (not the temperature of synthesis).
     * @return Temp
     */
    public Temp getTemp() {
        return (Temp) (isText ? textFields.computeIfAbsent("temp",
                Temp::new) : getBinaryColumn("temp"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _cell_measurement.temp.
     * @return TempEsd
     */
    public TempEsd getTempEsd() {
        return (TempEsd) (isText ? textFields.computeIfAbsent("temp_esd",
                TempEsd::new) : getBinaryColumn("temp_esd"));
    }

    /**
     * The maximum theta angle of reflections used to measure
     * the unit cell in degrees.
     * @return ThetaMax
     */
    public ThetaMax getThetaMax() {
        return (ThetaMax) (isText ? textFields.computeIfAbsent("theta_max",
                ThetaMax::new) : getBinaryColumn("theta_max"));
    }

    /**
     * The minimum theta angle of reflections used to measure
     * the unit cell in degrees.
     * @return ThetaMin
     */
    public ThetaMin getThetaMin() {
        return (ThetaMin) (isText ? textFields.computeIfAbsent("theta_min",
                ThetaMin::new) : getBinaryColumn("theta_min"));
    }

    /**
     * The wavelength in angstroms of the radiation used to measure
     * the unit cell. If this is not specified, the wavelength is
     * assumed to be that specified in the category
     * DIFFRN_RADIATION_WAVELENGTH.
     * @return Wavelength
     */
    public Wavelength getWavelength() {
        return (Wavelength) (isText ? textFields.computeIfAbsent("wavelength",
                Wavelength::new) : getBinaryColumn("wavelength"));
    }
}
