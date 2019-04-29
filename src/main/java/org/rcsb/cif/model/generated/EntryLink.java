package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the ENTRY_LINK category record the
 * relationships between the current data block
 * identified by _entry.id and other data blocks
 * within the current file which may be referenced
 * in the current data block.
 */
@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class EntryLink extends BaseCategory {
    public EntryLink(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public EntryLink(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public EntryLink(String name) {
        super(name);
    }

    /**
     * This data item is a pointer to _entry.id in the ENTRY category.
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entry_id", StrColumn::new) :
                getBinaryColumn("entry_id"));
    }

    /**
     * The value of _entry_link.id identifies a data block
     * related to the current data block.
     * @return StrColumn
     */
    public StrColumn getId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("id", StrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * A description of the relationship between the data blocks
     * identified by _entry_link.id and _entry_link.entry_id.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }
}
