package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the EM_SINGLE_PARTICLE_ENTITY category provide
 * the details of the symmetry for a single particle entity type.
 */
@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class EmSingleParticleEntity extends BaseCategory {
    public EmSingleParticleEntity(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public EmSingleParticleEntity(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public EmSingleParticleEntity(String name) {
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
     * Unique category label.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("id", SingleRowStrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * The single particle symmetry type.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getSymmetryType() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("symmetry_type", SingleRowStrColumn::new) :
                getBinaryColumn("symmetry_type"));
    }

    /**
     * pointer to _em_image_processing.id.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getImageProcessingId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("image_processing_id", SingleRowStrColumn::new) :
                getBinaryColumn("image_processing_id"));
    }

    /**
     * Point symmetry symbol, either Cn, Dn, T, O, or I
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getPointSymmetry() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("point_symmetry", SingleRowStrColumn::new) :
                getBinaryColumn("point_symmetry"));
    }
}
