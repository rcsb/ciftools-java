package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the EM_IMAGE_SCANS category record details
 * of the image scanning device (microdensitometer)
 * and parameters for digitization of the image.
 */
@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
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
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getEntryId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("entry_id", SingleRowStrColumn::new) :
                getBinaryColumn("entry_id"));
    }

    /**
     * The value of _em_image_scans.id must uniquely identify
     * the images scanned.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("id", SingleRowStrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * The number of real images.
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getNumberDigitalImages() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("number_digital_images", SingleRowIntColumn::new) :
                getBinaryColumn("number_digital_images"));
    }

    /**
     * Any additional details about image recording.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDetails() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("details", SingleRowStrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * The scanner model.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getScannerModel() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("scanner_model", SingleRowStrColumn::new) :
                getBinaryColumn("scanner_model"));
    }

    /**
     * The sampling step size (microns) set on the scanner.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getSamplingSize() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("sampling_size", SingleRowFloatColumn::new) :
                getBinaryColumn("sampling_size"));
    }

    /**
     * The optical density range (OD=-log 10 transmission).
     * To the eye OD=1 appears light grey and OD=3 is opaque.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getOdRange() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("od_range", SingleRowFloatColumn::new) :
                getBinaryColumn("od_range"));
    }

    /**
     * The number of bits per pixel.
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getQuantBitSize() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("quant_bit_size", SingleRowIntColumn::new) :
                getBinaryColumn("quant_bit_size"));
    }

    /**
     * This data item is a pointer to _citation.id
     * in the CITATION category.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getCitationId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("citation_id", SingleRowStrColumn::new) :
                getBinaryColumn("citation_id"));
    }

    /**
     * height of scanned image
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getDimensionHeight() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("dimension_height", SingleRowIntColumn::new) :
                getBinaryColumn("dimension_height"));
    }

    /**
     * width of scanned image
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getDimensionWidth() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("dimension_width", SingleRowIntColumn::new) :
                getBinaryColumn("dimension_width"));
    }

    /**
     * Total number of time-slice (movie) frames taken per image.
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getFramesPerImage() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("frames_per_image", SingleRowIntColumn::new) :
                getBinaryColumn("frames_per_image"));
    }

    /**
     * foreign key linked to _em_image_recording
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getImageRecordingId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("image_recording_id", SingleRowStrColumn::new) :
                getBinaryColumn("image_recording_id"));
    }

    /**
     * Range of time-slice (movie) frames used for the reconstruction.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getUsedFramesPerImage() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("used_frames_per_image", SingleRowStrColumn::new) :
                getBinaryColumn("used_frames_per_image"));
    }
}
