package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in PDBX_DATABASE_RELATED contain references to entries
 * that are related to the this entry.
 */
@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxDatabaseRelated extends BaseCategory {
    public PdbxDatabaseRelated(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxDatabaseRelated(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxDatabaseRelated(String name) {
        super(name);
    }

    /**
     * The name of the database containing the related entry.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDbName() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("db_name", SingleRowStrColumn::new) :
                getBinaryColumn("db_name"));
    }

    /**
     * A description of the related entry.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDetails() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("details", SingleRowStrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * The identifying code in the related database.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDbId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("db_id", SingleRowStrColumn::new) :
                getBinaryColumn("db_id"));
    }

    /**
     * The identifying content type of the related entry.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getContentType() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("content_type", SingleRowStrColumn::new) :
                getBinaryColumn("content_type"));
    }
}
