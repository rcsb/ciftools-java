package org.rcsb.cif.model.struct;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.schema.Schema")
public class Struct extends BaseCategory {
    public Struct(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public Struct(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public Struct(String name) {
        super(name);
    }

    /**
     * This data item is a pointer to _entry.id in the ENTRY category.
     * @return EntryId
     */
    public EntryId getEntryId() {
        return (EntryId) (isText ? getTextColumn("entry_id") : getBinaryColumn("entry_id"));
    }

    /**
     * A title for the data block. The author should attempt to convey
     * the essence of the structure archived in the CIF in the title,
     * and to distinguish this structural result from others.
     * @return Title
     */
    public Title getTitle() {
        return (Title) (isText ? getTextColumn("title") : getBinaryColumn("title"));
    }
}
