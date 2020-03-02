package org.rcsb.cif.schema.generated.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * 
 * The CATEGORY of data items used to describe the diffraction experiment.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class Diffrn extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "diffrn";

    public Diffrn(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
    }

    /**
     * 
     * The gas or liquid environment of the crystal sample, if not air.
     * @return StrColumn
     */
    public StrColumn getAmbientEnvironment() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_ambient_environment"));
    }

    /**
     * 
     * Mean hydrostatic  pressure at which intensities were measured.
     * @return FloatColumn
     */
    public FloatColumn getAmbientPressure() {
        return new DelegatingFloatColumn(parentBlock.getColumn(NAME + "_ambient_pressure"));
    }

    /**
     * 
     * Mean hydrostatic pressure above which intensities were measured.
     * These items allow for a pressure range to be given.
     * _diffrn.ambient_pressure should be used in preference to this
     * item when possible.
     * @return FloatColumn
     */
    public FloatColumn getAmbientPressureGt() {
        return new DelegatingFloatColumn(parentBlock.getColumn(NAME + "_ambient_pressure_gt"));
    }

    /**
     * 
     * Mean hydrostatic pressure below which intensities were measured.
     * These items allow for a pressure range to be given.
     * _diffrn.ambient_pressure should be used in preference to this
     * item when possible.
     * @return FloatColumn
     */
    public FloatColumn getAmbientPressureLt() {
        return new DelegatingFloatColumn(parentBlock.getColumn(NAME + "_ambient_pressure_lt"));
    }

    /**
     * 
     * Standard Uncertainty of the
     * Mean hydrostatic  pressure at which intensities were measured.
     * @return FloatColumn
     */
    public FloatColumn getAmbientPressureSu() {
        return new DelegatingFloatColumn(parentBlock.getColumn(NAME + "_ambient_pressure_su"));
    }

    /**
     * 
     * Mean temperature at which intensities were measured.
     * @return FloatColumn
     */
    public FloatColumn getAmbientTemperature() {
        return new DelegatingFloatColumn(parentBlock.getColumn(NAME + "_ambient_temperature"));
    }

    /**
     * 
     * A description of special aspects of temperature control during
     * data collection.
     * @return StrColumn
     */
    public StrColumn getAmbientTemperatureDetails() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_ambient_temperature_details"));
    }

    /**
     * 
     * Mean temperature above which intensities were measured.
     * These items allow for a temperature range to be given.
     * _diffrn.ambient_temperature should be used in preference to
     * this item when possible.
     * @return FloatColumn
     */
    public FloatColumn getAmbientTemperatureGt() {
        return new DelegatingFloatColumn(parentBlock.getColumn(NAME + "_ambient_temperature_gt"));
    }

    /**
     * 
     * Mean temperature below which intensities were measured.
     * These items allow for a temperature range to be given.
     * _diffrn.ambient_temperature should be used in preference to
     * this item when possible.
     * @return FloatColumn
     */
    public FloatColumn getAmbientTemperatureLt() {
        return new DelegatingFloatColumn(parentBlock.getColumn(NAME + "_ambient_temperature_lt"));
    }

    /**
     * 
     * Standard Uncertainty of the
     * mean temperature at which intensities were measured.
     * @return FloatColumn
     */
    public FloatColumn getAmbientTemperatureSu() {
        return new DelegatingFloatColumn(parentBlock.getColumn(NAME + "_ambient_temperature_su"));
    }

    /**
     * 
     * The physical device used to support the crystal during data
     * collection.
     * @return StrColumn
     */
    public StrColumn getCrystalSupport() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_crystal_support"));
    }

    /**
     * 
     * Remarks about how the crystal was treated prior to intensity measurement.
     * Particularly relevant when intensities were measured at low temperature.
     * @return StrColumn
     */
    public StrColumn getCrystalTreatment() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_crystal_treatment"));
    }

    /**
     * 
     * Fraction of unique (symmetry-independent) reflections measured
     * out to _diffrn_reflns.theta_full.
     * @return FloatColumn
     */
    public FloatColumn getMeasuredFractionThetaFull() {
        return new DelegatingFloatColumn(parentBlock.getColumn(NAME + "_measured_fraction_theta_full"));
    }

    /**
     * 
     * Fraction of unique (symmetry-independent) reflections measured
     * out to _diffrn_reflns.theta_max.
     * @return FloatColumn
     */
    public FloatColumn getMeasuredFractionThetaMax() {
        return new DelegatingFloatColumn(parentBlock.getColumn(NAME + "_measured_fraction_theta_max"));
    }

    /**
     * 
     * Special details of the diffraction measurement process. Should include
     * information about source instability, crystal motion, degradation, etc.
     * @return StrColumn
     */
    public StrColumn getSpecialDetails() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_special_details"));
    }

    /**
     * 
     * Recorded diffraction point symmetry, systematic absences and possible
     * space group(s) or superspace group(s) compatible with these.
     * @return StrColumn
     */
    public StrColumn getSymmetryDescription() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_symmetry_description"));
    }
}
