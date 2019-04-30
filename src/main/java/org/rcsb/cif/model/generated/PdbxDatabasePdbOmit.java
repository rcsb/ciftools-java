package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * 
 * Data items in the PDBX_DATABASE_PDB_OMIT category record
 * list PDB record names that should be omitted in the PDB
 * format file.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class PdbxDatabasePdbOmit extends BaseCategory {
    public PdbxDatabasePdbOmit(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxDatabasePdbOmit(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxDatabasePdbOmit(String name) {
        super(name);
    }

    /**
     * The value of _pdbx_database_pdb_omit.entry_id identifies the data block.
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entry_id", StrColumn::new) :
                getBinaryColumn("entry_id"));
    }

    /**
     * PDB record or REMARK name to be omitted.
     * @return StrColumn
     */
    public StrColumn getRecordName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("record_name", StrColumn::new) :
                getBinaryColumn("record_name"));
    }
}
