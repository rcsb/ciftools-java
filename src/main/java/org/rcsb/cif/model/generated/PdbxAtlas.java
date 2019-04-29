package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Gives information about the organization of the
 * NDB Structural Atlas.
 */
@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxAtlas extends BaseCategory {
    public PdbxAtlas(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxAtlas(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxAtlas(String name) {
        super(name);
    }

    /**
     * Entry ID.
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entry_id", StrColumn::new) :
                getBinaryColumn("entry_id"));
    }

    /**
     * A unique identifier for a NDB ATLAS index page.
     * @return IntColumn
     */
    public IntColumn getPageId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("page_id", IntColumn::new) :
                getBinaryColumn("page_id"));
    }

    /**
     * Text of the Atlas index entry.
     * @return StrColumn
     */
    public StrColumn getPageName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("page_name", StrColumn::new) :
                getBinaryColumn("page_name"));
    }
}
