package org.rcsb.cif.model.structncsdomlim;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class StructNcsDomLim extends BaseCategory {
    public StructNcsDomLim(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public StructNcsDomLim(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public StructNcsDomLim(String name) {
        super(name);
    }

    /**
     * A component of the identifier for the monomer at which this
     * segment of the domain begins.
     * @return BegLabelAltId
     */
    public BegLabelAltId getBegLabelAltId() {
        return (BegLabelAltId) (isText ? textFields.computeIfAbsent("beg_label_alt_id",
                BegLabelAltId::new) : getBinaryColumn("beg_label_alt_id"));
    }

    /**
     * A component of the identifier for the monomer at which this
     * segment of the domain begins.
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
     * A component of the identifier for the monomer at which this
     * segment of the domain begins.
     * @return BegLabelCompId
     */
    public BegLabelCompId getBegLabelCompId() {
        return (BegLabelCompId) (isText ? textFields.computeIfAbsent("beg_label_comp_id",
                BegLabelCompId::new) : getBinaryColumn("beg_label_comp_id"));
    }

    /**
     * A component of the identifier for the monomer at which this
     * segment of the domain begins.
     * @return BegLabelSeqId
     */
    public BegLabelSeqId getBegLabelSeqId() {
        return (BegLabelSeqId) (isText ? textFields.computeIfAbsent("beg_label_seq_id",
                BegLabelSeqId::new) : getBinaryColumn("beg_label_seq_id"));
    }

    /**
     * A component of the identifier for the monomer at which this
     * segment of the domain begins.
     * @return BegAuthAsymId
     */
    public BegAuthAsymId getBegAuthAsymId() {
        return (BegAuthAsymId) (isText ? textFields.computeIfAbsent("beg_auth_asym_id",
                BegAuthAsymId::new) : getBinaryColumn("beg_auth_asym_id"));
    }

    /**
     * A component of the identifier for the monomer at which this
     * segment of the domain begins.
     * @return BegAuthCompId
     */
    public BegAuthCompId getBegAuthCompId() {
        return (BegAuthCompId) (isText ? textFields.computeIfAbsent("beg_auth_comp_id",
                BegAuthCompId::new) : getBinaryColumn("beg_auth_comp_id"));
    }

    /**
     * A component of the identifier for the monomer at which this
     * segment of the domain begins.
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
     * This data item is a pointer to _struct_ncs_dom.id in the
     * STRUCT_NCS_DOM category.
     * @return DomId
     */
    public DomId getDomId() {
        return (DomId) (isText ? textFields.computeIfAbsent("dom_id",
                DomId::new) : getBinaryColumn("dom_id"));
    }

    /**
     * A component of the identifier for the monomer at which this
     * segment of the domain ends.
     * @return EndLabelAltId
     */
    public EndLabelAltId getEndLabelAltId() {
        return (EndLabelAltId) (isText ? textFields.computeIfAbsent("end_label_alt_id",
                EndLabelAltId::new) : getBinaryColumn("end_label_alt_id"));
    }

    /**
     * A component of the identifier for the monomer at which this
     * segment of the domain ends.
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
     * A component of the identifier for the monomer at which this
     * segment of the domain ends.
     * @return EndLabelCompId
     */
    public EndLabelCompId getEndLabelCompId() {
        return (EndLabelCompId) (isText ? textFields.computeIfAbsent("end_label_comp_id",
                EndLabelCompId::new) : getBinaryColumn("end_label_comp_id"));
    }

    /**
     * A component of the identifier for the monomer at which this
     * segment of the domain ends.
     * @return EndLabelSeqId
     */
    public EndLabelSeqId getEndLabelSeqId() {
        return (EndLabelSeqId) (isText ? textFields.computeIfAbsent("end_label_seq_id",
                EndLabelSeqId::new) : getBinaryColumn("end_label_seq_id"));
    }

    /**
     * A component of the identifier for the monomer at which this
     * segment of the domain ends.
     * @return EndAuthAsymId
     */
    public EndAuthAsymId getEndAuthAsymId() {
        return (EndAuthAsymId) (isText ? textFields.computeIfAbsent("end_auth_asym_id",
                EndAuthAsymId::new) : getBinaryColumn("end_auth_asym_id"));
    }

    /**
     * A component of the identifier for the monomer at which this
     * segment of the domain ends.
     * @return EndAuthCompId
     */
    public EndAuthCompId getEndAuthCompId() {
        return (EndAuthCompId) (isText ? textFields.computeIfAbsent("end_auth_comp_id",
                EndAuthCompId::new) : getBinaryColumn("end_auth_comp_id"));
    }

    /**
     * A component of the identifier for the monomer at which this
     * segment of the domain ends.
     * @return EndAuthSeqId
     */
    public EndAuthSeqId getEndAuthSeqId() {
        return (EndAuthSeqId) (isText ? textFields.computeIfAbsent("end_auth_seq_id",
                EndAuthSeqId::new) : getBinaryColumn("end_auth_seq_id"));
    }

    /**
     * A text description of the selection of residues that
     * correspond to this domain.
     * @return SelectionDetails
     */
    public SelectionDetails getSelectionDetails() {
        return (SelectionDetails) (isText ? textFields.computeIfAbsent("selection_details",
                SelectionDetails::new) : getBinaryColumn("selection_details"));
    }

    /**
     * Record number of the NCS domain limit assignment.
     * @return PdbxComponentId
     */
    public PdbxComponentId getPdbxComponentId() {
        return (PdbxComponentId) (isText ? textFields.computeIfAbsent("pdbx_component_id",
                PdbxComponentId::new) : getBinaryColumn("pdbx_component_id"));
    }

    /**
     * record the refinement code number (from CCP4.)
     * @return PdbxRefineCode
     */
    public PdbxRefineCode getPdbxRefineCode() {
        return (PdbxRefineCode) (isText ? textFields.computeIfAbsent("pdbx_refine_code",
                PdbxRefineCode::new) : getBinaryColumn("pdbx_refine_code"));
    }

    /**
     * This is a unique identifier for a collection NCS related domains.
     * This references item '_struct_ncs_dom.pdbx_ens_id'.
     * @return PdbxEnsId
     */
    public PdbxEnsId getPdbxEnsId() {
        return (PdbxEnsId) (isText ? textFields.computeIfAbsent("pdbx_ens_id",
                PdbxEnsId::new) : getBinaryColumn("pdbx_ens_id"));
    }
}
