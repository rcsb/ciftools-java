package org.rcsb.cif.schema.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * The CATEGORY of data items used to describe the anisotropic atomic
 * displacement parameters of the atomic sites in a crystal structure.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class AtomSiteAniso extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "atom_site_aniso";

    public AtomSiteAniso(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
    }

    /**
     * These are the standard unitless anisotropic atomic displacement components
     * which appear in the structure factor term:
     * 
     * T = exp{-1 sum~i~ [ sum~j~ (β^ij^ h~i~ h~j~) ] }
     * 
     * h = the Miller indices
     * 
     * The unique elements of the real symmetric matrix are entered by row.
     * 
     * The IUCr Commission on Nomenclature recommends against the use
     * of β for reporting atomic displacement parameters; U is preferred .
     * 
     * Note that U^ij^ = β^ij^/(2 π^2^ a*~i~ a*~j~) = B^ij^/(8 π^2^) .
     * 
     *  Trueblood, K. N. et al. (1996). Acta Crystallogr. A52(5), 770-781.
     * @return FloatColumn
     */
    public FloatColumn getBeta11() {
        return new DelegatingFloatColumn(parentBlock.getColumn("atom_site_aniso_beta_11"));
    }

    /**
     * These are the standard uncertainty values (SU) for the standard
     * form of the β^ij^ anisotropic atomic displacement components (see
     * aniso_betaIJ). Because these values are TYPE measurand, the su values
     * may in practice be auto generated as part of the β^ij^ calculation.
     * @return FloatColumn
     */
    public FloatColumn getBeta11Su() {
        return new DelegatingFloatColumn(parentBlock.getColumn("atom_site_aniso_beta_11_su"));
    }

    /**
     * These are the standard unitless anisotropic atomic displacement components
     * which appear in the structure factor term:
     * 
     * T = exp{-1 sum~i~ [ sum~j~ (β^ij^ h~i~ h~j~) ] }
     * 
     * h = the Miller indices
     * 
     * The unique elements of the real symmetric matrix are entered by row.
     * 
     * The IUCr Commission on Nomenclature recommends against the use
     * of β for reporting atomic displacement parameters; U is preferred .
     * 
     * Note that U^ij^ = β^ij^/(2 π^2^ a*~i~ a*~j~) = B^ij^/(8 π^2^) .
     * 
     *  Trueblood, K. N. et al. (1996). Acta Crystallogr. A52(5), 770-781.
     * @return FloatColumn
     */
    public FloatColumn getBeta12() {
        return new DelegatingFloatColumn(parentBlock.getColumn("atom_site_aniso_beta_12"));
    }

    /**
     * These are the standard uncertainty values (SU) for the standard
     * form of the β^ij^ anisotropic atomic displacement components (see
     * aniso_betaIJ). Because these values are TYPE measurand, the su values
     * may in practice be auto generated as part of the β^ij^ calculation.
     * @return FloatColumn
     */
    public FloatColumn getBeta12Su() {
        return new DelegatingFloatColumn(parentBlock.getColumn("atom_site_aniso_beta_12_su"));
    }

    /**
     * These are the standard unitless anisotropic atomic displacement components
     * which appear in the structure factor term:
     * 
     * T = exp{-1 sum~i~ [ sum~j~ (β^ij^ h~i~ h~j~) ] }
     * 
     * h = the Miller indices
     * 
     * The unique elements of the real symmetric matrix are entered by row.
     * 
     * The IUCr Commission on Nomenclature recommends against the use
     * of β for reporting atomic displacement parameters; U is preferred .
     * 
     * Note that U^ij^ = β^ij^/(2 π^2^ a*~i~ a*~j~) = B^ij^/(8 π^2^) .
     * 
     *  Trueblood, K. N. et al. (1996). Acta Crystallogr. A52(5), 770-781.
     * @return FloatColumn
     */
    public FloatColumn getBeta13() {
        return new DelegatingFloatColumn(parentBlock.getColumn("atom_site_aniso_beta_13"));
    }

    /**
     * These are the standard uncertainty values (SU) for the standard
     * form of the β^ij^ anisotropic atomic displacement components (see
     * aniso_betaIJ). Because these values are TYPE measurand, the su values
     * may in practice be auto generated as part of the β^ij^ calculation.
     * @return FloatColumn
     */
    public FloatColumn getBeta13Su() {
        return new DelegatingFloatColumn(parentBlock.getColumn("atom_site_aniso_beta_13_su"));
    }

    /**
     * These are the standard unitless anisotropic atomic displacement components
     * which appear in the structure factor term:
     * 
     * T = exp{-1 sum~i~ [ sum~j~ (β^ij^ h~i~ h~j~) ] }
     * 
     * h = the Miller indices
     * 
     * The unique elements of the real symmetric matrix are entered by row.
     * 
     * The IUCr Commission on Nomenclature recommends against the use
     * of β for reporting atomic displacement parameters; U is preferred .
     * 
     * Note that U^ij^ = β^ij^/(2 π^2^ a*~i~ a*~j~) = B^ij^/(8 π^2^) .
     * 
     *  Trueblood, K. N. et al. (1996). Acta Crystallogr. A52(5), 770-781.
     * @return FloatColumn
     */
    public FloatColumn getBeta22() {
        return new DelegatingFloatColumn(parentBlock.getColumn("atom_site_aniso_beta_22"));
    }

    /**
     * These are the standard uncertainty values (SU) for the standard
     * form of the β^ij^ anisotropic atomic displacement components (see
     * aniso_betaIJ). Because these values are TYPE measurand, the su values
     * may in practice be auto generated as part of the β^ij^ calculation.
     * @return FloatColumn
     */
    public FloatColumn getBeta22Su() {
        return new DelegatingFloatColumn(parentBlock.getColumn("atom_site_aniso_beta_22_su"));
    }

    /**
     * These are the standard unitless anisotropic atomic displacement components
     * which appear in the structure factor term:
     * 
     * T = exp{-1 sum~i~ [ sum~j~ (β^ij^ h~i~ h~j~) ] }
     * 
     * h = the Miller indices
     * 
     * The unique elements of the real symmetric matrix are entered by row.
     * 
     * The IUCr Commission on Nomenclature recommends against the use
     * of β for reporting atomic displacement parameters; U is preferred .
     * 
     * Note that U^ij^ = β^ij^/(2 π^2^ a*~i~ a*~j~) = B^ij^/(8 π^2^) .
     * 
     *  Trueblood, K. N. et al. (1996). Acta Crystallogr. A52(5), 770-781.
     * @return FloatColumn
     */
    public FloatColumn getBeta23() {
        return new DelegatingFloatColumn(parentBlock.getColumn("atom_site_aniso_beta_23"));
    }

    /**
     * These are the standard uncertainty values (SU) for the standard
     * form of the β^ij^ anisotropic atomic displacement components (see
     * aniso_betaIJ). Because these values are TYPE measurand, the su values
     * may in practice be auto generated as part of the β^ij^ calculation.
     * @return FloatColumn
     */
    public FloatColumn getBeta23Su() {
        return new DelegatingFloatColumn(parentBlock.getColumn("atom_site_aniso_beta_23_su"));
    }

    /**
     * These are the standard unitless anisotropic atomic displacement components
     * which appear in the structure factor term:
     * 
     * T = exp{-1 sum~i~ [ sum~j~ (β^ij^ h~i~ h~j~) ] }
     * 
     * h = the Miller indices
     * 
     * The unique elements of the real symmetric matrix are entered by row.
     * 
     * The IUCr Commission on Nomenclature recommends against the use
     * of β for reporting atomic displacement parameters; U is preferred .
     * 
     * Note that U^ij^ = β^ij^/(2 π^2^ a*~i~ a*~j~) = B^ij^/(8 π^2^) .
     * 
     *  Trueblood, K. N. et al. (1996). Acta Crystallogr. A52(5), 770-781.
     * @return FloatColumn
     */
    public FloatColumn getBeta33() {
        return new DelegatingFloatColumn(parentBlock.getColumn("atom_site_aniso_beta_33"));
    }

    /**
     * These are the standard uncertainty values (SU) for the standard
     * form of the β^ij^ anisotropic atomic displacement components (see
     * aniso_betaIJ). Because these values are TYPE measurand, the su values
     * may in practice be auto generated as part of the β^ij^ calculation.
     * @return FloatColumn
     */
    public FloatColumn getBeta33Su() {
        return new DelegatingFloatColumn(parentBlock.getColumn("atom_site_aniso_beta_33_su"));
    }

    /**
     * The symmetric anisotropic atomic displacement matrix B.
     * @return FloatColumn
     */
    public FloatColumn getMatrixB() {
        return new DelegatingFloatColumn(parentBlock.getColumn("atom_site_aniso_matrix_b"));
    }

    /**
     * Standard uncertainty of _atom_site_aniso.matrix_B.
     * @return FloatColumn
     */
    public FloatColumn getMatrixBSu() {
        return new DelegatingFloatColumn(parentBlock.getColumn("atom_site_aniso_matrix_b_su"));
    }

    /**
     * The symmetric anisotropic atomic displacement matrix U.
     * @return FloatColumn
     */
    public FloatColumn getMatrixU() {
        return new DelegatingFloatColumn(parentBlock.getColumn("atom_site_aniso_matrix_u"));
    }

    /**
     * Standard uncertainty of _atom_site_aniso.matrix_U.
     * @return FloatColumn
     */
    public FloatColumn getMatrixUSu() {
        return new DelegatingFloatColumn(parentBlock.getColumn("atom_site_aniso_matrix_u_su"));
    }

    /**
     * A symbolic expression that indicates the symmetry-restricted form of the
     * components of the anisotropic displacement parameters of an atom, where the
     * tensor components are ordered as A11, A22, A33, A23, A13, A12.
     * @return StrColumn
     */
    public StrColumn getSymmform() {
        return new DelegatingStrColumn(parentBlock.getColumn("atom_site_aniso_symmform"));
    }

    /**
     * These are the standard anisotropic atomic displacement components, in
     * angstroms squared, which appear in the structure factor term:
     * 
     * T = exp{-1/4 sum~i~ [ sum~j~ (B^ij^ h~i~ h~j~ a*~i~ a*~j~) ] }
     * 
     * h = the Miller indices
     * a* = the reciprocal-space cell lengths
     * 
     * The unique elements of the real symmetric matrix are entered by row.
     * 
     * The IUCr Commission on Nomenclature recommends against the use of B for
     * reporting atomic displacement parameters. U, being directly proportional
     * to B, is preferred .
     * 
     * Note that U^ij^ = β^ij^/(2 π^2^ a*~i~ a*~j~) = B^ij^/(8 π^2^) .
     * 
     *  Trueblood, K. N. et al. (1996). Acta Crystallogr. A52(5), 770-781.
     * @return FloatColumn
     */
    public FloatColumn getB11() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_aniso_B[1][1]", "atom_site_anisotrop_B[1][1]", "atom_site_aniso_b_11"));
    }

    /**
     * These are the standard uncertainty values (SU) for the standard
     * form of the B^ij^ anisotropic atomic displacement components (see
     * aniso_BIJ). Because these values are TYPE measurand, the su values
     * may in practice be auto generated as part of the B^ij^ calculation.
     * @return FloatColumn
     */
    public FloatColumn getB11Esd() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_aniso_B[1][1]_esd", "atom_site_anisotrop_B[1][1]_esd", "atom_site_aniso_b_11_su"));
    }

    /**
     * These are the standard uncertainty values (SU) for the standard
     * form of the B^ij^ anisotropic atomic displacement components (see
     * aniso_BIJ). Because these values are TYPE measurand, the su values
     * may in practice be auto generated as part of the B^ij^ calculation.
     * @return FloatColumn
     */
    public FloatColumn getB11Su() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_aniso_B[1][1]_esd", "atom_site_anisotrop_B[1][1]_esd", "atom_site_aniso_b_11_su"));
    }

    /**
     * These are the standard anisotropic atomic displacement components, in
     * angstroms squared, which appear in the structure factor term:
     * 
     * T = exp{-1/4 sum~i~ [ sum~j~ (B^ij^ h~i~ h~j~ a*~i~ a*~j~) ] }
     * 
     * h = the Miller indices
     * a* = the reciprocal-space cell lengths
     * 
     * The unique elements of the real symmetric matrix are entered by row.
     * 
     * The IUCr Commission on Nomenclature recommends against the use of B for
     * reporting atomic displacement parameters. U, being directly proportional
     * to B, is preferred .
     * 
     * Note that U^ij^ = β^ij^/(2 π^2^ a*~i~ a*~j~) = B^ij^/(8 π^2^) .
     * 
     *  Trueblood, K. N. et al. (1996). Acta Crystallogr. A52(5), 770-781.
     * @return FloatColumn
     */
    public FloatColumn getB12() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_aniso_B[1][2]", "atom_site_anisotrop_B[1][2]", "atom_site_aniso_b_12"));
    }

    /**
     * These are the standard uncertainty values (SU) for the standard
     * form of the B^ij^ anisotropic atomic displacement components (see
     * aniso_BIJ). Because these values are TYPE measurand, the su values
     * may in practice be auto generated as part of the B^ij^ calculation.
     * @return FloatColumn
     */
    public FloatColumn getB12Esd() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_aniso_B[1][2]_esd", "atom_site_anisotrop_B[1][2]_esd", "atom_site_aniso_b_12_su"));
    }

    /**
     * These are the standard uncertainty values (SU) for the standard
     * form of the B^ij^ anisotropic atomic displacement components (see
     * aniso_BIJ). Because these values are TYPE measurand, the su values
     * may in practice be auto generated as part of the B^ij^ calculation.
     * @return FloatColumn
     */
    public FloatColumn getB12Su() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_aniso_B[1][2]_esd", "atom_site_anisotrop_B[1][2]_esd", "atom_site_aniso_b_12_su"));
    }

    /**
     * These are the standard anisotropic atomic displacement components, in
     * angstroms squared, which appear in the structure factor term:
     * 
     * T = exp{-1/4 sum~i~ [ sum~j~ (B^ij^ h~i~ h~j~ a*~i~ a*~j~) ] }
     * 
     * h = the Miller indices
     * a* = the reciprocal-space cell lengths
     * 
     * The unique elements of the real symmetric matrix are entered by row.
     * 
     * The IUCr Commission on Nomenclature recommends against the use of B for
     * reporting atomic displacement parameters. U, being directly proportional
     * to B, is preferred .
     * 
     * Note that U^ij^ = β^ij^/(2 π^2^ a*~i~ a*~j~) = B^ij^/(8 π^2^) .
     * 
     *  Trueblood, K. N. et al. (1996). Acta Crystallogr. A52(5), 770-781.
     * @return FloatColumn
     */
    public FloatColumn getB13() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_aniso_B[1][3]", "atom_site_anisotrop_B[1][3]", "atom_site_aniso_b_13"));
    }

    /**
     * These are the standard uncertainty values (SU) for the standard
     * form of the B^ij^ anisotropic atomic displacement components (see
     * aniso_BIJ). Because these values are TYPE measurand, the su values
     * may in practice be auto generated as part of the B^ij^ calculation.
     * @return FloatColumn
     */
    public FloatColumn getB13Esd() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_aniso_B[1][3]_esd", "atom_site_anisotrop_B[1][3]_esd", "atom_site_aniso_b_13_su"));
    }

    /**
     * These are the standard uncertainty values (SU) for the standard
     * form of the B^ij^ anisotropic atomic displacement components (see
     * aniso_BIJ). Because these values are TYPE measurand, the su values
     * may in practice be auto generated as part of the B^ij^ calculation.
     * @return FloatColumn
     */
    public FloatColumn getB13Su() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_aniso_B[1][3]_esd", "atom_site_anisotrop_B[1][3]_esd", "atom_site_aniso_b_13_su"));
    }

    /**
     * These are the standard anisotropic atomic displacement components, in
     * angstroms squared, which appear in the structure factor term:
     * 
     * T = exp{-1/4 sum~i~ [ sum~j~ (B^ij^ h~i~ h~j~ a*~i~ a*~j~) ] }
     * 
     * h = the Miller indices
     * a* = the reciprocal-space cell lengths
     * 
     * The unique elements of the real symmetric matrix are entered by row.
     * 
     * The IUCr Commission on Nomenclature recommends against the use of B for
     * reporting atomic displacement parameters. U, being directly proportional
     * to B, is preferred .
     * 
     * Note that U^ij^ = β^ij^/(2 π^2^ a*~i~ a*~j~) = B^ij^/(8 π^2^) .
     * 
     *  Trueblood, K. N. et al. (1996). Acta Crystallogr. A52(5), 770-781.
     * @return FloatColumn
     */
    public FloatColumn getB22() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_aniso_B[2][2]", "atom_site_anisotrop_B[2][2]", "atom_site_aniso_b_22"));
    }

    /**
     * These are the standard uncertainty values (SU) for the standard
     * form of the B^ij^ anisotropic atomic displacement components (see
     * aniso_BIJ). Because these values are TYPE measurand, the su values
     * may in practice be auto generated as part of the B^ij^ calculation.
     * @return FloatColumn
     */
    public FloatColumn getB22Esd() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_aniso_B[2][2]_esd", "atom_site_anisotrop_B[2][2]_esd", "atom_site_aniso_b_22_su"));
    }

    /**
     * These are the standard uncertainty values (SU) for the standard
     * form of the B^ij^ anisotropic atomic displacement components (see
     * aniso_BIJ). Because these values are TYPE measurand, the su values
     * may in practice be auto generated as part of the B^ij^ calculation.
     * @return FloatColumn
     */
    public FloatColumn getB22Su() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_aniso_B[2][2]_esd", "atom_site_anisotrop_B[2][2]_esd", "atom_site_aniso_b_22_su"));
    }

    /**
     * These are the standard anisotropic atomic displacement components, in
     * angstroms squared, which appear in the structure factor term:
     * 
     * T = exp{-1/4 sum~i~ [ sum~j~ (B^ij^ h~i~ h~j~ a*~i~ a*~j~) ] }
     * 
     * h = the Miller indices
     * a* = the reciprocal-space cell lengths
     * 
     * The unique elements of the real symmetric matrix are entered by row.
     * 
     * The IUCr Commission on Nomenclature recommends against the use of B for
     * reporting atomic displacement parameters. U, being directly proportional
     * to B, is preferred .
     * 
     * Note that U^ij^ = β^ij^/(2 π^2^ a*~i~ a*~j~) = B^ij^/(8 π^2^) .
     * 
     *  Trueblood, K. N. et al. (1996). Acta Crystallogr. A52(5), 770-781.
     * @return FloatColumn
     */
    public FloatColumn getB23() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_aniso_B[2][3]", "atom_site_anisotrop_B[2][3]", "atom_site_aniso_b_23"));
    }

    /**
     * These are the standard uncertainty values (SU) for the standard
     * form of the B^ij^ anisotropic atomic displacement components (see
     * aniso_BIJ). Because these values are TYPE measurand, the su values
     * may in practice be auto generated as part of the B^ij^ calculation.
     * @return FloatColumn
     */
    public FloatColumn getB23Esd() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_aniso_B[2][3]_esd", "atom_site_anisotrop_B[2][3]_esd", "atom_site_aniso_b_23_su"));
    }

    /**
     * These are the standard uncertainty values (SU) for the standard
     * form of the B^ij^ anisotropic atomic displacement components (see
     * aniso_BIJ). Because these values are TYPE measurand, the su values
     * may in practice be auto generated as part of the B^ij^ calculation.
     * @return FloatColumn
     */
    public FloatColumn getB23Su() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_aniso_B[2][3]_esd", "atom_site_anisotrop_B[2][3]_esd", "atom_site_aniso_b_23_su"));
    }

    /**
     * These are the standard anisotropic atomic displacement components, in
     * angstroms squared, which appear in the structure factor term:
     * 
     * T = exp{-1/4 sum~i~ [ sum~j~ (B^ij^ h~i~ h~j~ a*~i~ a*~j~) ] }
     * 
     * h = the Miller indices
     * a* = the reciprocal-space cell lengths
     * 
     * The unique elements of the real symmetric matrix are entered by row.
     * 
     * The IUCr Commission on Nomenclature recommends against the use of B for
     * reporting atomic displacement parameters. U, being directly proportional
     * to B, is preferred .
     * 
     * Note that U^ij^ = β^ij^/(2 π^2^ a*~i~ a*~j~) = B^ij^/(8 π^2^) .
     * 
     *  Trueblood, K. N. et al. (1996). Acta Crystallogr. A52(5), 770-781.
     * @return FloatColumn
     */
    public FloatColumn getB33() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_aniso_B[3][3]", "atom_site_anisotrop_B[3][3]", "atom_site_aniso_b_33"));
    }

    /**
     * These are the standard uncertainty values (SU) for the standard
     * form of the B^ij^ anisotropic atomic displacement components (see
     * aniso_BIJ). Because these values are TYPE measurand, the su values
     * may in practice be auto generated as part of the B^ij^ calculation.
     * @return FloatColumn
     */
    public FloatColumn getB33Esd() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_aniso_B[3][3]_esd", "atom_site_anisotrop_B[3][3]_esd", "atom_site_aniso_b_33_su"));
    }

    /**
     * These are the standard uncertainty values (SU) for the standard
     * form of the B^ij^ anisotropic atomic displacement components (see
     * aniso_BIJ). Because these values are TYPE measurand, the su values
     * may in practice be auto generated as part of the B^ij^ calculation.
     * @return FloatColumn
     */
    public FloatColumn getB33Su() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_aniso_B[3][3]_esd", "atom_site_anisotrop_B[3][3]_esd", "atom_site_aniso_b_33_su"));
    }

    /**
     * Anisotropic atomic displacement parameters are usually looped in
     * a separate list. If this is the case, this code must match the
     * _atom_site.label of the associated atom in the atom coordinate
     * list and conform with the same rules described in _atom_site.label.
     * @return StrColumn
     */
    public StrColumn getId() {
        return new DelegatingStrColumn(parentBlock.getAliasedColumn("atom_site_anisotrop_id", "atom_site_aniso_label"));
    }

    /**
     * Anisotropic atomic displacement parameters are usually looped in
     * a separate list. If this is the case, this code must match the
     * _atom_site.label of the associated atom in the atom coordinate
     * list and conform with the same rules described in _atom_site.label.
     * @return StrColumn
     */
    public StrColumn getLabel() {
        return new DelegatingStrColumn(parentBlock.getAliasedColumn("atom_site_anisotrop_id", "atom_site_aniso_label"));
    }

    /**
     * The symmetric anisotropic atomic displacement parameter (ADP) matrix, β,
     * which appears in a structure factor expression.
     * 
     * The contribution of the ADPs to the calculation of the structure factor is
     * given as:
     * 
     * T = exp(-1 * Sum(Sum(β^ij^ * h~i~ * h~j~, j=1:3), i=1:3))
     * 
     * where β^ij^ are the matrix elements, and h~m~ are the Miller indices.
     * 
     * The ADP matrix β, is related to the ADP matrices U and B, as follows:
     * 
     * |a~1~*   0     0  |   |t^11^ t^12^ t^13^|   |a~1~*   0     0  |
     * β = C * |  0   a~2~*   0  | * |t^12^ t^22^ t^23^| * |  0   a~2~*   0  |
     * |  0     0   a~3~*|   |t^13^ t^23^ t^33^|   |  0     0   a~3~*|
     * 
     * where C is a constant (2 * π^2^ for U, and 0.25 for B), a~i~* is the
     * length of the respective reciprocal unit cell vector, and t represents
     * the individual anisotropic values, U^ij^ or B^ij^.
     * @return FloatColumn
     */
    public FloatColumn getMatrixBeta() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_tensor_beta", "atom_site_aniso_matrix_beta"));
    }

    /**
     * Standard uncertainty of _atom_site_aniso.matrix_beta.
     * @return FloatColumn
     */
    public FloatColumn getMatrixBetaSu() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_tensor_beta_su", "atom_site_aniso_matrix_beta_su"));
    }

    /**
     * Ratio of the maximum to minimum eigenvalues of the atomic displacement
     * ellipsoids.
     * @return FloatColumn
     */
    public FloatColumn getRatio() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_anisotrop_ratio", "atom_site_aniso_ratio"));
    }

    /**
     * This _atom_type.symbol code links the anisotropic atomic displacement
     * parameters to the atom type data associated with this site and must match
     * one of the _atom_type.symbol codes in this list.
     * @return StrColumn
     */
    public StrColumn getTypeSymbol() {
        return new DelegatingStrColumn(parentBlock.getAliasedColumn("atom_site_anisotrop_type_symbol", "atom_site_aniso_type_symbol"));
    }

    /**
     * These are the standard anisotropic atomic displacement components, in
     * angstroms squared, which appear in the structure factor term:
     * 
     * T = exp{ -2π^2^ sum~i~ [ sum~j~ (U^ij^ h~i~ h~j~ a*~i~ a*~j~) ] }
     * 
     * h = the Miller indices
     * a* = the reciprocal-space cell lengths
     * 
     * The unique elements of the real symmetric matrix are entered by row.
     * 
     * The IUCr Commission on Nomenclature recommends the use of U for reporting
     * atomic displacement parameters .
     * 
     * Note that U^ij^ = β^ij^/(2 π^2^ a*~i~ a*~j~) = B^ij^/(8 π^2^) .
     * 
     *  Trueblood, K. N. et al. (1996). Acta Crystallogr. A52(5), 770-781.
     * @return FloatColumn
     */
    public FloatColumn getU11() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_aniso_U[1][1]", "atom_site_anisotrop_U[1][1]", "atom_site_aniso_u_11"));
    }

    /**
     * These are the standard uncertainty values (SU) for the standard
     * form of the U^ij^ anisotropic atomic displacement components (see
     * aniso_UIJ). Because these values are TYPE measurand, the su values
     * may in practice be auto generated as part of the U^ij^ calculation.
     * @return FloatColumn
     */
    public FloatColumn getU11Esd() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_aniso_U[1][1]_esd", "atom_site_anisotrop_U[1][1]_esd", "atom_site_aniso_u_11_su"));
    }

    /**
     * These are the standard uncertainty values (SU) for the standard
     * form of the U^ij^ anisotropic atomic displacement components (see
     * aniso_UIJ). Because these values are TYPE measurand, the su values
     * may in practice be auto generated as part of the U^ij^ calculation.
     * @return FloatColumn
     */
    public FloatColumn getU11Su() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_aniso_U[1][1]_esd", "atom_site_anisotrop_U[1][1]_esd", "atom_site_aniso_u_11_su"));
    }

    /**
     * These are the standard anisotropic atomic displacement components, in
     * angstroms squared, which appear in the structure factor term:
     * 
     * T = exp{ -2π^2^ sum~i~ [ sum~j~ (U^ij^ h~i~ h~j~ a*~i~ a*~j~) ] }
     * 
     * h = the Miller indices
     * a* = the reciprocal-space cell lengths
     * 
     * The unique elements of the real symmetric matrix are entered by row.
     * 
     * The IUCr Commission on Nomenclature recommends the use of U for reporting
     * atomic displacement parameters .
     * 
     * Note that U^ij^ = β^ij^/(2 π^2^ a*~i~ a*~j~) = B^ij^/(8 π^2^) .
     * 
     *  Trueblood, K. N. et al. (1996). Acta Crystallogr. A52(5), 770-781.
     * @return FloatColumn
     */
    public FloatColumn getU12() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_aniso_U[1][2]", "atom_site_anisotrop_U[1][2]", "atom_site_aniso_u_12"));
    }

    /**
     * These are the standard uncertainty values (SU) for the standard
     * form of the U^ij^ anisotropic atomic displacement components (see
     * aniso_UIJ). Because these values are TYPE measurand, the su values
     * may in practice be auto generated as part of the U^ij^ calculation.
     * @return FloatColumn
     */
    public FloatColumn getU12Esd() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_aniso_U[1][2]_esd", "atom_site_anisotrop_U[1][2]_esd", "atom_site_aniso_u_12_su"));
    }

    /**
     * These are the standard uncertainty values (SU) for the standard
     * form of the U^ij^ anisotropic atomic displacement components (see
     * aniso_UIJ). Because these values are TYPE measurand, the su values
     * may in practice be auto generated as part of the U^ij^ calculation.
     * @return FloatColumn
     */
    public FloatColumn getU12Su() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_aniso_U[1][2]_esd", "atom_site_anisotrop_U[1][2]_esd", "atom_site_aniso_u_12_su"));
    }

    /**
     * These are the standard anisotropic atomic displacement components, in
     * angstroms squared, which appear in the structure factor term:
     * 
     * T = exp{ -2π^2^ sum~i~ [ sum~j~ (U^ij^ h~i~ h~j~ a*~i~ a*~j~) ] }
     * 
     * h = the Miller indices
     * a* = the reciprocal-space cell lengths
     * 
     * The unique elements of the real symmetric matrix are entered by row.
     * 
     * The IUCr Commission on Nomenclature recommends the use of U for reporting
     * atomic displacement parameters .
     * 
     * Note that U^ij^ = β^ij^/(2 π^2^ a*~i~ a*~j~) = B^ij^/(8 π^2^) .
     * 
     *  Trueblood, K. N. et al. (1996). Acta Crystallogr. A52(5), 770-781.
     * @return FloatColumn
     */
    public FloatColumn getU13() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_aniso_U[1][3]", "atom_site_anisotrop_U[1][3]", "atom_site_aniso_u_13"));
    }

    /**
     * These are the standard uncertainty values (SU) for the standard
     * form of the U^ij^ anisotropic atomic displacement components (see
     * aniso_UIJ). Because these values are TYPE measurand, the su values
     * may in practice be auto generated as part of the U^ij^ calculation.
     * @return FloatColumn
     */
    public FloatColumn getU13Esd() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_aniso_U[1][3]_esd", "atom_site_anisotrop_U[1][3]_esd", "atom_site_aniso_u_13_su"));
    }

    /**
     * These are the standard uncertainty values (SU) for the standard
     * form of the U^ij^ anisotropic atomic displacement components (see
     * aniso_UIJ). Because these values are TYPE measurand, the su values
     * may in practice be auto generated as part of the U^ij^ calculation.
     * @return FloatColumn
     */
    public FloatColumn getU13Su() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_aniso_U[1][3]_esd", "atom_site_anisotrop_U[1][3]_esd", "atom_site_aniso_u_13_su"));
    }

    /**
     * These are the standard anisotropic atomic displacement components, in
     * angstroms squared, which appear in the structure factor term:
     * 
     * T = exp{ -2π^2^ sum~i~ [ sum~j~ (U^ij^ h~i~ h~j~ a*~i~ a*~j~) ] }
     * 
     * h = the Miller indices
     * a* = the reciprocal-space cell lengths
     * 
     * The unique elements of the real symmetric matrix are entered by row.
     * 
     * The IUCr Commission on Nomenclature recommends the use of U for reporting
     * atomic displacement parameters .
     * 
     * Note that U^ij^ = β^ij^/(2 π^2^ a*~i~ a*~j~) = B^ij^/(8 π^2^) .
     * 
     *  Trueblood, K. N. et al. (1996). Acta Crystallogr. A52(5), 770-781.
     * @return FloatColumn
     */
    public FloatColumn getU22() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_aniso_U[2][2]", "atom_site_anisotrop_U[2][2]", "atom_site_aniso_u_22"));
    }

    /**
     * These are the standard uncertainty values (SU) for the standard
     * form of the U^ij^ anisotropic atomic displacement components (see
     * aniso_UIJ). Because these values are TYPE measurand, the su values
     * may in practice be auto generated as part of the U^ij^ calculation.
     * @return FloatColumn
     */
    public FloatColumn getU22Esd() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_aniso_U[2][2]_esd", "atom_site_anisotrop_U[2][2]_esd", "atom_site_aniso_u_22_su"));
    }

    /**
     * These are the standard uncertainty values (SU) for the standard
     * form of the U^ij^ anisotropic atomic displacement components (see
     * aniso_UIJ). Because these values are TYPE measurand, the su values
     * may in practice be auto generated as part of the U^ij^ calculation.
     * @return FloatColumn
     */
    public FloatColumn getU22Su() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_aniso_U[2][2]_esd", "atom_site_anisotrop_U[2][2]_esd", "atom_site_aniso_u_22_su"));
    }

    /**
     * These are the standard anisotropic atomic displacement components, in
     * angstroms squared, which appear in the structure factor term:
     * 
     * T = exp{ -2π^2^ sum~i~ [ sum~j~ (U^ij^ h~i~ h~j~ a*~i~ a*~j~) ] }
     * 
     * h = the Miller indices
     * a* = the reciprocal-space cell lengths
     * 
     * The unique elements of the real symmetric matrix are entered by row.
     * 
     * The IUCr Commission on Nomenclature recommends the use of U for reporting
     * atomic displacement parameters .
     * 
     * Note that U^ij^ = β^ij^/(2 π^2^ a*~i~ a*~j~) = B^ij^/(8 π^2^) .
     * 
     *  Trueblood, K. N. et al. (1996). Acta Crystallogr. A52(5), 770-781.
     * @return FloatColumn
     */
    public FloatColumn getU23() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_aniso_U[2][3]", "atom_site_anisotrop_U[2][3]", "atom_site_aniso_u_23"));
    }

    /**
     * These are the standard uncertainty values (SU) for the standard
     * form of the U^ij^ anisotropic atomic displacement components (see
     * aniso_UIJ). Because these values are TYPE measurand, the su values
     * may in practice be auto generated as part of the U^ij^ calculation.
     * @return FloatColumn
     */
    public FloatColumn getU23Esd() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_aniso_U[2][3]_esd", "atom_site_anisotrop_U[2][3]_esd", "atom_site_aniso_u_23_su"));
    }

    /**
     * These are the standard uncertainty values (SU) for the standard
     * form of the U^ij^ anisotropic atomic displacement components (see
     * aniso_UIJ). Because these values are TYPE measurand, the su values
     * may in practice be auto generated as part of the U^ij^ calculation.
     * @return FloatColumn
     */
    public FloatColumn getU23Su() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_aniso_U[2][3]_esd", "atom_site_anisotrop_U[2][3]_esd", "atom_site_aniso_u_23_su"));
    }

    /**
     * These are the standard anisotropic atomic displacement components, in
     * angstroms squared, which appear in the structure factor term:
     * 
     * T = exp{ -2π^2^ sum~i~ [ sum~j~ (U^ij^ h~i~ h~j~ a*~i~ a*~j~) ] }
     * 
     * h = the Miller indices
     * a* = the reciprocal-space cell lengths
     * 
     * The unique elements of the real symmetric matrix are entered by row.
     * 
     * The IUCr Commission on Nomenclature recommends the use of U for reporting
     * atomic displacement parameters .
     * 
     * Note that U^ij^ = β^ij^/(2 π^2^ a*~i~ a*~j~) = B^ij^/(8 π^2^) .
     * 
     *  Trueblood, K. N. et al. (1996). Acta Crystallogr. A52(5), 770-781.
     * @return FloatColumn
     */
    public FloatColumn getU33() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_aniso_U[3][3]", "atom_site_anisotrop_U[3][3]", "atom_site_aniso_u_33"));
    }

    /**
     * These are the standard uncertainty values (SU) for the standard
     * form of the U^ij^ anisotropic atomic displacement components (see
     * aniso_UIJ). Because these values are TYPE measurand, the su values
     * may in practice be auto generated as part of the U^ij^ calculation.
     * @return FloatColumn
     */
    public FloatColumn getU33Esd() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_aniso_U[3][3]_esd", "atom_site_anisotrop_U[3][3]_esd", "atom_site_aniso_u_33_su"));
    }

    /**
     * These are the standard uncertainty values (SU) for the standard
     * form of the U^ij^ anisotropic atomic displacement components (see
     * aniso_UIJ). Because these values are TYPE measurand, the su values
     * may in practice be auto generated as part of the U^ij^ calculation.
     * @return FloatColumn
     */
    public FloatColumn getU33Su() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_aniso_U[3][3]_esd", "atom_site_anisotrop_U[3][3]_esd", "atom_site_aniso_u_33_su"));
    }

}