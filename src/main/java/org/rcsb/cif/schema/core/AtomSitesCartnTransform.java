package org.rcsb.cif.schema.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * The CATEGORY of data items used to describe the matrix elements
 * used to transform fractional coordinates into Cartesian coordinates
 * of all atom sites in a crystal structure.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class AtomSitesCartnTransform extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "atom_sites_cartn_transform";

    public AtomSitesCartnTransform(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
    }

    /**
     * Standard uncertainty of _atom_sites_Cartn_transform.mat_11.
     * @return FloatColumn
     */
    public FloatColumn getMat11Su() {
        return new DelegatingFloatColumn(parentBlock.getColumn("atom_sites_cartn_transform_mat_11_su"));
    }

    /**
     * Standard uncertainty of _atom_sites_Cartn_transform.mat_12.
     * @return FloatColumn
     */
    public FloatColumn getMat12Su() {
        return new DelegatingFloatColumn(parentBlock.getColumn("atom_sites_cartn_transform_mat_12_su"));
    }

    /**
     * Standard uncertainty of _atom_sites_Cartn_transform.mat_13.
     * @return FloatColumn
     */
    public FloatColumn getMat13Su() {
        return new DelegatingFloatColumn(parentBlock.getColumn("atom_sites_cartn_transform_mat_13_su"));
    }

    /**
     * Standard uncertainty of _atom_sites_Cartn_transform.mat_21.
     * @return FloatColumn
     */
    public FloatColumn getMat21Su() {
        return new DelegatingFloatColumn(parentBlock.getColumn("atom_sites_cartn_transform_mat_21_su"));
    }

    /**
     * Standard uncertainty of _atom_sites_Cartn_transform.mat_22.
     * @return FloatColumn
     */
    public FloatColumn getMat22Su() {
        return new DelegatingFloatColumn(parentBlock.getColumn("atom_sites_cartn_transform_mat_22_su"));
    }

    /**
     * Standard uncertainty of _atom_sites_Cartn_transform.mat_23.
     * @return FloatColumn
     */
    public FloatColumn getMat23Su() {
        return new DelegatingFloatColumn(parentBlock.getColumn("atom_sites_cartn_transform_mat_23_su"));
    }

    /**
     * Standard uncertainty of _atom_sites_Cartn_transform.mat_31.
     * @return FloatColumn
     */
    public FloatColumn getMat31Su() {
        return new DelegatingFloatColumn(parentBlock.getColumn("atom_sites_cartn_transform_mat_31_su"));
    }

    /**
     * Standard uncertainty of _atom_sites_Cartn_transform.mat_32.
     * @return FloatColumn
     */
    public FloatColumn getMat32Su() {
        return new DelegatingFloatColumn(parentBlock.getColumn("atom_sites_cartn_transform_mat_32_su"));
    }

    /**
     * Standard uncertainty of _atom_sites_Cartn_transform.mat_33.
     * @return FloatColumn
     */
    public FloatColumn getMat33Su() {
        return new DelegatingFloatColumn(parentBlock.getColumn("atom_sites_cartn_transform_mat_33_su"));
    }

    /**
     * Matrix used to transform fractional coordinates in the ATOM_SITE
     * category to Cartesian coordinates. The axial alignments of this
     * transformation are described in _atom_sites_Cartn_transform.axes.
     * The 3 x 1 translation is defined in _atom_sites_Cartn_transform.vector.
     * 
     * x'                   |11 12 13|     x                  | 1 |
     * ( y' ) Cartesian   =   |21 22 23| * ( y ) fractional  + v| 2 |
     * z'                   |31 32 33|     z                  | 3 |
     * 
     * The default transformation matrix uses Rollet's axial
     * assignments with cell vectors a,b,c aligned with orthogonal
     * axes X,Y,Z so that c||Z and b in plane YZ.
     * @return FloatColumn
     */
    public FloatColumn getMatrix() {
        return new DelegatingFloatColumn(parentBlock.getColumn("atom_sites_cartn_transform_matrix"));
    }

    /**
     * Standard uncertainty of _atom_sites_Cartn_transform.matrix.
     * @return FloatColumn
     */
    public FloatColumn getMatrixSu() {
        return new DelegatingFloatColumn(parentBlock.getColumn("atom_sites_cartn_transform_matrix_su"));
    }

    /**
     * Standard uncertainty of _atom_sites_Cartn_transform.vec_1.
     * @return FloatColumn
     */
    public FloatColumn getVec1Su() {
        return new DelegatingFloatColumn(parentBlock.getColumn("atom_sites_cartn_transform_vec_1_su"));
    }

    /**
     * Standard uncertainty of _atom_sites_Cartn_transform.vec_2.
     * @return FloatColumn
     */
    public FloatColumn getVec2Su() {
        return new DelegatingFloatColumn(parentBlock.getColumn("atom_sites_cartn_transform_vec_2_su"));
    }

    /**
     * Standard uncertainty of _atom_sites_Cartn_transform.vec_3.
     * @return FloatColumn
     */
    public FloatColumn getVec3Su() {
        return new DelegatingFloatColumn(parentBlock.getColumn("atom_sites_cartn_transform_vec_3_su"));
    }

    /**
     * The 3x1 translation is used with _atom_sites_Cartn_transform.matrix
     * used to transform fractional coordinates to Cartesian coordinates.
     * The axial alignments of this transformation are described in
     * _atom_sites_Cartn_transform.axes.
     * @return FloatColumn
     */
    public FloatColumn getVector() {
        return new DelegatingFloatColumn(parentBlock.getColumn("atom_sites_cartn_transform_vector"));
    }

    /**
     * Standard uncertainty of _atom_sites_Cartn_transform.vector.
     * @return FloatColumn
     */
    public FloatColumn getVectorSu() {
        return new DelegatingFloatColumn(parentBlock.getColumn("atom_sites_cartn_transform_vector_su"));
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
    public FloatColumn getVec3() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_sites_Cartn_transf_vector[3]", "atom_sites_cartn_transform_vec_3"));
    }

}