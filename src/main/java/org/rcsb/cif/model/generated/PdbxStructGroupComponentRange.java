package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_STRUCT_GROUP_COMPONENT_RANGE category define a structural
 * group as a continuous span chemical components.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return IntColumn
     */
    public IntColumn getOrdinal() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("ordinal", IntColumn::new) :
                getBinaryColumn("ordinal"));
    }

    /**
     * This data item is a pointer to _pdbx_struct_group_list.struct_group_id in the
     * PDBX_STRUCT_GROUP_LIST category.
     * @return StrColumn
     */
    public StrColumn getStructGroupId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("struct_group_id", StrColumn::new) :
                getBinaryColumn("struct_group_id"));
    }

    /**
     * Part of the identifier for the component range in this group assignment.
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
     * Part of the identifier for the component range in this group assignment.
     * 
     * This data item is a pointer to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getBegAuthAsymId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("beg_auth_asym_id", StrColumn::new) :
                getBinaryColumn("beg_auth_asym_id"));
    }

    /**
     * Part of the identifier for the component range in this group assignment.
     * 
     * This data item is a pointer to _atom_site.auth_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getBegAuthCompId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("beg_auth_comp_id", StrColumn::new) :
                getBinaryColumn("beg_auth_comp_id"));
    }

    /**
     * Part of the identifier for the component range in this group assignment.
     * 
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getBegAuthSeqId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("beg_auth_seq_id", StrColumn::new) :
                getBinaryColumn("beg_auth_seq_id"));
    }

    /**
     * Part of the identifier for the component range in this group assignment.
     * 
     * This data item is a pointer to _atom_site.pdbx_PDB_ins_code in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getBegPDBInsCode() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("beg_PDB_ins_code", StrColumn::new) :
                getBinaryColumn("beg_PDB_ins_code"));
    }

    /**
     * Part of the identifier for the component range in this group assignment.
     * 
     * This data item is a pointer to _atom_site.label_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getBegLabelAsymId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("beg_label_asym_id", StrColumn::new) :
                getBinaryColumn("beg_label_asym_id"));
    }

    /**
     * Part of the identifier for the component range in this group assignment.
     * 
     * This data item is a pointer to _atom_site.label_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getBegLabelCompId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("beg_label_comp_id", StrColumn::new) :
                getBinaryColumn("beg_label_comp_id"));
    }

    /**
     * Part of the identifier for the component range in this group assignment.
     * 
     * This data item is a pointer to _atom_site.label_seq_id in the
     * ATOM_SITE category.
     * @return IntColumn
     */
    public IntColumn getBegLabelSeqId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("beg_label_seq_id", IntColumn::new) :
                getBinaryColumn("beg_label_seq_id"));
    }

    /**
     * Part of the identifier for the component range in this group assignment.
     * 
     * This data item is a pointer to _atom_site.label_alt_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getBegLabelAltId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("beg_label_alt_id", StrColumn::new) :
                getBinaryColumn("beg_label_alt_id"));
    }

    /**
     * Part of the identifier for the component range in this group assignment.
     * 
     * This data item is a pointer to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getEndAuthAsymId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("end_auth_asym_id", StrColumn::new) :
                getBinaryColumn("end_auth_asym_id"));
    }

    /**
     * Part of the identifier for the component range in this group assignment.
     * 
     * This data item is a pointer to _atom_site.auth_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getEndAuthCompId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("end_auth_comp_id", StrColumn::new) :
                getBinaryColumn("end_auth_comp_id"));
    }

    /**
     * Part of the identifier for the component range in this group assignment.
     * 
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getEndAuthSeqId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("end_auth_seq_id", StrColumn::new) :
                getBinaryColumn("end_auth_seq_id"));
    }

    /**
     * Part of the identifier for the component range in this group assignment.
     * 
     * This data item is a pointer to _atom_site.pdbx_PDB_ins_code in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getEndPDBInsCode() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("end_PDB_ins_code", StrColumn::new) :
                getBinaryColumn("end_PDB_ins_code"));
    }

    /**
     * Part of the identifier for the component range in this group assignment.
     * 
     * This data item is a pointer to _atom_site.label_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getEndLabelAsymId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("end_label_asym_id", StrColumn::new) :
                getBinaryColumn("end_label_asym_id"));
    }

    /**
     * Part of the identifier for the component range in this group assignment.
     * 
     * This data item is a pointer to _atom_site.label_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getEndLabelCompId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("end_label_comp_id", StrColumn::new) :
                getBinaryColumn("end_label_comp_id"));
    }

    /**
     * Part of the identifier for the component range in this group assignment.
     * 
     * This data item is a pointer to _atom_site.label_seq_id in the
     * ATOM_SITE category.
     * @return IntColumn
     */
    public IntColumn getEndLabelSeqId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("end_label_seq_id", IntColumn::new) :
                getBinaryColumn("end_label_seq_id"));
    }

    /**
     * Part of the identifier for the component range in this group assignment.
     * 
     * This data item is a pointer to _atom_site.label_alt_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getEndLabelAltId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("end_label_alt_id", StrColumn::new) :
                getBinaryColumn("end_label_alt_id"));
    }
}
