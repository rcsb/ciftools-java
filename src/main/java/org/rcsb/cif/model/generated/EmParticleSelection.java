package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in this category
 * record details of images from scanned micrographs and the
 * number of particles selected from a scanned set of micrographs.
 */
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
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDetails() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("details", SingleRowStrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * Ordinal identifier
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("id", SingleRowStrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * The value of _em_particle_selection.image_processing_id points to
     * the EM_IMAGE_PROCESSING category.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getImageProcessingId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("image_processing_id", SingleRowStrColumn::new) :
                getBinaryColumn("image_processing_id"));
    }

    /**
     * The method used for selecting particles
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getMethod() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("method", SingleRowStrColumn::new) :
                getBinaryColumn("method"));
    }

    /**
     * The number of particles selected from the projection set of images.
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getNumParticlesSelected() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("num_particles_selected", SingleRowIntColumn::new) :
                getBinaryColumn("num_particles_selected"));
    }

    /**
     * Description of reference model used for particle selection
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getReferenceModel() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("reference_model", SingleRowStrColumn::new) :
                getBinaryColumn("reference_model"));
    }
}
