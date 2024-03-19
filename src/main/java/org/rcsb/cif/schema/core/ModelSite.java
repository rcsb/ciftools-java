package org.rcsb.cif.schema.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * The CATEGORY of data items used to describe atomic sites and
 * connections in the proposed atomic model.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class ModelSite extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "model_site";

    public ModelSite(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
    }

    /**
     * The set of three ADP eigenvalues for the associated eigenvectors
     * given by _model_site.ADP_eigenvectors. The eigenvalues are
     * sorted in order of magnitude with the largest first.
     * @return FloatColumn
     */
    public FloatColumn getAdpEigenvalues() {
        return new DelegatingFloatColumn(parentBlock.getColumn("model_site_adp_eigenvalues"));
    }

    /**
     * Standard uncertainty of _model_site.ADP_eigenvalues.
     * @return FloatColumn
     */
    public FloatColumn getAdpEigenvaluesSu() {
        return new DelegatingFloatColumn(parentBlock.getColumn("model_site_adp_eigenvalues_su"));
    }

    /**
     * The set of three ADP eigenvectors corresponding to the values
     * given in _model_site.ADP_eigenvalues. The eigenvectors are
     * contained in the rows of a matrix ordered from top to bottom
     * in order largest to smallest corresponding eigenvalue. The
     * eigenvector elements are direction cosines to the orthogonal
     * axes X,Y,Z.
     * @return FloatColumn
     */
    public FloatColumn getAdpEigenvectors() {
        return new DelegatingFloatColumn(parentBlock.getColumn("model_site_adp_eigenvectors"));
    }

    /**
     * Standard uncertainty of _model_site.ADP_eigenvectors.
     * @return FloatColumn
     */
    public FloatColumn getAdpEigenvectorsSu() {
        return new DelegatingFloatColumn(parentBlock.getColumn("model_site_adp_eigenvectors_su"));
    }

    /**
     * Matrix of dimensionless anisotropic atomic displacement parameters.
     * @return FloatColumn
     */
    public FloatColumn getAdpMatrixBeta() {
        return new DelegatingFloatColumn(parentBlock.getColumn("model_site_adp_matrix_beta"));
    }

    /**
     * Standard uncertainty of _model_site.ADP_matrix_beta.
     * @return FloatColumn
     */
    public FloatColumn getAdpMatrixBetaSu() {
        return new DelegatingFloatColumn(parentBlock.getColumn("model_site_adp_matrix_beta_su"));
    }

    /**
     * Vector of Cartesian (orthogonal angstrom) atom site coordinates.
     * @return FloatColumn
     */
    public FloatColumn getCartnXyz() {
        return new DelegatingFloatColumn(parentBlock.getColumn("model_site_cartn_xyz"));
    }

    /**
     * Standard uncertainty of _model_site.Cartn_xyz.
     * @return FloatColumn
     */
    public FloatColumn getCartnXyzSu() {
        return new DelegatingFloatColumn(parentBlock.getColumn("model_site_cartn_xyz_su"));
    }

    /**
     * Display colour code assigned to this atom site. Note that the
     * possible colours are enumerated in the colour_RGB list, and
     * the default code is enumerated in the colour_hue list.
     * @return StrColumn
     */
    public StrColumn getDisplayColour() {
        return new DelegatingStrColumn(parentBlock.getColumn("model_site_display_colour"));
    }

    /**
     * Vector of fractional atom site coordinates.
     * @return FloatColumn
     */
    public FloatColumn getFractXyz() {
        return new DelegatingFloatColumn(parentBlock.getColumn("model_site_fract_xyz"));
    }

    /**
     * Standard uncertainty of _model_site.fract_xyz.
     * @return FloatColumn
     */
    public FloatColumn getFractXyzSu() {
        return new DelegatingFloatColumn(parentBlock.getColumn("model_site_fract_xyz_su"));
    }

    /**
     * An identifier for the model site that is unique within its loop.
     * @return StrColumn
     */
    public StrColumn getId() {
        return new DelegatingStrColumn(parentBlock.getColumn("model_site_id"));
    }

    /**
     * Index number of an atomic site in the connected molecule.
     * @return IntColumn
     */
    public IntColumn getIndex() {
        return new DelegatingIntColumn(parentBlock.getColumn("model_site_index"));
    }

    /**
     * Code identifies a site in the ATOM_SITE category of data.
     * @return StrColumn
     */
    public StrColumn getLabel() {
        return new DelegatingStrColumn(parentBlock.getColumn("model_site_label"));
    }

    /**
     * Index number of distinct molecules in the cell, not related by symmetry.
     * @return IntColumn
     */
    public IntColumn getMoleIndex() {
        return new DelegatingIntColumn(parentBlock.getColumn("model_site_mole_index"));
    }

    /**
     * Atomic radius of atom located at this site.
     * @return FloatColumn
     */
    public FloatColumn getRadiusBond() {
        return new DelegatingFloatColumn(parentBlock.getColumn("model_site_radius_bond"));
    }

    /**
     * Atomic contact radius of atom specie located at this site.
     * @return FloatColumn
     */
    public FloatColumn getRadiusContact() {
        return new DelegatingFloatColumn(parentBlock.getColumn("model_site_radius_contact"));
    }

    /**
     * Data item specifying the symmetry operation codes applied to the atom
     * sites involved in a specific geometric configuration.
     * 
     * The symmetry code of each atom site as the symmetry-equivalent position
     * number 'n' and the cell translation number 'pqr'. These numbers are
     * combined to form the code 'n pqr' or n_pqr.
     * 
     * The character string n_pqr is composed as follows:
     * 
     * n refers to the symmetry operation that is applied to the
     * coordinates stored in _atom_site.fract_xyz. It must match
     * a number given in _space_group_symop.id (or one of its
     * aliases, such as _symmetry_equiv_pos_site_id).
     * 
     * p, q and r refer to the translations that are subsequently
     * applied to the symmetry transformed coordinates to generate
     * the atom used in calculating the angle. These translations
     * (x,y,z) are related to (p,q,r) by the relations
     * p = 5 + x
     * q = 5 + y
     * r = 5 + z
     * @return StrColumn
     */
    public StrColumn getSymop() {
        return new DelegatingStrColumn(parentBlock.getColumn("model_site_symop"));
    }

    /**
     * Code to identify the atom specie(s) occupying this site.
     * @return StrColumn
     */
    public StrColumn getTypeSymbol() {
        return new DelegatingStrColumn(parentBlock.getColumn("model_site_type_symbol"));
    }

}