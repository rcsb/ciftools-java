package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Description specimen preparation for imaging using tomography.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class EmTomographySpecimen extends DelegatingCategory {
    public EmTomographySpecimen(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "cryo_protectant":
                return getCryoProtectant();
            case "details":
                return getDetails();
            case "fiducial_markers":
                return getFiducialMarkers();
            case "high_pressure_freezing":
                return getHighPressureFreezing();
            case "id":
                return getId();
            case "sectioning":
                return getSectioning();
            case "specimen_id":
                return getSpecimenId();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The type of cryo-protectant used during specimen preparation.
     * @return StrColumn
     */
    public StrColumn getCryoProtectant() {
        return delegate.getColumn("cryo_protectant", DelegatingStrColumn::new);
    }

    /**
     * Any additional details about specimen preparation.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

    /**
     * 'YES' indicates that fiducial markers were used in the specimen preparation
     * @return StrColumn
     */
    public StrColumn getFiducialMarkers() {
        return delegate.getColumn("fiducial_markers", DelegatingStrColumn::new);
    }

    /**
     * 'YES' indicates that high pressure freezing was used in the specimen preparation
     * @return StrColumn
     */
    public StrColumn getHighPressureFreezing() {
        return delegate.getColumn("high_pressure_freezing", DelegatingStrColumn::new);
    }

    /**
     * PRIMARY KEY
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * The type of sectioning performed during specimen preparation.
     * @return StrColumn
     */
    public StrColumn getSectioning() {
        return delegate.getColumn("sectioning", DelegatingStrColumn::new);
    }

    /**
     * Foreign key relationship to the EM SPECIMEN category
     * @return StrColumn
     */
    public StrColumn getSpecimenId() {
        return delegate.getColumn("specimen_id", DelegatingStrColumn::new);
    }

}