package org.rcsb.cif.schema.generated.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * 
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
     * 
     * Diffractometer angle setting when the perpendicular to the specified
     * crystal face is aligned along a specified direction (e.g. the
     * bisector of the incident and reflected beams in an optical goniometer.
     * @return StrColumn
     */
    public StrColumn getDiffrChi() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_diffr_chi"));
    }

    /**
     * 
     * Diffractometer angle setting when the perpendicular to the specified
     * crystal face is aligned along a specified direction (e.g. the
     * bisector of the incident and reflected beams in an optical goniometer.
     * @return StrColumn
     */
    public StrColumn getDiffrKappa() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_diffr_kappa"));
    }

    /**
     * 
     * Diffractometer angle setting when the perpendicular to the specified
     * crystal face is aligned along a specified direction (e.g. the
     * bisector of the incident and reflected beams in an optical goniometer.
     * @return StrColumn
     */
    public StrColumn getDiffrPhi() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_diffr_phi"));
    }

    /**
     * 
     * Diffractometer angle setting when the perpendicular to the specified
     * crystal face is aligned along a specified direction (e.g. the
     * bisector of the incident and reflected beams in an optical goniometer.
     * @return StrColumn
     */
    public StrColumn getDiffrPsi() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_diffr_psi"));
    }

    /**
     * 
     * Miller indices of the crystal face.
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

    /**
     * 
     * Perpendicular distance of face to the centre of rotation of the crystal.
     * @return StrColumn
     */
    public StrColumn getPerpDist() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_perp_dist"));
    }
}
