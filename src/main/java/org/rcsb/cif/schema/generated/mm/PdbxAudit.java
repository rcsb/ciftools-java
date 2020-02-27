package org.rcsb.cif.schema.generated.mm;

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
