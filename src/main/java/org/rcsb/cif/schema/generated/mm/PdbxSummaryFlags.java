package org.rcsb.cif.schema.generated.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Container category for a list of feature flags associated
 * with each structure entry.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxSummaryFlags extends DelegatingCategory {
    public PdbxSummaryFlags(Category delegate) {
        super(delegate);
    }

    /**
     * Entry ID.
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return delegate.getColumn("entry_id", DelegatingStrColumn::new);
    }

    /**
     * A feature flag name.
     * @return StrColumn
     */
    public StrColumn getFlagId() {
        return delegate.getColumn("flag_id", DelegatingStrColumn::new);
    }

    /**
     * A feature flag value
     * @return StrColumn
     */
    public StrColumn getFlagValue() {
        return delegate.getColumn("flag_value", DelegatingStrColumn::new);
    }
}
