package org.rcsb.cif.schema.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class ChemCompBond extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "chem_comp_bond";

    public ChemCompBond(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
    }

    /**
     * Index id of first atom in a bond connecting two atom sites.
     * @return IntColumn
     */
    public IntColumn getAtomId1() {
        return new DelegatingIntColumn(parentBlock.getAliasedColumn("chem_comp_bond_atom_id_1", "chemical_conn_bond_atom_1"));
    }

    /**
     * Index id of second atom in a bond connecting two atom sites.
     * @return IntColumn
     */
    public IntColumn getAtomId2() {
        return new DelegatingIntColumn(parentBlock.getAliasedColumn("chem_comp_bond_atom_id_2", "chemical_conn_bond_atom_2"));
    }

    /**
     * The value that should be taken as the target for the chemical
     * bond associated with the specified atoms, expressed as a
     * distance.
     * @return FloatColumn
     */
    public FloatColumn getValueDist() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("chem_comp_bond_value_dist", "chemical_conn_bond_distance"));
    }

    /**
     * Code for the chemical bond type.
     * @return StrColumn
     */
    public StrColumn getValueOrder() {
        return new DelegatingStrColumn(parentBlock.getAliasedColumn("chem_comp_bond_value_order", "chemical_conn_bond_type"));
    }

}