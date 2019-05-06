package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_DEPUI_STATUS_FLAGS category record status
 * details used to maintain state within the wwPDB deposition system.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class PdbxDepuiStatusFlags extends BaseCategory {
    public PdbxDepuiStatusFlags(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxDepuiStatusFlags(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxDepuiStatusFlags(String name) {
        super(name);
    }

    /**
     * The internal identifier assigned to each deposition.
     * @return StrColumn
     */
    public StrColumn getDepDatasetId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("dep_dataset_id", StrColumn::new) :
                getBinaryColumn("dep_dataset_id"));
    }

    /**
     * A flag to indicate status about primary citation data.
     * @return StrColumn
     */
    public StrColumn getPrimaryCitationStatus() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("primary_citation_status", StrColumn::new) :
                getBinaryColumn("primary_citation_status"));
    }

    /**
     * A flag to indicate status about corresponding author data.
     * @return StrColumn
     */
    public StrColumn getCorrespondingAuthorStatus() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("corresponding_author_status", StrColumn::new) :
                getBinaryColumn("corresponding_author_status"));
    }

    /**
     * A flag to indicate status about reference citation data.
     * @return StrColumn
     */
    public StrColumn getReferenceCitationStatus() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("reference_citation_status", StrColumn::new) :
                getBinaryColumn("reference_citation_status"));
    }

    /**
     * A flag to indicate that the deposition was grant funded.
     * @return StrColumn
     */
    public StrColumn getIsGrantFunded() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("is_grant_funded", StrColumn::new) :
                getBinaryColumn("is_grant_funded"));
    }

    /**
     * A flag to indicate that the deposition includes NCS data.
     * @return StrColumn
     */
    public StrColumn getHasNcsData() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("has_ncs_data", StrColumn::new) :
                getBinaryColumn("has_ncs_data"));
    }

    /**
     * A flag to indicate that this entry is a candidate prediction target.
     * @return StrColumn
     */
    public StrColumn getPredictionTarget() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("prediction_target", StrColumn::new) :
                getBinaryColumn("prediction_target"));
    }

    /**
     * A flag to indicate that this entry has helical symmetry
     * @return StrColumn
     */
    public StrColumn getHasHelicalSymmetry() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("has_helical_symmetry", StrColumn::new) :
                getBinaryColumn("has_helical_symmetry"));
    }

    /**
     * A flag to indicate that this entry has point symmetry
     * @return StrColumn
     */
    public StrColumn getHasPointSymmetry() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("has_point_symmetry", StrColumn::new) :
                getBinaryColumn("has_point_symmetry"));
    }

    /**
     * A flag to indicate that this entry has cyclic symmetry
     * @return StrColumn
     */
    public StrColumn getHasCyclicSymmetry() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("has_cyclic_symmetry", StrColumn::new) :
                getBinaryColumn("has_cyclic_symmetry"));
    }

    /**
     * A flag to indicate the acceptance of wwPDB deposition and annotation terms and conditions.
     * @return StrColumn
     */
    public StrColumn getHasAcceptedTermsAndConditions() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("has_accepted_terms_and_conditions", StrColumn::new) :
                getBinaryColumn("has_accepted_terms_and_conditions"));
    }

    /**
     * A flag to indicate the viewing the latest validation report.
     * @return StrColumn
     */
    public StrColumn getHasViewedValidationReport() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("has_viewed_validation_report", StrColumn::new) :
                getBinaryColumn("has_viewed_validation_report"));
    }

    /**
     * The the last validation report operation, the name of the model file last validated.
     * @return StrColumn
     */
    public StrColumn getValidatedModelFileName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("validated_model_file_name", StrColumn::new) :
                getBinaryColumn("validated_model_file_name"));
    }

    /**
     * For the last model merge operation, the name of the model file containing prior data for the current deposition session.
     * @return StrColumn
     */
    public StrColumn getMergePriorModelFileName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("merge_prior_model_file_name", StrColumn::new) :
                getBinaryColumn("merge_prior_model_file_name"));
    }

    /**
     * For the last model merge operation, the name of the model file containing user provided replacement coordinate and model data.
     * @return StrColumn
     */
    public StrColumn getMergeReplaceModelFileName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("merge_replace_model_file_name", StrColumn::new) :
                getBinaryColumn("merge_replace_model_file_name"));
    }

    /**
     * For the last model merge operation, the name of the model file containing output from the merge operation.
     * @return StrColumn
     */
    public StrColumn getMergeOutputModelFileName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("merge_output_model_file_name", StrColumn::new) :
                getBinaryColumn("merge_output_model_file_name"));
    }

    /**
     * A flag to indicate that ligand processing is complete
     * @return StrColumn
     */
    public StrColumn getIsLigandProcessingComplete() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("is_ligand_processing_complete", StrColumn::new) :
                getBinaryColumn("is_ligand_processing_complete"));
    }

    /**
     * A flag to indicate that all sample coordinate sequence alignments are valid.
     * @return StrColumn
     */
    public StrColumn getSampleXyzSequenceAlignmentsValid() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("sample_xyz_sequence_alignments_valid", StrColumn::new) :
                getBinaryColumn("sample_xyz_sequence_alignments_valid"));
    }

    /**
     * A flag to indicate whether the author has related SAXS/SANS data.
     * @return StrColumn
     */
    public StrColumn getHasSasData() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("has_sas_data", StrColumn::new) :
                getBinaryColumn("has_sas_data"));
    }

    /**
     * A flag to indicate whether related SAXS/SANS data is already deposited elsewhere
     * @return StrColumn
     */
    public StrColumn getIsSasDeposited() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("is_sas_deposited", StrColumn::new) :
                getBinaryColumn("is_sas_deposited"));
    }

    /**
     * A flag to indicate whether related SAXS/SANS data were used in refinement
     * @return StrColumn
     */
    public StrColumn getUseSasRefine() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("use_sas_refine", StrColumn::new) :
                getBinaryColumn("use_sas_refine"));
    }

    /**
     * A flag to indicate that merging of new coordinates has failed.
     * @return StrColumn
     */
    public StrColumn getMergedFail() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("merged_fail", StrColumn::new) :
                getBinaryColumn("merged_fail"));
    }
}
