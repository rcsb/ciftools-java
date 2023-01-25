package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the DIFFRN_DATA_FRAME  category record
 * the details about each frame of data.
 * 
 * The items in this category were previously in a
 * DIFFRN_FRAME_DATA category, which is now deprecated.
 * The items from the old category are provided
 * as aliases but should not be used for new work.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class DiffrnDataFrame extends DelegatingCategory {
    public DiffrnDataFrame(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "array_id":
                return getArrayId();
            case "array_section_id":
                return getArraySectionId();
            case "binary_id":
                return getBinaryId();
            case "center_fast":
                return getCenterFast();
            case "center_slow":
                return getCenterSlow();
            case "center_derived":
                return getCenterDerived();
            case "center_units":
                return getCenterUnits();
            case "detector_element_id":
                return getDetectorElementId();
            case "id":
                return getId();
            case "details":
                return getDetails();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * This item is a pointer to _array_structure.id  in the
     * ARRAY_STRUCTURE  category.
     * @return StrColumn
     */
    public StrColumn getArrayId() {
        return delegate.getColumn("array_id", DelegatingStrColumn::new);
    }

    /**
     * This item is a pointer to _array_structure_list_section.id
     * in the ARRAY_STRUCTURE_LIST_SECTION  category.
     * @return StrColumn
     */
    public StrColumn getArraySectionId() {
        return delegate.getColumn("array_section_id", DelegatingStrColumn::new);
    }

    /**
     * This item is a pointer to _array_data.binary_id  in the
     * ARRAY_DATA  category.
     * @return IntColumn
     */
    public IntColumn getBinaryId() {
        return delegate.getColumn("binary_id", DelegatingIntColumn::new);
    }

    /**
     * The value of _diffrn_data_frame.center_fast  is
     * the fast index axis beam centre position relative to the detector
     * element face in the units specified in the data item
     * _diffrn_data_frame.center_units  along the fast
     * axis of the detector from the centre of the first pixel to
     * the point at which the Z axis (which should be collinear with the
     * beam) intersects the face of the detector, if in fact it does.
     * At the time of the measurement the current settings of
     * the detector positioner for the given frame are used.
     * 
     * It is important to note that for measurements in mm,
     * the sense of the axis is used, rather than the sign of the
     * pixel-to-pixel increments.
     * @return FloatColumn
     */
    public FloatColumn getCenterFast() {
        return delegate.getColumn("center_fast", DelegatingFloatColumn::new);
    }

    /**
     * The value of _diffrn_data_frame.center_slow  is
     * the slow index axis beam centre position relative to the detector
     * element face in the units specified in the data item
     * _diffrn_data_frame.center_units  along the slow
     * axis of the detector from the centre of the first pixel to
     * the point at which the Z axis (which should be collinear with the
     * beam) intersects the face of the detector, if in fact it does.
     * At the time of the measurement the current settings of
     * the detector positioner for the given frame are used.
     * 
     * It is important to note that the sense of the axis is used,
     * rather than the sign of the pixel-to-pixel increments.
     * @return FloatColumn
     */
    public FloatColumn getCenterSlow() {
        return delegate.getColumn("center_slow", DelegatingFloatColumn::new);
    }

    /**
     * The value of _diffrn_data_frame.center_derived
     * is assumed to be 'yes', i.e. that values of
     * _diffrn_data_frame.center_fast  and
     * _diffrn_data_frame.center_slow
     * are derived from the axis settings rather than measured.
     * @return StrColumn
     */
    public StrColumn getCenterDerived() {
        return delegate.getColumn("center_derived", DelegatingStrColumn::new);
    }

    /**
     * The value of _diffrn_data_frame.center_units
     * specifies the units in which the values of
     * _diffrn_data_frame.center_fast  and
     * _diffrn_data_frame.center_slow
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
    public StrColumn getCenterUnits() {
        return delegate.getColumn("center_units", DelegatingStrColumn::new);
    }

    /**
     * This item is a pointer to _diffrn_detector_element.id
     * in the DIFFRN_DETECTOR_ELEMENT  category.
     * @return StrColumn
     */
    public StrColumn getDetectorElementId() {
        return delegate.getColumn("detector_element_id", DelegatingStrColumn::new);
    }

    /**
     * The value of _diffrn_data_frame.id  must uniquely identify
     * each complete frame of data.
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * The value of _diffrn_data_frame.details  should give a
     * description of special aspects of each frame of data.
     * 
     * This is an appropriate location in which to record
     * information from vendor headers as presented in those
     * headers, but it should never be used as a substitute
     * for providing the fully parsed information within
     * the appropriate imgCIF/CBF categories.
     * 
     * Normally, when a conversion from a miniCBF has been done
     * the data from _array_data.header_convention
     * should be transferred to this data item and
     * _array_data.header_convention
     * should be removed.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

}