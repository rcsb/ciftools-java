package org.rcsb.cif.schema.generated.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the DIFFRN_ORIENT_MATRIX category record details
 * about the orientation matrix used in the measurement of the
 * diffraction data.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class DiffrnOrientMatrix extends DelegatingCategory {
    public DiffrnOrientMatrix(Category delegate) {
        super(delegate);
    }

    /**
     * This data item is a pointer to _diffrn.id in the DIFFRN
     * category.
     * @return StrColumn
     */
    public StrColumn getDiffrnId() {
        return delegate.getColumn("diffrn_id", DelegatingStrColumn::new);
    }

    /**
     * A description of the orientation matrix type and how it should
     * be applied to define the orientation of the crystal precisely
     * with respect to the diffractometer axes.
     * @return StrColumn
     */
    public StrColumn getType() {
        return delegate.getColumn("type", DelegatingStrColumn::new);
    }

    /**
     * The elements of the 3x3 matrix that defines the dimensions
     * of the reciprocal cell and its orientation with respect to the
     * local diffractometer axes. See also _diffrn_orient_matrix.type.
     * @return FloatColumn
     */
    public FloatColumn getUB11() {
        return delegate.getColumn("UB[1][1]", DelegatingFloatColumn::new);
    }

    /**
     * The elements of the 3x3 matrix that defines the dimensions
     * of the reciprocal cell and its orientation with respect to the
     * local diffractometer axes. See also _diffrn_orient_matrix.type.
     * @return FloatColumn
     */
    public FloatColumn getUB12() {
        return delegate.getColumn("UB[1][2]", DelegatingFloatColumn::new);
    }

    /**
     * The elements of the 3x3 matrix that defines the dimensions
     * of the reciprocal cell and its orientation with respect to the
     * local diffractometer axes. See also _diffrn_orient_matrix.type.
     * @return FloatColumn
     */
    public FloatColumn getUB13() {
        return delegate.getColumn("UB[1][3]", DelegatingFloatColumn::new);
    }

    /**
     * The elements of the 3x3 matrix that defines the dimensions
     * of the reciprocal cell and its orientation with respect to the
     * local diffractometer axes. See also _diffrn_orient_matrix.type.
     * @return FloatColumn
     */
    public FloatColumn getUB21() {
        return delegate.getColumn("UB[2][1]", DelegatingFloatColumn::new);
    }

    /**
     * The elements of the 3x3 matrix that defines the dimensions
     * of the reciprocal cell and its orientation with respect to the
     * local diffractometer axes. See also _diffrn_orient_matrix.type.
     * @return FloatColumn
     */
    public FloatColumn getUB22() {
        return delegate.getColumn("UB[2][2]", DelegatingFloatColumn::new);
    }

    /**
     * The elements of the 3x3 matrix that defines the dimensions
     * of the reciprocal cell and its orientation with respect to the
     * local diffractometer axes. See also _diffrn_orient_matrix.type.
     * @return FloatColumn
     */
    public FloatColumn getUB23() {
        return delegate.getColumn("UB[2][3]", DelegatingFloatColumn::new);
    }

    /**
     * The elements of the 3x3 matrix that defines the dimensions
     * of the reciprocal cell and its orientation with respect to the
     * local diffractometer axes. See also _diffrn_orient_matrix.type.
     * @return FloatColumn
     */
    public FloatColumn getUB31() {
        return delegate.getColumn("UB[3][1]", DelegatingFloatColumn::new);
    }

    /**
     * The elements of the 3x3 matrix that defines the dimensions
     * of the reciprocal cell and its orientation with respect to the
     * local diffractometer axes. See also _diffrn_orient_matrix.type.
     * @return FloatColumn
     */
    public FloatColumn getUB32() {
        return delegate.getColumn("UB[3][2]", DelegatingFloatColumn::new);
    }

    /**
     * The elements of the 3x3 matrix that defines the dimensions
     * of the reciprocal cell and its orientation with respect to the
     * local  diffractometer axes. See also _diffrn_orient_matrix.type.
     * @return FloatColumn
     */
    public FloatColumn getUB33() {
        return delegate.getColumn("UB[3][3]", DelegatingFloatColumn::new);
    }
}
