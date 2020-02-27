package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the IHM_MODEL_LIST category record the
 * details of the models being deposited.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class IhmModelList extends BaseCategory {
    public IhmModelList(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public IhmModelList(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public IhmModelList(String name) {
        super(name);
    }

    /**
     * A unique identifier for the model / model group combination.
     * @return IntColumn
     */
    public IntColumn getOrdinalId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("ordinal_id", IntColumn::new) :
                getBinaryColumn("ordinal_id"));
    }

    /**
     * A unique identifier for the structural model being deposited.
     * @return IntColumn
     */
    public IntColumn getModelId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("model_id", IntColumn::new) :
                getBinaryColumn("model_id"));
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
        return (IntColumn) (isText ? textFields.computeIfAbsent("model_group_id", IntColumn::new) :
                getBinaryColumn("model_group_id"));
    }

    /**
     * A decsriptive name for the model.
     * @return StrColumn
     */
    public StrColumn getModelName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("model_name", StrColumn::new) :
                getBinaryColumn("model_name"));
    }

    /**
     * A decsriptive name for the model group.
     * @return StrColumn
     */
    public StrColumn getModelGroupName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("model_group_name", StrColumn::new) :
                getBinaryColumn("model_group_name"));
    }

    /**
     * An identifier to the structure assembly corresponding to the model.
     * This data item is a pointer to the _ihm_struct_assembly.assembly_id
     * in the IHM_STRUCT_ASSEMBLY category.
     * @return IntColumn
     */
    public IntColumn getAssemblyId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("assembly_id", IntColumn::new) :
                getBinaryColumn("assembly_id"));
    }

    /**
     * An identifier to the modeling protocol that produced the model.
     * This data item is a pointer to the _ihm_modeling_protocol.protocol_id
     * in the IHM_MODELING_PROTOCOL category.
     * @return IntColumn
     */
    public IntColumn getProtocolId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("protocol_id", IntColumn::new) :
                getBinaryColumn("protocol_id"));
    }

    /**
     * An identifier to the multi-scale model representation id of the model.
     * This data item is a pointer to the _ihm_model_representation.representation_id
     * in the IHM_MODEL_REPRESENTATION category.
     * @return IntColumn
     */
    public IntColumn getRepresentationId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("representation_id", IntColumn::new) :
                getBinaryColumn("representation_id"));
    }
}
