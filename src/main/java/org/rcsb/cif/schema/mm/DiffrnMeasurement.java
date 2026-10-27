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
            case "pdbx_angle_start":
                return getPdbxAngleStart();
            case "pdbx_angle_end":
                return getPdbxAngleEnd();
            case "pdbx_rotation_rate":
                return getPdbxRotationRate();
            case "pdbx_exposure_time_per_image":
                return getPdbxExposureTimePerImage();
            case "rotation_mode":
                return getRotationMode();
            case "method_precession":
                return getMethodPrecession();
            case "sample_tracking":
                return getSampleTracking();
            case "sample_tracking_method":
                return getSampleTrackingMethod();
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

    /**
     * The starting angle for crystal rotation.
     * @return FloatColumn
     */
    public FloatColumn getPdbxAngleStart() {
        return delegate.getColumn("pdbx_angle_start", DelegatingFloatColumn::new);
    }

    /**
     * The ending angle for crystal rotation.
     * @return FloatColumn
     */
    public FloatColumn getPdbxAngleEnd() {
        return delegate.getColumn("pdbx_angle_end", DelegatingFloatColumn::new);
    }

    /**
     * The speed of crystal rotation.
     * @return FloatColumn
     */
    public FloatColumn getPdbxRotationRate() {
        return delegate.getColumn("pdbx_rotation_rate", DelegatingFloatColumn::new);
    }

    /**
     * The exposure time per image for the crystal and
     * detector/camera.
     * @return FloatColumn
     */
    public FloatColumn getPdbxExposureTimePerImage() {
        return delegate.getColumn("pdbx_exposure_time_per_image", DelegatingFloatColumn::new);
    }

    /**
     * Originated from IUCr Electron Diffraction CIF
     * extension. Code describing the technique used to
     * sample as completely as possible the accessible range
     * of reciprocal space. Rotation mode indicates the
     * detector records diffracted intensities continuously
     * while the sample is rotated. Stepwise model indicates
     * the detector records diffracted intensities while the
     * sample is stationary.
     * @return StrColumn
     */
    public StrColumn getRotationMode() {
        return delegate.getColumn("rotation_mode", DelegatingStrColumn::new);
    }

    /**
     * Originated from IUCr Electron Diffraction CIF
     * extension. Flag indicating if the radiation beam
     * illuminates the sample at an angle that is rotated
     * about a precession axis.
     * @return StrColumn
     */
    public StrColumn getMethodPrecession() {
        return delegate.getColumn("method_precession", DelegatingStrColumn::new);
    }

    /**
     * Originated from IUCr Electron Diffraction CIF
     * extension. Flag indicating if a tracking method to
     * follow the crystal was used in the data
     * acquisition. Typically used to track very small
     * crystals in electron diffraction experiments.
     * @return StrColumn
     */
    public StrColumn getSampleTracking() {
        return delegate.getColumn("sample_tracking", DelegatingStrColumn::new);
    }

    /**
     * Originated from IUCr Electron Diffraction CIF
     * extension. Description of the method used to follow
     * the crystal during data collection.
     * @return StrColumn
     */
    public StrColumn getSampleTrackingMethod() {
        return delegate.getColumn("sample_tracking_method", DelegatingStrColumn::new);
    }

}