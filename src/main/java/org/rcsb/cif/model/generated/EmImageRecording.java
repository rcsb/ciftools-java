package org.rcsb.cif.model.generated;

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
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getAverageExposureTime() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("average_exposure_time", SingleRowFloatColumn::new) :
                getBinaryColumn("average_exposure_time"));
    }

    /**
     * The electron dose received by the specimen per image (electrons per square angstrom).
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getAvgElectronDosePerImage() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("avg_electron_dose_per_image", SingleRowFloatColumn::new) :
                getBinaryColumn("avg_electron_dose_per_image"));
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
     * The detector mode used during image recording.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDetectorMode() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("detector_mode", SingleRowStrColumn::new) :
                getBinaryColumn("detector_mode"));
    }

    /**
     * The detector type used for recording images.
     * Usually film or CCD camera.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getFilmOrDetectorModel() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("film_or_detector_model", SingleRowStrColumn::new) :
                getBinaryColumn("film_or_detector_model"));
    }

    /**
     * The item _em_image_recording.id uniquely identifies
     * a set of recorded images.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("id", SingleRowStrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * This data item the id of the microscopy settings used in the imaging.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getImagingId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("imaging_id", SingleRowStrColumn::new) :
                getBinaryColumn("imaging_id"));
    }

    /**
     * The number of diffraction images collected.
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getNumDiffractionImages() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("num_diffraction_images", SingleRowIntColumn::new) :
                getBinaryColumn("num_diffraction_images"));
    }

    /**
     * Number of grids in the microscopy session
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getNumGridsImaged() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("num_grids_imaged", SingleRowIntColumn::new) :
                getBinaryColumn("num_grids_imaged"));
    }

    /**
     * The number of micrograph images collected.
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getNumRealImages() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("num_real_images", SingleRowIntColumn::new) :
                getBinaryColumn("num_real_images"));
    }
}
