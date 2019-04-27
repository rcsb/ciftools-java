package org.rcsb.cif.model.em3dcrystalentity;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
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
     * @return AngleAlpha
     */
    public AngleAlpha getAngleAlpha() {
        return (AngleAlpha) (isText ? textFields.computeIfAbsent("angle_alpha",
                AngleAlpha::new) : getBinaryColumn("angle_alpha"));
    }

    /**
     * Unit-cell angle beta in degrees.
     * @return AngleBeta
     */
    public AngleBeta getAngleBeta() {
        return (AngleBeta) (isText ? textFields.computeIfAbsent("angle_beta",
                AngleBeta::new) : getBinaryColumn("angle_beta"));
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
     * pointer to _em_image_processing.id in the EM_IMAGE_PROCESSING category.
     * @return ImageProcessingId
     */
    public ImageProcessingId getImageProcessingId() {
        return (ImageProcessingId) (isText ? textFields.computeIfAbsent("image_processing_id",
                ImageProcessingId::new) : getBinaryColumn("image_processing_id"));
    }

    /**
     * Unique key for the em_3d_crystal_entity category.
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
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
     * Unit-cell length c in Angstroms.
     * @return LengthC
     */
    public LengthC getLengthC() {
        return (LengthC) (isText ? textFields.computeIfAbsent("length_c",
                LengthC::new) : getBinaryColumn("length_c"));
    }

    /**
     * Space group name.
     * @return SpaceGroupName
     */
    public SpaceGroupName getSpaceGroupName() {
        return (SpaceGroupName) (isText ? textFields.computeIfAbsent("space_group_name",
                SpaceGroupName::new) : getBinaryColumn("space_group_name"));
    }

    /**
     * Space group number.
     * @return SpaceGroupNum
     */
    public SpaceGroupNum getSpaceGroupNum() {
        return (SpaceGroupNum) (isText ? textFields.computeIfAbsent("space_group_num",
                SpaceGroupNum::new) : getBinaryColumn("space_group_num"));
    }
}
