package org.rcsb.cif.model.chemlinkplaneatom;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class ChemLinkPlaneAtom extends BaseCategory {
    public ChemLinkPlaneAtom(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public ChemLinkPlaneAtom(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public ChemLinkPlaneAtom(String name) {
        super(name);
    }

    /**
     * This data item indicates whether the atom in a plane is found in
     * the first or the second of the two components connected by the
     * link.
     * @return AtomCompId
     */
    public AtomCompId getAtomCompId() {
        return (AtomCompId) (isText ? textFields.computeIfAbsent("atom_comp_id",
                AtomCompId::new) : getBinaryColumn("atom_comp_id"));
    }

    /**
     * The ID of an atom involved in the plane.
     * 
     * As this data item does not point to a specific atom in a
     * specific chemical component, it is not a child in the linkage
     * sense.
     * @return AtomId
     */
    public AtomId getAtomId() {
        return (AtomId) (isText ? textFields.computeIfAbsent("atom_id",
                AtomId::new) : getBinaryColumn("atom_id"));
    }

    /**
     * This data item is a pointer to _chem_link_plane.id in the
     * CHEM_LINK_PLANE category.
     * @return PlaneId
     */
    public PlaneId getPlaneId() {
        return (PlaneId) (isText ? textFields.computeIfAbsent("plane_id",
                PlaneId::new) : getBinaryColumn("plane_id"));
    }
}
