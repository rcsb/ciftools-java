package org.rcsb.cif.schema.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * The CATEGORY of data items which specify the orientation of the crystal
 * axes to the diffractometer goniometer.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class DiffrnOrient extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "diffrn_orient";

    public DiffrnOrient(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
    }


}