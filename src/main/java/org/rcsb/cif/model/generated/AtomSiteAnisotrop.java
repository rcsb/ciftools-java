package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the ATOM_SITE_ANISOTROP category record details
 * about anisotropic displacement parameters.
 * If the ATOM_SITE_ANISOTROP category is used for storing these
 * data, the corresponding ATOM_SITE data items are not used.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return FloatColumn
     */
    public FloatColumn getB11() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("B[1][1]", FloatColumn::new) :
                getBinaryColumn("B[1][1]"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _atom_site_anisotrop.B.
     * @return FloatColumn
     */
    public FloatColumn getB11Esd() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("B[1][1]_esd", FloatColumn::new) :
                getBinaryColumn("B[1][1]_esd"));
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
        return (FloatColumn) (isText ? textFields.computeIfAbsent("B[1][2]", FloatColumn::new) :
                getBinaryColumn("B[1][2]"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _atom_site_anisotrop.B.
     * @return FloatColumn
     */
    public FloatColumn getB12Esd() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("B[1][2]_esd", FloatColumn::new) :
                getBinaryColumn("B[1][2]_esd"));
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
        return (FloatColumn) (isText ? textFields.computeIfAbsent("B[1][3]", FloatColumn::new) :
                getBinaryColumn("B[1][3]"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _atom_site_anisotrop.B.
     * @return FloatColumn
     */
    public FloatColumn getB13Esd() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("B[1][3]_esd", FloatColumn::new) :
                getBinaryColumn("B[1][3]_esd"));
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
        return (FloatColumn) (isText ? textFields.computeIfAbsent("B[2][2]", FloatColumn::new) :
                getBinaryColumn("B[2][2]"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _atom_site_anisotrop.B.
     * @return FloatColumn
     */
    public FloatColumn getB22Esd() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("B[2][2]_esd", FloatColumn::new) :
                getBinaryColumn("B[2][2]_esd"));
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
        return (FloatColumn) (isText ? textFields.computeIfAbsent("B[2][3]", FloatColumn::new) :
                getBinaryColumn("B[2][3]"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _atom_site_anisotrop.B.
     * @return FloatColumn
     */
    public FloatColumn getB23Esd() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("B[2][3]_esd", FloatColumn::new) :
                getBinaryColumn("B[2][3]_esd"));
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
        return (FloatColumn) (isText ? textFields.computeIfAbsent("B[3][3]", FloatColumn::new) :
                getBinaryColumn("B[3][3]"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _atom_site_anisotrop.B.
     * @return FloatColumn
     */
    public FloatColumn getB33Esd() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("B[3][3]_esd", FloatColumn::new) :
                getBinaryColumn("B[3][3]_esd"));
    }

    /**
     * Ratio of the maximum to minimum principal axes of
     * displacement (thermal) ellipsoids.
     * @return FloatColumn
     */
    public FloatColumn getRatio() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("ratio", FloatColumn::new) :
                getBinaryColumn("ratio"));
    }

    /**
     * This data item is a pointer to _atom_site.id in the ATOM_SITE
     * category.
     * @return StrColumn
     */
    public StrColumn getId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("id", StrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * This data item is a pointer to _atom_type.symbol in the
     * ATOM_TYPE category.
     * @return StrColumn
     */
    public StrColumn getTypeSymbol() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("type_symbol", StrColumn::new) :
                getBinaryColumn("type_symbol"));
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
        return (FloatColumn) (isText ? textFields.computeIfAbsent("U[1][1]", FloatColumn::new) :
                getBinaryColumn("U[1][1]"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _atom_site_anisotrop.U.
     * @return FloatColumn
     */
    public FloatColumn getU11Esd() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("U[1][1]_esd", FloatColumn::new) :
                getBinaryColumn("U[1][1]_esd"));
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
        return (FloatColumn) (isText ? textFields.computeIfAbsent("U[1][2]", FloatColumn::new) :
                getBinaryColumn("U[1][2]"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _atom_site_anisotrop.U.
     * @return FloatColumn
     */
    public FloatColumn getU12Esd() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("U[1][2]_esd", FloatColumn::new) :
                getBinaryColumn("U[1][2]_esd"));
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
        return (FloatColumn) (isText ? textFields.computeIfAbsent("U[1][3]", FloatColumn::new) :
                getBinaryColumn("U[1][3]"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _atom_site_anisotrop.U.
     * @return FloatColumn
     */
    public FloatColumn getU13Esd() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("U[1][3]_esd", FloatColumn::new) :
                getBinaryColumn("U[1][3]_esd"));
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
        return (FloatColumn) (isText ? textFields.computeIfAbsent("U[2][2]", FloatColumn::new) :
                getBinaryColumn("U[2][2]"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _atom_site_anisotrop.U.
     * @return FloatColumn
     */
    public FloatColumn getU22Esd() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("U[2][2]_esd", FloatColumn::new) :
                getBinaryColumn("U[2][2]_esd"));
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
        return (FloatColumn) (isText ? textFields.computeIfAbsent("U[2][3]", FloatColumn::new) :
                getBinaryColumn("U[2][3]"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _atom_site_anisotrop.U.
     * @return FloatColumn
     */
    public FloatColumn getU23Esd() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("U[2][3]_esd", FloatColumn::new) :
                getBinaryColumn("U[2][3]_esd"));
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
        return (FloatColumn) (isText ? textFields.computeIfAbsent("U[3][3]", FloatColumn::new) :
                getBinaryColumn("U[3][3]"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _atom_site_anisotrop.U.
     * @return FloatColumn
     */
    public FloatColumn getU33Esd() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("U[3][3]_esd", FloatColumn::new) :
                getBinaryColumn("U[3][3]_esd"));
    }

    /**
     * Pointer to _atom_site.auth_seq_id
     * @return StrColumn
     */
    public StrColumn getPdbxAuthSeqId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_auth_seq_id", StrColumn::new) :
                getBinaryColumn("pdbx_auth_seq_id"));
    }

    /**
     * Pointer to _atom_site.pdbx_auth_alt_id.
     * @return StrColumn
     */
    public StrColumn getPdbxAuthAltId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_auth_alt_id", StrColumn::new) :
                getBinaryColumn("pdbx_auth_alt_id"));
    }

    /**
     * Pointer to _atom_site.auth_asym_id
     * @return StrColumn
     */
    public StrColumn getPdbxAuthAsymId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_auth_asym_id", StrColumn::new) :
                getBinaryColumn("pdbx_auth_asym_id"));
    }

    /**
     * Pointer to _atom_site.auth_atom_id
     * @return StrColumn
     */
    public StrColumn getPdbxAuthAtomId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_auth_atom_id", StrColumn::new) :
                getBinaryColumn("pdbx_auth_atom_id"));
    }

    /**
     * Pointer to _atom_site.auth_comp_id
     * @return StrColumn
     */
    public StrColumn getPdbxAuthCompId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_auth_comp_id", StrColumn::new) :
                getBinaryColumn("pdbx_auth_comp_id"));
    }

    /**
     * Pointer to _atom_site.label_seq_id
     * @return IntColumn
     */
    public IntColumn getPdbxLabelSeqId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("pdbx_label_seq_id", IntColumn::new) :
                getBinaryColumn("pdbx_label_seq_id"));
    }

    /**
     * Pointer to _atom_site.label_alt_id.
     * @return StrColumn
     */
    public StrColumn getPdbxLabelAltId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_label_alt_id", StrColumn::new) :
                getBinaryColumn("pdbx_label_alt_id"));
    }

    /**
     * Pointer to _atom_site.label_asym_id
     * @return StrColumn
     */
    public StrColumn getPdbxLabelAsymId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_label_asym_id", StrColumn::new) :
                getBinaryColumn("pdbx_label_asym_id"));
    }

    /**
     * Pointer to _atom_site.label_atom_id
     * @return StrColumn
     */
    public StrColumn getPdbxLabelAtomId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_label_atom_id", StrColumn::new) :
                getBinaryColumn("pdbx_label_atom_id"));
    }

    /**
     * Pointer to _atom_site.label_comp_id
     * @return StrColumn
     */
    public StrColumn getPdbxLabelCompId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_label_comp_id", StrColumn::new) :
                getBinaryColumn("pdbx_label_comp_id"));
    }

    /**
     * Pointer to _atom_site.pdbx_PDB_ins_code
     * @return StrColumn
     */
    public StrColumn getPdbxPDBInsCode() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_PDB_ins_code", StrColumn::new) :
                getBinaryColumn("pdbx_PDB_ins_code"));
    }

    /**
     * Pointer to _atom_site.pdbx_PDB_model_num
     * @return IntColumn
     */
    public IntColumn getPdbxPDBModelNum() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("pdbx_PDB_model_num", IntColumn::new) :
                getBinaryColumn("pdbx_PDB_model_num"));
    }

    /**
     * Will identify with a 'Y' that this strand got generated.
     * @return StrColumn
     */
    public StrColumn getPdbxNotInAsym() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_not_in_asym", StrColumn::new) :
                getBinaryColumn("pdbx_not_in_asym"));
    }

    /**
     * PDB residue number.
     * @return StrColumn
     */
    public StrColumn getPdbxPDBResidueNo() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_PDB_residue_no", StrColumn::new) :
                getBinaryColumn("pdbx_PDB_residue_no"));
    }

    /**
     * PDB residue name.
     * @return StrColumn
     */
    public StrColumn getPdbxPDBResidueName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_PDB_residue_name", StrColumn::new) :
                getBinaryColumn("pdbx_PDB_residue_name"));
    }

    /**
     * PDB strand id.
     * @return StrColumn
     */
    public StrColumn getPdbxPDBStrandId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_PDB_strand_id", StrColumn::new) :
                getBinaryColumn("pdbx_PDB_strand_id"));
    }

    /**
     * PDB atom name.
     * @return StrColumn
     */
    public StrColumn getPdbxPDBAtomName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_PDB_atom_name", StrColumn::new) :
                getBinaryColumn("pdbx_PDB_atom_name"));
    }

    /**
     * Author's atom name.
     * @return StrColumn
     */
    public StrColumn getPdbxAuthAtomName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_auth_atom_name", StrColumn::new) :
                getBinaryColumn("pdbx_auth_atom_name"));
    }

    /**
     * NDB INSERTION CODE
     * @return StrColumn
     */
    public StrColumn getPdbxLabelInsCode() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_label_ins_code", StrColumn::new) :
                getBinaryColumn("pdbx_label_ins_code"));
    }
}
