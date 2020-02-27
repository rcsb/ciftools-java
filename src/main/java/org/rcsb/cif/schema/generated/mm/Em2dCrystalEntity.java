package org.rcsb.cif.schema.generated.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the EM_SYMMETRY_2DX category record
 * 2D crystal symmetry parameters utilized in a 3DEM reconstruction.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class Em2dCrystalEntity extends DelegatingCategory {
    public Em2dCrystalEntity(Category delegate) {
        super(delegate);
    }

    /**
     * Unit-cell angle gamma in degrees.
     * @return FloatColumn
     */
    public FloatColumn getAngleGamma() {
        return delegate.getColumn("angle_gamma", DelegatingFloatColumn::new);
    }

    /**
     * Length used to sample the reciprocal lattice lines in the c-direction.
     * @return FloatColumn
     */
    public FloatColumn getCSamplingLength() {
        return delegate.getColumn("c_sampling_length", DelegatingFloatColumn::new);
    }

    /**
     * pointer to _em_image_processing.id in the EM_IMAGE_PROCESSING category.
     * @return StrColumn
     */
    public StrColumn getImageProcessingId() {
        return delegate.getColumn("image_processing_id", DelegatingStrColumn::new);
    }

    /**
     * Unique key for the 2d_crystal_entity category.
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * Corresponding key in _em_entity_assembly category.
     * @return StrColumn
     */
    public StrColumn getEntityAssemblyId() {
        return delegate.getColumn("entity_assembly_id", DelegatingStrColumn::new);
    }

    /**
     * Unit-cell length a in Angstroms.
     * @return FloatColumn
     */
    public FloatColumn getLengthA() {
        return delegate.getColumn("length_a", DelegatingFloatColumn::new);
    }

    /**
     * Unit-cell length b in Angstroms.
     * @return FloatColumn
     */
    public FloatColumn getLengthB() {
        return delegate.getColumn("length_b", DelegatingFloatColumn::new);
    }

    /**
     * Thickness of 2D crystal
     * @return FloatColumn
     */
    public FloatColumn getLengthC() {
        return delegate.getColumn("length_c", DelegatingFloatColumn::new);
    }

    /**
     * There are 17 plane groups classified as oblique, rectangular, square, and hexagonal.
     * To describe the symmetry of 2D crystals of biological molecules,
     * plane groups are expanded to equivalent noncentrosymmetric space groups.
     * The 2D crystal plane corresponds to the 'ab' plane of the space group.
     * 
     * Enumerated space group descriptions include the plane group number in parentheses,
     * the H-M plane group symbol, and the plane group class.
     * @return StrColumn
     */
    public StrColumn getSpaceGroupNameH_M() {
        return delegate.getColumn("space_group_name_H-M", DelegatingStrColumn::new);
    }
}
