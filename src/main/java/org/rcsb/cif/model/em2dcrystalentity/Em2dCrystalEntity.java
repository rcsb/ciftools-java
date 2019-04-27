package org.rcsb.cif.model.em2dcrystalentity;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class Em2dCrystalEntity extends BaseCategory {
    public Em2dCrystalEntity(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public Em2dCrystalEntity(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public Em2dCrystalEntity(String name) {
        super(name);
    }

    /**
     * Unit-cell angle gamma in degrees.
     * @return AngleGamma
     */
    public AngleGamma getAngleGamma() {
        return (AngleGamma) (isText ? textFields.computeIfAbsent("angle_gamma",
                AngleGamma::new) : getBinaryColumn("angle_gamma"));
    }

    /**
     * Length used to sample the reciprocal lattice lines in the c-direction.
     * @return CSamplingLength
     */
    public CSamplingLength getCSamplingLength() {
        return (CSamplingLength) (isText ? textFields.computeIfAbsent("c_sampling_length",
                CSamplingLength::new) : getBinaryColumn("c_sampling_length"));
    }

    /**
     * pointer to _em_image_processing.id in the EM_IMAGE_PROCESSING category.
     * @return ImageProcessingId
     */
    public ImageProcessingId getImageProcessingId() {
        return (ImageProcessingId) (isText ? textFields.computeIfAbsent("image_processing_id",
                ImageProcessingId::new) : getBinaryColumn("image_processing_id"));
    }

    /**
     * Unique key for the 2d_crystal_entity category.
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }

    /**
     * Corresponding key in _em_entity_assembly category.
     * @return EntityAssemblyId
     */
    public EntityAssemblyId getEntityAssemblyId() {
        return (EntityAssemblyId) (isText ? textFields.computeIfAbsent("entity_assembly_id",
                EntityAssemblyId::new) : getBinaryColumn("entity_assembly_id"));
    }

    /**
     * Unit-cell length a in Angstroms.
     * @return LengthA
     */
    public LengthA getLengthA() {
        return (LengthA) (isText ? textFields.computeIfAbsent("length_a",
                LengthA::new) : getBinaryColumn("length_a"));
    }

    /**
     * Unit-cell length b in Angstroms.
     * @return LengthB
     */
    public LengthB getLengthB() {
        return (LengthB) (isText ? textFields.computeIfAbsent("length_b",
                LengthB::new) : getBinaryColumn("length_b"));
    }

    /**
     * Thickness of 2D crystal
     * @return LengthC
     */
    public LengthC getLengthC() {
        return (LengthC) (isText ? textFields.computeIfAbsent("length_c",
                LengthC::new) : getBinaryColumn("length_c"));
    }

    /**
     * There are 17 plane groups classified as oblique, rectangular, square, and hexagonal.
     * To describe the symmetry of 2D crystals of biological molecules,
     * plane groups are expanded to equivalent noncentrosymmetric space groups.
     * The 2D crystal plane corresponds to the 'ab' plane of the space group.
     * 
     * Enumerated space group descriptions include the plane group number in parentheses,
     * the H-M plane group symbol, and the plane group class.
     * @return SpaceGroupNameH_M
     */
    public SpaceGroupNameH_M getSpaceGroupNameH_M() {
        return (SpaceGroupNameH_M) (isText ? textFields.computeIfAbsent("space_group_name_H-M",
                SpaceGroupNameH_M::new) : getBinaryColumn("space_group_name_H-M"));
    }
}
