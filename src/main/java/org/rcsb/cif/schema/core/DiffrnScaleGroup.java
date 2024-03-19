package org.rcsb.cif.schema.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * The CATEGORY of data items which specify the groups of reflections in
 * the raw measured diffraction data with different relative scales.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class DiffrnScaleGroup extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "diffrn_scale_group";

    public DiffrnScaleGroup(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
    }

    /**
     * Code identifying a specific scale group of reflections (e.g. for
     * multi-film or multi-crystal data).
     * @return StrColumn
     */
    public StrColumn getCode() {
        return new DelegatingStrColumn(parentBlock.getColumn("diffrn_scale_group_code"));
    }

    /**
     * Scale for a specific measurement group of reflections. Is multiplied
     * with the net intensity to place all intensities on a common scale.
     * @return FloatColumn
     */
    public FloatColumn getINet() {
        return new DelegatingFloatColumn(parentBlock.getColumn("diffrn_scale_group_i_net"));
    }

    /**
     * Standard uncertainty of _diffrn_scale_group.I_net.
     * @return FloatColumn
     */
    public FloatColumn getINetSu() {
        return new DelegatingFloatColumn(parentBlock.getColumn("diffrn_scale_group_i_net_su"));
    }

}