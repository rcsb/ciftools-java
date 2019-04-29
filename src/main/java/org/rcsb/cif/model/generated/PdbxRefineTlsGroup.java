package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_REFINE_TLS_GROUP category record details about
 * a fragment of a TLS group.
 * 
 * Properties of the TLS group are recorded in PDBX_REFINE_TLS
 */
@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxRefineTlsGroup extends BaseCategory {
    public PdbxRefineTlsGroup(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxRefineTlsGroup(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxRefineTlsGroup(String name) {
        super(name);
    }

    /**
     * The value of _pdbx_refine_tls_group.id must uniquely identify
     * a record in the REFINE_TLS_GROUP list for a particular refinement.
     * Note that this item need not be a number; it can be any unique
     * identifier.
     * @return StrColumn
     */
    public StrColumn getId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("id", StrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * This data item uniquely identifies a refinement within an entry.
     * _pdbx_refine_tls_group.pdbx_refine_id can be used to distinguish the results
     * of joint refinements.
     * @return StrColumn
     */
    public StrColumn getPdbxRefineId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_refine_id", StrColumn::new) :
                getBinaryColumn("pdbx_refine_id"));
    }

    /**
     * This data item is a pointer to _pdbx_refine_tls.id in the
     * REFINE_TLS category.
     * @return StrColumn
     */
    public StrColumn getRefineTlsId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("refine_tls_id", StrColumn::new) :
                getBinaryColumn("refine_tls_id"));
    }

    /**
     * A component of the identifier for the residue at which the
     * TLS fragment range begins.
     * 
     * This data item is a pointer to _struct_asym.id in the
     * STRUCT_ASYM category.
     * @return StrColumn
     */
    public StrColumn getBegLabelAsymId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("beg_label_asym_id", StrColumn::new) :
                getBinaryColumn("beg_label_asym_id"));
    }

    /**
     * A component of the identifier for the residue at which the
     * TLS fragment range begins.
     * @return IntColumn
     */
    public IntColumn getBegLabelSeqId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("beg_label_seq_id", IntColumn::new) :
                getBinaryColumn("beg_label_seq_id"));
    }

    /**
     * A component of the identifier for the residue at which the
     * TLS fragment range begins.
     * @return StrColumn
     */
    public StrColumn getBegAuthAsymId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("beg_auth_asym_id", StrColumn::new) :
                getBinaryColumn("beg_auth_asym_id"));
    }

    /**
     * A component of the identifier for the residue at which the
     * TLS fragment range begins.
     * @return StrColumn
     */
    public StrColumn getBegAuthSeqId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("beg_auth_seq_id", StrColumn::new) :
                getBinaryColumn("beg_auth_seq_id"));
    }

    /**
     * A component of the identifier for the residue at which the
     * TLS fragment range ends.
     * 
     * This data item is a pointer to _struct_asym.id in the
     * STRUCT_ASYM category.
     * @return StrColumn
     */
    public StrColumn getEndLabelAsymId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("end_label_asym_id", StrColumn::new) :
                getBinaryColumn("end_label_asym_id"));
    }

    /**
     * A component of the identifier for the residue at which the
     * TLS fragment range ends.
     * @return IntColumn
     */
    public IntColumn getEndLabelSeqId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("end_label_seq_id", IntColumn::new) :
                getBinaryColumn("end_label_seq_id"));
    }

    /**
     * A component of the identifier for the residue at which the
     * TLS fragment range ends.
     * @return StrColumn
     */
    public StrColumn getEndAuthAsymId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("end_auth_asym_id", StrColumn::new) :
                getBinaryColumn("end_auth_asym_id"));
    }

    /**
     * A component of the identifier for the residue at which the
     * TLS fragment range ends.
     * @return StrColumn
     */
    public StrColumn getEndAuthSeqId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("end_auth_seq_id", StrColumn::new) :
                getBinaryColumn("end_auth_seq_id"));
    }

    /**
     * A qualification of the subset of atoms in the specified
     * range included in the TLS fragment.
     * @return StrColumn
     */
    public StrColumn getSelection() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("selection", StrColumn::new) :
                getBinaryColumn("selection"));
    }

    /**
     * A text description of subset of atoms included
     * included in the TLS fragment.
     * @return StrColumn
     */
    public StrColumn getSelectionDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("selection_details", StrColumn::new) :
                getBinaryColumn("selection_details"));
    }
}
