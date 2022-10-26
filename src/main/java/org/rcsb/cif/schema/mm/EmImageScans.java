package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the EM_IMAGE_SCANS category record details
 * of the image scanning device (microdensitometer)
 * and parameters for digitization of the image.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class EmImageScans extends DelegatingCategory {
    public EmImageScans(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "entry_id":
                return getEntryId();
            case "id":
                return getId();
            case "number_digital_images":
                return getNumberDigitalImages();
            case "details":
                return getDetails();
            case "scanner_model":
                return getScannerModel();
            case "sampling_size":
                return getSamplingSize();
            case "od_range":
                return getOdRange();
            case "quant_bit_size":
                return getQuantBitSize();
            case "citation_id":
                return getCitationId();
            case "dimension_height":
                return getDimensionHeight();
            case "dimension_width":
                return getDimensionWidth();
            case "frames_per_image":
                return getFramesPerImage();
            case "image_recording_id":
                return getImageRecordingId();
            case "used_frames_per_image":
                return getUsedFramesPerImage();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * This data item is a pointer to _entry.id in the
     * ENTRY category.
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return delegate.getColumn("entry_id", DelegatingStrColumn::new);
    }

    /**
     * The value of _em_image_scans.id must uniquely identify
     * the images scanned.
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * The number of real images.
     * @return IntColumn
     */
    public IntColumn getNumberDigitalImages() {
        return delegate.getColumn("number_digital_images", DelegatingIntColumn::new);
    }

    /**
     * Any additional details about image recording.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

    /**
     * The scanner model.
     * @return StrColumn
     */
    public StrColumn getScannerModel() {
        return delegate.getColumn("scanner_model", DelegatingStrColumn::new);
    }

    /**
     * The sampling step size (microns) set on the scanner.
     * @return FloatColumn
     */
    public FloatColumn getSamplingSize() {
        return delegate.getColumn("sampling_size", DelegatingFloatColumn::new);
    }

    /**
     * The optical density range (OD=-log 10 transmission).
     * To the eye OD=1 appears light grey and OD=3 is opaque.
     * @return FloatColumn
     */
    public FloatColumn getOdRange() {
        return delegate.getColumn("od_range", DelegatingFloatColumn::new);
    }

    /**
     * The number of bits per pixel.
     * @return IntColumn
     */
    public IntColumn getQuantBitSize() {
        return delegate.getColumn("quant_bit_size", DelegatingIntColumn::new);
    }

    /**
     * This data item is a pointer to _citation.id
     * in the CITATION category.
     * @return StrColumn
     */
    public StrColumn getCitationId() {
        return delegate.getColumn("citation_id", DelegatingStrColumn::new);
    }

    /**
     * Height of scanned image, in pixels
     * @return IntColumn
     */
    public IntColumn getDimensionHeight() {
        return delegate.getColumn("dimension_height", DelegatingIntColumn::new);
    }

    /**
     * Width of scanned image, in pixels
     * @return IntColumn
     */
    public IntColumn getDimensionWidth() {
        return delegate.getColumn("dimension_width", DelegatingIntColumn::new);
    }

    /**
     * Total number of time-slice (movie) frames taken per image.
     * @return IntColumn
     */
    public IntColumn getFramesPerImage() {
        return delegate.getColumn("frames_per_image", DelegatingIntColumn::new);
    }

    /**
     * foreign key linked to _em_image_recording
     * @return StrColumn
     */
    public StrColumn getImageRecordingId() {
        return delegate.getColumn("image_recording_id", DelegatingStrColumn::new);
    }

    /**
     * Range of time-slice (movie) frames used for the reconstruction.
     * @return StrColumn
     */
    public StrColumn getUsedFramesPerImage() {
        return delegate.getColumn("used_frames_per_image", DelegatingStrColumn::new);
    }

}