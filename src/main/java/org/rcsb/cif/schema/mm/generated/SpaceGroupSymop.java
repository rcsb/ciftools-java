package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Contains information about the symmetry operations of the
 * space group.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class SpaceGroupSymop extends BaseCategory {
    public SpaceGroupSymop(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public SpaceGroupSymop(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public SpaceGroupSymop(String name) {
        super(name);
    }

    /**
     * An arbitrary identifier that uniquely labels each symmetry
     * operation in the list.
     * @return StrColumn
     */
    public StrColumn getId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("id", StrColumn::new) :
                getBinaryColumn("id"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("operation_xyz", StrColumn::new) :
                getBinaryColumn("operation_xyz"));
    }

    /**
     * This must match a particular value of _space_group.id, allowing
     * the symmetry operation to be identified with a particular space
     * group.
     * @return StrColumn
     */
    public StrColumn getSgId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("sg_id", StrColumn::new) :
                getBinaryColumn("sg_id"));
    }
}
