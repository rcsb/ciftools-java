package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Contains information about the symmetry operations of the
 * space group.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class SpaceGroupSymop extends DelegatingCategory {
    public SpaceGroupSymop(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "id":
                return getId();
            case "operation_xyz":
                return getOperationXyz();
            case "sg_id":
                return getSgId();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * An arbitrary identifier that uniquely labels each symmetry
     * operation in the list.
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * A parsable string giving one of the symmetry operations of the
     * space group in algebraic form.  If W is a matrix representation
     * of the rotational part of the symmetry operation defined by the
     * positions and signs of x, y and z, and w is a column of
     * translations defined by the fractions, an equivalent position
     * X' is generated from a given position X by the equation
     * 
     * X' = WX + w
     * 
     * (Note: X is used to represent bold_italics_x in International
     * Tables for Crystallography Vol. A, Part 5)
     * 
     * When a list of symmetry operations is given, it must contain
     * a complete set of coordinate representatives which generates
     * all the operations of the space group by the addition of
     * all primitive translations of the space group. Such
     * representatives are to be found as the coordinates of
     * the general-equivalent position in International Tables for
     * Crystallography Vol. A (2002), to which it is necessary to
     * add any centring translations shown above the
     * general-equivalent position.
     * 
     * That is to say, it is necessary to list explicity all the
     * symmetry operations required to generate all the atoms in
     * the unit cell defined by the setting used.
     * @return StrColumn
     */
    public StrColumn getOperationXyz() {
        return delegate.getColumn("operation_xyz", DelegatingStrColumn::new);
    }

    /**
     * This must match a particular value of _space_group.id, allowing
     * the symmetry operation to be identified with a particular space
     * group.
     * @return StrColumn
     */
    public StrColumn getSgId() {
        return delegate.getColumn("sg_id", DelegatingStrColumn::new);
    }

}