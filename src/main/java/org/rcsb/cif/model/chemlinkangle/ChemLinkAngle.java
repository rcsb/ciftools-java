package org.rcsb.cif.model.chemlinkangle;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
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
     * @return Atom1CompId
     */
    public Atom1CompId getAtom1CompId() {
        return (Atom1CompId) (isText ? textFields.computeIfAbsent("atom_1_comp_id",
                Atom1CompId::new) : getBinaryColumn("atom_1_comp_id"));
    }

    /**
     * This data item indicates whether atom 2 is found in the first
     * or the second of the two components connected by the link.
     * @return Atom2CompId
     */
    public Atom2CompId getAtom2CompId() {
        return (Atom2CompId) (isText ? textFields.computeIfAbsent("atom_2_comp_id",
                Atom2CompId::new) : getBinaryColumn("atom_2_comp_id"));
    }

    /**
     * This data item indicates whether atom 3 is found in the first
     * or the second of the two components connected by the link.
     * @return Atom3CompId
     */
    public Atom3CompId getAtom3CompId() {
        return (Atom3CompId) (isText ? textFields.computeIfAbsent("atom_3_comp_id",
                Atom3CompId::new) : getBinaryColumn("atom_3_comp_id"));
    }

    /**
     * The ID of the first of the three atoms that define the angle.
     * 
     * An atom with this ID must exist in the component of the type
     * specified by _chem_comp_link.type_comp_1 (or
     * _chem_comp_link.type_comp_2, where the appropriate data item
     * is indicated by the value of _chem_comp_angle.atom_1_comp_id).
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
     * An atom with this ID must exist in the component of the type
     * specified by _chem_comp_link.type_comp_1 (or
     * _chem_comp_link.type_comp_2, where the appropriate data item
     * is indicated by the value of _chem_comp_angle.atom_2_comp_id).
     * @return AtomId2
     */
    public AtomId2 getAtomId2() {
        return (AtomId2) (isText ? textFields.computeIfAbsent("atom_id_2",
                AtomId2::new) : getBinaryColumn("atom_id_2"));
    }

    /**
     * The ID of the third of the three atoms that define the angle.
     * 
     * An atom with this ID must exist in the component of the type
     * specified by _chem_comp_link.type_comp_1 (or
     * _chem_comp_link.type_comp_2, where the appropriate data item
     * is indicated by the value of _chem_comp_angle.atom_3_comp_id).
     * @return AtomId3
     */
    public AtomId3 getAtomId3() {
        return (AtomId3) (isText ? textFields.computeIfAbsent("atom_id_3",
                AtomId3::new) : getBinaryColumn("atom_id_3"));
    }

    /**
     * This data item is a pointer to _chem_link.id in the CHEM_LINK
     * category.
     * @return LinkId
     */
    public LinkId getLinkId() {
        return (LinkId) (isText ? textFields.computeIfAbsent("link_id",
                LinkId::new) : getBinaryColumn("link_id"));
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
     * of _chem_link_angle.value_angle.
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
