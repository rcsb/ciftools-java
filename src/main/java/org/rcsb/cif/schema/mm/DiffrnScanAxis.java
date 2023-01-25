package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the DIFFRN_SCAN_AXIS  category describe the settings of
 * axes for particular scans.  Unspecified axes are assumed to be at
 * their zero points.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class DiffrnScanAxis extends DelegatingCategory {
    public DiffrnScanAxis(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "scan_id":
                return getScanId();
            case "axis_id":
                return getAxisId();
            case "angle_start":
                return getAngleStart();
            case "angle_range":
                return getAngleRange();
            case "angle_increment":
                return getAngleIncrement();
            case "angle_rstrt_incr":
                return getAngleRstrtIncr();
            case "displacement_start":
                return getDisplacementStart();
            case "displacement_range":
                return getDisplacementRange();
            case "displacement_increment":
                return getDisplacementIncrement();
            case "displacement_rstrt_incr":
                return getDisplacementRstrtIncr();
            case "reference_angle":
                return getReferenceAngle();
            case "reference_displacement":
                return getReferenceDisplacement();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The value of this data item is the identifier of the
     * scan for which axis settings are being specified.
     * 
     * Multiple axes may be specified for the same value of
     * _diffrn_scan.id.
     * 
     * This item is a pointer to _diffrn_scan.id  in the
     * DIFFRN_SCAN  category.
     * @return StrColumn
     */
    public StrColumn getScanId() {
        return delegate.getColumn("scan_id", DelegatingStrColumn::new);
    }

    /**
     * The value of this data item is the identifier of one of
     * the axes for the scan for which settings are being specified.
     * 
     * Multiple axes may be specified for the same value of
     * _diffrn_scan.id.
     * 
     * This item is a pointer to _axis.id  in the
     * AXIS category.
     * @return StrColumn
     */
    public StrColumn getAxisId() {
        return delegate.getColumn("axis_id", DelegatingStrColumn::new);
    }

    /**
     * The starting position for the specified axis in degrees.
     * @return FloatColumn
     */
    public FloatColumn getAngleStart() {
        return delegate.getColumn("angle_start", DelegatingFloatColumn::new);
    }

    /**
     * The range from the starting position for the specified axis
     * in degrees.
     * @return FloatColumn
     */
    public FloatColumn getAngleRange() {
        return delegate.getColumn("angle_range", DelegatingFloatColumn::new);
    }

    /**
     * The increment for each step for the specified axis
     * in degrees.  In general, this will agree with
     * _diffrn_scan_frame_axis.angle_increment . The
     * sum of the values of _diffrn_scan_frame_axis.angle  and
     * _diffrn_scan_frame_axis.angle_increment  is the
     * angular setting of the axis at the end of the integration
     * time for a given frame.  If the individual frame values
     * vary, then the value of
     * _diffrn_scan_axis.angle_increment  will be
     * representative
     * of the ensemble of values of
     * _diffrn_scan_frame_axis.angle_increment  (e.g.
     * the mean).
     * @return FloatColumn
     */
    public FloatColumn getAngleIncrement() {
        return delegate.getColumn("angle_increment", DelegatingFloatColumn::new);
    }

    /**
     * The increment after each step for the specified axis
     * in degrees.  In general, this will agree with
     * _diffrn_scan_frame_axis.angle_rstrt_incr .  The
     * sum of the values of _diffrn_scan_frame_axis.angle,
     * _diffrn_scan_frame_axis.angle_increment
     * and  _diffrn_scan_frame_axis.angle_rstrt_incr  is the
     * angular setting of the axis at the start of the integration
     * time for the next frame relative to a given frame and
     * should equal _diffrn_scan_frame_axis.angle  for this
     * next frame.   If the individual frame values
     * vary, then the value of
     * _diffrn_scan_axis.angle_rstrt_incr  will be
     * representative
     * of the ensemble of values of
     * _diffrn_scan_frame_axis.angle_rstrt_incr  (e.g.
     * the mean).
     * @return FloatColumn
     */
    public FloatColumn getAngleRstrtIncr() {
        return delegate.getColumn("angle_rstrt_incr", DelegatingFloatColumn::new);
    }

    /**
     * The starting position for the specified axis in millimetres.
     * @return FloatColumn
     */
    public FloatColumn getDisplacementStart() {
        return delegate.getColumn("displacement_start", DelegatingFloatColumn::new);
    }

    /**
     * The range from the starting position for the specified axis
     * in millimetres.
     * @return FloatColumn
     */
    public FloatColumn getDisplacementRange() {
        return delegate.getColumn("displacement_range", DelegatingFloatColumn::new);
    }

    /**
     * The increment for each step for the specified axis
     * in millimetres.  In general, this will agree with
     * _diffrn_scan_frame_axis.displacement_increment.
     * The sum of the values of
     * _diffrn_scan_frame_axis.displacement  and
     * _diffrn_scan_frame_axis.displacement_increment  is the
     * angular setting of the axis at the end of the integration
     * time for a given frame.  If the individual frame values
     * vary, then the value of
     * _diffrn_scan_axis.displacement_increment  will be
     * representative of the ensemble of values of
     * _diffrn_scan_frame_axis.displacement_increment  (e.g.
     * the mean).
     * @return FloatColumn
     */
    public FloatColumn getDisplacementIncrement() {
        return delegate.getColumn("displacement_increment", DelegatingFloatColumn::new);
    }

    /**
     * The increment for each step for the specified axis
     * in millimetres.  In general, this will agree with
     * _diffrn_scan_frame_axis.displacement_rstrt_incr.
     * The sum of the values of
     * _diffrn_scan_frame_axis.displacement,
     * _diffrn_scan_frame_axis.displacement_increment  and
     * _diffrn_scan_frame_axis.displacement_rstrt_incr  is the
     * angular setting of the axis at the start of the integration
     * time for the next frame relative to a given frame and
     * should equal _diffrn_scan_frame_axis.displacement
     * for this next frame.  If the individual frame values
     * vary, then the value of
     * _diffrn_scan_axis.displacement_rstrt_incr  will be
     * representative of the ensemble of values of
     * _diffrn_scan_frame_axis.displacement_rstrt_incr  (e.g.
     * the mean).
     * @return FloatColumn
     */
    public FloatColumn getDisplacementRstrtIncr() {
        return delegate.getColumn("displacement_rstrt_incr", DelegatingFloatColumn::new);
    }

    /**
     * The setting of the specified axis in degrees
     * against which measurements of the reference beam centre
     * and reference detector distance should be made.
     * 
     * In general, this will agree with
     * _diffrn_scan_frame_axis.reference_angle.
     * 
     * If the individual frame values vary, then the value of
     * _diffrn_scan_axis.reference_angle  will be
     * representative of the ensemble of values of
     * _diffrn_scan_frame_axis.reference_angle  (e.g.
     * the mean).
     * 
     * If not specified, the value defaults to zero.
     * @return FloatColumn
     */
    public FloatColumn getReferenceAngle() {
        return delegate.getColumn("reference_angle", DelegatingFloatColumn::new);
    }

    /**
     * The setting of the specified axis in millimetres
     * against which measurements of the reference beam centre
     * and reference detector distance should be made.
     * 
     * In general, this will agree with
     * _diffrn_scan_frame_axis.reference_displacement.
     * 
     * If the individual frame values vary, then the value of
     * _diffrn_scan_axis.reference_displacement  will be
     * representative of the ensemble of values of
     * _diffrn_scan_frame_axis.reference_displacement  (e.g.
     * the mean).
     * @return FloatColumn
     */
    public FloatColumn getReferenceDisplacement() {
        return delegate.getColumn("reference_displacement", DelegatingFloatColumn::new);
    }

}