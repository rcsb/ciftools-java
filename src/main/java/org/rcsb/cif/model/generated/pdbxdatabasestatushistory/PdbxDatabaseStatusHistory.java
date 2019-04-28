package org.rcsb.cif.model.generated.pdbxdatabasestatushistory;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
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
     * @return EntryId
     */
    public EntryId getEntryId() {
        return (EntryId) (isText ? textFields.computeIfAbsent("entry_id",
                EntryId::new) : getBinaryColumn("entry_id"));
    }

    /**
     * Ordinal index for the status history list.
     * @return Ordinal
     */
    public Ordinal getOrdinal() {
        return (Ordinal) (isText ? textFields.computeIfAbsent("ordinal",
                Ordinal::new) : getBinaryColumn("ordinal"));
    }

    /**
     * This is the date of the start of the current processing status state.
     * @return DateBegin
     */
    public DateBegin getDateBegin() {
        return (DateBegin) (isText ? textFields.computeIfAbsent("date_begin",
                DateBegin::new) : getBinaryColumn("date_begin"));
    }

    /**
     * This is the date of the end of the current processing status state.
     * @return DateEnd
     */
    public DateEnd getDateEnd() {
        return (DateEnd) (isText ? textFields.computeIfAbsent("date_end",
                DateEnd::new) : getBinaryColumn("date_end"));
    }

    /**
     * Current entry processing status.
     * @return StatusCode
     */
    public StatusCode getStatusCode() {
        return (StatusCode) (isText ? textFields.computeIfAbsent("status_code",
                StatusCode::new) : getBinaryColumn("status_code"));
    }

    /**
     * Special details about the current process status state.
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
    }
}
