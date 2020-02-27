package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * The PDBX_AUDIT holds current version information.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entry_id", StrColumn::new) :
                getBinaryColumn("entry_id"));
    }

    /**
     * The value of _pdbx_audit.entry_id identifies the data block.
     * @return StrColumn
     */
    public StrColumn getCurrentVersion() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("current_version", StrColumn::new) :
                getBinaryColumn("current_version"));
    }
}
