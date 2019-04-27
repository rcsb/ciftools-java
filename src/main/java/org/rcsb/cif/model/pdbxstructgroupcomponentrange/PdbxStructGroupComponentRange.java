package org.rcsb.cif.model.pdbxstructgroupcomponentrange;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxStructGroupComponentRange extends BaseCategory {
    public PdbxStructGroupComponentRange(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxStructGroupComponentRange(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxStructGroupComponentRange(String name) {
        super(name);
    }

    /**
     * The value of _pdbx_struct_group_component_range.id must uniquely identify
     * a record in the PDBX_STRUCT_GROUP_COMPONENT_RANGE list.
     * @return Ordinal
     */
    public Ordinal getOrdinal() {
        return (Ordinal) (isText ? textFields.computeIfAbsent("ordinal",
                Ordinal::new) : getBinaryColumn("ordinal"));
    }

    /**
     * This data item is a pointer to _pdbx_struct_group_list.struct_group_id in the
     * PDBX_STRUCT_GROUP_LIST category.
     * @return StructGroupId
     */
    public StructGroupId getStructGroupId() {
        return (StructGroupId) (isText ? textFields.computeIfAbsent("struct_group_id",
                StructGroupId::new) : getBinaryColumn("struct_group_id"));
    }

    /**
     * Part of the identifier for the component range in this group assignment.
     * 
     * This data item is a pointer to _atom_site.pdbx_PDB_model_num in the
     * ATOM_SITE category.
     * @return PDBModelNum
     */
    public PDBModelNum getPDBModelNum() {
        return (PDBModelNum) (isText ? textFields.computeIfAbsent("PDB_model_num",
                PDBModelNum::new) : getBinaryColumn("PDB_model_num"));
    }

    /**
     * Part of the identifier for the component range in this group assignment.
     * 
     * This data item is a pointer to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return BegAuthAsymId
     */
    public BegAuthAsymId getBegAuthAsymId() {
        return (BegAuthAsymId) (isText ? textFields.computeIfAbsent("beg_auth_asym_id",
                BegAuthAsymId::new) : getBinaryColumn("beg_auth_asym_id"));
    }

    /**
     * Part of the identifier for the component range in this group assignment.
     * 
     * This data item is a pointer to _atom_site.auth_comp_id in the
     * ATOM_SITE category.
     * @return BegAuthCompId
     */
    public BegAuthCompId getBegAuthCompId() {
        return (BegAuthCompId) (isText ? textFields.computeIfAbsent("beg_auth_comp_id",
                BegAuthCompId::new) : getBinaryColumn("beg_auth_comp_id"));
    }

    /**
     * Part of the identifier for the component range in this group assignment.
     * 
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return BegAuthSeqId
     */
    public BegAuthSeqId getBegAuthSeqId() {
        return (BegAuthSeqId) (isText ? textFields.computeIfAbsent("beg_auth_seq_id",
                BegAuthSeqId::new) : getBinaryColumn("beg_auth_seq_id"));
    }

    /**
     * Part of the identifier for the component range in this group assignment.
     * 
     * This data item is a pointer to _atom_site.pdbx_PDB_ins_code in the
     * ATOM_SITE category.
     * @return BegPDBInsCode
     */
    public BegPDBInsCode getBegPDBInsCode() {
        return (BegPDBInsCode) (isText ? textFields.computeIfAbsent("beg_PDB_ins_code",
                BegPDBInsCode::new) : getBinaryColumn("beg_PDB_ins_code"));
    }

    /**
     * Part of the identifier for the component range in this group assignment.
     * 
     * This data item is a pointer to _atom_site.label_asym_id in the
     * ATOM_SITE category.
     * @return BegLabelAsymId
     */
    public BegLabelAsymId getBegLabelAsymId() {
        return (BegLabelAsymId) (isText ? textFields.computeIfAbsent("beg_label_asym_id",
                BegLabelAsymId::new) : getBinaryColumn("beg_label_asym_id"));
    }

    /**
     * Part of the identifier for the component range in this group assignment.
     * 
     * This data item is a pointer to _atom_site.label_comp_id in the
     * ATOM_SITE category.
     * @return BegLabelCompId
     */
    public BegLabelCompId getBegLabelCompId() {
        return (BegLabelCompId) (isText ? textFields.computeIfAbsent("beg_label_comp_id",
                BegLabelCompId::new) : getBinaryColumn("beg_label_comp_id"));
    }

    /**
     * Part of the identifier for the component range in this group assignment.
     * 
     * This data item is a pointer to _atom_site.label_seq_id in the
     * ATOM_SITE category.
     * @return BegLabelSeqId
     */
    public BegLabelSeqId getBegLabelSeqId() {
        return (BegLabelSeqId) (isText ? textFields.computeIfAbsent("beg_label_seq_id",
                BegLabelSeqId::new) : getBinaryColumn("beg_label_seq_id"));
    }

    /**
     * Part of the identifier for the component range in this group assignment.
     * 
     * This data item is a pointer to _atom_site.label_alt_id in the
     * ATOM_SITE category.
     * @return BegLabelAltId
     */
    public BegLabelAltId getBegLabelAltId() {
        return (BegLabelAltId) (isText ? textFields.computeIfAbsent("beg_label_alt_id",
                BegLabelAltId::new) : getBinaryColumn("beg_label_alt_id"));
    }

    /**
     * Part of the identifier for the component range in this group assignment.
     * 
     * This data item is a pointer to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return EndAuthAsymId
     */
    public EndAuthAsymId getEndAuthAsymId() {
        return (EndAuthAsymId) (isText ? textFields.computeIfAbsent("end_auth_asym_id",
                EndAuthAsymId::new) : getBinaryColumn("end_auth_asym_id"));
    }

    /**
     * Part of the identifier for the component range in this group assignment.
     * 
     * This data item is a pointer to _atom_site.auth_comp_id in the
     * ATOM_SITE category.
     * @return EndAuthCompId
     */
    public EndAuthCompId getEndAuthCompId() {
        return (EndAuthCompId) (isText ? textFields.computeIfAbsent("end_auth_comp_id",
                EndAuthCompId::new) : getBinaryColumn("end_auth_comp_id"));
    }

    /**
     * Part of the identifier for the component range in this group assignment.
     * 
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return EndAuthSeqId
     */
    public EndAuthSeqId getEndAuthSeqId() {
        return (EndAuthSeqId) (isText ? textFields.computeIfAbsent("end_auth_seq_id",
                EndAuthSeqId::new) : getBinaryColumn("end_auth_seq_id"));
    }

    /**
     * Part of the identifier for the component range in this group assignment.
     * 
     * This data item is a pointer to _atom_site.pdbx_PDB_ins_code in the
     * ATOM_SITE category.
     * @return EndPDBInsCode
     */
    public EndPDBInsCode getEndPDBInsCode() {
        return (EndPDBInsCode) (isText ? textFields.computeIfAbsent("end_PDB_ins_code",
                EndPDBInsCode::new) : getBinaryColumn("end_PDB_ins_code"));
    }

    /**
     * Part of the identifier for the component range in this group assignment.
     * 
     * This data item is a pointer to _atom_site.label_asym_id in the
     * ATOM_SITE category.
     * @return EndLabelAsymId
     */
    public EndLabelAsymId getEndLabelAsymId() {
        return (EndLabelAsymId) (isText ? textFields.computeIfAbsent("end_label_asym_id",
                EndLabelAsymId::new) : getBinaryColumn("end_label_asym_id"));
    }

    /**
     * Part of the identifier for the component range in this group assignment.
     * 
     * This data item is a pointer to _atom_site.label_comp_id in the
     * ATOM_SITE category.
     * @return EndLabelCompId
     */
    public EndLabelCompId getEndLabelCompId() {
        return (EndLabelCompId) (isText ? textFields.computeIfAbsent("end_label_comp_id",
                EndLabelCompId::new) : getBinaryColumn("end_label_comp_id"));
    }

    /**
     * Part of the identifier for the component range in this group assignment.
     * 
     * This data item is a pointer to _atom_site.label_seq_id in the
     * ATOM_SITE category.
     * @return EndLabelSeqId
     */
    public EndLabelSeqId getEndLabelSeqId() {
        return (EndLabelSeqId) (isText ? textFields.computeIfAbsent("end_label_seq_id",
                EndLabelSeqId::new) : getBinaryColumn("end_label_seq_id"));
    }

    /**
     * Part of the identifier for the component range in this group assignment.
     * 
     * This data item is a pointer to _atom_site.label_alt_id in the
     * ATOM_SITE category.
     * @return EndLabelAltId
     */
    public EndLabelAltId getEndLabelAltId() {
        return (EndLabelAltId) (isText ? textFields.computeIfAbsent("end_label_alt_id",
                EndLabelAltId::new) : getBinaryColumn("end_label_alt_id"));
    }
}
