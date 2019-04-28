package org.rcsb.cif.model.generated.database2;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class Database2 extends BaseCategory {
    public Database2(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public Database2(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public Database2(String name) {
        super(name);
    }

    /**
     * An abbreviation that identifies the database.
     * @return DatabaseId
     */
    public DatabaseId getDatabaseId() {
        return (DatabaseId) (isText ? textFields.computeIfAbsent("database_id",
                DatabaseId::new) : getBinaryColumn("database_id"));
    }

    /**
     * The code assigned by the database identified in
     * _database_2.database_id.
     * @return DatabaseCode
     */
    public DatabaseCode getDatabaseCode() {
        return (DatabaseCode) (isText ? textFields.computeIfAbsent("database_code",
                DatabaseCode::new) : getBinaryColumn("database_code"));
    }
}
