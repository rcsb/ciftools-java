package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in PDBX_DATABASE_RELATED contain references to entries
 * that are related to the this entry.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return StrColumn
     */
    public StrColumn getDbName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("db_name", StrColumn::new) :
                getBinaryColumn("db_name"));
    }

    /**
     * A description of the related entry.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * The identifying code in the related database.
     * @return StrColumn
     */
    public StrColumn getDbId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("db_id", StrColumn::new) :
                getBinaryColumn("db_id"));
    }

    /**
     * The identifying content type of the related entry.
     * @return StrColumn
     */
    public StrColumn getContentType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("content_type", StrColumn::new) :
                getBinaryColumn("content_type"));
    }
}
