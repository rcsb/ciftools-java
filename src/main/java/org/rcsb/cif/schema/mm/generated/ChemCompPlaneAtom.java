package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the CHEM_COMP_PLANE_ATOM category enumerate the
 * atoms in a plane within a chemical component.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class ChemCompPlaneAtom extends BaseCategory {
    public ChemCompPlaneAtom(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public ChemCompPlaneAtom(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public ChemCompPlaneAtom(String name) {
        super(name);
    }

    /**
     * The ID of an atom involved in the plane.
     * 
     * This data item is a pointer to _chem_comp_atom.atom_id in the
     * CHEM_COMP_ATOM category.
     * @return StrColumn
     */
    public StrColumn getAtomId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_id", StrColumn::new) :
                getBinaryColumn("atom_id"));
    }

    /**
     * This data item is a pointer to _chem_comp.id in the CHEM_COMP
     * category.
     * @return StrColumn
     */
    public StrColumn getCompId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("comp_id", StrColumn::new) :
                getBinaryColumn("comp_id"));
    }

    /**
     * This data item is a pointer to _chem_comp_plane.id in the
     * CHEM_COMP_PLANE category.
     * @return StrColumn
     */
    public StrColumn getPlaneId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("plane_id", StrColumn::new) :
                getBinaryColumn("plane_id"));
    }

    /**
     * This data item is the standard deviation of the
     * out-of-plane distance for this atom.
     * @return FloatColumn
     */
    public FloatColumn getDistEsd() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("dist_esd", FloatColumn::new) :
                getBinaryColumn("dist_esd"));
    }
}
