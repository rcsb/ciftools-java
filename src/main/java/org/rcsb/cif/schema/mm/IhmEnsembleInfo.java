package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the IHM_ENSEMBLE_INFO category records the
 * details of the model clusters or ensembles obtained after
 * sampling.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class IhmEnsembleInfo extends DelegatingCategory {
    public IhmEnsembleInfo(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "ensemble_id":
                return getEnsembleId();
            case "ensemble_name":
                return getEnsembleName();
            case "post_process_id":
                return getPostProcessId();
            case "model_group_id":
                return getModelGroupId();
            case "model_group_superimposed_flag":
                return getModelGroupSuperimposedFlag();
            case "ensemble_clustering_method":
                return getEnsembleClusteringMethod();
            case "ensemble_clustering_feature":
                return getEnsembleClusteringFeature();
            case "num_ensemble_models":
                return getNumEnsembleModels();
            case "num_ensemble_models_deposited":
                return getNumEnsembleModelsDeposited();
            case "ensemble_precision_value":
                return getEnsemblePrecisionValue();
            case "ensemble_file_id":
                return getEnsembleFileId();
            case "details":
                return getDetails();
            case "sub_sample_flag":
                return getSubSampleFlag();
            case "sub_sampling_type":
                return getSubSamplingType();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * A unique id for the ensemble.
     * @return IntColumn
     */
    public IntColumn getEnsembleId() {
        return delegate.getColumn("ensemble_id", DelegatingIntColumn::new);
    }

    /**
     * An optional name for the cluster or ensemble for better description.
     * @return StrColumn
     */
    public StrColumn getEnsembleName() {
        return delegate.getColumn("ensemble_name", DelegatingStrColumn::new);
    }

    /**
     * An identifier for the post modeling analyses carried out.
     * This data item is a pointer to _ihm_modeling_post_process.id in
     * the IHM_MODELING_POST_PROCESS category.
     * @return IntColumn
     */
    public IntColumn getPostProcessId() {
        return delegate.getColumn("post_process_id", DelegatingIntColumn::new);
    }

    /**
     * An identifier for the cluster or group of models being deposited.
     * This data item is a pointer to the _ihm_model_group.id
     * in the IHM_MODEL_GROUP category.
     * @return IntColumn
     */
    public IntColumn getModelGroupId() {
        return delegate.getColumn("model_group_id", DelegatingIntColumn::new);
    }

    /**
     * Flag to identify if the models in a group or cluster are structurally aligned.
     * @return StrColumn
     */
    public StrColumn getModelGroupSuperimposedFlag() {
        return delegate.getColumn("model_group_superimposed_flag", DelegatingStrColumn::new);
    }

    /**
     * The clustering method used to obtain the ensemble, if applicable.
     * @return StrColumn
     */
    public StrColumn getEnsembleClusteringMethod() {
        return delegate.getColumn("ensemble_clustering_method", DelegatingStrColumn::new);
    }

    /**
     * The parameter/feature used for clustering the models, if applicable.
     * @return StrColumn
     */
    public StrColumn getEnsembleClusteringFeature() {
        return delegate.getColumn("ensemble_clustering_feature", DelegatingStrColumn::new);
    }

    /**
     * The number of models in the current ensemble being described.
     * @return IntColumn
     */
    public IntColumn getNumEnsembleModels() {
        return delegate.getColumn("num_ensemble_models", DelegatingIntColumn::new);
    }

    /**
     * The number of models from the current ensemble that is deposited.
     * @return IntColumn
     */
    public IntColumn getNumEnsembleModelsDeposited() {
        return delegate.getColumn("num_ensemble_models_deposited", DelegatingIntColumn::new);
    }

    /**
     * The precision of each cluster or ensemble is calculated as dRMSD, which
     * is the average C-alpha distance root mean square deviation (dRMSD)
     * between the individual models in the cluster and the cluster centroid.
     * The cluster centroid is defined as the model with the minimal sum of
     * dRMSDs to the other models in the cluster or ensemble.
     * @return FloatColumn
     */
    public FloatColumn getEnsemblePrecisionValue() {
        return delegate.getColumn("ensemble_precision_value", DelegatingFloatColumn::new);
    }

    /**
     * A reference to the external file containing the structural models
     * in the ensemble. The number of models in the external file should
     * correspond to the number of models in the ensemble. This data item
     * is a pointer to _ihm_external_files.id in the IHM_EXTERNAL_FILES
     * category.
     * It is recommended that the large ensemble files be stored as separate
     * zip files within the same DOI. It is also recommended that large sphere
     * model ensembles be in binary format, which facilitates faster access.
     * Currently, a binary dump of co-ordinates in dcd format is suggested.
     * The topology can be inferred from the IHM_SPHERE_OBJ_SITE and the
     * ATOM_SITE categories in the corresponding mmCIF file.
     * @return IntColumn
     */
    public IntColumn getEnsembleFileId() {
        return delegate.getColumn("ensemble_file_id", DelegatingIntColumn::new);
    }

    /**
     * Additional details regarding the ensemble.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

    /**
     * Indicate if the ensemble consists of sub samples.
     * @return StrColumn
     */
    public StrColumn getSubSampleFlag() {
        return delegate.getColumn("sub_sample_flag", DelegatingStrColumn::new);
    }

    /**
     * Indicate the sub sampling type, if applicable.
     * @return StrColumn
     */
    public StrColumn getSubSamplingType() {
        return delegate.getColumn("sub_sampling_type", DelegatingStrColumn::new);
    }

}