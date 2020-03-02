package org.rcsb.cif.schema.generated.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * 
 * The CATEGORY of data items which specify the wavelength of the
 * radiation used in measuring diffraction intensities. Items may be
 * looped to identify and assign weights to distinct wavelength
 * components from a polychromatic beam.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class DiffrnRadiationWavelength extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "diffrn_radiation_wavelength";

    public DiffrnRadiationWavelength(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
    }

    /**
     * 
     * Information about the determination of the radiation
     * diffrn_radiation_wavelength that is not conveyed completely by an
     * enumerated value of _diffrn_radiation_wavelength.determination.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_details"));
    }

    /**
     * 
     * Method by which the radiation wavelength was determined.
     * @return StrColumn
     */
    public StrColumn getDetermination() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_determination"));
    }

    /**
     * 
     * Code identifying a radiation used in the diffraction measurements.
     * This is linked to _diffrn_refln.wavelength_id and _refln.wavelength_id
     * @return StrColumn
     */
    public StrColumn getId() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_id"));
    }

    /**
     * 
     * Wavelength of radiation used in diffraction measurements.
     * @return StrColumn
     */
    public StrColumn getValue() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_value"));
    }

    /**
     * 
     * Standard uncertainty of the wavelength of radiation used in diffraction
     * measurements.
     * @return StrColumn
     */
    public StrColumn getValueSu() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_value_su"));
    }

    /**
     * 
     * Relative intensity of a radiation used in the diffraction measurements.
     * @return StrColumn
     */
    public StrColumn getWt() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_wt"));
    }
}
