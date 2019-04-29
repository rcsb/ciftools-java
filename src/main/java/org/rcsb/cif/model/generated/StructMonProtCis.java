package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the STRUCT_MON_PROT_CIS category identify
 * monomers that have been found to have the peptide bond in the cis
 * conformation. The criterion used to select residues to be
 * designated as containing cis peptide bonds is given in
 * _struct_mon_details.prot_cis.
 */
@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class StructMonProtCis extends BaseCategory {
    public StructMonProtCis(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public StructMonProtCis(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public StructMonProtCis(String name) {
        super(name);
    }

    /**
     * A component of the identifier for the monomer.
     * 
     * This data item is a pointer to _atom_sites_alt.id in the
     * ATOM_SITES_ALT category.
     * @return StrColumn
     */
    public StrColumn getLabelAltId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("label_alt_id", StrColumn::new) :
                getBinaryColumn("label_alt_id"));
    }

    /**
     * A component of the identifier for the monomer.
     * 
     * This data item is a pointer to _atom_site.label_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getLabelAsymId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("label_asym_id", StrColumn::new) :
                getBinaryColumn("label_asym_id"));
    }

    /**
     * A component of the identifier for the monomer.
     * 
     * This data item is a pointer to _atom_site.label_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getLabelCompId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("label_comp_id", StrColumn::new) :
                getBinaryColumn("label_comp_id"));
    }

    /**
     * A component of the identifier for the monomer.
     * 
     * This data item is a pointer to _atom_site.label_seq_id in the
     * ATOM_SITE category.
     * @return IntColumn
     */
    public IntColumn getLabelSeqId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("label_seq_id", IntColumn::new) :
                getBinaryColumn("label_seq_id"));
    }

    /**
     * A component of the identifier for the monomer.
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
     * A component of the identifier for the monomer.
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
     * A component of the identifier for the monomer.
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
     * Pointer to _atom_site.auth_asym_id.
     * @return StrColumn
     */
    public StrColumn getPdbxAuthAsymId2() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_auth_asym_id_2", StrColumn::new) :
                getBinaryColumn("pdbx_auth_asym_id_2"));
    }

    /**
     * Pointer to _atom_site.auth_comp_id.
     * @return StrColumn
     */
    public StrColumn getPdbxAuthCompId2() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_auth_comp_id_2", StrColumn::new) :
                getBinaryColumn("pdbx_auth_comp_id_2"));
    }

    /**
     * Pointer to _atom_site.auth_seq_id
     * @return StrColumn
     */
    public StrColumn getPdbxAuthSeqId2() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_auth_seq_id_2", StrColumn::new) :
                getBinaryColumn("pdbx_auth_seq_id_2"));
    }

    /**
     * Pointer to _atom_site.label_asym_id.
     * @return StrColumn
     */
    public StrColumn getPdbxLabelAsymId2() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_label_asym_id_2", StrColumn::new) :
                getBinaryColumn("pdbx_label_asym_id_2"));
    }

    /**
     * Pointer to _atom_site.label_comp_id.
     * @return StrColumn
     */
    public StrColumn getPdbxLabelCompId2() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_label_comp_id_2", StrColumn::new) :
                getBinaryColumn("pdbx_label_comp_id_2"));
    }

    /**
     * Pointer to _atom_site.label_seq_id
     * @return IntColumn
     */
    public IntColumn getPdbxLabelSeqId2() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("pdbx_label_seq_id_2", IntColumn::new) :
                getBinaryColumn("pdbx_label_seq_id_2"));
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
     * Pointer to _atom_site.pdbx_PDB_ins_code
     * @return StrColumn
     */
    public StrColumn getPdbxPDBInsCode2() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_PDB_ins_code_2", StrColumn::new) :
                getBinaryColumn("pdbx_PDB_ins_code_2"));
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
     * omega torsion angle
     * @return StrColumn
     */
    public StrColumn getPdbxOmegaAngle() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_omega_angle", StrColumn::new) :
                getBinaryColumn("pdbx_omega_angle"));
    }

    /**
     * ordinal index
     * @return StrColumn
     */
    public StrColumn getPdbxId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_id", StrColumn::new) :
                getBinaryColumn("pdbx_id"));
    }

    /**
     * PDB Insertion code
     * @return StrColumn
     */
    public StrColumn getPdbxAuthInsCode() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_auth_ins_code", StrColumn::new) :
                getBinaryColumn("pdbx_auth_ins_code"));
    }

    /**
     * PDB Insertion code
     * @return StrColumn
     */
    public StrColumn getPdbxAuthInsCode2() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_auth_ins_code_2", StrColumn::new) :
                getBinaryColumn("pdbx_auth_ins_code_2"));
    }
}
