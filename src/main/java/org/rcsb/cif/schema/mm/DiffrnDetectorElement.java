package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the DIFFRN_DETECTOR_ELEMENT  category record
 * the details about spatial layout and other characteristics
 * of each element of a detector which may have multiple elements.
 * 
 * In most cases, giving more detailed information
 * in ARRAY_STRUCTURE_LIST and ARRAY_STRUCTURE_LIST_AXIS
 * is preferable to simply providing the centre of the
 * detector element.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class DiffrnDetectorElement extends DelegatingCategory {
    public DiffrnDetectorElement(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "id":
                return getId();
            case "detector_id":
                return getDetectorId();
            case "reference_center_fast":
                return getReferenceCenterFast();
            case "reference_center_slow":
                return getReferenceCenterSlow();
            case "reference_center_units":
                return getReferenceCenterUnits();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The value of _diffrn_detector_element.id  must uniquely
     * identify each element of a detector.
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * This item is a pointer to _diffrn_detector.id
     * in the DIFFRN_DETECTOR  category.
     * @return StrColumn
     */
    public StrColumn getDetectorId() {
        return delegate.getColumn("detector_id", DelegatingStrColumn::new);
    }

    /**
     * The value of _diffrn_detector_element.reference_center_fast  is
     * the fast index axis beam centre position relative to the detector
     * element face in the units specified in the data item
     * _diffrn_detector_element.reference_center_units  along the fast
     * axis of the detector from the centre of the first pixel to
     * the point at which the Z-axis (which should be collinear with the
     * beam) intersects the face of the detector, if in fact it does.
     * At the time of the measurement all settings of the detector
     * positioner should be at their reference settings.  If more than
     * one reference setting has been used the value given should be
     * representative of the beam centre as determined from the ensemble
     * of settings.
     * 
     * It is important to note that for measurements in mm,
     * the sense of the axis is used, rather than the sign of the
     * pixel-to-pixel increments.
     * @return FloatColumn
     */
    public FloatColumn getReferenceCenterFast() {
        return delegate.getColumn("reference_center_fast", DelegatingFloatColumn::new);
    }

    /**
     * The value of _diffrn_detector_element.reference_center_slow  is
     * the slow index axis beam centre position relative to the detector
     * element face in the units specified in the data item
     * _diffrn_detector_element.reference_center_units  along the slow
     * axis of the detector from the centre of the first pixel to
     * the point at which the Z-axis (which should be collinear with the
     * beam) intersects the face of the detector, if in fact it does.
     * At the time of the measurement all settings of the detector
     * positioner should be at their reference settings.  If more than
     * one reference setting has been used the value given should be
     * representative of the beam centre as determined from the ensemble
     * of settings.
     * 
     * It is important to note that the sense of the axis is used,
     * rather than the sign of the pixel-to-pixel increments.
     * @return FloatColumn
     */
    public FloatColumn getReferenceCenterSlow() {
        return delegate.getColumn("reference_center_slow", DelegatingFloatColumn::new);
    }

    /**
     * The value of _diffrn_detector_element.reference_center_units
     * specifies the units in which the values of
     * _diffrn_detector_element.reference_center_fast  and
     * _diffrn_detector_element.reference_center_slow
     * are presented.  The default is 'mm' for millimetres.  The
     * alternatives are 'pixels' and 'bins'.  In all cases the
     * centre distances are measured from the centre of the
     * first pixel, i.e. in a 2x2 binning, the measuring origin
     * is offset from the centres of the bins by one half pixel
     * towards the first pixel.
     * 
     * If 'bins' is specified, the data in
     * _array_intensities.pixel_fast_bin_size,
     * _array_intensities.pixel_slow_bin_size, and
     * _array_intensities.pixel_binning_method
     * are used to define the binning scheme.
     * @return StrColumn
     */
    public StrColumn getReferenceCenterUnits() {
        return delegate.getColumn("reference_center_units", DelegatingStrColumn::new);
    }

}