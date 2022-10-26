package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in this category
 * record details of images from scanned micrographs and the
 * number of particles selected from a scanned set of micrographs.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class EmParticleSelection extends DelegatingCategory {
    public EmParticleSelection(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "details":
                return getDetails();
            case "id":
                return getId();
            case "image_processing_id":
                return getImageProcessingId();
            case "method":
                return getMethod();
            case "num_particles_selected":
                return getNumParticlesSelected();
            case "reference_model":
                return getReferenceModel();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * Additional detail such as description of filters used, if selection was
     * manual or automated, and/or template details.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

    /**
     * PRIMARY KEY
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * The value of _em_particle_selection.image_processing_id points to
     * the EM_IMAGE_PROCESSING category.
     * @return StrColumn
     */
    public StrColumn getImageProcessingId() {
        return delegate.getColumn("image_processing_id", DelegatingStrColumn::new);
    }

    /**
     * The method used for selecting particles
     * @return StrColumn
     */
    public StrColumn getMethod() {
        return delegate.getColumn("method", DelegatingStrColumn::new);
    }

    /**
     * The number of particles selected from the projection set of images.
     * @return IntColumn
     */
    public IntColumn getNumParticlesSelected() {
        return delegate.getColumn("num_particles_selected", DelegatingIntColumn::new);
    }

    /**
     * Description of reference model used for particle selection
     * @return StrColumn
     */
    public StrColumn getReferenceModel() {
        return delegate.getColumn("reference_model", DelegatingStrColumn::new);
    }

}