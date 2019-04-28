package org.rcsb.cif.model.generated.databasepdbrevrecord;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class DatabasePDBRevRecord extends BaseCategory {
    public DatabasePDBRevRecord(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public DatabasePDBRevRecord(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public DatabasePDBRevRecord(String name) {
        super(name);
    }

    /**
     * A description of special aspects of the revision of records in
     * this PDB entry.
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
    }

    /**
     * This data item is a pointer to _database_PDB_rev.num in the
     * DATABASE_PDB_REV category.
     * @return RevNum
     */
    public RevNum getRevNum() {
        return (RevNum) (isText ? textFields.computeIfAbsent("rev_num",
                RevNum::new) : getBinaryColumn("rev_num"));
    }

    /**
     * The types of records that were changed in this revision to a
     * PDB entry.
     * @return Type
     */
    public Type getType() {
        return (Type) (isText ? textFields.computeIfAbsent("type",
                Type::new) : getBinaryColumn("type"));
    }
}
