package org.rcsb.cif.model.generated;

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
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getEntryId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("entry_id", SingleRowStrColumn::new) :
                getBinaryColumn("entry_id"));
    }

    /**
     * This is a number of the processing cycle.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getCycleId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("cycle_id", SingleRowStrColumn::new) :
                getBinaryColumn("cycle_id"));
    }

    /**
     * This is the date of the start of the processing cycle.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDateBeginCycle() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("date_begin_cycle", SingleRowStrColumn::new) :
                getBinaryColumn("date_begin_cycle"));
    }

    /**
     * This is the date of the end of the processing cycle.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDateEndCycle() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("date_end_cycle", SingleRowStrColumn::new) :
                getBinaryColumn("date_end_cycle"));
    }

    /**
     * Special details about the current processing cycle.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDetails() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("details", SingleRowStrColumn::new) :
                getBinaryColumn("details"));
    }
}
