package org.rcsb.cif.model.generated.pdbxaudit;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxAudit extends BaseCategory {
    public PdbxAudit(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxAudit(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxAudit(String name) {
        super(name);
    }

    /**
     * The value of _pdbx_audit.entry_id identifies the data block.
     * @return EntryId
     */
    public EntryId getEntryId() {
        return (EntryId) (isText ? textFields.computeIfAbsent("entry_id",
                EntryId::new) : getBinaryColumn("entry_id"));
    }

    /**
     * The value of _pdbx_audit.entry_id identifies the data block.
     * @return CurrentVersion
     */
    public CurrentVersion getCurrentVersion() {
        return (CurrentVersion) (isText ? textFields.computeIfAbsent("current_version",
                CurrentVersion::new) : getBinaryColumn("current_version"));
    }
}
