package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the CHEM_COMP_ANGLE category record details about
 * angles in a chemical component. Angles are designated by three
 * atoms, with the second atom forming the vertex of the angle.
 * Target values may be specified as angles in degrees, as a
 * distance between the first and third atoms, or both.
 */
@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class ChemCompAngle extends BaseCategory {
    public ChemCompAngle(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public ChemCompAngle(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public ChemCompAngle(String name) {
        super(name);
    }

    /**
     * The ID of the first of the three atoms that define the angle.
     * 
     * This data item is a pointer to _chem_comp_atom.atom_id in the
     * CHEM_COMP_ATOM category.
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
     * This data item is a pointer to _chem_comp_atom.atom_id in the
     * CHEM_COMP_ATOM category.
     * @return StrColumn
     */
    public StrColumn getAtomId2() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_id_2", StrColumn::new) :
                getBinaryColumn("atom_id_2"));
    }

    /**
     * The ID of the third of the three atoms that define the angle.
     * 
     * This data item is a pointer to _chem_comp_atom.atom_id in the
     * CHEM_COMP_ATOM category.
     * @return StrColumn
     */
    public StrColumn getAtomId3() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_id_3", StrColumn::new) :
                getBinaryColumn("atom_id_3"));
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
     * of _chem_comp_angle.value_angle.
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
