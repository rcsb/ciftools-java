package org.rcsb.cif.schema.generated.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_AUDIT_revision_group category
 * report the content groups associated with a PDBX_AUDIT_REVISION_HISTORY
 * record.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxAuditRevisionGroup extends DelegatingCategory {
    public PdbxAuditRevisionGroup(Category delegate) {
        super(delegate);
    }

    /**
     * A unique identifier for the pdbx_audit_revision_group record.
     * @return IntColumn
     */
    public IntColumn getOrdinal() {
        return delegate.getColumn("ordinal", DelegatingIntColumn::new);
    }

    /**
     * A pointer to  _pdbx_audit_revision_history.ordinal
     * @return IntColumn
     */
    public IntColumn getRevisionOrdinal() {
        return delegate.getColumn("revision_ordinal", DelegatingIntColumn::new);
    }

    /**
     * The type of file that the pdbx_audit_revision_history record refers to.
     * @return StrColumn
     */
    public StrColumn getDataContentType() {
        return delegate.getColumn("data_content_type", DelegatingStrColumn::new);
    }

    /**
     * The collection of categories updated with this revision.
     * @return StrColumn
     */
    public StrColumn getGroup() {
        return delegate.getColumn("group", DelegatingStrColumn::new);
    }
}
