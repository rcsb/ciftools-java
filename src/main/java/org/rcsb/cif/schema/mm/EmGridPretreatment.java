package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items describing glow discharge pretreatment for an EM grid
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class EmGridPretreatment extends DelegatingCategory {
    public EmGridPretreatment(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "atmosphere":
                return getAtmosphere();
            case "id":
                return getId();
            case "pressure":
                return getPressure();
            case "sample_support_id":
                return getSampleSupportId();
            case "time":
                return getTime();
            case "type":
                return getType();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The atmosphere used for glow discharge of the em grid.
     * @return StrColumn
     */
    public StrColumn getAtmosphere() {
        return delegate.getColumn("atmosphere", DelegatingStrColumn::new);
    }

    /**
     * PRIMARY KEY
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * Pressure of the glow discharge chamber, in pascals
     * @return FloatColumn
     */
    public FloatColumn getPressure() {
        return delegate.getColumn("pressure", DelegatingFloatColumn::new);
    }

    /**
     * Pointer to EM SAMPLE SUPPORT
     * @return StrColumn
     */
    public StrColumn getSampleSupportId() {
        return delegate.getColumn("sample_support_id", DelegatingStrColumn::new);
    }

    /**
     * Time period for glow discharge of the em grid, in seconds
     * @return IntColumn
     */
    public IntColumn getTime() {
        return delegate.getColumn("time", DelegatingIntColumn::new);
    }

    /**
     * Type of grid pretreatment
     * @return StrColumn
     */
    public StrColumn getType() {
        return delegate.getColumn("type", DelegatingStrColumn::new);
    }

}