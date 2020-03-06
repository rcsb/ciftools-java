package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the ATOM_SITE_ANISOTROP category record details
 * about anisotropic displacement parameters.
 * If the ATOM_SITE_ANISOTROP category is used for storing these
 * data, the corresponding ATOM_SITE data items are not used.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class AtomSiteAnisotrop extends DelegatingCategory {
    public AtomSiteAnisotrop(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "B[1][1]":
                return getB11();
            case "B[1][1]_esd":
                return getB11Esd();
            case "B[1][2]":
                return getB12();
            case "B[1][2]_esd":
                return getB12Esd();
            case "B[1][3]":
                return getB13();
            case "B[1][3]_esd":
                return getB13Esd();
            case "B[2][2]":
                return getB22();
            case "B[2][2]_esd":
                return getB22Esd();
            case "B[2][3]":
                return getB23();
            case "B[2][3]_esd":
                return getB23Esd();
            case "B[3][3]":
                return getB33();
            case "B[3][3]_esd":
                return getB33Esd();
            case "ratio":
                return getRatio();
            case "id":
                return getId();
            case "type_symbol":
                return getTypeSymbol();
            case "U[1][1]":
                return getU11();
            case "U[1][1]_esd":
                return getU11Esd();
            case "U[1][2]":
                return getU12();
            case "U[1][2]_esd":
                return getU12Esd();
            case "U[1][3]":
                return getU13();
            case "U[1][3]_esd":
                return getU13Esd();
            case "U[2][2]":
                return getU22();
            case "U[2][2]_esd":
                return getU22Esd();
            case "U[2][3]":
                return getU23();
            case "U[2][3]_esd":
                return getU23Esd();
            case "U[3][3]":
                return getU33();
            case "U[3][3]_esd":
                return getU33Esd();
            case "pdbx_auth_seq_id":
                return getPdbxAuthSeqId();
            case "pdbx_auth_alt_id":
                return getPdbxAuthAltId();
            case "pdbx_auth_asym_id":
                return getPdbxAuthAsymId();
            case "pdbx_auth_atom_id":
                return getPdbxAuthAtomId();
            case "pdbx_auth_comp_id":
                return getPdbxAuthCompId();
            case "pdbx_label_seq_id":
                return getPdbxLabelSeqId();
            case "pdbx_label_alt_id":
                return getPdbxLabelAltId();
            case "pdbx_label_asym_id":
                return getPdbxLabelAsymId();
            case "pdbx_label_atom_id":
                return getPdbxLabelAtomId();
            case "pdbx_label_comp_id":
                return getPdbxLabelCompId();
            case "pdbx_PDB_ins_code":
                return getPdbxPDBInsCode();
            case "pdbx_PDB_model_num":
                return getPdbxPDBModelNum();
            case "pdbx_not_in_asym":
                return getPdbxNotInAsym();
            case "pdbx_PDB_residue_no":
                return getPdbxPDBResidueNo();
            case "pdbx_PDB_residue_name":
                return getPdbxPDBResidueName();
            case "pdbx_PDB_strand_id":
                return getPdbxPDBStrandId();
            case "pdbx_PDB_atom_name":
                return getPdbxPDBAtomName();
            case "pdbx_auth_atom_name":
                return getPdbxAuthAtomName();
            case "pdbx_label_ins_code":
                return getPdbxLabelInsCode();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The elements of the anisotropic atomic displacement
     * matrix B, which appears in the structure-factor term as:
     * 
     * T = exp{-1/4 sum~i~[sum~j~(B^ij^ h~i~ h~j~ a*~i~ a*~j~)]}
     * 
     * h  = the Miller indices
     * a* = the reciprocal space cell lengths
     * 
     * These matrix elements may appear with atomic coordinates
     * in the ATOM_SITE category, or they may appear in the separate
     * ATOM_SITE_ANISOTROP category, but they may not appear in both
     * places. Similarly, anisotropic displacements may appear as
     * either B's or U's, but not as both.
     * 
     * The unique elements of the real symmetric matrix are
     * entered by row.
     * 
     * The IUCr Commission on Nomenclature recommends against the use
     * of B for reporting atomic displacement parameters. U, being
     * directly proportional to B, is preferred.
     * @return FloatColumn
     */
    public FloatColumn getB11() {
        return delegate.getColumn("B[1][1]", DelegatingFloatColumn::new);
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _atom_site_anisotrop.B.
     * @return FloatColumn
     */
    public FloatColumn getB11Esd() {
        return delegate.getColumn("B[1][1]_esd", DelegatingFloatColumn::new);
    }

    /**
     * The elements of the anisotropic atomic displacement
     * matrix B, which appears in the structure-factor term as:
     * 
     * T = exp{-1/4 sum~i~[sum~j~(B^ij^ h~i~ h~j~ a*~i~ a*~j~)]}
     * 
     * h  = the Miller indices
     * a* = the reciprocal space cell lengths
     * 
     * These matrix elements may appear with atomic coordinates
     * in the ATOM_SITE category, or they may appear in the separate
     * ATOM_SITE_ANISOTROP category, but they may not appear in both
     * places. Similarly, anisotropic displacements may appear as
     * either B's or U's, but not as both.
     * 
     * The unique elements of the real symmetric matrix are
     * entered by row.
     * 
     * The IUCr Commission on Nomenclature recommends against the use
     * of B for reporting atomic displacement parameters. U, being
     * directly proportional to B, is preferred.
     * @return FloatColumn
     */
    public FloatColumn getB12() {
        return delegate.getColumn("B[1][2]", DelegatingFloatColumn::new);
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _atom_site_anisotrop.B.
     * @return FloatColumn
     */
    public FloatColumn getB12Esd() {
        return delegate.getColumn("B[1][2]_esd", DelegatingFloatColumn::new);
    }

    /**
     * The elements of the anisotropic atomic displacement
     * matrix B, which appears in the structure-factor term as:
     * 
     * T = exp{-1/4 sum~i~[sum~j~(B^ij^ h~i~ h~j~ a*~i~ a*~j~)]}
     * 
     * h  = the Miller indices
     * a* = the reciprocal space cell lengths
     * 
     * These matrix elements may appear with atomic coordinates
     * in the ATOM_SITE category, or they may appear in the separate
     * ATOM_SITE_ANISOTROP category, but they may not appear in both
     * places. Similarly, anisotropic displacements may appear as
     * either B's or U's, but not as both.
     * 
     * The unique elements of the real symmetric matrix are
     * entered by row.
     * 
     * The IUCr Commission on Nomenclature recommends against the use
     * of B for reporting atomic displacement parameters. U, being
     * directly proportional to B, is preferred.
     * @return FloatColumn
     */
    public FloatColumn getB13() {
        return delegate.getColumn("B[1][3]", DelegatingFloatColumn::new);
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _atom_site_anisotrop.B.
     * @return FloatColumn
     */
    public FloatColumn getB13Esd() {
        return delegate.getColumn("B[1][3]_esd", DelegatingFloatColumn::new);
    }

    /**
     * The elements of the anisotropic atomic displacement
     * matrix B, which appears in the structure-factor term as:
     * 
     * T = exp{-1/4 sum~i~[sum~j~(B^ij^ h~i~ h~j~ a*~i~ a*~j~)]}
     * 
     * h  = the Miller indices
     * a* = the reciprocal space cell lengths
     * 
     * These matrix elements may appear with atomic coordinates
     * in the ATOM_SITE category, or they may appear in the separate
     * ATOM_SITE_ANISOTROP category, but they may not appear in both
     * places. Similarly, anisotropic displacements may appear as
     * either B's or U's, but not as both.
     * 
     * The unique elements of the real symmetric matrix are
     * entered by row.
     * 
     * The IUCr Commission on Nomenclature recommends against the use
     * of B for reporting atomic displacement parameters. U, being
     * directly proportional to B, is preferred.
     * @return FloatColumn
     */
    public FloatColumn getB22() {
        return delegate.getColumn("B[2][2]", DelegatingFloatColumn::new);
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _atom_site_anisotrop.B.
     * @return FloatColumn
     */
    public FloatColumn getB22Esd() {
        return delegate.getColumn("B[2][2]_esd", DelegatingFloatColumn::new);
    }

    /**
     * The elements of the anisotropic atomic displacement
     * matrix B, which appears in the structure-factor term as:
     * 
     * T = exp{-1/4 sum~i~[sum~j~(B^ij^ h~i~ h~j~ a*~i~ a*~j~)]}
     * 
     * h  = the Miller indices
     * a* = the reciprocal space cell lengths
     * 
     * These matrix elements may appear with atomic coordinates
     * in the ATOM_SITE category, or they may appear in the separate
     * ATOM_SITE_ANISOTROP category, but they may not appear in both
     * places. Similarly, anisotropic displacements may appear as
     * either B's or U's, but not as both.
     * 
     * The unique elements of the real symmetric matrix are
     * entered by row.
     * 
     * The IUCr Commission on Nomenclature recommends against the use
     * of B for reporting atomic displacement parameters. U, being
     * directly proportional to B, is preferred.
     * @return FloatColumn
     */
    public FloatColumn getB23() {
        return delegate.getColumn("B[2][3]", DelegatingFloatColumn::new);
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _atom_site_anisotrop.B.
     * @return FloatColumn
     */
    public FloatColumn getB23Esd() {
        return delegate.getColumn("B[2][3]_esd", DelegatingFloatColumn::new);
    }

    /**
     * The elements of the anisotropic atomic displacement
     * matrix B, which appears in the structure-factor term as:
     * 
     * T = exp{-1/4 sum~i~[sum~j~(B^ij^ h~i~ h~j~ a*~i~ a*~j~)]}
     * 
     * h  = the Miller indices
     * a* = the reciprocal space cell lengths
     * 
     * These matrix elements may appear with atomic coordinates
     * in the ATOM_SITE category, or they may appear in the separate
     * ATOM_SITE_ANISOTROP category, but they may not appear in both
     * places. Similarly, anisotropic displacements may appear as
     * either B's or U's, but not as both.
     * 
     * The unique elements of the real symmetric matrix are
     * entered by row.
     * 
     * The IUCr Commission on Nomenclature recommends against the use
     * of B for reporting atomic displacement parameters. U, being
     * directly proportional to B, is preferred.
     * @return FloatColumn
     */
    public FloatColumn getB33() {
        return delegate.getColumn("B[3][3]", DelegatingFloatColumn::new);
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _atom_site_anisotrop.B.
     * @return FloatColumn
     */
    public FloatColumn getB33Esd() {
        return delegate.getColumn("B[3][3]_esd", DelegatingFloatColumn::new);
    }

    /**
     * Ratio of the maximum to minimum principal axes of
     * displacement (thermal) ellipsoids.
     * @return FloatColumn
     */
    public FloatColumn getRatio() {
        return delegate.getColumn("ratio", DelegatingFloatColumn::new);
    }

    /**
     * This data item is a pointer to _atom_site.id in the ATOM_SITE
     * category.
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * This data item is a pointer to _atom_type.symbol in the
     * ATOM_TYPE category.
     * @return StrColumn
     */
    public StrColumn getTypeSymbol() {
        return delegate.getColumn("type_symbol", DelegatingStrColumn::new);
    }

    /**
     * The elements of the standard anisotropic atomic
     * displacement matrix U, which appears in the structure-factor
     * term as:
     * 
     * T = exp{-2 pi^2^ sum~i~[sum~j~(U^ij^ h~i~ h~j~ a*~i~ a*~j~)]}
     * 
     * h  = the Miller indices
     * a* = the reciprocal space cell lengths
     * 
     * These matrix elements may appear with atomic coordinates
     * in the ATOM_SITE category, or they may appear in the separate
     * ATOM_SITE_ANISOTROP category, but they may not appear in both
     * places. Similarly, anisotropic displacements may appear as
     * either B's or U's, but not as both.
     * 
     * The unique elements of the real symmetric matrix are
     * entered by row.
     * @return FloatColumn
     */
    public FloatColumn getU11() {
        return delegate.getColumn("U[1][1]", DelegatingFloatColumn::new);
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _atom_site_anisotrop.U.
     * @return FloatColumn
     */
    public FloatColumn getU11Esd() {
        return delegate.getColumn("U[1][1]_esd", DelegatingFloatColumn::new);
    }

    /**
     * The elements of the standard anisotropic atomic
     * displacement matrix U, which appears in the structure-factor
     * term as:
     * 
     * T = exp{-2 pi^2^ sum~i~[sum~j~(U^ij^ h~i~ h~j~ a*~i~ a*~j~)]}
     * 
     * h  = the Miller indices
     * a* = the reciprocal space cell lengths
     * 
     * These matrix elements may appear with atomic coordinates
     * in the ATOM_SITE category, or they may appear in the separate
     * ATOM_SITE_ANISOTROP category, but they may not appear in both
     * places. Similarly, anisotropic displacements may appear as
     * either B's or U's, but not as both.
     * 
     * The unique elements of the real symmetric matrix are
     * entered by row.
     * @return FloatColumn
     */
    public FloatColumn getU12() {
        return delegate.getColumn("U[1][2]", DelegatingFloatColumn::new);
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _atom_site_anisotrop.U.
     * @return FloatColumn
     */
    public FloatColumn getU12Esd() {
        return delegate.getColumn("U[1][2]_esd", DelegatingFloatColumn::new);
    }

    /**
     * The elements of the standard anisotropic atomic
     * displacement matrix U, which appears in the structure-factor
     * term as:
     * 
     * T = exp{-2 pi^2^ sum~i~[sum~j~(U^ij^ h~i~ h~j~ a*~i~ a*~j~)]}
     * 
     * h  = the Miller indices
     * a* = the reciprocal space cell lengths
     * 
     * These matrix elements may appear with atomic coordinates
     * in the ATOM_SITE category, or they may appear in the separate
     * ATOM_SITE_ANISOTROP category, but they may not appear in both
     * places. Similarly, anisotropic displacements may appear as
     * either B's or U's, but not as both.
     * 
     * The unique elements of the real symmetric matrix are
     * entered by row.
     * @return FloatColumn
     */
    public FloatColumn getU13() {
        return delegate.getColumn("U[1][3]", DelegatingFloatColumn::new);
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _atom_site_anisotrop.U.
     * @return FloatColumn
     */
    public FloatColumn getU13Esd() {
        return delegate.getColumn("U[1][3]_esd", DelegatingFloatColumn::new);
    }

    /**
     * The elements of the standard anisotropic atomic
     * displacement matrix U, which appears in the structure-factor
     * term as:
     * 
     * T = exp{-2 pi^2^ sum~i~[sum~j~(U^ij^ h~i~ h~j~ a*~i~ a*~j~)]}
     * 
     * h  = the Miller indices
     * a* = the reciprocal space cell lengths
     * 
     * These matrix elements may appear with atomic coordinates
     * in the ATOM_SITE category, or they may appear in the separate
     * ATOM_SITE_ANISOTROP category, but they may not appear in both
     * places. Similarly, anisotropic displacements may appear as
     * either B's or U's, but not as both.
     * 
     * The unique elements of the real symmetric matrix are
     * entered by row.
     * @return FloatColumn
     */
    public FloatColumn getU22() {
        return delegate.getColumn("U[2][2]", DelegatingFloatColumn::new);
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _atom_site_anisotrop.U.
     * @return FloatColumn
     */
    public FloatColumn getU22Esd() {
        return delegate.getColumn("U[2][2]_esd", DelegatingFloatColumn::new);
    }

    /**
     * The elements of the standard anisotropic atomic
     * displacement matrix U, which appears in the structure-factor
     * term as:
     * 
     * T = exp{-2 pi^2^ sum~i~[sum~j~(U^ij^ h~i~ h~j~ a*~i~ a*~j~)]}
     * 
     * h  = the Miller indices
     * a* = the reciprocal space cell lengths
     * 
     * These matrix elements may appear with atomic coordinates
     * in the ATOM_SITE category, or they may appear in the separate
     * ATOM_SITE_ANISOTROP category, but they may not appear in both
     * places. Similarly, anisotropic displacements may appear as
     * either B's or U's, but not as both.
     * 
     * The unique elements of the real symmetric matrix are
     * entered by row.
     * @return FloatColumn
     */
    public FloatColumn getU23() {
        return delegate.getColumn("U[2][3]", DelegatingFloatColumn::new);
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _atom_site_anisotrop.U.
     * @return FloatColumn
     */
    public FloatColumn getU23Esd() {
        return delegate.getColumn("U[2][3]_esd", DelegatingFloatColumn::new);
    }

    /**
     * The elements of the standard anisotropic atomic
     * displacement matrix U, which appears in the structure-factor
     * term as:
     * 
     * T = exp{-2 pi^2^ sum~i~[sum~j~(U^ij^ h~i~ h~j~ a*~i~ a*~j~)]}
     * 
     * h  = the Miller indices
     * a* = the reciprocal space cell lengths
     * 
     * These matrix elements may appear with atomic coordinates
     * in the ATOM_SITE category, or they may appear in the separate
     * ATOM_SITE_ANISOTROP category, but they may not appear in both
     * places. Similarly, anisotropic displacements may appear as
     * either B's or U's, but not as both.
     * 
     * The unique elements of the real symmetric matrix are
     * entered by row.
     * @return FloatColumn
     */
    public FloatColumn getU33() {
        return delegate.getColumn("U[3][3]", DelegatingFloatColumn::new);
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _atom_site_anisotrop.U.
     * @return FloatColumn
     */
    public FloatColumn getU33Esd() {
        return delegate.getColumn("U[3][3]_esd", DelegatingFloatColumn::new);
    }

    /**
     * Pointer to _atom_site.auth_seq_id
     * @return StrColumn
     */
    public StrColumn getPdbxAuthSeqId() {
        return delegate.getColumn("pdbx_auth_seq_id", DelegatingStrColumn::new);
    }

    /**
     * Pointer to _atom_site.pdbx_auth_alt_id.
     * @return StrColumn
     */
    public StrColumn getPdbxAuthAltId() {
        return delegate.getColumn("pdbx_auth_alt_id", DelegatingStrColumn::new);
    }

    /**
     * Pointer to _atom_site.auth_asym_id
     * @return StrColumn
     */
    public StrColumn getPdbxAuthAsymId() {
        return delegate.getColumn("pdbx_auth_asym_id", DelegatingStrColumn::new);
    }

    /**
     * Pointer to _atom_site.auth_atom_id
     * @return StrColumn
     */
    public StrColumn getPdbxAuthAtomId() {
        return delegate.getColumn("pdbx_auth_atom_id", DelegatingStrColumn::new);
    }

    /**
     * Pointer to _atom_site.auth_comp_id
     * @return StrColumn
     */
    public StrColumn getPdbxAuthCompId() {
        return delegate.getColumn("pdbx_auth_comp_id", DelegatingStrColumn::new);
    }

    /**
     * Pointer to _atom_site.label_seq_id
     * @return IntColumn
     */
    public IntColumn getPdbxLabelSeqId() {
        return delegate.getColumn("pdbx_label_seq_id", DelegatingIntColumn::new);
    }

    /**
     * Pointer to _atom_site.label_alt_id.
     * @return StrColumn
     */
    public StrColumn getPdbxLabelAltId() {
        return delegate.getColumn("pdbx_label_alt_id", DelegatingStrColumn::new);
    }

    /**
     * Pointer to _atom_site.label_asym_id
     * @return StrColumn
     */
    public StrColumn getPdbxLabelAsymId() {
        return delegate.getColumn("pdbx_label_asym_id", DelegatingStrColumn::new);
    }

    /**
     * Pointer to _atom_site.label_atom_id
     * @return StrColumn
     */
    public StrColumn getPdbxLabelAtomId() {
        return delegate.getColumn("pdbx_label_atom_id", DelegatingStrColumn::new);
    }

    /**
     * Pointer to _atom_site.label_comp_id
     * @return StrColumn
     */
    public StrColumn getPdbxLabelCompId() {
        return delegate.getColumn("pdbx_label_comp_id", DelegatingStrColumn::new);
    }

    /**
     * Pointer to _atom_site.pdbx_PDB_ins_code
     * @return StrColumn
     */
    public StrColumn getPdbxPDBInsCode() {
        return delegate.getColumn("pdbx_PDB_ins_code", DelegatingStrColumn::new);
    }

    /**
     * Pointer to _atom_site.pdbx_PDB_model_num
     * @return IntColumn
     */
    public IntColumn getPdbxPDBModelNum() {
        return delegate.getColumn("pdbx_PDB_model_num", DelegatingIntColumn::new);
    }

    /**
     * Will identify with a 'Y' that this strand got generated.
     * @return StrColumn
     */
    public StrColumn getPdbxNotInAsym() {
        return delegate.getColumn("pdbx_not_in_asym", DelegatingStrColumn::new);
    }

    /**
     * PDB residue number.
     * @return StrColumn
     */
    public StrColumn getPdbxPDBResidueNo() {
        return delegate.getColumn("pdbx_PDB_residue_no", DelegatingStrColumn::new);
    }

    /**
     * PDB residue name.
     * @return StrColumn
     */
    public StrColumn getPdbxPDBResidueName() {
        return delegate.getColumn("pdbx_PDB_residue_name", DelegatingStrColumn::new);
    }

    /**
     * PDB strand id.
     * @return StrColumn
     */
    public StrColumn getPdbxPDBStrandId() {
        return delegate.getColumn("pdbx_PDB_strand_id", DelegatingStrColumn::new);
    }

    /**
     * PDB atom name.
     * @return StrColumn
     */
    public StrColumn getPdbxPDBAtomName() {
        return delegate.getColumn("pdbx_PDB_atom_name", DelegatingStrColumn::new);
    }

    /**
     * Author's atom name.
     * @return StrColumn
     */
    public StrColumn getPdbxAuthAtomName() {
        return delegate.getColumn("pdbx_auth_atom_name", DelegatingStrColumn::new);
    }

    /**
     * NDB INSERTION CODE
     * @return StrColumn
     */
    public StrColumn getPdbxLabelInsCode() {
        return delegate.getColumn("pdbx_label_ins_code", DelegatingStrColumn::new);
    }

}