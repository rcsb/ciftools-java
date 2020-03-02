package org.rcsb.cif.schema.generated.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * 
 * The CATEGORY of data items used to specify the geometry bonds in the
 * structural model as derived from the atomic sites.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class GeomBond extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "geom_bond";

    public GeomBond(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
    }

    /**
     * 
     * Intramolecular bond distance between the sites identified
     * by _geom_bond.id
     * @return StrColumn
     */
    public StrColumn getDistance() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_distance"));
    }

    /**
     * 
     * Standard Uncertainty of the intramolecular bond distance
     * between the sites identified by _geom_bond.id
     * @return StrColumn
     */
    public StrColumn getDistanceSu() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_distance_su"));
    }

    /**
     * 
     * Identity of bond distance in terms of the atom site labels and
     * symmetry operators as pairs for each of the two "bonded" atom sites.
     * @return StrColumn
     */
    public StrColumn getId() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_id"));
    }

    /**
     * 
     * The number of times the given bond appears in the environment
     * of the atoms labelled _geom_bond.atom_site_label_1. In cases
     * where the full list of bonds is given, one of the series of
     * equivalent bonds may be assigned the appropriate multiplicity
     * while the others are assigned a value of 0.
     * @return StrColumn
     */
    public StrColumn getMultiplicity() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_multiplicity"));
    }

    /**
     * 
     * This code signals whether the angle is referred to in a
     * publication or should be placed in a table of significant angles.
     * @return StrColumn
     */
    public StrColumn getPublFlag() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_publ_flag"));
    }

    /**
     * 
     * Bond valence calculated from the bond distance.
     * @return StrColumn
     */
    public StrColumn getValence() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_valence"));
    }
}
