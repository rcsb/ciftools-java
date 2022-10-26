package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Description of sectioning by focused_ion_beam
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class EmFocusedIonBeam extends DelegatingCategory {
    public EmFocusedIonBeam(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "current":
                return getCurrent();
            case "details":
                return getDetails();
            case "dose_rate":
                return getDoseRate();
            case "duration":
                return getDuration();
            case "em_tomography_specimen_id":
                return getEmTomographySpecimenId();
            case "final_thickness":
                return getFinalThickness();
            case "id":
                return getId();
            case "initial_thickness":
                return getInitialThickness();
            case "instrument":
                return getInstrument();
            case "ion":
                return getIon();
            case "temperature":
                return getTemperature();
            case "voltage":
                return getVoltage();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * Current of the ion beam, in nanoamperes (nA)
     * @return FloatColumn
     */
    public FloatColumn getCurrent() {
        return delegate.getColumn("current", DelegatingFloatColumn::new);
    }

    /**
     * Additional details about FIB milling
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

    /**
     * ions per sq centimetre per second
     * @return IntColumn
     */
    public IntColumn getDoseRate() {
        return delegate.getColumn("dose_rate", DelegatingIntColumn::new);
    }

    /**
     * Milling time in seconds
     * @return FloatColumn
     */
    public FloatColumn getDuration() {
        return delegate.getColumn("duration", DelegatingFloatColumn::new);
    }

    /**
     * Foreign key relationship to the EM TOMOGRAPHY SPECIMEN category
     * @return StrColumn
     */
    public StrColumn getEmTomographySpecimenId() {
        return delegate.getColumn("em_tomography_specimen_id", DelegatingStrColumn::new);
    }

    /**
     * Final sample thickness
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
     * Initial sample thickness
     * @return IntColumn
     */
    public IntColumn getInitialThickness() {
        return delegate.getColumn("initial_thickness", DelegatingIntColumn::new);
    }

    /**
     * The instrument used for focused ion beam sectioning
     * @return StrColumn
     */
    public StrColumn getInstrument() {
        return delegate.getColumn("instrument", DelegatingStrColumn::new);
    }

    /**
     * The ion source used to ablate the specimen
     * @return StrColumn
     */
    public StrColumn getIon() {
        return delegate.getColumn("ion", DelegatingStrColumn::new);
    }

    /**
     * Temperature of the sample during milling, in kelvins
     * @return IntColumn
     */
    public IntColumn getTemperature() {
        return delegate.getColumn("temperature", DelegatingIntColumn::new);
    }

    /**
     * Voltage applied to the ion source, in kilovolts
     * @return IntColumn
     */
    public IntColumn getVoltage() {
        return delegate.getColumn("voltage", DelegatingIntColumn::new);
    }

}