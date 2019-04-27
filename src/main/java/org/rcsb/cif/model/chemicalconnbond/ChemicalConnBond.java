package org.rcsb.cif.model.chemicalconnbond;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

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
     * @return Atom1
     */
    public Atom1 getAtom1() {
        return (Atom1) (isText ? textFields.computeIfAbsent("atom_1",
                Atom1::new) : getBinaryColumn("atom_1"));
    }

    /**
     * This data item is a pointer to _chemical_conn_atom.number in the
     * CHEMICAL_CONN_ATOM category.
     * @return Atom2
     */
    public Atom2 getAtom2() {
        return (Atom2) (isText ? textFields.computeIfAbsent("atom_2",
                Atom2::new) : getBinaryColumn("atom_2"));
    }

    /**
     * The chemical bond type associated with the connection between
     * the two sites _chemical_conn_bond.atom_1 and
     * _chemical_conn_bond.atom_2.
     * @return Type
     */
    public Type getType() {
        return (Type) (isText ? textFields.computeIfAbsent("type",
                Type::new) : getBinaryColumn("type"));
    }
}
