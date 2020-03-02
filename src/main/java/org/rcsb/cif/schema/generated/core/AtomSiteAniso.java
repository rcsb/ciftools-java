package org.rcsb.cif.schema.generated.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * 
 * The CATEGORY of data items used to describe the anisotropic
 * thermal parameters of the atomic sites in a crystal structure.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class AtomSiteAniso extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "atom_site_aniso";

    public AtomSiteAniso(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
    }

    /**
     * 
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
     * @return StrColumn
     */
    public StrColumn getB11() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_B_11"));
    }

    /**
     * 
     * These are the standard uncertainty values (SU) for the standard
     * form of the Bij anisotropic atomic displacement components (see
     * _aniso_BIJ. Because these values are TYPE measurand, the su values
     * may in practice be auto generated as part of the Bij calculation.
     * @return StrColumn
     */
    public StrColumn getB11Su() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_B_11_su"));
    }

    /**
     * 
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
     * @return StrColumn
     */
    public StrColumn getB12() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_B_12"));
    }

    /**
     * 
     * These are the standard uncertainty values (SU) for the standard
     * form of the Bij anisotropic atomic displacement components (see
     * _aniso_BIJ. Because these values are TYPE measurand, the su values
     * may in practice be auto generated as part of the Bij calculation.
     * @return StrColumn
     */
    public StrColumn getB12Su() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_B_12_su"));
    }

    /**
     * 
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
     * @return StrColumn
     */
    public StrColumn getB13() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_B_13"));
    }

    /**
     * 
     * These are the standard uncertainty values (SU) for the standard
     * form of the Bij anisotropic atomic displacement components (see
     * _aniso_BIJ. Because these values are TYPE measurand, the su values
     * may in practice be auto generated as part of the Bij calculation.
     * @return StrColumn
     */
    public StrColumn getB13Su() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_B_13_su"));
    }

    /**
     * 
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
     * @return StrColumn
     */
    public StrColumn getB22() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_B_22"));
    }

    /**
     * 
     * These are the standard uncertainty values (SU) for the standard
     * form of the Bij anisotropic atomic displacement components (see
     * _aniso_BIJ. Because these values are TYPE measurand, the su values
     * may in practice be auto generated as part of the Bij calculation.
     * @return StrColumn
     */
    public StrColumn getB22Su() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_B_22_su"));
    }

    /**
     * 
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
     * @return StrColumn
     */
    public StrColumn getB23() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_B_23"));
    }

    /**
     * 
     * These are the standard uncertainty values (SU) for the standard
     * form of the Bij anisotropic atomic displacement components (see
     * _aniso_BIJ. Because these values are TYPE measurand, the su values
     * may in practice be auto generated as part of the Bij calculation.
     * @return StrColumn
     */
    public StrColumn getB23Su() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_B_23_su"));
    }

    /**
     * 
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
     * @return StrColumn
     */
    public StrColumn getB33() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_B_33"));
    }

    /**
     * 
     * These are the standard uncertainty values (SU) for the standard
     * form of the Bij anisotropic atomic displacement components (see
     * _aniso_BIJ. Because these values are TYPE measurand, the su values
     * may in practice be auto generated as part of the Bij calculation.
     * @return StrColumn
     */
    public StrColumn getB33Su() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_B_33_su"));
    }

    /**
     * 
     * Anisotropic atomic displacement parameters are usually looped in
     * a separate list. If this is the case, this code must match the
     * _atom_site.label of the associated atom in the atom coordinate
     * list and conform with the same rules described in _atom_site.label.
     * @return StrColumn
     */
    public StrColumn getLabel() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_label"));
    }

    /**
     * 
     * The symmetric anisotropic atomic displacement matrix B.
     * @return StrColumn
     */
    public StrColumn getMatrixB() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_matrix_B"));
    }

    /**
     * 
     * The symmetric anisotropic atomic displacement matrix U.
     * @return StrColumn
     */
    public StrColumn getMatrixU() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_matrix_U"));
    }

    /**
     * 
     * Ratio of the maximum to minimum eigenvalues of the atomic
     * displacement (thermal) ellipsoids.
     * @return StrColumn
     */
    public StrColumn getRatio() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_ratio"));
    }

    /**
     * 
     * This _atom_type.symbol code links the anisotropic atom parameters to
     * the atom type data associated with this site and must match one of
     * the _atom_type.symbol codes in this list.
     * @return StrColumn
     */
    public StrColumn getTypeSymbol() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_type_symbol"));
    }

    /**
     * 
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
     * @return StrColumn
     */
    public StrColumn getU11() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_U_11"));
    }

    /**
     * 
     * These are the standard uncertainty values (SU) for the standard
     * form of the Uij anisotropic atomic displacement components (see
     * _aniso_UIJ. Because these values are TYPE measurand, the su values
     * may in practice be auto generated as part of the Uij calculation.
     * @return StrColumn
     */
    public StrColumn getU11Su() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_U_11_su"));
    }

    /**
     * 
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
     * @return StrColumn
     */
    public StrColumn getU12() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_U_12"));
    }

    /**
     * 
     * These are the standard uncertainty values (SU) for the standard
     * form of the Uij anisotropic atomic displacement components (see
     * _aniso_UIJ. Because these values are TYPE measurand, the su values
     * may in practice be auto generated as part of the Uij calculation.
     * @return StrColumn
     */
    public StrColumn getU12Su() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_U_12_su"));
    }

    /**
     * 
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
     * @return StrColumn
     */
    public StrColumn getU13() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_U_13"));
    }

    /**
     * 
     * These are the standard uncertainty values (SU) for the standard
     * form of the Uij anisotropic atomic displacement components (see
     * _aniso_UIJ. Because these values are TYPE measurand, the su values
     * may in practice be auto generated as part of the Uij calculation.
     * @return StrColumn
     */
    public StrColumn getU13Su() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_U_13_su"));
    }

    /**
     * 
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
     * @return StrColumn
     */
    public StrColumn getU22() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_U_22"));
    }

    /**
     * 
     * These are the standard uncertainty values (SU) for the standard
     * form of the Uij anisotropic atomic displacement components (see
     * _aniso_UIJ. Because these values are TYPE measurand, the su values
     * may in practice be auto generated as part of the Uij calculation.
     * @return StrColumn
     */
    public StrColumn getU22Su() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_U_22_su"));
    }

    /**
     * 
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
     * @return StrColumn
     */
    public StrColumn getU23() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_U_23"));
    }

    /**
     * 
     * These are the standard uncertainty values (SU) for the standard
     * form of the Uij anisotropic atomic displacement components (see
     * _aniso_UIJ. Because these values are TYPE measurand, the su values
     * may in practice be auto generated as part of the Uij calculation.
     * @return StrColumn
     */
    public StrColumn getU23Su() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_U_23_su"));
    }

    /**
     * 
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
     * @return StrColumn
     */
    public StrColumn getU33() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_U_33"));
    }

    /**
     * 
     * These are the standard uncertainty values (SU) for the standard
     * form of the Uij anisotropic atomic displacement components (see
     * _aniso_UIJ. Because these values are TYPE measurand, the su values
     * may in practice be auto generated as part of the Uij calculation.
     * @return StrColumn
     */
    public StrColumn getU33Su() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_U_33_su"));
    }
}
