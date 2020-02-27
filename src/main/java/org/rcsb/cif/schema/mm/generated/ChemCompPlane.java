package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the CHEM_COMP_PLANE category provide identifiers
 * for the planes in a chemical component.  The atoms in the plane
 * are specified in the CHEM_COMP_PLANE_ATOM category.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class ChemCompPlane extends BaseCategory {
    public ChemCompPlane(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public ChemCompPlane(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public ChemCompPlane(String name) {
        super(name);
    }

    /**
     * The value of _chem_comp_plane.id must uniquely identify a record
     * in the CHEM_COMP_PLANE list.
     * @return StrColumn
     */
    public StrColumn getId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("id", StrColumn::new) :
                getBinaryColumn("id"));
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
