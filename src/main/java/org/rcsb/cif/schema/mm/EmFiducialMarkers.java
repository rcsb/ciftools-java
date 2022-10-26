package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Description of fiducial markers.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class EmFiducialMarkers extends DelegatingCategory {
    public EmFiducialMarkers(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "diameter":
                return getDiameter();
            case "em_tomography_specimen_id":
                return getEmTomographySpecimenId();
            case "id":
                return getId();
            case "manufacturer":
                return getManufacturer();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * Diameter of the fiducial markers
     * @return FloatColumn
     */
    public FloatColumn getDiameter() {
        return delegate.getColumn("diameter", DelegatingFloatColumn::new);
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
     * Manufacturer source for the fiducial markers
     * @return StrColumn
     */
    public StrColumn getManufacturer() {
        return delegate.getColumn("manufacturer", DelegatingStrColumn::new);
    }

}