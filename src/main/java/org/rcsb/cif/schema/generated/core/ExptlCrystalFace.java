package org.rcsb.cif.schema.generated.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * 
 * The CATEGORY of data items which specify the dimensions of the
 * crystal used in the diffraction measurements.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class ExptlCrystalFace extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "exptl_crystal_face";

    public ExptlCrystalFace(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
    }

    /**
     * 
     * Miller indices of the crystal face.
     * @return StrColumn
     */
    public StrColumn getHkl() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_hkl"));
    }

    /**
     * 
     * Perpendicular distance of face to the centre of rotation of the crystal.
     * @return StrColumn
     */
    public StrColumn getPerpDist() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_perp_dist"));
    }
}
