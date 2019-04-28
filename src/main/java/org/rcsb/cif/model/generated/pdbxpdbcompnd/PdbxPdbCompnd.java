package org.rcsb.cif.model.generated.pdbxpdbcompnd;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxPdbCompnd extends BaseCategory {
    public PdbxPdbCompnd(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxPdbCompnd(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxPdbCompnd(String name) {
        super(name);
    }

    /**
     * NDB ID.
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }

    /**
     * PDB COMPND record.
     * @return Text
     */
    public Text getText() {
        return (Text) (isText ? textFields.computeIfAbsent("text",
                Text::new) : getBinaryColumn("text"));
    }
}
