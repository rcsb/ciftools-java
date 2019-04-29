package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the EM_SYMMETRY_2DX category record
 * 2D crystal symmetry parameters utilized in a 3DEM reconstruction.
 */
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
     * @return FloatColumn
     */
    public FloatColumn getAngleGamma() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("angle_gamma", FloatColumn::new) :
                getBinaryColumn("angle_gamma"));
    }

    /**
     * Length used to sample the reciprocal lattice lines in the c-direction.
     * @return FloatColumn
     */
    public FloatColumn getCSamplingLength() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("c_sampling_length", FloatColumn::new) :
                getBinaryColumn("c_sampling_length"));
    }

    /**
     * pointer to _em_image_processing.id in the EM_IMAGE_PROCESSING category.
     * @return StrColumn
     */
    public StrColumn getImageProcessingId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("image_processing_id", StrColumn::new) :
                getBinaryColumn("image_processing_id"));
    }

    /**
     * Unique key for the 2d_crystal_entity category.
     * @return StrColumn
     */
    public StrColumn getId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("id", StrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * Corresponding key in _em_entity_assembly category.
     * @return StrColumn
     */
    public StrColumn getEntityAssemblyId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entity_assembly_id", StrColumn::new) :
                getBinaryColumn("entity_assembly_id"));
    }

    /**
     * Unit-cell length a in Angstroms.
     * @return FloatColumn
     */
    public FloatColumn getLengthA() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("length_a", FloatColumn::new) :
                getBinaryColumn("length_a"));
    }

    /**
     * Unit-cell length b in Angstroms.
     * @return FloatColumn
     */
    public FloatColumn getLengthB() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("length_b", FloatColumn::new) :
                getBinaryColumn("length_b"));
    }

    /**
     * Thickness of 2D crystal
     * @return FloatColumn
     */
    public FloatColumn getLengthC() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("length_c", FloatColumn::new) :
                getBinaryColumn("length_c"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("space_group_name_H-M", StrColumn::new) :
                getBinaryColumn("space_group_name_H-M"));
    }
}
