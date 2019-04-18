package org.rcsb.cif.model.structconf;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.schema.Schema")
public class StructConf extends BaseCategory {
    public StructConf(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public StructConf(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    /**
     * A component of the identifier for the residue at which the
     * conformation segment begins.
     * 
     * This data item is a pointer to _atom_site.label_asym_id in the
     * ATOM_SITE category.
     * @return BegLabelAsymId
     */
    public BegLabelAsymId getBegLabelAsymId() {
        return (BegLabelAsymId) (isText ? getTextColumn("beg_label_asym_id") : getBinaryColumn("beg_label_asym_id"));
    }

    /**
     * A component of the identifier for the residue at which the
     * conformation segment begins.
     * 
     * This data item is a pointer to _atom_site.label_comp_id in
     * the ATOM_SITE category.
     * @return BegLabelCompId
     */
    public BegLabelCompId getBegLabelCompId() {
        return (BegLabelCompId) (isText ? getTextColumn("beg_label_comp_id") : getBinaryColumn("beg_label_comp_id"));
    }

    /**
     * A component of the identifier for the residue at which the
     * conformation segment begins.
     * 
     * This data item is a pointer to _atom_site.label_seq_id in the
     * ATOM_SITE category.
     * @return BegLabelSeqId
     */
    public BegLabelSeqId getBegLabelSeqId() {
        return (BegLabelSeqId) (isText ? getTextColumn("beg_label_seq_id") : getBinaryColumn("beg_label_seq_id"));
    }

    /**
     * A component of the identifier for the residue at which the
     * conformation segment begins.
     * 
     * This data item is a pointer to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return BegAuthAsymId
     */
    public BegAuthAsymId getBegAuthAsymId() {
        return (BegAuthAsymId) (isText ? getTextColumn("beg_auth_asym_id") : getBinaryColumn("beg_auth_asym_id"));
    }

    /**
     * A component of the identifier for the residue at which the
     * conformation segment begins.
     * 
     * This data item is a pointer to _atom_site.auth_comp_id in
     * the ATOM_SITE category.
     * @return BegAuthCompId
     */
    public BegAuthCompId getBegAuthCompId() {
        return (BegAuthCompId) (isText ? getTextColumn("beg_auth_comp_id") : getBinaryColumn("beg_auth_comp_id"));
    }

    /**
     * A component of the identifier for the residue at which the
     * conformation segment begins.
     * 
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return BegAuthSeqId
     */
    public BegAuthSeqId getBegAuthSeqId() {
        return (BegAuthSeqId) (isText ? getTextColumn("beg_auth_seq_id") : getBinaryColumn("beg_auth_seq_id"));
    }

    /**
     * This data item is a pointer to _struct_conf_type.id in the
     * STRUCT_CONF_TYPE category.
     * @return ConfTypeId
     */
    public ConfTypeId getConfTypeId() {
        return (ConfTypeId) (isText ? getTextColumn("conf_type_id") : getBinaryColumn("conf_type_id"));
    }

    /**
     * A description of special aspects of the conformation assignment.
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? getTextColumn("details") : getBinaryColumn("details"));
    }

    /**
     * A component of the identifier for the residue at which the
     * conformation segment ends.
     * 
     * This data item is a pointer to _atom_site.label_asym_id in the
     * ATOM_SITE category.
     * @return EndLabelAsymId
     */
    public EndLabelAsymId getEndLabelAsymId() {
        return (EndLabelAsymId) (isText ? getTextColumn("end_label_asym_id") : getBinaryColumn("end_label_asym_id"));
    }

    /**
     * A component of the identifier for the residue at which the
     * conformation segment ends.
     * 
     * This data item is a pointer to _atom_site.label_comp_id in the
     * ATOM_SITE category.
     * @return EndLabelCompId
     */
    public EndLabelCompId getEndLabelCompId() {
        return (EndLabelCompId) (isText ? getTextColumn("end_label_comp_id") : getBinaryColumn("end_label_comp_id"));
    }

    /**
     * A component of the identifier for the residue at which the
     * conformation segment ends.
     * 
     * This data item is a pointer to _atom_site.label_seq_id in the
     * ATOM_SITE category.
     * @return EndLabelSeqId
     */
    public EndLabelSeqId getEndLabelSeqId() {
        return (EndLabelSeqId) (isText ? getTextColumn("end_label_seq_id") : getBinaryColumn("end_label_seq_id"));
    }

    /**
     * A component of the identifier for the residue at which the
     * conformation segment ends.
     * 
     * This data item is a pointer to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return EndAuthAsymId
     */
    public EndAuthAsymId getEndAuthAsymId() {
        return (EndAuthAsymId) (isText ? getTextColumn("end_auth_asym_id") : getBinaryColumn("end_auth_asym_id"));
    }

    /**
     * A component of the identifier for the residue at which the
     * conformation segment ends.
     * 
     * This data item is a pointer to _atom_site.auth_comp_id in the
     * ATOM_SITE category.
     * @return EndAuthCompId
     */
    public EndAuthCompId getEndAuthCompId() {
        return (EndAuthCompId) (isText ? getTextColumn("end_auth_comp_id") : getBinaryColumn("end_auth_comp_id"));
    }

    /**
     * A component of the identifier for the residue at which the
     * conformation segment ends.
     * 
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return EndAuthSeqId
     */
    public EndAuthSeqId getEndAuthSeqId() {
        return (EndAuthSeqId) (isText ? getTextColumn("end_auth_seq_id") : getBinaryColumn("end_auth_seq_id"));
    }

    /**
     * The value of _struct_conf.id must uniquely identify a record in
     * the STRUCT_CONF list.
     * 
     * Note that this item need not be a number; it can be any unique
     * identifier.
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? getTextColumn("id") : getBinaryColumn("id"));
    }

    /**
     * A component of the identifier for the residue at which the
     * conformation segment starts.
     * @return PdbxBegPDBInsCode
     */
    public PdbxBegPDBInsCode getPdbxBegPDBInsCode() {
        return (PdbxBegPDBInsCode) (isText ? getTextColumn("pdbx_beg_PDB_ins_code") : getBinaryColumn("pdbx_beg_PDB_ins_code"));
    }

    /**
     * A component of the identifier for the residue at which the
     * conformation segment ends.
     * @return PdbxEndPDBInsCode
     */
    public PdbxEndPDBInsCode getPdbxEndPDBInsCode() {
        return (PdbxEndPDBInsCode) (isText ? getTextColumn("pdbx_end_PDB_ins_code") : getBinaryColumn("pdbx_end_PDB_ins_code"));
    }

    /**
     * This item is a place holder for the helix class used in the PDB
     * HELIX record.
     * @return PdbxPDBHelixClass
     */
    public PdbxPDBHelixClass getPdbxPDBHelixClass() {
        return (PdbxPDBHelixClass) (isText ? getTextColumn("pdbx_PDB_helix_class") : getBinaryColumn("pdbx_PDB_helix_class"));
    }

    /**
     * 
     * A placeholder for the lengths of the helix of the PDB
     * HELIX record.
     * @return PdbxPDBHelixLength
     */
    public PdbxPDBHelixLength getPdbxPDBHelixLength() {
        return (PdbxPDBHelixLength) (isText ? getTextColumn("pdbx_PDB_helix_length") : getBinaryColumn("pdbx_PDB_helix_length"));
    }

    /**
     * 
     * A placeholder for the helix identifier of the PDB
     * HELIX record.
     * @return PdbxPDBHelixId
     */
    public PdbxPDBHelixId getPdbxPDBHelixId() {
        return (PdbxPDBHelixId) (isText ? getTextColumn("pdbx_PDB_helix_id") : getBinaryColumn("pdbx_PDB_helix_id"));
    }
}
