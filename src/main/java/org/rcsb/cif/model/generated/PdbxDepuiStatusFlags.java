package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_DEPUI_STATUS_FLAGS category record status
 * details used to maintain state within the wwPDB deposition system.
 */
@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
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
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDepDatasetId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("dep_dataset_id", SingleRowStrColumn::new) :
                getBinaryColumn("dep_dataset_id"));
    }

    /**
     * A flag to indicate status about primary citation data.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getPrimaryCitationStatus() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("primary_citation_status", SingleRowStrColumn::new) :
                getBinaryColumn("primary_citation_status"));
    }

    /**
     * A flag to indicate status about corresponding author data.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getCorrespondingAuthorStatus() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("corresponding_author_status", SingleRowStrColumn::new) :
                getBinaryColumn("corresponding_author_status"));
    }

    /**
     * A flag to indicate status about reference citation data.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getReferenceCitationStatus() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("reference_citation_status", SingleRowStrColumn::new) :
                getBinaryColumn("reference_citation_status"));
    }

    /**
     * A flag to indicate that the deposition was grant funded.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getIsGrantFunded() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("is_grant_funded", SingleRowStrColumn::new) :
                getBinaryColumn("is_grant_funded"));
    }

    /**
     * A flag to indicate that the deposition includes NCS data.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getHasNcsData() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("has_ncs_data", SingleRowStrColumn::new) :
                getBinaryColumn("has_ncs_data"));
    }

    /**
     * A flag to indicate that this entry is a candidate prediction target.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getPredictionTarget() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("prediction_target", SingleRowStrColumn::new) :
                getBinaryColumn("prediction_target"));
    }

    /**
     * A flag to indicate that this entry has helical symmetry
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getHasHelicalSymmetry() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("has_helical_symmetry", SingleRowStrColumn::new) :
                getBinaryColumn("has_helical_symmetry"));
    }

    /**
     * A flag to indicate that this entry has point symmetry
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getHasPointSymmetry() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("has_point_symmetry", SingleRowStrColumn::new) :
                getBinaryColumn("has_point_symmetry"));
    }

    /**
     * A flag to indicate that this entry has cyclic symmetry
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getHasCyclicSymmetry() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("has_cyclic_symmetry", SingleRowStrColumn::new) :
                getBinaryColumn("has_cyclic_symmetry"));
    }

    /**
     * A flag to indicate the acceptance of wwPDB deposition and annotation terms and conditions.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getHasAcceptedTermsAndConditions() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("has_accepted_terms_and_conditions", SingleRowStrColumn::new) :
                getBinaryColumn("has_accepted_terms_and_conditions"));
    }

    /**
     * A flag to indicate the viewing the latest validation report.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getHasViewedValidationReport() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("has_viewed_validation_report", SingleRowStrColumn::new) :
                getBinaryColumn("has_viewed_validation_report"));
    }

    /**
     * The the last validation report operation, the name of the model file last validated.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getValidatedModelFileName() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("validated_model_file_name", SingleRowStrColumn::new) :
                getBinaryColumn("validated_model_file_name"));
    }

    /**
     * For the last model merge operation, the name of the model file containing prior data for the current deposition session.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getMergePriorModelFileName() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("merge_prior_model_file_name", SingleRowStrColumn::new) :
                getBinaryColumn("merge_prior_model_file_name"));
    }

    /**
     * For the last model merge operation, the name of the model file containing user provided replacement coordinate and model data.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getMergeReplaceModelFileName() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("merge_replace_model_file_name", SingleRowStrColumn::new) :
                getBinaryColumn("merge_replace_model_file_name"));
    }

    /**
     * For the last model merge operation, the name of the model file containing output from the merge operation.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getMergeOutputModelFileName() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("merge_output_model_file_name", SingleRowStrColumn::new) :
                getBinaryColumn("merge_output_model_file_name"));
    }

    /**
     * A flag to indicate that ligand processing is complete
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getIsLigandProcessingComplete() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("is_ligand_processing_complete", SingleRowStrColumn::new) :
                getBinaryColumn("is_ligand_processing_complete"));
    }

    /**
     * A flag to indicate that all sample coordinate sequence alignments are valid.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getSampleXyzSequenceAlignmentsValid() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("sample_xyz_sequence_alignments_valid", SingleRowStrColumn::new) :
                getBinaryColumn("sample_xyz_sequence_alignments_valid"));
    }

    /**
     * A flag to indicate whether the author has related SAXS/SANS data.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getHasSasData() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("has_sas_data", SingleRowStrColumn::new) :
                getBinaryColumn("has_sas_data"));
    }

    /**
     * A flag to indicate whether related SAXS/SANS data is already deposited elsewhere
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getIsSasDeposited() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("is_sas_deposited", SingleRowStrColumn::new) :
                getBinaryColumn("is_sas_deposited"));
    }

    /**
     * A flag to indicate whether related SAXS/SANS data were used in refinement
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getUseSasRefine() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("use_sas_refine", SingleRowStrColumn::new) :
                getBinaryColumn("use_sas_refine"));
    }

    /**
     * A flag to indicate that merging of new coordinates has failed.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getMergedFail() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("merged_fail", SingleRowStrColumn::new) :
                getBinaryColumn("merged_fail"));
    }
}
