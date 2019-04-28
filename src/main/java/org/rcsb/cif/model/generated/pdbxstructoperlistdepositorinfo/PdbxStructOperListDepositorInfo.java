package org.rcsb.cif.model.generated.pdbxstructoperlistdepositorinfo;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxStructOperListDepositorInfo extends BaseCategory {
    public PdbxStructOperListDepositorInfo(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxStructOperListDepositorInfo(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxStructOperListDepositorInfo(String name) {
        super(name);
    }

    /**
     * This identifier code must uniquely identify a
     * record in the PDBX_STRUCT_OPER_LIST_DEPOSITOR_INFO list.
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }

    /**
     * A code to indicate the type of operator.
     * @return Type
     */
    public Type getType() {
        return (Type) (isText ? textFields.computeIfAbsent("type",
                Type::new) : getBinaryColumn("type"));
    }

    /**
     * A descriptive name for the transformation operation.
     * @return Name
     */
    public Name getName() {
        return (Name) (isText ? textFields.computeIfAbsent("name",
                Name::new) : getBinaryColumn("name"));
    }

    /**
     * The symmetry operation corresponding to the transformation operation.
     * @return SymmetryOperation
     */
    public SymmetryOperation getSymmetryOperation() {
        return (SymmetryOperation) (isText ? textFields.computeIfAbsent("symmetry_operation",
                SymmetryOperation::new) : getBinaryColumn("symmetry_operation"));
    }

    /**
     * The elements of the 3x3 matrix component of the
     * transformation operation.
     * @return Matrix11
     */
    public Matrix11 getMatrix11() {
        return (Matrix11) (isText ? textFields.computeIfAbsent("matrix[1][1]",
                Matrix11::new) : getBinaryColumn("matrix[1][1]"));
    }

    /**
     * The elements of the 3x3 matrix component of the
     * transformation operation.
     * @return Matrix12
     */
    public Matrix12 getMatrix12() {
        return (Matrix12) (isText ? textFields.computeIfAbsent("matrix[1][2]",
                Matrix12::new) : getBinaryColumn("matrix[1][2]"));
    }

    /**
     * The elements of the 3x3 matrix component of the
     * transformation operation.
     * @return Matrix13
     */
    public Matrix13 getMatrix13() {
        return (Matrix13) (isText ? textFields.computeIfAbsent("matrix[1][3]",
                Matrix13::new) : getBinaryColumn("matrix[1][3]"));
    }

    /**
     * The elements of the 3x3 matrix component of the
     * transformation operation.
     * @return Matrix21
     */
    public Matrix21 getMatrix21() {
        return (Matrix21) (isText ? textFields.computeIfAbsent("matrix[2][1]",
                Matrix21::new) : getBinaryColumn("matrix[2][1]"));
    }

    /**
     * The elements of the 3x3 matrix component of the
     * transformation operation.
     * @return Matrix22
     */
    public Matrix22 getMatrix22() {
        return (Matrix22) (isText ? textFields.computeIfAbsent("matrix[2][2]",
                Matrix22::new) : getBinaryColumn("matrix[2][2]"));
    }

    /**
     * The elements of the 3x3 matrix component of the
     * transformation operation.
     * @return Matrix23
     */
    public Matrix23 getMatrix23() {
        return (Matrix23) (isText ? textFields.computeIfAbsent("matrix[2][3]",
                Matrix23::new) : getBinaryColumn("matrix[2][3]"));
    }

    /**
     * The elements of the 3x3 matrix component of the
     * transformation operation.
     * @return Matrix31
     */
    public Matrix31 getMatrix31() {
        return (Matrix31) (isText ? textFields.computeIfAbsent("matrix[3][1]",
                Matrix31::new) : getBinaryColumn("matrix[3][1]"));
    }

    /**
     * The elements of the 3x3 matrix component of the
     * transformation operation.
     * @return Matrix32
     */
    public Matrix32 getMatrix32() {
        return (Matrix32) (isText ? textFields.computeIfAbsent("matrix[3][2]",
                Matrix32::new) : getBinaryColumn("matrix[3][2]"));
    }

    /**
     * The elements of the 3x3 matrix component of the
     * transformation operation.
     * @return Matrix33
     */
    public Matrix33 getMatrix33() {
        return (Matrix33) (isText ? textFields.computeIfAbsent("matrix[3][3]",
                Matrix33::new) : getBinaryColumn("matrix[3][3]"));
    }

    /**
     * The elements of the three-element vector component of the
     * transformation operation.
     * @return Vector1
     */
    public Vector1 getVector1() {
        return (Vector1) (isText ? textFields.computeIfAbsent("vector[1]",
                Vector1::new) : getBinaryColumn("vector[1]"));
    }

    /**
     * The elements of the three-element vector component of the
     * transformation operation.
     * @return Vector2
     */
    public Vector2 getVector2() {
        return (Vector2) (isText ? textFields.computeIfAbsent("vector[2]",
                Vector2::new) : getBinaryColumn("vector[2]"));
    }

    /**
     * The elements of the three-element vector component of the
     * transformation operation.
     * @return Vector3
     */
    public Vector3 getVector3() {
        return (Vector3) (isText ? textFields.computeIfAbsent("vector[3]",
                Vector3::new) : getBinaryColumn("vector[3]"));
    }
}
