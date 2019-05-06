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
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entry_id", StrColumn::new) :
                getBinaryColumn("entry_id"));
    }

    /**
     * unique identifier for each projection selection description
     * @return StrColumn
     */
    public StrColumn getId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("id", StrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * The number of particles selected from the projection set of images.
     * @return IntColumn
     */
    public IntColumn getNumParticles() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("num_particles", IntColumn::new) :
                getBinaryColumn("num_particles"));
    }

    /**
     * The software used to select 2d projections.
     * @return StrColumn
     */
    public StrColumn getSoftwareName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("software_name", StrColumn::new) :
                getBinaryColumn("software_name"));
    }

    /**
     * The method used for selecting observed assemblies.
     * @return StrColumn
     */
    public StrColumn getMethod() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("method", StrColumn::new) :
                getBinaryColumn("method"));
    }

    /**
     * Any additional details used for selecting observed assemblies.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
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
}
