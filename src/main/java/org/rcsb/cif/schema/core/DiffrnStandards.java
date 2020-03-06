package org.rcsb.cif.schema.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class DiffrnStandards extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "diffrn_standards";

    public DiffrnStandards(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
    }

    /**
     * The percentage decrease in the mean of the intensities for the
     * standard reflections at the start to the finish of the measurement
     * process. This value affords a measure of the overall decay in
     * crystal quality during measurement. Negative values only occur in
     * exceptional instances where the final intensities are greater than
     * the initial ones.  If no measurable decay has occurred, the
     * standard uncertainty should be quoted to indicate the maximum
     * possible value the decay might have.  A range of 3 standard
     * uncertainties is considered possible.  Thus 0.0(1) would indicate
     * a decay of less than 0.3% or an enhancement of less than 0.3%.
     * @return FloatColumn
     */
    public FloatColumn getDecay() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("diffrn_standards_decay_%", "diffrn_standard_decay_percent"));
    }

    /**
     * Reflection count between the standard reflection measurements.
     * @return IntColumn
     */
    public IntColumn getIntervalCount() {
        return new DelegatingIntColumn(parentBlock.getAliasedColumn("diffrn_standards_interval_count", "diffrn_standard_interval_count"));
    }

    /**
     * Time between the standard reflection measurements.
     * @return FloatColumn
     */
    public FloatColumn getIntervalTime() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("diffrn_standards_interval_time", "diffrn_standard_interval_time"));
    }

    /**
     * Number of unique standard reflections used in measurements.
     * @return IntColumn
     */
    public IntColumn getNumber() {
        return new DelegatingIntColumn(parentBlock.getAliasedColumn("diffrn_standards_number", "diffrn_standard_number"));
    }

    /**
     * The average standard uncertainty of the individual standard scales
     * applied to the intensity data.
     * @return FloatColumn
     */
    public FloatColumn getScaleSigma() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("diffrn_standards_scale_sigma", "diffrn_standards_scale_u", "diffrn_standard_scale_su_average"));
    }

    /**
     * The average standard uncertainty of the individual standard scales
     * applied to the intensity data.
     * @return FloatColumn
     */
    public FloatColumn getScaleU() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("diffrn_standards_scale_sigma", "diffrn_standards_scale_u", "diffrn_standard_scale_su_average"));
    }

}