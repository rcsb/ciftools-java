package org.rcsb.cif.model.pdbxdepuistatusflags;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

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
     * @return DepDatasetId
     */
    public DepDatasetId getDepDatasetId() {
        return (DepDatasetId) (isText ? textFields.computeIfAbsent("dep_dataset_id",
                DepDatasetId::new) : getBinaryColumn("dep_dataset_id"));
    }

    /**
     * A flag to indicate status about primary citation data.
     * @return PrimaryCitationStatus
     */
    public PrimaryCitationStatus getPrimaryCitationStatus() {
        return (PrimaryCitationStatus) (isText ? textFields.computeIfAbsent("primary_citation_status",
                PrimaryCitationStatus::new) : getBinaryColumn("primary_citation_status"));
    }

    /**
     * A flag to indicate status about corresponding author data.
     * @return CorrespondingAuthorStatus
     */
    public CorrespondingAuthorStatus getCorrespondingAuthorStatus() {
        return (CorrespondingAuthorStatus) (isText ? textFields.computeIfAbsent("corresponding_author_status",
                CorrespondingAuthorStatus::new) : getBinaryColumn("corresponding_author_status"));
    }

    /**
     * A flag to indicate status about reference citation data.
     * @return ReferenceCitationStatus
     */
    public ReferenceCitationStatus getReferenceCitationStatus() {
        return (ReferenceCitationStatus) (isText ? textFields.computeIfAbsent("reference_citation_status",
                ReferenceCitationStatus::new) : getBinaryColumn("reference_citation_status"));
    }

    /**
     * A flag to indicate that the deposition was grant funded.
     * @return IsGrantFunded
     */
    public IsGrantFunded getIsGrantFunded() {
        return (IsGrantFunded) (isText ? textFields.computeIfAbsent("is_grant_funded",
                IsGrantFunded::new) : getBinaryColumn("is_grant_funded"));
    }

    /**
     * A flag to indicate that the deposition includes NCS data.
     * @return HasNcsData
     */
    public HasNcsData getHasNcsData() {
        return (HasNcsData) (isText ? textFields.computeIfAbsent("has_ncs_data",
                HasNcsData::new) : getBinaryColumn("has_ncs_data"));
    }

    /**
     * A flag to indicate that this entry is a candidate prediction target.
     * @return PredictionTarget
     */
    public PredictionTarget getPredictionTarget() {
        return (PredictionTarget) (isText ? textFields.computeIfAbsent("prediction_target",
                PredictionTarget::new) : getBinaryColumn("prediction_target"));
    }

    /**
     * A flag to indicate that this entry has helical symmetry
     * @return HasHelicalSymmetry
     */
    public HasHelicalSymmetry getHasHelicalSymmetry() {
        return (HasHelicalSymmetry) (isText ? textFields.computeIfAbsent("has_helical_symmetry",
                HasHelicalSymmetry::new) : getBinaryColumn("has_helical_symmetry"));
    }

    /**
     * A flag to indicate that this entry has point symmetry
     * @return HasPointSymmetry
     */
    public HasPointSymmetry getHasPointSymmetry() {
        return (HasPointSymmetry) (isText ? textFields.computeIfAbsent("has_point_symmetry",
                HasPointSymmetry::new) : getBinaryColumn("has_point_symmetry"));
    }

    /**
     * A flag to indicate that this entry has cyclic symmetry
     * @return HasCyclicSymmetry
     */
    public HasCyclicSymmetry getHasCyclicSymmetry() {
        return (HasCyclicSymmetry) (isText ? textFields.computeIfAbsent("has_cyclic_symmetry",
                HasCyclicSymmetry::new) : getBinaryColumn("has_cyclic_symmetry"));
    }

    /**
     * A flag to indicate the acceptance of wwPDB deposition and annotation terms and conditions.
     * @return HasAcceptedTermsAndConditions
     */
    public HasAcceptedTermsAndConditions getHasAcceptedTermsAndConditions() {
        return (HasAcceptedTermsAndConditions) (isText ? textFields.computeIfAbsent("has_accepted_terms_and_conditions",
                HasAcceptedTermsAndConditions::new) : getBinaryColumn("has_accepted_terms_and_conditions"));
    }

    /**
     * A flag to indicate the viewing the latest validation report.
     * @return HasViewedValidationReport
     */
    public HasViewedValidationReport getHasViewedValidationReport() {
        return (HasViewedValidationReport) (isText ? textFields.computeIfAbsent("has_viewed_validation_report",
                HasViewedValidationReport::new) : getBinaryColumn("has_viewed_validation_report"));
    }

    /**
     * The the last validation report operation, the name of the model file last validated.
     * @return ValidatedModelFileName
     */
    public ValidatedModelFileName getValidatedModelFileName() {
        return (ValidatedModelFileName) (isText ? textFields.computeIfAbsent("validated_model_file_name",
                ValidatedModelFileName::new) : getBinaryColumn("validated_model_file_name"));
    }

    /**
     * For the last model merge operation, the name of the model file containing prior data for the current deposition session.
     * @return MergePriorModelFileName
     */
    public MergePriorModelFileName getMergePriorModelFileName() {
        return (MergePriorModelFileName) (isText ? textFields.computeIfAbsent("merge_prior_model_file_name",
                MergePriorModelFileName::new) : getBinaryColumn("merge_prior_model_file_name"));
    }

    /**
     * For the last model merge operation, the name of the model file containing user provided replacement coordinate and model data.
     * @return MergeReplaceModelFileName
     */
    public MergeReplaceModelFileName getMergeReplaceModelFileName() {
        return (MergeReplaceModelFileName) (isText ? textFields.computeIfAbsent("merge_replace_model_file_name",
                MergeReplaceModelFileName::new) : getBinaryColumn("merge_replace_model_file_name"));
    }

    /**
     * For the last model merge operation, the name of the model file containing output from the merge operation.
     * @return MergeOutputModelFileName
     */
    public MergeOutputModelFileName getMergeOutputModelFileName() {
        return (MergeOutputModelFileName) (isText ? textFields.computeIfAbsent("merge_output_model_file_name",
                MergeOutputModelFileName::new) : getBinaryColumn("merge_output_model_file_name"));
    }

    /**
     * A flag to indicate that ligand processing is complete
     * @return IsLigandProcessingComplete
     */
    public IsLigandProcessingComplete getIsLigandProcessingComplete() {
        return (IsLigandProcessingComplete) (isText ? textFields.computeIfAbsent("is_ligand_processing_complete",
                IsLigandProcessingComplete::new) : getBinaryColumn("is_ligand_processing_complete"));
    }

    /**
     * A flag to indicate that all sample coordinate sequence alignments are valid.
     * @return SampleXyzSequenceAlignmentsValid
     */
    public SampleXyzSequenceAlignmentsValid getSampleXyzSequenceAlignmentsValid() {
        return (SampleXyzSequenceAlignmentsValid) (isText ? textFields.computeIfAbsent("sample_xyz_sequence_alignments_valid",
                SampleXyzSequenceAlignmentsValid::new) : getBinaryColumn("sample_xyz_sequence_alignments_valid"));
    }

    /**
     * A flag to indicate whether the author has related SAXS/SANS data.
     * @return HasSasData
     */
    public HasSasData getHasSasData() {
        return (HasSasData) (isText ? textFields.computeIfAbsent("has_sas_data",
                HasSasData::new) : getBinaryColumn("has_sas_data"));
    }

    /**
     * A flag to indicate whether related SAXS/SANS data is already deposited elsewhere
     * @return IsSasDeposited
     */
    public IsSasDeposited getIsSasDeposited() {
        return (IsSasDeposited) (isText ? textFields.computeIfAbsent("is_sas_deposited",
                IsSasDeposited::new) : getBinaryColumn("is_sas_deposited"));
    }

    /**
     * A flag to indicate whether related SAXS/SANS data were used in refinement
     * @return UseSasRefine
     */
    public UseSasRefine getUseSasRefine() {
        return (UseSasRefine) (isText ? textFields.computeIfAbsent("use_sas_refine",
                UseSasRefine::new) : getBinaryColumn("use_sas_refine"));
    }

    /**
     * A flag to indicate that merging of new coordinates has failed.
     * @return MergedFail
     */
    public MergedFail getMergedFail() {
        return (MergedFail) (isText ? textFields.computeIfAbsent("merged_fail",
                MergedFail::new) : getBinaryColumn("merged_fail"));
    }
}
