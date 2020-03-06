package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * IHM_DATASET_GROUP_LINK category provides the list of datasets present in
 * a particular group.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class IhmDatasetGroupLink extends DelegatingCategory {
    public IhmDatasetGroupLink(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "dataset_list_id":
                return getDatasetListId();
            case "group_id":
                return getGroupId();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * An identifier for the dataset.
     * This data item is a pointer to _ihm_dataset_list.id in the
     * IHM_DATASET_LIST category.
     * @return IntColumn
     */
    public IntColumn getDatasetListId() {
        return delegate.getColumn("dataset_list_id", DelegatingIntColumn::new);
    }

    /**
     * An identifier for the dataset group.
     * This data item is a pointer to _ihm_dataset_group.id in the
     * IHM_DATASET_GROUP category.
     * @return IntColumn
     */
    public IntColumn getGroupId() {
        return delegate.getColumn("group_id", DelegatingIntColumn::new);
    }

}