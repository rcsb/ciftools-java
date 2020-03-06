package org.rcsb.cif.schema.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * The CATEGORY of items used to specify bond valence parameters
 * used to calculate bond valences from bond lengths.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class Valence extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "valence";

    public Valence(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
    }


}