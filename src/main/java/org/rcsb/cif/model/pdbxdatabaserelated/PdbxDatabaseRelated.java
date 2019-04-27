package org.rcsb.cif.model.pdbxdatabaserelated;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

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
     * @return DbName
     */
    public DbName getDbName() {
        return (DbName) (isText ? textFields.computeIfAbsent("db_name",
                DbName::new) : getBinaryColumn("db_name"));
    }

    /**
     * A description of the related entry.
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
    }

    /**
     * The identifying code in the related database.
     * @return DbId
     */
    public DbId getDbId() {
        return (DbId) (isText ? textFields.computeIfAbsent("db_id",
                DbId::new) : getBinaryColumn("db_id"));
    }

    /**
     * The identifying content type of the related entry.
     * @return ContentType
     */
    public ContentType getContentType() {
        return (ContentType) (isText ? textFields.computeIfAbsent("content_type",
                ContentType::new) : getBinaryColumn("content_type"));
    }
}
