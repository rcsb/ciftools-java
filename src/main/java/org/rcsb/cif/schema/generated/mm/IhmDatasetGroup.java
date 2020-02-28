package org.rcsb.cif.schema.generated.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Category provides a mechanism to group datasets.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class IhmDatasetGroup extends DelegatingCategory {
    public IhmDatasetGroup(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "ordinal_id":
                return getOrdinalId();
            case "group_id":
                return getGroupId();
            case "dataset_list_id":
                return getDatasetListId();
            case "application":
                return getApplication();
            case "details":
                return getDetails();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * A unique identifier for the entry.
     * @return IntColumn
     */
    public IntColumn getOrdinalId() {
        return delegate.getColumn("ordinal_id", DelegatingIntColumn::new);
    }

    /**
     * An identifier for the dataset group.
     * @return IntColumn
     */
    public IntColumn getGroupId() {
        return delegate.getColumn("group_id", DelegatingIntColumn::new);
    }

    /**
     * An identifier to the dataset. This data item is a pointer to
     * _ihm_dataset_list.id in the IHM_DATASET_LIST category.
     * @return IntColumn
     */
    public IntColumn getDatasetListId() {
        return delegate.getColumn("dataset_list_id", DelegatingIntColumn::new);
    }

    /**
     * The application / utilization of the dataset group in modeling.
     * @return StrColumn
     */
    public StrColumn getApplication() {
        return delegate.getColumn("application", DelegatingStrColumn::new);
    }

    /**
     * Additional details regarding the dataset group.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }
}
