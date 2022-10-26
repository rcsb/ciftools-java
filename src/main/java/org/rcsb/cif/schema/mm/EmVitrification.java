package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the EM_VITRIFICATION category
 * record details about the method and cryogen used in
 * rapid freezing of the sample on the grid prior to its
 * insertion in the electron microscope
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class EmVitrification extends DelegatingCategory {
    public EmVitrification(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "entry_id":
                return getEntryId();
            case "id":
                return getId();
            case "sample_preparation_id":
                return getSamplePreparationId();
            case "specimen_id":
                return getSpecimenId();
            case "cryogen_name":
                return getCryogenName();
            case "humidity":
                return getHumidity();
            case "temp":
                return getTemp();
            case "chamber_temperature":
                return getChamberTemperature();
            case "instrument":
                return getInstrument();
            case "method":
                return getMethod();
            case "time_resolved_state":
                return getTimeResolvedState();
            case "citation_id":
                return getCitationId();
            case "details":
                return getDetails();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * This data item is a pointer to _entry.id in the ENTRY category.
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return delegate.getColumn("entry_id", DelegatingStrColumn::new);
    }

    /**
     * PRIMARY KEY
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * This data item is a pointer to _em_sample_preparation.id in the
     * EM_SAMPLE_PREPARATION category.
     * @return StrColumn
     */
    public StrColumn getSamplePreparationId() {
        return delegate.getColumn("sample_preparation_id", DelegatingStrColumn::new);
    }

    /**
     * This data item is a pointer to _em_specimen.id
     * @return StrColumn
     */
    public StrColumn getSpecimenId() {
        return delegate.getColumn("specimen_id", DelegatingStrColumn::new);
    }

    /**
     * This is the name of the cryogen.
     * @return StrColumn
     */
    public StrColumn getCryogenName() {
        return delegate.getColumn("cryogen_name", DelegatingStrColumn::new);
    }

    /**
     * Relative humidity (%) of air surrounding the specimen just prior to
     * vitrification.
     * @return FloatColumn
     */
    public FloatColumn getHumidity() {
        return delegate.getColumn("humidity", DelegatingFloatColumn::new);
    }

    /**
     * The vitrification temperature (in kelvin), e.g.,
     * temperature of the plunge instrument cryogen bath.
     * @return FloatColumn
     */
    public FloatColumn getTemp() {
        return delegate.getColumn("temp", DelegatingFloatColumn::new);
    }

    /**
     * The temperature (in kelvin) of the sample just prior to vitrification.
     * @return FloatColumn
     */
    public FloatColumn getChamberTemperature() {
        return delegate.getColumn("chamber_temperature", DelegatingFloatColumn::new);
    }

    /**
     * The type of instrument used in the vitrification process.
     * @return StrColumn
     */
    public StrColumn getInstrument() {
        return delegate.getColumn("instrument", DelegatingStrColumn::new);
    }

    /**
     * The procedure for vitrification.
     * @return StrColumn
     */
    public StrColumn getMethod() {
        return delegate.getColumn("method", DelegatingStrColumn::new);
    }

    /**
     * The length of time after an event effecting the sample that
     * vitrification was induced and a description of the event.
     * @return StrColumn
     */
    public StrColumn getTimeResolvedState() {
        return delegate.getColumn("time_resolved_state", DelegatingStrColumn::new);
    }

    /**
     * This data item is a pointer to _citation.id in the
     * CITATION category.
     * @return StrColumn
     */
    public StrColumn getCitationId() {
        return delegate.getColumn("citation_id", DelegatingStrColumn::new);
    }

    /**
     * Any additional details relating to vitrification.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

}