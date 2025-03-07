package org.rcsb.cif.schema.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class RefineDiff extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "refine_diff";

    public RefineDiff(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
    }

    /**
     * Maximum density value in a difference Fourier map.
     * @return FloatColumn
     */
    public FloatColumn getDensityMax() {
        return new DelegatingFloatColumn(parentBlock.getColumn("refine_diff_density_max"));
    }

    /**
     * Standard uncertainty of _refine_diff.density_max.
     * @return FloatColumn
     */
    public FloatColumn getDensityMaxSu() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("refine_diff_density_max_esd", "refine_diff_density_max_su"));
    }

    /**
     * Minimum density value in a difference Fourier map.
     * @return FloatColumn
     */
    public FloatColumn getDensityMin() {
        return new DelegatingFloatColumn(parentBlock.getColumn("refine_diff_density_min"));
    }

    /**
     * Standard uncertainty of _refine_diff.density_min.
     * @return FloatColumn
     */
    public FloatColumn getDensityMinSu() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("refine_diff_density_min_esd", "refine_diff_density_min_su"));
    }

    /**
     * Root mean square density value in a difference Fourier map.
     * This value is measured with respect to the arithmetic mean
     * density and is derived from summations over each grid point
     * in the asymmetric unit of the cell. This quantity is useful
     * for assessing the significance of *_min and *_max values,
     * and also for defining suitable contour levels.
     * @return FloatColumn
     */
    public FloatColumn getDensityRms() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("refine_diff_density_RMS", "refine_diff_density_rms"));
    }

    /**
     * Standard uncertainty of _refine_diff.density_RMS.
     * @return FloatColumn
     */
    public FloatColumn getDensityRmsSu() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("refine_diff_density_RMS_esd", "refine_diff_density_rms_su"));
    }

}