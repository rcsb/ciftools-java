package org.rcsb.cif.model.generated.pdbxdatabasepdbomit;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
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
     * @return EntryId
     */
    public EntryId getEntryId() {
        return (EntryId) (isText ? textFields.computeIfAbsent("entry_id",
                EntryId::new) : getBinaryColumn("entry_id"));
    }

    /**
     * PDB record or REMARK name to be omitted.
     * @return RecordName
     */
    public RecordName getRecordName() {
        return (RecordName) (isText ? textFields.computeIfAbsent("record_name",
                RecordName::new) : getBinaryColumn("record_name"));
    }
}
