package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the DATABASE_PDB_REV_RECORD category record
 * details about specific record types that were changed in a
 * given revision of a PDB entry.
 * 
 * These data items are assigned by the PDB database managers and
 * should only appear in a data block if they originate from that
 * source.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class DatabasePDBRevRecord extends DelegatingCategory {
    public DatabasePDBRevRecord(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "details":
                return getDetails();
            case "rev_num":
                return getRevNum();
            case "type":
                return getType();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * A description of special aspects of the revision of records in
     * this PDB entry.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

    /**
     * This data item is a pointer to _database_PDB_rev.num in the
     * DATABASE_PDB_REV category.
     * @return IntColumn
     */
    public IntColumn getRevNum() {
        return delegate.getColumn("rev_num", DelegatingIntColumn::new);
    }

    /**
     * The types of records that were changed in this revision to a
     * PDB entry.
     * @return StrColumn
     */
    public StrColumn getType() {
        return delegate.getColumn("type", DelegatingStrColumn::new);
    }

}