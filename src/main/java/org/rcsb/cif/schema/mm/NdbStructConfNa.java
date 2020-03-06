package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the NDB_STRUCT_CONF_NA category
 * describes secondary structure features in this entry.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class NdbStructConfNa extends DelegatingCategory {
    public NdbStructConfNa(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "entry_id":
                return getEntryId();
            case "feature":
                return getFeature();
            case "feature_count":
                return getFeatureCount();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * This data item is a pointer to _entry.id in the
     * ENTRY category.
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return delegate.getColumn("entry_id", DelegatingStrColumn::new);
    }

    /**
     * This data item identifies a secondary structure
     * feature of this entry.
     * @return StrColumn
     */
    public StrColumn getFeature() {
        return delegate.getColumn("feature", DelegatingStrColumn::new);
    }

    /**
     * This data item counts the number of occurences of
     * this feature in this entry.
     * @return IntColumn
     */
    public IntColumn getFeatureCount() {
        return delegate.getColumn("feature_count", DelegatingIntColumn::new);
    }

}