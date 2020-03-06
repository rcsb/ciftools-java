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
     * Diffractometer angle setting when the perpendicular to the specified
     * crystal face is aligned along a specified direction (e.g. the
     * bisector of the incident and reflected beams in an optical goniometer.
     * @return FloatColumn
     */
    public FloatColumn getDiffrKappa() {
        return new DelegatingFloatColumn(parentBlock.getColumn("exptl_crystal_face_diffr_kappa"));
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
     * Diffractometer angle setting when the perpendicular to the specified
     * crystal face is aligned along a specified direction (e.g. the
     * bisector of the incident and reflected beams in an optical goniometer.
     * @return FloatColumn
     */
    public FloatColumn getDiffrPsi() {
        return new DelegatingFloatColumn(parentBlock.getColumn("exptl_crystal_face_diffr_psi"));
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

}