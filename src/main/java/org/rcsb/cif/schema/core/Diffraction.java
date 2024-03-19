package org.rcsb.cif.schema.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * The DICTIONARY group encompassing the CORE DIFFRACTION data items defined
 * and used within the Crystallographic Information Framework (CIF).
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class Diffraction extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "diffraction";

    public Diffraction(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
    }


}