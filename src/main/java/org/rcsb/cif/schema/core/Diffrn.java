package org.rcsb.cif.schema.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * The CATEGORY of data items used to describe the diffraction experiment.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class Diffrn extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "diffrn";

    public Diffrn(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
    }

    /**
     * The gas or liquid environment of the crystal sample, if not air.
     * @return StrColumn
     */
    public StrColumn getAmbientEnvironment() {
        return new DelegatingStrColumn(parentBlock.getColumn("diffrn_ambient_environment"));
    }

    /**
     * Mean hydrostatic pressure at which intensities were measured.
     * @return FloatColumn
     */
    public FloatColumn getAmbientPressure() {
        return new DelegatingFloatColumn(parentBlock.getColumn("diffrn_ambient_pressure"));
    }

    /**
     * Mean hydrostatic pressure above which intensities were measured.
     * These items allow for a pressure range to be given.
     * _diffrn.ambient_pressure should be used in preference to this
     * item when possible.
     * @return FloatColumn
     */
    public FloatColumn getAmbientPressureGt() {
        return new DelegatingFloatColumn(parentBlock.getColumn("diffrn_ambient_pressure_gt"));
    }

    /**
     * Mean hydrostatic pressure below which intensities were measured.
     * These items allow for a pressure range to be given.
     * _diffrn.ambient_pressure should be used in preference to this
     * item when possible.
     * @return FloatColumn
     */
    public FloatColumn getAmbientPressureLt() {
        return new DelegatingFloatColumn(parentBlock.getColumn("diffrn_ambient_pressure_lt"));
    }

    /**
     * Identifier for the crystal from which diffraction data were
     * collected. This is a pointer to _exptl_crystal.id.
     * @return StrColumn
     */
    public StrColumn getCrystalId() {
        return new DelegatingStrColumn(parentBlock.getColumn("diffrn_crystal_id"));
    }

    /**
     * The physical device used to support the crystal during data
     * collection.
     * @return StrColumn
     */
    public StrColumn getCrystalSupport() {
        return new DelegatingStrColumn(parentBlock.getColumn("diffrn_crystal_support"));
    }

    /**
     * Remarks about how the crystal was treated prior to intensity measurement.
     * Particularly relevant when intensities were measured at low temperature.
     * @return StrColumn
     */
    public StrColumn getCrystalTreatment() {
        return new DelegatingStrColumn(parentBlock.getColumn("diffrn_crystal_treatment"));
    }

    /**
     * Unique identifier for a diffraction data set collected under
     * particular diffraction conditions.
     * @return StrColumn
     */
    public StrColumn getId() {
        return new DelegatingStrColumn(parentBlock.getColumn("diffrn_id"));
    }

    /**
     * Fraction of unique (symmetry-independent) reflections measured
     * out to _diffrn_reflns.theta_full.
     * @return FloatColumn
     */
    public FloatColumn getMeasuredFractionThetaFull() {
        return new DelegatingFloatColumn(parentBlock.getColumn("diffrn_measured_fraction_theta_full"));
    }

    /**
     * Fraction of unique (symmetry-independent) reflections measured
     * out to _diffrn_reflns.theta_max.
     * @return FloatColumn
     */
    public FloatColumn getMeasuredFractionThetaMax() {
        return new DelegatingFloatColumn(parentBlock.getColumn("diffrn_measured_fraction_theta_max"));
    }

    /**
     * Recorded diffraction point symmetry, systematic absences and possible
     * space group(s) or superspace group(s) compatible with these.
     * @return StrColumn
     */
    public StrColumn getSymmetryDescription() {
        return new DelegatingStrColumn(parentBlock.getColumn("diffrn_symmetry_description"));
    }

    /**
     * Standard uncertainty of the mean hydrostatic pressure
     * at which intensities were measured.
     * @return FloatColumn
     */
    public FloatColumn getAmbientPressureEsd() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("diffrn_ambient_pressure_esd", "diffrn_ambient_pressure_su"));
    }

    /**
     * Standard uncertainty of the mean hydrostatic pressure
     * at which intensities were measured.
     * @return FloatColumn
     */
    public FloatColumn getAmbientPressureSu() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("diffrn_ambient_pressure_esd", "diffrn_ambient_pressure_su"));
    }

    /**
     * Mean temperature at which intensities were measured.
     * @return FloatColumn
     */
    public FloatColumn getAmbientTemp() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("diffrn_ambient_temp", "diffrn_ambient_temperature"));
    }

    /**
     * Mean temperature at which intensities were measured.
     * @return FloatColumn
     */
    public FloatColumn getAmbientTemperature() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("diffrn_ambient_temp", "diffrn_ambient_temperature"));
    }

    /**
     * Standard uncertainty of the mean temperature
     * at which intensities were measured.
     * @return FloatColumn
     */
    public FloatColumn getAmbientTempEsd() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("diffrn_ambient_temp_esd", "diffrn_ambient_temperature_su"));
    }

    /**
     * Standard uncertainty of the mean temperature
     * at which intensities were measured.
     * @return FloatColumn
     */
    public FloatColumn getAmbientTemperatureSu() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("diffrn_ambient_temp_esd", "diffrn_ambient_temperature_su"));
    }

    /**
     * A description of special aspects of temperature control during
     * data collection.
     * @return StrColumn
     */
    public StrColumn getAmbientTempDetails() {
        return new DelegatingStrColumn(parentBlock.getAliasedColumn("diffrn_ambient_temp_details", "diffrn_ambient_temperature_details"));
    }

    /**
     * A description of special aspects of temperature control during
     * data collection.
     * @return StrColumn
     */
    public StrColumn getAmbientTemperatureDetails() {
        return new DelegatingStrColumn(parentBlock.getAliasedColumn("diffrn_ambient_temp_details", "diffrn_ambient_temperature_details"));
    }

    /**
     * Mean temperature above which intensities were measured.
     * These items allow for a temperature range to be given.
     * _diffrn.ambient_temperature should be used in preference to
     * this item when possible.
     * @return FloatColumn
     */
    public FloatColumn getAmbientTempGt() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("diffrn_ambient_temp_gt", "diffrn_ambient_temperature_gt"));
    }

    /**
     * Mean temperature above which intensities were measured.
     * These items allow for a temperature range to be given.
     * _diffrn.ambient_temperature should be used in preference to
     * this item when possible.
     * @return FloatColumn
     */
    public FloatColumn getAmbientTemperatureGt() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("diffrn_ambient_temp_gt", "diffrn_ambient_temperature_gt"));
    }

    /**
     * Mean temperature below which intensities were measured.
     * These items allow for a temperature range to be given.
     * _diffrn.ambient_temperature should be used in preference to
     * this item when possible.
     * @return FloatColumn
     */
    public FloatColumn getAmbientTempLt() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("diffrn_ambient_temp_lt", "diffrn_ambient_temperature_lt"));
    }

    /**
     * Mean temperature below which intensities were measured.
     * These items allow for a temperature range to be given.
     * _diffrn.ambient_temperature should be used in preference to
     * this item when possible.
     * @return FloatColumn
     */
    public FloatColumn getAmbientTemperatureLt() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("diffrn_ambient_temp_lt", "diffrn_ambient_temperature_lt"));
    }

    /**
     * Special details of the diffraction measurement process. Should include
     * information about source instability, crystal motion, degradation, etc.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return new DelegatingStrColumn(parentBlock.getAliasedColumn("diffrn_details", "diffrn_special_details"));
    }

    /**
     * Special details of the diffraction measurement process. Should include
     * information about source instability, crystal motion, degradation, etc.
     * @return StrColumn
     */
    public StrColumn getSpecialDetails() {
        return new DelegatingStrColumn(parentBlock.getAliasedColumn("diffrn_details", "diffrn_special_details"));
    }

    /**
     * Description of special aspects of the diffraction measurement.
     * @return StrColumn
     */
    public StrColumn getMeasurementDetails() {
        return new DelegatingStrColumn(parentBlock.getColumn("diffrn_measurement_details"));
    }

    /**
     * Type of goniometer device used to mount and orient the specimen.
     * @return StrColumn
     */
    public StrColumn getMeasurementDeviceClass() {
        return new DelegatingStrColumn(parentBlock.getAliasedColumn("diffrn_measurement_device_class", "diffrn_measurement_device"));
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
    public StrColumn getMeasurementDeviceDetails() {
        return new DelegatingStrColumn(parentBlock.getColumn("diffrn_measurement_device_details"));
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
    public StrColumn getMeasurementDeviceMake() {
        return new DelegatingStrColumn(parentBlock.getAliasedColumn("diffrn_measurement_device_make", "diffrn_measurement_device_type"));
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
    public StrColumn getMeasurementMethod() {
        return new DelegatingStrColumn(parentBlock.getColumn("diffrn_measurement_method"));
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
    public StrColumn getMeasurementSpecimenSupport() {
        return new DelegatingStrColumn(parentBlock.getColumn("diffrn_measurement_specimen_support"));
    }

    /**
     * Mounting method for the crystal specimen during data collection.
     * @return StrColumn
     */
    public StrColumn getSpecimenSupport() {
        return new DelegatingStrColumn(parentBlock.getColumn("diffrn_measurement_specimen_support"));
    }

}