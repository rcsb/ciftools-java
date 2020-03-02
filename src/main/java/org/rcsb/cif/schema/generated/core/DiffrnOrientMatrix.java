package org.rcsb.cif.schema.generated.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * 
 * The CATEGORY of data items which specify the matrix specifying the
 * orientation of the crystal axes to the diffractometer goniometer.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class DiffrnOrientMatrix extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "diffrn_orient_matrix";

    public DiffrnOrientMatrix(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
    }

    /**
     * 
     * Description of orientation matrix and how it should be applied to define
     * the orientation of the crystal with respect to the diffractometer axes.
     * @return StrColumn
     */
    public StrColumn getType() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_type"));
    }

    /**
     * 
     * The 3x3 matrix specifying the orientation of the crystal with
     * respect to the diffractometer axes.
     * @return StrColumn
     */
    public StrColumn getUBIJ() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_UBIJ"));
    }
}
