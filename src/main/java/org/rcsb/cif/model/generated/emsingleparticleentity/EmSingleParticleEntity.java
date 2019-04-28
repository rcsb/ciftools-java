package org.rcsb.cif.model.generated.emsingleparticleentity;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

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
     * @return EntryId
     */
    public EntryId getEntryId() {
        return (EntryId) (isText ? textFields.computeIfAbsent("entry_id",
                EntryId::new) : getBinaryColumn("entry_id"));
    }

    /**
     * Unique category label.
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }

    /**
     * The single particle symmetry type.
     * @return SymmetryType
     */
    public SymmetryType getSymmetryType() {
        return (SymmetryType) (isText ? textFields.computeIfAbsent("symmetry_type",
                SymmetryType::new) : getBinaryColumn("symmetry_type"));
    }

    /**
     * pointer to _em_image_processing.id.
     * @return ImageProcessingId
     */
    public ImageProcessingId getImageProcessingId() {
        return (ImageProcessingId) (isText ? textFields.computeIfAbsent("image_processing_id",
                ImageProcessingId::new) : getBinaryColumn("image_processing_id"));
    }

    /**
     * Point symmetry symbol, either Cn, Dn, T, O, or I
     * @return PointSymmetry
     */
    public PointSymmetry getPointSymmetry() {
        return (PointSymmetry) (isText ? textFields.computeIfAbsent("point_symmetry",
                PointSymmetry::new) : getBinaryColumn("point_symmetry"));
    }
}
