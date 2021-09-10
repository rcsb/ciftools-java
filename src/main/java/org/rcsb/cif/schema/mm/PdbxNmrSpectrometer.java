package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * The details about each spectrometer used to collect data for this
 * deposition.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxNmrSpectrometer extends DelegatingCategory {
    public PdbxNmrSpectrometer(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "spectrometer_id":
                return getSpectrometerId();
            case "model":
                return getModel();
            case "type":
                return getType();
            case "manufacturer":
                return getManufacturer();
            case "field_strength":
                return getFieldStrength();
            case "details":
                return getDetails();
            case "name":
                return getName();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * Assign a numerical ID to each instrument.
     * @return StrColumn
     */
    public StrColumn getSpectrometerId() {
        return delegate.getColumn("spectrometer_id", DelegatingStrColumn::new);
    }

    /**
     * The model of the NMR spectrometer.
     * @return StrColumn
     */
    public StrColumn getModel() {
        return delegate.getColumn("model", DelegatingStrColumn::new);
    }

    /**
     * Select the instrument manufacturer(s) and the model(s) of the NMR(s)
     * used for this work.
     * @return StrColumn
     */
    public StrColumn getType() {
        return delegate.getColumn("type", DelegatingStrColumn::new);
    }

    /**
     * The name of the manufacturer of the spectrometer.
     * @return StrColumn
     */
    public StrColumn getManufacturer() {
        return delegate.getColumn("manufacturer", DelegatingStrColumn::new);
    }

    /**
     * The field strength in MHz of the spectrometer
     * @return FloatColumn
     */
    public FloatColumn getFieldStrength() {
        return delegate.getColumn("field_strength", DelegatingFloatColumn::new);
    }

    /**
     * A text description of the NMR spectrometer.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

    /**
     * A label that uniquely identifies the NMR spectrometer from other spectrometers
     * listed in the entry.
     * @return StrColumn
     */
    public StrColumn getName() {
        return delegate.getColumn("name", DelegatingStrColumn::new);
    }

}