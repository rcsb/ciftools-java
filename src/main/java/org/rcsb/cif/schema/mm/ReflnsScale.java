package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the REFLNS_SCALE category record details about
 * the structure-factor scales. They are referenced from within
 * the REFLN list through _refln.scale_group_code.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class ReflnsScale extends DelegatingCategory {
    public ReflnsScale(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "group_code":
                return getGroupCode();
            case "meas_F":
                return getMeasF();
            case "meas_F_squared":
                return getMeasFSquared();
            case "meas_intensity":
                return getMeasIntensity();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The code identifying a scale _reflns_scale.meas_F,
     * _reflns_scale.meas_F_squared or _reflns_scale.meas_intensity.
     * These are linked to the REFLN list by the
     * _refln.scale_group_code. These codes
     * need not correspond to those in the DIFFRN_SCALE list.
     * @return StrColumn
     */
    public StrColumn getGroupCode() {
        return delegate.getColumn("group_code", DelegatingStrColumn::new);
    }

    /**
     * A scale associated with _reflns_scale.group_code.
     * @return FloatColumn
     */
    public FloatColumn getMeasF() {
        return delegate.getColumn("meas_F", DelegatingFloatColumn::new);
    }

    /**
     * A scale associated with _reflns_scale.group_code.
     * @return FloatColumn
     */
    public FloatColumn getMeasFSquared() {
        return delegate.getColumn("meas_F_squared", DelegatingFloatColumn::new);
    }

    /**
     * A scale associated with _reflns_scale.group_code.
     * @return FloatColumn
     */
    public FloatColumn getMeasIntensity() {
        return delegate.getColumn("meas_intensity", DelegatingFloatColumn::new);
    }

}