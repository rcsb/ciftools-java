package org.rcsb.cif.schema.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class Symmetry extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "symmetry";

    public Symmetry(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
    }

    /**
     * 
     * This dataname should not be used and is DEPRECATED as it is
     * ambiguous.
     * 
     * The original definition is as follows:
     * 
     * The cell settings for this space-group symmetry.
     * @return StrColumn
     */
    public StrColumn getCellSetting() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_cell_setting"));
    }
}
