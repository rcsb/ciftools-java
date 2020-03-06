package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the IHM_ENSEMBLE_SUB_SAMPLE category records the
 * details of the sub samples within the ensembles.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class IhmEnsembleSubSample extends DelegatingCategory {
    public IhmEnsembleSubSample(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "id":
                return getId();
            case "name":
                return getName();
            case "ensemble_id":
                return getEnsembleId();
            case "num_models":
                return getNumModels();
            case "num_models_deposited":
                return getNumModelsDeposited();
            case "model_group_id":
                return getModelGroupId();
            case "file_id":
                return getFileId();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * A unique id for the ensemble sub sample.
     * @return IntColumn
     */
    public IntColumn getId() {
        return delegate.getColumn("id", DelegatingIntColumn::new);
    }

    /**
     * A name for the ensemble sub sample.
     * @return StrColumn
     */
    public StrColumn getName() {
        return delegate.getColumn("name", DelegatingStrColumn::new);
    }

    /**
     * The ensemble identifier corresponding to the sub sample.
     * This data item is a pointer to _ihm_ensemble_info.ensemble_id in the IHM_ENSEMBLE_INFO category.
     * @return IntColumn
     */
    public IntColumn getEnsembleId() {
        return delegate.getColumn("ensemble_id", DelegatingIntColumn::new);
    }

    /**
     * The number of models in the ensemble sub sample.
     * @return IntColumn
     */
    public IntColumn getNumModels() {
        return delegate.getColumn("num_models", DelegatingIntColumn::new);
    }

    /**
     * The number of models in the sub sample that are deposited.
     * @return IntColumn
     */
    public IntColumn getNumModelsDeposited() {
        return delegate.getColumn("num_models_deposited", DelegatingIntColumn::new);
    }

    /**
     * The model group identifier corresponding to the sub sample, if applicable.
     * This data item is a pointer to _ihm_model_group.id in the
     * IHM_MODEL_GROUP category.
     * @return IntColumn
     */
    public IntColumn getModelGroupId() {
        return delegate.getColumn("model_group_id", DelegatingIntColumn::new);
    }

    /**
     * A reference to the external file containing the structural models
     * in the sub sample. The number of models in the external file should
     * correspond to the number of models in the sub sample. This data item
     * is a pointer to _ihm_external_files.id in the IHM_EXTERNAL_FILES
     * category.
     * @return IntColumn
     */
    public IntColumn getFileId() {
        return delegate.getColumn("file_id", DelegatingIntColumn::new);
    }

}