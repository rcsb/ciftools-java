package org.rcsb.cif.schema.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
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
     * Details of the radiation source or energy spectrum.
     * @return StrColumn
     */
    public StrColumn getType() {
        return new DelegatingStrColumn(parentBlock.getColumn("diffrn_radiation_wavelength_type"));
    }

    /**
     * Relative intensity of a radiation used in the diffraction measurements.
     * @return FloatColumn
     */
    public FloatColumn getWt() {
        return new DelegatingFloatColumn(parentBlock.getColumn("diffrn_radiation_wavelength_wt"));
    }

    /**
     * IUPAC symbol for the X-ray wavelength for probe radiation.
     * @return StrColumn
     */
    public StrColumn getXraySymbol() {
        return new DelegatingStrColumn(parentBlock.getColumn("diffrn_radiation_wavelength_xray_symbol"));
    }

    /**
     * Information about the determination of the radiation
     * diffrn_radiation_wavelength that is not conveyed completely by an
     * enumerated value of _diffrn_radiation_wavelength.determination.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return new DelegatingStrColumn(parentBlock.getColumn("diffrn_radiation_wavelength_details"));
    }

    /**
     * Method by which the radiation wavelength was determined.
     * @return StrColumn
     */
    public StrColumn getDetermination() {
        return new DelegatingStrColumn(parentBlock.getColumn("diffrn_radiation_wavelength_determination"));
    }

    /**
     * Code identifying the radiation used in the diffraction measurements.
     * This is linked to _diffrn_refln.wavelength_id and _refln.wavelength_id
     * @return StrColumn
     */
    public StrColumn getId() {
        return new DelegatingStrColumn(parentBlock.getColumn("diffrn_radiation_wavelength_id"));
    }

    /**
     * Wavelength of radiation used in diffraction measurements.
     * @return FloatColumn
     */
    public FloatColumn getWavelength() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("diffrn_radiation_wavelength_wavelength", "diffrn_radiation_wavelength_value"));
    }

    /**
     * Wavelength of radiation used in diffraction measurements.
     * @return FloatColumn
     */
    public FloatColumn getValue() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("diffrn_radiation_wavelength_wavelength", "diffrn_radiation_wavelength_value"));
    }

    /**
     * Standard uncertainty of the wavelength of radiation used in diffraction
     * measurements.
     * @return FloatColumn
     */
    public FloatColumn getWavelengthSu() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("diffrn_radiation_wavelength_wavelength_su", "diffrn_radiation_wavelength_value_su"));
    }

    /**
     * Standard uncertainty of the wavelength of radiation used in diffraction
     * measurements.
     * @return FloatColumn
     */
    public FloatColumn getValueSu() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("diffrn_radiation_wavelength_wavelength_su", "diffrn_radiation_wavelength_value_su"));
    }

}