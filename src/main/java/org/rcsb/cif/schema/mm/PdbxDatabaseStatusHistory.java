package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * The pdbx_database_status_history category records the time evolution of entry
 * processing status.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxDatabaseStatusHistory extends DelegatingCategory {
    public PdbxDatabaseStatusHistory(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "entry_id":
                return getEntryId();
            case "ordinal":
                return getOrdinal();
            case "date_begin":
                return getDateBegin();
            case "date_end":
                return getDateEnd();
            case "status_code":
                return getStatusCode();
            case "details":
                return getDetails();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The value of _pdbx_database_status_history.entry_id identifies the entry data block.
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return delegate.getColumn("entry_id", DelegatingStrColumn::new);
    }

    /**
     * Ordinal index for the status history list.
     * @return StrColumn
     */
    public StrColumn getOrdinal() {
        return delegate.getColumn("ordinal", DelegatingStrColumn::new);
    }

    /**
     * This is the date of the start of the current processing status state.
     * @return StrColumn
     */
    public StrColumn getDateBegin() {
        return delegate.getColumn("date_begin", DelegatingStrColumn::new);
    }

    /**
     * This is the date of the end of the current processing status state.
     * @return StrColumn
     */
    public StrColumn getDateEnd() {
        return delegate.getColumn("date_end", DelegatingStrColumn::new);
    }

    /**
     * Current entry processing status.
     * @return StrColumn
     */
    public StrColumn getStatusCode() {
        return delegate.getColumn("status_code", DelegatingStrColumn::new);
    }

    /**
     * Special details about the current process status state.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

}