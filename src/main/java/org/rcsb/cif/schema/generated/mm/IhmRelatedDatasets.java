package org.rcsb.cif.schema.generated.mm;

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

    /**
     * A unique identifier for the entry.
     * @return IntColumn
     */
    public IntColumn getOrdinalId() {
        return delegate.getColumn("ordinal_id", DelegatingIntColumn::new);
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
