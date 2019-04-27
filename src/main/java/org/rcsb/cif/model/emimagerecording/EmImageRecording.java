package org.rcsb.cif.model.emimagerecording;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
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
     * @return AverageExposureTime
     */
    public AverageExposureTime getAverageExposureTime() {
        return (AverageExposureTime) (isText ? textFields.computeIfAbsent("average_exposure_time",
                AverageExposureTime::new) : getBinaryColumn("average_exposure_time"));
    }

    /**
     * The electron dose received by the specimen per image (electrons per square angstrom).
     * @return AvgElectronDosePerImage
     */
    public AvgElectronDosePerImage getAvgElectronDosePerImage() {
        return (AvgElectronDosePerImage) (isText ? textFields.computeIfAbsent("avg_electron_dose_per_image",
                AvgElectronDosePerImage::new) : getBinaryColumn("avg_electron_dose_per_image"));
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
     * The detector mode used during image recording.
     * @return DetectorMode
     */
    public DetectorMode getDetectorMode() {
        return (DetectorMode) (isText ? textFields.computeIfAbsent("detector_mode",
                DetectorMode::new) : getBinaryColumn("detector_mode"));
    }

    /**
     * The detector type used for recording images.
     * Usually film or CCD camera.
     * @return FilmOrDetectorModel
     */
    public FilmOrDetectorModel getFilmOrDetectorModel() {
        return (FilmOrDetectorModel) (isText ? textFields.computeIfAbsent("film_or_detector_model",
                FilmOrDetectorModel::new) : getBinaryColumn("film_or_detector_model"));
    }

    /**
     * The item _em_image_recording.id uniquely identifies
     * a set of recorded images.
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }

    /**
     * This data item the id of the microscopy settings used in the imaging.
     * @return ImagingId
     */
    public ImagingId getImagingId() {
        return (ImagingId) (isText ? textFields.computeIfAbsent("imaging_id",
                ImagingId::new) : getBinaryColumn("imaging_id"));
    }

    /**
     * The number of diffraction images collected.
     * @return NumDiffractionImages
     */
    public NumDiffractionImages getNumDiffractionImages() {
        return (NumDiffractionImages) (isText ? textFields.computeIfAbsent("num_diffraction_images",
                NumDiffractionImages::new) : getBinaryColumn("num_diffraction_images"));
    }

    /**
     * Number of grids in the microscopy session
     * @return NumGridsImaged
     */
    public NumGridsImaged getNumGridsImaged() {
        return (NumGridsImaged) (isText ? textFields.computeIfAbsent("num_grids_imaged",
                NumGridsImaged::new) : getBinaryColumn("num_grids_imaged"));
    }

    /**
     * The number of micrograph images collected.
     * @return NumRealImages
     */
    public NumRealImages getNumRealImages() {
        return (NumRealImages) (isText ? textFields.computeIfAbsent("num_real_images",
                NumRealImages::new) : getBinaryColumn("num_real_images"));
    }
}
