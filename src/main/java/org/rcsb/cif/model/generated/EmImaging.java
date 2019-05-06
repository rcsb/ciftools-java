package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the EM_IMAGING category record details about
 * the parameters used in imaging the sample in the electron microscope.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class EmImaging extends BaseCategory {
    public EmImaging(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public EmImaging(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public EmImaging(String name) {
        super(name);
    }

    /**
     * This data item is a pointer to _entry.id in the ENTRY category.
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entry_id", StrColumn::new) :
                getBinaryColumn("entry_id"));
    }

    /**
     * The value of _em_imaging.id must uniquely identify
     * each imaging experiment.
     * @return StrColumn
     */
    public StrColumn getId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("id", StrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * astigmatism
     * @return StrColumn
     */
    public StrColumn getAstigmatism() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("astigmatism", StrColumn::new) :
                getBinaryColumn("astigmatism"));
    }

    /**
     * electron beam tilt params
     * @return StrColumn
     */
    public StrColumn getElectronBeamTiltParams() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("electron_beam_tilt_params", StrColumn::new) :
                getBinaryColumn("electron_beam_tilt_params"));
    }

    /**
     * residual tilt of the electron beam
     * @return FloatColumn
     */
    public FloatColumn getResidualTilt() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("residual_tilt", FloatColumn::new) :
                getBinaryColumn("residual_tilt"));
    }

    /**
     * This data item is a pointer to _em_sample_support.id in
     * the EM_SAMPLE_SUPPORT category.
     * @return StrColumn
     */
    public StrColumn getSampleSupportId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("sample_support_id", StrColumn::new) :
                getBinaryColumn("sample_support_id"));
    }

    /**
     * The value of _em_imaging.detector_id must uniquely identify
     * the type of detector used in the experiment.
     * @return StrColumn
     */
    public StrColumn getDetectorId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("detector_id", StrColumn::new) :
                getBinaryColumn("detector_id"));
    }

    /**
     * The value of _em_imaging.scans_id must uniquely identify
     * the image_scans used in the experiment.
     * @return StrColumn
     */
    public StrColumn getScansId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("scans_id", StrColumn::new) :
                getBinaryColumn("scans_id"));
    }

    /**
     * This data item is a pointer to _em_microscope.id in
     * the EM_MICROSCOPE category.
     * @return StrColumn
     */
    public StrColumn getMicroscopeId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("microscope_id", StrColumn::new) :
                getBinaryColumn("microscope_id"));
    }

    /**
     * The name of the model of microscope.
     * @return StrColumn
     */
    public StrColumn getMicroscopeModel() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("microscope_model", StrColumn::new) :
                getBinaryColumn("microscope_model"));
    }

    /**
     * The type of specimen holder used during imaging.
     * @return StrColumn
     */
    public StrColumn getSpecimenHolderType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("specimen_holder_type", StrColumn::new) :
                getBinaryColumn("specimen_holder_type"));
    }

    /**
     * The name of the model of specimen holder used during imaging.
     * @return StrColumn
     */
    public StrColumn getSpecimenHolderModel() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("specimen_holder_model", StrColumn::new) :
                getBinaryColumn("specimen_holder_model"));
    }

    /**
     * Any additional imaging details.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * Date (YYYY-MM-DD) of imaging experiment or the date at which
     * a series of experiments began.
     * @return StrColumn
     */
    public StrColumn getDate() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("date", StrColumn::new) :
                getBinaryColumn("date"));
    }

    /**
     * A value of accelerating voltage (in kV) used for imaging.
     * @return IntColumn
     */
    public IntColumn getAcceleratingVoltage() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("accelerating_voltage", IntColumn::new) :
                getBinaryColumn("accelerating_voltage"));
    }

    /**
     * The mode of illumination.
     * @return StrColumn
     */
    public StrColumn getIlluminationMode() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("illumination_mode", StrColumn::new) :
                getBinaryColumn("illumination_mode"));
    }

    /**
     * The mode of imaging.
     * @return StrColumn
     */
    public StrColumn getMode() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("mode", StrColumn::new) :
                getBinaryColumn("mode"));
    }

    /**
     * The spherical aberration coefficient (Cs) in millimeters,
     * of the objective lens.
     * @return FloatColumn
     */
    public FloatColumn getNominalCs() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("nominal_cs", FloatColumn::new) :
                getBinaryColumn("nominal_cs"));
    }

    /**
     * The minimum defocus value of the objective lens (in nanometers) used
     * to obtain the recorded images.
     * @return FloatColumn
     */
    public FloatColumn getNominalDefocusMin() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("nominal_defocus_min", FloatColumn::new) :
                getBinaryColumn("nominal_defocus_min"));
    }

    /**
     * The maximum defocus value of the objective lens (in nanometers) used
     * to obtain the recorded images.
     * @return FloatColumn
     */
    public FloatColumn getNominalDefocusMax() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("nominal_defocus_max", FloatColumn::new) :
                getBinaryColumn("nominal_defocus_max"));
    }

    /**
     * The minimum defocus value of the objective lens (in nanometers) used
     * to obtain the recorded images.
     * @return FloatColumn
     */
    public FloatColumn getCalibratedDefocusMin() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("calibrated_defocus_min", FloatColumn::new) :
                getBinaryColumn("calibrated_defocus_min"));
    }

    /**
     * The maximum defocus value of the objective lens (in nanometers) used
     * to obtain the recorded images.
     * @return FloatColumn
     */
    public FloatColumn getCalibratedDefocusMax() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("calibrated_defocus_max", FloatColumn::new) :
                getBinaryColumn("calibrated_defocus_max"));
    }

    /**
     * The minimum angle at which the specimen was tilted to obtain
     * recorded images.
     * @return FloatColumn
     */
    public FloatColumn getTiltAngleMin() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("tilt_angle_min", FloatColumn::new) :
                getBinaryColumn("tilt_angle_min"));
    }

    /**
     * The maximum angle at which the specimen was tilted to obtain
     * recorded images.
     * @return FloatColumn
     */
    public FloatColumn getTiltAngleMax() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("tilt_angle_max", FloatColumn::new) :
                getBinaryColumn("tilt_angle_max"));
    }

    /**
     * The magnification indicated by the microscope readout.
     * @return IntColumn
     */
    public IntColumn getNominalMagnification() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("nominal_magnification", IntColumn::new) :
                getBinaryColumn("nominal_magnification"));
    }

    /**
     * The magnification value obtained for a known standard just
     * prior to, during or just after the imaging experiment.
     * @return IntColumn
     */
    public IntColumn getCalibratedMagnification() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("calibrated_magnification", IntColumn::new) :
                getBinaryColumn("calibrated_magnification"));
    }

    /**
     * The source of electrons. The electron gun.
     * @return StrColumn
     */
    public StrColumn getElectronSource() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("electron_source", StrColumn::new) :
                getBinaryColumn("electron_source"));
    }

    /**
     * The electron dose received by the specimen (electrons per square angstrom).
     * @return FloatColumn
     */
    public FloatColumn getElectronDose() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("electron_dose", FloatColumn::new) :
                getBinaryColumn("electron_dose"));
    }

    /**
     * The type of energy filter spectrometer apparatus.
     * @return StrColumn
     */
    public StrColumn getEnergyFilter() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("energy_filter", StrColumn::new) :
                getBinaryColumn("energy_filter"));
    }

    /**
     * The energy filter range in electron volts (eV)set by spectrometer.
     * @return StrColumn
     */
    public StrColumn getEnergyWindow() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("energy_window", StrColumn::new) :
                getBinaryColumn("energy_window"));
    }

    /**
     * This data item is a pointer to _citation.id in
     * the CITATION category.
     * @return StrColumn
     */
    public StrColumn getCitationId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("citation_id", StrColumn::new) :
                getBinaryColumn("citation_id"));
    }

    /**
     * The mean specimen stage temperature (degrees Kelvin) during imaging
     * in the microscope.
     * @return FloatColumn
     */
    public FloatColumn getTemperature() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("temperature", FloatColumn::new) :
                getBinaryColumn("temperature"));
    }

    /**
     * The camera length (in millimeters). The camera length is the
     * product of the objective focal length and the combined magnification
     * of the intermediate and projector lenses when the microscope is
     * operated in the diffraction mode.
     * @return FloatColumn
     */
    public FloatColumn getDetectorDistance() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("detector_distance", FloatColumn::new) :
                getBinaryColumn("detector_distance"));
    }

    /**
     * The specimen temperature minimum (degrees Kelvin) for the duration
     * of imaging.
     * @return FloatColumn
     */
    public FloatColumn getRecordingTemperatureMinimum() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("recording_temperature_minimum", FloatColumn::new) :
                getBinaryColumn("recording_temperature_minimum"));
    }

    /**
     * The specimen temperature maximum (degrees Kelvin) for the duration
     * of imaging.
     * @return FloatColumn
     */
    public FloatColumn getRecordingTemperatureMaximum() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("recording_temperature_maximum", FloatColumn::new) :
                getBinaryColumn("recording_temperature_maximum"));
    }

    /**
     * microscope alignment procedure
     * @return StrColumn
     */
    public StrColumn getAlignmentProcedure() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("alignment_procedure", StrColumn::new) :
                getBinaryColumn("alignment_procedure"));
    }

    /**
     * The open diameter of the c2 condenser lens,
     * in microns.
     * @return FloatColumn
     */
    public FloatColumn getC2ApertureDiameter() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("c2_aperture_diameter", FloatColumn::new) :
                getBinaryColumn("c2_aperture_diameter"));
    }

    /**
     * Foreign key to the EM_SPECIMEN category
     * @return StrColumn
     */
    public StrColumn getSpecimenId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("specimen_id", StrColumn::new) :
                getBinaryColumn("specimen_id"));
    }

    /**
     * Cryogen type used to maintain the specimen stage temperature during imaging
     * in the microscope.
     * @return StrColumn
     */
    public StrColumn getCryogen() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("cryogen", StrColumn::new) :
                getBinaryColumn("cryogen"));
    }
}
