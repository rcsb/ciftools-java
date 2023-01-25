package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_DIFFRN_ORIENTATION category record details about
 * a particular crystal orientation.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxDiffrnOrientation extends DelegatingCategory {
    public PdbxDiffrnOrientation(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
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
            case "type":
                return getType();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The value of _pdbx_diffrn_orientation.id must uniquely identify the
     * orientation information associated with reflections in the DIFFRN_REFLN
     * category.
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * The elements of the 3x3 matrix that defines the
     * orientation of the reciprocal cell with respect to the
     * local right-handed coordinate system. See also
     * _pdbx_diffrn_orientation.type.
     * @return FloatColumn
     */
    public FloatColumn getMatrix11() {
        return delegate.getColumn("matrix[1][1]", DelegatingFloatColumn::new);
    }

    /**
     * The elements of the 3x3 matrix that defines the
     * orientation of the reciprocal cell with respect to the
     * local right-handed coordinate system. See also
     * _pdbx_diffrn_orientation.type.
     * @return FloatColumn
     */
    public FloatColumn getMatrix12() {
        return delegate.getColumn("matrix[1][2]", DelegatingFloatColumn::new);
    }

    /**
     * The elements of the 3x3 matrix that defines the
     * orientation of the reciprocal cell with respect to the
     * local right-handed coordinate system. See also
     * _pdbx_diffrn_orientation.type.
     * @return FloatColumn
     */
    public FloatColumn getMatrix13() {
        return delegate.getColumn("matrix[1][3]", DelegatingFloatColumn::new);
    }

    /**
     * The elements of the 3x3 matrix that defines the
     * orientation of the reciprocal cell with respect to the
     * local right-handed coordinate system. See also
     * _pdbx_diffrn_orientation.type.
     * @return FloatColumn
     */
    public FloatColumn getMatrix21() {
        return delegate.getColumn("matrix[2][1]", DelegatingFloatColumn::new);
    }

    /**
     * The elements of the 3x3 matrix that defines the
     * orientation of the reciprocal cell with respect to the
     * local right-handed coordinate system. See also
     * _pdbx_diffrn_orientation.type.
     * @return FloatColumn
     */
    public FloatColumn getMatrix22() {
        return delegate.getColumn("matrix[2][2]", DelegatingFloatColumn::new);
    }

    /**
     * The elements of the 3x3 matrix that defines the
     * orientation of the reciprocal cell with respect to the
     * local right-handed coordinate system. See also
     * _pdbx_diffrn_orientation.type.
     * @return FloatColumn
     */
    public FloatColumn getMatrix23() {
        return delegate.getColumn("matrix[2][3]", DelegatingFloatColumn::new);
    }

    /**
     * The elements of the 3x3 matrix that defines the
     * orientation of the reciprocal cell with respect to the
     * local right-handed coordinate system. See also
     * _pdbx_diffrn_orientation.type.
     * @return FloatColumn
     */
    public FloatColumn getMatrix31() {
        return delegate.getColumn("matrix[3][1]", DelegatingFloatColumn::new);
    }

    /**
     * The elements of the 3x3 matrix that defines the
     * orientation of the reciprocal cell with respect to the
     * local right-handed coordinate system. See also
     * _pdbx_diffrn_orientation.type.
     * @return FloatColumn
     */
    public FloatColumn getMatrix32() {
        return delegate.getColumn("matrix[3][2]", DelegatingFloatColumn::new);
    }

    /**
     * The elements of the 3x3 matrix that defines the
     * orientation of the reciprocal cell with respect to the
     * local right-handed coordinate system. See also
     * _pdbx_diffrn_orientation.type.
     * @return FloatColumn
     */
    public FloatColumn getMatrix33() {
        return delegate.getColumn("matrix[3][3]", DelegatingFloatColumn::new);
    }

    /**
     * A description of the orientation matrix type and how it should
     * be applied to define the orientation of the crystal with respect
     * to the local right-handed coordinate system.
     * @return StrColumn
     */
    public StrColumn getType() {
        return delegate.getColumn("type", DelegatingStrColumn::new);
    }

}