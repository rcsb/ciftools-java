package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the STRUCT_NCS_OPER category describe the
 * noncrystallographic symmetry operations.
 * 
 * Each operator is specified as a matrix and a subsequent
 * translation vector. Operators need not represent proper
 * rotations.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class StructNcsOper extends DelegatingCategory {
    public StructNcsOper(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "code":
                return getCode();
            case "details":
                return getDetails();
            case "id":
                return getId();
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
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * A code to indicate whether this operator describes a
     * relationship between coordinates all of which are given in the
     * data block (in which case the value of code is 'given'), or
     * whether the operator is used to generate new coordinates from
     * those that are given in the data block (in which case the value
     * of code is 'generate').
     * @return StrColumn
     */
    public StrColumn getCode() {
        return delegate.getColumn("code", DelegatingStrColumn::new);
    }

    /**
     * A description of special aspects of the noncrystallographic
     * symmetry operator.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

    /**
     * The value of _struct_ncs_oper.id must uniquely identify a
     * record in the STRUCT_NCS_OPER list.
     * 
     * Note that for PDB _struct_ncs_oper.id must be a number.
     * @return IntColumn
     */
    public IntColumn getId() {
        return delegate.getColumn("id", DelegatingIntColumn::new);
    }

    /**
     * The elements of the 3x3 matrix component of a
     * noncrystallographic symmetry operation.
     * @return FloatColumn
     */
    public FloatColumn getMatrix11() {
        return delegate.getColumn("matrix[1][1]", DelegatingFloatColumn::new);
    }

    /**
     * The elements of the 3x3 matrix component of a
     * noncrystallographic symmetry operation.
     * @return FloatColumn
     */
    public FloatColumn getMatrix12() {
        return delegate.getColumn("matrix[1][2]", DelegatingFloatColumn::new);
    }

    /**
     * The elements of the 3x3 matrix component of a
     * noncrystallographic symmetry operation.
     * @return FloatColumn
     */
    public FloatColumn getMatrix13() {
        return delegate.getColumn("matrix[1][3]", DelegatingFloatColumn::new);
    }

    /**
     * The elements of the 3x3 matrix component of a
     * noncrystallographic symmetry operation.
     * @return FloatColumn
     */
    public FloatColumn getMatrix21() {
        return delegate.getColumn("matrix[2][1]", DelegatingFloatColumn::new);
    }

    /**
     * The elements of the 3x3 matrix component of a
     * noncrystallographic symmetry operation.
     * @return FloatColumn
     */
    public FloatColumn getMatrix22() {
        return delegate.getColumn("matrix[2][2]", DelegatingFloatColumn::new);
    }

    /**
     * The elements of the 3x3 matrix component of a
     * noncrystallographic symmetry operation.
     * @return FloatColumn
     */
    public FloatColumn getMatrix23() {
        return delegate.getColumn("matrix[2][3]", DelegatingFloatColumn::new);
    }

    /**
     * The elements of the 3x3 matrix component of a
     * noncrystallographic symmetry operation.
     * @return FloatColumn
     */
    public FloatColumn getMatrix31() {
        return delegate.getColumn("matrix[3][1]", DelegatingFloatColumn::new);
    }

    /**
     * The elements of the 3x3 matrix component of a
     * noncrystallographic symmetry operation.
     * @return FloatColumn
     */
    public FloatColumn getMatrix32() {
        return delegate.getColumn("matrix[3][2]", DelegatingFloatColumn::new);
    }

    /**
     * The elements of the 3x3 matrix component of a
     * noncrystallographic symmetry operation.
     * @return FloatColumn
     */
    public FloatColumn getMatrix33() {
        return delegate.getColumn("matrix[3][3]", DelegatingFloatColumn::new);
    }

    /**
     * The elements of the three-element vector component of a
     * noncrystallographic symmetry operation.
     * @return FloatColumn
     */
    public FloatColumn getVector1() {
        return delegate.getColumn("vector[1]", DelegatingFloatColumn::new);
    }

    /**
     * The elements of the three-element vector component of a
     * noncrystallographic symmetry operation.
     * @return FloatColumn
     */
    public FloatColumn getVector2() {
        return delegate.getColumn("vector[2]", DelegatingFloatColumn::new);
    }

    /**
     * The elements of the three-element vector component of a
     * noncrystallographic symmetry operation.
     * @return FloatColumn
     */
    public FloatColumn getVector3() {
        return delegate.getColumn("vector[3]", DelegatingFloatColumn::new);
    }

}