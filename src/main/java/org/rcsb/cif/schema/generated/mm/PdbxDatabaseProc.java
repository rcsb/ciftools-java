package org.rcsb.cif.schema.generated.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Internal records to track the data processing cycle.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxDatabaseProc extends DelegatingCategory {
    public PdbxDatabaseProc(Category delegate) {
        super(delegate);
    }

    /**
     * The value of _pdbx_database_proc.entry_id identifies the data block.
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return delegate.getColumn("entry_id", DelegatingStrColumn::new);
    }

    /**
     * This is a number of the processing cycle.
     * @return StrColumn
     */
    public StrColumn getCycleId() {
        return delegate.getColumn("cycle_id", DelegatingStrColumn::new);
    }

    /**
     * This is the date of the start of the processing cycle.
     * @return StrColumn
     */
    public StrColumn getDateBeginCycle() {
        return delegate.getColumn("date_begin_cycle", DelegatingStrColumn::new);
    }

    /**
     * This is the date of the end of the processing cycle.
     * @return StrColumn
     */
    public StrColumn getDateEndCycle() {
        return delegate.getColumn("date_end_cycle", DelegatingStrColumn::new);
    }

    /**
     * Special details about the current processing cycle.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }
}
