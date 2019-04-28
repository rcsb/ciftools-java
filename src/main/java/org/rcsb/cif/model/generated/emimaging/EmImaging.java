package org.rcsb.cif.model.generated.emimaging;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
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
     * @return EntryId
     */
    public EntryId getEntryId() {
        return (EntryId) (isText ? textFields.computeIfAbsent("entry_id",
                EntryId::new) : getBinaryColumn("entry_id"));
    }

    /**
     * The value of _em_imaging.id must uniquely identify
     * each imaging experiment.
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }

    /**
     * astigmatism
     * @return Astigmatism
     */
    public Astigmatism getAstigmatism() {
        return (Astigmatism) (isText ? textFields.computeIfAbsent("astigmatism",
                Astigmatism::new) : getBinaryColumn("astigmatism"));
    }

    /**
     * electron beam tilt params
     * @return ElectronBeamTiltParams
     */
    public ElectronBeamTiltParams getElectronBeamTiltParams() {
        return (ElectronBeamTiltParams) (isText ? textFields.computeIfAbsent("electron_beam_tilt_params",
                ElectronBeamTiltParams::new) : getBinaryColumn("electron_beam_tilt_params"));
    }

    /**
     * residual tilt of the electron beam
     * @return ResidualTilt
     */
    public ResidualTilt getResidualTilt() {
        return (ResidualTilt) (isText ? textFields.computeIfAbsent("residual_tilt",
                ResidualTilt::new) : getBinaryColumn("residual_tilt"));
    }

    /**
     * This data item is a pointer to _em_sample_support.id in
     * the EM_SAMPLE_SUPPORT category.
     * @return SampleSupportId
     */
    public SampleSupportId getSampleSupportId() {
        return (SampleSupportId) (isText ? textFields.computeIfAbsent("sample_support_id",
                SampleSupportId::new) : getBinaryColumn("sample_support_id"));
    }

    /**
     * The value of _em_imaging.detector_id must uniquely identify
     * the type of detector used in the experiment.
     * @return DetectorId
     */
    public DetectorId getDetectorId() {
        return (DetectorId) (isText ? textFields.computeIfAbsent("detector_id",
                DetectorId::new) : getBinaryColumn("detector_id"));
    }

    /**
     * The value of _em_imaging.scans_id must uniquely identify
     * the image_scans used in the experiment.
     * @return ScansId
     */
    public ScansId getScansId() {
        return (ScansId) (isText ? textFields.computeIfAbsent("scans_id",
                ScansId::new) : getBinaryColumn("scans_id"));
    }

    /**
     * This data item is a pointer to _em_microscope.id in
     * the EM_MICROSCOPE category.
     * @return MicroscopeId
     */
    public MicroscopeId getMicroscopeId() {
        return (MicroscopeId) (isText ? textFields.computeIfAbsent("microscope_id",
                MicroscopeId::new) : getBinaryColumn("microscope_id"));
    }

    /**
     * The name of the model of microscope.
     * @return MicroscopeModel
     */
    public MicroscopeModel getMicroscopeModel() {
        return (MicroscopeModel) (isText ? textFields.computeIfAbsent("microscope_model",
                MicroscopeModel::new) : getBinaryColumn("microscope_model"));
    }

    /**
     * The type of specimen holder used during imaging.
     * @return SpecimenHolderType
     */
    public SpecimenHolderType getSpecimenHolderType() {
        return (SpecimenHolderType) (isText ? textFields.computeIfAbsent("specimen_holder_type",
                SpecimenHolderType::new) : getBinaryColumn("specimen_holder_type"));
    }

    /**
     * The name of the model of specimen holder used during imaging.
     * @return SpecimenHolderModel
     */
    public SpecimenHolderModel getSpecimenHolderModel() {
        return (SpecimenHolderModel) (isText ? textFields.computeIfAbsent("specimen_holder_model",
                SpecimenHolderModel::new) : getBinaryColumn("specimen_holder_model"));
    }

    /**
     * Any additional imaging details.
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
    }

    /**
     * Date (YYYY-MM-DD) of imaging experiment or the date at which
     * a series of experiments began.
     * @return Date
     */
    public Date getDate() {
        return (Date) (isText ? textFields.computeIfAbsent("date",
                Date::new) : getBinaryColumn("date"));
    }

    /**
     * A value of accelerating voltage (in kV) used for imaging.
     * @return AcceleratingVoltage
     */
    public AcceleratingVoltage getAcceleratingVoltage() {
        return (AcceleratingVoltage) (isText ? textFields.computeIfAbsent("accelerating_voltage",
                AcceleratingVoltage::new) : getBinaryColumn("accelerating_voltage"));
    }

    /**
     * The mode of illumination.
     * @return IlluminationMode
     */
    public IlluminationMode getIlluminationMode() {
        return (IlluminationMode) (isText ? textFields.computeIfAbsent("illumination_mode",
                IlluminationMode::new) : getBinaryColumn("illumination_mode"));
    }

    /**
     * The mode of imaging.
     * @return Mode
     */
    public Mode getMode() {
        return (Mode) (isText ? textFields.computeIfAbsent("mode",
                Mode::new) : getBinaryColumn("mode"));
    }

    /**
     * The spherical aberration coefficient (Cs) in millimeters,
     * of the objective lens.
     * @return NominalCs
     */
    public NominalCs getNominalCs() {
        return (NominalCs) (isText ? textFields.computeIfAbsent("nominal_cs",
                NominalCs::new) : getBinaryColumn("nominal_cs"));
    }

    /**
     * The minimum defocus value of the objective lens (in nanometers) used
     * to obtain the recorded images.
     * @return NominalDefocusMin
     */
    public NominalDefocusMin getNominalDefocusMin() {
        return (NominalDefocusMin) (isText ? textFields.computeIfAbsent("nominal_defocus_min",
                NominalDefocusMin::new) : getBinaryColumn("nominal_defocus_min"));
    }

    /**
     * The maximum defocus value of the objective lens (in nanometers) used
     * to obtain the recorded images.
     * @return NominalDefocusMax
     */
    public NominalDefocusMax getNominalDefocusMax() {
        return (NominalDefocusMax) (isText ? textFields.computeIfAbsent("nominal_defocus_max",
                NominalDefocusMax::new) : getBinaryColumn("nominal_defocus_max"));
    }

    /**
     * The minimum defocus value of the objective lens (in nanometers) used
     * to obtain the recorded images.
     * @return CalibratedDefocusMin
     */
    public CalibratedDefocusMin getCalibratedDefocusMin() {
        return (CalibratedDefocusMin) (isText ? textFields.computeIfAbsent("calibrated_defocus_min",
                CalibratedDefocusMin::new) : getBinaryColumn("calibrated_defocus_min"));
    }

    /**
     * The maximum defocus value of the objective lens (in nanometers) used
     * to obtain the recorded images.
     * @return CalibratedDefocusMax
     */
    public CalibratedDefocusMax getCalibratedDefocusMax() {
        return (CalibratedDefocusMax) (isText ? textFields.computeIfAbsent("calibrated_defocus_max",
                CalibratedDefocusMax::new) : getBinaryColumn("calibrated_defocus_max"));
    }

    /**
     * The minimum angle at which the specimen was tilted to obtain
     * recorded images.
     * @return TiltAngleMin
     */
    public TiltAngleMin getTiltAngleMin() {
        return (TiltAngleMin) (isText ? textFields.computeIfAbsent("tilt_angle_min",
                TiltAngleMin::new) : getBinaryColumn("tilt_angle_min"));
    }

    /**
     * The maximum angle at which the specimen was tilted to obtain
     * recorded images.
     * @return TiltAngleMax
     */
    public TiltAngleMax getTiltAngleMax() {
        return (TiltAngleMax) (isText ? textFields.computeIfAbsent("tilt_angle_max",
                TiltAngleMax::new) : getBinaryColumn("tilt_angle_max"));
    }

    /**
     * The magnification indicated by the microscope readout.
     * @return NominalMagnification
     */
    public NominalMagnification getNominalMagnification() {
        return (NominalMagnification) (isText ? textFields.computeIfAbsent("nominal_magnification",
                NominalMagnification::new) : getBinaryColumn("nominal_magnification"));
    }

    /**
     * The magnification value obtained for a known standard just
     * prior to, during or just after the imaging experiment.
     * @return CalibratedMagnification
     */
    public CalibratedMagnification getCalibratedMagnification() {
        return (CalibratedMagnification) (isText ? textFields.computeIfAbsent("calibrated_magnification",
                CalibratedMagnification::new) : getBinaryColumn("calibrated_magnification"));
    }

    /**
     * The source of electrons. The electron gun.
     * @return ElectronSource
     */
    public ElectronSource getElectronSource() {
        return (ElectronSource) (isText ? textFields.computeIfAbsent("electron_source",
                ElectronSource::new) : getBinaryColumn("electron_source"));
    }

    /**
     * The electron dose received by the specimen (electrons per square angstrom).
     * @return ElectronDose
     */
    public ElectronDose getElectronDose() {
        return (ElectronDose) (isText ? textFields.computeIfAbsent("electron_dose",
                ElectronDose::new) : getBinaryColumn("electron_dose"));
    }

    /**
     * The type of energy filter spectrometer apparatus.
     * @return EnergyFilter
     */
    public EnergyFilter getEnergyFilter() {
        return (EnergyFilter) (isText ? textFields.computeIfAbsent("energy_filter",
                EnergyFilter::new) : getBinaryColumn("energy_filter"));
    }

    /**
     * The energy filter range in electron volts (eV)set by spectrometer.
     * @return EnergyWindow
     */
    public EnergyWindow getEnergyWindow() {
        return (EnergyWindow) (isText ? textFields.computeIfAbsent("energy_window",
                EnergyWindow::new) : getBinaryColumn("energy_window"));
    }

    /**
     * This data item is a pointer to _citation.id in
     * the CITATION category.
     * @return CitationId
     */
    public CitationId getCitationId() {
        return (CitationId) (isText ? textFields.computeIfAbsent("citation_id",
                CitationId::new) : getBinaryColumn("citation_id"));
    }

    /**
     * The mean specimen stage temperature (degrees Kelvin) during imaging
     * in the microscope.
     * @return Temperature
     */
    public Temperature getTemperature() {
        return (Temperature) (isText ? textFields.computeIfAbsent("temperature",
                Temperature::new) : getBinaryColumn("temperature"));
    }

    /**
     * The camera length (in millimeters). The camera length is the
     * product of the objective focal length and the combined magnification
     * of the intermediate and projector lenses when the microscope is
     * operated in the diffraction mode.
     * @return DetectorDistance
     */
    public DetectorDistance getDetectorDistance() {
        return (DetectorDistance) (isText ? textFields.computeIfAbsent("detector_distance",
                DetectorDistance::new) : getBinaryColumn("detector_distance"));
    }

    /**
     * The specimen temperature minimum (degrees Kelvin) for the duration
     * of imaging.
     * @return RecordingTemperatureMinimum
     */
    public RecordingTemperatureMinimum getRecordingTemperatureMinimum() {
        return (RecordingTemperatureMinimum) (isText ? textFields.computeIfAbsent("recording_temperature_minimum",
                RecordingTemperatureMinimum::new) : getBinaryColumn("recording_temperature_minimum"));
    }

    /**
     * The specimen temperature maximum (degrees Kelvin) for the duration
     * of imaging.
     * @return RecordingTemperatureMaximum
     */
    public RecordingTemperatureMaximum getRecordingTemperatureMaximum() {
        return (RecordingTemperatureMaximum) (isText ? textFields.computeIfAbsent("recording_temperature_maximum",
                RecordingTemperatureMaximum::new) : getBinaryColumn("recording_temperature_maximum"));
    }

    /**
     * microscope alignment procedure
     * @return AlignmentProcedure
     */
    public AlignmentProcedure getAlignmentProcedure() {
        return (AlignmentProcedure) (isText ? textFields.computeIfAbsent("alignment_procedure",
                AlignmentProcedure::new) : getBinaryColumn("alignment_procedure"));
    }

    /**
     * The open diameter of the c2 condenser lens,
     * in microns.
     * @return C2ApertureDiameter
     */
    public C2ApertureDiameter getC2ApertureDiameter() {
        return (C2ApertureDiameter) (isText ? textFields.computeIfAbsent("c2_aperture_diameter",
                C2ApertureDiameter::new) : getBinaryColumn("c2_aperture_diameter"));
    }

    /**
     * Foreign key to the EM_SPECIMEN category
     * @return SpecimenId
     */
    public SpecimenId getSpecimenId() {
        return (SpecimenId) (isText ? textFields.computeIfAbsent("specimen_id",
                SpecimenId::new) : getBinaryColumn("specimen_id"));
    }

    /**
     * Cryogen type used to maintain the specimen stage temperature during imaging
     * in the microscope.
     * @return Cryogen
     */
    public Cryogen getCryogen() {
        return (Cryogen) (isText ? textFields.computeIfAbsent("cryogen",
                Cryogen::new) : getBinaryColumn("cryogen"));
    }
}
