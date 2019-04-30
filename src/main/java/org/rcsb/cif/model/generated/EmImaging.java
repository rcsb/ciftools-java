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
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getEntryId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("entry_id", SingleRowStrColumn::new) :
                getBinaryColumn("entry_id"));
    }

    /**
     * The value of _em_imaging.id must uniquely identify
     * each imaging experiment.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("id", SingleRowStrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * astigmatism
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getAstigmatism() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("astigmatism", SingleRowStrColumn::new) :
                getBinaryColumn("astigmatism"));
    }

    /**
     * electron beam tilt params
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getElectronBeamTiltParams() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("electron_beam_tilt_params", SingleRowStrColumn::new) :
                getBinaryColumn("electron_beam_tilt_params"));
    }

    /**
     * residual tilt of the electron beam
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getResidualTilt() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("residual_tilt", SingleRowFloatColumn::new) :
                getBinaryColumn("residual_tilt"));
    }

    /**
     * This data item is a pointer to _em_sample_support.id in
     * the EM_SAMPLE_SUPPORT category.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getSampleSupportId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("sample_support_id", SingleRowStrColumn::new) :
                getBinaryColumn("sample_support_id"));
    }

    /**
     * The value of _em_imaging.detector_id must uniquely identify
     * the type of detector used in the experiment.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDetectorId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("detector_id", SingleRowStrColumn::new) :
                getBinaryColumn("detector_id"));
    }

    /**
     * The value of _em_imaging.scans_id must uniquely identify
     * the image_scans used in the experiment.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getScansId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("scans_id", SingleRowStrColumn::new) :
                getBinaryColumn("scans_id"));
    }

    /**
     * This data item is a pointer to _em_microscope.id in
     * the EM_MICROSCOPE category.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getMicroscopeId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("microscope_id", SingleRowStrColumn::new) :
                getBinaryColumn("microscope_id"));
    }

    /**
     * The name of the model of microscope.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getMicroscopeModel() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("microscope_model", SingleRowStrColumn::new) :
                getBinaryColumn("microscope_model"));
    }

    /**
     * The type of specimen holder used during imaging.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getSpecimenHolderType() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("specimen_holder_type", SingleRowStrColumn::new) :
                getBinaryColumn("specimen_holder_type"));
    }

    /**
     * The name of the model of specimen holder used during imaging.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getSpecimenHolderModel() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("specimen_holder_model", SingleRowStrColumn::new) :
                getBinaryColumn("specimen_holder_model"));
    }

    /**
     * Any additional imaging details.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDetails() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("details", SingleRowStrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * Date (YYYY-MM-DD) of imaging experiment or the date at which
     * a series of experiments began.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDate() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("date", SingleRowStrColumn::new) :
                getBinaryColumn("date"));
    }

    /**
     * A value of accelerating voltage (in kV) used for imaging.
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getAcceleratingVoltage() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("accelerating_voltage", SingleRowIntColumn::new) :
                getBinaryColumn("accelerating_voltage"));
    }

    /**
     * The mode of illumination.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getIlluminationMode() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("illumination_mode", SingleRowStrColumn::new) :
                getBinaryColumn("illumination_mode"));
    }

    /**
     * The mode of imaging.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getMode() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("mode", SingleRowStrColumn::new) :
                getBinaryColumn("mode"));
    }

    /**
     * The spherical aberration coefficient (Cs) in millimeters,
     * of the objective lens.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getNominalCs() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("nominal_cs", SingleRowFloatColumn::new) :
                getBinaryColumn("nominal_cs"));
    }

    /**
     * The minimum defocus value of the objective lens (in nanometers) used
     * to obtain the recorded images.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getNominalDefocusMin() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("nominal_defocus_min", SingleRowFloatColumn::new) :
                getBinaryColumn("nominal_defocus_min"));
    }

    /**
     * The maximum defocus value of the objective lens (in nanometers) used
     * to obtain the recorded images.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getNominalDefocusMax() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("nominal_defocus_max", SingleRowFloatColumn::new) :
                getBinaryColumn("nominal_defocus_max"));
    }

    /**
     * The minimum defocus value of the objective lens (in nanometers) used
     * to obtain the recorded images.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getCalibratedDefocusMin() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("calibrated_defocus_min", SingleRowFloatColumn::new) :
                getBinaryColumn("calibrated_defocus_min"));
    }

    /**
     * The maximum defocus value of the objective lens (in nanometers) used
     * to obtain the recorded images.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getCalibratedDefocusMax() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("calibrated_defocus_max", SingleRowFloatColumn::new) :
                getBinaryColumn("calibrated_defocus_max"));
    }

    /**
     * The minimum angle at which the specimen was tilted to obtain
     * recorded images.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getTiltAngleMin() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("tilt_angle_min", SingleRowFloatColumn::new) :
                getBinaryColumn("tilt_angle_min"));
    }

    /**
     * The maximum angle at which the specimen was tilted to obtain
     * recorded images.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getTiltAngleMax() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("tilt_angle_max", SingleRowFloatColumn::new) :
                getBinaryColumn("tilt_angle_max"));
    }

    /**
     * The magnification indicated by the microscope readout.
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getNominalMagnification() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("nominal_magnification", SingleRowIntColumn::new) :
                getBinaryColumn("nominal_magnification"));
    }

    /**
     * The magnification value obtained for a known standard just
     * prior to, during or just after the imaging experiment.
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getCalibratedMagnification() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("calibrated_magnification", SingleRowIntColumn::new) :
                getBinaryColumn("calibrated_magnification"));
    }

    /**
     * The source of electrons. The electron gun.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getElectronSource() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("electron_source", SingleRowStrColumn::new) :
                getBinaryColumn("electron_source"));
    }

    /**
     * The electron dose received by the specimen (electrons per square angstrom).
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getElectronDose() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("electron_dose", SingleRowFloatColumn::new) :
                getBinaryColumn("electron_dose"));
    }

    /**
     * The type of energy filter spectrometer apparatus.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getEnergyFilter() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("energy_filter", SingleRowStrColumn::new) :
                getBinaryColumn("energy_filter"));
    }

    /**
     * The energy filter range in electron volts (eV)set by spectrometer.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getEnergyWindow() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("energy_window", SingleRowStrColumn::new) :
                getBinaryColumn("energy_window"));
    }

    /**
     * This data item is a pointer to _citation.id in
     * the CITATION category.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getCitationId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("citation_id", SingleRowStrColumn::new) :
                getBinaryColumn("citation_id"));
    }

    /**
     * The mean specimen stage temperature (degrees Kelvin) during imaging
     * in the microscope.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getTemperature() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("temperature", SingleRowFloatColumn::new) :
                getBinaryColumn("temperature"));
    }

    /**
     * The camera length (in millimeters). The camera length is the
     * product of the objective focal length and the combined magnification
     * of the intermediate and projector lenses when the microscope is
     * operated in the diffraction mode.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getDetectorDistance() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("detector_distance", SingleRowFloatColumn::new) :
                getBinaryColumn("detector_distance"));
    }

    /**
     * The specimen temperature minimum (degrees Kelvin) for the duration
     * of imaging.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getRecordingTemperatureMinimum() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("recording_temperature_minimum", SingleRowFloatColumn::new) :
                getBinaryColumn("recording_temperature_minimum"));
    }

    /**
     * The specimen temperature maximum (degrees Kelvin) for the duration
     * of imaging.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getRecordingTemperatureMaximum() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("recording_temperature_maximum", SingleRowFloatColumn::new) :
                getBinaryColumn("recording_temperature_maximum"));
    }

    /**
     * microscope alignment procedure
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getAlignmentProcedure() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("alignment_procedure", SingleRowStrColumn::new) :
                getBinaryColumn("alignment_procedure"));
    }

    /**
     * The open diameter of the c2 condenser lens,
     * in microns.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getC2ApertureDiameter() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("c2_aperture_diameter", SingleRowFloatColumn::new) :
                getBinaryColumn("c2_aperture_diameter"));
    }

    /**
     * Foreign key to the EM_SPECIMEN category
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getSpecimenId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("specimen_id", SingleRowStrColumn::new) :
                getBinaryColumn("specimen_id"));
    }

    /**
     * Cryogen type used to maintain the specimen stage temperature during imaging
     * in the microscope.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getCryogen() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("cryogen", SingleRowStrColumn::new) :
                getBinaryColumn("cryogen"));
    }
}
