package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PHASING_MAD_RATIO category record
 * the ratios of phasing statistics between pairs of data sets
 * in a MAD phasing experiment, in given shells of resolution.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PhasingMADRatio extends DelegatingCategory {
    public PhasingMADRatio(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "d_res_high":
                return getDResHigh();
            case "d_res_low":
                return getDResLow();
            case "expt_id":
                return getExptId();
            case "clust_id":
                return getClustId();
            case "ratio_one_wl":
                return getRatioOneWl();
            case "ratio_one_wl_centric":
                return getRatioOneWlCentric();
            case "ratio_two_wl":
                return getRatioTwoWl();
            case "wavelength_1":
                return getWavelength1();
            case "wavelength_2":
                return getWavelength2();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The lowest value for the interplanar spacings for the
     * reflection data used for the comparison of Bijvoet differences.
     * This is called the highest resolution.
     * @return FloatColumn
     */
    public FloatColumn getDResHigh() {
        return delegate.getColumn("d_res_high", DelegatingFloatColumn::new);
    }

    /**
     * The highest value for the interplanar spacings for the
     * reflection data used for the comparison of Bijvoet differences.
     * This is called the lowest resolution.
     * @return FloatColumn
     */
    public FloatColumn getDResLow() {
        return delegate.getColumn("d_res_low", DelegatingFloatColumn::new);
    }

    /**
     * This data item is a pointer to _phasing_MAD_expt.id in the
     * PHASING_MAD_EXPT category.
     * @return StrColumn
     */
    public StrColumn getExptId() {
        return delegate.getColumn("expt_id", DelegatingStrColumn::new);
    }

    /**
     * This data item is a pointer to _phasing_MAD_clust.id in
     * the PHASING_MAD_CLUST category.
     * @return StrColumn
     */
    public StrColumn getClustId() {
        return delegate.getColumn("clust_id", DelegatingStrColumn::new);
    }

    /**
     * The root-mean-square Bijvoet difference at one wavelength for
     * all reflections.
     * @return FloatColumn
     */
    public FloatColumn getRatioOneWl() {
        return delegate.getColumn("ratio_one_wl", DelegatingFloatColumn::new);
    }

    /**
     * The root-mean-square Bijvoet difference at one wavelength for
     * centric reflections. This would be equal to zero for perfect
     * data and thus serves as an estimate of the noise in the
     * anomalous signals.
     * @return FloatColumn
     */
    public FloatColumn getRatioOneWlCentric() {
        return delegate.getColumn("ratio_one_wl_centric", DelegatingFloatColumn::new);
    }

    /**
     * The root-mean-square dispersive Bijvoet difference between
     * two wavelengths for all reflections.
     * @return FloatColumn
     */
    public FloatColumn getRatioTwoWl() {
        return delegate.getColumn("ratio_two_wl", DelegatingFloatColumn::new);
    }

    /**
     * This data item is a pointer to _phasing_MAD_set.wavelength in
     * the PHASING_MAD_SET category.
     * @return FloatColumn
     */
    public FloatColumn getWavelength1() {
        return delegate.getColumn("wavelength_1", DelegatingFloatColumn::new);
    }

    /**
     * This data item is a pointer to _phasing_MAD_set.wavelength in
     * the PHASING_MAD_SET category.
     * @return FloatColumn
     */
    public FloatColumn getWavelength2() {
        return delegate.getColumn("wavelength_2", DelegatingFloatColumn::new);
    }

}