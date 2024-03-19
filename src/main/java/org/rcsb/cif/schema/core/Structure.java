package org.rcsb.cif.schema.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * The DICTIONARY group encompassing the CORE STRUCTURE data items defined
 * and used within the Crystallographic Information Framework (CIF).
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class Structure extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "structure";

    public Structure(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
    }


}