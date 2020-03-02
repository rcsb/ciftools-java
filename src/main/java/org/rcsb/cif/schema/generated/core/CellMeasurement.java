package org.rcsb.cif.schema.generated.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * 
 * The CATEGORY of data items used to describe the angles between
 * the axes in the crystal unit cell.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class CellMeasurement extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "cell_measurement";

    public CellMeasurement(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
    }

    /**
     * 
     * The pressure at which the unit-cell parameters were measured
     * (not the pressure used to synthesize the sample).
     * @return StrColumn
     */
    public StrColumn getPressure() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_pressure"));
    }

    /**
     * 
     * The standard uncertainty of the pressure at which
     * the unit-cell parameters were measured.
     * @return StrColumn
     */
    public StrColumn getPressureSu() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_pressure_su"));
    }

    /**
     * 
     * Description of the radiation used to measure the unit-cell data.
     * @return StrColumn
     */
    public StrColumn getRadiation() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_radiation"));
    }

    /**
     * 
     * Total number of reflections used to determine the unit cell.
     * The reflections may be specified as cell_measurement_refln items.
     * @return StrColumn
     */
    public StrColumn getReflnsUsed() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_reflns_used"));
    }

    /**
     * 
     * The temperature at which the unit-cell parameters were measured
     * (not the temperature of synthesis).
     * @return StrColumn
     */
    public StrColumn getTemperature() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_temperature"));
    }

    /**
     * 
     * The standard uncertainty of the temperature of at which
     * the unit-cell parameters were measured.
     * @return StrColumn
     */
    public StrColumn getTemperatureSu() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_temperature_su"));
    }

    /**
     * 
     * Maximum theta scattering angle of reflections used to measure
     * the crystal unit cell.
     * @return StrColumn
     */
    public StrColumn getThetaMax() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_theta_max"));
    }

    /**
     * 
     * Minimum theta scattering angle of reflections used to measure
     * the crystal unit cell.
     * @return StrColumn
     */
    public StrColumn getThetaMin() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_theta_min"));
    }

    /**
     * 
     * Wavelength of the radiation used to measure the unit cell.
     * If this is not specified, the wavelength is assumed to be the
     * same as that given in _diffrn_radiation_wavelength.value
     * @return StrColumn
     */
    public StrColumn getWavelength() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_wavelength"));
    }
}
