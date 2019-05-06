package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Category holds information about related datasets, where one is derived from the other.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class IhmRelatedDatasets extends BaseCategory {
    public IhmRelatedDatasets(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public IhmRelatedDatasets(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public IhmRelatedDatasets(String name) {
        super(name);
    }

    /**
     * A unique identifier for the entry.
     * @return IntColumn
     */
    public IntColumn getOrdinalId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("ordinal_id", IntColumn::new) :
                getBinaryColumn("ordinal_id"));
    }

    /**
     * The dataset list id corresponding to the derived dataset.
     * This data item is a pointer to _ihm_dataset_list.id in the
     * IHM_DATASET_LIST category.
     * @return IntColumn
     */
    public IntColumn getDatasetListIdDerived() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("dataset_list_id_derived", IntColumn::new) :
                getBinaryColumn("dataset_list_id_derived"));
    }

    /**
     * The primary dataset list id from which the corresponding derived dataset is obtained.
     * This data item is a pointer to _ihm_dataset_list.id in the
     * IHM_DATASET_LIST category.
     * @return IntColumn
     */
    public IntColumn getDatasetListIdPrimary() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("dataset_list_id_primary", IntColumn::new) :
                getBinaryColumn("dataset_list_id_primary"));
    }
}
