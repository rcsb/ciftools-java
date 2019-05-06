package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Category provides a mechanism to group datasets.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class IhmDatasetGroup extends BaseCategory {
    public IhmDatasetGroup(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public IhmDatasetGroup(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public IhmDatasetGroup(String name) {
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
     * An identifier for the dataset group.
     * @return IntColumn
     */
    public IntColumn getGroupId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("group_id", IntColumn::new) :
                getBinaryColumn("group_id"));
    }

    /**
     * An identifier to the dataset. This data item is a pointer to
     * _ihm_dataset_list.id in the IHM_DATASET_LIST category.
     * @return IntColumn
     */
    public IntColumn getDatasetListId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("dataset_list_id", IntColumn::new) :
                getBinaryColumn("dataset_list_id"));
    }

    /**
     * The application / utilization of the dataset group in modeling.
     * @return StrColumn
     */
    public StrColumn getApplication() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("application", StrColumn::new) :
                getBinaryColumn("application"));
    }

    /**
     * Additional details regarding the dataset group.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }
}
