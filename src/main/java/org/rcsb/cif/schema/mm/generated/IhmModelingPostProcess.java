package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the IHM_MODELING_POST_PROCESS category records
 * the details of the post processing of the models/results of
 * the modeling protocol.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class IhmModelingPostProcess extends BaseCategory {
    public IhmModelingPostProcess(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public IhmModelingPostProcess(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public IhmModelingPostProcess(String name) {
        super(name);
    }

    /**
     * A unique identifier for the post modeling analysis/step combination.
     * @return IntColumn
     */
    public IntColumn getId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("id", IntColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * An identifier for the modeling protocol, whose post modeling analysis
     * is being carried out.
     * This data item is a pointer to the _ihm_modeling_protocol.protocol_id
     * in the IHM_MODELING_PROTOCOL category.
     * @return IntColumn
     */
    public IntColumn getProtocolId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("protocol_id", IntColumn::new) :
                getBinaryColumn("protocol_id"));
    }

    /**
     * An identifier for the post modeling analysis. This data item accounts for
     * multiple post-modeling analyses that can be carried out.
     * @return IntColumn
     */
    public IntColumn getAnalysisId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("analysis_id", IntColumn::new) :
                getBinaryColumn("analysis_id"));
    }

    /**
     * In a multi-step process, this identifier denotes the particular
     * step in the post modeling analysis.
     * @return IntColumn
     */
    public IntColumn getStepId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("step_id", IntColumn::new) :
                getBinaryColumn("step_id"));
    }

    /**
     * An index for the structural assembly being processed.
     * This is an indicator to whether the whole assembly is processed
     * or if only a subset of the structural assembly is processed.
     * This data item is a pointer to _ihm_struct_assembly.assembly_id in the
     * IHM_STRUCT_ASSEMBLY category.
     * @return IntColumn
     */
    public IntColumn getStructAssemblyId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("struct_assembly_id", IntColumn::new) :
                getBinaryColumn("struct_assembly_id"));
    }

    /**
     * An index for the dataset group being used in the post modeling process.
     * This data item is a pointer to the _ihm_dataset_group.group_id in the
     * IHM_DATASET_GROUP category.
     * @return IntColumn
     */
    public IntColumn getDatasetGroupId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("dataset_group_id", IntColumn::new) :
                getBinaryColumn("dataset_group_id"));
    }

    /**
     * The type of post modeling analysis being carried out.
     * @return StrColumn
     */
    public StrColumn getType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("type", StrColumn::new) :
                getBinaryColumn("type"));
    }

    /**
     * The parameter/feature used in the post modeling analysis.
     * @return StrColumn
     */
    public StrColumn getFeature() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("feature", StrColumn::new) :
                getBinaryColumn("feature"));
    }

    /**
     * The name of the parameter/feature used in the post modeling analysis.
     * @return StrColumn
     */
    public StrColumn getFeatureName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("feature_name", StrColumn::new) :
                getBinaryColumn("feature_name"));
    }

    /**
     * The number of models at the beginning of the post processing step.
     * @return IntColumn
     */
    public IntColumn getNumModelsBegin() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("num_models_begin", IntColumn::new) :
                getBinaryColumn("num_models_begin"));
    }

    /**
     * The number of models the the end of the post processing step.
     * @return IntColumn
     */
    public IntColumn getNumModelsEnd() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("num_models_end", IntColumn::new) :
                getBinaryColumn("num_models_end"));
    }

    /**
     * The file id corresponding to the script used in the post processing step.
     * This data item is a pointer to _ihm_external_files.id in the IHM_EXTERNAL_FILES category.
     * @return IntColumn
     */
    public IntColumn getScriptFileId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("script_file_id", IntColumn::new) :
                getBinaryColumn("script_file_id"));
    }

    /**
     * Identifier to the software used in the post processing step.
     * This data item is a pointer to the _software.pdbx_ordinal in the
     * SOFTWARE category.
     * @return IntColumn
     */
    public IntColumn getSoftwareId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("software_id", IntColumn::new) :
                getBinaryColumn("software_id"));
    }
}
