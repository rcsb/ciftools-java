package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the EM_SYMMETRY_3DX category record
 * 3D crystal symmetry parameters utilized in 3DEM reconstruction averaging.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class Em3dCrystalEntity extends DelegatingCategory {
    public Em3dCrystalEntity(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "angle_alpha":
                return getAngleAlpha();
            case "angle_beta":
                return getAngleBeta();
            case "angle_gamma":
                return getAngleGamma();
            case "image_processing_id":
                return getImageProcessingId();
            case "id":
                return getId();
            case "length_a":
                return getLengthA();
            case "length_b":
                return getLengthB();
            case "length_c":
                return getLengthC();
            case "space_group_name":
                return getSpaceGroupName();
            case "space_group_num":
                return getSpaceGroupNum();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * Unit-cell angle alpha in degrees.
     * @return FloatColumn
     */
    public FloatColumn getAngleAlpha() {
        return delegate.getColumn("angle_alpha", DelegatingFloatColumn::new);
    }

    /**
     * Unit-cell angle beta in degrees.
     * @return FloatColumn
     */
    public FloatColumn getAngleBeta() {
        return delegate.getColumn("angle_beta", DelegatingFloatColumn::new);
    }

    /**
     * Unit-cell angle gamma in degrees.
     * @return FloatColumn
     */
    public FloatColumn getAngleGamma() {
        return delegate.getColumn("angle_gamma", DelegatingFloatColumn::new);
    }

    /**
     * pointer to _em_image_processing.id in the EM_IMAGE_PROCESSING category.
     * @return StrColumn
     */
    public StrColumn getImageProcessingId() {
        return delegate.getColumn("image_processing_id", DelegatingStrColumn::new);
    }

    /**
     * PRIMARY KEY
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * Unit-cell length a in angstroms.
     * @return FloatColumn
     */
    public FloatColumn getLengthA() {
        return delegate.getColumn("length_a", DelegatingFloatColumn::new);
    }

    /**
     * Unit-cell length b in angstroms.
     * @return FloatColumn
     */
    public FloatColumn getLengthB() {
        return delegate.getColumn("length_b", DelegatingFloatColumn::new);
    }

    /**
     * Unit-cell length c in angstroms.
     * @return FloatColumn
     */
    public FloatColumn getLengthC() {
        return delegate.getColumn("length_c", DelegatingFloatColumn::new);
    }

    /**
     * Space group name.
     * @return StrColumn
     */
    public StrColumn getSpaceGroupName() {
        return delegate.getColumn("space_group_name", DelegatingStrColumn::new);
    }

    /**
     * Space group number.
     * @return IntColumn
     */
    public IntColumn getSpaceGroupNum() {
        return delegate.getColumn("space_group_num", DelegatingIntColumn::new);
    }

}