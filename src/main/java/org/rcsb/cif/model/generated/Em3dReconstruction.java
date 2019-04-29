package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the EM_3D_RECONSTRUCTION category
 * record details of the 3D reconstruction procedure from 2D projections.
 */
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
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getEntryId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("entry_id", SingleRowStrColumn::new) :
                getBinaryColumn("entry_id"));
    }

    /**
     * The value of _em_3d_reconstruction.id must
     * uniquely identify the 3d reconstruction.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("id", SingleRowStrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * The algorithm method used for the 3d-reconstruction.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getMethod() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("method", SingleRowStrColumn::new) :
                getBinaryColumn("method"));
    }

    /**
     * The algorithm used project from 2D orientations to 3D map.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getAlgorithm() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("algorithm", SingleRowStrColumn::new) :
                getBinaryColumn("algorithm"));
    }

    /**
     * This data item is a pointer to _citation.id in the
     * CITATION category.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getCitationId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("citation_id", SingleRowStrColumn::new) :
                getBinaryColumn("citation_id"));
    }

    /**
     * Any additional details used in the 3d reconstruction.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDetails() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("details", SingleRowStrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * The final resolution (in Angstroms)of the 3D reconstruction.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getResolution() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("resolution", SingleRowFloatColumn::new) :
                getBinaryColumn("resolution"));
    }

    /**
     * The  method used to determine the final resolution
     * of the 3d reconstruction.
     * The Fourier Shell Correlation criterion as a measure of
     * resolution is based on the concept of splitting the (2D)
     * data set into two halves; averaging each and comparing them
     * using the Fourier Ring Correlation (FRC) technique.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getResolutionMethod() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("resolution_method", SingleRowStrColumn::new) :
                getBinaryColumn("resolution_method"));
    }

    /**
     * The magnification calibration method for the 3d reconstruction.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getMagnificationCalibration() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("magnification_calibration", SingleRowStrColumn::new) :
                getBinaryColumn("magnification_calibration"));
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
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getCtfCorrectionMethod() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("ctf_correction_method", SingleRowStrColumn::new) :
                getBinaryColumn("ctf_correction_method"));
    }

    /**
     * The nominal pixel size of the projection set of images.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getNominalPixelSize() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("nominal_pixel_size", SingleRowFloatColumn::new) :
                getBinaryColumn("nominal_pixel_size"));
    }

    /**
     * The actual pixel size of projection set of images.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getActualPixelSize() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("actual_pixel_size", SingleRowFloatColumn::new) :
                getBinaryColumn("actual_pixel_size"));
    }

    /**
     * The number of 2D projections or 3D subtomograms used in the 3d reconstruction
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getNumParticles() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("num_particles", SingleRowIntColumn::new) :
                getBinaryColumn("num_particles"));
    }

    /**
     * euler angles details
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getEulerAnglesDetails() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("euler_angles_details", SingleRowStrColumn::new) :
                getBinaryColumn("euler_angles_details"));
    }

    /**
     * This item was correspondence to two type of em dataset
     * processing_emDataSet_singleParticle.numClassAverages
     * processing_emDataSet_icosahedral.numClassAverages
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getNumClassAverages() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("num_class_averages", SingleRowIntColumn::new) :
                getBinaryColumn("num_class_averages"));
    }

    /**
     * software name
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getSoftware() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("software", SingleRowStrColumn::new) :
                getBinaryColumn("software"));
    }

    /**
     * type of FSC curve used to determine map resolution
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getFscType() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("fsc_type", SingleRowStrColumn::new) :
                getBinaryColumn("fsc_type"));
    }

    /**
     * type of refinement performed in order to determine map resolution
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getRefinementType() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("refinement_type", SingleRowStrColumn::new) :
                getBinaryColumn("refinement_type"));
    }

    /**
     * Foreign key to the EM_IMAGE_PROCESSING category
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getImageProcessingId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("image_processing_id", SingleRowStrColumn::new) :
                getBinaryColumn("image_processing_id"));
    }

    /**
     * The type of symmetry applied to the reconstruction
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getSymmetryType() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("symmetry_type", SingleRowStrColumn::new) :
                getBinaryColumn("symmetry_type"));
    }
}
