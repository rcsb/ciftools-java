package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * The pdbx_database_status_history category records the time evolution of entry
 * processing status.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class PdbxDatabaseStatusHistory extends BaseCategory {
    public PdbxDatabaseStatusHistory(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxDatabaseStatusHistory(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxDatabaseStatusHistory(String name) {
        super(name);
    }

    /**
     * The value of _pdbx_database_status_history.entry_id identifies the entry data block.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getEntryId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("entry_id", SingleRowStrColumn::new) :
                getBinaryColumn("entry_id"));
    }

    /**
     * Ordinal index for the status history list.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getOrdinal() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("ordinal", SingleRowStrColumn::new) :
                getBinaryColumn("ordinal"));
    }

    /**
     * This is the date of the start of the current processing status state.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDateBegin() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("date_begin", SingleRowStrColumn::new) :
                getBinaryColumn("date_begin"));
    }

    /**
     * This is the date of the end of the current processing status state.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDateEnd() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("date_end", SingleRowStrColumn::new) :
                getBinaryColumn("date_end"));
    }

    /**
     * Current entry processing status.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getStatusCode() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("status_code", SingleRowStrColumn::new) :
                getBinaryColumn("status_code"));
    }

    /**
     * Special details about the current process status state.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDetails() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("details", SingleRowStrColumn::new) :
                getBinaryColumn("details"));
    }
}
