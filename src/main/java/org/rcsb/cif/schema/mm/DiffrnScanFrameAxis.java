package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the DIFFRN_SCAN_FRAME_AXIS  category describe the
 * settings of axes for particular frames.  Unspecified axes are
 * assumed to be at their zero points.  If, for any given frame,
 * nonzero values apply for any of the data items in this category,
 * those values should be given explicitly in this category and not
 * simply inferred from values in DIFFRN_SCAN_AXIS.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class DiffrnScanFrameAxis extends DelegatingCategory {
    public DiffrnScanFrameAxis(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "axis_id":
                return getAxisId();
            case "angle":
                return getAngle();
            case "angle_increment":
                return getAngleIncrement();
            case "angle_rstrt_incr":
                return getAngleRstrtIncr();
            case "displacement":
                return getDisplacement();
            case "displacement_increment":
                return getDisplacementIncrement();
            case "displacement_rstrt_incr":
                return getDisplacementRstrtIncr();
            case "frame_id":
                return getFrameId();
            case "reference_angle":
                return getReferenceAngle();
            case "reference_displacement":
                return getReferenceDisplacement();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The value of this data item is the identifier of one of
     * the axes for the frame for which settings are being specified.
     * 
     * Multiple axes may be specified for the same value of
     * _diffrn_scan_frame.frame_id.
     * 
     * This item is a pointer to _axis.id  in the
     * AXIS  category.
     * @return StrColumn
     */
    public StrColumn getAxisId() {
        return delegate.getColumn("axis_id", DelegatingStrColumn::new);
    }

    /**
     * The setting of the specified axis in degrees for this frame.
     * This is the setting at the start of the integration time.
     * @return FloatColumn
     */
    public FloatColumn getAngle() {
        return delegate.getColumn("angle", DelegatingFloatColumn::new);
    }

    /**
     * The increment for this frame for the angular setting of
     * the specified axis in degrees.  The sum of the values
     * of _diffrn_scan_frame_axis.angle  and
     * _diffrn_scan_frame_axis.angle_increment  is the
     * angular setting of the axis at the end of the integration
     * time for this frame.
     * @return FloatColumn
     */
    public FloatColumn getAngleIncrement() {
        return delegate.getColumn("angle_increment", DelegatingFloatColumn::new);
    }

    /**
     * The increment after this frame for the angular setting of
     * the specified axis in degrees.  The sum of the values
     * of _diffrn_scan_frame_axis.angle,
     * _diffrn_scan_frame_axis.angle_increment  and
     * _diffrn_scan_frame_axis.angle_rstrt_incr  is the
     * angular setting of the axis at the start of the integration
     * time for the next frame and should equal
     * _diffrn_scan_frame_axis.angle  for this next frame.
     * @return FloatColumn
     */
    public FloatColumn getAngleRstrtIncr() {
        return delegate.getColumn("angle_rstrt_incr", DelegatingFloatColumn::new);
    }

    /**
     * The setting of the specified axis in millimetres for this
     * frame.  This is the setting at the start of the integration
     * time.
     * @return FloatColumn
     */
    public FloatColumn getDisplacement() {
        return delegate.getColumn("displacement", DelegatingFloatColumn::new);
    }

    /**
     * The increment for this frame for the displacement setting of
     * the specified axis in millimetres.  The sum of the values
     * of _diffrn_scan_frame_axis.displacement  and
     * _diffrn_scan_frame_axis.displacement_increment  is the
     * angular setting of the axis at the end of the integration
     * time for this frame.
     * @return FloatColumn
     */
    public FloatColumn getDisplacementIncrement() {
        return delegate.getColumn("displacement_increment", DelegatingFloatColumn::new);
    }

    /**
     * The increment for this frame for the displacement setting of
     * the specified axis in millimetres.  The sum of the values
     * of _diffrn_scan_frame_axis.displacement,
     * _diffrn_scan_frame_axis.displacement_increment  and
     * _diffrn_scan_frame_axis.displacement_rstrt_incr  is the
     * angular setting of the axis at the start of the integration
     * time for the next frame and should equal
     * _diffrn_scan_frame_axis.displacement  for this next frame.
     * @return FloatColumn
     */
    public FloatColumn getDisplacementRstrtIncr() {
        return delegate.getColumn("displacement_rstrt_incr", DelegatingFloatColumn::new);
    }

    /**
     * The value of this data item is the identifier of the
     * frame for which axis settings are being specified.
     * 
     * Multiple axes may be specified for the same value of
     * _diffrn_scan_frame.frame_id.
     * 
     * This item is a pointer to _diffrn_data_frame.id  in the
     * DIFFRN_DATA_FRAME  category.
     * @return StrColumn
     */
    public StrColumn getFrameId() {
        return delegate.getColumn("frame_id", DelegatingStrColumn::new);
    }

    /**
     * The setting of the specified axis in degrees
     * against which measurements of the reference beam centre
     * and reference detector distance should be made.
     * 
     * This is normally the same for all frames, but the
     * option is provided here of making changes when
     * needed.
     * 
     * If not provided, it is assumed to be zero.
     * @return FloatColumn
     */
    public FloatColumn getReferenceAngle() {
        return delegate.getColumn("reference_angle", DelegatingFloatColumn::new);
    }

    /**
     * The setting of the specified axis in millimetres for this
     * frame against which measurements of the reference beam centre
     * and reference detector distance should be made.
     * 
     * This is normally the same for all frames, but the
     * option is provided here of making changes when
     * needed.
     * 
     * If not provided, it is assumed to be equal to
     * _diffrn_scan_frame_axis.displacement.
     * @return FloatColumn
     */
    public FloatColumn getReferenceDisplacement() {
        return delegate.getColumn("reference_displacement", DelegatingFloatColumn::new);
    }

}