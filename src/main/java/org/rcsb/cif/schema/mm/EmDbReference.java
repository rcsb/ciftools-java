package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Category holds links to raw data sources for the entry, e.g.,
 * held by a remote server.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class EmDbReference extends DelegatingCategory {
    public EmDbReference(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "access_code":
                return getAccessCode();
            case "db_name":
                return getDbName();
            case "details":
                return getDetails();
            case "id":
                return getId();
            case "relationship":
                return getRelationship();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * Unique identifier for a provided link.
     * @return StrColumn
     */
    public StrColumn getAccessCode() {
        return delegate.getColumn("access_code", DelegatingStrColumn::new);
    }

    /**
     * The name of the database containing the related entry.
     * @return StrColumn
     */
    public StrColumn getDbName() {
        return delegate.getColumn("db_name", DelegatingStrColumn::new);
    }

    /**
     * A description of the related entry.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

    /**
     * PRIMARY KEY
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * Indicates relationship of this entry with other entries in PDB and EMDB.
     * @return StrColumn
     */
    public StrColumn getRelationship() {
        return delegate.getColumn("relationship", DelegatingStrColumn::new);
    }

}