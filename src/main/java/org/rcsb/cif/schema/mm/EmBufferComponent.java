package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Buffer category
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class EmBufferComponent extends DelegatingCategory {
    public EmBufferComponent(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "buffer_id":
                return getBufferId();
            case "concentration":
                return getConcentration();
            case "concentration_units":
                return getConcentrationUnits();
            case "formula":
                return getFormula();
            case "id":
                return getId();
            case "name":
                return getName();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * Foreign key to the entry category.
     * @return StrColumn
     */
    public StrColumn getBufferId() {
        return delegate.getColumn("buffer_id", DelegatingStrColumn::new);
    }

    /**
     * The concentration of the sample (arbitrary units).
     * @return FloatColumn
     */
    public FloatColumn getConcentration() {
        return delegate.getColumn("concentration", DelegatingFloatColumn::new);
    }

    /**
     * Units for the sample concentration value.
     * @return StrColumn
     */
    public StrColumn getConcentrationUnits() {
        return delegate.getColumn("concentration_units", DelegatingStrColumn::new);
    }

    /**
     * formula for buffer component
     * @return StrColumn
     */
    public StrColumn getFormula() {
        return delegate.getColumn("formula", DelegatingStrColumn::new);
    }

    /**
     * PRIMARY KEY
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * name of the buffer component
     * @return StrColumn
     */
    public StrColumn getName() {
        return delegate.getColumn("name", DelegatingStrColumn::new);
    }

}