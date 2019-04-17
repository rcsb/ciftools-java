package org.rcsb.cif.model.generated.struct;

import org.rcsb.cif.model.BaseCifCategory;
import org.rcsb.cif.model.CifColumn;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.schema.Schema")
public class Struct extends BaseCifCategory {
    public Struct(String name, Map<String, CifColumn> columns) {
        super(name, columns);
    }

    public Struct(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
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
