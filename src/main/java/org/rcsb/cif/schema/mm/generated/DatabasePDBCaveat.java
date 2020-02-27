package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the DATABASE_PDB_CAVEAT category record details
 * about features of the data block flagged as 'caveats' by the
 * Protein Data Bank (PDB).
 * 
 * These data items are included only for consistency with PDB
 * format files. They should appear in a data block only if that
 * data block was created by reformatting a PDB format file.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class DatabasePDBCaveat extends BaseCategory {
    public DatabasePDBCaveat(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public DatabasePDBCaveat(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public DatabasePDBCaveat(String name) {
        super(name);
    }

    /**
     * A unique identifier for the PDB caveat record.
     * @return IntColumn
     */
    public IntColumn getId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("id", IntColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * The full text of the PDB caveat record.
     * @return StrColumn
     */
    public StrColumn getText() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("text", StrColumn::new) :
                getBinaryColumn("text"));
    }
}
