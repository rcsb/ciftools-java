package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the MA_RESTRAINTS_GROUP category captures the
 * details of groups of restraints used in the modeling.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class MaRestraintsGroup extends DelegatingCategory {
    public MaRestraintsGroup(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "ordinal_id":
                return getOrdinalId();
            case "group_id":
                return getGroupId();
            case "restraint_id":
                return getRestraintId();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * A unique identifier for a group of restraints.
     * @return IntColumn
     */
    public IntColumn getOrdinalId() {
        return delegate.getColumn("ordinal_id", DelegatingIntColumn::new);
    }

    /**
     * An identifier for the group entry.
     * @return IntColumn
     */
    public IntColumn getGroupId() {
        return delegate.getColumn("group_id", DelegatingIntColumn::new);
    }

    /**
     * The identifier for the set of restraints.
     * This data item is a pointer to _ma_restraints.restraint_id
     * in the MA_RESTRAINTS category.
     * @return IntColumn
     */
    public IntColumn getRestraintId() {
        return delegate.getColumn("restraint_id", DelegatingIntColumn::new);
    }

}