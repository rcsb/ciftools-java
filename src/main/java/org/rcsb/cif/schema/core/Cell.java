package org.rcsb.cif.schema.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * 
 * The CATEGORY of data items used to describe the parameters of
 * the crystal unit cell and their measurement.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class Cell extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "cell";

    public Cell(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
    }

    /**
     * Atomic mass of the contents of the unit cell. This calculated
     * from the atom sites present in the ATOM_TYPE list, rather than
     * the ATOM_SITE lists of atoms in the refined model.
     * @return FloatColumn
     */
    public FloatColumn getAtomicMass() {
        return new DelegatingFloatColumn(parentBlock.getColumn("cell_atomic_mass"));
    }

    /**
     * The number of the formula units in the unit cell as specified
     * by _chemical_formula.structural, _chemical_formula.moiety or
     * _chemical_formula.sum.
     * @return IntColumn
     */
    public IntColumn getFormulaUnitsZ() {
        return new DelegatingIntColumn(parentBlock.getColumn("cell_formula_units_Z"));
    }

    /**
     * The direct space (covariant) metric tensor used to transform
     * vectors and coordinates from real (direct) to reciprocal space.
     * @return FloatColumn
     */
    public FloatColumn getMetricTensor() {
        return new DelegatingFloatColumn(parentBlock.getColumn("cell_metric_tensor"));
    }

    /**
     * Orthogonal matrix of the crystal unit cell. Definition uses
     * Rollet's axial assignments with cell vectors a,b,c aligned
     * with orthogonal axes X,Y,Z so that c||Z and b in plane YZ.
     * @return FloatColumn
     */
    public FloatColumn getOrthogonalMatrix() {
        return new DelegatingFloatColumn(parentBlock.getColumn("cell_orthogonal_matrix"));
    }

    /**
     * Description of special aspects of the cell choice, noting
     * possible alternative settings.
     * @return StrColumn
     */
    public StrColumn getSpecialDetails() {
        return new DelegatingStrColumn(parentBlock.getAliasedColumn("cell_details", "cell_special_details"));
    }

    /**
     * Volume of the crystal unit cell.
     * @return FloatColumn
     */
    public FloatColumn getVolume() {
        return new DelegatingFloatColumn(parentBlock.getColumn("cell_volume"));
    }

    /**
     * Standard uncertainty of the volume of the crystal unit cell.
     * @return FloatColumn
     */
    public FloatColumn getVolumeSu() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("cell_volume_esd", "cell_volume_su"));
    }

    /**
     * The angle between the bounding cell axes.
     * @return FloatColumn
     */
    public FloatColumn getAngleAlpha() {
        return new DelegatingFloatColumn(parentBlock.getColumn("cell_angle_alpha"));
    }

    /**
     * Standard uncertainty of the angle between the bounding cell axes.
     * @return FloatColumn
     */
    public FloatColumn getAngleAlphaSu() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("cell_angle_alpha_esd", "cell_angle_alpha_su"));
    }

    /**
     * The angle between the bounding cell axes.
     * @return FloatColumn
     */
    public FloatColumn getAngleBeta() {
        return new DelegatingFloatColumn(parentBlock.getColumn("cell_angle_beta"));
    }

    /**
     * Standard uncertainty of the angle between the bounding cell axes.
     * @return FloatColumn
     */
    public FloatColumn getAngleBetaSu() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("cell_angle_beta_su", "cell_angle_beta_esd", "cell_angle_beta_su"));
    }

    /**
     * The angle between the bounding cell axes.
     * @return FloatColumn
     */
    public FloatColumn getAngleGamma() {
        return new DelegatingFloatColumn(parentBlock.getColumn("cell_angle_gamma"));
    }

    /**
     * Standard uncertainty of the angle between the bounding cell axes.
     * @return FloatColumn
     */
    public FloatColumn getAngleGammaSu() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("cell_angle_gamma_su", "cell_angle_gamma_esd", "cell_angle_gamma_su"));
    }

    /**
     * The length of each cell axis.
     * @return FloatColumn
     */
    public FloatColumn getLengthA() {
        return new DelegatingFloatColumn(parentBlock.getColumn("cell_length_a"));
    }

    /**
     * Standard uncertainty of the length of each cell axis.
     * @return FloatColumn
     */
    public FloatColumn getLengthASu() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("cell_length_a_esd", "cell_length_a_su"));
    }

    /**
     * The length of each cell axis.
     * @return FloatColumn
     */
    public FloatColumn getLengthB() {
        return new DelegatingFloatColumn(parentBlock.getColumn("cell_length_b"));
    }

    /**
     * Standard uncertainty of the length of each cell axis.
     * @return FloatColumn
     */
    public FloatColumn getLengthBSu() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("cell_length_b_esd", "cell_length_b_su"));
    }

    /**
     * The length of each cell axis.
     * @return FloatColumn
     */
    public FloatColumn getLengthC() {
        return new DelegatingFloatColumn(parentBlock.getColumn("cell_length_c"));
    }

    /**
     * Standard uncertainty of the length of each cell axis.
     * @return FloatColumn
     */
    public FloatColumn getLengthCSu() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("cell_length_c_esd", "cell_length_c_su"));
    }

    /**
     * The reciprocal space matrix for converting the U(ij) matrix of
     * atomic displacement parameters to a dimensionless beta(IJ) matrix.
     * The adp factor in a structure factor expression:
     * 
     * t = exp -2pi**2 ( U11    h h a* a* + ...... 2 U23    k l b* c* )
     * t = exp - 0.25  ( B11    h h a* a* + ...... 2 B23    k l b* c* )
     * = exp -       ( beta11 h h + ............ 2 beta23 k l )
     * 
     * The conversion of the U or B matrices to the beta matrix
     * 
     * beta =   C U C   =    C B C /8pi**2
     * 
     * where C is conversion matrix defined here.
     * @return FloatColumn
     */
    public FloatColumn getConvertUijToBetaij() {
        return new DelegatingFloatColumn(parentBlock.getColumn("cell_convert_Uij_to_betaij"));
    }

    /**
     * The reciprocal space matrix for converting the isotropic Uiso
     * atomic displacement parameter to the anisotropic matrix Uij.
     * 
     * | 1            cos(gamma*)   cos(beta*)  |
     * U[i,j]  = Uiso * | cos(gamma*)  1             cos(alpha*) |
     * | cos(beta*)   cos(alpha*)   1           |
     * @return FloatColumn
     */
    public FloatColumn getConvertUisoToUij() {
        return new DelegatingFloatColumn(parentBlock.getColumn("cell_convert_Uiso_to_Uij"));
    }

    /**
     * The reciprocal (contravariant) metric tensor used to transform
     * vectors and coordinates from reciprocal space to real (direct)
     * space.
     * @return FloatColumn
     */
    public FloatColumn getReciprocalMetricTensor() {
        return new DelegatingFloatColumn(parentBlock.getColumn("cell_reciprocal_metric_tensor"));
    }

    /**
     * Orthogonal matrix of the reciprocal space. The matrix may be
     * used to transform the non-orthogonal vector h = (h,k,l) into
     * the orthogonal indices p = (p,q,r)
     * 
     * M h = p
     * @return FloatColumn
     */
    public FloatColumn getReciprocalOrthogonalMatrix() {
        return new DelegatingFloatColumn(parentBlock.getColumn("cell_reciprocal_orthogonal_matrix"));
    }

    /**
     * Reciprocal of the angle between _cell.length_b and _cell.length_c.
     * Ref: Buerger, M. J. (1942). X-ray Crystallography, p. 360.
     * New York: John Wiley &amp; Sons Inc.
     * @return FloatColumn
     */
    public FloatColumn getReciprocalAngleAlpha() {
        return new DelegatingFloatColumn(parentBlock.getColumn("cell_reciprocal_angle_alpha"));
    }

    /**
     * Standard Uncertainty of the
     * Reciprocal of the angle between _cell.length_b and _cell.length_c.
     * @return FloatColumn
     */
    public FloatColumn getReciprocalAngleAlphaSu() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("cell_reciprocal_angle_alpha_esd", "cell_reciprocal_angle_alpha_su"));
    }

    /**
     * Reciprocal of the angle between _cell.length_a and _cell.length_c.
     * Ref: Buerger, M. J. (1942). X-ray Crystallography, p. 360.
     * New York: John Wiley &amp; Sons Inc.
     * @return FloatColumn
     */
    public FloatColumn getReciprocalAngleBeta() {
        return new DelegatingFloatColumn(parentBlock.getColumn("cell_reciprocal_angle_beta"));
    }

    /**
     * Standard Uncertainty of the
     * Reciprocal of the angle between _cell.length_a and _cell.length_c.
     * @return FloatColumn
     */
    public FloatColumn getReciprocalAngleBetaSu() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("cell_reciprocal_angle_beta_esd", "cell_reciprocal_angle_beta_su"));
    }

    /**
     * Reciprocal of the angle between _cell.length_a and _cell.length_b.
     * Ref: Buerger, M. J. (1942). X-ray Crystallography, p. 360.
     * New York: John Wiley &amp; Sons Inc.
     * @return FloatColumn
     */
    public FloatColumn getReciprocalAngleGamma() {
        return new DelegatingFloatColumn(parentBlock.getColumn("cell_reciprocal_angle_gamma"));
    }

    /**
     * Standard Uncertainty of the
     * Reciprocal of the angle between _cell.length_a and _cell.length_b.
     * @return FloatColumn
     */
    public FloatColumn getReciprocalAngleGammaSu() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("cell_reciprocal_angle_gamma_esd", "cell_reciprocal_angle_gamma_su"));
    }

    /**
     * Reciprocal of the _cell.length_a.
     * @return FloatColumn
     */
    public FloatColumn getReciprocalLengthA() {
        return new DelegatingFloatColumn(parentBlock.getColumn("cell_reciprocal_length_a"));
    }

    /**
     * Standard Uncertainty of the reciprocal of the _cell.length_a.
     * @return FloatColumn
     */
    public FloatColumn getReciprocalLengthASu() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("cell_reciprocal_length_a_esd", "cell_reciprocal_length_a_su"));
    }

    /**
     * Reciprocal of the _cell.length_b.
     * @return FloatColumn
     */
    public FloatColumn getReciprocalLengthB() {
        return new DelegatingFloatColumn(parentBlock.getColumn("cell_reciprocal_length_b"));
    }

    /**
     * Standard Uncertainty of the reciprocal of the _cell.length_b.
     * @return FloatColumn
     */
    public FloatColumn getReciprocalLengthBSu() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("cell_reciprocal_length_b_esd", "cell_reciprocal_length_b_su"));
    }

    /**
     * Reciprocal of the _cell.length_c.
     * @return FloatColumn
     */
    public FloatColumn getReciprocalLengthC() {
        return new DelegatingFloatColumn(parentBlock.getColumn("cell_reciprocal_length_c"));
    }

    /**
     * Standard Uncertainty of the reciprocal of the _cell.length_c.
     * @return FloatColumn
     */
    public FloatColumn getReciprocalLengthCSu() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("cell_reciprocal_length_c_esd", "cell_reciprocal_length_c_su"));
    }

    /**
     * Reciprocal of the _cell.vector_a.
     * @return FloatColumn
     */
    public FloatColumn getReciprocalVectorA() {
        return new DelegatingFloatColumn(parentBlock.getColumn("cell_reciprocal_vector_a"));
    }

    /**
     * Reciprocal of the _cell.vector_b.
     * @return FloatColumn
     */
    public FloatColumn getReciprocalVectorB() {
        return new DelegatingFloatColumn(parentBlock.getColumn("cell_reciprocal_vector_b"));
    }

    /**
     * Reciprocal of the _cell.vector_c.
     * @return FloatColumn
     */
    public FloatColumn getReciprocalVectorC() {
        return new DelegatingFloatColumn(parentBlock.getColumn("cell_reciprocal_vector_c"));
    }

    /**
     * The cell vector along the x axis.
     * @return FloatColumn
     */
    public FloatColumn getVectorA() {
        return new DelegatingFloatColumn(parentBlock.getColumn("cell_vector_a"));
    }

    /**
     * The cell vector along the y axis.
     * @return FloatColumn
     */
    public FloatColumn getVectorB() {
        return new DelegatingFloatColumn(parentBlock.getColumn("cell_vector_b"));
    }

    /**
     * The cell vector along the z axis.
     * @return FloatColumn
     */
    public FloatColumn getVectorC() {
        return new DelegatingFloatColumn(parentBlock.getColumn("cell_vector_c"));
    }
}
