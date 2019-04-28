package org.rcsb.cif.model.generated.chemcompangle;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

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
     * @return AtomId1
     */
    public AtomId1 getAtomId1() {
        return (AtomId1) (isText ? textFields.computeIfAbsent("atom_id_1",
                AtomId1::new) : getBinaryColumn("atom_id_1"));
    }

    /**
     * The ID of the second of the three atoms that define the angle.
     * The second atom is taken to be the apex of the angle.
     * 
     * This data item is a pointer to _chem_comp_atom.atom_id in the
     * CHEM_COMP_ATOM category.
     * @return AtomId2
     */
    public AtomId2 getAtomId2() {
        return (AtomId2) (isText ? textFields.computeIfAbsent("atom_id_2",
                AtomId2::new) : getBinaryColumn("atom_id_2"));
    }

    /**
     * The ID of the third of the three atoms that define the angle.
     * 
     * This data item is a pointer to _chem_comp_atom.atom_id in the
     * CHEM_COMP_ATOM category.
     * @return AtomId3
     */
    public AtomId3 getAtomId3() {
        return (AtomId3) (isText ? textFields.computeIfAbsent("atom_id_3",
                AtomId3::new) : getBinaryColumn("atom_id_3"));
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
     * The value that should be taken as the target value for the angle
     * associated with the specified atoms, expressed in degrees.
     * @return ValueAngle
     */
    public ValueAngle getValueAngle() {
        return (ValueAngle) (isText ? textFields.computeIfAbsent("value_angle",
                ValueAngle::new) : getBinaryColumn("value_angle"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _chem_comp_angle.value_angle.
     * @return ValueAngleEsd
     */
    public ValueAngleEsd getValueAngleEsd() {
        return (ValueAngleEsd) (isText ? textFields.computeIfAbsent("value_angle_esd",
                ValueAngleEsd::new) : getBinaryColumn("value_angle_esd"));
    }

    /**
     * The value that should be taken as the target value for the angle
     * associated with the specified atoms, expressed as the distance
     * between the atoms specified by _chem_comp_angle.atom_id_1 and
     * _chem_comp_angle.atom_id_3.
     * @return ValueDist
     */
    public ValueDist getValueDist() {
        return (ValueDist) (isText ? textFields.computeIfAbsent("value_dist",
                ValueDist::new) : getBinaryColumn("value_dist"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _chem_comp_angle.value_dist.
     * @return ValueDistEsd
     */
    public ValueDistEsd getValueDistEsd() {
        return (ValueDistEsd) (isText ? textFields.computeIfAbsent("value_dist_esd",
                ValueDistEsd::new) : getBinaryColumn("value_dist_esd"));
    }
}
