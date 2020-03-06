package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Category holds information about related datasets, where one is derived from the other.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class IhmRelatedDatasets extends DelegatingCategory {
    public IhmRelatedDatasets(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "dataset_list_id_derived":
                return getDatasetListIdDerived();
            case "dataset_list_id_primary":
                return getDatasetListIdPrimary();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The dataset list id corresponding to the derived dataset.
     * This data item is a pointer to _ihm_dataset_list.id in the
     * IHM_DATASET_LIST category.
     * @return IntColumn
     */
    public IntColumn getDatasetListIdDerived() {
        return delegate.getColumn("dataset_list_id_derived", DelegatingIntColumn::new);
    }

    /**
     * The primary dataset list id from which the corresponding derived dataset is obtained.
     * This data item is a pointer to _ihm_dataset_list.id in the
     * IHM_DATASET_LIST category.
     * @return IntColumn
     */
    public IntColumn getDatasetListIdPrimary() {
        return delegate.getColumn("dataset_list_id_primary", DelegatingIntColumn::new);
    }

}