package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the CHEM_LINK_PLANE category provide identifiers
 * for the planes in a link between two chemical components.
 * The atoms in the plane are specified in the CHEM_LINK_PLANE_ATOM
 * category.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class ChemLinkPlane extends DelegatingCategory {
    public ChemLinkPlane(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "id":
                return getId();
            case "link_id":
                return getLinkId();
            case "number_atoms_all":
                return getNumberAtomsAll();
            case "number_atoms_nh":
                return getNumberAtomsNh();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The value of _chem_link_plane.id must uniquely identify a record
     * in the CHEM_LINK_PLANE list.
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * This data item is a pointer to _chem_link.id in the CHEM_LINK
     * category.
     * @return StrColumn
     */
    public StrColumn getLinkId() {
        return delegate.getColumn("link_id", DelegatingStrColumn::new);
    }

    /**
     * The total number of atoms in the plane.
     * @return IntColumn
     */
    public IntColumn getNumberAtomsAll() {
        return delegate.getColumn("number_atoms_all", DelegatingIntColumn::new);
    }

    /**
     * The number of non-hydrogen atoms in the plane.
     * @return IntColumn
     */
    public IntColumn getNumberAtomsNh() {
        return delegate.getColumn("number_atoms_nh", DelegatingIntColumn::new);
    }

}