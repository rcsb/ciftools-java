package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the IHM_ENSEMBLE_INFO category records the
 * details of the model clusters or ensembles obtained after
 * sampling.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class IhmEnsembleInfo extends BaseCategory {
    public IhmEnsembleInfo(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public IhmEnsembleInfo(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public IhmEnsembleInfo(String name) {
        super(name);
    }

    /**
     * A unique id for the ensemble.
     * @return IntColumn
     */
    public IntColumn getEnsembleId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("ensemble_id", IntColumn::new) :
                getBinaryColumn("ensemble_id"));
    }

    /**
     * An optional name for the cluster or ensemble for better description.
     * @return StrColumn
     */
    public StrColumn getEnsembleName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("ensemble_name", StrColumn::new) :
                getBinaryColumn("ensemble_name"));
    }

    /**
     * An identifier for the post modeling analyses carried out.
     * This data item is a pointer to _ihm_modeling_post_process.id in
     * the IHM_MODELING_POST_PROCESS category.
     * @return IntColumn
     */
    public IntColumn getPostProcessId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("post_process_id", IntColumn::new) :
                getBinaryColumn("post_process_id"));
    }

    /**
     * An identifier for the cluster or group of models being deposited.
     * This data item is a pointer to the _ihm_model_list.model_group_id
     * in the IHM_MODEL_LIST category.
     * @return IntColumn
     */
    public IntColumn getModelGroupId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("model_group_id", IntColumn::new) :
                getBinaryColumn("model_group_id"));
    }

    /**
     * The clustering method used to obtain the ensemble, if applicable.
     * @return StrColumn
     */
    public StrColumn getEnsembleClusteringMethod() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("ensemble_clustering_method", StrColumn::new) :
                getBinaryColumn("ensemble_clustering_method"));
    }

    /**
     * The parameter/feature used for clustering the models, if applicable.
     * @return StrColumn
     */
    public StrColumn getEnsembleClusteringFeature() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("ensemble_clustering_feature", StrColumn::new) :
                getBinaryColumn("ensemble_clustering_feature"));
    }

    /**
     * The number of models in the current ensemble being described.
     * @return IntColumn
     */
    public IntColumn getNumEnsembleModels() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("num_ensemble_models", IntColumn::new) :
                getBinaryColumn("num_ensemble_models"));
    }

    /**
     * The number of models from the current ensemble that is deposited.
     * @return IntColumn
     */
    public IntColumn getNumEnsembleModelsDeposited() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("num_ensemble_models_deposited", IntColumn::new) :
                getBinaryColumn("num_ensemble_models_deposited"));
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
        return (FloatColumn) (isText ? textFields.computeIfAbsent("ensemble_precision_value", FloatColumn::new) :
                getBinaryColumn("ensemble_precision_value"));
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
        return (IntColumn) (isText ? textFields.computeIfAbsent("ensemble_file_id", IntColumn::new) :
                getBinaryColumn("ensemble_file_id"));
    }
}
