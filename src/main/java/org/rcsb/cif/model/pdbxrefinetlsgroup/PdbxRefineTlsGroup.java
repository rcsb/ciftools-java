package org.rcsb.cif.model.pdbxrefinetlsgroup;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

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
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }

    /**
     * This data item uniquely identifies a refinement within an entry.
     * _pdbx_refine_tls_group.pdbx_refine_id can be used to distinguish the results
     * of joint refinements.
     * @return PdbxRefineId
     */
    public PdbxRefineId getPdbxRefineId() {
        return (PdbxRefineId) (isText ? textFields.computeIfAbsent("pdbx_refine_id",
                PdbxRefineId::new) : getBinaryColumn("pdbx_refine_id"));
    }

    /**
     * This data item is a pointer to _pdbx_refine_tls.id in the
     * REFINE_TLS category.
     * @return RefineTlsId
     */
    public RefineTlsId getRefineTlsId() {
        return (RefineTlsId) (isText ? textFields.computeIfAbsent("refine_tls_id",
                RefineTlsId::new) : getBinaryColumn("refine_tls_id"));
    }

    /**
     * A component of the identifier for the residue at which the
     * TLS fragment range begins.
     * 
     * This data item is a pointer to _struct_asym.id in the
     * STRUCT_ASYM category.
     * @return BegLabelAsymId
     */
    public BegLabelAsymId getBegLabelAsymId() {
        return (BegLabelAsymId) (isText ? textFields.computeIfAbsent("beg_label_asym_id",
                BegLabelAsymId::new) : getBinaryColumn("beg_label_asym_id"));
    }

    /**
     * A component of the identifier for the residue at which the
     * TLS fragment range begins.
     * @return BegLabelSeqId
     */
    public BegLabelSeqId getBegLabelSeqId() {
        return (BegLabelSeqId) (isText ? textFields.computeIfAbsent("beg_label_seq_id",
                BegLabelSeqId::new) : getBinaryColumn("beg_label_seq_id"));
    }

    /**
     * A component of the identifier for the residue at which the
     * TLS fragment range begins.
     * @return BegAuthAsymId
     */
    public BegAuthAsymId getBegAuthAsymId() {
        return (BegAuthAsymId) (isText ? textFields.computeIfAbsent("beg_auth_asym_id",
                BegAuthAsymId::new) : getBinaryColumn("beg_auth_asym_id"));
    }

    /**
     * A component of the identifier for the residue at which the
     * TLS fragment range begins.
     * @return BegAuthSeqId
     */
    public BegAuthSeqId getBegAuthSeqId() {
        return (BegAuthSeqId) (isText ? textFields.computeIfAbsent("beg_auth_seq_id",
                BegAuthSeqId::new) : getBinaryColumn("beg_auth_seq_id"));
    }

    /**
     * A component of the identifier for the residue at which the
     * TLS fragment range ends.
     * 
     * This data item is a pointer to _struct_asym.id in the
     * STRUCT_ASYM category.
     * @return EndLabelAsymId
     */
    public EndLabelAsymId getEndLabelAsymId() {
        return (EndLabelAsymId) (isText ? textFields.computeIfAbsent("end_label_asym_id",
                EndLabelAsymId::new) : getBinaryColumn("end_label_asym_id"));
    }

    /**
     * A component of the identifier for the residue at which the
     * TLS fragment range ends.
     * @return EndLabelSeqId
     */
    public EndLabelSeqId getEndLabelSeqId() {
        return (EndLabelSeqId) (isText ? textFields.computeIfAbsent("end_label_seq_id",
                EndLabelSeqId::new) : getBinaryColumn("end_label_seq_id"));
    }

    /**
     * A component of the identifier for the residue at which the
     * TLS fragment range ends.
     * @return EndAuthAsymId
     */
    public EndAuthAsymId getEndAuthAsymId() {
        return (EndAuthAsymId) (isText ? textFields.computeIfAbsent("end_auth_asym_id",
                EndAuthAsymId::new) : getBinaryColumn("end_auth_asym_id"));
    }

    /**
     * A component of the identifier for the residue at which the
     * TLS fragment range ends.
     * @return EndAuthSeqId
     */
    public EndAuthSeqId getEndAuthSeqId() {
        return (EndAuthSeqId) (isText ? textFields.computeIfAbsent("end_auth_seq_id",
                EndAuthSeqId::new) : getBinaryColumn("end_auth_seq_id"));
    }

    /**
     * A qualification of the subset of atoms in the specified
     * range included in the TLS fragment.
     * @return Selection
     */
    public Selection getSelection() {
        return (Selection) (isText ? textFields.computeIfAbsent("selection",
                Selection::new) : getBinaryColumn("selection"));
    }

    /**
     * A text description of subset of atoms included
     * included in the TLS fragment.
     * @return SelectionDetails
     */
    public SelectionDetails getSelectionDetails() {
        return (SelectionDetails) (isText ? textFields.computeIfAbsent("selection_details",
                SelectionDetails::new) : getBinaryColumn("selection_details"));
    }
}
