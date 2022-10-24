package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Description of high pressure freezing
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class EmHighPressureFreezing extends DelegatingCategory {
    public EmHighPressureFreezing(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "details":
                return getDetails();
            case "em_tomography_specimen_id":
                return getEmTomographySpecimenId();
            case "id":
                return getId();
            case "instrument":
                return getInstrument();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * Additional details about high pressure freezing.
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
     * PRIMARY KEY
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * The instrument used for high pressure freezing.
     * @return StrColumn
     */
    public StrColumn getInstrument() {
        return delegate.getColumn("instrument", DelegatingStrColumn::new);
    }

}