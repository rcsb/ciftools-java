package org.rcsb.cif.schema.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class ChemicalConnBond extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "chemical_conn_bond";

    public ChemicalConnBond(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
    }

    /**
     * Unique identifier for the bond.
     * @return StrColumn
     */
    public StrColumn getId() {
        return new DelegatingStrColumn(parentBlock.getColumn("chemical_conn_bond_id"));
    }

    /**
     * Index id of first atom in a bond connecting two atom sites.
     * @return IntColumn
     */
    public IntColumn getAtom1() {
        return new DelegatingIntColumn(parentBlock.getAliasedColumn("chem_comp_bond_atom_id_1", "chemical_conn_bond_atom_1"));
    }

    /**
     * Index id of second atom in a bond connecting two atom sites.
     * @return IntColumn
     */
    public IntColumn getAtom2() {
        return new DelegatingIntColumn(parentBlock.getAliasedColumn("chem_comp_bond_atom_id_2", "chemical_conn_bond_atom_2"));
    }

    /**
     * The value that should be taken as the target for the chemical
     * bond associated with the specified atoms, expressed as a
     * distance.
     * @return FloatColumn
     */
    public FloatColumn getDistance() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("chem_comp_bond_value_dist", "chemical_conn_bond_distance"));
    }

    /**
     * Code for the chemical bond type.
     * @return StrColumn
     */
    public StrColumn getType() {
        return new DelegatingStrColumn(parentBlock.getAliasedColumn("chem_comp_bond_value_order", "chemical_conn_bond_type"));
    }

}