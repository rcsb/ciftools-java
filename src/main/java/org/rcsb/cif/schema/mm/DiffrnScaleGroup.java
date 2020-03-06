package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the DIFFRN_SCALE_GROUP category record details
 * of the scaling factors applied to place all intensities in the
 * reflection lists on a common scale.
 * Scaling groups might, for example, correspond to each film in a
 * multi-film data set or each crystal in a multi-crystal data set.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class DiffrnScaleGroup extends DelegatingCategory {
    public DiffrnScaleGroup(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "code":
                return getCode();
            case "I_net":
                return getINet();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The value of _diffrn_scale_group.code must uniquely identify a
     * record in the DIFFRN_SCALE_GROUP list.
     * 
     * Note that this item need not be a number; it can be any unique
     * identifier.
     * @return StrColumn
     */
    public StrColumn getCode() {
        return delegate.getColumn("code", DelegatingStrColumn::new);
    }

    /**
     * The scale for a specific measurement group which is to be
     * multiplied with the net intensity to place all intensities
     * in the DIFFRN_REFLN or REFLN list on a common scale.
     * @return FloatColumn
     */
    public FloatColumn getINet() {
        return delegate.getColumn("I_net", DelegatingFloatColumn::new);
    }

}