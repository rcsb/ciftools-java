package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the CHEM_LINK_TOR_VALUE category record details
 * about the target values for the torsion angles enumerated in the
 * CHEM_LINK_TOR list. Target values may be specified as angles
 * in degrees, as a distance between the first and fourth atoms, or
 * both.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class ChemLinkTorValue extends DelegatingCategory {
    public ChemLinkTorValue(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "tor_id":
                return getTorId();
            case "angle":
                return getAngle();
            case "angle_esd":
                return getAngleEsd();
            case "dist":
                return getDist();
            case "dist_esd":
                return getDistEsd();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * This data item is a pointer to _chem_link_tor.id in the
     * CHEM_LINK_TOR category.
     * @return StrColumn
     */
    public StrColumn getTorId() {
        return delegate.getColumn("tor_id", DelegatingStrColumn::new);
    }

    /**
     * A value that should be taken as a potential target value for the
     * torsion angle associated with the specified atoms, expressed in
     * degrees.
     * @return FloatColumn
     */
    public FloatColumn getAngle() {
        return delegate.getColumn("angle", DelegatingFloatColumn::new);
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _chem_link_tor_value.angle.
     * @return FloatColumn
     */
    public FloatColumn getAngleEsd() {
        return delegate.getColumn("angle_esd", DelegatingFloatColumn::new);
    }

    /**
     * A value that should be taken as a potential target value for the
     * torsion angle associated with the specified atoms, expressed as
     * the distance between the atoms specified by
     * _chem_link_tor.atom_id_1 and _chem_link_tor.atom_id_4 in the
     * referenced record in the CHEM_LINK_TOR list. Note that the
     * torsion angle cannot be fully specified by a distance (for
     * instance, a torsion angle of -60 degree will yield the same
     * distance as a 60 degree angle). However, the distance
     * specification can be useful for refinement in situations in
     * which the angle is already close to the desired value.
     * @return FloatColumn
     */
    public FloatColumn getDist() {
        return delegate.getColumn("dist", DelegatingFloatColumn::new);
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _chem_link_tor_value.dist.
     * @return FloatColumn
     */
    public FloatColumn getDistEsd() {
        return delegate.getColumn("dist_esd", DelegatingFloatColumn::new);
    }

}