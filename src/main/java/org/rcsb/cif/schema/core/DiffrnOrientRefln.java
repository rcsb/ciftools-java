package org.rcsb.cif.schema.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * The CATEGORY of data items which specify the reflections used to
 * calculate the matrix which gives the orientation of the crystal
 * axes to the diffractometer goniometer.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class DiffrnOrientRefln extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "diffrn_orient_refln";

    public DiffrnOrientRefln(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
    }

    /**
     * Diffractometer angle of a reflection measured at the centre of the
     * diffraction peak and used to determine _diffrn_orient_matrix.UBIJ.
     * @return FloatColumn
     */
    public FloatColumn getAngleChi() {
        return new DelegatingFloatColumn(parentBlock.getColumn("diffrn_orient_refln_angle_chi"));
    }

    /**
     * Standard uncertainty of _diffrn_orient_refln.angle_chi.
     * @return FloatColumn
     */
    public FloatColumn getAngleChiSu() {
        return new DelegatingFloatColumn(parentBlock.getColumn("diffrn_orient_refln_angle_chi_su"));
    }

    /**
     * Diffractometer angle of a reflection measured at the centre of the
     * diffraction peak and used to determine _diffrn_orient_matrix.UBIJ.
     * @return FloatColumn
     */
    public FloatColumn getAngleKappa() {
        return new DelegatingFloatColumn(parentBlock.getColumn("diffrn_orient_refln_angle_kappa"));
    }

    /**
     * Standard uncertainty of _diffrn_orient_refln.angle_kappa.
     * @return FloatColumn
     */
    public FloatColumn getAngleKappaSu() {
        return new DelegatingFloatColumn(parentBlock.getColumn("diffrn_orient_refln_angle_kappa_su"));
    }

    /**
     * Diffractometer angle of a reflection measured at the centre of the
     * diffraction peak and used to determine _diffrn_orient_matrix.UBIJ.
     * @return FloatColumn
     */
    public FloatColumn getAngleOmega() {
        return new DelegatingFloatColumn(parentBlock.getColumn("diffrn_orient_refln_angle_omega"));
    }

    /**
     * Standard uncertainty of _diffrn_orient_refln.angle_omega.
     * @return FloatColumn
     */
    public FloatColumn getAngleOmegaSu() {
        return new DelegatingFloatColumn(parentBlock.getColumn("diffrn_orient_refln_angle_omega_su"));
    }

    /**
     * Diffractometer angle of a reflection measured at the centre of the
     * diffraction peak and used to determine _diffrn_orient_matrix.UBIJ.
     * @return FloatColumn
     */
    public FloatColumn getAnglePhi() {
        return new DelegatingFloatColumn(parentBlock.getColumn("diffrn_orient_refln_angle_phi"));
    }

    /**
     * Standard uncertainty of _diffrn_orient_refln.angle_phi.
     * @return FloatColumn
     */
    public FloatColumn getAnglePhiSu() {
        return new DelegatingFloatColumn(parentBlock.getColumn("diffrn_orient_refln_angle_phi_su"));
    }

    /**
     * Diffractometer angle of a reflection measured at the centre of the
     * diffraction peak and used to determine _diffrn_orient_matrix.UBIJ.
     * @return FloatColumn
     */
    public FloatColumn getAnglePsi() {
        return new DelegatingFloatColumn(parentBlock.getColumn("diffrn_orient_refln_angle_psi"));
    }

    /**
     * Standard uncertainty of _diffrn_orient_refln.angle_psi.
     * @return FloatColumn
     */
    public FloatColumn getAnglePsiSu() {
        return new DelegatingFloatColumn(parentBlock.getColumn("diffrn_orient_refln_angle_psi_su"));
    }

    /**
     * Diffractometer angle of a reflection measured at the centre of the
     * diffraction peak and used to determine _diffrn_orient_matrix.UBIJ.
     * @return FloatColumn
     */
    public FloatColumn getAngleTheta() {
        return new DelegatingFloatColumn(parentBlock.getColumn("diffrn_orient_refln_angle_theta"));
    }

    /**
     * Standard uncertainty of _diffrn_orient_refln.angle_theta.
     * @return FloatColumn
     */
    public FloatColumn getAngleThetaSu() {
        return new DelegatingFloatColumn(parentBlock.getColumn("diffrn_orient_refln_angle_theta_su"));
    }

    /**
     * Miller indices of a reflection used to define the orientation matrix.
     * @return IntColumn
     */
    public IntColumn getHkl() {
        return new DelegatingIntColumn(parentBlock.getColumn("diffrn_orient_refln_hkl"));
    }

    /**
     * The index of a reciprocal space vector.
     * @return IntColumn
     */
    public IntColumn getIndexH() {
        return new DelegatingIntColumn(parentBlock.getColumn("diffrn_orient_refln_index_h"));
    }

    /**
     * The index of a reciprocal space vector.
     * @return IntColumn
     */
    public IntColumn getIndexK() {
        return new DelegatingIntColumn(parentBlock.getColumn("diffrn_orient_refln_index_k"));
    }

    /**
     * The index of a reciprocal space vector.
     * @return IntColumn
     */
    public IntColumn getIndexL() {
        return new DelegatingIntColumn(parentBlock.getColumn("diffrn_orient_refln_index_l"));
    }

}