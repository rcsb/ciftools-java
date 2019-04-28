package org.rcsb.cif.model.generated.structncsoper;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
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
     * @return Matrix11
     */
    public Matrix11 getMatrix11() {
        return (Matrix11) (isText ? textFields.computeIfAbsent("matrix[1][1]",
                Matrix11::new) : getBinaryColumn("matrix[1][1]"));
    }

    /**
     * The elements of the 3x3 matrix component of a
     * noncrystallographic symmetry operation.
     * @return Matrix12
     */
    public Matrix12 getMatrix12() {
        return (Matrix12) (isText ? textFields.computeIfAbsent("matrix[1][2]",
                Matrix12::new) : getBinaryColumn("matrix[1][2]"));
    }

    /**
     * The elements of the 3x3 matrix component of a
     * noncrystallographic symmetry operation.
     * @return Matrix13
     */
    public Matrix13 getMatrix13() {
        return (Matrix13) (isText ? textFields.computeIfAbsent("matrix[1][3]",
                Matrix13::new) : getBinaryColumn("matrix[1][3]"));
    }

    /**
     * The elements of the 3x3 matrix component of a
     * noncrystallographic symmetry operation.
     * @return Matrix21
     */
    public Matrix21 getMatrix21() {
        return (Matrix21) (isText ? textFields.computeIfAbsent("matrix[2][1]",
                Matrix21::new) : getBinaryColumn("matrix[2][1]"));
    }

    /**
     * The elements of the 3x3 matrix component of a
     * noncrystallographic symmetry operation.
     * @return Matrix22
     */
    public Matrix22 getMatrix22() {
        return (Matrix22) (isText ? textFields.computeIfAbsent("matrix[2][2]",
                Matrix22::new) : getBinaryColumn("matrix[2][2]"));
    }

    /**
     * The elements of the 3x3 matrix component of a
     * noncrystallographic symmetry operation.
     * @return Matrix23
     */
    public Matrix23 getMatrix23() {
        return (Matrix23) (isText ? textFields.computeIfAbsent("matrix[2][3]",
                Matrix23::new) : getBinaryColumn("matrix[2][3]"));
    }

    /**
     * The elements of the 3x3 matrix component of a
     * noncrystallographic symmetry operation.
     * @return Matrix31
     */
    public Matrix31 getMatrix31() {
        return (Matrix31) (isText ? textFields.computeIfAbsent("matrix[3][1]",
                Matrix31::new) : getBinaryColumn("matrix[3][1]"));
    }

    /**
     * The elements of the 3x3 matrix component of a
     * noncrystallographic symmetry operation.
     * @return Matrix32
     */
    public Matrix32 getMatrix32() {
        return (Matrix32) (isText ? textFields.computeIfAbsent("matrix[3][2]",
                Matrix32::new) : getBinaryColumn("matrix[3][2]"));
    }

    /**
     * The elements of the 3x3 matrix component of a
     * noncrystallographic symmetry operation.
     * @return Matrix33
     */
    public Matrix33 getMatrix33() {
        return (Matrix33) (isText ? textFields.computeIfAbsent("matrix[3][3]",
                Matrix33::new) : getBinaryColumn("matrix[3][3]"));
    }

    /**
     * The elements of the three-element vector component of a
     * noncrystallographic symmetry operation.
     * @return Vector1
     */
    public Vector1 getVector1() {
        return (Vector1) (isText ? textFields.computeIfAbsent("vector[1]",
                Vector1::new) : getBinaryColumn("vector[1]"));
    }

    /**
     * The elements of the three-element vector component of a
     * noncrystallographic symmetry operation.
     * @return Vector2
     */
    public Vector2 getVector2() {
        return (Vector2) (isText ? textFields.computeIfAbsent("vector[2]",
                Vector2::new) : getBinaryColumn("vector[2]"));
    }

    /**
     * The elements of the three-element vector component of a
     * noncrystallographic symmetry operation.
     * @return Vector3
     */
    public Vector3 getVector3() {
        return (Vector3) (isText ? textFields.computeIfAbsent("vector[3]",
                Vector3::new) : getBinaryColumn("vector[3]"));
    }
}
