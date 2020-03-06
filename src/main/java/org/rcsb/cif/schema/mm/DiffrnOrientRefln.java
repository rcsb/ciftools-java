package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the DIFFRN_ORIENT_REFLN category record details
 * about the reflections that define the orientation matrix used in
 * the measurement of the diffraction intensities.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class DiffrnOrientRefln extends DelegatingCategory {
    public DiffrnOrientRefln(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "angle_chi":
                return getAngleChi();
            case "angle_kappa":
                return getAngleKappa();
            case "angle_omega":
                return getAngleOmega();
            case "angle_phi":
                return getAnglePhi();
            case "angle_psi":
                return getAnglePsi();
            case "angle_theta":
                return getAngleTheta();
            case "diffrn_id":
                return getDiffrnId();
            case "index_h":
                return getIndexH();
            case "index_k":
                return getIndexK();
            case "index_l":
                return getIndexL();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * Diffractometer angle chi of a reflection used to
     * define the orientation matrix in degrees. See
     * _diffrn_orient_matrix.UB[][] and the Miller indices
     * in the DIFFRN_ORIENT_REFLN category.
     * @return FloatColumn
     */
    public FloatColumn getAngleChi() {
        return delegate.getColumn("angle_chi", DelegatingFloatColumn::new);
    }

    /**
     * Diffractometer angle kappa of a reflection used to
     * define the orientation matrix in degrees. See
     * _diffrn_orient_matrix.UB[][] and the Miller indices
     * in the DIFFRN_ORIENT_REFLN category.
     * @return FloatColumn
     */
    public FloatColumn getAngleKappa() {
        return delegate.getColumn("angle_kappa", DelegatingFloatColumn::new);
    }

    /**
     * Diffractometer angle omega of a reflection used to
     * define the orientation matrix in degrees. See
     * _diffrn_orient_matrix.UB[][] and the Miller indices in
     * the DIFFRN_ORIENT_REFLN category.
     * @return FloatColumn
     */
    public FloatColumn getAngleOmega() {
        return delegate.getColumn("angle_omega", DelegatingFloatColumn::new);
    }

    /**
     * Diffractometer angle phi of a reflection used to
     * define the orientation matrix in degrees. See
     * _diffrn_orient_matrix.UB[][] and the Miller indices
     * in the DIFFRN_ORIENT_REFLN category.
     * @return FloatColumn
     */
    public FloatColumn getAnglePhi() {
        return delegate.getColumn("angle_phi", DelegatingFloatColumn::new);
    }

    /**
     * Diffractometer angle psi of a reflection used to
     * define the orientation matrix in degrees. See
     * _diffrn_orient_matrix.UB[][] and the Miller indices
     * in the DIFFRN_ORIENT_REFLN category.
     * @return FloatColumn
     */
    public FloatColumn getAnglePsi() {
        return delegate.getColumn("angle_psi", DelegatingFloatColumn::new);
    }

    /**
     * Diffractometer angle theta of a reflection used to
     * define the orientation matrix in degrees. See
     * _diffrn_orient_matrix.UB[][] and the Miller indices
     * in the DIFFRN_ORIENT_REFLN category.
     * @return FloatColumn
     */
    public FloatColumn getAngleTheta() {
        return delegate.getColumn("angle_theta", DelegatingFloatColumn::new);
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
     * Miller index h of a reflection used to define the orientation
     * matrix.
     * @return IntColumn
     */
    public IntColumn getIndexH() {
        return delegate.getColumn("index_h", DelegatingIntColumn::new);
    }

    /**
     * Miller index k of a reflection used to define the orientation
     * matrix.
     * @return IntColumn
     */
    public IntColumn getIndexK() {
        return delegate.getColumn("index_k", DelegatingIntColumn::new);
    }

    /**
     * Miller index l of a reflection used to define the orientation
     * matrix.
     * @return IntColumn
     */
    public IntColumn getIndexL() {
        return delegate.getColumn("index_l", DelegatingIntColumn::new);
    }

}