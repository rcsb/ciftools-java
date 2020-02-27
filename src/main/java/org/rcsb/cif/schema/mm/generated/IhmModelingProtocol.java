package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the IHM_MODELING_PROTOCOL category records the
 * step-wise details of the integrative modeling workflow.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class IhmModelingProtocol extends BaseCategory {
    public IhmModelingProtocol(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public IhmModelingProtocol(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public IhmModelingProtocol(String name) {
        super(name);
    }

    /**
     * A unique identifier for the modeling protocol/step combination.
     * @return IntColumn
     */
    public IntColumn getOrdinalId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("ordinal_id", IntColumn::new) :
                getBinaryColumn("ordinal_id"));
    }

    /**
     * An index for the modeling protocol carried out.
     * @return IntColumn
     */
    public IntColumn getProtocolId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("protocol_id", IntColumn::new) :
                getBinaryColumn("protocol_id"));
    }

    /**
     * An index for a particular step within the modeling protocol.
     * @return IntColumn
     */
    public IntColumn getStepId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("step_id", IntColumn::new) :
                getBinaryColumn("step_id"));
    }

    /**
     * An index for the structural assembly being modeled.
     * This is an indicator to whether the whole assembly is modeled
     * or if only a subset of the structural assembly is modeled.
     * This data item is a pointer to _ihm_struct_assembly.assembly_id in the
     * IHM_STRUCT_ASSEMBLY category. The IHM_STRUCT_ASSEMBLY category provides the
     * details regarding the different structural assemblies used in the modeling.
     * The default value for this data item is "1", indicating that the entire
     * assembly is being modeled.
     * @return IntColumn
     */
    public IntColumn getStructAssemblyId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("struct_assembly_id", IntColumn::new) :
                getBinaryColumn("struct_assembly_id"));
    }

    /**
     * An index for the dataset group being used in the modeling protocol.
     * This data item is a pointer to the _ihm_dataset_group.group_id in the
     * IHM_DATASET_GROUP category.
     * @return IntColumn
     */
    public IntColumn getDatasetGroupId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("dataset_group_id", IntColumn::new) :
                getBinaryColumn("dataset_group_id"));
    }

    /**
     * A textual description of the structural assembly being modeled.
     * @return StrColumn
     */
    public StrColumn getStructAssemblyDescription() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("struct_assembly_description", StrColumn::new) :
                getBinaryColumn("struct_assembly_description"));
    }

    /**
     * The name for the modeling protocol.
     * @return StrColumn
     */
    public StrColumn getProtocolName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("protocol_name", StrColumn::new) :
                getBinaryColumn("protocol_name"));
    }

    /**
     * The name or type of the modeling step.
     * @return StrColumn
     */
    public StrColumn getStepName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("step_name", StrColumn::new) :
                getBinaryColumn("step_name"));
    }

    /**
     * Description of the method involved in the modeling step.
     * @return StrColumn
     */
    public StrColumn getStepMethod() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("step_method", StrColumn::new) :
                getBinaryColumn("step_method"));
    }

    /**
     * The number of models in the beginning of the step.
     * @return IntColumn
     */
    public IntColumn getNumModelsBegin() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("num_models_begin", IntColumn::new) :
                getBinaryColumn("num_models_begin"));
    }

    /**
     * The number of models at the end of the step.
     * @return IntColumn
     */
    public IntColumn getNumModelsEnd() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("num_models_end", IntColumn::new) :
                getBinaryColumn("num_models_end"));
    }

    /**
     * A flag to indicate if the modeling is multi scale.
     * @return StrColumn
     */
    public StrColumn getMultiScaleFlag() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("multi_scale_flag", StrColumn::new) :
                getBinaryColumn("multi_scale_flag"));
    }

    /**
     * A flag to indicate if the modeling is multi state.
     * @return StrColumn
     */
    public StrColumn getMultiStateFlag() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("multi_state_flag", StrColumn::new) :
                getBinaryColumn("multi_state_flag"));
    }

    /**
     * A flag to indicate if the modeling involves an ensemble ordered by time or other order.
     * @return StrColumn
     */
    public StrColumn getOrderedFlag() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("ordered_flag", StrColumn::new) :
                getBinaryColumn("ordered_flag"));
    }

    /**
     * A flag to indicate if the modeling involves an ensemble.
     * @return StrColumn
     */
    public StrColumn getEnsembleFlag() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("ensemble_flag", StrColumn::new) :
                getBinaryColumn("ensemble_flag"));
    }

    /**
     * The file id corresponding to the script used in the modeling protocol step.
     * This data item is a pointer to _ihm_external_files.id in the IHM_EXTERNAL_FILES category.
     * @return IntColumn
     */
    public IntColumn getScriptFileId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("script_file_id", IntColumn::new) :
                getBinaryColumn("script_file_id"));
    }

    /**
     * Identifier to the software used in the modeling protocol step.
     * This data item is a pointer to the _software.pdbx_ordinal in the
     * SOFTWARE category.
     * @return IntColumn
     */
    public IntColumn getSoftwareId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("software_id", IntColumn::new) :
                getBinaryColumn("software_id"));
    }
}
