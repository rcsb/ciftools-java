package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the EM_IMAGE_RECORDING category record details
 * of the image recording (either film/microdensitometer or electronic detector)
 * and parameters for image digitization.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class EmImageRecording extends BaseCategory {
    public EmImageRecording(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public EmImageRecording(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public EmImageRecording(String name) {
        super(name);
    }

    /**
     * The average exposure time for each image.
     * @return FloatColumn
     */
    public FloatColumn getAverageExposureTime() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("average_exposure_time", FloatColumn::new) :
                getBinaryColumn("average_exposure_time"));
    }

    /**
     * The electron dose received by the specimen per image (electrons per square angstrom).
     * @return FloatColumn
     */
    public FloatColumn getAvgElectronDosePerImage() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("avg_electron_dose_per_image", FloatColumn::new) :
                getBinaryColumn("avg_electron_dose_per_image"));
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
     * The detector mode used during image recording.
     * @return StrColumn
     */
    public StrColumn getDetectorMode() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("detector_mode", StrColumn::new) :
                getBinaryColumn("detector_mode"));
    }

    /**
     * The detector type used for recording images.
     * Usually film or CCD camera.
     * @return StrColumn
     */
    public StrColumn getFilmOrDetectorModel() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("film_or_detector_model", StrColumn::new) :
                getBinaryColumn("film_or_detector_model"));
    }

    /**
     * The item _em_image_recording.id uniquely identifies
     * a set of recorded images.
     * @return StrColumn
     */
    public StrColumn getId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("id", StrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * This data item the id of the microscopy settings used in the imaging.
     * @return StrColumn
     */
    public StrColumn getImagingId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("imaging_id", StrColumn::new) :
                getBinaryColumn("imaging_id"));
    }

    /**
     * The number of diffraction images collected.
     * @return IntColumn
     */
    public IntColumn getNumDiffractionImages() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("num_diffraction_images", IntColumn::new) :
                getBinaryColumn("num_diffraction_images"));
    }

    /**
     * Number of grids in the microscopy session
     * @return IntColumn
     */
    public IntColumn getNumGridsImaged() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("num_grids_imaged", IntColumn::new) :
                getBinaryColumn("num_grids_imaged"));
    }

    /**
     * The number of micrograph images collected.
     * @return IntColumn
     */
    public IntColumn getNumRealImages() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("num_real_images", IntColumn::new) :
                getBinaryColumn("num_real_images"));
    }
}
