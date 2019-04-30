package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the EM_2D_PROJECTION_SELECTION category
 * record details of images from scanned micrographs and the
 * number of particles selected from a scanned set of micrographs.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class Em2dProjectionSelection extends BaseCategory {
    public Em2dProjectionSelection(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public Em2dProjectionSelection(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public Em2dProjectionSelection(String name) {
        super(name);
    }

    /**
     * entry id
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getEntryId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("entry_id", SingleRowStrColumn::new) :
                getBinaryColumn("entry_id"));
    }

    /**
     * unique identifier for each projection selection description
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("id", SingleRowStrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * The number of particles selected from the projection set of images.
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getNumParticles() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("num_particles", SingleRowIntColumn::new) :
                getBinaryColumn("num_particles"));
    }

    /**
     * The software used to select 2d projections.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getSoftwareName() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("software_name", SingleRowStrColumn::new) :
                getBinaryColumn("software_name"));
    }

    /**
     * The method used for selecting observed assemblies.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getMethod() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("method", SingleRowStrColumn::new) :
                getBinaryColumn("method"));
    }

    /**
     * Any additional details used for selecting observed assemblies.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDetails() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("details", SingleRowStrColumn::new) :
                getBinaryColumn("details"));
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
}
