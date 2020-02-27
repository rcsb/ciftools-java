package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the JOURNAL_INDEX category are used to list terms
 * used to generate the journal indexes.
 * 
 * The creator of a data block will not normally specify these data
 * items.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class JournalIndex extends BaseCategory {
    public JournalIndex(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public JournalIndex(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public JournalIndex(String name) {
        super(name);
    }

    /**
     * Journal index data items are defined by the journal staff.
     * @return StrColumn
     */
    public StrColumn getSubterm() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("subterm", StrColumn::new) :
                getBinaryColumn("subterm"));
    }

    /**
     * Journal index data items are defined by the journal staff.
     * @return StrColumn
     */
    public StrColumn getTerm() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("term", StrColumn::new) :
                getBinaryColumn("term"));
    }

    /**
     * Journal index data items are defined by the journal staff.
     * @return StrColumn
     */
    public StrColumn getType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("type", StrColumn::new) :
                getBinaryColumn("type"));
    }
}
