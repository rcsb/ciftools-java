package org.rcsb.cif.schema.generated.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * 
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
     * 
     * Description of special aspects of the diffraction measurement.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_details"));
    }

    /**
     * 
     * Type of goniometer device used to mount and orient the specimen.
     * @return StrColumn
     */
    public StrColumn getDeviceClass() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_device_class"));
    }

    /**
     * 
     * Details of the goniometer device used in the diffraction experiment.
     * @return StrColumn
     */
    public StrColumn getDeviceDetails() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_device_details"));
    }

    /**
     * 
     * The make, model or name of the goniometer device used.
     * @return StrColumn
     */
    public StrColumn getDeviceMake() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_device_make"));
    }

    /**
     * 
     * Description of scan method used to measure diffraction intensities.
     * @return StrColumn
     */
    public StrColumn getMethod() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_method"));
    }

    /**
     * 
     * Mounting method for the crystal specimum during data collection.
     * @return StrColumn
     */
    public StrColumn getSpecimenSupport() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_specimen_support"));
    }
}
