package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * IHM_MULTI_STATE_MODEL_GROUP_LINK category provides the list of models groups
 * corresponding to a particular state.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class IhmMultiStateModelGroupLink extends DelegatingCategory {
    public IhmMultiStateModelGroupLink(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "state_id":
                return getStateId();
            case "model_group_id":
                return getModelGroupId();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * An identifier for the state.
     * This data item is a pointer to _ihm_multi_state_modeling.state_id in the
     * IHM_MULTI_STATE_MODELING category.
     * @return IntColumn
     */
    public IntColumn getStateId() {
        return delegate.getColumn("state_id", DelegatingIntColumn::new);
    }

    /**
     * An identifier for the structural model group.
     * This data item is a pointer to _ihm_model_group.id in the
     * IHM_MODEL_GROUP category.
     * @return IntColumn
     */
    public IntColumn getModelGroupId() {
        return delegate.getColumn("model_group_id", DelegatingIntColumn::new);
    }

}