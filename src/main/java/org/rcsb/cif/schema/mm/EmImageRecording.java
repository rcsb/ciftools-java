package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the EM_IMAGE_RECORDING category record details
 * of the image recording (either film/microdensitometer or electronic detector)
 * and parameters for image digitization.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class EmImageRecording extends DelegatingCategory {
    public EmImageRecording(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "average_exposure_time":
                return getAverageExposureTime();
            case "avg_electron_dose_per_subtomogram":
                return getAvgElectronDosePerSubtomogram();
            case "avg_electron_dose_per_image":
                return getAvgElectronDosePerImage();
            case "details":
                return getDetails();
            case "detector_mode":
                return getDetectorMode();
            case "film_or_detector_model":
                return getFilmOrDetectorModel();
            case "id":
                return getId();
            case "imaging_id":
                return getImagingId();
            case "num_diffraction_images":
                return getNumDiffractionImages();
            case "num_grids_imaged":
                return getNumGridsImaged();
            case "num_real_images":
                return getNumRealImages();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The average exposure time for each image.
     * @return FloatColumn
     */
    public FloatColumn getAverageExposureTime() {
        return delegate.getColumn("average_exposure_time", DelegatingFloatColumn::new);
    }

    /**
     * The average total electron dose received by the specimen for each subtomogram (electrons per square angstrom).
     * @return FloatColumn
     */
    public FloatColumn getAvgElectronDosePerSubtomogram() {
        return delegate.getColumn("avg_electron_dose_per_subtomogram", DelegatingFloatColumn::new);
    }

    /**
     * The electron dose received by the specimen per image (electrons per square angstrom).
     * @return FloatColumn
     */
    public FloatColumn getAvgElectronDosePerImage() {
        return delegate.getColumn("avg_electron_dose_per_image", DelegatingFloatColumn::new);
    }

    /**
     * Any additional details about image recording.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

    /**
     * The detector mode used during image recording.
     * @return StrColumn
     */
    public StrColumn getDetectorMode() {
        return delegate.getColumn("detector_mode", DelegatingStrColumn::new);
    }

    /**
     * The detector type used for recording images.
     * Usually film , CCD camera or direct electron detector.
     * @return StrColumn
     */
    public StrColumn getFilmOrDetectorModel() {
        return delegate.getColumn("film_or_detector_model", DelegatingStrColumn::new);
    }

    /**
     * PRIMARY KEY
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * This data item the id of the microscopy settings used in the imaging.
     * @return StrColumn
     */
    public StrColumn getImagingId() {
        return delegate.getColumn("imaging_id", DelegatingStrColumn::new);
    }

    /**
     * The number of diffraction images collected.
     * @return IntColumn
     */
    public IntColumn getNumDiffractionImages() {
        return delegate.getColumn("num_diffraction_images", DelegatingIntColumn::new);
    }

    /**
     * Number of grids in the microscopy session
     * @return IntColumn
     */
    public IntColumn getNumGridsImaged() {
        return delegate.getColumn("num_grids_imaged", DelegatingIntColumn::new);
    }

    /**
     * The number of micrograph images collected.
     * @return IntColumn
     */
    public IntColumn getNumRealImages() {
        return delegate.getColumn("num_real_images", DelegatingIntColumn::new);
    }

}