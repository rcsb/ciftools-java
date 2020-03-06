package org.rcsb.cif.schema.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Items in the MODEL Category specify data for the crystal structure
 * postulated and modelled from the atomic coordinates derived and
 * refined from the diffraction information. The structural model is
 * described principally in terms of the geometry of the 'connected'
 * atom sites and the crystal symmetry in which they reside.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class Model extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "model";

    public Model(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
    }


}