package org.rcsb.cif.schema.generated.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the IHM_MODELING_PROTOCOL category records the
 * step-wise details of the integrative modeling workflow.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class IhmModelingProtocol extends DelegatingCategory {
    public IhmModelingProtocol(Category delegate) {
        super(delegate);
    }

    /**
     * A unique identifier for the modeling protocol/step combination.
     * @return IntColumn
     */
    public IntColumn getOrdinalId() {
        return delegate.getColumn("ordinal_id", DelegatingIntColumn::new);
    }

    /**
     * An index for the modeling protocol carried out.
     * @return IntColumn
     */
    public IntColumn getProtocolId() {
        return delegate.getColumn("protocol_id", DelegatingIntColumn::new);
    }

    /**
     * An index for a particular step within the modeling protocol.
     * @return IntColumn
     */
    public IntColumn getStepId() {
        return delegate.getColumn("step_id", DelegatingIntColumn::new);
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
        return delegate.getColumn("struct_assembly_id", DelegatingIntColumn::new);
    }

    /**
     * An index for the dataset group being used in the modeling protocol.
     * This data item is a pointer to the _ihm_dataset_group.group_id in the
     * IHM_DATASET_GROUP category.
     * @return IntColumn
     */
    public IntColumn getDatasetGroupId() {
        return delegate.getColumn("dataset_group_id", DelegatingIntColumn::new);
    }

    /**
     * A textual description of the structural assembly being modeled.
     * @return StrColumn
     */
    public StrColumn getStructAssemblyDescription() {
        return delegate.getColumn("struct_assembly_description", DelegatingStrColumn::new);
    }

    /**
     * The name for the modeling protocol.
     * @return StrColumn
     */
    public StrColumn getProtocolName() {
        return delegate.getColumn("protocol_name", DelegatingStrColumn::new);
    }

    /**
     * The name or type of the modeling step.
     * @return StrColumn
     */
    public StrColumn getStepName() {
        return delegate.getColumn("step_name", DelegatingStrColumn::new);
    }

    /**
     * Description of the method involved in the modeling step.
     * @return StrColumn
     */
    public StrColumn getStepMethod() {
        return delegate.getColumn("step_method", DelegatingStrColumn::new);
    }

    /**
     * The number of models in the beginning of the step.
     * @return IntColumn
     */
    public IntColumn getNumModelsBegin() {
        return delegate.getColumn("num_models_begin", DelegatingIntColumn::new);
    }

    /**
     * The number of models at the end of the step.
     * @return IntColumn
     */
    public IntColumn getNumModelsEnd() {
        return delegate.getColumn("num_models_end", DelegatingIntColumn::new);
    }

    /**
     * A flag to indicate if the modeling is multi scale.
     * @return StrColumn
     */
    public StrColumn getMultiScaleFlag() {
        return delegate.getColumn("multi_scale_flag", DelegatingStrColumn::new);
    }

    /**
     * A flag to indicate if the modeling is multi state.
     * @return StrColumn
     */
    public StrColumn getMultiStateFlag() {
        return delegate.getColumn("multi_state_flag", DelegatingStrColumn::new);
    }

    /**
     * A flag to indicate if the modeling involves an ensemble ordered by time or other order.
     * @return StrColumn
     */
    public StrColumn getOrderedFlag() {
        return delegate.getColumn("ordered_flag", DelegatingStrColumn::new);
    }

    /**
     * A flag to indicate if the modeling involves an ensemble.
     * @return StrColumn
     */
    public StrColumn getEnsembleFlag() {
        return delegate.getColumn("ensemble_flag", DelegatingStrColumn::new);
    }

    /**
     * The file id corresponding to the script used in the modeling protocol step.
     * This data item is a pointer to _ihm_external_files.id in the IHM_EXTERNAL_FILES category.
     * @return IntColumn
     */
    public IntColumn getScriptFileId() {
        return delegate.getColumn("script_file_id", DelegatingIntColumn::new);
    }

    /**
     * Identifier to the software used in the modeling protocol step.
     * This data item is a pointer to the _software.pdbx_ordinal in the
     * SOFTWARE category.
     * @return IntColumn
     */
    public IntColumn getSoftwareId() {
        return delegate.getColumn("software_id", DelegatingIntColumn::new);
    }
}
