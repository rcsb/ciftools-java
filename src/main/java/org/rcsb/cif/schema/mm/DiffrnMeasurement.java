package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the DIFFRN_MEASUREMENT category record details
 * about the device used to orient and/or position the crystal
 * during data measurement and the manner in which the diffraction
 * data were measured.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class DiffrnMeasurement extends DelegatingCategory {
    public DiffrnMeasurement(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "diffrn_id":
                return getDiffrnId();
            case "details":
                return getDetails();
            case "device":
                return getDevice();
            case "device_details":
                return getDeviceDetails();
            case "device_type":
                return getDeviceType();
            case "method":
                return getMethod();
            case "specimen_support":
                return getSpecimenSupport();
            case "pdbx_date":
                return getPdbxDate();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * This data item is a pointer to _diffrn.id in the DIFFRN
     * category.
     * @return StrColumn
     */
    public StrColumn getDiffrnId() {
        return delegate.getColumn("diffrn_id", DelegatingStrColumn::new);
    }

    /**
     * A description of special aspects of the intensity measurement.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

    /**
     * The general class of  goniometer or device used to support and
     * orient the specimen.
     * @return StrColumn
     */
    public StrColumn getDevice() {
        return delegate.getColumn("device", DelegatingStrColumn::new);
    }

    /**
     * A description of special aspects of the device used to measure
     * the diffraction intensities.
     * @return StrColumn
     */
    public StrColumn getDeviceDetails() {
        return delegate.getColumn("device_details", DelegatingStrColumn::new);
    }

    /**
     * The make, model or name of the measurement device
     * (goniometer) used.
     * @return StrColumn
     */
    public StrColumn getDeviceType() {
        return delegate.getColumn("device_type", DelegatingStrColumn::new);
    }

    /**
     * Method used to measure intensities.
     * @return StrColumn
     */
    public StrColumn getMethod() {
        return delegate.getColumn("method", DelegatingStrColumn::new);
    }

    /**
     * The physical device used to support the crystal during data
     * collection.
     * @return StrColumn
     */
    public StrColumn getSpecimenSupport() {
        return delegate.getColumn("specimen_support", DelegatingStrColumn::new);
    }

    /**
     * The date of data measurement
     * @return StrColumn
     */
    public StrColumn getPdbxDate() {
        return delegate.getColumn("pdbx_date", DelegatingStrColumn::new);
    }

}