package org.rcsb.cif.model.emhelicalentity;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

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
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }

    /**
     * The value of _em_helical_entity.entity_assembly_id
     * identifies a particular assembly component.
     * 
     * This data item is a pointer to _em_entity_assembly.id
     * in the EM_ENTITY_ASSEMBLY category.
     * @return EntityAssemblyId
     */
    public EntityAssemblyId getEntityAssemblyId() {
        return (EntityAssemblyId) (isText ? textFields.computeIfAbsent("entity_assembly_id",
                EntityAssemblyId::new) : getBinaryColumn("entity_assembly_id"));
    }

    /**
     * The value of _em_helical_entity.reconstruction_id identifies a particular reconstruction.
     * 
     * This data item is a pointer to _em_image_processing.id.
     * @return ImageProcessingId
     */
    public ImageProcessingId getImageProcessingId() {
        return (ImageProcessingId) (isText ? textFields.computeIfAbsent("image_processing_id",
                ImageProcessingId::new) : getBinaryColumn("image_processing_id"));
    }

    /**
     * Any other details regarding the helical assembly
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
    }

    /**
     * Value should be YES if a the filament has two-fold symmetry perpendicular to the helical axis.
     * @return Dyad
     */
    public Dyad getDyad() {
        return (Dyad) (isText ? textFields.computeIfAbsent("dyad",
                Dyad::new) : getBinaryColumn("dyad"));
    }

    /**
     * Symmetry of the helical axis, either cyclic (Cn) or dihedral (Dn), where n>=1.
     * @return AxialSymmetry
     */
    public AxialSymmetry getAxialSymmetry() {
        return (AxialSymmetry) (isText ? textFields.computeIfAbsent("axial_symmetry",
                AxialSymmetry::new) : getBinaryColumn("axial_symmetry"));
    }

    /**
     * The angular rotation per helical subunit in degrees.
     * @return AngularRotationPerSubunit
     */
    public AngularRotationPerSubunit getAngularRotationPerSubunit() {
        return (AngularRotationPerSubunit) (isText ? textFields.computeIfAbsent("angular_rotation_per_subunit",
                AngularRotationPerSubunit::new) : getBinaryColumn("angular_rotation_per_subunit"));
    }

    /**
     * The axial rise per subunit in the helical assembly.
     * @return AxialRisePerSubunit
     */
    public AxialRisePerSubunit getAxialRisePerSubunit() {
        return (AxialRisePerSubunit) (isText ? textFields.computeIfAbsent("axial_rise_per_subunit",
                AxialRisePerSubunit::new) : getBinaryColumn("axial_rise_per_subunit"));
    }

    /**
     * Handedness of the helix: right handed or left handed
     * @return Hand
     */
    public Hand getHand() {
        return (Hand) (isText ? textFields.computeIfAbsent("hand",
                Hand::new) : getBinaryColumn("hand"));
    }
}
