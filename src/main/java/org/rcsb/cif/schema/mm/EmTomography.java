package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Microscopy parameters only relevant for tomography
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class EmTomography extends DelegatingCategory {
    public EmTomography(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "axis1_angle_increment":
                return getAxis1AngleIncrement();
            case "axis1_max_angle":
                return getAxis1MaxAngle();
            case "axis1_min_angle":
                return getAxis1MinAngle();
            case "axis2_angle_increment":
                return getAxis2AngleIncrement();
            case "axis2_max_angle":
                return getAxis2MaxAngle();
            case "axis2_min_angle":
                return getAxis2MinAngle();
            case "dual_tilt_axis_rotation":
                return getDualTiltAxisRotation();
            case "id":
                return getId();
            case "imaging_id":
                return getImagingId();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The angle increment of specimen tilting to obtain the
     * recorded images (axis 1).
     * @return FloatColumn
     */
    public FloatColumn getAxis1AngleIncrement() {
        return delegate.getColumn("axis1_angle_increment", DelegatingFloatColumn::new);
    }

    /**
     * The maximum angle at which the specimen was tilted to obtain
     * recorded images (axis 1).
     * @return FloatColumn
     */
    public FloatColumn getAxis1MaxAngle() {
        return delegate.getColumn("axis1_max_angle", DelegatingFloatColumn::new);
    }

    /**
     * The minimum angle at which the specimen was tilted to obtain
     * recorded images (axis 1).
     * @return FloatColumn
     */
    public FloatColumn getAxis1MinAngle() {
        return delegate.getColumn("axis1_min_angle", DelegatingFloatColumn::new);
    }

    /**
     * The angle increment of specimen tilting to obtain the
     * recorded images (axis 2).
     * @return FloatColumn
     */
    public FloatColumn getAxis2AngleIncrement() {
        return delegate.getColumn("axis2_angle_increment", DelegatingFloatColumn::new);
    }

    /**
     * The maximum angle at which the specimen was tilted to obtain
     * recorded images (axis 2).
     * @return FloatColumn
     */
    public FloatColumn getAxis2MaxAngle() {
        return delegate.getColumn("axis2_max_angle", DelegatingFloatColumn::new);
    }

    /**
     * The minimum angle at which the specimen was tilted to obtain
     * recorded images (axis 2).
     * @return FloatColumn
     */
    public FloatColumn getAxis2MinAngle() {
        return delegate.getColumn("axis2_min_angle", DelegatingFloatColumn::new);
    }

    /**
     * Angular difference between axis1 and axis2 in degrees
     * @return FloatColumn
     */
    public FloatColumn getDualTiltAxisRotation() {
        return delegate.getColumn("dual_tilt_axis_rotation", DelegatingFloatColumn::new);
    }

    /**
     * PRIMARY KEY
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * Foreign key to the EM IMAGING category
     * @return StrColumn
     */
    public StrColumn getImagingId() {
        return delegate.getColumn("imaging_id", DelegatingStrColumn::new);
    }

}