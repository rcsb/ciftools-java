package org.rcsb.cif.schema.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * The CATEGORY of data items which specify the dimensions of the
 * crystal used in the diffraction measurements.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class ExptlCrystalFace extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "exptl_crystal_face";

    public ExptlCrystalFace(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
    }

    /**
     * Diffractometer angle setting when the perpendicular to the specified
     * crystal face is aligned along a specified direction (e.g. the
     * bisector of the incident and reflected beams in an optical goniometer.
     * @return FloatColumn
     */
    public FloatColumn getDiffrChi() {
        return new DelegatingFloatColumn(parentBlock.getColumn("exptl_crystal_face_diffr_chi"));
    }

    /**
     * Standard uncertainty of _exptl_crystal_face.diffr_chi.
     * @return FloatColumn
     */
    public FloatColumn getDiffrChiSu() {
        return new DelegatingFloatColumn(parentBlock.getColumn("exptl_crystal_face_diffr_chi_su"));
    }

    /**
     * Diffractometer angle setting when the perpendicular to the specified
     * crystal face is aligned along a specified direction (e.g. the
     * bisector of the incident and reflected beams in an optical goniometer.
     * @return FloatColumn
     */
    public FloatColumn getDiffrKappa() {
        return new DelegatingFloatColumn(parentBlock.getColumn("exptl_crystal_face_diffr_kappa"));
    }

    /**
     * Standard uncertainty of _exptl_crystal_face.diffr_kappa.
     * @return FloatColumn
     */
    public FloatColumn getDiffrKappaSu() {
        return new DelegatingFloatColumn(parentBlock.getColumn("exptl_crystal_face_diffr_kappa_su"));
    }

    /**
     * Diffractometer angle setting when the perpendicular to the specified
     * crystal face is aligned along a specified direction (e.g. the
     * bisector of the incident and reflected beams in an optical goniometer.
     * @return FloatColumn
     */
    public FloatColumn getDiffrPhi() {
        return new DelegatingFloatColumn(parentBlock.getColumn("exptl_crystal_face_diffr_phi"));
    }

    /**
     * Standard uncertainty of _exptl_crystal_face.diffr_phi.
     * @return FloatColumn
     */
    public FloatColumn getDiffrPhiSu() {
        return new DelegatingFloatColumn(parentBlock.getColumn("exptl_crystal_face_diffr_phi_su"));
    }

    /**
     * Diffractometer angle setting when the perpendicular to the specified
     * crystal face is aligned along a specified direction (e.g. the
     * bisector of the incident and reflected beams in an optical goniometer.
     * @return FloatColumn
     */
    public FloatColumn getDiffrPsi() {
        return new DelegatingFloatColumn(parentBlock.getColumn("exptl_crystal_face_diffr_psi"));
    }

    /**
     * Standard uncertainty of _exptl_crystal_face.diffr_psi.
     * @return FloatColumn
     */
    public FloatColumn getDiffrPsiSu() {
        return new DelegatingFloatColumn(parentBlock.getColumn("exptl_crystal_face_diffr_psi_su"));
    }

    /**
     * Miller indices of the crystal face.
     * @return IntColumn
     */
    public IntColumn getHkl() {
        return new DelegatingIntColumn(parentBlock.getColumn("exptl_crystal_face_hkl"));
    }

    /**
     * The index of a reciprocal space vector.
     * @return IntColumn
     */
    public IntColumn getIndexH() {
        return new DelegatingIntColumn(parentBlock.getColumn("exptl_crystal_face_index_h"));
    }

    /**
     * The index of a reciprocal space vector.
     * @return IntColumn
     */
    public IntColumn getIndexK() {
        return new DelegatingIntColumn(parentBlock.getColumn("exptl_crystal_face_index_k"));
    }

    /**
     * The index of a reciprocal space vector.
     * @return IntColumn
     */
    public IntColumn getIndexL() {
        return new DelegatingIntColumn(parentBlock.getColumn("exptl_crystal_face_index_l"));
    }

    /**
     * Perpendicular distance of face to the centre of rotation of the crystal.
     * @return FloatColumn
     */
    public FloatColumn getPerpDist() {
        return new DelegatingFloatColumn(parentBlock.getColumn("exptl_crystal_face_perp_dist"));
    }

    /**
     * Standard uncertainty of _exptl_crystal_face.perp_dist.
     * @return FloatColumn
     */
    public FloatColumn getPerpDistSu() {
        return new DelegatingFloatColumn(parentBlock.getColumn("exptl_crystal_face_perp_dist_su"));
    }

}