package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the STRUCT_BIOL_KEYWORDS category record
 * keywords that describe each biological unit.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class StructBiolKeywords extends BaseCategory {
    public StructBiolKeywords(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public StructBiolKeywords(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public StructBiolKeywords(String name) {
        super(name);
    }

    /**
     * This data item is a pointer to _struct_biol.id in the STRUCT_BIOL
     * category.
     * @return StrColumn
     */
    public StrColumn getBiolId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("biol_id", StrColumn::new) :
                getBinaryColumn("biol_id"));
    }

    /**
     * Keywords describing this biological entity.
     * @return StrColumn
     */
    public StrColumn getText() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("text", StrColumn::new) :
                getBinaryColumn("text"));
    }
}
