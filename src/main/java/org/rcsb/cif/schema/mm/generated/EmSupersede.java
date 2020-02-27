package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * List of newer entries that replace this entry.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class EmSupersede extends BaseCategory {
    public EmSupersede(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public EmSupersede(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public EmSupersede(String name) {
        super(name);
    }

    /**
     * Dated when the entry made supersede the other entry
     * @return StrColumn
     */
    public StrColumn getDate() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("date", StrColumn::new) :
                getBinaryColumn("date"));
    }

    /**
     * Details
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * Newer entry that replaces this entry
     * @return StrColumn
     */
    public StrColumn getEntry() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entry", StrColumn::new) :
                getBinaryColumn("entry"));
    }

    /**
     * Primary key
     * @return StrColumn
     */
    public StrColumn getId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("id", StrColumn::new) :
                getBinaryColumn("id"));
    }
}
