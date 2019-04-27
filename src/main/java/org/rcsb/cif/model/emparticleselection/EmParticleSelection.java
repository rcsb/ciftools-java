package org.rcsb.cif.model.emparticleselection;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class EmParticleSelection extends BaseCategory {
    public EmParticleSelection(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public EmParticleSelection(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public EmParticleSelection(String name) {
        super(name);
    }

    /**
     * Any additional details used for selecting particles
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
    }

    /**
     * Ordinal identifier
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }

    /**
     * The value of _em_particle_selection.image_processing_id points to
     * the EM_IMAGE_PROCESSING category.
     * @return ImageProcessingId
     */
    public ImageProcessingId getImageProcessingId() {
        return (ImageProcessingId) (isText ? textFields.computeIfAbsent("image_processing_id",
                ImageProcessingId::new) : getBinaryColumn("image_processing_id"));
    }

    /**
     * The method used for selecting particles
     * @return Method
     */
    public Method getMethod() {
        return (Method) (isText ? textFields.computeIfAbsent("method",
                Method::new) : getBinaryColumn("method"));
    }

    /**
     * The number of particles selected from the projection set of images.
     * @return NumParticlesSelected
     */
    public NumParticlesSelected getNumParticlesSelected() {
        return (NumParticlesSelected) (isText ? textFields.computeIfAbsent("num_particles_selected",
                NumParticlesSelected::new) : getBinaryColumn("num_particles_selected"));
    }

    /**
     * Description of reference model used for particle selection
     * @return ReferenceModel
     */
    public ReferenceModel getReferenceModel() {
        return (ReferenceModel) (isText ? textFields.computeIfAbsent("reference_model",
                ReferenceModel::new) : getBinaryColumn("reference_model"));
    }
}
