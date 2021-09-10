package org.rcsb.cif.schema.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * The CATEGORY of data items which specify the scales needed to place
 * measured structure factor coefficients on the same absolute scale.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class ReflnsScale extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "reflns_scale";

    public ReflnsScale(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
    }

    /**
     * Code identifying a reflection scale group. These names need not
     * correspond to _diffrn_scale_group.code names.
     * @return StrColumn
     */
    public StrColumn getGroupCode() {
        return new DelegatingStrColumn(parentBlock.getColumn("reflns_scale_group_code"));
    }

    /**
     * Structure factor scale for this scale group.
     * @return FloatColumn
     */
    public FloatColumn getMeasF() {
        return new DelegatingFloatColumn(parentBlock.getColumn("reflns_scale_meas_F"));
    }

    /**
     * Structure factor squared scale for this scale group.
     * @return FloatColumn
     */
    public FloatColumn getMeasFSquared() {
        return new DelegatingFloatColumn(parentBlock.getColumn("reflns_scale_meas_F_squared"));
    }

    /**
     * Net intensity scale for this scale group.
     * @return FloatColumn
     */
    public FloatColumn getMeasIntensity() {
        return new DelegatingFloatColumn(parentBlock.getColumn("reflns_scale_meas_intensity"));
    }

}