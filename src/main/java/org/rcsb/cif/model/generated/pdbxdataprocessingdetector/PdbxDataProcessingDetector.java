package org.rcsb.cif.model.generated.pdbxdataprocessingdetector;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxDataProcessingDetector extends BaseCategory {
    public PdbxDataProcessingDetector(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxDataProcessingDetector(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxDataProcessingDetector(String name) {
        super(name);
    }

    /**
     * The value of _pdbx_data_processing_detector.entry_id identifies the data block.
     * @return EntryId
     */
    public EntryId getEntryId() {
        return (EntryId) (isText ? textFields.computeIfAbsent("entry_id",
                EntryId::new) : getBinaryColumn("entry_id"));
    }

    /**
     * The name and type of detector.
     * @return Name
     */
    public Name getName() {
        return (Name) (isText ? textFields.computeIfAbsent("name",
                Name::new) : getBinaryColumn("name"));
    }

    /**
     * The wavelength of data collection.
     * @return Wavelength
     */
    public Wavelength getWavelength() {
        return (Wavelength) (isText ? textFields.computeIfAbsent("wavelength",
                Wavelength::new) : getBinaryColumn("wavelength"));
    }

    /**
     * The polarization measured in data collection.
     * @return Polarization
     */
    public Polarization getPolarization() {
        return (Polarization) (isText ? textFields.computeIfAbsent("polarization",
                Polarization::new) : getBinaryColumn("polarization"));
    }

    /**
     * The sample position in the beam in the X direction.
     * @return BeamPositionX
     */
    public BeamPositionX getBeamPositionX() {
        return (BeamPositionX) (isText ? textFields.computeIfAbsent("beam_position_x",
                BeamPositionX::new) : getBinaryColumn("beam_position_x"));
    }

    /**
     * The sample position in the beam in the Y direction.
     * @return BeamPositionY
     */
    public BeamPositionY getBeamPositionY() {
        return (BeamPositionY) (isText ? textFields.computeIfAbsent("beam_position_y",
                BeamPositionY::new) : getBinaryColumn("beam_position_y"));
    }

    /**
     * The cassette rotation about the X axis.
     * @return CassetteRotX
     */
    public CassetteRotX getCassetteRotX() {
        return (CassetteRotX) (isText ? textFields.computeIfAbsent("cassette_rot_x",
                CassetteRotX::new) : getBinaryColumn("cassette_rot_x"));
    }

    /**
     * The cassette rotation about the Y axis.
     * @return CassetteRotY
     */
    public CassetteRotY getCassetteRotY() {
        return (CassetteRotY) (isText ? textFields.computeIfAbsent("cassette_rot_y",
                CassetteRotY::new) : getBinaryColumn("cassette_rot_y"));
    }

    /**
     * The cassette rotation about the Z axis.
     * @return CassetteRotZ
     */
    public CassetteRotZ getCassetteRotZ() {
        return (CassetteRotZ) (isText ? textFields.computeIfAbsent("cassette_rot_z",
                CassetteRotZ::new) : getBinaryColumn("cassette_rot_z"));
    }

    /**
     * The value applied to the Y direction.
     * @return ScaleY
     */
    public ScaleY getScaleY() {
        return (ScaleY) (isText ? textFields.computeIfAbsent("scale_y",
                ScaleY::new) : getBinaryColumn("scale_y"));
    }

    /**
     * The skew value.
     * @return Skew
     */
    public Skew getSkew() {
        return (Skew) (isText ? textFields.computeIfAbsent("skew",
                Skew::new) : getBinaryColumn("skew"));
    }

    /**
     * The detector crossfire value in the X direction.
     * @return CrossfireX
     */
    public CrossfireX getCrossfireX() {
        return (CrossfireX) (isText ? textFields.computeIfAbsent("crossfire_x",
                CrossfireX::new) : getBinaryColumn("crossfire_x"));
    }

    /**
     * The detector crossfire value in the Y direction.
     * @return CrossfireY
     */
    public CrossfireY getCrossfireY() {
        return (CrossfireY) (isText ? textFields.computeIfAbsent("crossfire_y",
                CrossfireY::new) : getBinaryColumn("crossfire_y"));
    }

    /**
     * The detector coupled crossfire value for XY.
     * @return CrossfireXy
     */
    public CrossfireXy getCrossfireXy() {
        return (CrossfireXy) (isText ? textFields.computeIfAbsent("crossfire_xy",
                CrossfireXy::new) : getBinaryColumn("crossfire_xy"));
    }

    /**
     * Data collection date.
     * @return Date
     */
    public Date getDate() {
        return (Date) (isText ? textFields.computeIfAbsent("date",
                Date::new) : getBinaryColumn("date"));
    }

    /**
     * Name of experimentor.
     * @return Experimentor
     */
    public Experimentor getExperimentor() {
        return (Experimentor) (isText ? textFields.computeIfAbsent("experimentor",
                Experimentor::new) : getBinaryColumn("experimentor"));
    }

    /**
     * Identifier for crystal on which data was collected.
     * @return CrystalDataId
     */
    public CrystalDataId getCrystalDataId() {
        return (CrystalDataId) (isText ? textFields.computeIfAbsent("crystal_data_id",
                CrystalDataId::new) : getBinaryColumn("crystal_data_id"));
    }

    /**
     * File system path to processing data files.
     * @return ProcessingPath
     */
    public ProcessingPath getProcessingPath() {
        return (ProcessingPath) (isText ? textFields.computeIfAbsent("processing_path",
                ProcessingPath::new) : getBinaryColumn("processing_path"));
    }

    /**
     * File system names for the data processing files.
     * @return ProcessingFiles
     */
    public ProcessingFiles getProcessingFiles() {
        return (ProcessingFiles) (isText ? textFields.computeIfAbsent("processing_files",
                ProcessingFiles::new) : getBinaryColumn("processing_files"));
    }
}
