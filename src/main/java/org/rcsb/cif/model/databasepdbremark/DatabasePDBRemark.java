package org.rcsb.cif.model.databasepdbremark;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class DatabasePDBRemark extends BaseCategory {
    public DatabasePDBRemark(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public DatabasePDBRemark(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public DatabasePDBRemark(String name) {
        super(name);
    }

    /**
     * A unique identifier for the PDB remark record.
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }

    /**
     * The full text of the PDB remark record.
     * @return Text
     */
    public Text getText() {
        return (Text) (isText ? textFields.computeIfAbsent("text",
                Text::new) : getBinaryColumn("text"));
    }
}
