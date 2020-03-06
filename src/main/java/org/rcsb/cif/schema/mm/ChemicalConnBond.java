package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the CHEMICAL_CONN_BOND category would not, in
 * general, be used in a macromolecular CIF. See instead the
 * ENTITY data items.
 * 
 * Data items in the CHEMICAL_CONN_ATOM and CHEMICAL_CONN_BOND
 * categories record details about the two-dimensional (2D)
 * chemical structure of the molecular species. They allow a
 * 2D chemical diagram to be reconstructed for use in a
 * publication or in a database search for structural and
 * substructural relationships.
 * 
 * The CHEMICAL_CONN_BOND data items specify the connections
 * between the atoms in the CHEMICAL_CONN_ATOM list and the nature
 * of the chemical bond between these atoms.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class ChemicalConnBond extends DelegatingCategory {
    public ChemicalConnBond(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "atom_1":
                return getAtom1();
            case "atom_2":
                return getAtom2();
            case "type":
                return getType();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * This data item is a pointer to _chemical_conn_atom.number in the
     * CHEMICAL_CONN_ATOM category.
     * @return IntColumn
     */
    public IntColumn getAtom1() {
        return delegate.getColumn("atom_1", DelegatingIntColumn::new);
    }

    /**
     * This data item is a pointer to _chemical_conn_atom.number in the
     * CHEMICAL_CONN_ATOM category.
     * @return IntColumn
     */
    public IntColumn getAtom2() {
        return delegate.getColumn("atom_2", DelegatingIntColumn::new);
    }

    /**
     * The chemical bond type associated with the connection between
     * the two sites _chemical_conn_bond.atom_1 and
     * _chemical_conn_bond.atom_2.
     * @return StrColumn
     */
    public StrColumn getType() {
        return delegate.getColumn("type", DelegatingStrColumn::new);
    }

}