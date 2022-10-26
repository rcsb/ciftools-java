package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Category holds links to raw data sources for the entry, e.g.,
 * held by a remote server.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class EmDbReferenceAuxiliary extends DelegatingCategory {
    public EmDbReferenceAuxiliary(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "id":
                return getId();
            case "link":
                return getLink();
            case "link_type":
                return getLinkType();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * PRIMARY KEY
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * Hyperlink to the auxiliary data.
     * @return StrColumn
     */
    public StrColumn getLink() {
        return delegate.getColumn("link", DelegatingStrColumn::new);
    }

    /**
     * Type of auxiliary data stored at the indicated link.
     * @return StrColumn
     */
    public StrColumn getLinkType() {
        return delegate.getColumn("link_type", DelegatingStrColumn::new);
    }

}