package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the DATABASE_PDB_REV_RECORD category record
 * details about specific record types that were changed in a
 * given revision of a PDB entry.
 * 
 * These data items are assigned by the PDB database managers and
 * should only appear in a data block if they originate from that
 * source.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * This data item is a pointer to _database_PDB_rev.num in the
     * DATABASE_PDB_REV category.
     * @return IntColumn
     */
    public IntColumn getRevNum() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("rev_num", IntColumn::new) :
                getBinaryColumn("rev_num"));
    }

    /**
     * The types of records that were changed in this revision to a
     * PDB entry.
     * @return StrColumn
     */
    public StrColumn getType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("type", StrColumn::new) :
                getBinaryColumn("type"));
    }
}
