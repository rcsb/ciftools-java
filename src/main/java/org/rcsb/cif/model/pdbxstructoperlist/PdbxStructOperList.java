package org.rcsb.cif.model.pdbxstructoperlist;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.schema.Schema")
public class PdbxStructOperList extends BaseCategory {
    public PdbxStructOperList(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxStructOperList(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxStructOperList(String name) {
        super(name);
    }

    /**
     * This identifier code must uniquely identify a
     * record in the PDBX_STRUCT_OPER_LIST list.
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? getTextColumn("id") : getBinaryColumn("id"));
    }

    /**
     * A code to indicate the type of operator.
     * @return Type
     */
    public Type getType() {
        return (Type) (isText ? getTextColumn("type") : getBinaryColumn("type"));
    }

    /**
     * A descriptive name for the transformation operation.
     * @return Name
     */
    public Name getName() {
        return (Name) (isText ? getTextColumn("name") : getBinaryColumn("name"));
    }

    /**
     * The symmetry operation corresponding to the transformation operation.
     * @return SymmetryOperation
     */
    public SymmetryOperation getSymmetryOperation() {
        return (SymmetryOperation) (isText ? getTextColumn("symmetry_operation") : getBinaryColumn("symmetry_operation"));
    }

    /**
     * The elements of the 3x3 matrix component of the
     * transformation operation.
     * @return Matrix
     */
    public Matrix getMatrix() {
        return (Matrix) (isText ? getTextColumn("matrix") : getBinaryColumn("matrix"));
    }

    /**
     * The elements of the three-element vector component of the
     * transformation operation.
     * @return Vector
     */
    public Vector getVector() {
        return (Vector) (isText ? getTextColumn("vector") : getBinaryColumn("vector"));
    }
}
