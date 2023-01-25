package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the ARRAY_INTENSITIES  category record the
 * information required to recover the intensity data from
 * the set of data values stored in the ARRAY_DATA  category.
 * 
 * The detector may have a complex relationship
 * between the raw intensity values and the number of
 * incident photons.  In most cases, the number stored
 * in the final array will have a simple linear relationship
 * to the actual number of incident photons, given by
 * _array_intensities.gain.  If raw, uncorrected values
 * are presented (e.g. for calibration experiments), the
 * value of _array_intensities.linearity  will be 'raw'
 * and _array_intensities.gain will not be used.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class ArrayIntensities extends DelegatingCategory {
    public ArrayIntensities(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "array_id":
                return getArrayId();
            case "binary_id":
                return getBinaryId();
            case "details":
                return getDetails();
            case "gain":
                return getGain();
            case "gain_esd":
                return getGainEsd();
            case "linearity":
                return getLinearity();
            case "offset":
                return getOffset();
            case "overload":
                return getOverload();
            case "pixel_fast_bin_size":
                return getPixelFastBinSize();
            case "pixel_slow_bin_size":
                return getPixelSlowBinSize();
            case "pixel_binning_method":
                return getPixelBinningMethod();
            case "scaling":
                return getScaling();
            case "undefined_value":
                return getUndefinedValue();
            case "underload":
                return getUnderload();
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
     * This item is a pointer to _array_data.binary_id  in the
     * ARRAY_DATA  category.
     * @return IntColumn
     */
    public IntColumn getBinaryId() {
        return delegate.getColumn("binary_id", DelegatingIntColumn::new);
    }

    /**
     * A description of special aspects of the calculation of array
     * intensities.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

    /**
     * Detector 'gain'. The factor by which linearized
     * intensity count values should be divided to produce
     * true photon counts.
     * @return FloatColumn
     */
    public FloatColumn getGain() {
        return delegate.getColumn("gain", DelegatingFloatColumn::new);
    }

    /**
     * The standard uncertainty (estimated standard deviation, e.s.d.)
     * of detector 'gain'.
     * @return FloatColumn
     */
    public FloatColumn getGainEsd() {
        return delegate.getColumn("gain_esd", DelegatingFloatColumn::new);
    }

    /**
     * The intensity linearity scaling method used to convert
     * from the raw intensity to the stored element value:
     * 
     * 'linear' is linear.
     * 
     * 'offset'  means that the value defined by
     * _array_intensities.offset  should be added to each
     * element value.
     * 
     * 'scaling' means that the value defined by
     * _array_intensities.scaling  should be multiplied with each
     * element value.
     * 
     * 'scaling_offset' is the combination of the two previous cases,
     * with the scale factor applied before the offset value.
     * 
     * 'sqrt_scaled' means that the square root of raw
     * intensities multiplied by _array_intensities.scaling  is
     * calculated and stored, perhaps rounded to the nearest
     * integer. Thus, linearization involves dividing the stored
     * values by _array_intensities.scaling  and squaring the
     * result.
     * 
     * 'logarithmic_scaled' means that the logarithm base 10 of
     * raw intensities multiplied by _array_intensities.scaling
     * is calculated and stored, perhaps rounded to the nearest
     * integer. Thus, linearization involves dividing the stored
     * values by _array_intensities.scaling  and calculating 10
     * to the power of this number.
     * 
     * 'raw' means that the data are a set of raw values straight
     * from the detector.
     * @return StrColumn
     */
    public StrColumn getLinearity() {
        return delegate.getColumn("linearity", DelegatingStrColumn::new);
    }

    /**
     * Offset value to add to array element values in the manner
     * described by the item _array_intensities.linearity.
     * @return FloatColumn
     */
    public FloatColumn getOffset() {
        return delegate.getColumn("offset", DelegatingFloatColumn::new);
    }

    /**
     * The saturation intensity level for this data array, i.e. the
     * value above which correct intensities may not be recorded.
     * 
     * The valid pixel values are those less than
     * _array_intensities.overload  and greater than or equal to
     * _array_intensities.underload
     * @return FloatColumn
     */
    public FloatColumn getOverload() {
        return delegate.getColumn("overload", DelegatingFloatColumn::new);
    }

    /**
     * The value of _array_intensities.pixel_fast_bin_size  specifies
     * the number of pixels that compose one element in the direction
     * of the most rapidly varying array dimension.
     * 
     * Typical values are 1, 2, 4 or 8.  When there is 1 pixel per
     * array element in both directions, the value given for
     * _array_intensities.pixel_binning_method  normally should be
     * 'none'.
     * 
     * It is specified as a float to allow for binning algorithms that
     * create array elements that are not integer multiples of the
     * detector pixel size.
     * @return FloatColumn
     */
    public FloatColumn getPixelFastBinSize() {
        return delegate.getColumn("pixel_fast_bin_size", DelegatingFloatColumn::new);
    }

    /**
     * The value of _array_intensities.pixel_slow_bin_size  specifies
     * the number of pixels that compose one element in the direction
     * of the second most rapidly varying array dimension.
     * 
     * Typical values are 1, 2, 4 or 8.  When there is 1 pixel per
     * array element in both directions, the value given for
     * _array_intensities.pixel_binning_method  normally should be
     * 'none'.
     * 
     * It is specified as a float to allow for binning algorithms that
     * create array elements that are not integer multiples of the
     * detector pixel size.
     * @return FloatColumn
     */
    public FloatColumn getPixelSlowBinSize() {
        return delegate.getColumn("pixel_slow_bin_size", DelegatingFloatColumn::new);
    }

    /**
     * The value of _array_intensities.pixel_binning_method  specifies
     * the method used to derive array elements from multiple pixels.
     * @return StrColumn
     */
    public StrColumn getPixelBinningMethod() {
        return delegate.getColumn("pixel_binning_method", DelegatingStrColumn::new);
    }

    /**
     * Multiplicative scaling value to be applied to array data
     * in the manner described by the item
     * _array_intensities.linearity.
     * @return FloatColumn
     */
    public FloatColumn getScaling() {
        return delegate.getColumn("scaling", DelegatingFloatColumn::new);
    }

    /**
     * A value to be substituted for undefined values in
     * the data array.
     * @return FloatColumn
     */
    public FloatColumn getUndefinedValue() {
        return delegate.getColumn("undefined_value", DelegatingFloatColumn::new);
    }

    /**
     * The lowest value at which pixels for this detector are
     * measured.
     * 
     * The valid pixel values are those less than
     * _array_intensities.overload  and greater than or equal to
     * _array_intensities.underload
     * @return FloatColumn
     */
    public FloatColumn getUnderload() {
        return delegate.getColumn("underload", DelegatingFloatColumn::new);
    }

}