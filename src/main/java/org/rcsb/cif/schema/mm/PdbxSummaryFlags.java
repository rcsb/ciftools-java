package org.rcsb.cif.schema.mm;

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

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "entry_id":
                return getEntryId();
            case "flag_id":
                return getFlagId();
            case "flag_value":
                return getFlagValue();
            default:
                return new DelegatingColumn(column);
        }
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