package org.rcsb.cif.model.structkeywords;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
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
     * Keywords describing this structure.
     * @return Text
     */
    public Text getText() {
        return (Text) (isText ? textFields.computeIfAbsent("text",
                Text::new) : getBinaryColumn("text"));
    }

    /**
     * Terms characterizing the macromolecular structure.
     * @return PdbxKeywords
     */
    public PdbxKeywords getPdbxKeywords() {
        return (PdbxKeywords) (isText ? textFields.computeIfAbsent("pdbx_keywords",
                PdbxKeywords::new) : getBinaryColumn("pdbx_keywords"));
    }
}
