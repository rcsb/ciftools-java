package org.rcsb.cif.schema.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * The CATEGORY of data items used to describe information which applies
 * to all atom sites in a crystal structure.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class AtomSites extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "atom_sites";

    public AtomSites(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
    }

    /**
     * Codes which identify the methods used to locate the initial
     * atom sites. The *_primary code identifies how the first
     * atom sites were determined; the *_secondary code identifies
     * how the remaining non-hydrogen sites were located; and the
     * *_hydrogens code identifies how the hydrogen sites were located.
     * 
     * Ref: Sheldrick, G. M., Hauptman, H. A., Weeks, C. M.,
     * Miller, R. and Usón, I. (2001). Ab initio phasing.
     * In International Tables for Crystallography,
     * Vol. F. Crystallography of biological macromolecules,
     * edited by M. G. Rossmann and E. Arnold, ch. 16.1.
     * Dordrecht: Kluwer Academic Publishers.
     * @return StrColumn
     */
    public StrColumn getSolutionHydrogens() {
        return new DelegatingStrColumn(parentBlock.getColumn("atom_sites_solution_hydrogens"));
    }

    /**
     * Codes which identify the methods used to locate the initial
     * atom sites. The *_primary code identifies how the first
     * atom sites were determined; the *_secondary code identifies
     * how the remaining non-hydrogen sites were located; and the
     * *_hydrogens code identifies how the hydrogen sites were located.
     * 
     * Ref: Sheldrick, G. M., Hauptman, H. A., Weeks, C. M.,
     * Miller, R. and Usón, I. (2001). Ab initio phasing.
     * In International Tables for Crystallography,
     * Vol. F. Crystallography of biological macromolecules,
     * edited by M. G. Rossmann and E. Arnold, ch. 16.1.
     * Dordrecht: Kluwer Academic Publishers.
     * @return StrColumn
     */
    public StrColumn getSolutionPrimary() {
        return new DelegatingStrColumn(parentBlock.getColumn("atom_sites_solution_primary"));
    }

    /**
     * Codes which identify the methods used to locate the initial
     * atom sites. The *_primary code identifies how the first
     * atom sites were determined; the *_secondary code identifies
     * how the remaining non-hydrogen sites were located; and the
     * *_hydrogens code identifies how the hydrogen sites were located.
     * 
     * Ref: Sheldrick, G. M., Hauptman, H. A., Weeks, C. M.,
     * Miller, R. and Usón, I. (2001). Ab initio phasing.
     * In International Tables for Crystallography,
     * Vol. F. Crystallography of biological macromolecules,
     * edited by M. G. Rossmann and E. Arnold, ch. 16.1.
     * Dordrecht: Kluwer Academic Publishers.
     * @return StrColumn
     */
    public StrColumn getSolutionSecondary() {
        return new DelegatingStrColumn(parentBlock.getColumn("atom_sites_solution_secondary"));
    }

    /**
     * Information about atomic coordinates not coded elsewhere in the CIF.
     * @return StrColumn
     */
    public StrColumn getSpecialDetails() {
        return new DelegatingStrColumn(parentBlock.getColumn("atom_sites_special_details"));
    }

    /**
     * Description of the relative alignment of the crystal cell axes to the
     * Cartesian orthogonal axes as applied in the transformation matrix
     * _atom_sites_Cartn_transform.matrix.
     * @return StrColumn
     */
    public StrColumn getCartnTransformAxes() {
        return new DelegatingStrColumn(parentBlock.getAliasedColumn("atom_sites_Cartn_transform_axes", "atom_sites_cartn_transform_axes"));
    }

    /**
     * Description of the relative alignment of the crystal cell axes to the
     * Cartesian orthogonal axes as applied in the transformation matrix
     * _atom_sites_Cartn_transform.matrix.
     * @return StrColumn
     */
    public StrColumn getAxes() {
        return new DelegatingStrColumn(parentBlock.getAliasedColumn("atom_sites_Cartn_transform_axes", "atom_sites_cartn_transform_axes"));
    }

    /**
     * Matrix used to transform fractional coordinates in the ATOM_SITE category
     * to Cartesian coordinates. The axial alignments of this transformation are
     * described in _atom_sites_Cartn_transform.axes. The 3x1 translation is
     * defined in _atom_sites_Cartn_transform.vector.
     * 
     * x'                  |11 12 13|     x                  | 1 |
     * ( y' )Cartesian  = mat|21 22 23| * ( y )fractional + vec| 2 |
     * z'                  |31 32 33|     z                  | 3 |
     * 
     * The default transformation matrix uses Rollet's axial assignments with
     * cell vectors a,b,c aligned with orthogonal axes X,Y,Z so that c||Z and
     * b in plane YZ.
     * @return FloatColumn
     */
    public FloatColumn getCartnTransfMatrix11() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_sites_Cartn_transf_matrix[1][1]", "atom_sites_cartn_transform_mat_11"));
    }

    /**
     * Matrix used to transform fractional coordinates in the ATOM_SITE category
     * to Cartesian coordinates. The axial alignments of this transformation are
     * described in _atom_sites_Cartn_transform.axes. The 3x1 translation is
     * defined in _atom_sites_Cartn_transform.vector.
     * 
     * x'                  |11 12 13|     x                  | 1 |
     * ( y' )Cartesian  = mat|21 22 23| * ( y )fractional + vec| 2 |
     * z'                  |31 32 33|     z                  | 3 |
     * 
     * The default transformation matrix uses Rollet's axial assignments with
     * cell vectors a,b,c aligned with orthogonal axes X,Y,Z so that c||Z and
     * b in plane YZ.
     * @return FloatColumn
     */
    public FloatColumn getMat11() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_sites_Cartn_transf_matrix[1][1]", "atom_sites_cartn_transform_mat_11"));
    }

    /**
     * Matrix used to transform fractional coordinates in the ATOM_SITE category
     * to Cartesian coordinates. The axial alignments of this transformation are
     * described in _atom_sites_Cartn_transform.axes. The 3x1 translation is
     * defined in _atom_sites_Cartn_transform.vector.
     * 
     * x'                  |11 12 13|     x                  | 1 |
     * ( y' )Cartesian  = mat|21 22 23| * ( y )fractional + vec| 2 |
     * z'                  |31 32 33|     z                  | 3 |
     * 
     * The default transformation matrix uses Rollet's axial assignments with
     * cell vectors a,b,c aligned with orthogonal axes X,Y,Z so that c||Z and
     * b in plane YZ.
     * @return FloatColumn
     */
    public FloatColumn getCartnTransfMatrix12() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_sites_Cartn_transf_matrix[1][2]", "atom_sites_cartn_transform_mat_12"));
    }

    /**
     * Matrix used to transform fractional coordinates in the ATOM_SITE category
     * to Cartesian coordinates. The axial alignments of this transformation are
     * described in _atom_sites_Cartn_transform.axes. The 3x1 translation is
     * defined in _atom_sites_Cartn_transform.vector.
     * 
     * x'                  |11 12 13|     x                  | 1 |
     * ( y' )Cartesian  = mat|21 22 23| * ( y )fractional + vec| 2 |
     * z'                  |31 32 33|     z                  | 3 |
     * 
     * The default transformation matrix uses Rollet's axial assignments with
     * cell vectors a,b,c aligned with orthogonal axes X,Y,Z so that c||Z and
     * b in plane YZ.
     * @return FloatColumn
     */
    public FloatColumn getMat12() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_sites_Cartn_transf_matrix[1][2]", "atom_sites_cartn_transform_mat_12"));
    }

    /**
     * Matrix used to transform fractional coordinates in the ATOM_SITE category
     * to Cartesian coordinates. The axial alignments of this transformation are
     * described in _atom_sites_Cartn_transform.axes. The 3x1 translation is
     * defined in _atom_sites_Cartn_transform.vector.
     * 
     * x'                  |11 12 13|     x                  | 1 |
     * ( y' )Cartesian  = mat|21 22 23| * ( y )fractional + vec| 2 |
     * z'                  |31 32 33|     z                  | 3 |
     * 
     * The default transformation matrix uses Rollet's axial assignments with
     * cell vectors a,b,c aligned with orthogonal axes X,Y,Z so that c||Z and
     * b in plane YZ.
     * @return FloatColumn
     */
    public FloatColumn getCartnTransfMatrix13() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_sites_Cartn_transf_matrix[1][3]", "atom_sites_cartn_transform_mat_13"));
    }

    /**
     * Matrix used to transform fractional coordinates in the ATOM_SITE category
     * to Cartesian coordinates. The axial alignments of this transformation are
     * described in _atom_sites_Cartn_transform.axes. The 3x1 translation is
     * defined in _atom_sites_Cartn_transform.vector.
     * 
     * x'                  |11 12 13|     x                  | 1 |
     * ( y' )Cartesian  = mat|21 22 23| * ( y )fractional + vec| 2 |
     * z'                  |31 32 33|     z                  | 3 |
     * 
     * The default transformation matrix uses Rollet's axial assignments with
     * cell vectors a,b,c aligned with orthogonal axes X,Y,Z so that c||Z and
     * b in plane YZ.
     * @return FloatColumn
     */
    public FloatColumn getMat13() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_sites_Cartn_transf_matrix[1][3]", "atom_sites_cartn_transform_mat_13"));
    }

    /**
     * Matrix used to transform fractional coordinates in the ATOM_SITE category
     * to Cartesian coordinates. The axial alignments of this transformation are
     * described in _atom_sites_Cartn_transform.axes. The 3x1 translation is
     * defined in _atom_sites_Cartn_transform.vector.
     * 
     * x'                  |11 12 13|     x                  | 1 |
     * ( y' )Cartesian  = mat|21 22 23| * ( y )fractional + vec| 2 |
     * z'                  |31 32 33|     z                  | 3 |
     * 
     * The default transformation matrix uses Rollet's axial assignments with
     * cell vectors a,b,c aligned with orthogonal axes X,Y,Z so that c||Z and
     * b in plane YZ.
     * @return FloatColumn
     */
    public FloatColumn getCartnTransfMatrix21() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_sites_Cartn_transf_matrix[2][1]", "atom_sites_cartn_transform_mat_21"));
    }

    /**
     * Matrix used to transform fractional coordinates in the ATOM_SITE category
     * to Cartesian coordinates. The axial alignments of this transformation are
     * described in _atom_sites_Cartn_transform.axes. The 3x1 translation is
     * defined in _atom_sites_Cartn_transform.vector.
     * 
     * x'                  |11 12 13|     x                  | 1 |
     * ( y' )Cartesian  = mat|21 22 23| * ( y )fractional + vec| 2 |
     * z'                  |31 32 33|     z                  | 3 |
     * 
     * The default transformation matrix uses Rollet's axial assignments with
     * cell vectors a,b,c aligned with orthogonal axes X,Y,Z so that c||Z and
     * b in plane YZ.
     * @return FloatColumn
     */
    public FloatColumn getMat21() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_sites_Cartn_transf_matrix[2][1]", "atom_sites_cartn_transform_mat_21"));
    }

    /**
     * Matrix used to transform fractional coordinates in the ATOM_SITE category
     * to Cartesian coordinates. The axial alignments of this transformation are
     * described in _atom_sites_Cartn_transform.axes. The 3x1 translation is
     * defined in _atom_sites_Cartn_transform.vector.
     * 
     * x'                  |11 12 13|     x                  | 1 |
     * ( y' )Cartesian  = mat|21 22 23| * ( y )fractional + vec| 2 |
     * z'                  |31 32 33|     z                  | 3 |
     * 
     * The default transformation matrix uses Rollet's axial assignments with
     * cell vectors a,b,c aligned with orthogonal axes X,Y,Z so that c||Z and
     * b in plane YZ.
     * @return FloatColumn
     */
    public FloatColumn getCartnTransfMatrix22() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_sites_Cartn_transf_matrix[2][2]", "atom_sites_cartn_transform_mat_22"));
    }

    /**
     * Matrix used to transform fractional coordinates in the ATOM_SITE category
     * to Cartesian coordinates. The axial alignments of this transformation are
     * described in _atom_sites_Cartn_transform.axes. The 3x1 translation is
     * defined in _atom_sites_Cartn_transform.vector.
     * 
     * x'                  |11 12 13|     x                  | 1 |
     * ( y' )Cartesian  = mat|21 22 23| * ( y )fractional + vec| 2 |
     * z'                  |31 32 33|     z                  | 3 |
     * 
     * The default transformation matrix uses Rollet's axial assignments with
     * cell vectors a,b,c aligned with orthogonal axes X,Y,Z so that c||Z and
     * b in plane YZ.
     * @return FloatColumn
     */
    public FloatColumn getMat22() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_sites_Cartn_transf_matrix[2][2]", "atom_sites_cartn_transform_mat_22"));
    }

    /**
     * Matrix used to transform fractional coordinates in the ATOM_SITE category
     * to Cartesian coordinates. The axial alignments of this transformation are
     * described in _atom_sites_Cartn_transform.axes. The 3x1 translation is
     * defined in _atom_sites_Cartn_transform.vector.
     * 
     * x'                  |11 12 13|     x                  | 1 |
     * ( y' )Cartesian  = mat|21 22 23| * ( y )fractional + vec| 2 |
     * z'                  |31 32 33|     z                  | 3 |
     * 
     * The default transformation matrix uses Rollet's axial assignments with
     * cell vectors a,b,c aligned with orthogonal axes X,Y,Z so that c||Z and
     * b in plane YZ.
     * @return FloatColumn
     */
    public FloatColumn getCartnTransfMatrix23() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_sites_Cartn_transf_matrix[2][3]", "atom_sites_cartn_transform_mat_23"));
    }

    /**
     * Matrix used to transform fractional coordinates in the ATOM_SITE category
     * to Cartesian coordinates. The axial alignments of this transformation are
     * described in _atom_sites_Cartn_transform.axes. The 3x1 translation is
     * defined in _atom_sites_Cartn_transform.vector.
     * 
     * x'                  |11 12 13|     x                  | 1 |
     * ( y' )Cartesian  = mat|21 22 23| * ( y )fractional + vec| 2 |
     * z'                  |31 32 33|     z                  | 3 |
     * 
     * The default transformation matrix uses Rollet's axial assignments with
     * cell vectors a,b,c aligned with orthogonal axes X,Y,Z so that c||Z and
     * b in plane YZ.
     * @return FloatColumn
     */
    public FloatColumn getMat23() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_sites_Cartn_transf_matrix[2][3]", "atom_sites_cartn_transform_mat_23"));
    }

    /**
     * Matrix used to transform fractional coordinates in the ATOM_SITE category
     * to Cartesian coordinates. The axial alignments of this transformation are
     * described in _atom_sites_Cartn_transform.axes. The 3x1 translation is
     * defined in _atom_sites_Cartn_transform.vector.
     * 
     * x'                  |11 12 13|     x                  | 1 |
     * ( y' )Cartesian  = mat|21 22 23| * ( y )fractional + vec| 2 |
     * z'                  |31 32 33|     z                  | 3 |
     * 
     * The default transformation matrix uses Rollet's axial assignments with
     * cell vectors a,b,c aligned with orthogonal axes X,Y,Z so that c||Z and
     * b in plane YZ.
     * @return FloatColumn
     */
    public FloatColumn getCartnTransfMatrix31() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_sites_Cartn_transf_matrix[3][1]", "atom_sites_cartn_transform_mat_31"));
    }

    /**
     * Matrix used to transform fractional coordinates in the ATOM_SITE category
     * to Cartesian coordinates. The axial alignments of this transformation are
     * described in _atom_sites_Cartn_transform.axes. The 3x1 translation is
     * defined in _atom_sites_Cartn_transform.vector.
     * 
     * x'                  |11 12 13|     x                  | 1 |
     * ( y' )Cartesian  = mat|21 22 23| * ( y )fractional + vec| 2 |
     * z'                  |31 32 33|     z                  | 3 |
     * 
     * The default transformation matrix uses Rollet's axial assignments with
     * cell vectors a,b,c aligned with orthogonal axes X,Y,Z so that c||Z and
     * b in plane YZ.
     * @return FloatColumn
     */
    public FloatColumn getMat31() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_sites_Cartn_transf_matrix[3][1]", "atom_sites_cartn_transform_mat_31"));
    }

    /**
     * Matrix used to transform fractional coordinates in the ATOM_SITE category
     * to Cartesian coordinates. The axial alignments of this transformation are
     * described in _atom_sites_Cartn_transform.axes. The 3x1 translation is
     * defined in _atom_sites_Cartn_transform.vector.
     * 
     * x'                  |11 12 13|     x                  | 1 |
     * ( y' )Cartesian  = mat|21 22 23| * ( y )fractional + vec| 2 |
     * z'                  |31 32 33|     z                  | 3 |
     * 
     * The default transformation matrix uses Rollet's axial assignments with
     * cell vectors a,b,c aligned with orthogonal axes X,Y,Z so that c||Z and
     * b in plane YZ.
     * @return FloatColumn
     */
    public FloatColumn getCartnTransfMatrix32() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_sites_Cartn_transf_matrix[3][2]", "atom_sites_cartn_transform_mat_32"));
    }

    /**
     * Matrix used to transform fractional coordinates in the ATOM_SITE category
     * to Cartesian coordinates. The axial alignments of this transformation are
     * described in _atom_sites_Cartn_transform.axes. The 3x1 translation is
     * defined in _atom_sites_Cartn_transform.vector.
     * 
     * x'                  |11 12 13|     x                  | 1 |
     * ( y' )Cartesian  = mat|21 22 23| * ( y )fractional + vec| 2 |
     * z'                  |31 32 33|     z                  | 3 |
     * 
     * The default transformation matrix uses Rollet's axial assignments with
     * cell vectors a,b,c aligned with orthogonal axes X,Y,Z so that c||Z and
     * b in plane YZ.
     * @return FloatColumn
     */
    public FloatColumn getMat32() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_sites_Cartn_transf_matrix[3][2]", "atom_sites_cartn_transform_mat_32"));
    }

    /**
     * Matrix used to transform fractional coordinates in the ATOM_SITE category
     * to Cartesian coordinates. The axial alignments of this transformation are
     * described in _atom_sites_Cartn_transform.axes. The 3x1 translation is
     * defined in _atom_sites_Cartn_transform.vector.
     * 
     * x'                  |11 12 13|     x                  | 1 |
     * ( y' )Cartesian  = mat|21 22 23| * ( y )fractional + vec| 2 |
     * z'                  |31 32 33|     z                  | 3 |
     * 
     * The default transformation matrix uses Rollet's axial assignments with
     * cell vectors a,b,c aligned with orthogonal axes X,Y,Z so that c||Z and
     * b in plane YZ.
     * @return FloatColumn
     */
    public FloatColumn getCartnTransfMatrix33() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_sites_Cartn_transf_matrix[3][3]", "atom_sites_cartn_transform_mat_33"));
    }

    /**
     * Matrix used to transform fractional coordinates in the ATOM_SITE category
     * to Cartesian coordinates. The axial alignments of this transformation are
     * described in _atom_sites_Cartn_transform.axes. The 3x1 translation is
     * defined in _atom_sites_Cartn_transform.vector.
     * 
     * x'                  |11 12 13|     x                  | 1 |
     * ( y' )Cartesian  = mat|21 22 23| * ( y )fractional + vec| 2 |
     * z'                  |31 32 33|     z                  | 3 |
     * 
     * The default transformation matrix uses Rollet's axial assignments with
     * cell vectors a,b,c aligned with orthogonal axes X,Y,Z so that c||Z and
     * b in plane YZ.
     * @return FloatColumn
     */
    public FloatColumn getMat33() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_sites_Cartn_transf_matrix[3][3]", "atom_sites_cartn_transform_mat_33"));
    }

    /**
     * The 3x1 translation that is used with _atom_sites_cartn_transform.matrix
     * to transform fractional coordinates in the ATOM_SITE category to Cartesian
     * coordinates. The axial alignments of this transformation are described
     * in _atom_sites_Cartn_transform.axes.
     * @return FloatColumn
     */
    public FloatColumn getCartnTransfVector1() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_sites_Cartn_transf_vector[1]", "atom_sites_cartn_transform_vec_1"));
    }

    /**
     * The 3x1 translation that is used with _atom_sites_cartn_transform.matrix
     * to transform fractional coordinates in the ATOM_SITE category to Cartesian
     * coordinates. The axial alignments of this transformation are described
     * in _atom_sites_Cartn_transform.axes.
     * @return FloatColumn
     */
    public FloatColumn getVec1() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_sites_Cartn_transf_vector[1]", "atom_sites_cartn_transform_vec_1"));
    }

    /**
     * The 3x1 translation that is used with _atom_sites_cartn_transform.matrix
     * to transform fractional coordinates in the ATOM_SITE category to Cartesian
     * coordinates. The axial alignments of this transformation are described
     * in _atom_sites_Cartn_transform.axes.
     * @return FloatColumn
     */
    public FloatColumn getCartnTransfVector2() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_sites_Cartn_transf_vector[2]", "atom_sites_cartn_transform_vec_2"));
    }

    /**
     * The 3x1 translation that is used with _atom_sites_cartn_transform.matrix
     * to transform fractional coordinates in the ATOM_SITE category to Cartesian
     * coordinates. The axial alignments of this transformation are described
     * in _atom_sites_Cartn_transform.axes.
     * @return FloatColumn
     */
    public FloatColumn getVec2() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_sites_Cartn_transf_vector[2]", "atom_sites_cartn_transform_vec_2"));
    }

    /**
     * The 3x1 translation that is used with _atom_sites_cartn_transform.matrix
     * to transform fractional coordinates in the ATOM_SITE category to Cartesian
     * coordinates. The axial alignments of this transformation are described
     * in _atom_sites_Cartn_transform.axes.
     * @return FloatColumn
     */
    public FloatColumn getCartnTransfVector3() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_sites_Cartn_transf_vector[3]", "atom_sites_cartn_transform_vec_3"));
    }

    /**
     * The 3x1 translation that is used with _atom_sites_cartn_transform.matrix
     * to transform fractional coordinates in the ATOM_SITE category to Cartesian
     * coordinates. The axial alignments of this transformation are described
     * in _atom_sites_Cartn_transform.axes.
     * @return FloatColumn
     */
    public FloatColumn getVec3() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_sites_Cartn_transf_vector[3]", "atom_sites_cartn_transform_vec_3"));
    }

    /**
     * Description of the relative alignment of the crystal cell axes to the
     * Cartesian orthogonal axes as applied in the transformation matrix
     * _atom_sites_fract_transform.matrix.
     * @return StrColumn
     */
    public StrColumn getFractTransformAxes() {
        return new DelegatingStrColumn(parentBlock.getColumn("atom_sites_fract_transform_axes"));
    }

    /**
     * Matrix used to transform Cartesian coordinates in the ATOM_SITE category
     * to fractional coordinates. The axial alignments of this transformation are
     * described in _atom_sites_fract_transform.axes. The 3x1 translation is
     * defined in _atom_sites_fract_transform.vector.
     * 
     * x'                  |11 12 13|     x                  | 1 |
     * ( y' )fractional = mat|21 22 23| * ( y )Cartesian +  vec| 2 |
     * z'                  |31 32 33|     z                  | 3 |
     * 
     * The default transformation matrix uses Rollet's axial assignments with
     * cell vectors a,b,c aligned with orthogonal axes X,Y,Z so that c||Z and
     * b in plane YZ.
     * @return FloatColumn
     */
    public FloatColumn getFractTransfMatrix11() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_sites_fract_transf_matrix[1][1]", "atom_sites_fract_transform_mat_11"));
    }

    /**
     * Matrix used to transform Cartesian coordinates in the ATOM_SITE category
     * to fractional coordinates. The axial alignments of this transformation are
     * described in _atom_sites_fract_transform.axes. The 3x1 translation is
     * defined in _atom_sites_fract_transform.vector.
     * 
     * x'                  |11 12 13|     x                  | 1 |
     * ( y' )fractional = mat|21 22 23| * ( y )Cartesian +  vec| 2 |
     * z'                  |31 32 33|     z                  | 3 |
     * 
     * The default transformation matrix uses Rollet's axial assignments with
     * cell vectors a,b,c aligned with orthogonal axes X,Y,Z so that c||Z and
     * b in plane YZ.
     * @return FloatColumn
     */
    public FloatColumn getFractTransfMatrix12() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_sites_fract_transf_matrix[1][2]", "atom_sites_fract_transform_mat_12"));
    }

    /**
     * Matrix used to transform Cartesian coordinates in the ATOM_SITE category
     * to fractional coordinates. The axial alignments of this transformation are
     * described in _atom_sites_fract_transform.axes. The 3x1 translation is
     * defined in _atom_sites_fract_transform.vector.
     * 
     * x'                  |11 12 13|     x                  | 1 |
     * ( y' )fractional = mat|21 22 23| * ( y )Cartesian +  vec| 2 |
     * z'                  |31 32 33|     z                  | 3 |
     * 
     * The default transformation matrix uses Rollet's axial assignments with
     * cell vectors a,b,c aligned with orthogonal axes X,Y,Z so that c||Z and
     * b in plane YZ.
     * @return FloatColumn
     */
    public FloatColumn getFractTransfMatrix13() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_sites_fract_transf_matrix[1][3]", "atom_sites_fract_transform_mat_13"));
    }

    /**
     * Matrix used to transform Cartesian coordinates in the ATOM_SITE category
     * to fractional coordinates. The axial alignments of this transformation are
     * described in _atom_sites_fract_transform.axes. The 3x1 translation is
     * defined in _atom_sites_fract_transform.vector.
     * 
     * x'                  |11 12 13|     x                  | 1 |
     * ( y' )fractional = mat|21 22 23| * ( y )Cartesian +  vec| 2 |
     * z'                  |31 32 33|     z                  | 3 |
     * 
     * The default transformation matrix uses Rollet's axial assignments with
     * cell vectors a,b,c aligned with orthogonal axes X,Y,Z so that c||Z and
     * b in plane YZ.
     * @return FloatColumn
     */
    public FloatColumn getFractTransfMatrix21() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_sites_fract_transf_matrix[2][1]", "atom_sites_fract_transform_mat_21"));
    }

    /**
     * Matrix used to transform Cartesian coordinates in the ATOM_SITE category
     * to fractional coordinates. The axial alignments of this transformation are
     * described in _atom_sites_fract_transform.axes. The 3x1 translation is
     * defined in _atom_sites_fract_transform.vector.
     * 
     * x'                  |11 12 13|     x                  | 1 |
     * ( y' )fractional = mat|21 22 23| * ( y )Cartesian +  vec| 2 |
     * z'                  |31 32 33|     z                  | 3 |
     * 
     * The default transformation matrix uses Rollet's axial assignments with
     * cell vectors a,b,c aligned with orthogonal axes X,Y,Z so that c||Z and
     * b in plane YZ.
     * @return FloatColumn
     */
    public FloatColumn getFractTransfMatrix22() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_sites_fract_transf_matrix[2][2]", "atom_sites_fract_transform_mat_22"));
    }

    /**
     * Matrix used to transform Cartesian coordinates in the ATOM_SITE category
     * to fractional coordinates. The axial alignments of this transformation are
     * described in _atom_sites_fract_transform.axes. The 3x1 translation is
     * defined in _atom_sites_fract_transform.vector.
     * 
     * x'                  |11 12 13|     x                  | 1 |
     * ( y' )fractional = mat|21 22 23| * ( y )Cartesian +  vec| 2 |
     * z'                  |31 32 33|     z                  | 3 |
     * 
     * The default transformation matrix uses Rollet's axial assignments with
     * cell vectors a,b,c aligned with orthogonal axes X,Y,Z so that c||Z and
     * b in plane YZ.
     * @return FloatColumn
     */
    public FloatColumn getFractTransfMatrix23() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_sites_fract_transf_matrix[2][3]", "atom_sites_fract_transform_mat_23"));
    }

    /**
     * Matrix used to transform Cartesian coordinates in the ATOM_SITE category
     * to fractional coordinates. The axial alignments of this transformation are
     * described in _atom_sites_fract_transform.axes. The 3x1 translation is
     * defined in _atom_sites_fract_transform.vector.
     * 
     * x'                  |11 12 13|     x                  | 1 |
     * ( y' )fractional = mat|21 22 23| * ( y )Cartesian +  vec| 2 |
     * z'                  |31 32 33|     z                  | 3 |
     * 
     * The default transformation matrix uses Rollet's axial assignments with
     * cell vectors a,b,c aligned with orthogonal axes X,Y,Z so that c||Z and
     * b in plane YZ.
     * @return FloatColumn
     */
    public FloatColumn getFractTransfMatrix31() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_sites_fract_transf_matrix[3][1]", "atom_sites_fract_transform_mat_31"));
    }

    /**
     * Matrix used to transform Cartesian coordinates in the ATOM_SITE category
     * to fractional coordinates. The axial alignments of this transformation are
     * described in _atom_sites_fract_transform.axes. The 3x1 translation is
     * defined in _atom_sites_fract_transform.vector.
     * 
     * x'                  |11 12 13|     x                  | 1 |
     * ( y' )fractional = mat|21 22 23| * ( y )Cartesian +  vec| 2 |
     * z'                  |31 32 33|     z                  | 3 |
     * 
     * The default transformation matrix uses Rollet's axial assignments with
     * cell vectors a,b,c aligned with orthogonal axes X,Y,Z so that c||Z and
     * b in plane YZ.
     * @return FloatColumn
     */
    public FloatColumn getFractTransfMatrix32() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_sites_fract_transf_matrix[3][2]", "atom_sites_fract_transform_mat_32"));
    }

    /**
     * Matrix used to transform Cartesian coordinates in the ATOM_SITE category
     * to fractional coordinates. The axial alignments of this transformation are
     * described in _atom_sites_fract_transform.axes. The 3x1 translation is
     * defined in _atom_sites_fract_transform.vector.
     * 
     * x'                  |11 12 13|     x                  | 1 |
     * ( y' )fractional = mat|21 22 23| * ( y )Cartesian +  vec| 2 |
     * z'                  |31 32 33|     z                  | 3 |
     * 
     * The default transformation matrix uses Rollet's axial assignments with
     * cell vectors a,b,c aligned with orthogonal axes X,Y,Z so that c||Z and
     * b in plane YZ.
     * @return FloatColumn
     */
    public FloatColumn getFractTransfMatrix33() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_sites_fract_transf_matrix[3][3]", "atom_sites_fract_transform_mat_33"));
    }

    /**
     * The 3x1 translation that is used with _atom_sites_fract_transform.matrix
     * to transform Cartesian coordinates in the ATOM_SITE category to fractional
     * coordinates. The axial alignments of this transformation are described
     * in _atom_sites_fract_transform.axes.
     * @return FloatColumn
     */
    public FloatColumn getFractTransfVector1() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_sites_fract_transf_vector[1]", "atom_sites_fract_transform_vec_1"));
    }

    /**
     * The 3x1 translation that is used with _atom_sites_fract_transform.matrix
     * to transform Cartesian coordinates in the ATOM_SITE category to fractional
     * coordinates. The axial alignments of this transformation are described
     * in _atom_sites_fract_transform.axes.
     * @return FloatColumn
     */
    public FloatColumn getFractTransfVector2() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_sites_fract_transf_vector[2]", "atom_sites_fract_transform_vec_2"));
    }

    /**
     * The 3x1 translation that is used with _atom_sites_fract_transform.matrix
     * to transform Cartesian coordinates in the ATOM_SITE category to fractional
     * coordinates. The axial alignments of this transformation are described
     * in _atom_sites_fract_transform.axes.
     * @return FloatColumn
     */
    public FloatColumn getFractTransfVector3() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_sites_fract_transf_vector[3]", "atom_sites_fract_transform_vec_3"));
    }

}