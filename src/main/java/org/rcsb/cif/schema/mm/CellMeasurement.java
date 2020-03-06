package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the CELL_MEASUREMENT category record details
 * about the measurement of the crystallographic cell parameters.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class CellMeasurement extends DelegatingCategory {
    public CellMeasurement(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "entry_id":
                return getEntryId();
            case "pressure":
                return getPressure();
            case "pressure_esd":
                return getPressureEsd();
            case "radiation":
                return getRadiation();
            case "reflns_used":
                return getReflnsUsed();
            case "temp":
                return getTemp();
            case "temp_esd":
                return getTempEsd();
            case "theta_max":
                return getThetaMax();
            case "theta_min":
                return getThetaMin();
            case "wavelength":
                return getWavelength();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * This data item is a pointer to _entry.id in the ENTRY category.
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return delegate.getColumn("entry_id", DelegatingStrColumn::new);
    }

    /**
     * The pressure in kilopascals at which the unit-cell parameters
     * were measured (not the pressure at which the sample was
     * synthesized).
     * @return FloatColumn
     */
    public FloatColumn getPressure() {
        return delegate.getColumn("pressure", DelegatingFloatColumn::new);
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _cell_measurement.pressure.
     * @return FloatColumn
     */
    public FloatColumn getPressureEsd() {
        return delegate.getColumn("pressure_esd", DelegatingFloatColumn::new);
    }

    /**
     * Description of the radiation used to measure the unit-cell data.
     * See also _cell_measurement.wavelength.
     * @return StrColumn
     */
    public StrColumn getRadiation() {
        return delegate.getColumn("radiation", DelegatingStrColumn::new);
    }

    /**
     * The total number of reflections used to determine the unit cell.
     * These reflections may be specified as CELL_MEASUREMENT_REFLN
     * data items.
     * @return IntColumn
     */
    public IntColumn getReflnsUsed() {
        return delegate.getColumn("reflns_used", DelegatingIntColumn::new);
    }

    /**
     * The temperature in kelvins at which the unit-cell parameters
     * were measured (not the temperature of synthesis).
     * @return FloatColumn
     */
    public FloatColumn getTemp() {
        return delegate.getColumn("temp", DelegatingFloatColumn::new);
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _cell_measurement.temp.
     * @return FloatColumn
     */
    public FloatColumn getTempEsd() {
        return delegate.getColumn("temp_esd", DelegatingFloatColumn::new);
    }

    /**
     * The maximum theta angle of reflections used to measure
     * the unit cell in degrees.
     * @return FloatColumn
     */
    public FloatColumn getThetaMax() {
        return delegate.getColumn("theta_max", DelegatingFloatColumn::new);
    }

    /**
     * The minimum theta angle of reflections used to measure
     * the unit cell in degrees.
     * @return FloatColumn
     */
    public FloatColumn getThetaMin() {
        return delegate.getColumn("theta_min", DelegatingFloatColumn::new);
    }

    /**
     * The wavelength in angstroms of the radiation used to measure
     * the unit cell. If this is not specified, the wavelength is
     * assumed to be that specified in the category
     * DIFFRN_RADIATION_WAVELENGTH.
     * @return FloatColumn
     */
    public FloatColumn getWavelength() {
        return delegate.getColumn("wavelength", DelegatingFloatColumn::new);
    }

}