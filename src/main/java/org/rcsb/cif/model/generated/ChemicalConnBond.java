package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

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
@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class ChemicalConnBond extends BaseCategory {
    public ChemicalConnBond(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public ChemicalConnBond(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public ChemicalConnBond(String name) {
        super(name);
    }

    /**
     * This data item is a pointer to _chemical_conn_atom.number in the
     * CHEMICAL_CONN_ATOM category.
     * @return IntColumn
     */
    public IntColumn getAtom1() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("atom_1", IntColumn::new) :
                getBinaryColumn("atom_1"));
    }

    /**
     * This data item is a pointer to _chemical_conn_atom.number in the
     * CHEMICAL_CONN_ATOM category.
     * @return IntColumn
     */
    public IntColumn getAtom2() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("atom_2", IntColumn::new) :
                getBinaryColumn("atom_2"));
    }

    /**
     * The chemical bond type associated with the connection between
     * the two sites _chemical_conn_bond.atom_1 and
     * _chemical_conn_bond.atom_2.
     * @return StrColumn
     */
    public StrColumn getType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("type", StrColumn::new) :
                getBinaryColumn("type"));
    }
}
