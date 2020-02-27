package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the EM_SINGLE_PARTICLE_ENTITY category provide
 * the details of the symmetry for a single particle entity type.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entry_id", StrColumn::new) :
                getBinaryColumn("entry_id"));
    }

    /**
     * Unique category label.
     * @return StrColumn
     */
    public StrColumn getId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("id", StrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * The single particle symmetry type.
     * @return StrColumn
     */
    public StrColumn getSymmetryType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("symmetry_type", StrColumn::new) :
                getBinaryColumn("symmetry_type"));
    }

    /**
     * pointer to _em_image_processing.id.
     * @return StrColumn
     */
    public StrColumn getImageProcessingId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("image_processing_id", StrColumn::new) :
                getBinaryColumn("image_processing_id"));
    }

    /**
     * Point symmetry symbol, either Cn, Dn, T, O, or I
     * @return StrColumn
     */
    public StrColumn getPointSymmetry() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("point_symmetry", StrColumn::new) :
                getBinaryColumn("point_symmetry"));
    }
}
