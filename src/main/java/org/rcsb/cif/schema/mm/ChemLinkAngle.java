package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the CHEM_LINK_ANGLE category record details
 * about angles in a link between chemical components.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class ChemLinkAngle extends DelegatingCategory {
    public ChemLinkAngle(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "atom_1_comp_id":
                return getAtom1CompId();
            case "atom_2_comp_id":
                return getAtom2CompId();
            case "atom_3_comp_id":
                return getAtom3CompId();
            case "atom_id_1":
                return getAtomId1();
            case "atom_id_2":
                return getAtomId2();
            case "atom_id_3":
                return getAtomId3();
            case "link_id":
                return getLinkId();
            case "value_angle":
                return getValueAngle();
            case "value_angle_esd":
                return getValueAngleEsd();
            case "value_dist":
                return getValueDist();
            case "value_dist_esd":
                return getValueDistEsd();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * This data item indicates whether atom 1 is found in the first
     * or the second of the two components connected by the link.
     * @return StrColumn
     */
    public StrColumn getAtom1CompId() {
        return delegate.getColumn("atom_1_comp_id", DelegatingStrColumn::new);
    }

    /**
     * This data item indicates whether atom 2 is found in the first
     * or the second of the two components connected by the link.
     * @return StrColumn
     */
    public StrColumn getAtom2CompId() {
        return delegate.getColumn("atom_2_comp_id", DelegatingStrColumn::new);
    }

    /**
     * This data item indicates whether atom 3 is found in the first
     * or the second of the two components connected by the link.
     * @return StrColumn
     */
    public StrColumn getAtom3CompId() {
        return delegate.getColumn("atom_3_comp_id", DelegatingStrColumn::new);
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
        return delegate.getColumn("atom_id_1", DelegatingStrColumn::new);
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
        return delegate.getColumn("atom_id_2", DelegatingStrColumn::new);
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
        return delegate.getColumn("atom_id_3", DelegatingStrColumn::new);
    }

    /**
     * This data item is a pointer to _chem_link.id in the CHEM_LINK
     * category.
     * @return StrColumn
     */
    public StrColumn getLinkId() {
        return delegate.getColumn("link_id", DelegatingStrColumn::new);
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
     * of _chem_link_angle.value_angle.
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