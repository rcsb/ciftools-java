package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the CHEM_LINK_CHIR_ATOM category enumerate the
 * atoms bonded to a chiral atom in a link between two
 * chemical components.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class ChemLinkChirAtom extends DelegatingCategory {
    public ChemLinkChirAtom(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "atom_comp_id":
                return getAtomCompId();
            case "atom_id":
                return getAtomId();
            case "chir_id":
                return getChirId();
            case "dev":
                return getDev();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * This data item indicates whether the atom bonded to a chiral
     * atom is found in the first or the second of the two components
     * connected by the link.
     * @return StrColumn
     */
    public StrColumn getAtomCompId() {
        return delegate.getColumn("atom_comp_id", DelegatingStrColumn::new);
    }

    /**
     * The ID of an atom bonded to the chiral atom.
     * 
     * As this data item does not point to a specific atom in a
     * specific chemical component, it is not a child in the linkage
     * sense.
     * @return StrColumn
     */
    public StrColumn getAtomId() {
        return delegate.getColumn("atom_id", DelegatingStrColumn::new);
    }

    /**
     * This data item is a pointer to _chem_link_chir.id in the
     * CHEM_LINK_CHIR category.
     * @return StrColumn
     */
    public StrColumn getChirId() {
        return delegate.getColumn("chir_id", DelegatingStrColumn::new);
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