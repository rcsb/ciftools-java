package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the EM_3D_RECONSTRUCTION category
 * record details of the 3D reconstruction procedure from 2D projections.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class Em3dReconstruction extends DelegatingCategory {
    public Em3dReconstruction(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "entry_id":
                return getEntryId();
            case "id":
                return getId();
            case "method":
                return getMethod();
            case "algorithm":
                return getAlgorithm();
            case "citation_id":
                return getCitationId();
            case "details":
                return getDetails();
            case "resolution":
                return getResolution();
            case "resolution_method":
                return getResolutionMethod();
            case "magnification_calibration":
                return getMagnificationCalibration();
            case "ctf_correction_method":
                return getCtfCorrectionMethod();
            case "nominal_pixel_size":
                return getNominalPixelSize();
            case "actual_pixel_size":
                return getActualPixelSize();
            case "num_particles":
                return getNumParticles();
            case "euler_angles_details":
                return getEulerAnglesDetails();
            case "num_class_averages":
                return getNumClassAverages();
            case "software":
                return getSoftware();
            case "fsc_type":
                return getFscType();
            case "refinement_type":
                return getRefinementType();
            case "image_processing_id":
                return getImageProcessingId();
            case "symmetry_type":
                return getSymmetryType();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * This data item is a pointer to _entry.id in the ENTRY category.
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return delegate.getColumn("entry_id", DelegatingStrColumn::new);
    }

    /**
     * PRIMARY KEY
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * The algorithm method used for the 3d-reconstruction.
     * @return StrColumn
     */
    public StrColumn getMethod() {
        return delegate.getColumn("method", DelegatingStrColumn::new);
    }

    /**
     * The reconstruction algorithm/technique used to generate the map.
     * @return StrColumn
     */
    public StrColumn getAlgorithm() {
        return delegate.getColumn("algorithm", DelegatingStrColumn::new);
    }

    /**
     * This data item is a pointer to _citation.id in the
     * CITATION category.
     * @return StrColumn
     */
    public StrColumn getCitationId() {
        return delegate.getColumn("citation_id", DelegatingStrColumn::new);
    }

    /**
     * Any additional details used in the 3d reconstruction.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

    /**
     * The final resolution (in angstroms) of the 3D reconstruction.
     * @return FloatColumn
     */
    public FloatColumn getResolution() {
        return delegate.getColumn("resolution", DelegatingFloatColumn::new);
    }

    /**
     * The  method used to determine the final resolution
     * of the 3d reconstruction.
     * The Fourier Shell Correlation criterion as a measure of
     * resolution is based on the concept of splitting the (2D)
     * data set into two halves; averaging each and comparing them
     * using the Fourier Ring Correlation (FRC) technique.
     * @return StrColumn
     */
    public StrColumn getResolutionMethod() {
        return delegate.getColumn("resolution_method", DelegatingStrColumn::new);
    }

    /**
     * The magnification calibration method for the 3d reconstruction.
     * @return StrColumn
     */
    public StrColumn getMagnificationCalibration() {
        return delegate.getColumn("magnification_calibration", DelegatingStrColumn::new);
    }

    /**
     * The  CTF-correction method.
     * The Contrast Transfer Function CTF compensation for low contrast
     * specimens (e.g. frozen-hydrated), for which phase contrast is the only
     * significant mechanism, then higher defocus levels must be used to
     * achieve any significant transfer, and several images at different
     * focus levels must be combined to complete the information lost from
     * the transfer gaps of any one image.  The CTF correction can be applied
     * to each extracted particle separately or to the whole micrograph after
     * digitisation. The simplest level of compensation is to reverse phases
     * at the negative lobes of the CTF.
     * @return StrColumn
     */
    public StrColumn getCtfCorrectionMethod() {
        return delegate.getColumn("ctf_correction_method", DelegatingStrColumn::new);
    }

    /**
     * The nominal pixel size of the projection set of images in Angstroms.
     * @return FloatColumn
     */
    public FloatColumn getNominalPixelSize() {
        return delegate.getColumn("nominal_pixel_size", DelegatingFloatColumn::new);
    }

    /**
     * The actual pixel size of the projection set of images in Angstroms.
     * @return FloatColumn
     */
    public FloatColumn getActualPixelSize() {
        return delegate.getColumn("actual_pixel_size", DelegatingFloatColumn::new);
    }

    /**
     * The number of 2D projections or 3D subtomograms used in the 3d reconstruction
     * @return IntColumn
     */
    public IntColumn getNumParticles() {
        return delegate.getColumn("num_particles", DelegatingIntColumn::new);
    }

    /**
     * euler angles details
     * @return StrColumn
     */
    public StrColumn getEulerAnglesDetails() {
        return delegate.getColumn("euler_angles_details", DelegatingStrColumn::new);
    }

    /**
     * The number of classes used in the final 3d reconstruction
     * @return IntColumn
     */
    public IntColumn getNumClassAverages() {
        return delegate.getColumn("num_class_averages", DelegatingIntColumn::new);
    }

    /**
     * software name
     * @return StrColumn
     */
    public StrColumn getSoftware() {
        return delegate.getColumn("software", DelegatingStrColumn::new);
    }

    /**
     * Half-set refinement protocol (semi-independent or gold standard)
     * @return StrColumn
     */
    public StrColumn getFscType() {
        return delegate.getColumn("fsc_type", DelegatingStrColumn::new);
    }

    /**
     * Indicates details on how the half-map used for resolution determination (usually by FSC) have been generated.
     * @return StrColumn
     */
    public StrColumn getRefinementType() {
        return delegate.getColumn("refinement_type", DelegatingStrColumn::new);
    }

    /**
     * Foreign key to the EM_IMAGE_PROCESSING category
     * @return StrColumn
     */
    public StrColumn getImageProcessingId() {
        return delegate.getColumn("image_processing_id", DelegatingStrColumn::new);
    }

    /**
     * The type of symmetry applied to the reconstruction
     * @return StrColumn
     */
    public StrColumn getSymmetryType() {
        return delegate.getColumn("symmetry_type", DelegatingStrColumn::new);
    }

}