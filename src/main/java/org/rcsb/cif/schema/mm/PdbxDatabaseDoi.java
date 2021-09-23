package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_DATABASE_DOI category record the
 * DOI of this entry.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxDatabaseDoi extends DelegatingCategory {
    public PdbxDatabaseDoi(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "db_name":
                return getDbName();
            case "db_DOI":
                return getDbDOI();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * An abbreviation that identifies the database.
     * @return StrColumn
     */
    public StrColumn getDbName() {
        return delegate.getColumn("db_name", DelegatingStrColumn::new);
    }

    /**
     * The DOI for the entry in the associated database.
     * @return StrColumn
     */
    public StrColumn getDbDOI() {
        return delegate.getColumn("db_DOI", DelegatingStrColumn::new);
    }

}