package org.rcsb.cif.model.generated.emimagescans;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

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
     * @return EntryId
     */
    public EntryId getEntryId() {
        return (EntryId) (isText ? textFields.computeIfAbsent("entry_id",
                EntryId::new) : getBinaryColumn("entry_id"));
    }

    /**
     * The value of _em_image_scans.id must uniquely identify
     * the images scanned.
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }

    /**
     * The number of real images.
     * @return NumberDigitalImages
     */
    public NumberDigitalImages getNumberDigitalImages() {
        return (NumberDigitalImages) (isText ? textFields.computeIfAbsent("number_digital_images",
                NumberDigitalImages::new) : getBinaryColumn("number_digital_images"));
    }

    /**
     * Any additional details about image recording.
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
    }

    /**
     * The scanner model.
     * @return ScannerModel
     */
    public ScannerModel getScannerModel() {
        return (ScannerModel) (isText ? textFields.computeIfAbsent("scanner_model",
                ScannerModel::new) : getBinaryColumn("scanner_model"));
    }

    /**
     * The sampling step size (microns) set on the scanner.
     * @return SamplingSize
     */
    public SamplingSize getSamplingSize() {
        return (SamplingSize) (isText ? textFields.computeIfAbsent("sampling_size",
                SamplingSize::new) : getBinaryColumn("sampling_size"));
    }

    /**
     * The optical density range (OD=-log 10 transmission).
     * To the eye OD=1 appears light grey and OD=3 is opaque.
     * @return OdRange
     */
    public OdRange getOdRange() {
        return (OdRange) (isText ? textFields.computeIfAbsent("od_range",
                OdRange::new) : getBinaryColumn("od_range"));
    }

    /**
     * The number of bits per pixel.
     * @return QuantBitSize
     */
    public QuantBitSize getQuantBitSize() {
        return (QuantBitSize) (isText ? textFields.computeIfAbsent("quant_bit_size",
                QuantBitSize::new) : getBinaryColumn("quant_bit_size"));
    }

    /**
     * This data item is a pointer to _citation.id
     * in the CITATION category.
     * @return CitationId
     */
    public CitationId getCitationId() {
        return (CitationId) (isText ? textFields.computeIfAbsent("citation_id",
                CitationId::new) : getBinaryColumn("citation_id"));
    }

    /**
     * height of scanned image
     * @return DimensionHeight
     */
    public DimensionHeight getDimensionHeight() {
        return (DimensionHeight) (isText ? textFields.computeIfAbsent("dimension_height",
                DimensionHeight::new) : getBinaryColumn("dimension_height"));
    }

    /**
     * width of scanned image
     * @return DimensionWidth
     */
    public DimensionWidth getDimensionWidth() {
        return (DimensionWidth) (isText ? textFields.computeIfAbsent("dimension_width",
                DimensionWidth::new) : getBinaryColumn("dimension_width"));
    }

    /**
     * Total number of time-slice (movie) frames taken per image.
     * @return FramesPerImage
     */
    public FramesPerImage getFramesPerImage() {
        return (FramesPerImage) (isText ? textFields.computeIfAbsent("frames_per_image",
                FramesPerImage::new) : getBinaryColumn("frames_per_image"));
    }

    /**
     * foreign key linked to _em_image_recording
     * @return ImageRecordingId
     */
    public ImageRecordingId getImageRecordingId() {
        return (ImageRecordingId) (isText ? textFields.computeIfAbsent("image_recording_id",
                ImageRecordingId::new) : getBinaryColumn("image_recording_id"));
    }

    /**
     * Range of time-slice (movie) frames used for the reconstruction.
     * @return UsedFramesPerImage
     */
    public UsedFramesPerImage getUsedFramesPerImage() {
        return (UsedFramesPerImage) (isText ? textFields.computeIfAbsent("used_frames_per_image",
                UsedFramesPerImage::new) : getBinaryColumn("used_frames_per_image"));
    }
}
