package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the IHM_ENTRY_COLLECTION category identify a
 * collection of IHM entries belonging to a single deposition or group.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class IhmEntryCollection extends DelegatingCategory {
    public IhmEntryCollection(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "id":
                return getId();
            case "name":
                return getName();
            case "details":
                return getDetails();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * A unique identifier for the entry collection assigned by the archive.
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * Name for the entry collection.
     * @return StrColumn
     */
    public StrColumn getName() {
        return delegate.getColumn("name", DelegatingStrColumn::new);
    }

    /**
     * Details about the entry collection.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

}