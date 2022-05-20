package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * The PDBX_DATA_USAGE category provides information on licensing
 * an disclaimers of the file it is in
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxDataUsage extends DelegatingCategory {
    public PdbxDataUsage(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "id":
                return getId();
            case "type":
                return getType();
            case "details":
                return getDetails();
            case "url":
                return getUrl();
            case "name":
                return getName();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * Uniquely identifies an data_usage
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * Describes the type of data_usage.
     * @return StrColumn
     */
    public StrColumn getType() {
        return delegate.getColumn("type", DelegatingStrColumn::new);
    }

    /**
     * Provides the details of usage for a particular type.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

    /**
     * Provides the an optional url for more details of the
     * particular type.
     * @return StrColumn
     */
    public StrColumn getUrl() {
        return delegate.getColumn("url", DelegatingStrColumn::new);
    }

    /**
     * An optional well known name for the _pdbx_usage_data.
     * @return StrColumn
     */
    public StrColumn getName() {
        return delegate.getColumn("name", DelegatingStrColumn::new);
    }

}