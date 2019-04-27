package org.rcsb.cif.model.emauthorlist;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class EmAuthorList extends BaseCategory {
    public EmAuthorList(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public EmAuthorList(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public EmAuthorList(String name) {
        super(name);
    }

    /**
     * Author of the EMDB entry in PDB format: Taylor, T.J.
     * @return Author
     */
    public Author getAuthor() {
        return (Author) (isText ? textFields.computeIfAbsent("author",
                Author::new) : getBinaryColumn("author"));
    }

    /**
     * ID 1 corresponds to the main author of the entry
     * @return Ordinal
     */
    public Ordinal getOrdinal() {
        return (Ordinal) (isText ? textFields.computeIfAbsent("ordinal",
                Ordinal::new) : getBinaryColumn("ordinal"));
    }
}
