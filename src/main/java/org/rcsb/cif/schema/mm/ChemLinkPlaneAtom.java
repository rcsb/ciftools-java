package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the CHEM_LINK_PLANE_ATOM category enumerate the
 * atoms in a plane in a link between two chemical components.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class ChemLinkPlaneAtom extends DelegatingCategory {
    public ChemLinkPlaneAtom(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "atom_comp_id":
                return getAtomCompId();
            case "atom_id":
                return getAtomId();
            case "plane_id":
                return getPlaneId();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * This data item indicates whether the atom in a plane is found in
     * the first or the second of the two components connected by the
     * link.
     * @return StrColumn
     */
    public StrColumn getAtomCompId() {
        return delegate.getColumn("atom_comp_id", DelegatingStrColumn::new);
    }

    /**
     * The ID of an atom involved in the plane.
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
     * This data item is a pointer to _chem_link_plane.id in the
     * CHEM_LINK_PLANE category.
     * @return StrColumn
     */
    public StrColumn getPlaneId() {
        return delegate.getColumn("plane_id", DelegatingStrColumn::new);
    }

}