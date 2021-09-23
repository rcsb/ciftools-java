package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the MA_MODEL_LIST category record the
 * details of the models being deposited.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class MaModelList extends DelegatingCategory {
    public MaModelList(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "ordinal_id":
                return getOrdinalId();
            case "model_id":
                return getModelId();
            case "model_group_id":
                return getModelGroupId();
            case "model_name":
                return getModelName();
            case "model_group_name":
                return getModelGroupName();
            case "assembly_id":
                return getAssemblyId();
            case "model_type":
                return getModelType();
            case "model_type_other_details":
                return getModelTypeOtherDetails();
            case "data_id":
                return getDataId();
            default:
                return new DelegatingColumn(column);
        }
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
     * A cluster of models and its representative can either be grouped together
     * or can be separate groups in the ma_model_list table. The choice between
     * the two options should be decided based on how the modeling was carried out
     * and how the representative was chosen. If the representative is a member of
     * the ensemble (i.e., best scoring model), then it is recommended that the
     * representative and the ensemble belong to the same model group. If the
     * representative is calculated from the ensemble (i.e., centroid), then it is
     * recommended that the representative be separated into a different group.
     * If the models do not need to be grouped into collections, then the
     * _ma_model_list.model_group_id is the same as _ma_model_list.model_id.
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
     * An identifier to the structural assembly corresponding to the model.
     * @return IntColumn
     */
    public IntColumn getAssemblyId() {
        return delegate.getColumn("assembly_id", DelegatingIntColumn::new);
    }

    /**
     * The type of model.
     * @return StrColumn
     */
    public StrColumn getModelType() {
        return delegate.getColumn("model_type", DelegatingStrColumn::new);
    }

    /**
     * Details for other model types.
     * @return StrColumn
     */
    public StrColumn getModelTypeOtherDetails() {
        return delegate.getColumn("model_type_other_details", DelegatingStrColumn::new);
    }

    /**
     * The data_id identifier. This data item is a pointer to
     * _ma_data.id in the MA_DATA category.
     * @return IntColumn
     */
    public IntColumn getDataId() {
        return delegate.getColumn("data_id", DelegatingIntColumn::new);
    }

}