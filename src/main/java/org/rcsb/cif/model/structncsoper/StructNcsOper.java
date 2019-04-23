package org.rcsb.cif.model.structncsoper;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class StructNcsOper extends BaseCategory {
    public StructNcsOper(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public StructNcsOper(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public StructNcsOper(String name) {
        super(name);
    }

    /**
     * A code to indicate whether this operator describes a
     * relationship between coordinates all of which are given in the
     * data block (in which case the value of code is 'given'), or
     * whether the operator is used to generate new coordinates from
     * those that are given in the data block (in which case the value
     * of code is 'generate').
     * @return Code
     */
    public Code getCode() {
        return (Code) (isText ? textFields.computeIfAbsent("code",
                Code::new) : getBinaryColumn("code"));
    }

    /**
     * A description of special aspects of the noncrystallographic
     * symmetry operator.
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
    }

    /**
     * The value of _struct_ncs_oper.id must uniquely identify a
     * record in the STRUCT_NCS_OPER list.
     * 
     * Note that this item need not be a number; it can be any unique
     * identifier.
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }

    /**
     * The elements of the 3x3 matrix component of a
     * noncrystallographic symmetry operation.
     * @return Matrix
     */
    public Matrix getMatrix() {
        return (Matrix) (isText ? textFields.computeIfAbsent("matrix",
                Matrix::new) : getBinaryColumn("matrix"));
    }

    /**
     * The elements of the three-element vector component of a
     * noncrystallographic symmetry operation.
     * @return Vector
     */
    public Vector getVector() {
        return (Vector) (isText ? textFields.computeIfAbsent("vector",
                Vector::new) : getBinaryColumn("vector"));
    }
}
