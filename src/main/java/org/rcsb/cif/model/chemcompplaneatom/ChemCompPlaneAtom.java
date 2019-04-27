package org.rcsb.cif.model.chemcompplaneatom;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
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
     * @return AtomId
     */
    public AtomId getAtomId() {
        return (AtomId) (isText ? textFields.computeIfAbsent("atom_id",
                AtomId::new) : getBinaryColumn("atom_id"));
    }

    /**
     * This data item is a pointer to _chem_comp.id in the CHEM_COMP
     * category.
     * @return CompId
     */
    public CompId getCompId() {
        return (CompId) (isText ? textFields.computeIfAbsent("comp_id",
                CompId::new) : getBinaryColumn("comp_id"));
    }

    /**
     * This data item is a pointer to _chem_comp_plane.id in the
     * CHEM_COMP_PLANE category.
     * @return PlaneId
     */
    public PlaneId getPlaneId() {
        return (PlaneId) (isText ? textFields.computeIfAbsent("plane_id",
                PlaneId::new) : getBinaryColumn("plane_id"));
    }

    /**
     * This data item is the standard deviation of the
     * out-of-plane distance for this atom.
     * @return DistEsd
     */
    public DistEsd getDistEsd() {
        return (DistEsd) (isText ? textFields.computeIfAbsent("dist_esd",
                DistEsd::new) : getBinaryColumn("dist_esd"));
    }
}
