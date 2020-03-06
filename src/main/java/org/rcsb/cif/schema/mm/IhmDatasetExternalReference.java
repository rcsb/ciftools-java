package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Category provides additional details regarding input data hosted externally
 * at other resources.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class IhmDatasetExternalReference extends DelegatingCategory {
    public IhmDatasetExternalReference(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "id":
                return getId();
            case "dataset_list_id":
                return getDatasetListId();
            case "file_id":
                return getFileId();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * A unique identifier for the external data.
     * @return IntColumn
     */
    public IntColumn getId() {
        return delegate.getColumn("id", DelegatingIntColumn::new);
    }

    /**
     * Identifier to the dataset list used in the I/H modeling.
     * This data item is a pointer to the _ihm_dataset_list.id in the
     * IHM_DATASET_LIST category.
     * @return IntColumn
     */
    public IntColumn getDatasetListId() {
        return delegate.getColumn("dataset_list_id", DelegatingIntColumn::new);
    }

    /**
     * The file id corresponding to this external data file.
     * This data item is a pointer to _ihm_external_files.id
     * in the IHM_EXTERNAL_FILES category.
     * @return IntColumn
     */
    public IntColumn getFileId() {
        return delegate.getColumn("file_id", DelegatingIntColumn::new);
    }

}