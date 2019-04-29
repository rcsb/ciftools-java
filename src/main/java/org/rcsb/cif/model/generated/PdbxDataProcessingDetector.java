package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Details of the detector used at data collection site.
 */
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
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entry_id", StrColumn::new) :
                getBinaryColumn("entry_id"));
    }

    /**
     * The name and type of detector.
     * @return StrColumn
     */
    public StrColumn getName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("name", StrColumn::new) :
                getBinaryColumn("name"));
    }

    /**
     * The wavelength of data collection.
     * @return FloatColumn
     */
    public FloatColumn getWavelength() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("wavelength", FloatColumn::new) :
                getBinaryColumn("wavelength"));
    }

    /**
     * The polarization measured in data collection.
     * @return FloatColumn
     */
    public FloatColumn getPolarization() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("polarization", FloatColumn::new) :
                getBinaryColumn("polarization"));
    }

    /**
     * The sample position in the beam in the X direction.
     * @return FloatColumn
     */
    public FloatColumn getBeamPositionX() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("beam_position_x", FloatColumn::new) :
                getBinaryColumn("beam_position_x"));
    }

    /**
     * The sample position in the beam in the Y direction.
     * @return FloatColumn
     */
    public FloatColumn getBeamPositionY() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("beam_position_y", FloatColumn::new) :
                getBinaryColumn("beam_position_y"));
    }

    /**
     * The cassette rotation about the X axis.
     * @return FloatColumn
     */
    public FloatColumn getCassetteRotX() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("cassette_rot_x", FloatColumn::new) :
                getBinaryColumn("cassette_rot_x"));
    }

    /**
     * The cassette rotation about the Y axis.
     * @return FloatColumn
     */
    public FloatColumn getCassetteRotY() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("cassette_rot_y", FloatColumn::new) :
                getBinaryColumn("cassette_rot_y"));
    }

    /**
     * The cassette rotation about the Z axis.
     * @return FloatColumn
     */
    public FloatColumn getCassetteRotZ() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("cassette_rot_z", FloatColumn::new) :
                getBinaryColumn("cassette_rot_z"));
    }

    /**
     * The value applied to the Y direction.
     * @return FloatColumn
     */
    public FloatColumn getScaleY() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("scale_y", FloatColumn::new) :
                getBinaryColumn("scale_y"));
    }

    /**
     * The skew value.
     * @return FloatColumn
     */
    public FloatColumn getSkew() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("skew", FloatColumn::new) :
                getBinaryColumn("skew"));
    }

    /**
     * The detector crossfire value in the X direction.
     * @return FloatColumn
     */
    public FloatColumn getCrossfireX() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("crossfire_x", FloatColumn::new) :
                getBinaryColumn("crossfire_x"));
    }

    /**
     * The detector crossfire value in the Y direction.
     * @return FloatColumn
     */
    public FloatColumn getCrossfireY() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("crossfire_y", FloatColumn::new) :
                getBinaryColumn("crossfire_y"));
    }

    /**
     * The detector coupled crossfire value for XY.
     * @return FloatColumn
     */
    public FloatColumn getCrossfireXy() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("crossfire_xy", FloatColumn::new) :
                getBinaryColumn("crossfire_xy"));
    }

    /**
     * Data collection date.
     * @return StrColumn
     */
    public StrColumn getDate() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("date", StrColumn::new) :
                getBinaryColumn("date"));
    }

    /**
     * Name of experimentor.
     * @return StrColumn
     */
    public StrColumn getExperimentor() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("experimentor", StrColumn::new) :
                getBinaryColumn("experimentor"));
    }

    /**
     * Identifier for crystal on which data was collected.
     * @return StrColumn
     */
    public StrColumn getCrystalDataId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("crystal_data_id", StrColumn::new) :
                getBinaryColumn("crystal_data_id"));
    }

    /**
     * File system path to processing data files.
     * @return StrColumn
     */
    public StrColumn getProcessingPath() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("processing_path", StrColumn::new) :
                getBinaryColumn("processing_path"));
    }

    /**
     * File system names for the data processing files.
     * @return StrColumn
     */
    public StrColumn getProcessingFiles() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("processing_files", StrColumn::new) :
                getBinaryColumn("processing_files"));
    }
}
