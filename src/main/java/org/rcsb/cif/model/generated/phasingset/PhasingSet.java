package org.rcsb.cif.model.generated.phasingset;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PhasingSet extends BaseCategory {
    public PhasingSet(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PhasingSet(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PhasingSet(String name) {
        super(name);
    }

    /**
     * Unit-cell angle alpha for this data set in degrees.
     * @return CellAngleAlpha
     */
    public CellAngleAlpha getCellAngleAlpha() {
        return (CellAngleAlpha) (isText ? textFields.computeIfAbsent("cell_angle_alpha",
                CellAngleAlpha::new) : getBinaryColumn("cell_angle_alpha"));
    }

    /**
     * Unit-cell angle beta for this data set in degrees.
     * @return CellAngleBeta
     */
    public CellAngleBeta getCellAngleBeta() {
        return (CellAngleBeta) (isText ? textFields.computeIfAbsent("cell_angle_beta",
                CellAngleBeta::new) : getBinaryColumn("cell_angle_beta"));
    }

    /**
     * Unit-cell angle gamma for this data set in degrees.
     * @return CellAngleGamma
     */
    public CellAngleGamma getCellAngleGamma() {
        return (CellAngleGamma) (isText ? textFields.computeIfAbsent("cell_angle_gamma",
                CellAngleGamma::new) : getBinaryColumn("cell_angle_gamma"));
    }

    /**
     * Unit-cell length a for this data set in angstroms.
     * @return CellLengthA
     */
    public CellLengthA getCellLengthA() {
        return (CellLengthA) (isText ? textFields.computeIfAbsent("cell_length_a",
                CellLengthA::new) : getBinaryColumn("cell_length_a"));
    }

    /**
     * Unit-cell length b for this data set in angstroms.
     * @return CellLengthB
     */
    public CellLengthB getCellLengthB() {
        return (CellLengthB) (isText ? textFields.computeIfAbsent("cell_length_b",
                CellLengthB::new) : getBinaryColumn("cell_length_b"));
    }

    /**
     * Unit-cell length c for this data set in angstroms.
     * @return CellLengthC
     */
    public CellLengthC getCellLengthC() {
        return (CellLengthC) (isText ? textFields.computeIfAbsent("cell_length_c",
                CellLengthC::new) : getBinaryColumn("cell_length_c"));
    }

    /**
     * The particular radiation detector. In general, this will be a
     * manufacturer, description, model number or some combination of
     * these.
     * @return DetectorSpecific
     */
    public DetectorSpecific getDetectorSpecific() {
        return (DetectorSpecific) (isText ? textFields.computeIfAbsent("detector_specific",
                DetectorSpecific::new) : getBinaryColumn("detector_specific"));
    }

    /**
     * The general class of the radiation detector.
     * @return DetectorType
     */
    public DetectorType getDetectorType() {
        return (DetectorType) (isText ? textFields.computeIfAbsent("detector_type",
                DetectorType::new) : getBinaryColumn("detector_type"));
    }

    /**
     * The value of _phasing_set.id must uniquely identify
     * a record in the PHASING_SET list.
     * 
     * Note that this item need not be a number; it can be any unique
     * identifier.
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }

    /**
     * The particular source of radiation. In general, this will be a
     * manufacturer, description, or model number (or some combination
     * of these) for laboratory sources and an institution name and
     * beamline name for synchrotron sources.
     * @return RadiationSourceSpecific
     */
    public RadiationSourceSpecific getRadiationSourceSpecific() {
        return (RadiationSourceSpecific) (isText ? textFields.computeIfAbsent("radiation_source_specific",
                RadiationSourceSpecific::new) : getBinaryColumn("radiation_source_specific"));
    }

    /**
     * The mean wavelength of the radiation used to measure this
     * data set.
     * @return RadiationWavelength
     */
    public RadiationWavelength getRadiationWavelength() {
        return (RadiationWavelength) (isText ? textFields.computeIfAbsent("radiation_wavelength",
                RadiationWavelength::new) : getBinaryColumn("radiation_wavelength"));
    }

    /**
     * The temperature in kelvins at which the data set was
     * measured.
     * @return Temp
     */
    public Temp getTemp() {
        return (Temp) (isText ? textFields.computeIfAbsent("temp",
                Temp::new) : getBinaryColumn("temp"));
    }

    /**
     * The value of _phasing_set.pdbx_temp_details describes any
     * special details about the data collection temperature
     * for this phasing data set.
     * @return PdbxTempDetails
     */
    public PdbxTempDetails getPdbxTempDetails() {
        return (PdbxTempDetails) (isText ? textFields.computeIfAbsent("pdbx_temp_details",
                PdbxTempDetails::new) : getBinaryColumn("pdbx_temp_details"));
    }

    /**
     * The smallest value in angstroms for the interplanar spacings
     * for the reflections in this shell. This is called the highest
     * resolution.
     * @return PdbxDResHigh
     */
    public PdbxDResHigh getPdbxDResHigh() {
        return (PdbxDResHigh) (isText ? textFields.computeIfAbsent("pdbx_d_res_high",
                PdbxDResHigh::new) : getBinaryColumn("pdbx_d_res_high"));
    }

    /**
     * The highest value in angstroms for the interplanar spacings
     * for the reflections in this shell. This is called the lowest
     * resolution.
     * @return PdbxDResLow
     */
    public PdbxDResLow getPdbxDResLow() {
        return (PdbxDResLow) (isText ? textFields.computeIfAbsent("pdbx_d_res_low",
                PdbxDResLow::new) : getBinaryColumn("pdbx_d_res_low"));
    }
}
