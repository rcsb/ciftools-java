package org.rcsb.cif.model.pdbxsequencerange;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxSequenceRange extends BaseCategory {
    public PdbxSequenceRange(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxSequenceRange(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxSequenceRange(String name) {
        super(name);
    }

    /**
     * A component of the identifier for the monomer at which this
     * segment of the sequence range begins.
     * 
     * This data item is a pointer to _atom_sites_alt.id in the
     * ATOM_SITES_ALT category.
     * @return BegLabelAltId
     */
    public BegLabelAltId getBegLabelAltId() {
        return (BegLabelAltId) (isText ? textFields.computeIfAbsent("beg_label_alt_id",
                BegLabelAltId::new) : getBinaryColumn("beg_label_alt_id"));
    }

    /**
     * A component of the identifier for the monomer at which this
     * segment of the sequence range begins.
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
     * A component of the identifier for the monomer at which this
     * segment of the sequence range begins.
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
     * A component of the identifier for the monomer at which this
     * segment of the sequence range begins.
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
     * A component of the identifier for the monomer at which this
     * segment of the sequence range begins.
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
     * A component of the identifier for the monomer at which this
     * segment of the sequence range begins.
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
     * A component of the identifier for the monomer at which this
     * segment of the sequence range begins.
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
     * This data item is an identifier for a sequence range.
     * @return SeqRangeId
     */
    public SeqRangeId getSeqRangeId() {
        return (SeqRangeId) (isText ? textFields.computeIfAbsent("seq_range_id",
                SeqRangeId::new) : getBinaryColumn("seq_range_id"));
    }

    /**
     * A component of the identifier for the monomer at which this
     * segment of the sequence range ends.
     * 
     * This data item is a pointer to _atom_sites_alt.id in the
     * ATOM_SITES_ALT category.
     * @return EndLabelAltId
     */
    public EndLabelAltId getEndLabelAltId() {
        return (EndLabelAltId) (isText ? textFields.computeIfAbsent("end_label_alt_id",
                EndLabelAltId::new) : getBinaryColumn("end_label_alt_id"));
    }

    /**
     * A component of the identifier for the monomer at which this
     * segment of the sequence range ends.
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
     * A component of the identifier for the monomer at which this
     * segment of the sequence range ends.
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
     * A component of the identifier for the monomer at which this
     * segment of the sequence range ends.
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
     * A component of the identifier for the monomer at which this
     * segment of the sequence range ends.
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
     * A component of the identifier for the monomer at which this
     * segment of the sequence range ends.
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
     * A component of the identifier for the monomer at which this
     * segment of the sequence range ends.
     * 
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return EndAuthSeqId
     */
    public EndAuthSeqId getEndAuthSeqId() {
        return (EndAuthSeqId) (isText ? textFields.computeIfAbsent("end_auth_seq_id",
                EndAuthSeqId::new) : getBinaryColumn("end_auth_seq_id"));
    }
}
