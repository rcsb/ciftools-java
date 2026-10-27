package org.rcsb.cif.schema.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * The category of data items used to describe the parameters of
 * the crystal unit cell.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class Cell extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "cell";

    public Cell(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
    }

    /**
     * The angle between the bounding cell axes.
     * @return FloatColumn
     */
    public FloatColumn getAngleAlpha() {
        return new DelegatingFloatColumn(parentBlock.getColumn("cell_angle_alpha"));
    }

    /**
     * The angle between the bounding cell axes.
     * @return FloatColumn
     */
    public FloatColumn getAngleBeta() {
        return new DelegatingFloatColumn(parentBlock.getColumn("cell_angle_beta"));
    }

    /**
     * The angle between the bounding cell axes.
     * @return FloatColumn
     */
    public FloatColumn getAngleGamma() {
        return new DelegatingFloatColumn(parentBlock.getColumn("cell_angle_gamma"));
    }

    /**
     * Atomic mass of the contents of the unit cell. This is calculated
     * from the atom sites present in the ATOM_TYPE list, rather than
     * the ATOM_SITE lists of atoms in the refined model.
     * @return FloatColumn
     */
    public FloatColumn getAtomicMass() {
        return new DelegatingFloatColumn(parentBlock.getColumn("cell_atomic_mass"));
    }

    /**
     * The reciprocal-space matrix for converting the U(ij) matrix of
     * atomic displacement parameters to a dimensionless beta(IJ) matrix.
     * The ADP factor in a structure-factor expression:
     * 
     * t = exp [ - 2π^2^ ( U11 h h a* a* + ...... 2 U23 k l b* c* ) ]
     * t = exp [ - 0.25  ( B11 h h a* a* + ...... 2 B23 k l b* c* ) ]
     * t = exp [ -       ( β11 h h + ............ 2 β23 k l ) ]
     * 
     * The conversion of the U or B matrices to the β matrix
     * 
     * β =   C U C   =    C B C /8π^2^
     * 
     * where C is the conversion matrix defined here.
     * @return FloatColumn
     */
    public FloatColumn getConvertUijToBetaij() {
        return new DelegatingFloatColumn(parentBlock.getColumn("cell_convert_uij_to_betaij"));
    }

    /**
     * Standard uncertainty of _cell.convert_Uij_to_betaij.
     * @return FloatColumn
     */
    public FloatColumn getConvertUijToBetaijSu() {
        return new DelegatingFloatColumn(parentBlock.getColumn("cell_convert_uij_to_betaij_su"));
    }

    /**
     * The reciprocal-space matrix for converting the isotropic Uiso
     * atomic displacement parameter to the anisotropic matrix Uij.
     * 
     * | 1        cos(γ*)  cos(β*) |
     * Uij   =   Uiso * | cos(γ*)  1        cos(α*) |
     * | cos(β*)  cos(α*)  1       |
     * @return FloatColumn
     */
    public FloatColumn getConvertUisoToUij() {
        return new DelegatingFloatColumn(parentBlock.getColumn("cell_convert_uiso_to_uij"));
    }

    /**
     * Standard uncertainty of _cell.convert_Uiso_to_Uij.
     * @return FloatColumn
     */
    public FloatColumn getConvertUisoToUijSu() {
        return new DelegatingFloatColumn(parentBlock.getColumn("cell_convert_uiso_to_uij_su"));
    }

    /**
     * The number of the formula units in the unit cell as specified
     * by _chemical_formula.structural, _chemical_formula.moiety or
     * _chemical_formula.sum. This is normally an integer value, but
     * in exceptional circumstances (Brock, 2025) may be reported as
     * non-integral.
     * 
     * Reference: Brock, C. P. (2025). Acta Cryst. A81, 405-408.
     * @return FloatColumn
     */
    public FloatColumn getFormulaUnitsZ() {
        return new DelegatingFloatColumn(parentBlock.getColumn("cell_formula_units_z"));
    }

    /**
     * The number Z of formula units in the unit cell is expected to
     * be an integer. In exceptional circumstances with complex chemistry
     * an author may report a fractional value of Z, as explained by the
     * IUCr Commission on Crystallographic Nomenclature (Brock, 2025). This
     * field is used to describe the justification for the value reported in
     * _cell.formula_units_Z.
     * 
     * Reference: Brock, C. P. (2025). Acta Cryst. A81, 405-408.
     * @return StrColumn
     */
    public StrColumn getFormulaUnitsZDetails() {
        return new DelegatingStrColumn(parentBlock.getColumn("cell_formula_units_z_details"));
    }

    /**
     * Z' specifies the number of molecules in the asymmetric unit.
     * It is defined as the number of formula units in the unit cell
     * (_cell.formula_units_Z) divided by the multiplicity of the
     * general position of the corresponding space group. Z' can be
     * a fraction or a positive integer.
     * 
     * Note that correct assignment of Z' may be difficult for some
     * complex structures (Flack, 2002; Steed et al., 2014). For such
     * cases a justification of the assigned value should be given in
     * _cell.formula_units_Z_prime_details.
     * 
     * Ref: Flack, H. D. (2002).
     * https://www.iucr.org/__data/iucr/lists/coredmg/msg00196.html
     * Steed, J. et al. (2014). https://zprime.co.uk/limitations
     * @return FloatColumn
     */
    public FloatColumn getFormulaUnitsZPrime() {
        return new DelegatingFloatColumn(parentBlock.getColumn("cell_formula_units_z_prime"));
    }

    /**
     * An account of the assigned value of Z', the number of molecules in
     * the asymmetric unit, where there is difficulty in deciding the
     * appropriate value for reasons of symmetry, chirality, disorder etc.
     * (Flack, 2002; Steed et al., 2014).
     * 
     * Ref: Flack, H. D. (2002).
     * https://www.iucr.org/__data/iucr/lists/coredmg/msg00196.html
     * Steed, J. et al. (2014). https://zprime.co.uk/limitations
     * @return StrColumn
     */
    public StrColumn getFormulaUnitsZPrimeDetails() {
        return new DelegatingStrColumn(parentBlock.getColumn("cell_formula_units_z_prime_details"));
    }

    /**
     * The length of each cell axis.
     * @return FloatColumn
     */
    public FloatColumn getLengthA() {
        return new DelegatingFloatColumn(parentBlock.getColumn("cell_length_a"));
    }

    /**
     * The length of each cell axis.
     * @return FloatColumn
     */
    public FloatColumn getLengthB() {
        return new DelegatingFloatColumn(parentBlock.getColumn("cell_length_b"));
    }

    /**
     * The length of each cell axis.
     * @return FloatColumn
     */
    public FloatColumn getLengthC() {
        return new DelegatingFloatColumn(parentBlock.getColumn("cell_length_c"));
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
     * Rollett's axial assignments with cell vectors a,b,c aligned
     * with orthogonal axes X,Y,Z so that c||Z and b in plane YZ.
     * 
     * Ref: Rollett, J. S. (1965). Computing Methods in Crystallography, p. 22.
     * Oxford: Pergamon Press.
     * @return FloatColumn
     */
    public FloatColumn getOrthogonalMatrix() {
        return new DelegatingFloatColumn(parentBlock.getColumn("cell_orthogonal_matrix"));
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
     * Reciprocal of the angle between _cell.length_a and _cell.length_c.
     * Ref: Buerger, M. J. (1942). X-ray Crystallography, p. 360.
     * New York: John Wiley &amp; Sons Inc.
     * @return FloatColumn
     */
    public FloatColumn getReciprocalAngleBeta() {
        return new DelegatingFloatColumn(parentBlock.getColumn("cell_reciprocal_angle_beta"));
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
     * Reciprocal of the _cell.length_a.
     * @return FloatColumn
     */
    public FloatColumn getReciprocalLengthA() {
        return new DelegatingFloatColumn(parentBlock.getColumn("cell_reciprocal_length_a"));
    }

    /**
     * Reciprocal of the _cell.length_b.
     * @return FloatColumn
     */
    public FloatColumn getReciprocalLengthB() {
        return new DelegatingFloatColumn(parentBlock.getColumn("cell_reciprocal_length_b"));
    }

    /**
     * Reciprocal of the _cell.length_c.
     * @return FloatColumn
     */
    public FloatColumn getReciprocalLengthC() {
        return new DelegatingFloatColumn(parentBlock.getColumn("cell_reciprocal_length_c"));
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
     * Standard uncertainty of _cell.reciprocal_metric_tensor.
     * @return FloatColumn
     */
    public FloatColumn getReciprocalMetricTensorSu() {
        return new DelegatingFloatColumn(parentBlock.getColumn("cell_reciprocal_metric_tensor_su"));
    }

    /**
     * Orthogonal matrix of the reciprocal space. The matrix may be
     * used to transform the non-orthogonal vector h = (h,k,l) into
     * the orthogonal indices p = (p,q,r):
     * 
     * M h = p.
     * @return FloatColumn
     */
    public FloatColumn getReciprocalOrthogonalMatrix() {
        return new DelegatingFloatColumn(parentBlock.getColumn("cell_reciprocal_orthogonal_matrix"));
    }

    /**
     * Standard uncertainty of _cell.reciprocal_orthogonal_matrix.
     * @return FloatColumn
     */
    public FloatColumn getReciprocalOrthogonalMatrixSu() {
        return new DelegatingFloatColumn(parentBlock.getColumn("cell_reciprocal_orthogonal_matrix_su"));
    }

    /**
     * Reciprocal of the _cell.vector_a.
     * @return FloatColumn
     */
    public FloatColumn getReciprocalVectorA() {
        return new DelegatingFloatColumn(parentBlock.getColumn("cell_reciprocal_vector_a"));
    }

    /**
     * Standard uncertainty of _cell.reciprocal_vector_a.
     * @return FloatColumn
     */
    public FloatColumn getReciprocalVectorASu() {
        return new DelegatingFloatColumn(parentBlock.getColumn("cell_reciprocal_vector_a_su"));
    }

    /**
     * Reciprocal of the _cell.vector_b.
     * @return FloatColumn
     */
    public FloatColumn getReciprocalVectorB() {
        return new DelegatingFloatColumn(parentBlock.getColumn("cell_reciprocal_vector_b"));
    }

    /**
     * Standard uncertainty of _cell.reciprocal_vector_b.
     * @return FloatColumn
     */
    public FloatColumn getReciprocalVectorBSu() {
        return new DelegatingFloatColumn(parentBlock.getColumn("cell_reciprocal_vector_b_su"));
    }

    /**
     * Reciprocal of the _cell.vector_c.
     * @return FloatColumn
     */
    public FloatColumn getReciprocalVectorC() {
        return new DelegatingFloatColumn(parentBlock.getColumn("cell_reciprocal_vector_c"));
    }

    /**
     * Standard uncertainty of _cell.reciprocal_vector_c.
     * @return FloatColumn
     */
    public FloatColumn getReciprocalVectorCSu() {
        return new DelegatingFloatColumn(parentBlock.getColumn("cell_reciprocal_vector_c_su"));
    }

    /**
     * The cell vector along the x axis.
     * @return FloatColumn
     */
    public FloatColumn getVectorA() {
        return new DelegatingFloatColumn(parentBlock.getColumn("cell_vector_a"));
    }

    /**
     * Standard uncertainty of _cell.vector_a.
     * @return FloatColumn
     */
    public FloatColumn getVectorASu() {
        return new DelegatingFloatColumn(parentBlock.getColumn("cell_vector_a_su"));
    }

    /**
     * The cell vector along the y axis.
     * @return FloatColumn
     */
    public FloatColumn getVectorB() {
        return new DelegatingFloatColumn(parentBlock.getColumn("cell_vector_b"));
    }

    /**
     * Standard uncertainty of _cell.vector_b.
     * @return FloatColumn
     */
    public FloatColumn getVectorBSu() {
        return new DelegatingFloatColumn(parentBlock.getColumn("cell_vector_b_su"));
    }

    /**
     * The cell vector along the z axis.
     * @return FloatColumn
     */
    public FloatColumn getVectorC() {
        return new DelegatingFloatColumn(parentBlock.getColumn("cell_vector_c"));
    }

    /**
     * Standard uncertainty of _cell.vector_c.
     * @return FloatColumn
     */
    public FloatColumn getVectorCSu() {
        return new DelegatingFloatColumn(parentBlock.getColumn("cell_vector_c_su"));
    }

    /**
     * Volume of the crystal unit cell.
     * @return FloatColumn
     */
    public FloatColumn getVolume() {
        return new DelegatingFloatColumn(parentBlock.getColumn("cell_volume"));
    }

    /**
     * Standard uncertainty of the angle between the bounding cell axes.
     * @return FloatColumn
     */
    public FloatColumn getAngleAlphaEsd() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("cell_angle_alpha_esd", "cell_angle_alpha_su"));
    }

    /**
     * Standard uncertainty of the angle between the bounding cell axes.
     * @return FloatColumn
     */
    public FloatColumn getAngleAlphaSu() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("cell_angle_alpha_esd", "cell_angle_alpha_su"));
    }

    /**
     * Standard uncertainty of the angle between the bounding cell axes.
     * @return FloatColumn
     */
    public FloatColumn getAngleBetaEsd() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("cell_angle_beta_esd", "cell_angle_beta_su"));
    }

    /**
     * Standard uncertainty of the angle between the bounding cell axes.
     * @return FloatColumn
     */
    public FloatColumn getAngleBetaSu() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("cell_angle_beta_esd", "cell_angle_beta_su"));
    }

    /**
     * Standard uncertainty of the angle between the bounding cell axes.
     * @return FloatColumn
     */
    public FloatColumn getAngleGammaEsd() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("cell_angle_gamma_esd", "cell_angle_gamma_su"));
    }

    /**
     * Standard uncertainty of the angle between the bounding cell axes.
     * @return FloatColumn
     */
    public FloatColumn getAngleGammaSu() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("cell_angle_gamma_esd", "cell_angle_gamma_su"));
    }

    /**
     * Standard uncertainty of the length of each cell axis.
     * @return FloatColumn
     */
    public FloatColumn getLengthAEsd() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("cell_length_a_esd", "cell_length_a_su"));
    }

    /**
     * Standard uncertainty of the length of each cell axis.
     * @return FloatColumn
     */
    public FloatColumn getLengthASu() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("cell_length_a_esd", "cell_length_a_su"));
    }

    /**
     * Standard uncertainty of the length of each cell axis.
     * @return FloatColumn
     */
    public FloatColumn getLengthBEsd() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("cell_length_b_esd", "cell_length_b_su"));
    }

    /**
     * Standard uncertainty of the length of each cell axis.
     * @return FloatColumn
     */
    public FloatColumn getLengthBSu() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("cell_length_b_esd", "cell_length_b_su"));
    }

    /**
     * Standard uncertainty of the length of each cell axis.
     * @return FloatColumn
     */
    public FloatColumn getLengthCEsd() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("cell_length_c_esd", "cell_length_c_su"));
    }

    /**
     * Standard uncertainty of the length of each cell axis.
     * @return FloatColumn
     */
    public FloatColumn getLengthCSu() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("cell_length_c_esd", "cell_length_c_su"));
    }

    /**
     * Standard uncertainty of _cell.reciprocal_angle_alpha.
     * @return FloatColumn
     */
    public FloatColumn getReciprocalAngleAlphaEsd() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("cell_reciprocal_angle_alpha_esd", "cell_reciprocal_angle_alpha_su"));
    }

    /**
     * Standard uncertainty of _cell.reciprocal_angle_alpha.
     * @return FloatColumn
     */
    public FloatColumn getReciprocalAngleAlphaSu() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("cell_reciprocal_angle_alpha_esd", "cell_reciprocal_angle_alpha_su"));
    }

    /**
     * Standard uncertainty of _cell.reciprocal_angle_beta.
     * @return FloatColumn
     */
    public FloatColumn getReciprocalAngleBetaEsd() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("cell_reciprocal_angle_beta_esd", "cell_reciprocal_angle_beta_su"));
    }

    /**
     * Standard uncertainty of _cell.reciprocal_angle_beta.
     * @return FloatColumn
     */
    public FloatColumn getReciprocalAngleBetaSu() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("cell_reciprocal_angle_beta_esd", "cell_reciprocal_angle_beta_su"));
    }

    /**
     * Standard uncertainty of _cell.reciprocal_angle_gamma.
     * @return FloatColumn
     */
    public FloatColumn getReciprocalAngleGammaEsd() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("cell_reciprocal_angle_gamma_esd", "cell_reciprocal_angle_gamma_su"));
    }

    /**
     * Standard uncertainty of _cell.reciprocal_angle_gamma.
     * @return FloatColumn
     */
    public FloatColumn getReciprocalAngleGammaSu() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("cell_reciprocal_angle_gamma_esd", "cell_reciprocal_angle_gamma_su"));
    }

    /**
     * Standard uncertainty of _cell.reciprocal_length_a.
     * @return FloatColumn
     */
    public FloatColumn getReciprocalLengthAEsd() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("cell_reciprocal_length_a_esd", "cell_reciprocal_length_a_su"));
    }

    /**
     * Standard uncertainty of _cell.reciprocal_length_a.
     * @return FloatColumn
     */
    public FloatColumn getReciprocalLengthASu() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("cell_reciprocal_length_a_esd", "cell_reciprocal_length_a_su"));
    }

    /**
     * Standard uncertainty of _cell.reciprocal_length_b.
     * @return FloatColumn
     */
    public FloatColumn getReciprocalLengthBEsd() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("cell_reciprocal_length_b_esd", "cell_reciprocal_length_b_su"));
    }

    /**
     * Standard uncertainty of _cell.reciprocal_length_b.
     * @return FloatColumn
     */
    public FloatColumn getReciprocalLengthBSu() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("cell_reciprocal_length_b_esd", "cell_reciprocal_length_b_su"));
    }

    /**
     * Standard uncertainty of _cell.reciprocal_length_c.
     * @return FloatColumn
     */
    public FloatColumn getReciprocalLengthCEsd() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("cell_reciprocal_length_c_esd", "cell_reciprocal_length_c_su"));
    }

    /**
     * Standard uncertainty of _cell.reciprocal_length_c.
     * @return FloatColumn
     */
    public FloatColumn getReciprocalLengthCSu() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("cell_reciprocal_length_c_esd", "cell_reciprocal_length_c_su"));
    }

    /**
     * Description of special aspects of the cell choice, noting
     * possible alternative settings.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return new DelegatingStrColumn(parentBlock.getAliasedColumn("cell_details", "cell_special_details"));
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
     * Standard uncertainty of _cell.volume.
     * @return FloatColumn
     */
    public FloatColumn getVolumeEsd() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("cell_volume_esd", "cell_volume_su"));
    }

    /**
     * Standard uncertainty of _cell.volume.
     * @return FloatColumn
     */
    public FloatColumn getVolumeSu() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("cell_volume_esd", "cell_volume_su"));
    }

}