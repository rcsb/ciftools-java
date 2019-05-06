package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in this category
 * record details of images from scanned micrographs and the
 * number of particles selected from a scanned set of micrographs.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * Ordinal identifier
     * @return StrColumn
     */
    public StrColumn getId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("id", StrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * The value of _em_particle_selection.image_processing_id points to
     * the EM_IMAGE_PROCESSING category.
     * @return StrColumn
     */
    public StrColumn getImageProcessingId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("image_processing_id", StrColumn::new) :
                getBinaryColumn("image_processing_id"));
    }

    /**
     * The method used for selecting particles
     * @return StrColumn
     */
    public StrColumn getMethod() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("method", StrColumn::new) :
                getBinaryColumn("method"));
    }

    /**
     * The number of particles selected from the projection set of images.
     * @return IntColumn
     */
    public IntColumn getNumParticlesSelected() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("num_particles_selected", IntColumn::new) :
                getBinaryColumn("num_particles_selected"));
    }

    /**
     * Description of reference model used for particle selection
     * @return StrColumn
     */
    public StrColumn getReferenceModel() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("reference_model", StrColumn::new) :
                getBinaryColumn("reference_model"));
    }
}
