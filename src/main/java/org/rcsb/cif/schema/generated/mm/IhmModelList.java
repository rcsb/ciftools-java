package org.rcsb.cif.schema.generated.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the IHM_MODEL_LIST category record the
 * details of the models being deposited.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class IhmModelList extends DelegatingCategory {
    public IhmModelList(Category delegate) {
        super(delegate);
    }

    /**
     * A unique identifier for the model / model group combination.
     * @return IntColumn
     */
    public IntColumn getOrdinalId() {
        return delegate.getColumn("ordinal_id", DelegatingIntColumn::new);
    }

    /**
     * A unique identifier for the structural model being deposited.
     * @return IntColumn
     */
    public IntColumn getModelId() {
        return delegate.getColumn("model_id", DelegatingIntColumn::new);
    }

    /**
     * An identifier to group structural models into collections or sets.
     * This data item can be used to group models into structural clusters
     * or using other criteria based on experimental data or other
     * relationships such as those belonging to the same state or time stamp.
     * An ensemble of models and its representative can either be grouped together
     * or can be separate groups in the ihm_model_list table. The choice between
     * the two options should be decided based on how the modeling was carried out
     * and how the representative was chosen. If the representative is a member of
     * the ensemble (i.e., best scoring model), then it is recommended that the
     * representative and the ensemble belong to the same model group. If the
     * representative is calculated from the ensemble (i.e., centroid), then it is
     * recommended that the representative be separated into a different group.
     * If the models do not need to be grouped into collections, then the
     * _ihm_model_list.model_group_id is the same as _ihm_model_list.model_id.
     * @return IntColumn
     */
    public IntColumn getModelGroupId() {
        return delegate.getColumn("model_group_id", DelegatingIntColumn::new);
    }

    /**
     * A decsriptive name for the model.
     * @return StrColumn
     */
    public StrColumn getModelName() {
        return delegate.getColumn("model_name", DelegatingStrColumn::new);
    }

    /**
     * A decsriptive name for the model group.
     * @return StrColumn
     */
    public StrColumn getModelGroupName() {
        return delegate.getColumn("model_group_name", DelegatingStrColumn::new);
    }

    /**
     * An identifier to the structure assembly corresponding to the model.
     * This data item is a pointer to the _ihm_struct_assembly.assembly_id
     * in the IHM_STRUCT_ASSEMBLY category.
     * @return IntColumn
     */
    public IntColumn getAssemblyId() {
        return delegate.getColumn("assembly_id", DelegatingIntColumn::new);
    }

    /**
     * An identifier to the modeling protocol that produced the model.
     * This data item is a pointer to the _ihm_modeling_protocol.protocol_id
     * in the IHM_MODELING_PROTOCOL category.
     * @return IntColumn
     */
    public IntColumn getProtocolId() {
        return delegate.getColumn("protocol_id", DelegatingIntColumn::new);
    }

    /**
     * An identifier to the multi-scale model representation id of the model.
     * This data item is a pointer to the _ihm_model_representation.representation_id
     * in the IHM_MODEL_REPRESENTATION category.
     * @return IntColumn
     */
    public IntColumn getRepresentationId() {
        return delegate.getColumn("representation_id", DelegatingIntColumn::new);
    }
}
