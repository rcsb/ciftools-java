package org.rcsb.cif.model.generated.structbiolkeywords;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
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
     * @return BiolId
     */
    public BiolId getBiolId() {
        return (BiolId) (isText ? textFields.computeIfAbsent("biol_id",
                BiolId::new) : getBinaryColumn("biol_id"));
    }

    /**
     * Keywords describing this biological entity.
     * @return Text
     */
    public Text getText() {
        return (Text) (isText ? textFields.computeIfAbsent("text",
                Text::new) : getBinaryColumn("text"));
    }
}
