package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the MA_SOFTWARE_GROUP category describes the
 * collection of software into groups so that they can be used
 * efficiently in the MA_PROTOCOL_STEP category.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class MaSoftwareGroup extends DelegatingCategory {
    public MaSoftwareGroup(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "ordinal_id":
                return getOrdinalId();
            case "group_id":
                return getGroupId();
            case "software_id":
                return getSoftwareId();
            case "parameter_group_id":
                return getParameterGroupId();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * A unique identifier for the category.
     * @return IntColumn
     */
    public IntColumn getOrdinalId() {
        return delegate.getColumn("ordinal_id", DelegatingIntColumn::new);
    }

    /**
     * An identifier for the group entry.
     * If data does not need to be grouped, then _ma_software_group.group_id
     * is the same as _ma_software_group.software_id.
     * @return IntColumn
     */
    public IntColumn getGroupId() {
        return delegate.getColumn("group_id", DelegatingIntColumn::new);
    }

    /**
     * The identifier for the software.
     * This data item is a pointer to _software.pdbx_ordinal
     * in the SOFTWARE category.
     * @return IntColumn
     */
    public IntColumn getSoftwareId() {
        return delegate.getColumn("software_id", DelegatingIntColumn::new);
    }

    /**
     * An identifier for the set of parameters input to the software,
     * as applied to the software group.
     * This data item is a pointer to _ma_software_parameter.group_id in the
     * MA_SOFTWARE_PARAMETER category.
     * @return IntColumn
     */
    public IntColumn getParameterGroupId() {
        return delegate.getColumn("parameter_group_id", DelegatingIntColumn::new);
    }

}