package org.rcsb.cif.schema.generated.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_STRUCT_OPER_LIST_DEPOSITOR_INFO category capture
 * depositor provided information related to the archival cateogory
 * PDBX_STRUCT_OPER_LIST.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxStructOperListDepositorInfo extends DelegatingCategory {
    public PdbxStructOperListDepositorInfo(Category delegate) {
        super(delegate);
    }

    /**
     * This identifier code must uniquely identify a
     * record in the PDBX_STRUCT_OPER_LIST_DEPOSITOR_INFO list.
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
}
