package org.rcsb.cif.schema.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * The CATEGORY of data items which specify the details of the
 * diffraction measurement.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class DiffrnMeasurement extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "diffrn_measurement";

    public DiffrnMeasurement(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
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
     * Mounting method for the crystal specimum during data collection.
     * @return StrColumn
     */
    public StrColumn getSpecimenSupport() {
        return new DelegatingStrColumn(parentBlock.getColumn("diffrn_measurement_specimen_support"));
    }

}