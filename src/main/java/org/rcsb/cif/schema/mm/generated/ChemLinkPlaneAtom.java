package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the CHEM_LINK_PLANE_ATOM category enumerate the
 * atoms in a plane in a link between two chemical components.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return StrColumn
     */
    public StrColumn getAtomCompId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_comp_id", StrColumn::new) :
                getBinaryColumn("atom_comp_id"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_id", StrColumn::new) :
                getBinaryColumn("atom_id"));
    }

    /**
     * This data item is a pointer to _chem_link_plane.id in the
     * CHEM_LINK_PLANE category.
     * @return StrColumn
     */
    public StrColumn getPlaneId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("plane_id", StrColumn::new) :
                getBinaryColumn("plane_id"));
    }
}
