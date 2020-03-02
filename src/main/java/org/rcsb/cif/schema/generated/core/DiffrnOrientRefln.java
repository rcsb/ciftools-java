package org.rcsb.cif.schema.generated.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * 
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
     * 
     * Diffractometer angle of a reflection measured at the centre of the
     * diffraction peak and used to determine _diffrn_orient_matrix.UBIJ.
     * @return StrColumn
     */
    public StrColumn getAngleChi() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_angle_chi"));
    }

    /**
     * 
     * Diffractometer angle of a reflection measured at the centre of the
     * diffraction peak and used to determine _diffrn_orient_matrix.UBIJ.
     * @return StrColumn
     */
    public StrColumn getAngleKappa() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_angle_kappa"));
    }

    /**
     * 
     * Diffractometer angle of a reflection measured at the centre of the
     * diffraction peak and used to determine _diffrn_orient_matrix.UBIJ.
     * @return StrColumn
     */
    public StrColumn getAngleOmega() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_angle_omega"));
    }

    /**
     * 
     * Diffractometer angle of a reflection measured at the centre of the
     * diffraction peak and used to determine _diffrn_orient_matrix.UBIJ.
     * @return StrColumn
     */
    public StrColumn getAnglePhi() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_angle_phi"));
    }

    /**
     * 
     * Diffractometer angle of a reflection measured at the centre of the
     * diffraction peak and used to determine _diffrn_orient_matrix.UBIJ.
     * @return StrColumn
     */
    public StrColumn getAnglePsi() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_angle_psi"));
    }

    /**
     * 
     * Diffractometer angle of a reflection measured at the centre of the
     * diffraction peak and used to determine _diffrn_orient_matrix.UBIJ.
     * @return StrColumn
     */
    public StrColumn getAngleTheta() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_angle_theta"));
    }

    /**
     * 
     * Miller indices of a reflection used to define the orientation matrix.
     * @return StrColumn
     */
    public StrColumn getHkl() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_hkl"));
    }

    /**
     * 
     * The index of a reciprocal space vector.
     * @return StrColumn
     */
    public StrColumn getIndexH() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_index_h"));
    }

    /**
     * 
     * The index of a reciprocal space vector.
     * @return StrColumn
     */
    public StrColumn getIndexK() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_index_k"));
    }

    /**
     * 
     * The index of a reciprocal space vector.
     * @return StrColumn
     */
    public StrColumn getIndexL() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_index_l"));
    }
}
