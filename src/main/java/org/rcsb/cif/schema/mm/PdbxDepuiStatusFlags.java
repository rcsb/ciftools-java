package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_DEPUI_STATUS_FLAGS category record status
 * details used to maintain state within the wwPDB deposition system.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxDepuiStatusFlags extends DelegatingCategory {
    public PdbxDepuiStatusFlags(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "dep_dataset_id":
                return getDepDatasetId();
            case "primary_citation_status":
                return getPrimaryCitationStatus();
            case "corresponding_author_status":
                return getCorrespondingAuthorStatus();
            case "reference_citation_status":
                return getReferenceCitationStatus();
            case "is_grant_funded":
                return getIsGrantFunded();
            case "has_ncs_data":
                return getHasNcsData();
            case "prediction_target":
                return getPredictionTarget();
            case "has_helical_symmetry":
                return getHasHelicalSymmetry();
            case "has_point_symmetry":
                return getHasPointSymmetry();
            case "has_cyclic_symmetry":
                return getHasCyclicSymmetry();
            case "has_accepted_terms_and_conditions":
                return getHasAcceptedTermsAndConditions();
            case "has_viewed_validation_report":
                return getHasViewedValidationReport();
            case "validated_model_file_name":
                return getValidatedModelFileName();
            case "merge_prior_model_file_name":
                return getMergePriorModelFileName();
            case "merge_replace_model_file_name":
                return getMergeReplaceModelFileName();
            case "merge_output_model_file_name":
                return getMergeOutputModelFileName();
            case "is_ligand_processing_complete":
                return getIsLigandProcessingComplete();
            case "sample_xyz_sequence_alignments_valid":
                return getSampleXyzSequenceAlignmentsValid();
            case "has_sas_data":
                return getHasSasData();
            case "is_sas_deposited":
                return getIsSasDeposited();
            case "use_sas_refine":
                return getUseSasRefine();
            case "merged_fail":
                return getMergedFail();
            case "post_rel_replacement_reason":
                return getPostRelReplacementReason();
            case "post_rel_replacement_reason_details":
                return getPostRelReplacementReasonDetails();
            case "has_accepted_assemblies":
                return getHasAcceptedAssemblies();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The internal identifier assigned to each deposition.
     * @return StrColumn
     */
    public StrColumn getDepDatasetId() {
        return delegate.getColumn("dep_dataset_id", DelegatingStrColumn::new);
    }

    /**
     * A flag to indicate status about primary citation data.
     * @return StrColumn
     */
    public StrColumn getPrimaryCitationStatus() {
        return delegate.getColumn("primary_citation_status", DelegatingStrColumn::new);
    }

    /**
     * A flag to indicate status about corresponding author data.
     * @return StrColumn
     */
    public StrColumn getCorrespondingAuthorStatus() {
        return delegate.getColumn("corresponding_author_status", DelegatingStrColumn::new);
    }

    /**
     * A flag to indicate status about reference citation data.
     * @return StrColumn
     */
    public StrColumn getReferenceCitationStatus() {
        return delegate.getColumn("reference_citation_status", DelegatingStrColumn::new);
    }

    /**
     * A flag to indicate that the deposition was grant funded.
     * @return StrColumn
     */
    public StrColumn getIsGrantFunded() {
        return delegate.getColumn("is_grant_funded", DelegatingStrColumn::new);
    }

    /**
     * A flag to indicate that the deposition includes NCS data.
     * @return StrColumn
     */
    public StrColumn getHasNcsData() {
        return delegate.getColumn("has_ncs_data", DelegatingStrColumn::new);
    }

    /**
     * A flag to indicate that this entry is a candidate prediction target.
     * @return StrColumn
     */
    public StrColumn getPredictionTarget() {
        return delegate.getColumn("prediction_target", DelegatingStrColumn::new);
    }

    /**
     * A flag to indicate that this entry has helical symmetry
     * @return StrColumn
     */
    public StrColumn getHasHelicalSymmetry() {
        return delegate.getColumn("has_helical_symmetry", DelegatingStrColumn::new);
    }

    /**
     * A flag to indicate that this entry has point symmetry
     * @return StrColumn
     */
    public StrColumn getHasPointSymmetry() {
        return delegate.getColumn("has_point_symmetry", DelegatingStrColumn::new);
    }

    /**
     * A flag to indicate that this entry has cyclic symmetry
     * @return StrColumn
     */
    public StrColumn getHasCyclicSymmetry() {
        return delegate.getColumn("has_cyclic_symmetry", DelegatingStrColumn::new);
    }

    /**
     * A flag to indicate the acceptance of wwPDB deposition and annotation terms and conditions.
     * @return StrColumn
     */
    public StrColumn getHasAcceptedTermsAndConditions() {
        return delegate.getColumn("has_accepted_terms_and_conditions", DelegatingStrColumn::new);
    }

    /**
     * A flag to indicate the viewing the latest validation report.
     * @return StrColumn
     */
    public StrColumn getHasViewedValidationReport() {
        return delegate.getColumn("has_viewed_validation_report", DelegatingStrColumn::new);
    }

    /**
     * The last validation report operation, the name of the model file last validated.
     * @return StrColumn
     */
    public StrColumn getValidatedModelFileName() {
        return delegate.getColumn("validated_model_file_name", DelegatingStrColumn::new);
    }

    /**
     * For the last model merge operation, the name of the model file containing prior data for the current deposition session.
     * @return StrColumn
     */
    public StrColumn getMergePriorModelFileName() {
        return delegate.getColumn("merge_prior_model_file_name", DelegatingStrColumn::new);
    }

    /**
     * For the last model merge operation, the name of the model file containing user provided replacement coordinate and model data.
     * @return StrColumn
     */
    public StrColumn getMergeReplaceModelFileName() {
        return delegate.getColumn("merge_replace_model_file_name", DelegatingStrColumn::new);
    }

    /**
     * For the last model merge operation, the name of the model file containing output from the merge operation.
     * @return StrColumn
     */
    public StrColumn getMergeOutputModelFileName() {
        return delegate.getColumn("merge_output_model_file_name", DelegatingStrColumn::new);
    }

    /**
     * A flag to indicate that ligand processing is complete
     * @return StrColumn
     */
    public StrColumn getIsLigandProcessingComplete() {
        return delegate.getColumn("is_ligand_processing_complete", DelegatingStrColumn::new);
    }

    /**
     * A flag to indicate that all sample coordinate sequence alignments are valid.
     * @return StrColumn
     */
    public StrColumn getSampleXyzSequenceAlignmentsValid() {
        return delegate.getColumn("sample_xyz_sequence_alignments_valid", DelegatingStrColumn::new);
    }

    /**
     * A flag to indicate whether the author has related SAXS/SANS data.
     * @return StrColumn
     */
    public StrColumn getHasSasData() {
        return delegate.getColumn("has_sas_data", DelegatingStrColumn::new);
    }

    /**
     * A flag to indicate whether related SAXS/SANS data is already deposited elsewhere
     * @return StrColumn
     */
    public StrColumn getIsSasDeposited() {
        return delegate.getColumn("is_sas_deposited", DelegatingStrColumn::new);
    }

    /**
     * A flag to indicate whether related SAXS/SANS data were used in refinement
     * @return StrColumn
     */
    public StrColumn getUseSasRefine() {
        return delegate.getColumn("use_sas_refine", DelegatingStrColumn::new);
    }

    /**
     * A flag to indicate that merging of new coordinates has failed.
     * @return StrColumn
     */
    public StrColumn getMergedFail() {
        return delegate.getColumn("merged_fail", DelegatingStrColumn::new);
    }

    /**
     * Records reason for author initiated coordinate replacement
     * @return StrColumn
     */
    public StrColumn getPostRelReplacementReason() {
        return delegate.getColumn("post_rel_replacement_reason", DelegatingStrColumn::new);
    }

    /**
     * Records additional details for author initiated coordinate replacement
     * @return StrColumn
     */
    public StrColumn getPostRelReplacementReasonDetails() {
        return delegate.getColumn("post_rel_replacement_reason_details", DelegatingStrColumn::new);
    }

    /**
     * A flag to indicate that depositor has accepted the presented assemblies.
     * @return StrColumn
     */
    public StrColumn getHasAcceptedAssemblies() {
        return delegate.getColumn("has_accepted_assemblies", DelegatingStrColumn::new);
    }

}