package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the pdbx_deposit_group category provide identifiers
 * and related information for groups of entries deposited in a collection.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxDepositGroup extends DelegatingCategory {
    public PdbxDepositGroup(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "group_id":
                return getGroupId();
            case "group_title":
                return getGroupTitle();
            case "group_description":
                return getGroupDescription();
            case "group_type":
                return getGroupType();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * A unique identifier for a group of entries deposited as a collection.
     * @return StrColumn
     */
    public StrColumn getGroupId() {
        return delegate.getColumn("group_id", DelegatingStrColumn::new);
    }

    /**
     * A title to describe the group of entries deposited in the collection.
     * @return StrColumn
     */
    public StrColumn getGroupTitle() {
        return delegate.getColumn("group_title", DelegatingStrColumn::new);
    }

    /**
     * A description of the contents of entries in the collection.
     * @return StrColumn
     */
    public StrColumn getGroupDescription() {
        return delegate.getColumn("group_description", DelegatingStrColumn::new);
    }

    /**
     * Text to describe a grouping of entries in multiple collections
     * @return StrColumn
     */
    public StrColumn getGroupType() {
        return delegate.getColumn("group_type", DelegatingStrColumn::new);
    }

}