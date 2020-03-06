package org.rcsb.cif.schema.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * The CATEGORY of data items used to specify information about
 * crystals used in the diffraction measurements.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class ExptlCrystal extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "exptl_crystal";

    public ExptlCrystal(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
    }

    /**
     * Colour description of a crystal as a list of the allowed
     * exptl_crystal_appearance states for general, intensity and hue.
     * @return StrColumn
     */
    public StrColumn getColour() {
        return new DelegatingStrColumn(parentBlock.getColumn("exptl_crystal_colour"));
    }

    /**
     * Crystal density calculated from crystal unit cell and atomic content.
     * @return FloatColumn
     */
    public FloatColumn getDensityDiffrn() {
        return new DelegatingFloatColumn(parentBlock.getColumn("exptl_crystal_density_diffrn"));
    }

    /**
     * Crystal density measured using standard chemical and physical methods.
     * @return FloatColumn
     */
    public FloatColumn getDensityMeas() {
        return new DelegatingFloatColumn(parentBlock.getColumn("exptl_crystal_density_meas"));
    }

    /**
     * The value above which the density measured using standard
     * chemical and physical methods lies. This item is used only
     * when _exptl_crystal.density_meas cannot be employed. It is
     * intended for use in reporting information in databases and
     * archives which would be misleading if reported otherwise.
     * @return FloatColumn
     */
    public FloatColumn getDensityMeasGt() {
        return new DelegatingFloatColumn(parentBlock.getColumn("exptl_crystal_density_meas_gt"));
    }

    /**
     * The value below which the density measured using standard
     * chemical and physical methods lies. This item is used only
     * when _exptl_crystal.density_meas cannot be employed. It is
     * intended for use in reporting information in databases and
     * archives which would be misleading if reported otherwise.
     * @return FloatColumn
     */
    public FloatColumn getDensityMeasLt() {
        return new DelegatingFloatColumn(parentBlock.getColumn("exptl_crystal_density_meas_lt"));
    }

    /**
     * Temperature at which _exptl_crystal.density_meas was determined.
     * @return FloatColumn
     */
    public FloatColumn getDensityMeasTemp() {
        return new DelegatingFloatColumn(parentBlock.getColumn("exptl_crystal_density_meas_temp"));
    }

    /**
     * Temperature above which the measured density was determined.
     * This item is used only when _exptl_crystal.density_meas_temp
     * cannot be employed. It is intended for use in reporting values
     * from databases which would be misleading if reported otherwise.
     * @return FloatColumn
     */
    public FloatColumn getDensityMeasTempGt() {
        return new DelegatingFloatColumn(parentBlock.getColumn("exptl_crystal_density_meas_temp_gt"));
    }

    /**
     * Temperature below which the measured density was determined.
     * This item is used only when _exptl_crystal.density_meas_temp
     * cannot be employed. It is intended for use in reporting values
     * from databases which would be misleading if reported otherwise.
     * @return FloatColumn
     */
    public FloatColumn getDensityMeasTempLt() {
        return new DelegatingFloatColumn(parentBlock.getColumn("exptl_crystal_density_meas_temp_lt"));
    }

    /**
     * Description of method used to measure _exptl_crystal.density_meas.
     * @return StrColumn
     */
    public StrColumn getDensityMethod() {
        return new DelegatingStrColumn(parentBlock.getColumn("exptl_crystal_density_method"));
    }

    /**
     * Description of the quality and habit of the crystal. The crystal
     * dimensions should be provided using the exptl_crystal.size_* datanames.
     * @return StrColumn
     */
    public StrColumn getDescription() {
        return new DelegatingStrColumn(parentBlock.getColumn("exptl_crystal_description"));
    }

    /**
     * Number of electrons in the crystal unit cell contributing to F(000).
     * It may contain dispersion contributions, and is calculated as
     * 
     * F(000) = [ (sum f~r~)^2^ + (sum f~i~)^2^ ]^1/2^
     * 
     * f~r~   = real part of the scattering factors at theta = 0
     * f~i~   = imaginary part of the scattering factors at theta = 0
     * 
     * the sum is taken over each atom in the unit cell
     * 
     * For X-rays, non-dispersive F(000) is a positive number and counts
     * the effective number of electrons in the unit cell; for neutrons,
     * non-dispersive F(000) (which may be negative) counts the total
     * nuclear scattering power in the unit cell. See
     * http://reference.iucr.org/dictionary/F(000)
     * @return FloatColumn
     */
    public FloatColumn getF000() {
        return new DelegatingFloatColumn(parentBlock.getColumn("exptl_crystal_F_000"));
    }

    /**
     * Code identifying a crystal.
     * @return StrColumn
     */
    public StrColumn getId() {
        return new DelegatingStrColumn(parentBlock.getColumn("exptl_crystal_id"));
    }

    /**
     * Details of crystal growth and preparation of the crystals
     * (e.g.  mounting) prior to the intensity measurements.
     * @return StrColumn
     */
    public StrColumn getPreparation() {
        return new DelegatingStrColumn(parentBlock.getColumn("exptl_crystal_preparation"));
    }

    /**
     * Details concerning the pressure history of the crystals.
     * @return StrColumn
     */
    public StrColumn getPressureHistory() {
        return new DelegatingStrColumn(parentBlock.getColumn("exptl_crystal_pressure_history"));
    }

    /**
     * Method used to recrystallize the sample. Sufficient details should
     * be given for the procedure to be repeated. Temperatures, solvents,
     * flux or carrier gases with concentrations or pressures and ambient
     * atmosphere details should be given.
     * @return StrColumn
     */
    public StrColumn getRecrystallizationMethod() {
        return new DelegatingStrColumn(parentBlock.getColumn("exptl_crystal_recrystallization_method"));
    }

    /**
     * The length of needle/cylindrical crystals.
     * @return FloatColumn
     */
    public FloatColumn getSizeLength() {
        return new DelegatingFloatColumn(parentBlock.getColumn("exptl_crystal_size_length"));
    }

    /**
     * The maximum dimension of a crystal.
     * @return FloatColumn
     */
    public FloatColumn getSizeMax() {
        return new DelegatingFloatColumn(parentBlock.getColumn("exptl_crystal_size_max"));
    }

    /**
     * The median dimension of a crystal.
     * @return FloatColumn
     */
    public FloatColumn getSizeMid() {
        return new DelegatingFloatColumn(parentBlock.getColumn("exptl_crystal_size_mid"));
    }

    /**
     * The minimum dimension of a crystal.
     * @return FloatColumn
     */
    public FloatColumn getSizeMin() {
        return new DelegatingFloatColumn(parentBlock.getColumn("exptl_crystal_size_min"));
    }

    /**
     * The radius of a spherical or cylindrical crystal.
     * @return FloatColumn
     */
    public FloatColumn getSizeRad() {
        return new DelegatingFloatColumn(parentBlock.getColumn("exptl_crystal_size_rad"));
    }

    /**
     * Details concerning the thermal history of the crystals.
     * @return StrColumn
     */
    public StrColumn getThermalHistory() {
        return new DelegatingStrColumn(parentBlock.getColumn("exptl_crystal_thermal_history"));
    }

    /**
     * Standard Uncertainty of the
     * Crystal density measured using standard chemical and physical methods.
     * @return FloatColumn
     */
    public FloatColumn getDensityMeasEsd() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("exptl_crystal_density_meas_esd", "exptl_crystal_density_meas_su"));
    }

    /**
     * Standard Uncertainty of the
     * Crystal density measured using standard chemical and physical methods.
     * @return FloatColumn
     */
    public FloatColumn getDensityMeasSu() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("exptl_crystal_density_meas_esd", "exptl_crystal_density_meas_su"));
    }

    /**
     * Standard Uncertainty of the
     * Temperature at which _exptl_crystal.density_meas was determined.
     * @return FloatColumn
     */
    public FloatColumn getDensityMeasTempEsd() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("exptl_crystal_density_meas_temp_esd", "exptl_crystal_density_meas_temp_su"));
    }

    /**
     * Standard Uncertainty of the
     * Temperature at which _exptl_crystal.density_meas was determined.
     * @return FloatColumn
     */
    public FloatColumn getDensityMeasTempSu() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("exptl_crystal_density_meas_temp_esd", "exptl_crystal_density_meas_temp_su"));
    }

    /**
     * Appearance of the crystal as prescribed state codes. Note that 'dull'
     * and 'clear' should no longer be used.
     * @return StrColumn
     */
    public StrColumn getColourLustre() {
        return new DelegatingStrColumn(parentBlock.getAliasedColumn("exptl_crystal_colour_lustre", "exptl_crystal_appearance_general"));
    }

    /**
     * Appearance of the crystal as prescribed state codes. Note that 'dull'
     * and 'clear' should no longer be used.
     * @return StrColumn
     */
    public StrColumn getGeneral() {
        return new DelegatingStrColumn(parentBlock.getAliasedColumn("exptl_crystal_colour_lustre", "exptl_crystal_appearance_general"));
    }

    /**
     * Colour hue of the crystals as prescribed state codes.
     * @return StrColumn
     */
    public StrColumn getColourPrimary() {
        return new DelegatingStrColumn(parentBlock.getAliasedColumn("exptl_crystal_colour_primary", "exptl_crystal_appearance_hue"));
    }

    /**
     * Colour hue of the crystals as prescribed state codes.
     * @return StrColumn
     */
    public StrColumn getHue() {
        return new DelegatingStrColumn(parentBlock.getAliasedColumn("exptl_crystal_colour_primary", "exptl_crystal_appearance_hue"));
    }

    /**
     * Colour intensity of the crystal as prescribed state codes.
     * @return StrColumn
     */
    public StrColumn getColourModifier() {
        return new DelegatingStrColumn(parentBlock.getAliasedColumn("exptl_crystal_colour_modifier", "exptl_crystal_appearance_intensity"));
    }

    /**
     * Colour intensity of the crystal as prescribed state codes.
     * @return StrColumn
     */
    public StrColumn getIntensity() {
        return new DelegatingStrColumn(parentBlock.getAliasedColumn("exptl_crystal_colour_modifier", "exptl_crystal_appearance_intensity"));
    }

}