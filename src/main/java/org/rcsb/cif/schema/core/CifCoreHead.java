package org.rcsb.cif.schema.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * The CIF_CORE_HEAD category is the top-level category for all categories in
 * the CIF_CORE dictionary.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class CifCoreHead extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "cif_core_head";

    public CifCoreHead(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
    }


}