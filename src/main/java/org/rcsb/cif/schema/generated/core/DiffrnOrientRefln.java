package org.rcsb.cif.schema.generated.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * 
 * The CATEGORY of data items which specify the reflections used to
 * calculate the matrix which gives the orientation of the crystal
 * axes to the diffractometer goniometer.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class DiffrnOrientRefln extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "diffrn_orient_refln";

    public DiffrnOrientRefln(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
    }

    /**
     * 
     * Miller indices of a reflection used to define the orientation matrix.
     * @return StrColumn
     */
    public StrColumn getHkl() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_hkl"));
    }
}
