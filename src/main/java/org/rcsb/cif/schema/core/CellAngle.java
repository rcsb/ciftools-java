package org.rcsb.cif.schema.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class CellAngle extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "cell_angle";

    public CellAngle(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
    }

    /**
     * Standard uncertainty of the angle between the bounding cell axes.
     * @return FloatColumn
     */
    public FloatColumn getBetaSu() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("cell_angle_beta_su", "cell_angle_beta_esd"));
    }

    /**
     * Standard uncertainty of the angle between the bounding cell axes.
     * @return FloatColumn
     */
    public FloatColumn getGammaSu() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("cell_angle_gamma_su", "cell_angle_gamma_esd"));
    }

}