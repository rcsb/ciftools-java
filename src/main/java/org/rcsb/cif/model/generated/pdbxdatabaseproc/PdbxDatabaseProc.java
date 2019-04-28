package org.rcsb.cif.model.generated.pdbxdatabaseproc;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxDatabaseProc extends BaseCategory {
    public PdbxDatabaseProc(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxDatabaseProc(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxDatabaseProc(String name) {
        super(name);
    }

    /**
     * The value of _pdbx_database_proc.entry_id identifies the data block.
     * @return EntryId
     */
    public EntryId getEntryId() {
        return (EntryId) (isText ? textFields.computeIfAbsent("entry_id",
                EntryId::new) : getBinaryColumn("entry_id"));
    }

    /**
     * This is a number of the processing cycle.
     * @return CycleId
     */
    public CycleId getCycleId() {
        return (CycleId) (isText ? textFields.computeIfAbsent("cycle_id",
                CycleId::new) : getBinaryColumn("cycle_id"));
    }

    /**
     * This is the date of the start of the processing cycle.
     * @return DateBeginCycle
     */
    public DateBeginCycle getDateBeginCycle() {
        return (DateBeginCycle) (isText ? textFields.computeIfAbsent("date_begin_cycle",
                DateBeginCycle::new) : getBinaryColumn("date_begin_cycle"));
    }

    /**
     * This is the date of the end of the processing cycle.
     * @return DateEndCycle
     */
    public DateEndCycle getDateEndCycle() {
        return (DateEndCycle) (isText ? textFields.computeIfAbsent("date_end_cycle",
                DateEndCycle::new) : getBinaryColumn("date_end_cycle"));
    }

    /**
     * Special details about the current processing cycle.
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
    }
}
