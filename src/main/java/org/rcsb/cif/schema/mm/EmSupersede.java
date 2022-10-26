package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * List of newer entries that replace this entry.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class EmSupersede extends DelegatingCategory {
    public EmSupersede(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "date":
                return getDate();
            case "details":
                return getDetails();
            case "entry":
                return getEntry();
            case "id":
                return getId();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * Dated when the entry made supersede the other entry
     * @return StrColumn
     */
    public StrColumn getDate() {
        return delegate.getColumn("date", DelegatingStrColumn::new);
    }

    /**
     * Details
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

    /**
     * Newer entry that replaces this entry
     * @return StrColumn
     */
    public StrColumn getEntry() {
        return delegate.getColumn("entry", DelegatingStrColumn::new);
    }

    /**
     * PRIMARY KEY
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

}