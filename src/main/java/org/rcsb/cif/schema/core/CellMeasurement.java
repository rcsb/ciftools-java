package org.rcsb.cif.schema.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * The category of data items used to describe the measurement of
 * the cell parameters.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class CellMeasurement extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "cell_measurement";

    public CellMeasurement(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
    }

    /**
     * **DEPRECATED**
     * 
     * The pressure at which the unit-cell parameters were measured
     * (not the pressure used to synthesize the sample).
     * Replaced by '_diffrn.ambient_pressure'
     * @return FloatColumn
     */
    public FloatColumn getPressure() {
        return new DelegatingFloatColumn(parentBlock.getColumn("cell_measurement_pressure"));
    }

    /**
     * ** DEPRECATED **
     * 
     * Description of the radiation used to measure the unit-cell data.
     * Items from the DIFFRN_RADIATION category should be used instead
     * of this item.
     * @return StrColumn
     */
    public StrColumn getRadiation() {
        return new DelegatingStrColumn(parentBlock.getColumn("cell_measurement_radiation"));
    }

    /**
     * Total number of reflections used to determine the unit cell.
     * The reflections may be specified as CELL_MEASUREMENT_REFLN items.
     * @return IntColumn
     */
    public IntColumn getReflnsUsed() {
        return new DelegatingIntColumn(parentBlock.getColumn("cell_measurement_reflns_used"));
    }

    /**
     * Maximum θ scattering angle of reflections used to measure
     * the crystal unit cell.
     * @return FloatColumn
     */
    public FloatColumn getThetaMax() {
        return new DelegatingFloatColumn(parentBlock.getColumn("cell_measurement_theta_max"));
    }

    /**
     * Minimum θ scattering angle of reflections used to measure
     * the crystal unit cell.
     * @return FloatColumn
     */
    public FloatColumn getThetaMin() {
        return new DelegatingFloatColumn(parentBlock.getColumn("cell_measurement_theta_min"));
    }

    /**
     * ** DEPRECATED **
     * 
     * Wavelength of the radiation used to measure the unit cell.
     * Items from the DIFFRN_RADIATION_WAVELENGTH category should
     * be used instead of this item.
     * @return FloatColumn
     */
    public FloatColumn getWavelength() {
        return new DelegatingFloatColumn(parentBlock.getColumn("cell_measurement_wavelength"));
    }

    /**
     * ** DEPRECATED **
     * 
     * Standard uncertainty of _cell_measurement.wavelength.
     * @return FloatColumn
     */
    public FloatColumn getWavelengthSu() {
        return new DelegatingFloatColumn(parentBlock.getColumn("cell_measurement_wavelength_su"));
    }

    /**
     * ** DEPRECATED **
     * 
     * Standard uncertainty of _cell_measurement.pressure.
     * @return FloatColumn
     */
    public FloatColumn getPressureEsd() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("cell_measurement_pressure_esd", "cell_measurement_pressure_su"));
    }

    /**
     * ** DEPRECATED **
     * 
     * Standard uncertainty of _cell_measurement.pressure.
     * @return FloatColumn
     */
    public FloatColumn getPressureSu() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("cell_measurement_pressure_esd", "cell_measurement_pressure_su"));
    }

    /**
     * ** DEPRECATED **
     * 
     * The temperature at which the unit-cell parameters were measured
     * (not the temperature of synthesis).
     * _diffrn.ambient_temperature should be used instead of this item.
     * @return FloatColumn
     */
    public FloatColumn getTemp() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("cell_measurement_temp", "cell_measurement_temperature"));
    }

    /**
     * ** DEPRECATED **
     * 
     * The temperature at which the unit-cell parameters were measured
     * (not the temperature of synthesis).
     * _diffrn.ambient_temperature should be used instead of this item.
     * @return FloatColumn
     */
    public FloatColumn getTemperature() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("cell_measurement_temp", "cell_measurement_temperature"));
    }

    /**
     * ** DEPRECATED **
     * 
     * Standard uncertainty of _cell_measurement.temperature.
     * @return FloatColumn
     */
    public FloatColumn getTempEsd() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("cell_measurement_temp_esd", "cell_measurement_temperature_su"));
    }

    /**
     * ** DEPRECATED **
     * 
     * Standard uncertainty of _cell_measurement.temperature.
     * @return FloatColumn
     */
    public FloatColumn getTemperatureSu() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("cell_measurement_temp_esd", "cell_measurement_temperature_su"));
    }

}