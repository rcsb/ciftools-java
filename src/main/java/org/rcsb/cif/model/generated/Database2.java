package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the DATABASE_2 category record details about the
 * database identifiers of the data block.
 * 
 * These data items are assigned by database managers and should
 * only appear in a data block if they originate from that source.
 * 
 * The name of this category, DATABASE_2, arose because the
 * category name DATABASE was already in use in the core CIF
 * dictionary, but was used differently from the way it needed
 * to be used in the mmCIF dictionary. Since CIF data names
 * cannot be changed once they have been adopted, a new category
 * had to be created.
 */
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
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDatabaseId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("database_id", SingleRowStrColumn::new) :
                getBinaryColumn("database_id"));
    }

    /**
     * The code assigned by the database identified in
     * _database_2.database_id.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDatabaseCode() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("database_code", SingleRowStrColumn::new) :
                getBinaryColumn("database_code"));
    }
}
