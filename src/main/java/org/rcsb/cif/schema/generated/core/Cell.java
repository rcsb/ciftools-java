package org.rcsb.cif.schema.generated.core;

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
     * 
     * Atomic mass of the contents of the unit cell. This calculated
     * from the atom sites present in the ATOM_TYPE list, rather than
     * the ATOM_SITE lists of atoms in the refined model.
     * @return StrColumn
     */
    public StrColumn getAtomicMass() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_atomic_mass"));
    }

    /**
     * 
     * The number of the formula units in the unit cell as specified
     * by _chemical_formula.structural, _chemical_formula.moiety or
     * _chemical_formula.sum.
     * @return StrColumn
     */
    public StrColumn getFormulaUnitsZ() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_formula_units_Z"));
    }

    /**
     * 
     * The direct space (covariant) metric tensor used to transform
     * vectors and coordinates from real (direct) to reciprocal space.
     * @return StrColumn
     */
    public StrColumn getMetricTensor() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_metric_tensor"));
    }

    /**
     * 
     * Orthogonal matrix of the crystal unit cell. Definition uses
     * Rollet's axial assignments with cell vectors a,b,c aligned
     * with orthogonal axes X,Y,Z so that c||Z and b in plane YZ.
     * @return StrColumn
     */
    public StrColumn getOrthogonalMatrix() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_orthogonal_matrix"));
    }

    /**
     * 
     * Description of special aspects of the cell choice, noting
     * possible alternative settings.
     * @return StrColumn
     */
    public StrColumn getSpecialDetails() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_special_details"));
    }

    /**
     * 
     * Volume of the crystal unit cell.
     * @return StrColumn
     */
    public StrColumn getVolume() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_volume"));
    }

    /**
     * 
     * Standard uncertainty of the volume of the crystal unit cell.
     * @return StrColumn
     */
    public StrColumn getVolumeSu() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_volume_su"));
    }

    /**
     * 
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
     * @return StrColumn
     */
    public StrColumn getConvertUijToBetaij() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_convert_Uij_to_betaij"));
    }

    /**
     * 
     * The reciprocal space matrix for converting the isotropic Uiso
     * atomic displacement parameter to the anisotropic matrix Uij.
     * 
     * | 1            cos(gamma*)   cos(beta*)  |
     * U[i,j]  = Uiso * | cos(gamma*)  1             cos(alpha*) |
     * | cos(beta*)   cos(alpha*)   1           |
     * @return StrColumn
     */
    public StrColumn getConvertUisoToUij() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_convert_Uiso_to_Uij"));
    }

    /**
     * 
     * The reciprocal (contravariant) metric tensor used to transform
     * vectors and coordinates from reciprocal space to real (direct)
     * space.
     * @return StrColumn
     */
    public StrColumn getReciprocalMetricTensor() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_reciprocal_metric_tensor"));
    }

    /**
     * 
     * Orthogonal matrix of the reciprocal space. The matrix may be
     * used to transform the non-orthogonal vector h = (h,k,l) into
     * the orthogonal indices p = (p,q,r)
     * 
     * M h = p
     * @return StrColumn
     */
    public StrColumn getReciprocalOrthogonalMatrix() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_reciprocal_orthogonal_matrix"));
    }

    /**
     * 
     * Reciprocal of the angle between _cell.length_b and _cell.length_c.
     * Ref: Buerger, M. J. (1942). X-ray Crystallography, p. 360.
     * New York: John Wiley &amp; Sons Inc.
     * @return StrColumn
     */
    public StrColumn getReciprocalAngleAlpha() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_reciprocal_angle_alpha"));
    }

    /**
     * 
     * Standard Uncertainty of the
     * Reciprocal of the angle between _cell.length_b and _cell.length_c.
     * @return StrColumn
     */
    public StrColumn getReciprocalAngleAlphaSu() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_reciprocal_angle_alpha_su"));
    }

    /**
     * 
     * Reciprocal of the angle between _cell.length_a and _cell.length_c.
     * Ref: Buerger, M. J. (1942). X-ray Crystallography, p. 360.
     * New York: John Wiley &amp; Sons Inc.
     * @return StrColumn
     */
    public StrColumn getReciprocalAngleBeta() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_reciprocal_angle_beta"));
    }

    /**
     * 
     * Standard Uncertainty of the
     * Reciprocal of the angle between _cell.length_a and _cell.length_c.
     * @return StrColumn
     */
    public StrColumn getReciprocalAngleBetaSu() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_reciprocal_angle_beta_su"));
    }

    /**
     * 
     * Reciprocal of the angle between _cell.length_a and _cell.length_b.
     * Ref: Buerger, M. J. (1942). X-ray Crystallography, p. 360.
     * New York: John Wiley &amp; Sons Inc.
     * @return StrColumn
     */
    public StrColumn getReciprocalAngleGamma() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_reciprocal_angle_gamma"));
    }

    /**
     * 
     * Standard Uncertainty of the
     * Reciprocal of the angle between _cell.length_a and _cell.length_b.
     * @return StrColumn
     */
    public StrColumn getReciprocalAngleGammaSu() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_reciprocal_angle_gamma_su"));
    }

    /**
     * 
     * Reciprocal of the _cell.length_a.
     * @return StrColumn
     */
    public StrColumn getReciprocalLengthA() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_reciprocal_length_a"));
    }

    /**
     * 
     * Standard Uncertainty of the reciprocal of the _cell.length_a.
     * @return StrColumn
     */
    public StrColumn getReciprocalLengthASu() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_reciprocal_length_a_su"));
    }

    /**
     * 
     * Reciprocal of the _cell.length_b.
     * @return StrColumn
     */
    public StrColumn getReciprocalLengthB() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_reciprocal_length_b"));
    }

    /**
     * 
     * Standard Uncertainty of the reciprocal of the _cell.length_b.
     * @return StrColumn
     */
    public StrColumn getReciprocalLengthBSu() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_reciprocal_length_b_su"));
    }

    /**
     * 
     * Reciprocal of the _cell.length_c.
     * @return StrColumn
     */
    public StrColumn getReciprocalLengthC() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_reciprocal_length_c"));
    }

    /**
     * 
     * Standard Uncertainty of the reciprocal of the _cell.length_c.
     * @return StrColumn
     */
    public StrColumn getReciprocalLengthCSu() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_reciprocal_length_c_su"));
    }

    /**
     * 
     * Reciprocal of the _cell.vector_a.
     * @return StrColumn
     */
    public StrColumn getReciprocalVectorA() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_reciprocal_vector_a"));
    }

    /**
     * 
     * Reciprocal of the _cell.vector_b.
     * @return StrColumn
     */
    public StrColumn getReciprocalVectorB() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_reciprocal_vector_b"));
    }

    /**
     * 
     * Reciprocal of the _cell.vector_c.
     * @return StrColumn
     */
    public StrColumn getReciprocalVectorC() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_reciprocal_vector_c"));
    }

    /**
     * 
     * The cell vector along the x axis.
     * @return StrColumn
     */
    public StrColumn getVectorA() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_vector_a"));
    }

    /**
     * 
     * The cell vector along the y axis.
     * @return StrColumn
     */
    public StrColumn getVectorB() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_vector_b"));
    }

    /**
     * 
     * The cell vector along the z axis.
     * @return StrColumn
     */
    public StrColumn getVectorC() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_vector_c"));
    }

    public FloatColumn getLengthA() {
        return new DelegatingFloatColumn(parentBlock.getColumn(NAME + "_length_a"));
    }
}
