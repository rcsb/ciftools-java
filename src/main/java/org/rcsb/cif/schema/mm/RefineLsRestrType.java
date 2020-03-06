package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the REFINE_LS_RESTR_TYPE category record details
 * about the restraint types used in the least-squares refinement.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class RefineLsRestrType extends DelegatingCategory {
    public RefineLsRestrType(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "distance_cutoff_high":
                return getDistanceCutoffHigh();
            case "distance_cutoff_low":
                return getDistanceCutoffLow();
            case "type":
                return getType();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The upper limit in angstroms of the distance range applied to
     * the current restraint type.
     * @return FloatColumn
     */
    public FloatColumn getDistanceCutoffHigh() {
        return delegate.getColumn("distance_cutoff_high", DelegatingFloatColumn::new);
    }

    /**
     * The lower limit in angstroms of the distance range applied to
     * the current restraint type.
     * @return FloatColumn
     */
    public FloatColumn getDistanceCutoffLow() {
        return delegate.getColumn("distance_cutoff_low", DelegatingFloatColumn::new);
    }

    /**
     * This data item is a pointer to _refine_ls_restr.type in the
     * REFINE_LS_RESTR category.
     * @return StrColumn
     */
    public StrColumn getType() {
        return delegate.getColumn("type", DelegatingStrColumn::new);
    }

}