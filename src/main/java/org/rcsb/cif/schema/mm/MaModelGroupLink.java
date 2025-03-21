package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * MA_MODEL_GROUP_LINK category provides the list of structure models present in
 * a particular structure model group.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class MaModelGroupLink extends DelegatingCategory {
    public MaModelGroupLink(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "model_id":
                return getModelId();
            case "group_id":
                return getGroupId();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * An identifier for the structure model.
     * This data item is a pointer to _ma_model_list.ordinal_id in the
     * MA_MODEL_LIST category.
     * @return IntColumn
     */
    public IntColumn getModelId() {
        return delegate.getColumn("model_id", DelegatingIntColumn::new);
    }

    /**
     * An identifier for the structure model group.
     * This data item is a pointer to _ma_model_group.id in the
     * MA_MODEL_GROUP category.
     * @return IntColumn
     */
    public IntColumn getGroupId() {
        return delegate.getColumn("group_id", DelegatingIntColumn::new);
    }

}