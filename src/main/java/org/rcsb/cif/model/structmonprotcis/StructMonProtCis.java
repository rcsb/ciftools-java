package org.rcsb.cif.model.structmonprotcis;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

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
     * @return LabelAltId
     */
    public LabelAltId getLabelAltId() {
        return (LabelAltId) (isText ? textFields.computeIfAbsent("label_alt_id",
                LabelAltId::new) : getBinaryColumn("label_alt_id"));
    }

    /**
     * A component of the identifier for the monomer.
     * 
     * This data item is a pointer to _atom_site.label_asym_id in the
     * ATOM_SITE category.
     * @return LabelAsymId
     */
    public LabelAsymId getLabelAsymId() {
        return (LabelAsymId) (isText ? textFields.computeIfAbsent("label_asym_id",
                LabelAsymId::new) : getBinaryColumn("label_asym_id"));
    }

    /**
     * A component of the identifier for the monomer.
     * 
     * This data item is a pointer to _atom_site.label_comp_id in the
     * ATOM_SITE category.
     * @return LabelCompId
     */
    public LabelCompId getLabelCompId() {
        return (LabelCompId) (isText ? textFields.computeIfAbsent("label_comp_id",
                LabelCompId::new) : getBinaryColumn("label_comp_id"));
    }

    /**
     * A component of the identifier for the monomer.
     * 
     * This data item is a pointer to _atom_site.label_seq_id in the
     * ATOM_SITE category.
     * @return LabelSeqId
     */
    public LabelSeqId getLabelSeqId() {
        return (LabelSeqId) (isText ? textFields.computeIfAbsent("label_seq_id",
                LabelSeqId::new) : getBinaryColumn("label_seq_id"));
    }

    /**
     * A component of the identifier for the monomer.
     * 
     * This data item is a pointer to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return AuthAsymId
     */
    public AuthAsymId getAuthAsymId() {
        return (AuthAsymId) (isText ? textFields.computeIfAbsent("auth_asym_id",
                AuthAsymId::new) : getBinaryColumn("auth_asym_id"));
    }

    /**
     * A component of the identifier for the monomer.
     * 
     * This data item is a pointer to _atom_site.auth_comp_id in the
     * ATOM_SITE category.
     * @return AuthCompId
     */
    public AuthCompId getAuthCompId() {
        return (AuthCompId) (isText ? textFields.computeIfAbsent("auth_comp_id",
                AuthCompId::new) : getBinaryColumn("auth_comp_id"));
    }

    /**
     * A component of the identifier for the monomer.
     * 
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return AuthSeqId
     */
    public AuthSeqId getAuthSeqId() {
        return (AuthSeqId) (isText ? textFields.computeIfAbsent("auth_seq_id",
                AuthSeqId::new) : getBinaryColumn("auth_seq_id"));
    }

    /**
     * Pointer to _atom_site.auth_asym_id.
     * @return PdbxAuthAsymId2
     */
    public PdbxAuthAsymId2 getPdbxAuthAsymId2() {
        return (PdbxAuthAsymId2) (isText ? textFields.computeIfAbsent("pdbx_auth_asym_id_2",
                PdbxAuthAsymId2::new) : getBinaryColumn("pdbx_auth_asym_id_2"));
    }

    /**
     * Pointer to _atom_site.auth_comp_id.
     * @return PdbxAuthCompId2
     */
    public PdbxAuthCompId2 getPdbxAuthCompId2() {
        return (PdbxAuthCompId2) (isText ? textFields.computeIfAbsent("pdbx_auth_comp_id_2",
                PdbxAuthCompId2::new) : getBinaryColumn("pdbx_auth_comp_id_2"));
    }

    /**
     * Pointer to _atom_site.auth_seq_id
     * @return PdbxAuthSeqId2
     */
    public PdbxAuthSeqId2 getPdbxAuthSeqId2() {
        return (PdbxAuthSeqId2) (isText ? textFields.computeIfAbsent("pdbx_auth_seq_id_2",
                PdbxAuthSeqId2::new) : getBinaryColumn("pdbx_auth_seq_id_2"));
    }

    /**
     * Pointer to _atom_site.label_asym_id.
     * @return PdbxLabelAsymId2
     */
    public PdbxLabelAsymId2 getPdbxLabelAsymId2() {
        return (PdbxLabelAsymId2) (isText ? textFields.computeIfAbsent("pdbx_label_asym_id_2",
                PdbxLabelAsymId2::new) : getBinaryColumn("pdbx_label_asym_id_2"));
    }

    /**
     * Pointer to _atom_site.label_comp_id.
     * @return PdbxLabelCompId2
     */
    public PdbxLabelCompId2 getPdbxLabelCompId2() {
        return (PdbxLabelCompId2) (isText ? textFields.computeIfAbsent("pdbx_label_comp_id_2",
                PdbxLabelCompId2::new) : getBinaryColumn("pdbx_label_comp_id_2"));
    }

    /**
     * Pointer to _atom_site.label_seq_id
     * @return PdbxLabelSeqId2
     */
    public PdbxLabelSeqId2 getPdbxLabelSeqId2() {
        return (PdbxLabelSeqId2) (isText ? textFields.computeIfAbsent("pdbx_label_seq_id_2",
                PdbxLabelSeqId2::new) : getBinaryColumn("pdbx_label_seq_id_2"));
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
     * Pointer to _atom_site.pdbx_PDB_ins_code
     * @return PdbxPDBInsCode2
     */
    public PdbxPDBInsCode2 getPdbxPDBInsCode2() {
        return (PdbxPDBInsCode2) (isText ? textFields.computeIfAbsent("pdbx_PDB_ins_code_2",
                PdbxPDBInsCode2::new) : getBinaryColumn("pdbx_PDB_ins_code_2"));
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
     * omega torsion angle
     * @return PdbxOmegaAngle
     */
    public PdbxOmegaAngle getPdbxOmegaAngle() {
        return (PdbxOmegaAngle) (isText ? textFields.computeIfAbsent("pdbx_omega_angle",
                PdbxOmegaAngle::new) : getBinaryColumn("pdbx_omega_angle"));
    }

    /**
     * ordinal index
     * @return PdbxId
     */
    public PdbxId getPdbxId() {
        return (PdbxId) (isText ? textFields.computeIfAbsent("pdbx_id",
                PdbxId::new) : getBinaryColumn("pdbx_id"));
    }

    /**
     * PDB Insertion code
     * @return PdbxAuthInsCode
     */
    public PdbxAuthInsCode getPdbxAuthInsCode() {
        return (PdbxAuthInsCode) (isText ? textFields.computeIfAbsent("pdbx_auth_ins_code",
                PdbxAuthInsCode::new) : getBinaryColumn("pdbx_auth_ins_code"));
    }

    /**
     * PDB Insertion code
     * @return PdbxAuthInsCode2
     */
    public PdbxAuthInsCode2 getPdbxAuthInsCode2() {
        return (PdbxAuthInsCode2) (isText ? textFields.computeIfAbsent("pdbx_auth_ins_code_2",
                PdbxAuthInsCode2::new) : getBinaryColumn("pdbx_auth_ins_code_2"));
    }
}
