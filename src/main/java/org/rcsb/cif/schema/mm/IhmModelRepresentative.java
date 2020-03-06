package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the IHM_MODEL_REPRESENTATIVE category record the
 * details of the representative model in an ensemble or cluster.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class IhmModelRepresentative extends DelegatingCategory {
    public IhmModelRepresentative(Category delegate) {
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
     * A unique identifier for the representative of the model group.
     * @return IntColumn
     */
    public IntColumn getId() {
        return delegate.getColumn("id", DelegatingIntColumn::new);
    }

    /**
     * The model group identifier corresponding to the representative model.
     * This data item is a pointer to _ihm_model_group.id in the
     * IHM_MODEL_GROUP category.
     * @return IntColumn
     */
    public IntColumn getModelGroupId() {
        return delegate.getColumn("model_group_id", DelegatingIntColumn::new);
    }

    /**
     * The model identifier corresponding to the representative model.
     * This data item is a pointer to _ihm_model_list.model_id in the
     * IHM_MODEL_LIST category.
     * @return IntColumn
     */
    public IntColumn getModelId() {
        return delegate.getColumn("model_id", DelegatingIntColumn::new);
    }

    /**
     * The selection criteria based on which the representative is chosen.
     * @return StrColumn
     */
    public StrColumn getSelectionCriteria() {
        return delegate.getColumn("selection_criteria", DelegatingStrColumn::new);
    }

}