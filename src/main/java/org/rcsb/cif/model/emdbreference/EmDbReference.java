package org.rcsb.cif.model.emdbreference;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
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
     * @return AccessCode
     */
    public AccessCode getAccessCode() {
        return (AccessCode) (isText ? textFields.computeIfAbsent("access_code",
                AccessCode::new) : getBinaryColumn("access_code"));
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
     * The name of the database containing the related entry.
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }

    /**
     * Indicates relationship of this entry with other entries in PDB and EMDB.
     * @return Relationship
     */
    public Relationship getRelationship() {
        return (Relationship) (isText ? textFields.computeIfAbsent("relationship",
                Relationship::new) : getBinaryColumn("relationship"));
    }
}
