package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * There is only one item in the ENTRY category, _entry.id. This
 * data item gives a name to this entry and is indirectly a key to
 * the categories (such as CELL, GEOM, EXPTL) that describe
 * information pertinent to the entire data block.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("id", SingleRowStrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * Document Object Identifier (DOI) for this entry registered
     * with http://crossref.org.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getPdbxDOI() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("pdbx_DOI", SingleRowStrColumn::new) :
                getBinaryColumn("pdbx_DOI"));
    }
}
