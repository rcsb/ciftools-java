package org.rcsb.cif.model.em3dreconstruction;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class Em3dReconstruction extends BaseCategory {
    public Em3dReconstruction(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public Em3dReconstruction(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public Em3dReconstruction(String name) {
        super(name);
    }

    /**
     * This data item is a pointer to _entry.id in the ENTRY category.
     * @return EntryId
     */
    public EntryId getEntryId() {
        return (EntryId) (isText ? textFields.computeIfAbsent("entry_id",
                EntryId::new) : getBinaryColumn("entry_id"));
    }

    /**
     * The value of _em_3d_reconstruction.id must
     * uniquely identify the 3d reconstruction.
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }

    /**
     * The algorithm method used for the 3d-reconstruction.
     * @return Method
     */
    public Method getMethod() {
        return (Method) (isText ? textFields.computeIfAbsent("method",
                Method::new) : getBinaryColumn("method"));
    }

    /**
     * The algorithm used project from 2D orientations to 3D map.
     * @return Algorithm
     */
    public Algorithm getAlgorithm() {
        return (Algorithm) (isText ? textFields.computeIfAbsent("algorithm",
                Algorithm::new) : getBinaryColumn("algorithm"));
    }

    /**
     * This data item is a pointer to _citation.id in the
     * CITATION category.
     * @return CitationId
     */
    public CitationId getCitationId() {
        return (CitationId) (isText ? textFields.computeIfAbsent("citation_id",
                CitationId::new) : getBinaryColumn("citation_id"));
    }

    /**
     * Any additional details used in the 3d reconstruction.
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
    }

    /**
     * The final resolution (in Angstroms)of the 3D reconstruction.
     * @return Resolution
     */
    public Resolution getResolution() {
        return (Resolution) (isText ? textFields.computeIfAbsent("resolution",
                Resolution::new) : getBinaryColumn("resolution"));
    }

    /**
     * The  method used to determine the final resolution
     * of the 3d reconstruction.
     * The Fourier Shell Correlation criterion as a measure of
     * resolution is based on the concept of splitting the (2D)
     * data set into two halves; averaging each and comparing them
     * using the Fourier Ring Correlation (FRC) technique.
     * @return ResolutionMethod
     */
    public ResolutionMethod getResolutionMethod() {
        return (ResolutionMethod) (isText ? textFields.computeIfAbsent("resolution_method",
                ResolutionMethod::new) : getBinaryColumn("resolution_method"));
    }

    /**
     * The magnification calibration method for the 3d reconstruction.
     * @return MagnificationCalibration
     */
    public MagnificationCalibration getMagnificationCalibration() {
        return (MagnificationCalibration) (isText ? textFields.computeIfAbsent("magnification_calibration",
                MagnificationCalibration::new) : getBinaryColumn("magnification_calibration"));
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
     * @return CtfCorrectionMethod
     */
    public CtfCorrectionMethod getCtfCorrectionMethod() {
        return (CtfCorrectionMethod) (isText ? textFields.computeIfAbsent("ctf_correction_method",
                CtfCorrectionMethod::new) : getBinaryColumn("ctf_correction_method"));
    }

    /**
     * The nominal pixel size of the projection set of images.
     * @return NominalPixelSize
     */
    public NominalPixelSize getNominalPixelSize() {
        return (NominalPixelSize) (isText ? textFields.computeIfAbsent("nominal_pixel_size",
                NominalPixelSize::new) : getBinaryColumn("nominal_pixel_size"));
    }

    /**
     * The actual pixel size of projection set of images.
     * @return ActualPixelSize
     */
    public ActualPixelSize getActualPixelSize() {
        return (ActualPixelSize) (isText ? textFields.computeIfAbsent("actual_pixel_size",
                ActualPixelSize::new) : getBinaryColumn("actual_pixel_size"));
    }

    /**
     * The number of 2D projections or 3D subtomograms used in the 3d reconstruction
     * @return NumParticles
     */
    public NumParticles getNumParticles() {
        return (NumParticles) (isText ? textFields.computeIfAbsent("num_particles",
                NumParticles::new) : getBinaryColumn("num_particles"));
    }

    /**
     * euler angles details
     * @return EulerAnglesDetails
     */
    public EulerAnglesDetails getEulerAnglesDetails() {
        return (EulerAnglesDetails) (isText ? textFields.computeIfAbsent("euler_angles_details",
                EulerAnglesDetails::new) : getBinaryColumn("euler_angles_details"));
    }

    /**
     * This item was correspondence to two type of em dataset
     * processing_emDataSet_singleParticle.numClassAverages
     * processing_emDataSet_icosahedral.numClassAverages
     * @return NumClassAverages
     */
    public NumClassAverages getNumClassAverages() {
        return (NumClassAverages) (isText ? textFields.computeIfAbsent("num_class_averages",
                NumClassAverages::new) : getBinaryColumn("num_class_averages"));
    }

    /**
     * software name
     * @return Software
     */
    public Software getSoftware() {
        return (Software) (isText ? textFields.computeIfAbsent("software",
                Software::new) : getBinaryColumn("software"));
    }

    /**
     * type of FSC curve used to determine map resolution
     * @return FscType
     */
    public FscType getFscType() {
        return (FscType) (isText ? textFields.computeIfAbsent("fsc_type",
                FscType::new) : getBinaryColumn("fsc_type"));
    }

    /**
     * type of refinement performed in order to determine map resolution
     * @return RefinementType
     */
    public RefinementType getRefinementType() {
        return (RefinementType) (isText ? textFields.computeIfAbsent("refinement_type",
                RefinementType::new) : getBinaryColumn("refinement_type"));
    }

    /**
     * Foreign key to the EM_IMAGE_PROCESSING category
     * @return ImageProcessingId
     */
    public ImageProcessingId getImageProcessingId() {
        return (ImageProcessingId) (isText ? textFields.computeIfAbsent("image_processing_id",
                ImageProcessingId::new) : getBinaryColumn("image_processing_id"));
    }

    /**
     * The type of symmetry applied to the reconstruction
     * @return SymmetryType
     */
    public SymmetryType getSymmetryType() {
        return (SymmetryType) (isText ? textFields.computeIfAbsent("symmetry_type",
                SymmetryType::new) : getBinaryColumn("symmetry_type"));
    }
}
