package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the STRUCT_CONF category record details about
 * the backbone conformation of a segment of polymer.
 * 
 * Data items in the STRUCT_CONF_TYPE category define the
 * criteria used to identify the backbone conformations.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class StructConf extends BaseCategory {
    public StructConf(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public StructConf(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public StructConf(String name) {
        super(name);
    }

    /**
     * A component of the identifier for the residue at which the
     * conformation segment begins.
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
     * A component of the identifier for the residue at which the
     * conformation segment begins.
     * 
     * This data item is a pointer to _atom_site.label_comp_id in
     * the ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getBegLabelCompId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("beg_label_comp_id", StrColumn::new) :
                getBinaryColumn("beg_label_comp_id"));
    }

    /**
     * A component of the identifier for the residue at which the
     * conformation segment begins.
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
     * A component of the identifier for the residue at which the
     * conformation segment begins.
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
     * A component of the identifier for the residue at which the
     * conformation segment begins.
     * 
     * This data item is a pointer to _atom_site.auth_comp_id in
     * the ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getBegAuthCompId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("beg_auth_comp_id", StrColumn::new) :
                getBinaryColumn("beg_auth_comp_id"));
    }

    /**
     * A component of the identifier for the residue at which the
     * conformation segment begins.
     * 
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return IntColumn
     */
    public IntColumn getBegAuthSeqId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("beg_auth_seq_id", IntColumn::new) :
                getBinaryColumn("beg_auth_seq_id"));
    }

    /**
     * This data item is a pointer to _struct_conf_type.id in the
     * STRUCT_CONF_TYPE category.
     * @return StrColumn
     */
    public StrColumn getConfTypeId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("conf_type_id", StrColumn::new) :
                getBinaryColumn("conf_type_id"));
    }

    /**
     * A description of special aspects of the conformation assignment.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * A component of the identifier for the residue at which the
     * conformation segment ends.
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
     * A component of the identifier for the residue at which the
     * conformation segment ends.
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
     * A component of the identifier for the residue at which the
     * conformation segment ends.
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
     * A component of the identifier for the residue at which the
     * conformation segment ends.
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
     * A component of the identifier for the residue at which the
     * conformation segment ends.
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
     * A component of the identifier for the residue at which the
     * conformation segment ends.
     * 
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return IntColumn
     */
    public IntColumn getEndAuthSeqId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("end_auth_seq_id", IntColumn::new) :
                getBinaryColumn("end_auth_seq_id"));
    }

    /**
     * The value of _struct_conf.id must uniquely identify a record in
     * the STRUCT_CONF list.
     * 
     * Note that this item need not be a number; it can be any unique
     * identifier.
     * @return StrColumn
     */
    public StrColumn getId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("id", StrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * A component of the identifier for the residue at which the
     * conformation segment starts.
     * @return StrColumn
     */
    public StrColumn getPdbxBegPDBInsCode() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_beg_PDB_ins_code", StrColumn::new) :
                getBinaryColumn("pdbx_beg_PDB_ins_code"));
    }

    /**
     * A component of the identifier for the residue at which the
     * conformation segment ends.
     * @return StrColumn
     */
    public StrColumn getPdbxEndPDBInsCode() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_end_PDB_ins_code", StrColumn::new) :
                getBinaryColumn("pdbx_end_PDB_ins_code"));
    }

    /**
     * This item is a place holder for the helix class used in the PDB
     * HELIX record.
     * @return StrColumn
     */
    public StrColumn getPdbxPDBHelixClass() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_PDB_helix_class", StrColumn::new) :
                getBinaryColumn("pdbx_PDB_helix_class"));
    }

    /**
     * 
     * A placeholder for the lengths of the helix of the PDB
     * HELIX record.
     * @return IntColumn
     */
    public IntColumn getPdbxPDBHelixLength() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("pdbx_PDB_helix_length", IntColumn::new) :
                getBinaryColumn("pdbx_PDB_helix_length"));
    }

    /**
     * 
     * A placeholder for the helix identifier of the PDB
     * HELIX record.
     * @return StrColumn
     */
    public StrColumn getPdbxPDBHelixId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_PDB_helix_id", StrColumn::new) :
                getBinaryColumn("pdbx_PDB_helix_id"));
    }
}
