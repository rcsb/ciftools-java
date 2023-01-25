package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the IHM_ENTRY_COLLECTION_MAPPING category identify the
 * entries that belong to a collection.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class IhmEntryCollectionMapping extends DelegatingCategory {
    public IhmEntryCollectionMapping(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "id":
                return getId();
            case "collection_id":
                return getCollectionId();
            case "entry_id":
                return getEntryId();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * A unique identifier for the entry collection mapping.
     * @return IntColumn
     */
    public IntColumn getId() {
        return delegate.getColumn("id", DelegatingIntColumn::new);
    }

    /**
     * Identifier for the entry collection.
     * This data item is a pointer to _ihm_entry_collection.id in the
     * IHM_ENTRY_COLLECTION category.
     * @return StrColumn
     */
    public StrColumn getCollectionId() {
        return delegate.getColumn("collection_id", DelegatingStrColumn::new);
    }

    /**
     * Identifier for the entry.
     * This data item is a pointer to _entry.id in the
     * ENTRY category.
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return delegate.getColumn("entry_id", DelegatingStrColumn::new);
    }

}