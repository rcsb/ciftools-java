package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_STRUCT_OPER_LIST category describe
 * Cartesian rotation and translation operations required to
 * generate or transform the coordinates deposited with this entry.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxStructOperList extends DelegatingCategory {
    public PdbxStructOperList(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "id":
                return getId();
            case "type":
                return getType();
            case "name":
                return getName();
            case "symmetry_operation":
                return getSymmetryOperation();
            case "matrix[1][1]":
                return getMatrix11();
            case "matrix[1][2]":
                return getMatrix12();
            case "matrix[1][3]":
                return getMatrix13();
            case "matrix[2][1]":
                return getMatrix21();
            case "matrix[2][2]":
                return getMatrix22();
            case "matrix[2][3]":
                return getMatrix23();
            case "matrix[3][1]":
                return getMatrix31();
            case "matrix[3][2]":
                return getMatrix32();
            case "matrix[3][3]":
                return getMatrix33();
            case "vector[1]":
                return getVector1();
            case "vector[2]":
                return getVector2();
            case "vector[3]":
                return getVector3();
            case "full_matrix":
                return getFullMatrix();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * This identifier code must uniquely identify a
     * record in the PDBX_STRUCT_OPER_LIST list.
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * A code to indicate the type of operator.
     * @return StrColumn
     */
    public StrColumn getType() {
        return delegate.getColumn("type", DelegatingStrColumn::new);
    }

    /**
     * A descriptive name for the transformation operation.
     * @return StrColumn
     */
    public StrColumn getName() {
        return delegate.getColumn("name", DelegatingStrColumn::new);
    }

    /**
     * The symmetry operation corresponding to the transformation operation.
     * @return StrColumn
     */
    public StrColumn getSymmetryOperation() {
        return delegate.getColumn("symmetry_operation", DelegatingStrColumn::new);
    }

    /**
     * The elements of the 3x3 matrix component of the
     * transformation operation.
     * @return FloatColumn
     */
    public FloatColumn getMatrix11() {
        return delegate.getColumn("matrix[1][1]", DelegatingFloatColumn::new);
    }

    /**
     * The elements of the 3x3 matrix component of the
     * transformation operation.
     * @return FloatColumn
     */
    public FloatColumn getMatrix12() {
        return delegate.getColumn("matrix[1][2]", DelegatingFloatColumn::new);
    }

    /**
     * The elements of the 3x3 matrix component of the
     * transformation operation.
     * @return FloatColumn
     */
    public FloatColumn getMatrix13() {
        return delegate.getColumn("matrix[1][3]", DelegatingFloatColumn::new);
    }

    /**
     * The elements of the 3x3 matrix component of the
     * transformation operation.
     * @return FloatColumn
     */
    public FloatColumn getMatrix21() {
        return delegate.getColumn("matrix[2][1]", DelegatingFloatColumn::new);
    }

    /**
     * The elements of the 3x3 matrix component of the
     * transformation operation.
     * @return FloatColumn
     */
    public FloatColumn getMatrix22() {
        return delegate.getColumn("matrix[2][2]", DelegatingFloatColumn::new);
    }

    /**
     * The elements of the 3x3 matrix component of the
     * transformation operation.
     * @return FloatColumn
     */
    public FloatColumn getMatrix23() {
        return delegate.getColumn("matrix[2][3]", DelegatingFloatColumn::new);
    }

    /**
     * The elements of the 3x3 matrix component of the
     * transformation operation.
     * @return FloatColumn
     */
    public FloatColumn getMatrix31() {
        return delegate.getColumn("matrix[3][1]", DelegatingFloatColumn::new);
    }

    /**
     * The elements of the 3x3 matrix component of the
     * transformation operation.
     * @return FloatColumn
     */
    public FloatColumn getMatrix32() {
        return delegate.getColumn("matrix[3][2]", DelegatingFloatColumn::new);
    }

    /**
     * The elements of the 3x3 matrix component of the
     * transformation operation.
     * @return FloatColumn
     */
    public FloatColumn getMatrix33() {
        return delegate.getColumn("matrix[3][3]", DelegatingFloatColumn::new);
    }

    /**
     * The elements of the three-element vector component of the
     * transformation operation.
     * @return FloatColumn
     */
    public FloatColumn getVector1() {
        return delegate.getColumn("vector[1]", DelegatingFloatColumn::new);
    }

    /**
     * The elements of the three-element vector component of the
     * transformation operation.
     * @return FloatColumn
     */
    public FloatColumn getVector2() {
        return delegate.getColumn("vector[2]", DelegatingFloatColumn::new);
    }

    /**
     * The elements of the three-element vector component of the
     * transformation operation.
     * @return FloatColumn
     */
    public FloatColumn getVector3() {
        return delegate.getColumn("vector[3]", DelegatingFloatColumn::new);
    }

    /**
     * Transformation matrix as provided by depositor
     * @return StrColumn
     */
    public StrColumn getFullMatrix() {
        return delegate.getColumn("full_matrix", DelegatingStrColumn::new);
    }

}