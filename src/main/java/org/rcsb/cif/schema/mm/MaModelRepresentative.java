package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the MA_MODEL_REPRESENTATIVE category record the
 * details of the representative structure model when multiple models are submitted.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class MaModelRepresentative extends DelegatingCategory {
    public MaModelRepresentative(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "id":
                return getId();
            case "model_group_id":
                return getModelGroupId();
            case "model_id":
                return getModelId();
            case "selection_criteria":
                return getSelectionCriteria();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * A unique identifier for the representative model in a model group.
     * @return IntColumn
     */
    public IntColumn getId() {
        return delegate.getColumn("id", DelegatingIntColumn::new);
    }

    /**
     * The model group identifier corresponding to the representative model.
     * This data item is a pointer to _ma_model_group.id in the
     * MA_MODEL_GROUP category.
     * @return IntColumn
     */
    public IntColumn getModelGroupId() {
        return delegate.getColumn("model_group_id", DelegatingIntColumn::new);
    }

    /**
     * The model identifier corresponding to the representative model.
     * This data item is a pointer to _ma_model_list.ordinal_id in the
     * MA_MODEL_LIST category.
     * @return IntColumn
     */
    public IntColumn getModelId() {
        return delegate.getColumn("model_id", DelegatingIntColumn::new);
    }

    /**
     * The selection criteria based on which the representative is chosen.
     * Details about the selection procedure should be described in the
     * "model selection" step in ma_protocol_step.
     * @return StrColumn
     */
    public StrColumn getSelectionCriteria() {
        return delegate.getColumn("selection_criteria", DelegatingStrColumn::new);
    }

}