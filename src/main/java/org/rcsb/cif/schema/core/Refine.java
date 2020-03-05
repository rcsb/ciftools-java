package org.rcsb.cif.schema.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * 
 * The CATEGORY of data items used to specify information about the
 * refinement of the structural model.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class Refine extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "refine";

    public Refine(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
    }

    /**
     * Details of the refinement not specified by other data items.
     * @return StrColumn
     */
    public StrColumn getSpecialDetails() {
        return new DelegatingStrColumn(parentBlock.getAliasedColumn("refine_details", "refine_special_details"));
    }
}
