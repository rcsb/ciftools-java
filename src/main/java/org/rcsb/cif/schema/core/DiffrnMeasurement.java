package org.rcsb.cif.schema.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * The category of data items used to describe the sample mounting,
 * positioning, and measurement strategy.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class DiffrnMeasurement extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "diffrn_measurement";

    public DiffrnMeasurement(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
    }

    /**
     * Yes or no flag indicating if the radiation beam illuminates the sample
     * at an angle that is rotated about a precession axis.
     * @return StrColumn
     */
    public StrColumn getMethodPrecession() {
        return new DelegatingStrColumn(parentBlock.getColumn("diffrn_measurement_method_precession"));
    }

    /**
     * Code describing the technique used to sample as completely as possible
     * the accessible range of reciprocal space.
     * @return StrColumn
     */
    public StrColumn getRotationMode() {
        return new DelegatingStrColumn(parentBlock.getColumn("diffrn_measurement_rotation_mode"));
    }

    /**
     * Yes or no flag indicating if a tracking method to follow the
     * crystal was used in the data acquisition. Typically used to track
     * very small crystals in electron diffraction experiments.
     * @return StrColumn
     */
    public StrColumn getSampleTracking() {
        return new DelegatingStrColumn(parentBlock.getColumn("diffrn_measurement_sample_tracking"));
    }

    /**
     * Description of the method used to follow the crystal during data collection.
     * @return StrColumn
     */
    public StrColumn getSampleTrackingMethod() {
        return new DelegatingStrColumn(parentBlock.getColumn("diffrn_measurement_sample_tracking_method"));
    }

    /**
     * The way in which the sample is attached to the sample holder,
     * including the type of adhesive material used if relevant. The sample
     * holder is usually wholly outside the beam, whereas the attachment
     * method may cause non-sample material to be illuminated. If the
     * attachment method is not included in the list below, 'other' should be
     * chosen and details provided in _diffrn_measurement.specimen_support.
     * @return StrColumn
     */
    public StrColumn getSpecimenAttachmentType() {
        return new DelegatingStrColumn(parentBlock.getColumn("diffrn_measurement_specimen_attachment_type"));
    }

    /**
     * Description of special aspects of the diffraction measurement.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return new DelegatingStrColumn(parentBlock.getColumn("diffrn_measurement_details"));
    }

    /**
     * Type of goniometer device used to mount and orient the specimen.
     * @return StrColumn
     */
    public StrColumn getDevice() {
        return new DelegatingStrColumn(parentBlock.getAliasedColumn("diffrn_measurement_device_class", "diffrn_measurement_device"));
    }

    /**
     * Type of goniometer device used to mount and orient the specimen.
     * @return StrColumn
     */
    public StrColumn getDeviceClass() {
        return new DelegatingStrColumn(parentBlock.getAliasedColumn("diffrn_measurement_device_class", "diffrn_measurement_device"));
    }

    /**
     * Details of the goniometer device used in the diffraction experiment.
     * @return StrColumn
     */
    public StrColumn getDeviceDetails() {
        return new DelegatingStrColumn(parentBlock.getColumn("diffrn_measurement_device_details"));
    }

    /**
     * The make, model or name of the goniometer device used.
     * @return StrColumn
     */
    public StrColumn getDeviceType() {
        return new DelegatingStrColumn(parentBlock.getAliasedColumn("diffrn_measurement_device_make", "diffrn_measurement_device_type"));
    }

    /**
     * The make, model or name of the goniometer device used.
     * @return StrColumn
     */
    public StrColumn getDeviceMake() {
        return new DelegatingStrColumn(parentBlock.getAliasedColumn("diffrn_measurement_device_make", "diffrn_measurement_device_type"));
    }

    /**
     * Description of scan method used to measure diffraction intensities.
     * @return StrColumn
     */
    public StrColumn getMethod() {
        return new DelegatingStrColumn(parentBlock.getColumn("diffrn_measurement_method"));
    }

    /**
     * Mounting method for the crystal specimen during data collection.
     * @return StrColumn
     */
    public StrColumn getSpecimenSupport() {
        return new DelegatingStrColumn(parentBlock.getColumn("diffrn_measurement_specimen_support"));
    }

}