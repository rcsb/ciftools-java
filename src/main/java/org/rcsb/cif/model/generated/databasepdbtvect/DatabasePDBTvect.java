package org.rcsb.cif.model.generated.databasepdbtvect;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class DatabasePDBTvect extends BaseCategory {
    public DatabasePDBTvect(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public DatabasePDBTvect(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public DatabasePDBTvect(String name) {
        super(name);
    }

    /**
     * A description of special aspects of this TVECT.
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
    }

    /**
     * The value of _database_PDB_tvect.id must uniquely identify a
     * record in the DATABASE_PDB_TVECT list.
     * 
     * Note that this item need not be a number; it can be any unique
     * identifier.
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }

    /**
     * The elements of the PDB TVECT vector.
     * @return Vector1
     */
    public Vector1 getVector1() {
        return (Vector1) (isText ? textFields.computeIfAbsent("vector[1]",
                Vector1::new) : getBinaryColumn("vector[1]"));
    }

    /**
     * The elements of the PDB TVECT vector.
     * @return Vector2
     */
    public Vector2 getVector2() {
        return (Vector2) (isText ? textFields.computeIfAbsent("vector[2]",
                Vector2::new) : getBinaryColumn("vector[2]"));
    }

    /**
     * The elements of the PDB TVECT vector.
     * @return Vector3
     */
    public Vector3 getVector3() {
        return (Vector3) (isText ? textFields.computeIfAbsent("vector[3]",
                Vector3::new) : getBinaryColumn("vector[3]"));
    }
}
