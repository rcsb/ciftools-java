package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the CHEM_COMP_TOR category record details about
 * the torsion angles in a chemical component. As torsion angles
 * can have more than one target value, the target values are
 * specified in the CHEM_COMP_TOR_VALUE category.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class ChemCompTor extends DelegatingCategory {
    public ChemCompTor(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "atom_id_1":
                return getAtomId1();
            case "atom_id_2":
                return getAtomId2();
            case "atom_id_3":
                return getAtomId3();
            case "atom_id_4":
                return getAtomId4();
            case "id":
                return getId();
            case "comp_id":
                return getCompId();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The ID of the first of the four atoms that define the torsion
     * angle.
     * 
     * This data item is a pointer to _chem_comp_atom.atom_id in the
     * CHEM_COMP_ATOM category.
     * @return StrColumn
     */
    public StrColumn getAtomId1() {
        return delegate.getColumn("atom_id_1", DelegatingStrColumn::new);
    }

    /**
     * The ID of the second of the four atoms that define the torsion
     * angle.
     * 
     * This data item is a pointer to _chem_comp_atom.atom_id in the
     * CHEM_COMP_ATOM category.
     * @return StrColumn
     */
    public StrColumn getAtomId2() {
        return delegate.getColumn("atom_id_2", DelegatingStrColumn::new);
    }

    /**
     * The ID of the third of the four atoms that define the torsion
     * angle.
     * 
     * This data item is a pointer to _chem_comp_atom.atom_id in the
     * CHEM_COMP_ATOM category.
     * @return StrColumn
     */
    public StrColumn getAtomId3() {
        return delegate.getColumn("atom_id_3", DelegatingStrColumn::new);
    }

    /**
     * The ID of the fourth of the four atoms that define the torsion
     * angle.
     * 
     * This data item is a pointer to _chem_comp_atom.atom_id in the
     * CHEM_COMP_ATOM category.
     * @return StrColumn
     */
    public StrColumn getAtomId4() {
        return delegate.getColumn("atom_id_4", DelegatingStrColumn::new);
    }

    /**
     * The value of _chem_comp_tor.id must uniquely identify a
     * record in the CHEM_COMP_TOR list.
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * This data item is a pointer to _chem_comp.id in the CHEM_COMP
     * category.
     * @return StrColumn
     */
    public StrColumn getCompId() {
        return delegate.getColumn("comp_id", DelegatingStrColumn::new);
    }

}