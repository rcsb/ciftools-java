package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_VALIDATE_CHIRAL category list the
 * residues that contain unexpected configuration of chiral
 * centers.
 * IMPROPER   HA  N   C   CB   chirality CA
 * IMPROPER   HB1 HB2 CA  CG   stereo CB
 * as this number approaches (+) or (-) 180.0, then the
 * error in predicting the true chirality of the center increases.
 * Improper dihedrals are a measure of the chirality/planarity of the
 * structure at a specific atom. Values around -35 or +35 are expected
 * for chiral atoms, and values around 0 for planar atoms.
 * HERE improper C---N----CA---CB done
 * expected answer is around -120 mean -122.52
 * D-amino acid is +120.0
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class PdbxValidateChiral extends BaseCategory {
    public PdbxValidateChiral(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxValidateChiral(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxValidateChiral(String name) {
        super(name);
    }

    /**
     * The value of _pdbx_validate_chiral.id must
     * uniquely identify each item in the PDBX_VALIDATE_CHIRAL list.
     * This is an integer serial number.
     * @return IntColumn
     */
    public IntColumn getId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("id", IntColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * The model number for the given residue
     * 
     * This data item is a pointer to _atom_site.pdbx_PDB_model_num in the
     * ATOM_SITE category.
     * @return IntColumn
     */
    public IntColumn getPDBModelNum() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("PDB_model_num", IntColumn::new) :
                getBinaryColumn("PDB_model_num"));
    }

    /**
     * Part of the identifier of the residue
     * 
     * This data item is a pointer to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthAsymId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("auth_asym_id", StrColumn::new) :
                getBinaryColumn("auth_asym_id"));
    }

    /**
     * Part of the identifier of the residue
     * 
     * This data item is a pointer to _atom_site.auth_atom_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthAtomId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("auth_atom_id", StrColumn::new) :
                getBinaryColumn("auth_atom_id"));
    }

    /**
     * Part of the identifier of the residue
     * 
     * This data item is a pointer to _atom_site.label_alt_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getLabelAltId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("label_alt_id", StrColumn::new) :
                getBinaryColumn("label_alt_id"));
    }

    /**
     * Part of the identifier of the residue
     * 
     * This data item is a pointer to _atom_site.auth_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthCompId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("auth_comp_id", StrColumn::new) :
                getBinaryColumn("auth_comp_id"));
    }

    /**
     * Part of the identifier of the residue
     * 
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthSeqId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("auth_seq_id", StrColumn::new) :
                getBinaryColumn("auth_seq_id"));
    }

    /**
     * Optional identifier of the residue
     * 
     * This data item is a pointer to _atom_site.pdbx_PDB_ins_code in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPDBInsCode() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("PDB_ins_code", StrColumn::new) :
                getBinaryColumn("PDB_ins_code"));
    }

    /**
     * The value of the OMEGA angle for the peptide linkage between
     * the two defined residues
     * @return FloatColumn
     */
    public FloatColumn getOmega() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("omega", FloatColumn::new) :
                getBinaryColumn("omega"));
    }

    /**
     * A description of the outlier angle  e.g. ALPHA-CARBON
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }
}
