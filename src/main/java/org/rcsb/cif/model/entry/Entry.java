package org.rcsb.cif.model.entry;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class Entry extends BaseCategory {
    public Entry(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public Entry(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public Entry(String name) {
        super(name);
    }

    /**
     * The value of _entry.id identifies the data block.
     * 
     * Note that this item need not be a number; it can be any unique
     * identifier.
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }
}
