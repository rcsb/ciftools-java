package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Category provides additional details regarding input data hosted externally
 * at other resources.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class IhmDatasetExternalReference extends BaseCategory {
    public IhmDatasetExternalReference(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public IhmDatasetExternalReference(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public IhmDatasetExternalReference(String name) {
        super(name);
    }

    /**
     * A unique identifier for the external data.
     * @return IntColumn
     */
    public IntColumn getId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("id", IntColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * Identifier to the dataset list used in the I/H modeling.
     * This data item is a pointer to the _ihm_dataset_list.id in the
     * IHM_DATASET_LIST category.
     * @return IntColumn
     */
    public IntColumn getDatasetListId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("dataset_list_id", IntColumn::new) :
                getBinaryColumn("dataset_list_id"));
    }

    /**
     * The file id corresponding to this external data file.
     * This data item is a pointer to _ihm_external_files.id
     * in the IHM_EXTERNAL_FILES category.
     * @return IntColumn
     */
    public IntColumn getFileId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("file_id", IntColumn::new) :
                getBinaryColumn("file_id"));
    }
}
