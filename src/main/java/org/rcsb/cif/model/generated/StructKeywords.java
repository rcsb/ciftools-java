package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the STRUCT_KEYWORDS category specify keywords
 * that describe the chemical structure in this entry.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class StructKeywords extends BaseCategory {
    public StructKeywords(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public StructKeywords(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public StructKeywords(String name) {
        super(name);
    }

    /**
     * This data item is a pointer to _entry.id in the ENTRY category.
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entry_id", StrColumn::new) :
                getBinaryColumn("entry_id"));
    }

    /**
     * Keywords describing this structure.
     * @return StrColumn
     */
    public StrColumn getText() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("text", StrColumn::new) :
                getBinaryColumn("text"));
    }

    /**
     * Terms characterizing the macromolecular structure.
     * @return StrColumn
     */
    public StrColumn getPdbxKeywords() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_keywords", StrColumn::new) :
                getBinaryColumn("pdbx_keywords"));
    }

    /**
     * Keywords describing this structure.  This is constructed by the
     * PROGRAM for the PDB KEYWRD record.
     * @return StrColumn
     */
    public StrColumn getPdbxDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_details", StrColumn::new) :
                getBinaryColumn("pdbx_details"));
    }
}
