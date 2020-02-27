package org.rcsb.cif.schema.mm.generated;

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
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entry_id", StrColumn::new) :
                getBinaryColumn("entry_id"));
    }

    /**
     * Ordinal index for the status history list.
     * @return StrColumn
     */
    public StrColumn getOrdinal() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("ordinal", StrColumn::new) :
                getBinaryColumn("ordinal"));
    }

    /**
     * This is the date of the start of the current processing status state.
     * @return StrColumn
     */
    public StrColumn getDateBegin() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("date_begin", StrColumn::new) :
                getBinaryColumn("date_begin"));
    }

    /**
     * This is the date of the end of the current processing status state.
     * @return StrColumn
     */
    public StrColumn getDateEnd() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("date_end", StrColumn::new) :
                getBinaryColumn("date_end"));
    }

    /**
     * Current entry processing status.
     * @return StrColumn
     */
    public StrColumn getStatusCode() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("status_code", StrColumn::new) :
                getBinaryColumn("status_code"));
    }

    /**
     * Special details about the current process status state.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }
}
