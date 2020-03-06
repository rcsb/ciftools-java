package org.rcsb.cif.schema.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * The CIF_CORE group contains the definitions of data items that
 * are common to all domains of crystallographic studies.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class CifCore extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "cif_core";

    public CifCore(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
    }


}