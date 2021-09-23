package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the MA_DATA_GROUP category describes the
 * collection of data into groups so that they can be used
 * efficiently in the MA_PROTOCOL_STEP category.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class MaDataGroup extends DelegatingCategory {
    public MaDataGroup(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "ordinal_id":
                return getOrdinalId();
            case "group_id":
                return getGroupId();
            case "data_id":
                return getDataId();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * A unique identifier for a group of data.
     * @return IntColumn
     */
    public IntColumn getOrdinalId() {
        return delegate.getColumn("ordinal_id", DelegatingIntColumn::new);
    }

    /**
     * An identifier for the group entry.
     * If data does not need to be grouped, then _ma_data_group.group_id
     * is the same as _ma_data_group.data_id.
     * @return IntColumn
     */
    public IntColumn getGroupId() {
        return delegate.getColumn("group_id", DelegatingIntColumn::new);
    }

    /**
     * The identifier for the data.
     * This data item is a pointer to _ma_data.id
     * in the MA_DATA category.
     * @return IntColumn
     */
    public IntColumn getDataId() {
        return delegate.getColumn("data_id", DelegatingIntColumn::new);
    }

}