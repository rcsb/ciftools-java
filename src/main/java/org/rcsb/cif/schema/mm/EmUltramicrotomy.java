package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Description of sectioning by ultramicrotomy
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class EmUltramicrotomy extends DelegatingCategory {
    public EmUltramicrotomy(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "details":
                return getDetails();
            case "em_tomography_specimen_id":
                return getEmTomographySpecimenId();
            case "final_thickness":
                return getFinalThickness();
            case "id":
                return getId();
            case "instrument":
                return getInstrument();
            case "temperature":
                return getTemperature();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * Additional details about the ultramicrotomy sample preparation
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

    /**
     * Foreign key relationship to the EM TOMOGRAPHY SPECIMEN category
     * @return StrColumn
     */
    public StrColumn getEmTomographySpecimenId() {
        return delegate.getColumn("em_tomography_specimen_id", DelegatingStrColumn::new);
    }

    /**
     * Final thickness of the sectioned sample, in nanometers
     * @return IntColumn
     */
    public IntColumn getFinalThickness() {
        return delegate.getColumn("final_thickness", DelegatingIntColumn::new);
    }

    /**
     * PRIMARY KEY
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * Ultramicrotome instrument used for sectioning
     * @return StrColumn
     */
    public StrColumn getInstrument() {
        return delegate.getColumn("instrument", DelegatingStrColumn::new);
    }

    /**
     * Temperature of the sample during microtome sectioning, in kelvins
     * @return IntColumn
     */
    public IntColumn getTemperature() {
        return delegate.getColumn("temperature", DelegatingIntColumn::new);
    }

}