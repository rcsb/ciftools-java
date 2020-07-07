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
            case "transformation_id":
                return getTransformationId();
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

    /**
     * A pointer to the transformation matrix, if applicable.
     * The transformation matrix is to be applied to the derived dataset
     * in order to transform it to the primary dataset from which it is
     * derived. Examples include segmented 3DEM maps, Gaussian Mixture Models
     * derived from 3DEM maps, starting comparative models.
     * This data item is a pointer to _ihm_data_transformation.id
     * in the IHM_DATA_TRANSFORMATION category.
     * @return IntColumn
     */
    public IntColumn getTransformationId() {
        return delegate.getColumn("transformation_id", DelegatingIntColumn::new);
    }

}