package org.rcsb.cif.model.chemcompplane;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
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
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
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
     * The total number of atoms in the plane.
     * @return NumberAtomsAll
     */
    public NumberAtomsAll getNumberAtomsAll() {
        return (NumberAtomsAll) (isText ? textFields.computeIfAbsent("number_atoms_all",
                NumberAtomsAll::new) : getBinaryColumn("number_atoms_all"));
    }

    /**
     * The number of non-hydrogen atoms in the plane.
     * @return NumberAtomsNh
     */
    public NumberAtomsNh getNumberAtomsNh() {
        return (NumberAtomsNh) (isText ? textFields.computeIfAbsent("number_atoms_nh",
                NumberAtomsNh::new) : getBinaryColumn("number_atoms_nh"));
    }
}
