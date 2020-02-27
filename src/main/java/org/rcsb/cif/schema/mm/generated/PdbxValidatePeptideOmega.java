package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_VALIDATE_PEPTIDE_OMEGA category list the
 * residues that contain peptide bonds deviate
 * significantly from both cis and trans conformation.
 * cis bonds, if any, are listed on cispep records.
 * trans is defined as 180 +/- 30 and
 * cis is defined as 0 +/- 30 degrees.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class PdbxValidatePeptideOmega extends BaseCategory {
    public PdbxValidatePeptideOmega(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxValidatePeptideOmega(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxValidatePeptideOmega(String name) {
        super(name);
    }

    /**
     * The value of _pdbx_validate_peptide_omega.id must
     * uniquely identify each item in the PDBX_VALIDATE_PEPTIDE_OMEGA list.
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
     * Part of the identifier of the first residue in the bond
     * 
     * This data item is a pointer to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthAsymId1() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("auth_asym_id_1", StrColumn::new) :
                getBinaryColumn("auth_asym_id_1"));
    }

    /**
     * Part of the identifier of the second residue in the bond
     * 
     * This data item is a pointer to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthAsymId2() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("auth_asym_id_2", StrColumn::new) :
                getBinaryColumn("auth_asym_id_2"));
    }

    /**
     * Part of the identifier of the first residue in the bond
     * 
     * This data item is a pointer to _atom_site.auth_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthCompId1() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("auth_comp_id_1", StrColumn::new) :
                getBinaryColumn("auth_comp_id_1"));
    }

    /**
     * Part of the identifier of the second residue in the bond
     * 
     * This data item is a pointer to _atom_site.auth_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthCompId2() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("auth_comp_id_2", StrColumn::new) :
                getBinaryColumn("auth_comp_id_2"));
    }

    /**
     * Part of the identifier of the first residue in the bond
     * 
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthSeqId1() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("auth_seq_id_1", StrColumn::new) :
                getBinaryColumn("auth_seq_id_1"));
    }

    /**
     * Part of the identifier of the second residue in the bond
     * 
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthSeqId2() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("auth_seq_id_2", StrColumn::new) :
                getBinaryColumn("auth_seq_id_2"));
    }

    /**
     * Optional identifier of the first residue in the bond
     * 
     * This data item is a pointer to _atom_site.pdbx_PDB_ins_code in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPDBInsCode1() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("PDB_ins_code_1", StrColumn::new) :
                getBinaryColumn("PDB_ins_code_1"));
    }

    /**
     * Optional identifier of the second residue in the bond
     * 
     * This data item is a pointer to _atom_site.pdbx_PDB_ins_code in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPDBInsCode2() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("PDB_ins_code_2", StrColumn::new) :
                getBinaryColumn("PDB_ins_code_2"));
    }

    /**
     * Optional identifier of the first residue in the torsion angle
     * 
     * This data item is a pointer to _atom_site.label_alt_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getLabelAltId1() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("label_alt_id_1", StrColumn::new) :
                getBinaryColumn("label_alt_id_1"));
    }

    /**
     * Optional identifier of the second residue in the torsion angle
     * This data item is a pointer to _atom_site.label_alt_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getLabelAltId2() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("label_alt_id_2", StrColumn::new) :
                getBinaryColumn("label_alt_id_2"));
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
}
