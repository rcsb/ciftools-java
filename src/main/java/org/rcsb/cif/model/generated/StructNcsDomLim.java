package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the STRUCT_NCS_DOM_LIM category identify the
 * start and end points of polypeptide chain segments
 * that form all or part of a domain in an ensemble of domains
 * related by noncrystallographic symmetry.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return StrColumn
     */
    public StrColumn getBegLabelAltId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("beg_label_alt_id", StrColumn::new) :
                getBinaryColumn("beg_label_alt_id"));
    }

    /**
     * A component of the identifier for the monomer at which this
     * segment of the domain begins.
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
     * A component of the identifier for the monomer at which this
     * segment of the domain begins.
     * @return StrColumn
     */
    public StrColumn getBegLabelCompId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("beg_label_comp_id", StrColumn::new) :
                getBinaryColumn("beg_label_comp_id"));
    }

    /**
     * A component of the identifier for the monomer at which this
     * segment of the domain begins.
     * @return IntColumn
     */
    public IntColumn getBegLabelSeqId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("beg_label_seq_id", IntColumn::new) :
                getBinaryColumn("beg_label_seq_id"));
    }

    /**
     * A component of the identifier for the monomer at which this
     * segment of the domain begins.
     * @return StrColumn
     */
    public StrColumn getBegAuthAsymId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("beg_auth_asym_id", StrColumn::new) :
                getBinaryColumn("beg_auth_asym_id"));
    }

    /**
     * A component of the identifier for the monomer at which this
     * segment of the domain begins.
     * @return StrColumn
     */
    public StrColumn getBegAuthCompId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("beg_auth_comp_id", StrColumn::new) :
                getBinaryColumn("beg_auth_comp_id"));
    }

    /**
     * A component of the identifier for the monomer at which this
     * segment of the domain begins.
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
     * This data item is a pointer to _struct_ncs_dom.id in the
     * STRUCT_NCS_DOM category.
     * @return StrColumn
     */
    public StrColumn getDomId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("dom_id", StrColumn::new) :
                getBinaryColumn("dom_id"));
    }

    /**
     * A component of the identifier for the monomer at which this
     * segment of the domain ends.
     * @return StrColumn
     */
    public StrColumn getEndLabelAltId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("end_label_alt_id", StrColumn::new) :
                getBinaryColumn("end_label_alt_id"));
    }

    /**
     * A component of the identifier for the monomer at which this
     * segment of the domain ends.
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
     * A component of the identifier for the monomer at which this
     * segment of the domain ends.
     * @return StrColumn
     */
    public StrColumn getEndLabelCompId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("end_label_comp_id", StrColumn::new) :
                getBinaryColumn("end_label_comp_id"));
    }

    /**
     * A component of the identifier for the monomer at which this
     * segment of the domain ends.
     * @return IntColumn
     */
    public IntColumn getEndLabelSeqId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("end_label_seq_id", IntColumn::new) :
                getBinaryColumn("end_label_seq_id"));
    }

    /**
     * A component of the identifier for the monomer at which this
     * segment of the domain ends.
     * @return StrColumn
     */
    public StrColumn getEndAuthAsymId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("end_auth_asym_id", StrColumn::new) :
                getBinaryColumn("end_auth_asym_id"));
    }

    /**
     * A component of the identifier for the monomer at which this
     * segment of the domain ends.
     * @return StrColumn
     */
    public StrColumn getEndAuthCompId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("end_auth_comp_id", StrColumn::new) :
                getBinaryColumn("end_auth_comp_id"));
    }

    /**
     * A component of the identifier for the monomer at which this
     * segment of the domain ends.
     * @return StrColumn
     */
    public StrColumn getEndAuthSeqId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("end_auth_seq_id", StrColumn::new) :
                getBinaryColumn("end_auth_seq_id"));
    }

    /**
     * A text description of the selection of residues that
     * correspond to this domain.
     * @return StrColumn
     */
    public StrColumn getSelectionDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("selection_details", StrColumn::new) :
                getBinaryColumn("selection_details"));
    }

    /**
     * Record number of the NCS domain limit assignment.
     * @return IntColumn
     */
    public IntColumn getPdbxComponentId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("pdbx_component_id", IntColumn::new) :
                getBinaryColumn("pdbx_component_id"));
    }

    /**
     * record the refinement code number (from CCP4.)
     * @return FloatColumn
     */
    public FloatColumn getPdbxRefineCode() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_refine_code", FloatColumn::new) :
                getBinaryColumn("pdbx_refine_code"));
    }

    /**
     * This is a unique identifier for a collection NCS related domains.
     * This references item '_struct_ncs_dom.pdbx_ens_id'.
     * @return StrColumn
     */
    public StrColumn getPdbxEnsId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_ens_id", StrColumn::new) :
                getBinaryColumn("pdbx_ens_id"));
    }
}
