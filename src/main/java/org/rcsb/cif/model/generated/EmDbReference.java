package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Category holds links to raw data sources for the entry, e.g.,
 * held by a remote server.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class EmDbReference extends BaseCategory {
    public EmDbReference(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public EmDbReference(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public EmDbReference(String name) {
        super(name);
    }

    /**
     * Unique identifier for a provided link.
     * @return StrColumn
     */
    public StrColumn getAccessCode() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("access_code", StrColumn::new) :
                getBinaryColumn("access_code"));
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
     * The name of the database containing the related entry.
     * @return StrColumn
     */
    public StrColumn getId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("id", StrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * Indicates relationship of this entry with other entries in PDB and EMDB.
     * @return StrColumn
     */
    public StrColumn getRelationship() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("relationship", StrColumn::new) :
                getBinaryColumn("relationship"));
    }
}
