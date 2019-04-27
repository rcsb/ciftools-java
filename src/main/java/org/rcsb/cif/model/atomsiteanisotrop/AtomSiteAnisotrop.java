package org.rcsb.cif.model.atomsiteanisotrop;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class AtomSiteAnisotrop extends BaseCategory {
    public AtomSiteAnisotrop(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public AtomSiteAnisotrop(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public AtomSiteAnisotrop(String name) {
        super(name);
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
     * @return B11
     */
    public B11 getB11() {
        return (B11) (isText ? textFields.computeIfAbsent("B[1][1]",
                B11::new) : getBinaryColumn("B[1][1]"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _atom_site_anisotrop.B.
     * @return B11Esd
     */
    public B11Esd getB11Esd() {
        return (B11Esd) (isText ? textFields.computeIfAbsent("B[1][1]_esd",
                B11Esd::new) : getBinaryColumn("B[1][1]_esd"));
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
     * @return B12
     */
    public B12 getB12() {
        return (B12) (isText ? textFields.computeIfAbsent("B[1][2]",
                B12::new) : getBinaryColumn("B[1][2]"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _atom_site_anisotrop.B.
     * @return B12Esd
     */
    public B12Esd getB12Esd() {
        return (B12Esd) (isText ? textFields.computeIfAbsent("B[1][2]_esd",
                B12Esd::new) : getBinaryColumn("B[1][2]_esd"));
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
     * @return B13
     */
    public B13 getB13() {
        return (B13) (isText ? textFields.computeIfAbsent("B[1][3]",
                B13::new) : getBinaryColumn("B[1][3]"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _atom_site_anisotrop.B.
     * @return B13Esd
     */
    public B13Esd getB13Esd() {
        return (B13Esd) (isText ? textFields.computeIfAbsent("B[1][3]_esd",
                B13Esd::new) : getBinaryColumn("B[1][3]_esd"));
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
     * @return B22
     */
    public B22 getB22() {
        return (B22) (isText ? textFields.computeIfAbsent("B[2][2]",
                B22::new) : getBinaryColumn("B[2][2]"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _atom_site_anisotrop.B.
     * @return B22Esd
     */
    public B22Esd getB22Esd() {
        return (B22Esd) (isText ? textFields.computeIfAbsent("B[2][2]_esd",
                B22Esd::new) : getBinaryColumn("B[2][2]_esd"));
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
     * @return B23
     */
    public B23 getB23() {
        return (B23) (isText ? textFields.computeIfAbsent("B[2][3]",
                B23::new) : getBinaryColumn("B[2][3]"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _atom_site_anisotrop.B.
     * @return B23Esd
     */
    public B23Esd getB23Esd() {
        return (B23Esd) (isText ? textFields.computeIfAbsent("B[2][3]_esd",
                B23Esd::new) : getBinaryColumn("B[2][3]_esd"));
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
     * @return B33
     */
    public B33 getB33() {
        return (B33) (isText ? textFields.computeIfAbsent("B[3][3]",
                B33::new) : getBinaryColumn("B[3][3]"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _atom_site_anisotrop.B.
     * @return B33Esd
     */
    public B33Esd getB33Esd() {
        return (B33Esd) (isText ? textFields.computeIfAbsent("B[3][3]_esd",
                B33Esd::new) : getBinaryColumn("B[3][3]_esd"));
    }

    /**
     * Ratio of the maximum to minimum principal axes of
     * displacement (thermal) ellipsoids.
     * @return Ratio
     */
    public Ratio getRatio() {
        return (Ratio) (isText ? textFields.computeIfAbsent("ratio",
                Ratio::new) : getBinaryColumn("ratio"));
    }

    /**
     * This data item is a pointer to _atom_site.id in the ATOM_SITE
     * category.
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }

    /**
     * This data item is a pointer to _atom_type.symbol in the
     * ATOM_TYPE category.
     * @return TypeSymbol
     */
    public TypeSymbol getTypeSymbol() {
        return (TypeSymbol) (isText ? textFields.computeIfAbsent("type_symbol",
                TypeSymbol::new) : getBinaryColumn("type_symbol"));
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
     * @return U11
     */
    public U11 getU11() {
        return (U11) (isText ? textFields.computeIfAbsent("U[1][1]",
                U11::new) : getBinaryColumn("U[1][1]"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _atom_site_anisotrop.U.
     * @return U11Esd
     */
    public U11Esd getU11Esd() {
        return (U11Esd) (isText ? textFields.computeIfAbsent("U[1][1]_esd",
                U11Esd::new) : getBinaryColumn("U[1][1]_esd"));
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
     * @return U12
     */
    public U12 getU12() {
        return (U12) (isText ? textFields.computeIfAbsent("U[1][2]",
                U12::new) : getBinaryColumn("U[1][2]"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _atom_site_anisotrop.U.
     * @return U12Esd
     */
    public U12Esd getU12Esd() {
        return (U12Esd) (isText ? textFields.computeIfAbsent("U[1][2]_esd",
                U12Esd::new) : getBinaryColumn("U[1][2]_esd"));
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
     * @return U13
     */
    public U13 getU13() {
        return (U13) (isText ? textFields.computeIfAbsent("U[1][3]",
                U13::new) : getBinaryColumn("U[1][3]"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _atom_site_anisotrop.U.
     * @return U13Esd
     */
    public U13Esd getU13Esd() {
        return (U13Esd) (isText ? textFields.computeIfAbsent("U[1][3]_esd",
                U13Esd::new) : getBinaryColumn("U[1][3]_esd"));
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
     * @return U22
     */
    public U22 getU22() {
        return (U22) (isText ? textFields.computeIfAbsent("U[2][2]",
                U22::new) : getBinaryColumn("U[2][2]"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _atom_site_anisotrop.U.
     * @return U22Esd
     */
    public U22Esd getU22Esd() {
        return (U22Esd) (isText ? textFields.computeIfAbsent("U[2][2]_esd",
                U22Esd::new) : getBinaryColumn("U[2][2]_esd"));
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
     * @return U23
     */
    public U23 getU23() {
        return (U23) (isText ? textFields.computeIfAbsent("U[2][3]",
                U23::new) : getBinaryColumn("U[2][3]"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _atom_site_anisotrop.U.
     * @return U23Esd
     */
    public U23Esd getU23Esd() {
        return (U23Esd) (isText ? textFields.computeIfAbsent("U[2][3]_esd",
                U23Esd::new) : getBinaryColumn("U[2][3]_esd"));
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
     * @return U33
     */
    public U33 getU33() {
        return (U33) (isText ? textFields.computeIfAbsent("U[3][3]",
                U33::new) : getBinaryColumn("U[3][3]"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _atom_site_anisotrop.U.
     * @return U33Esd
     */
    public U33Esd getU33Esd() {
        return (U33Esd) (isText ? textFields.computeIfAbsent("U[3][3]_esd",
                U33Esd::new) : getBinaryColumn("U[3][3]_esd"));
    }

    /**
     * Pointer to _atom_site.auth_seq_id
     * @return PdbxAuthSeqId
     */
    public PdbxAuthSeqId getPdbxAuthSeqId() {
        return (PdbxAuthSeqId) (isText ? textFields.computeIfAbsent("pdbx_auth_seq_id",
                PdbxAuthSeqId::new) : getBinaryColumn("pdbx_auth_seq_id"));
    }

    /**
     * Pointer to _atom_site.pdbx_auth_alt_id.
     * @return PdbxAuthAltId
     */
    public PdbxAuthAltId getPdbxAuthAltId() {
        return (PdbxAuthAltId) (isText ? textFields.computeIfAbsent("pdbx_auth_alt_id",
                PdbxAuthAltId::new) : getBinaryColumn("pdbx_auth_alt_id"));
    }

    /**
     * Pointer to _atom_site.auth_asym_id
     * @return PdbxAuthAsymId
     */
    public PdbxAuthAsymId getPdbxAuthAsymId() {
        return (PdbxAuthAsymId) (isText ? textFields.computeIfAbsent("pdbx_auth_asym_id",
                PdbxAuthAsymId::new) : getBinaryColumn("pdbx_auth_asym_id"));
    }

    /**
     * Pointer to _atom_site.auth_atom_id
     * @return PdbxAuthAtomId
     */
    public PdbxAuthAtomId getPdbxAuthAtomId() {
        return (PdbxAuthAtomId) (isText ? textFields.computeIfAbsent("pdbx_auth_atom_id",
                PdbxAuthAtomId::new) : getBinaryColumn("pdbx_auth_atom_id"));
    }

    /**
     * Pointer to _atom_site.auth_comp_id
     * @return PdbxAuthCompId
     */
    public PdbxAuthCompId getPdbxAuthCompId() {
        return (PdbxAuthCompId) (isText ? textFields.computeIfAbsent("pdbx_auth_comp_id",
                PdbxAuthCompId::new) : getBinaryColumn("pdbx_auth_comp_id"));
    }

    /**
     * Pointer to _atom_site.label_seq_id
     * @return PdbxLabelSeqId
     */
    public PdbxLabelSeqId getPdbxLabelSeqId() {
        return (PdbxLabelSeqId) (isText ? textFields.computeIfAbsent("pdbx_label_seq_id",
                PdbxLabelSeqId::new) : getBinaryColumn("pdbx_label_seq_id"));
    }

    /**
     * Pointer to _atom_site.label_alt_id.
     * @return PdbxLabelAltId
     */
    public PdbxLabelAltId getPdbxLabelAltId() {
        return (PdbxLabelAltId) (isText ? textFields.computeIfAbsent("pdbx_label_alt_id",
                PdbxLabelAltId::new) : getBinaryColumn("pdbx_label_alt_id"));
    }

    /**
     * Pointer to _atom_site.label_asym_id
     * @return PdbxLabelAsymId
     */
    public PdbxLabelAsymId getPdbxLabelAsymId() {
        return (PdbxLabelAsymId) (isText ? textFields.computeIfAbsent("pdbx_label_asym_id",
                PdbxLabelAsymId::new) : getBinaryColumn("pdbx_label_asym_id"));
    }

    /**
     * Pointer to _atom_site.label_atom_id
     * @return PdbxLabelAtomId
     */
    public PdbxLabelAtomId getPdbxLabelAtomId() {
        return (PdbxLabelAtomId) (isText ? textFields.computeIfAbsent("pdbx_label_atom_id",
                PdbxLabelAtomId::new) : getBinaryColumn("pdbx_label_atom_id"));
    }

    /**
     * Pointer to _atom_site.label_comp_id
     * @return PdbxLabelCompId
     */
    public PdbxLabelCompId getPdbxLabelCompId() {
        return (PdbxLabelCompId) (isText ? textFields.computeIfAbsent("pdbx_label_comp_id",
                PdbxLabelCompId::new) : getBinaryColumn("pdbx_label_comp_id"));
    }

    /**
     * Pointer to _atom_site.pdbx_PDB_ins_code
     * @return PdbxPDBInsCode
     */
    public PdbxPDBInsCode getPdbxPDBInsCode() {
        return (PdbxPDBInsCode) (isText ? textFields.computeIfAbsent("pdbx_PDB_ins_code",
                PdbxPDBInsCode::new) : getBinaryColumn("pdbx_PDB_ins_code"));
    }

    /**
     * Pointer to _atom_site.pdbx_PDB_model_num
     * @return PdbxPDBModelNum
     */
    public PdbxPDBModelNum getPdbxPDBModelNum() {
        return (PdbxPDBModelNum) (isText ? textFields.computeIfAbsent("pdbx_PDB_model_num",
                PdbxPDBModelNum::new) : getBinaryColumn("pdbx_PDB_model_num"));
    }

    /**
     * Will identify with a 'Y' that this strand got generated.
     * @return PdbxNotInAsym
     */
    public PdbxNotInAsym getPdbxNotInAsym() {
        return (PdbxNotInAsym) (isText ? textFields.computeIfAbsent("pdbx_not_in_asym",
                PdbxNotInAsym::new) : getBinaryColumn("pdbx_not_in_asym"));
    }

    /**
     * PDB residue number.
     * @return PdbxPDBResidueNo
     */
    public PdbxPDBResidueNo getPdbxPDBResidueNo() {
        return (PdbxPDBResidueNo) (isText ? textFields.computeIfAbsent("pdbx_PDB_residue_no",
                PdbxPDBResidueNo::new) : getBinaryColumn("pdbx_PDB_residue_no"));
    }

    /**
     * PDB residue name.
     * @return PdbxPDBResidueName
     */
    public PdbxPDBResidueName getPdbxPDBResidueName() {
        return (PdbxPDBResidueName) (isText ? textFields.computeIfAbsent("pdbx_PDB_residue_name",
                PdbxPDBResidueName::new) : getBinaryColumn("pdbx_PDB_residue_name"));
    }

    /**
     * PDB strand id.
     * @return PdbxPDBStrandId
     */
    public PdbxPDBStrandId getPdbxPDBStrandId() {
        return (PdbxPDBStrandId) (isText ? textFields.computeIfAbsent("pdbx_PDB_strand_id",
                PdbxPDBStrandId::new) : getBinaryColumn("pdbx_PDB_strand_id"));
    }

    /**
     * PDB atom name.
     * @return PdbxPDBAtomName
     */
    public PdbxPDBAtomName getPdbxPDBAtomName() {
        return (PdbxPDBAtomName) (isText ? textFields.computeIfAbsent("pdbx_PDB_atom_name",
                PdbxPDBAtomName::new) : getBinaryColumn("pdbx_PDB_atom_name"));
    }

    /**
     * Author's atom name.
     * @return PdbxAuthAtomName
     */
    public PdbxAuthAtomName getPdbxAuthAtomName() {
        return (PdbxAuthAtomName) (isText ? textFields.computeIfAbsent("pdbx_auth_atom_name",
                PdbxAuthAtomName::new) : getBinaryColumn("pdbx_auth_atom_name"));
    }

    /**
     * NDB INSERTION CODE
     * @return PdbxLabelInsCode
     */
    public PdbxLabelInsCode getPdbxLabelInsCode() {
        return (PdbxLabelInsCode) (isText ? textFields.computeIfAbsent("pdbx_label_ins_code",
                PdbxLabelInsCode::new) : getBinaryColumn("pdbx_label_ins_code"));
    }
}
