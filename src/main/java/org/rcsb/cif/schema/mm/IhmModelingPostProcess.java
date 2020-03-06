package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the IHM_MODELING_POST_PROCESS category records
 * the details of the post processing of the models/results of
 * the modeling protocol.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class IhmModelingPostProcess extends DelegatingCategory {
    public IhmModelingPostProcess(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "id":
                return getId();
            case "protocol_id":
                return getProtocolId();
            case "analysis_id":
                return getAnalysisId();
            case "step_id":
                return getStepId();
            case "struct_assembly_id":
                return getStructAssemblyId();
            case "dataset_group_id":
                return getDatasetGroupId();
            case "type":
                return getType();
            case "feature":
                return getFeature();
            case "feature_name":
                return getFeatureName();
            case "num_models_begin":
                return getNumModelsBegin();
            case "num_models_end":
                return getNumModelsEnd();
            case "script_file_id":
                return getScriptFileId();
            case "software_id":
                return getSoftwareId();
            case "details":
                return getDetails();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * A unique identifier for the post modeling analysis/step combination.
     * @return IntColumn
     */
    public IntColumn getId() {
        return delegate.getColumn("id", DelegatingIntColumn::new);
    }

    /**
     * An identifier for the modeling protocol, whose post modeling analysis
     * is being carried out.
     * This data item is a pointer to the _ihm_modeling_protocol.id
     * in the IHM_MODELING_PROTOCOL category.
     * @return IntColumn
     */
    public IntColumn getProtocolId() {
        return delegate.getColumn("protocol_id", DelegatingIntColumn::new);
    }

    /**
     * An identifier for the post modeling analysis. This data item accounts for
     * multiple post-modeling analyses that can be carried out.
     * @return IntColumn
     */
    public IntColumn getAnalysisId() {
        return delegate.getColumn("analysis_id", DelegatingIntColumn::new);
    }

    /**
     * In a multi-step process, this identifier denotes the particular
     * step in the post modeling analysis.
     * @return IntColumn
     */
    public IntColumn getStepId() {
        return delegate.getColumn("step_id", DelegatingIntColumn::new);
    }

    /**
     * An index for the structural assembly being processed.
     * This is an indicator to whether the whole assembly is processed
     * or if only a subset of the structural assembly is processed.
     * This data item is a pointer to _ihm_struct_assembly.id in the
     * IHM_STRUCT_ASSEMBLY category.
     * @return IntColumn
     */
    public IntColumn getStructAssemblyId() {
        return delegate.getColumn("struct_assembly_id", DelegatingIntColumn::new);
    }

    /**
     * An index for the dataset group being used in the post modeling process.
     * This data item is a pointer to the _ihm_dataset_group.id in the
     * IHM_DATASET_GROUP category.
     * @return IntColumn
     */
    public IntColumn getDatasetGroupId() {
        return delegate.getColumn("dataset_group_id", DelegatingIntColumn::new);
    }

    /**
     * The type of post modeling analysis being carried out.
     * @return StrColumn
     */
    public StrColumn getType() {
        return delegate.getColumn("type", DelegatingStrColumn::new);
    }

    /**
     * The parameter/feature used in the post modeling analysis.
     * @return StrColumn
     */
    public StrColumn getFeature() {
        return delegate.getColumn("feature", DelegatingStrColumn::new);
    }

    /**
     * The name of the parameter/feature used in the post modeling analysis.
     * @return StrColumn
     */
    public StrColumn getFeatureName() {
        return delegate.getColumn("feature_name", DelegatingStrColumn::new);
    }

    /**
     * The number of models at the beginning of the post processing step.
     * @return IntColumn
     */
    public IntColumn getNumModelsBegin() {
        return delegate.getColumn("num_models_begin", DelegatingIntColumn::new);
    }

    /**
     * The number of models the the end of the post processing step.
     * @return IntColumn
     */
    public IntColumn getNumModelsEnd() {
        return delegate.getColumn("num_models_end", DelegatingIntColumn::new);
    }

    /**
     * The file id corresponding to the script used in the post processing step.
     * This data item is a pointer to _ihm_external_files.id in the IHM_EXTERNAL_FILES category.
     * @return IntColumn
     */
    public IntColumn getScriptFileId() {
        return delegate.getColumn("script_file_id", DelegatingIntColumn::new);
    }

    /**
     * Identifier to the software used in the post processing step.
     * This data item is a pointer to the _software.pdbx_ordinal in the
     * SOFTWARE category.
     * @return IntColumn
     */
    public IntColumn getSoftwareId() {
        return delegate.getColumn("software_id", DelegatingIntColumn::new);
    }

    /**
     * Additional details regarding post processing.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

}