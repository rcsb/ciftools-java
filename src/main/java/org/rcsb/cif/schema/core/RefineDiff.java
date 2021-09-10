package org.rcsb.cif.schema.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * The CATEGORY of data items which specify the electron density limits
 * in a difference Fourier map after the structure has been refined. The
 * rms value is with respect to the arithmetic mean density, and is derived
 * from summations over each grid point in the asymmetric unit of the cell.
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
     * Standard Uncertainty of the
     * Maximum density value in a difference Fourier map.
     * @return FloatColumn
     */
    public FloatColumn getDensityMaxSu() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("refine_diff_density_max_esd", "refine_diff_density_max_su"));
    }

    /**
     * Miniumum density value in a difference Fourier map.
     * @return FloatColumn
     */
    public FloatColumn getDensityMin() {
        return new DelegatingFloatColumn(parentBlock.getColumn("refine_diff_density_min"));
    }

    /**
     * Standard Uncertainty of the
     * Miniumum density value in a difference Fourier map.
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
        return new DelegatingFloatColumn(parentBlock.getColumn("refine_diff_density_rms"));
    }

    /**
     * Standard Uncertainty of the
     * Root mean square density value in a difference Fourier map.
     * @return FloatColumn
     */
    public FloatColumn getDensityRmsSu() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("refine_diff_density_rms_esd", "refine_diff_density_rms_su"));
    }

}