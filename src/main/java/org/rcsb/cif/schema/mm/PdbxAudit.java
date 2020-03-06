package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * The PDBX_AUDIT holds current version information.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxAudit extends DelegatingCategory {
    public PdbxAudit(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "entry_id":
                return getEntryId();
            case "current_version":
                return getCurrentVersion();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The value of _pdbx_audit.entry_id identifies the data block.
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return delegate.getColumn("entry_id", DelegatingStrColumn::new);
    }

    /**
     * The value of _pdbx_audit.entry_id identifies the data block.
     * @return StrColumn
     */
    public StrColumn getCurrentVersion() {
        return delegate.getColumn("current_version", DelegatingStrColumn::new);
    }

}