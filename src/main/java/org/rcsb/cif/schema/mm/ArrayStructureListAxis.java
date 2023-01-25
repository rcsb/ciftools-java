package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the ARRAY_STRUCTURE_LIST_AXIS  category describe
 * the physical settings of sets of axes for the centres of pixels that
 * correspond to data points described in the
 * ARRAY_STRUCTURE_LIST  category.
 * 
 * In the simplest cases, the physical increments of a single axis correspond
 * to the increments of a single array index.  More complex organizations,
 * e.g. spiral scans, may require coupled motions along multiple axes.
 * 
 * Note that a spiral scan uses two coupled axes: one for the angular
 * direction and one for the radial direction.  This differs from a
 * cylindrical scan for which the two axes are not coupled into one
 * set.
 * 
 * Axes may be specified either for an entire array or for just a section
 * of an array.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class ArrayStructureListAxis extends DelegatingCategory {
    public ArrayStructureListAxis(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "axis_id":
                return getAxisId();
            case "axis_set_id":
                return getAxisSetId();
            case "angle":
                return getAngle();
            case "angle_increment":
                return getAngleIncrement();
            case "displacement":
                return getDisplacement();
            case "fract_displacement":
                return getFractDisplacement();
            case "displacement_increment":
                return getDisplacementIncrement();
            case "fract_displacement_increment":
                return getFractDisplacementIncrement();
            case "angular_pitch":
                return getAngularPitch();
            case "radial_pitch":
                return getRadialPitch();
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
     * the axes in the set of axes for which settings are being
     * specified.
     * 
     * Multiple axes may be specified for the same value of
     * _array_structure_list_axis.axis_set_id.
     * 
     * This item is a pointer to _axis.id  in the
     * AXIS  category.
     * @return StrColumn
     */
    public StrColumn getAxisId() {
        return delegate.getColumn("axis_id", DelegatingStrColumn::new);
    }

    /**
     * The value of this data item is the identifier of the
     * set of axes for which axis settings are being specified.
     * 
     * Multiple axes may be specified for the same value of
     * _array_structure_list_axis.axis_set_id.
     * 
     * This item is a pointer to
     * _array_structure_list.axis_set_id
     * in the ARRAY_STRUCTURE_LIST  category.
     * 
     * If this item is not specified, it defaults to the corresponding
     * axis identifier.
     * @return StrColumn
     */
    public StrColumn getAxisSetId() {
        return delegate.getColumn("axis_set_id", DelegatingStrColumn::new);
    }

    /**
     * The setting of the specified axis in degrees for the first
     * data point of the array index with the corresponding value
     * of _array_structure_list.axis_set_id.  If the index is
     * specified as 'increasing', this will be the centre of the
     * pixel with index value 1.  If the index is specified as
     * 'decreasing', this will be the centre of the pixel with
     * maximum index value.
     * @return FloatColumn
     */
    public FloatColumn getAngle() {
        return delegate.getColumn("angle", DelegatingFloatColumn::new);
    }

    /**
     * The pixel-centre-to-pixel-centre increment in the angular
     * setting of the specified axis in degrees.  This is not
     * meaningful in the case of 'constant velocity' spiral scans
     * and should not be specified for this case.
     * 
     * See _array_structure_list_axis.angular_pitch.
     * @return FloatColumn
     */
    public FloatColumn getAngleIncrement() {
        return delegate.getColumn("angle_increment", DelegatingFloatColumn::new);
    }

    /**
     * The setting of the specified axis in millimetres for the first
     * data point of the array index with the corresponding value
     * of _array_structure_list.axis_set_id.  If the index is
     * specified as 'increasing', this will be the centre of the
     * pixel with index value 1.  If the index is specified as
     * 'decreasing', this will be the centre of the pixel with
     * maximum index value.
     * @return FloatColumn
     */
    public FloatColumn getDisplacement() {
        return delegate.getColumn("displacement", DelegatingFloatColumn::new);
    }

    /**
     * The setting of the specified axis as a decimal fraction of
     * the axis unit vector for the first data point of the array
     * index with the corresponding value of
     * _array_structure_list.axis_set_id.
     * 
     * If the index is specified as 'increasing', this will be the
     * centre of the pixel with index value 1.  If the index is
     * specified as 'decreasing', this will be the centre of the
     * pixel with maximum index value.
     * @return FloatColumn
     */
    public FloatColumn getFractDisplacement() {
        return delegate.getColumn("fract_displacement", DelegatingFloatColumn::new);
    }

    /**
     * The pixel-centre-to-pixel-centre increment for the displacement
     * setting of the specified axis in millimetres.
     * @return FloatColumn
     */
    public FloatColumn getDisplacementIncrement() {
        return delegate.getColumn("displacement_increment", DelegatingFloatColumn::new);
    }

    /**
     * The pixel-centre-to-pixel-centre increment for the displacement
     * setting of the specified axis as a decimal fraction of the
     * axis unit vector.
     * @return FloatColumn
     */
    public FloatColumn getFractDisplacementIncrement() {
        return delegate.getColumn("fract_displacement_increment", DelegatingFloatColumn::new);
    }

    /**
     * The pixel-centre-to-pixel-centre distance for a one-step
     * change in the setting of the specified axis in millimetres.
     * 
     * This is meaningful only for 'constant velocity' spiral scans
     * or for uncoupled angular scans at a constant radius
     * (cylindrical scans) and should not be specified for cases
     * in which the angle between pixels (rather than the distance
     * between pixels) is uniform.
     * 
     * See _array_structure_list_axis.angle_increment.
     * @return FloatColumn
     */
    public FloatColumn getAngularPitch() {
        return delegate.getColumn("angular_pitch", DelegatingFloatColumn::new);
    }

    /**
     * The radial distance from one 'cylinder' of pixels to the
     * next in millimetres.  If the scan is a 'constant velocity'
     * scan with differing angular displacements between pixels,
     * the value of this item may differ significantly from the
     * value of _array_structure_list_axis.displacement_increment.
     * @return FloatColumn
     */
    public FloatColumn getRadialPitch() {
        return delegate.getColumn("radial_pitch", DelegatingFloatColumn::new);
    }

    /**
     * The value of _array_structure_list_axis.reference_angle
     * specifies the setting of the angle of this axis used for
     * determining a reference beam centre and a reference detector
     * distance.  It is normally expected to be identical to the
     * value of _array_structure_list_axis.angle.
     * @return FloatColumn
     */
    public FloatColumn getReferenceAngle() {
        return delegate.getColumn("reference_angle", DelegatingFloatColumn::new);
    }

    /**
     * The value of _array_structure_list_axis.reference_displacement
     * specifies the setting of the displacement of this axis used
     * for determining a reference beam centre and a reference detector
     * distance.  It is normally expected to be identical to the value
     * of _array_structure_list_axis.displacement.
     * @return FloatColumn
     */
    public FloatColumn getReferenceDisplacement() {
        return delegate.getColumn("reference_displacement", DelegatingFloatColumn::new);
    }

}