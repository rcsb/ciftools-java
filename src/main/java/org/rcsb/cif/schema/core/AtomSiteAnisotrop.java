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
     * These are the standard anisotropic atomic displacement components
     * in angstroms squared which appear in the structure factor term:
     * 
     * T = exp{-1/4 sum~i~ [ sum~j~ (B^ij^ h~i~ h~j~ a*~i~ a*~j~) ] }
     * 
     * h = the Miller indices
     * a* = the reciprocal-space cell lengths
     * The unique elements of the real symmetric matrix are entered by row.
     * 
     * The IUCr Commission on Nomenclature recommends against the use
     * of B for reporting atomic displacement parameters. U, being
     * directly proportional to B, is preferred.
     * @return FloatColumn
     */
    public FloatColumn getB11() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_aniso_B[1][1]", "atom_site_anisotrop_B[1][1]", "atom_site_aniso_B_11"));
    }

    /**
     * These are the standard uncertainty values (SU) for the standard
     * form of the Bij anisotropic atomic displacement components (see
     * _aniso_BIJ. Because these values are TYPE measurand, the su values
     * may in practice be auto generated as part of the Bij calculation.
     * @return FloatColumn
     */
    public FloatColumn getB11Esd() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_aniso_B[1][1]_esd", "atom_site_anisotrop_B[1][1]_esd", "atom_site_aniso_B_11_su"));
    }

    /**
     * These are the standard anisotropic atomic displacement components
     * in angstroms squared which appear in the structure factor term:
     * 
     * T = exp{-1/4 sum~i~ [ sum~j~ (B^ij^ h~i~ h~j~ a*~i~ a*~j~) ] }
     * 
     * h = the Miller indices
     * a* = the reciprocal-space cell lengths
     * The unique elements of the real symmetric matrix are entered by row.
     * 
     * The IUCr Commission on Nomenclature recommends against the use
     * of B for reporting atomic displacement parameters. U, being
     * directly proportional to B, is preferred.
     * @return FloatColumn
     */
    public FloatColumn getB12() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_aniso_B[1][2]", "atom_site_anisotrop_B[1][2]", "atom_site_aniso_B_12"));
    }

    /**
     * These are the standard uncertainty values (SU) for the standard
     * form of the Bij anisotropic atomic displacement components (see
     * _aniso_BIJ. Because these values are TYPE measurand, the su values
     * may in practice be auto generated as part of the Bij calculation.
     * @return FloatColumn
     */
    public FloatColumn getB12Esd() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_aniso_B[1][2]_esd", "atom_site_anisotrop_B[1][2]_esd", "atom_site_aniso_B_12_su"));
    }

    /**
     * These are the standard anisotropic atomic displacement components
     * in angstroms squared which appear in the structure factor term:
     * 
     * T = exp{-1/4 sum~i~ [ sum~j~ (B^ij^ h~i~ h~j~ a*~i~ a*~j~) ] }
     * 
     * h = the Miller indices
     * a* = the reciprocal-space cell lengths
     * The unique elements of the real symmetric matrix are entered by row.
     * 
     * The IUCr Commission on Nomenclature recommends against the use
     * of B for reporting atomic displacement parameters. U, being
     * directly proportional to B, is preferred.
     * @return FloatColumn
     */
    public FloatColumn getB13() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_aniso_B[1][3]", "atom_site_anisotrop_B[1][3]", "atom_site_aniso_B_13"));
    }

    /**
     * These are the standard uncertainty values (SU) for the standard
     * form of the Bij anisotropic atomic displacement components (see
     * _aniso_BIJ. Because these values are TYPE measurand, the su values
     * may in practice be auto generated as part of the Bij calculation.
     * @return FloatColumn
     */
    public FloatColumn getB13Esd() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_aniso_B[1][3]_esd", "atom_site_anisotrop_B[1][3]_esd", "atom_site_aniso_B_13_su"));
    }

    /**
     * These are the standard anisotropic atomic displacement components
     * in angstroms squared which appear in the structure factor term:
     * 
     * T = exp{-1/4 sum~i~ [ sum~j~ (B^ij^ h~i~ h~j~ a*~i~ a*~j~) ] }
     * 
     * h = the Miller indices
     * a* = the reciprocal-space cell lengths
     * The unique elements of the real symmetric matrix are entered by row.
     * 
     * The IUCr Commission on Nomenclature recommends against the use
     * of B for reporting atomic displacement parameters. U, being
     * directly proportional to B, is preferred.
     * @return FloatColumn
     */
    public FloatColumn getB22() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_aniso_B[2][2]", "atom_site_anisotrop_B[2][2]", "atom_site_aniso_B_22"));
    }

    /**
     * These are the standard uncertainty values (SU) for the standard
     * form of the Bij anisotropic atomic displacement components (see
     * _aniso_BIJ. Because these values are TYPE measurand, the su values
     * may in practice be auto generated as part of the Bij calculation.
     * @return FloatColumn
     */
    public FloatColumn getB22Esd() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_aniso_B[2][2]_esd", "atom_site_anisotrop_B[2][2]_esd", "atom_site_aniso_B_22_su"));
    }

    /**
     * These are the standard anisotropic atomic displacement components
     * in angstroms squared which appear in the structure factor term:
     * 
     * T = exp{-1/4 sum~i~ [ sum~j~ (B^ij^ h~i~ h~j~ a*~i~ a*~j~) ] }
     * 
     * h = the Miller indices
     * a* = the reciprocal-space cell lengths
     * The unique elements of the real symmetric matrix are entered by row.
     * 
     * The IUCr Commission on Nomenclature recommends against the use
     * of B for reporting atomic displacement parameters. U, being
     * directly proportional to B, is preferred.
     * @return FloatColumn
     */
    public FloatColumn getB23() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_aniso_B[2][3]", "atom_site_anisotrop_B[2][3]", "atom_site_aniso_B_23"));
    }

    /**
     * These are the standard uncertainty values (SU) for the standard
     * form of the Bij anisotropic atomic displacement components (see
     * _aniso_BIJ. Because these values are TYPE measurand, the su values
     * may in practice be auto generated as part of the Bij calculation.
     * @return FloatColumn
     */
    public FloatColumn getB23Esd() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_aniso_B[2][3]_esd", "atom_site_anisotrop_B[2][3]_esd", "atom_site_aniso_B_23_su"));
    }

    /**
     * These are the standard anisotropic atomic displacement components
     * in angstroms squared which appear in the structure factor term:
     * 
     * T = exp{-1/4 sum~i~ [ sum~j~ (B^ij^ h~i~ h~j~ a*~i~ a*~j~) ] }
     * 
     * h = the Miller indices
     * a* = the reciprocal-space cell lengths
     * The unique elements of the real symmetric matrix are entered by row.
     * 
     * The IUCr Commission on Nomenclature recommends against the use
     * of B for reporting atomic displacement parameters. U, being
     * directly proportional to B, is preferred.
     * @return FloatColumn
     */
    public FloatColumn getB33() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_aniso_B[3][3]", "atom_site_anisotrop_B[3][3]", "atom_site_aniso_B_33"));
    }

    /**
     * These are the standard uncertainty values (SU) for the standard
     * form of the Bij anisotropic atomic displacement components (see
     * _aniso_BIJ. Because these values are TYPE measurand, the su values
     * may in practice be auto generated as part of the Bij calculation.
     * @return FloatColumn
     */
    public FloatColumn getB33Esd() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_aniso_B[3][3]_esd", "atom_site_anisotrop_B[3][3]_esd", "atom_site_aniso_B_33_su"));
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
     * Ratio of the maximum to minimum eigenvalues of the atomic
     * displacement (thermal) ellipsoids.
     * @return FloatColumn
     */
    public FloatColumn getRatio() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_anisotrop_ratio", "atom_site_aniso_ratio"));
    }

    /**
     * This _atom_type.symbol code links the anisotropic atom parameters to
     * the atom type data associated with this site and must match one of
     * the _atom_type.symbol codes in this list.
     * @return StrColumn
     */
    public StrColumn getTypeSymbol() {
        return new DelegatingStrColumn(parentBlock.getAliasedColumn("atom_site_anisotrop_type_symbol", "atom_site_aniso_type_symbol"));
    }

    /**
     * These are the standard anisotropic atomic displacement
     * components in angstroms squared which appear in the
     * structure factor term:
     * 
     * T = exp{-2pi^2^ sum~i~ [sum~j~ (U^ij^ h~i~ h~j~ a*~i~ a*~j~) ] }
     * 
     * h = the Miller indices
     * a* = the reciprocal-space cell lengths
     * 
     * The unique elements of the real symmetric matrix are entered by row.
     * @return FloatColumn
     */
    public FloatColumn getU11() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_aniso_U[1][1]", "atom_site_anisotrop_U[1][1]", "atom_site_aniso_U_11"));
    }

    /**
     * These are the standard uncertainty values (SU) for the standard
     * form of the Uij anisotropic atomic displacement components (see
     * _aniso_UIJ. Because these values are TYPE measurand, the su values
     * may in practice be auto generated as part of the Uij calculation.
     * @return FloatColumn
     */
    public FloatColumn getU11Esd() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_aniso_U[1][1]_esd", "atom_site_anisotrop_U[1][1]_esd", "atom_site_aniso_U_11_su"));
    }

    /**
     * These are the standard anisotropic atomic displacement
     * components in angstroms squared which appear in the
     * structure factor term:
     * 
     * T = exp{-2pi^2^ sum~i~ [sum~j~ (U^ij^ h~i~ h~j~ a*~i~ a*~j~) ] }
     * 
     * h = the Miller indices
     * a* = the reciprocal-space cell lengths
     * 
     * The unique elements of the real symmetric matrix are entered by row.
     * @return FloatColumn
     */
    public FloatColumn getU12() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_aniso_U[1][2]", "atom_site_anisotrop_U[1][2]", "atom_site_aniso_U_12"));
    }

    /**
     * These are the standard uncertainty values (SU) for the standard
     * form of the Uij anisotropic atomic displacement components (see
     * _aniso_UIJ. Because these values are TYPE measurand, the su values
     * may in practice be auto generated as part of the Uij calculation.
     * @return FloatColumn
     */
    public FloatColumn getU12Esd() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_aniso_U[1][2]_esd", "atom_site_anisotrop_U[1][2]_esd", "atom_site_aniso_U_12_su"));
    }

    /**
     * These are the standard anisotropic atomic displacement
     * components in angstroms squared which appear in the
     * structure factor term:
     * 
     * T = exp{-2pi^2^ sum~i~ [sum~j~ (U^ij^ h~i~ h~j~ a*~i~ a*~j~) ] }
     * 
     * h = the Miller indices
     * a* = the reciprocal-space cell lengths
     * 
     * The unique elements of the real symmetric matrix are entered by row.
     * @return FloatColumn
     */
    public FloatColumn getU13() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_aniso_U[1][3]", "atom_site_anisotrop_U[1][3]", "atom_site_aniso_U_13"));
    }

    /**
     * These are the standard uncertainty values (SU) for the standard
     * form of the Uij anisotropic atomic displacement components (see
     * _aniso_UIJ. Because these values are TYPE measurand, the su values
     * may in practice be auto generated as part of the Uij calculation.
     * @return FloatColumn
     */
    public FloatColumn getU13Esd() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_aniso_U[1][3]_esd", "atom_site_anisotrop_U[1][3]_esd", "atom_site_aniso_U_13_su"));
    }

    /**
     * These are the standard anisotropic atomic displacement
     * components in angstroms squared which appear in the
     * structure factor term:
     * 
     * T = exp{-2pi^2^ sum~i~ [sum~j~ (U^ij^ h~i~ h~j~ a*~i~ a*~j~) ] }
     * 
     * h = the Miller indices
     * a* = the reciprocal-space cell lengths
     * 
     * The unique elements of the real symmetric matrix are entered by row.
     * @return FloatColumn
     */
    public FloatColumn getU22() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_aniso_U[2][2]", "atom_site_anisotrop_U[2][2]", "atom_site_aniso_U_22"));
    }

    /**
     * These are the standard uncertainty values (SU) for the standard
     * form of the Uij anisotropic atomic displacement components (see
     * _aniso_UIJ. Because these values are TYPE measurand, the su values
     * may in practice be auto generated as part of the Uij calculation.
     * @return FloatColumn
     */
    public FloatColumn getU22Esd() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_aniso_U[2][2]_esd", "atom_site_anisotrop_U[2][2]_esd", "atom_site_aniso_U_22_su"));
    }

    /**
     * These are the standard anisotropic atomic displacement
     * components in angstroms squared which appear in the
     * structure factor term:
     * 
     * T = exp{-2pi^2^ sum~i~ [sum~j~ (U^ij^ h~i~ h~j~ a*~i~ a*~j~) ] }
     * 
     * h = the Miller indices
     * a* = the reciprocal-space cell lengths
     * 
     * The unique elements of the real symmetric matrix are entered by row.
     * @return FloatColumn
     */
    public FloatColumn getU23() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_aniso_U[2][3]", "atom_site_anisotrop_U[2][3]", "atom_site_aniso_U_23"));
    }

    /**
     * These are the standard uncertainty values (SU) for the standard
     * form of the Uij anisotropic atomic displacement components (see
     * _aniso_UIJ. Because these values are TYPE measurand, the su values
     * may in practice be auto generated as part of the Uij calculation.
     * @return FloatColumn
     */
    public FloatColumn getU23Esd() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_aniso_U[2][3]_esd", "atom_site_anisotrop_U[2][3]_esd", "atom_site_aniso_U_23_su"));
    }

    /**
     * These are the standard anisotropic atomic displacement
     * components in angstroms squared which appear in the
     * structure factor term:
     * 
     * T = exp{-2pi^2^ sum~i~ [sum~j~ (U^ij^ h~i~ h~j~ a*~i~ a*~j~) ] }
     * 
     * h = the Miller indices
     * a* = the reciprocal-space cell lengths
     * 
     * The unique elements of the real symmetric matrix are entered by row.
     * @return FloatColumn
     */
    public FloatColumn getU33() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_aniso_U[3][3]", "atom_site_anisotrop_U[3][3]", "atom_site_aniso_U_33"));
    }

    /**
     * These are the standard uncertainty values (SU) for the standard
     * form of the Uij anisotropic atomic displacement components (see
     * _aniso_UIJ. Because these values are TYPE measurand, the su values
     * may in practice be auto generated as part of the Uij calculation.
     * @return FloatColumn
     */
    public FloatColumn getU33Esd() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_aniso_U[3][3]_esd", "atom_site_anisotrop_U[3][3]_esd", "atom_site_aniso_U_33_su"));
    }

}