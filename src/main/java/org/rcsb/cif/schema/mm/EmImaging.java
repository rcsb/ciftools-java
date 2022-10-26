package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the EM_IMAGING category record details about
 * the parameters used in imaging the sample in the electron microscope.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class EmImaging extends DelegatingCategory {
    public EmImaging(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "entry_id":
                return getEntryId();
            case "id":
                return getId();
            case "astigmatism":
                return getAstigmatism();
            case "electron_beam_tilt_params":
                return getElectronBeamTiltParams();
            case "residual_tilt":
                return getResidualTilt();
            case "sample_support_id":
                return getSampleSupportId();
            case "detector_id":
                return getDetectorId();
            case "scans_id":
                return getScansId();
            case "microscope_id":
                return getMicroscopeId();
            case "microscope_model":
                return getMicroscopeModel();
            case "specimen_holder_type":
                return getSpecimenHolderType();
            case "specimen_holder_model":
                return getSpecimenHolderModel();
            case "details":
                return getDetails();
            case "date":
                return getDate();
            case "accelerating_voltage":
                return getAcceleratingVoltage();
            case "illumination_mode":
                return getIlluminationMode();
            case "mode":
                return getMode();
            case "nominal_cs":
                return getNominalCs();
            case "nominal_defocus_min":
                return getNominalDefocusMin();
            case "nominal_defocus_max":
                return getNominalDefocusMax();
            case "calibrated_defocus_min":
                return getCalibratedDefocusMin();
            case "calibrated_defocus_max":
                return getCalibratedDefocusMax();
            case "tilt_angle_min":
                return getTiltAngleMin();
            case "tilt_angle_max":
                return getTiltAngleMax();
            case "nominal_magnification":
                return getNominalMagnification();
            case "calibrated_magnification":
                return getCalibratedMagnification();
            case "electron_source":
                return getElectronSource();
            case "electron_dose":
                return getElectronDose();
            case "energy_filter":
                return getEnergyFilter();
            case "energy_window":
                return getEnergyWindow();
            case "citation_id":
                return getCitationId();
            case "temperature":
                return getTemperature();
            case "detector_distance":
                return getDetectorDistance();
            case "recording_temperature_minimum":
                return getRecordingTemperatureMinimum();
            case "recording_temperature_maximum":
                return getRecordingTemperatureMaximum();
            case "alignment_procedure":
                return getAlignmentProcedure();
            case "c2_aperture_diameter":
                return getC2ApertureDiameter();
            case "specimen_id":
                return getSpecimenId();
            case "cryogen":
                return getCryogen();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * This data item is a pointer to _entry.id in the ENTRY category.
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return delegate.getColumn("entry_id", DelegatingStrColumn::new);
    }

    /**
     * PRIMARY KEY
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * astigmatism
     * @return StrColumn
     */
    public StrColumn getAstigmatism() {
        return delegate.getColumn("astigmatism", DelegatingStrColumn::new);
    }

    /**
     * electron beam tilt params
     * @return StrColumn
     */
    public StrColumn getElectronBeamTiltParams() {
        return delegate.getColumn("electron_beam_tilt_params", DelegatingStrColumn::new);
    }

    /**
     * Residual tilt of the electron beam (in miliradians)
     * @return FloatColumn
     */
    public FloatColumn getResidualTilt() {
        return delegate.getColumn("residual_tilt", DelegatingFloatColumn::new);
    }

    /**
     * This data item is a pointer to _em_sample_support.id in
     * the EM_SAMPLE_SUPPORT category.
     * @return StrColumn
     */
    public StrColumn getSampleSupportId() {
        return delegate.getColumn("sample_support_id", DelegatingStrColumn::new);
    }

    /**
     * The value of _em_imaging.detector_id must uniquely identify
     * the type of detector used in the experiment.
     * @return StrColumn
     */
    public StrColumn getDetectorId() {
        return delegate.getColumn("detector_id", DelegatingStrColumn::new);
    }

    /**
     * The value of _em_imaging.scans_id must uniquely identify
     * the image_scans used in the experiment.
     * @return StrColumn
     */
    public StrColumn getScansId() {
        return delegate.getColumn("scans_id", DelegatingStrColumn::new);
    }

    /**
     * This data item is a pointer to _em_microscope.id in
     * the EM_MICROSCOPE category.
     * @return StrColumn
     */
    public StrColumn getMicroscopeId() {
        return delegate.getColumn("microscope_id", DelegatingStrColumn::new);
    }

    /**
     * The name of the model of microscope.
     * @return StrColumn
     */
    public StrColumn getMicroscopeModel() {
        return delegate.getColumn("microscope_model", DelegatingStrColumn::new);
    }

    /**
     * The type of specimen holder used during imaging.
     * @return StrColumn
     */
    public StrColumn getSpecimenHolderType() {
        return delegate.getColumn("specimen_holder_type", DelegatingStrColumn::new);
    }

    /**
     * The name of the model of specimen holder used during imaging.
     * @return StrColumn
     */
    public StrColumn getSpecimenHolderModel() {
        return delegate.getColumn("specimen_holder_model", DelegatingStrColumn::new);
    }

    /**
     * Any additional imaging details.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

    /**
     * Date (YYYY-MM-DD) of imaging experiment or the date at which
     * a series of experiments began.
     * @return StrColumn
     */
    public StrColumn getDate() {
        return delegate.getColumn("date", DelegatingStrColumn::new);
    }

    /**
     * A value of accelerating voltage (in kV) used for imaging.
     * @return IntColumn
     */
    public IntColumn getAcceleratingVoltage() {
        return delegate.getColumn("accelerating_voltage", DelegatingIntColumn::new);
    }

    /**
     * The mode of illumination.
     * @return StrColumn
     */
    public StrColumn getIlluminationMode() {
        return delegate.getColumn("illumination_mode", DelegatingStrColumn::new);
    }

    /**
     * The mode of imaging.
     * @return StrColumn
     */
    public StrColumn getMode() {
        return delegate.getColumn("mode", DelegatingStrColumn::new);
    }

    /**
     * The spherical aberration coefficient (Cs) in millimeters,
     * of the objective lens.
     * @return FloatColumn
     */
    public FloatColumn getNominalCs() {
        return delegate.getColumn("nominal_cs", DelegatingFloatColumn::new);
    }

    /**
     * The minimum defocus value of the objective lens (in nanometers) used
     * to obtain the recorded images. Negative values refer to overfocus.
     * @return FloatColumn
     */
    public FloatColumn getNominalDefocusMin() {
        return delegate.getColumn("nominal_defocus_min", DelegatingFloatColumn::new);
    }

    /**
     * The maximum defocus value of the objective lens (in nanometers) used
     * to obtain the recorded images. Negative values refer to overfocus.
     * @return FloatColumn
     */
    public FloatColumn getNominalDefocusMax() {
        return delegate.getColumn("nominal_defocus_max", DelegatingFloatColumn::new);
    }

    /**
     * The minimum calibrated defocus value of the objective lens (in nanometers) used
     * to obtain the recorded images. Negative values refer to overfocus.
     * @return FloatColumn
     */
    public FloatColumn getCalibratedDefocusMin() {
        return delegate.getColumn("calibrated_defocus_min", DelegatingFloatColumn::new);
    }

    /**
     * The maximum calibrated defocus value of the objective lens (in nanometers) used
     * to obtain the recorded images. Negative values refer to overfocus.
     * @return FloatColumn
     */
    public FloatColumn getCalibratedDefocusMax() {
        return delegate.getColumn("calibrated_defocus_max", DelegatingFloatColumn::new);
    }

    /**
     * The minimum angle at which the specimen was tilted to obtain
     * recorded images.
     * @return FloatColumn
     */
    public FloatColumn getTiltAngleMin() {
        return delegate.getColumn("tilt_angle_min", DelegatingFloatColumn::new);
    }

    /**
     * The maximum angle at which the specimen was tilted to obtain
     * recorded images.
     * @return FloatColumn
     */
    public FloatColumn getTiltAngleMax() {
        return delegate.getColumn("tilt_angle_max", DelegatingFloatColumn::new);
    }

    /**
     * The magnification indicated by the microscope readout.
     * @return IntColumn
     */
    public IntColumn getNominalMagnification() {
        return delegate.getColumn("nominal_magnification", DelegatingIntColumn::new);
    }

    /**
     * The magnification value obtained for a known standard just
     * prior to, during or just after the imaging experiment.
     * @return IntColumn
     */
    public IntColumn getCalibratedMagnification() {
        return delegate.getColumn("calibrated_magnification", DelegatingIntColumn::new);
    }

    /**
     * The source of electrons. The electron gun.
     * @return StrColumn
     */
    public StrColumn getElectronSource() {
        return delegate.getColumn("electron_source", DelegatingStrColumn::new);
    }

    /**
     * The electron dose received by the specimen (electrons per square angstrom).
     * @return FloatColumn
     */
    public FloatColumn getElectronDose() {
        return delegate.getColumn("electron_dose", DelegatingFloatColumn::new);
    }

    /**
     * The type of energy filter spectrometer apparatus.
     * @return StrColumn
     */
    public StrColumn getEnergyFilter() {
        return delegate.getColumn("energy_filter", DelegatingStrColumn::new);
    }

    /**
     * The energy filter range in electron volts (eV)set by spectrometer.
     * @return StrColumn
     */
    public StrColumn getEnergyWindow() {
        return delegate.getColumn("energy_window", DelegatingStrColumn::new);
    }

    /**
     * This data item is a pointer to _citation.id in
     * the CITATION category.
     * @return StrColumn
     */
    public StrColumn getCitationId() {
        return delegate.getColumn("citation_id", DelegatingStrColumn::new);
    }

    /**
     * The mean specimen stage temperature (in kelvin) during imaging
     * in the microscope.
     * @return FloatColumn
     */
    public FloatColumn getTemperature() {
        return delegate.getColumn("temperature", DelegatingFloatColumn::new);
    }

    /**
     * The camera length (in millimeters). The camera length is the
     * product of the objective focal length and the combined magnification
     * of the intermediate and projector lenses when the microscope is
     * operated in the diffraction mode.
     * @return FloatColumn
     */
    public FloatColumn getDetectorDistance() {
        return delegate.getColumn("detector_distance", DelegatingFloatColumn::new);
    }

    /**
     * The specimen temperature minimum (kelvin) for the duration
     * of imaging.
     * @return FloatColumn
     */
    public FloatColumn getRecordingTemperatureMinimum() {
        return delegate.getColumn("recording_temperature_minimum", DelegatingFloatColumn::new);
    }

    /**
     * The specimen temperature maximum (kelvin) for the duration
     * of imaging.
     * @return FloatColumn
     */
    public FloatColumn getRecordingTemperatureMaximum() {
        return delegate.getColumn("recording_temperature_maximum", DelegatingFloatColumn::new);
    }

    /**
     * The type of procedure used to align the microscope electron beam.
     * @return StrColumn
     */
    public StrColumn getAlignmentProcedure() {
        return delegate.getColumn("alignment_procedure", DelegatingStrColumn::new);
    }

    /**
     * The open diameter of the c2 condenser lens,
     * in microns.
     * @return FloatColumn
     */
    public FloatColumn getC2ApertureDiameter() {
        return delegate.getColumn("c2_aperture_diameter", DelegatingFloatColumn::new);
    }

    /**
     * Foreign key to the EM_SPECIMEN category
     * @return StrColumn
     */
    public StrColumn getSpecimenId() {
        return delegate.getColumn("specimen_id", DelegatingStrColumn::new);
    }

    /**
     * Cryogen type used to maintain the specimen stage temperature during imaging
     * in the microscope.
     * @return StrColumn
     */
    public StrColumn getCryogen() {
        return delegate.getColumn("cryogen", DelegatingStrColumn::new);
    }

}