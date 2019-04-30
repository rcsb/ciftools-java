package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the EM_SYMMETRY_3DX category record
 * 3D crystal symmetry parameters utilized in 3DEM reconstruction averaging.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class Em3dCrystalEntity extends BaseCategory {
    public Em3dCrystalEntity(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public Em3dCrystalEntity(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public Em3dCrystalEntity(String name) {
        super(name);
    }

    /**
     * Unit-cell angle alpha in degrees.
     * @return FloatColumn
     */
    public FloatColumn getAngleAlpha() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("angle_alpha", FloatColumn::new) :
                getBinaryColumn("angle_alpha"));
    }

    /**
     * Unit-cell angle beta in degrees.
     * @return FloatColumn
     */
    public FloatColumn getAngleBeta() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("angle_beta", FloatColumn::new) :
                getBinaryColumn("angle_beta"));
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
     * pointer to _em_image_processing.id in the EM_IMAGE_PROCESSING category.
     * @return StrColumn
     */
    public StrColumn getImageProcessingId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("image_processing_id", StrColumn::new) :
                getBinaryColumn("image_processing_id"));
    }

    /**
     * Unique key for the em_3d_crystal_entity category.
     * @return StrColumn
     */
    public StrColumn getId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("id", StrColumn::new) :
                getBinaryColumn("id"));
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
     * Unit-cell length c in Angstroms.
     * @return FloatColumn
     */
    public FloatColumn getLengthC() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("length_c", FloatColumn::new) :
                getBinaryColumn("length_c"));
    }

    /**
     * Space group name.
     * @return StrColumn
     */
    public StrColumn getSpaceGroupName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("space_group_name", StrColumn::new) :
                getBinaryColumn("space_group_name"));
    }

    /**
     * Space group number.
     * @return IntColumn
     */
    public IntColumn getSpaceGroupNum() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("space_group_num", IntColumn::new) :
                getBinaryColumn("space_group_num"));
    }
}
