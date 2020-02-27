package org.rcsb.cif.schema.generated.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the CHEM_COMP_ANGLE category record details about
 * angles in a chemical component. Angles are designated by three
 * atoms, with the second atom forming the vertex of the angle.
 * Target values may be specified as angles in degrees, as a
 * distance between the first and third atoms, or both.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class ChemCompAngle extends DelegatingCategory {
    public ChemCompAngle(Category delegate) {
        super(delegate);
    }

    /**
     * The ID of the first of the three atoms that define the angle.
     * 
     * This data item is a pointer to _chem_comp_atom.atom_id in the
     * CHEM_COMP_ATOM category.
     * @return StrColumn
     */
    public StrColumn getAtomId1() {
        return delegate.getColumn("atom_id_1", DelegatingStrColumn::new);
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
        return delegate.getColumn("atom_id_2", DelegatingStrColumn::new);
    }

    /**
     * The ID of the third of the three atoms that define the angle.
     * 
     * This data item is a pointer to _chem_comp_atom.atom_id in the
     * CHEM_COMP_ATOM category.
     * @return StrColumn
     */
    public StrColumn getAtomId3() {
        return delegate.getColumn("atom_id_3", DelegatingStrColumn::new);
    }

    /**
     * This data item is a pointer to _chem_comp.id in the CHEM_COMP
     * category.
     * @return StrColumn
     */
    public StrColumn getCompId() {
        return delegate.getColumn("comp_id", DelegatingStrColumn::new);
    }

    /**
     * The value that should be taken as the target value for the angle
     * associated with the specified atoms, expressed in degrees.
     * @return FloatColumn
     */
    public FloatColumn getValueAngle() {
        return delegate.getColumn("value_angle", DelegatingFloatColumn::new);
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _chem_comp_angle.value_angle.
     * @return FloatColumn
     */
    public FloatColumn getValueAngleEsd() {
        return delegate.getColumn("value_angle_esd", DelegatingFloatColumn::new);
    }

    /**
     * The value that should be taken as the target value for the angle
     * associated with the specified atoms, expressed as the distance
     * between the atoms specified by _chem_comp_angle.atom_id_1 and
     * _chem_comp_angle.atom_id_3.
     * @return FloatColumn
     */
    public FloatColumn getValueDist() {
        return delegate.getColumn("value_dist", DelegatingFloatColumn::new);
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _chem_comp_angle.value_dist.
     * @return FloatColumn
     */
    public FloatColumn getValueDistEsd() {
        return delegate.getColumn("value_dist_esd", DelegatingFloatColumn::new);
    }
}
