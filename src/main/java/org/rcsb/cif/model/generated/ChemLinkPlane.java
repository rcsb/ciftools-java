package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the CHEM_LINK_PLANE category provide identifiers
 * for the planes in a link between two chemical components.
 * The atoms in the plane are specified in the CHEM_LINK_PLANE_ATOM
 * category.
 */
@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class ChemLinkPlane extends BaseCategory {
    public ChemLinkPlane(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public ChemLinkPlane(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public ChemLinkPlane(String name) {
        super(name);
    }

    /**
     * The value of _chem_link_plane.id must uniquely identify a record
     * in the CHEM_LINK_PLANE list.
     * @return StrColumn
     */
    public StrColumn getId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("id", StrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * This data item is a pointer to _chem_link.id in the CHEM_LINK
     * category.
     * @return StrColumn
     */
    public StrColumn getLinkId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("link_id", StrColumn::new) :
                getBinaryColumn("link_id"));
    }

    /**
     * The total number of atoms in the plane.
     * @return IntColumn
     */
    public IntColumn getNumberAtomsAll() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("number_atoms_all", IntColumn::new) :
                getBinaryColumn("number_atoms_all"));
    }

    /**
     * The number of non-hydrogen atoms in the plane.
     * @return IntColumn
     */
    public IntColumn getNumberAtomsNh() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("number_atoms_nh", IntColumn::new) :
                getBinaryColumn("number_atoms_nh"));
    }
}
