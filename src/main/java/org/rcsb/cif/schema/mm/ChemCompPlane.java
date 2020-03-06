package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the CHEM_COMP_PLANE category provide identifiers
 * for the planes in a chemical component.  The atoms in the plane
 * are specified in the CHEM_COMP_PLANE_ATOM category.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class ChemCompPlane extends DelegatingCategory {
    public ChemCompPlane(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "id":
                return getId();
            case "comp_id":
                return getCompId();
            case "number_atoms_all":
                return getNumberAtomsAll();
            case "number_atoms_nh":
                return getNumberAtomsNh();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The value of _chem_comp_plane.id must uniquely identify a record
     * in the CHEM_COMP_PLANE list.
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