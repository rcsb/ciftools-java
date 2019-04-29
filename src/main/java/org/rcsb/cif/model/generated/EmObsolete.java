package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * List of EMD entries made obsolete by this entry.
 */
@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class EmObsolete extends BaseCategory {
    public EmObsolete(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public EmObsolete(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public EmObsolete(String name) {
        super(name);
    }

    /**
     * Dated when the entry made obsolete the other entry
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
     * Entry made obsolete
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
