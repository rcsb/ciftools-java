package org.rcsb.cif.model.pdbxdatabaseremark;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxDatabaseRemark extends BaseCategory {
    public PdbxDatabaseRemark(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxDatabaseRemark(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxDatabaseRemark(String name) {
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
