package org.rcsb.cif.model.pdbxatlas;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

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
     * @return EntryId
     */
    public EntryId getEntryId() {
        return (EntryId) (isText ? textFields.computeIfAbsent("entry_id",
                EntryId::new) : getBinaryColumn("entry_id"));
    }

    /**
     * A unique identifier for a NDB ATLAS index page.
     * @return PageId
     */
    public PageId getPageId() {
        return (PageId) (isText ? textFields.computeIfAbsent("page_id",
                PageId::new) : getBinaryColumn("page_id"));
    }

    /**
     * Text of the Atlas index entry.
     * @return PageName
     */
    public PageName getPageName() {
        return (PageName) (isText ? textFields.computeIfAbsent("page_name",
                PageName::new) : getBinaryColumn("page_name"));
    }
}
