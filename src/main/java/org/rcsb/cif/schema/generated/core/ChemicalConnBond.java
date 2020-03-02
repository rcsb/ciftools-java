package org.rcsb.cif.schema.generated.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * 
 * The CATEGORY of data items which specify the connections between
 * the atoms sites in the chemical_conn_atom list and the nature
 * of the chemical bond between these atoms. These are details about
 * the two-dimensional (2D) chemical structure of the molecular species.
 * They allow a 2D chemical diagram to be reconstructed for use in a
 * publication or in a database search for structural and substructural
 * relationships.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class ChemicalConnBond extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "chemical_conn_bond";

    public ChemicalConnBond(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
    }

    /**
     * 
     * Index id of first atom in a bond connecting two atom sites.
     * @return StrColumn
     */
    public StrColumn getAtom1() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_atom_1"));
    }

    /**
     * 
     * Index id of second atom in a bond connecting two atom sites.
     * @return StrColumn
     */
    public StrColumn getAtom2() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_atom_2"));
    }

    /**
     * 
     * The value that should be taken as the target for the chemical
     * bond associated with the specified atoms, expressed as a
     * distance.
     * @return StrColumn
     */
    public StrColumn getDistance() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_distance"));
    }

    /**
     * 
     * Code for the chemical bond type.
     * @return StrColumn
     */
    public StrColumn getType() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_type"));
    }
}
