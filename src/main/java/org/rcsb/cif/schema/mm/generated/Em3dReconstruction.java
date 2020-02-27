package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the EM_3D_RECONSTRUCTION category
 * record details of the 3D reconstruction procedure from 2D projections.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entry_id", StrColumn::new) :
                getBinaryColumn("entry_id"));
    }

    /**
     * The value of _em_3d_reconstruction.id must
     * uniquely identify the 3d reconstruction.
     * @return StrColumn
     */
    public StrColumn getId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("id", StrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * The algorithm method used for the 3d-reconstruction.
     * @return StrColumn
     */
    public StrColumn getMethod() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("method", StrColumn::new) :
                getBinaryColumn("method"));
    }

    /**
     * The algorithm used project from 2D orientations to 3D map.
     * @return StrColumn
     */
    public StrColumn getAlgorithm() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("algorithm", StrColumn::new) :
                getBinaryColumn("algorithm"));
    }

    /**
     * This data item is a pointer to _citation.id in the
     * CITATION category.
     * @return StrColumn
     */
    public StrColumn getCitationId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("citation_id", StrColumn::new) :
                getBinaryColumn("citation_id"));
    }

    /**
     * Any additional details used in the 3d reconstruction.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * The final resolution (in Angstroms)of the 3D reconstruction.
     * @return FloatColumn
     */
    public FloatColumn getResolution() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("resolution", FloatColumn::new) :
                getBinaryColumn("resolution"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("resolution_method", StrColumn::new) :
                getBinaryColumn("resolution_method"));
    }

    /**
     * The magnification calibration method for the 3d reconstruction.
     * @return StrColumn
     */
    public StrColumn getMagnificationCalibration() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("magnification_calibration", StrColumn::new) :
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
     * @return StrColumn
     */
    public StrColumn getCtfCorrectionMethod() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("ctf_correction_method", StrColumn::new) :
                getBinaryColumn("ctf_correction_method"));
    }

    /**
     * The nominal pixel size of the projection set of images.
     * @return FloatColumn
     */
    public FloatColumn getNominalPixelSize() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("nominal_pixel_size", FloatColumn::new) :
                getBinaryColumn("nominal_pixel_size"));
    }

    /**
     * The actual pixel size of projection set of images.
     * @return FloatColumn
     */
    public FloatColumn getActualPixelSize() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("actual_pixel_size", FloatColumn::new) :
                getBinaryColumn("actual_pixel_size"));
    }

    /**
     * The number of 2D projections or 3D subtomograms used in the 3d reconstruction
     * @return IntColumn
     */
    public IntColumn getNumParticles() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("num_particles", IntColumn::new) :
                getBinaryColumn("num_particles"));
    }

    /**
     * euler angles details
     * @return StrColumn
     */
    public StrColumn getEulerAnglesDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("euler_angles_details", StrColumn::new) :
                getBinaryColumn("euler_angles_details"));
    }

    /**
     * This item was correspondence to two type of em dataset
     * processing_emDataSet_singleParticle.numClassAverages
     * processing_emDataSet_icosahedral.numClassAverages
     * @return IntColumn
     */
    public IntColumn getNumClassAverages() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("num_class_averages", IntColumn::new) :
                getBinaryColumn("num_class_averages"));
    }

    /**
     * software name
     * @return StrColumn
     */
    public StrColumn getSoftware() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("software", StrColumn::new) :
                getBinaryColumn("software"));
    }

    /**
     * type of FSC curve used to determine map resolution
     * @return StrColumn
     */
    public StrColumn getFscType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("fsc_type", StrColumn::new) :
                getBinaryColumn("fsc_type"));
    }

    /**
     * type of refinement performed in order to determine map resolution
     * @return StrColumn
     */
    public StrColumn getRefinementType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("refinement_type", StrColumn::new) :
                getBinaryColumn("refinement_type"));
    }

    /**
     * Foreign key to the EM_IMAGE_PROCESSING category
     * @return StrColumn
     */
    public StrColumn getImageProcessingId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("image_processing_id", StrColumn::new) :
                getBinaryColumn("image_processing_id"));
    }

    /**
     * The type of symmetry applied to the reconstruction
     * @return StrColumn
     */
    public StrColumn getSymmetryType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("symmetry_type", StrColumn::new) :
                getBinaryColumn("symmetry_type"));
    }
}
