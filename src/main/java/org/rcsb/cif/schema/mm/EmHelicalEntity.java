package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the EM_HELICAL_ENTITY category record details
 * for a helical or filament type of assembly component.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class EmHelicalEntity extends DelegatingCategory {
    public EmHelicalEntity(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "id":
                return getId();
            case "entity_assembly_id":
                return getEntityAssemblyId();
            case "image_processing_id":
                return getImageProcessingId();
            case "details":
                return getDetails();
            case "dyad":
                return getDyad();
            case "axial_symmetry":
                return getAxialSymmetry();
            case "angular_rotation_per_subunit":
                return getAngularRotationPerSubunit();
            case "axial_rise_per_subunit":
                return getAxialRisePerSubunit();
            case "hand":
                return getHand();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * PRIMARY KEY
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
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
        return delegate.getColumn("entity_assembly_id", DelegatingStrColumn::new);
    }

    /**
     * This data item is a pointer to _em_image_processing.id.
     * @return StrColumn
     */
    public StrColumn getImageProcessingId() {
        return delegate.getColumn("image_processing_id", DelegatingStrColumn::new);
    }

    /**
     * Any other details regarding the helical assembly
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

    /**
     * Value should be YES if a the filament has two-fold symmetry perpendicular to the helical axis.
     * @return StrColumn
     */
    public StrColumn getDyad() {
        return delegate.getColumn("dyad", DelegatingStrColumn::new);
    }

    /**
     * Symmetry of the helical axis, either cyclic (Cn) or dihedral (Dn), where n&gt;=1.
     * @return StrColumn
     */
    public StrColumn getAxialSymmetry() {
        return delegate.getColumn("axial_symmetry", DelegatingStrColumn::new);
    }

    /**
     * The angular rotation per helical subunit in degrees. Negative values indicate left-handed helices; positive values indicate right handed helices.
     * @return FloatColumn
     */
    public FloatColumn getAngularRotationPerSubunit() {
        return delegate.getColumn("angular_rotation_per_subunit", DelegatingFloatColumn::new);
    }

    /**
     * The axial rise per subunit in the helical assembly.
     * @return FloatColumn
     */
    public FloatColumn getAxialRisePerSubunit() {
        return delegate.getColumn("axial_rise_per_subunit", DelegatingFloatColumn::new);
    }

    /**
     * Handedness of the helix: right handed or left handed
     * @return StrColumn
     */
    public StrColumn getHand() {
        return delegate.getColumn("hand", DelegatingStrColumn::new);
    }

}