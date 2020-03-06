package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the EM_2D_PROJECTION_SELECTION category
 * record details of images from scanned micrographs and the
 * number of particles selected from a scanned set of micrographs.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class Em2dProjectionSelection extends DelegatingCategory {
    public Em2dProjectionSelection(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "entry_id":
                return getEntryId();
            case "id":
                return getId();
            case "num_particles":
                return getNumParticles();
            case "software_name":
                return getSoftwareName();
            case "method":
                return getMethod();
            case "details":
                return getDetails();
            case "citation_id":
                return getCitationId();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * entry id
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return delegate.getColumn("entry_id", DelegatingStrColumn::new);
    }

    /**
     * unique identifier for each projection selection description
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * The number of particles selected from the projection set of images.
     * @return IntColumn
     */
    public IntColumn getNumParticles() {
        return delegate.getColumn("num_particles", DelegatingIntColumn::new);
    }

    /**
     * The software used to select 2d projections.
     * @return StrColumn
     */
    public StrColumn getSoftwareName() {
        return delegate.getColumn("software_name", DelegatingStrColumn::new);
    }

    /**
     * The method used for selecting observed assemblies.
     * @return StrColumn
     */
    public StrColumn getMethod() {
        return delegate.getColumn("method", DelegatingStrColumn::new);
    }

    /**
     * Any additional details used for selecting observed assemblies.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

    /**
     * This data item is a pointer to _citation.id in the
     * CITATION category.
     * @return StrColumn
     */
    public StrColumn getCitationId() {
        return delegate.getColumn("citation_id", DelegatingStrColumn::new);
    }

}