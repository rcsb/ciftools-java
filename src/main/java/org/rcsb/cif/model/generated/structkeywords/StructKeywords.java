package org.rcsb.cif.model.generated.structkeywords;

import org.rcsb.cif.model.BaseCifCategory;
import org.rcsb.cif.model.CifColumn;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.schema.Schema")
public class StructKeywords extends BaseCifCategory {
    public StructKeywords(String name, Map<String, CifColumn> columns) {
        super(name, columns);
    }

    public StructKeywords(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    /**
     * This data item is a pointer to _entry.id in the ENTRY category.
     * @return EntryId
     */
    public EntryId getEntryId() {
        return (EntryId) (isText ? getTextColumn("entry_id") : getBinaryColumn("entry_id", "EntryId"));
    }

    /**
     * Keywords describing this structure.
     * @return Text
     */
    public Text getText() {
        return (Text) (isText ? getTextColumn("text") : getBinaryColumn("text", "Text"));
    }

    /**
     * Terms characterizing the macromolecular structure.
     * @return PdbxKeywords
     */
    public PdbxKeywords getPdbxKeywords() {
        return (PdbxKeywords) (isText ? getTextColumn("pdbx_keywords") : getBinaryColumn("pdbx_keywords", "PdbxKeywords"));
    }
}
