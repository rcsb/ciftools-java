package org.rcsb.cif.model.diffrn;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class Diffrn extends BaseCategory {
    public Diffrn(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public Diffrn(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public Diffrn(String name) {
        super(name);
    }

    /**
     * The gas or liquid surrounding the sample, if not air.
     * @return AmbientEnvironment
     */
    public AmbientEnvironment getAmbientEnvironment() {
        return (AmbientEnvironment) (isText ? textFields.computeIfAbsent("ambient_environment",
                AmbientEnvironment::new) : getBinaryColumn("ambient_environment"));
    }

    /**
     * The mean temperature in kelvins at which the intensities were
     * measured.
     * @return AmbientTemp
     */
    public AmbientTemp getAmbientTemp() {
        return (AmbientTemp) (isText ? textFields.computeIfAbsent("ambient_temp",
                AmbientTemp::new) : getBinaryColumn("ambient_temp"));
    }

    /**
     * A description of special aspects of temperature control during
     * data collection.
     * @return AmbientTempDetails
     */
    public AmbientTempDetails getAmbientTempDetails() {
        return (AmbientTempDetails) (isText ? textFields.computeIfAbsent("ambient_temp_details",
                AmbientTempDetails::new) : getBinaryColumn("ambient_temp_details"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _diffrn.ambient_temp.
     * @return AmbientTempEsd
     */
    public AmbientTempEsd getAmbientTempEsd() {
        return (AmbientTempEsd) (isText ? textFields.computeIfAbsent("ambient_temp_esd",
                AmbientTempEsd::new) : getBinaryColumn("ambient_temp_esd"));
    }

    /**
     * This data item is a pointer to _exptl_crystal.id in the
     * EXPTL_CRYSTAL category.
     * @return CrystalId
     */
    public CrystalId getCrystalId() {
        return (CrystalId) (isText ? textFields.computeIfAbsent("crystal_id",
                CrystalId::new) : getBinaryColumn("crystal_id"));
    }

    /**
     * The physical device used to support the crystal during data
     * collection.
     * @return CrystalSupport
     */
    public CrystalSupport getCrystalSupport() {
        return (CrystalSupport) (isText ? textFields.computeIfAbsent("crystal_support",
                CrystalSupport::new) : getBinaryColumn("crystal_support"));
    }

    /**
     * Remarks about how the crystal was treated prior to intensity
     * measurement. Particularly relevant when intensities were
     * measured at low temperature.
     * @return CrystalTreatment
     */
    public CrystalTreatment getCrystalTreatment() {
        return (CrystalTreatment) (isText ? textFields.computeIfAbsent("crystal_treatment",
                CrystalTreatment::new) : getBinaryColumn("crystal_treatment"));
    }

    /**
     * Special details of the diffraction measurement process. Should
     * include information about source instability, crystal motion,
     * degradation and so on.
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
    }

    /**
     * This data item uniquely identifies a set of diffraction
     * data.
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }

    /**
     * The mean hydrostatic pressure in kilopascals at which the
     * intensities were measured.
     * @return AmbientPressure
     */
    public AmbientPressure getAmbientPressure() {
        return (AmbientPressure) (isText ? textFields.computeIfAbsent("ambient_pressure",
                AmbientPressure::new) : getBinaryColumn("ambient_pressure"));
    }

    /**
     * The estimated standard deviation of _diffrn.ambient_pressure.
     * @return AmbientPressureEsd
     */
    public AmbientPressureEsd getAmbientPressureEsd() {
        return (AmbientPressureEsd) (isText ? textFields.computeIfAbsent("ambient_pressure_esd",
                AmbientPressureEsd::new) : getBinaryColumn("ambient_pressure_esd"));
    }

    /**
     * The mean hydrostatic pressure in kilopascals above which
     * the intensities were measured. _diffrn.ambient_pressure_gt and
     * _diffrn.ambient_pressure_lt allow a pressure range to be given.
     * 
     * _diffrn.ambient_pressure should always be used in
     * preference to these two items whenever possible.
     * @return AmbientPressureGt
     */
    public AmbientPressureGt getAmbientPressureGt() {
        return (AmbientPressureGt) (isText ? textFields.computeIfAbsent("ambient_pressure_gt",
                AmbientPressureGt::new) : getBinaryColumn("ambient_pressure_gt"));
    }

    /**
     * The mean hydrostatic pressure in kilopascals below which
     * the intensities were measured. _diffrn.ambient_pressure_gt and
     * _diffrn.ambient_pressure_lt allow a pressure range to be given.
     * 
     * _diffrn.ambient_pressure should always be used in
     * preference to these two items whenever possible.
     * @return AmbientPressureLt
     */
    public AmbientPressureLt getAmbientPressureLt() {
        return (AmbientPressureLt) (isText ? textFields.computeIfAbsent("ambient_pressure_lt",
                AmbientPressureLt::new) : getBinaryColumn("ambient_pressure_lt"));
    }

    /**
     * The mean temperature in kelvins above which the intensities were
     * measured.  _diffrn.ambient_temp_gt and _diffrn.ambient_temp_lt
     * allow a range of temperatures to be given.
     * 
     * _diffrn.ambient_temp should always be used in preference
     * to these two items whenever possible.
     * @return AmbientTempGt
     */
    public AmbientTempGt getAmbientTempGt() {
        return (AmbientTempGt) (isText ? textFields.computeIfAbsent("ambient_temp_gt",
                AmbientTempGt::new) : getBinaryColumn("ambient_temp_gt"));
    }

    /**
     * The mean temperature in kelvins below which the intensities were
     * measured. _diffrn.ambient_temp_gt and _diffrn.ambient_temp_lt
     * allow a range of temperatures to be given.
     * 
     * _diffrn.ambient_temp should always be used in preference
     * to these two items whenever possible.
     * @return AmbientTempLt
     */
    public AmbientTempLt getAmbientTempLt() {
        return (AmbientTempLt) (isText ? textFields.computeIfAbsent("ambient_temp_lt",
                AmbientTempLt::new) : getBinaryColumn("ambient_temp_lt"));
    }

    /**
     * Y/N if using serial crystallography experiment in which multiple crystals contribute to each diffraction frame in the experiment.
     * @return PdbxSerialCrystalExperiment
     */
    public PdbxSerialCrystalExperiment getPdbxSerialCrystalExperiment() {
        return (PdbxSerialCrystalExperiment) (isText ? textFields.computeIfAbsent("pdbx_serial_crystal_experiment",
                PdbxSerialCrystalExperiment::new) : getBinaryColumn("pdbx_serial_crystal_experiment"));
    }
}
