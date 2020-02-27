package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Internal records to track the data processing cycle.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entry_id", StrColumn::new) :
                getBinaryColumn("entry_id"));
    }

    /**
     * This is a number of the processing cycle.
     * @return StrColumn
     */
    public StrColumn getCycleId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("cycle_id", StrColumn::new) :
                getBinaryColumn("cycle_id"));
    }

    /**
     * This is the date of the start of the processing cycle.
     * @return StrColumn
     */
    public StrColumn getDateBeginCycle() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("date_begin_cycle", StrColumn::new) :
                getBinaryColumn("date_begin_cycle"));
    }

    /**
     * This is the date of the end of the processing cycle.
     * @return StrColumn
     */
    public StrColumn getDateEndCycle() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("date_end_cycle", StrColumn::new) :
                getBinaryColumn("date_end_cycle"));
    }

    /**
     * Special details about the current processing cycle.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }
}
