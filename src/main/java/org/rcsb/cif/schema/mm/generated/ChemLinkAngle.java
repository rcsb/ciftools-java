package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the CHEM_LINK_ANGLE category record details
 * about angles in a link between chemical components.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class ChemLinkAngle extends BaseCategory {
    public ChemLinkAngle(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public ChemLinkAngle(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public ChemLinkAngle(String name) {
        super(name);
    }

    /**
     * This data item indicates whether atom 1 is found in the first
     * or the second of the two components connected by the link.
     * @return StrColumn
     */
    public StrColumn getAtom1CompId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_1_comp_id", StrColumn::new) :
                getBinaryColumn("atom_1_comp_id"));
    }

    /**
     * This data item indicates whether atom 2 is found in the first
     * or the second of the two components connected by the link.
     * @return StrColumn
     */
    public StrColumn getAtom2CompId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_2_comp_id", StrColumn::new) :
                getBinaryColumn("atom_2_comp_id"));
    }

    /**
     * This data item indicates whether atom 3 is found in the first
     * or the second of the two components connected by the link.
     * @return StrColumn
     */
    public StrColumn getAtom3CompId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_3_comp_id", StrColumn::new) :
                getBinaryColumn("atom_3_comp_id"));
    }

    /**
     * The ID of the first of the three atoms that define the angle.
     * 
     * An atom with this ID must exist in the component of the type
     * specified by _chem_comp_link.type_comp_1 (or
     * _chem_comp_link.type_comp_2, where the appropriate data item
     * is indicated by the value of _chem_comp_angle.atom_1_comp_id).
     * @return StrColumn
     */
    public StrColumn getAtomId1() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_id_1", StrColumn::new) :
                getBinaryColumn("atom_id_1"));
    }

    /**
     * The ID of the second of the three atoms that define the angle.
     * The second atom is taken to be the apex of the angle.
     * 
     * An atom with this ID must exist in the component of the type
     * specified by _chem_comp_link.type_comp_1 (or
     * _chem_comp_link.type_comp_2, where the appropriate data item
     * is indicated by the value of _chem_comp_angle.atom_2_comp_id).
     * @return StrColumn
     */
    public StrColumn getAtomId2() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_id_2", StrColumn::new) :
                getBinaryColumn("atom_id_2"));
    }

    /**
     * The ID of the third of the three atoms that define the angle.
     * 
     * An atom with this ID must exist in the component of the type
     * specified by _chem_comp_link.type_comp_1 (or
     * _chem_comp_link.type_comp_2, where the appropriate data item
     * is indicated by the value of _chem_comp_angle.atom_3_comp_id).
     * @return StrColumn
     */
    public StrColumn getAtomId3() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_id_3", StrColumn::new) :
                getBinaryColumn("atom_id_3"));
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
     * The value that should be taken as the target value for the angle
     * associated with the specified atoms, expressed in degrees.
     * @return FloatColumn
     */
    public FloatColumn getValueAngle() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("value_angle", FloatColumn::new) :
                getBinaryColumn("value_angle"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _chem_link_angle.value_angle.
     * @return FloatColumn
     */
    public FloatColumn getValueAngleEsd() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("value_angle_esd", FloatColumn::new) :
                getBinaryColumn("value_angle_esd"));
    }

    /**
     * The value that should be taken as the target value for the angle
     * associated with the specified atoms, expressed as the distance
     * between the atoms specified by _chem_comp_angle.atom_id_1 and
     * _chem_comp_angle.atom_id_3.
     * @return FloatColumn
     */
    public FloatColumn getValueDist() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("value_dist", FloatColumn::new) :
                getBinaryColumn("value_dist"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _chem_comp_angle.value_dist.
     * @return FloatColumn
     */
    public FloatColumn getValueDistEsd() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("value_dist_esd", FloatColumn::new) :
                getBinaryColumn("value_dist_esd"));
    }
}
