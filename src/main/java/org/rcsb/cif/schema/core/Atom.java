package org.rcsb.cif.schema.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * The CATEGORY of data items used to describe atomic information
 * used in crystallographic structure studies.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class Atom extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "atom";

    public Atom(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
    }


}