package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the CHEM_COMP_CHIR_ATOM category enumerate the
 * atoms bonded to a chiral atom within a chemical component.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class ChemCompChirAtom extends DelegatingCategory {
    public ChemCompChirAtom(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "atom_id":
                return getAtomId();
            case "chir_id":
                return getChirId();
            case "comp_id":
                return getCompId();
            case "dev":
                return getDev();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The ID of an atom bonded to the chiral atom.
     * 
     * This data item is a pointer to _chem_comp_atom.atom_id in the
     * CHEM_COMP_ATOM category.
     * @return StrColumn
     */
    public StrColumn getAtomId() {
        return delegate.getColumn("atom_id", DelegatingStrColumn::new);
    }

    /**
     * This data item is a pointer to _chem_comp_chir.id in the
     * CHEM_COMP_CHIR category.
     * @return StrColumn
     */
    public StrColumn getChirId() {
        return delegate.getColumn("chir_id", DelegatingStrColumn::new);
    }

    /**
     * This data item is a pointer to _chem_comp.id in the
     * CHEM_COMP category.
     * @return StrColumn
     */
    public StrColumn getCompId() {
        return delegate.getColumn("comp_id", DelegatingStrColumn::new);
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of the position of this atom from the plane defined by
     * all of the atoms in the plane.
     * @return FloatColumn
     */
    public FloatColumn getDev() {
        return delegate.getColumn("dev", DelegatingFloatColumn::new);
    }

}