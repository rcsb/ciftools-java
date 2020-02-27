package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the EM_IMAGE_SCANS category record details
 * of the image scanning device (microdensitometer)
 * and parameters for digitization of the image.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class EmImageScans extends BaseCategory {
    public EmImageScans(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public EmImageScans(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public EmImageScans(String name) {
        super(name);
    }

    /**
     * This data item is a pointer to _entry.id in the
     * ENTRY category.
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entry_id", StrColumn::new) :
                getBinaryColumn("entry_id"));
    }

    /**
     * The value of _em_image_scans.id must uniquely identify
     * the images scanned.
     * @return StrColumn
     */
    public StrColumn getId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("id", StrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * The number of real images.
     * @return IntColumn
     */
    public IntColumn getNumberDigitalImages() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("number_digital_images", IntColumn::new) :
                getBinaryColumn("number_digital_images"));
    }

    /**
     * Any additional details about image recording.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * The scanner model.
     * @return StrColumn
     */
    public StrColumn getScannerModel() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("scanner_model", StrColumn::new) :
                getBinaryColumn("scanner_model"));
    }

    /**
     * The sampling step size (microns) set on the scanner.
     * @return FloatColumn
     */
    public FloatColumn getSamplingSize() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("sampling_size", FloatColumn::new) :
                getBinaryColumn("sampling_size"));
    }

    /**
     * The optical density range (OD=-log 10 transmission).
     * To the eye OD=1 appears light grey and OD=3 is opaque.
     * @return FloatColumn
     */
    public FloatColumn getOdRange() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("od_range", FloatColumn::new) :
                getBinaryColumn("od_range"));
    }

    /**
     * The number of bits per pixel.
     * @return IntColumn
     */
    public IntColumn getQuantBitSize() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("quant_bit_size", IntColumn::new) :
                getBinaryColumn("quant_bit_size"));
    }

    /**
     * This data item is a pointer to _citation.id
     * in the CITATION category.
     * @return StrColumn
     */
    public StrColumn getCitationId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("citation_id", StrColumn::new) :
                getBinaryColumn("citation_id"));
    }

    /**
     * height of scanned image
     * @return IntColumn
     */
    public IntColumn getDimensionHeight() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("dimension_height", IntColumn::new) :
                getBinaryColumn("dimension_height"));
    }

    /**
     * width of scanned image
     * @return IntColumn
     */
    public IntColumn getDimensionWidth() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("dimension_width", IntColumn::new) :
                getBinaryColumn("dimension_width"));
    }

    /**
     * Total number of time-slice (movie) frames taken per image.
     * @return IntColumn
     */
    public IntColumn getFramesPerImage() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("frames_per_image", IntColumn::new) :
                getBinaryColumn("frames_per_image"));
    }

    /**
     * foreign key linked to _em_image_recording
     * @return StrColumn
     */
    public StrColumn getImageRecordingId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("image_recording_id", StrColumn::new) :
                getBinaryColumn("image_recording_id"));
    }

    /**
     * Range of time-slice (movie) frames used for the reconstruction.
     * @return StrColumn
     */
    public StrColumn getUsedFramesPerImage() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("used_frames_per_image", StrColumn::new) :
                getBinaryColumn("used_frames_per_image"));
    }
}
