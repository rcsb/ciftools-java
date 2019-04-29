package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the EM_HELICAL_ENTITY category record details
 * for a helical or filament type of assembly component.
 */
@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class EmHelicalEntity extends BaseCategory {
    public EmHelicalEntity(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public EmHelicalEntity(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public EmHelicalEntity(String name) {
        super(name);
    }

    /**
     * The value of _em_helical_entity.id must uniquely identify
     * a set of the filament parameters for this assembly component.
     * @return StrColumn
     */
    public StrColumn getId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("id", StrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * The value of _em_helical_entity.entity_assembly_id
     * identifies a particular assembly component.
     * 
     * This data item is a pointer to _em_entity_assembly.id
     * in the EM_ENTITY_ASSEMBLY category.
     * @return StrColumn
     */
    public StrColumn getEntityAssemblyId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entity_assembly_id", StrColumn::new) :
                getBinaryColumn("entity_assembly_id"));
    }

    /**
     * The value of _em_helical_entity.reconstruction_id identifies a particular reconstruction.
     * 
     * This data item is a pointer to _em_image_processing.id.
     * @return StrColumn
     */
    public StrColumn getImageProcessingId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("image_processing_id", StrColumn::new) :
                getBinaryColumn("image_processing_id"));
    }

    /**
     * Any other details regarding the helical assembly
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * Value should be YES if a the filament has two-fold symmetry perpendicular to the helical axis.
     * @return StrColumn
     */
    public StrColumn getDyad() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("dyad", StrColumn::new) :
                getBinaryColumn("dyad"));
    }

    /**
     * Symmetry of the helical axis, either cyclic (Cn) or dihedral (Dn), where n>=1.
     * @return StrColumn
     */
    public StrColumn getAxialSymmetry() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("axial_symmetry", StrColumn::new) :
                getBinaryColumn("axial_symmetry"));
    }

    /**
     * The angular rotation per helical subunit in degrees.
     * @return FloatColumn
     */
    public FloatColumn getAngularRotationPerSubunit() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("angular_rotation_per_subunit", FloatColumn::new) :
                getBinaryColumn("angular_rotation_per_subunit"));
    }

    /**
     * The axial rise per subunit in the helical assembly.
     * @return FloatColumn
     */
    public FloatColumn getAxialRisePerSubunit() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("axial_rise_per_subunit", FloatColumn::new) :
                getBinaryColumn("axial_rise_per_subunit"));
    }

    /**
     * Handedness of the helix: right handed or left handed
     * @return StrColumn
     */
    public StrColumn getHand() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("hand", StrColumn::new) :
                getBinaryColumn("hand"));
    }
}
