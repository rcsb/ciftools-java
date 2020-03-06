package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the DATABASE_2 category record details about the
 * database identifiers of the data block.
 * 
 * These data items are assigned by database managers and should
 * only appear in a data block if they originate from that source.
 * 
 * The name of this category, DATABASE_2, arose because the
 * category name DATABASE was already in use in the core CIF
 * dictionary, but was used differently from the way it needed
 * to be used in the mmCIF dictionary. Since CIF data names
 * cannot be changed once they have been adopted, a new category
 * had to be created.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class Database2 extends DelegatingCategory {
    public Database2(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "database_id":
                return getDatabaseId();
            case "database_code":
                return getDatabaseCode();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * An abbreviation that identifies the database.
     * @return StrColumn
     */
    public StrColumn getDatabaseId() {
        return delegate.getColumn("database_id", DelegatingStrColumn::new);
    }

    /**
     * The code assigned by the database identified in
     * _database_2.database_id.
     * @return StrColumn
     */
    public StrColumn getDatabaseCode() {
        return delegate.getColumn("database_code", DelegatingStrColumn::new);
    }

}