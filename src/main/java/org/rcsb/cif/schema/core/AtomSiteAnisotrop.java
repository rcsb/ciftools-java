package org.rcsb.cif.schema.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class AtomSiteAnisotrop extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "atom_site_anisotrop";

    public AtomSiteAnisotrop(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
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

}