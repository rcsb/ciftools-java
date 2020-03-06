package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the DIFFRN_REFLNS_SHELL category record details about
 * the reflection data set within shells of resolution.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxDiffrnReflnsShell extends DelegatingCategory {
    public PdbxDiffrnReflnsShell(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "diffrn_id":
                return getDiffrnId();
            case "d_res_low":
                return getDResLow();
            case "d_res_high":
                return getDResHigh();
            case "percent_possible_obs":
                return getPercentPossibleObs();
            case "Rmerge_I_obs":
                return getRmergeIObs();
            case "Rsym_value":
                return getRsymValue();
            case "chi_squared":
                return getChiSquared();
            case "redundancy":
                return getRedundancy();
            case "rejects":
                return getRejects();
            case "number_obs":
                return getNumberObs();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * This data item is a pointer to _diffrn.id in the DIFFRN category.
     * This item distingush the different data sets
     * @return StrColumn
     */
    public StrColumn getDiffrnId() {
        return delegate.getColumn("diffrn_id", DelegatingStrColumn::new);
    }

    /**
     * The lowest resolution for the interplanar spacings in the
     * resolution shell.
     * @return FloatColumn
     */
    public FloatColumn getDResLow() {
        return delegate.getColumn("d_res_low", DelegatingFloatColumn::new);
    }

    /**
     * The highest resolution for the interplanar spacings in the
     * resolution shell.
     * @return FloatColumn
     */
    public FloatColumn getDResHigh() {
        return delegate.getColumn("d_res_high", DelegatingFloatColumn::new);
    }

    /**
     * The percentage of geometrically possible reflections represented
     * by reflections that satisfy the resolution limits established
     * by _diffrn_reflns_shell.d_resolution_high and
     * _diffrn_reflns_shell.d_resolution_low and the observation limit
     * established by  _diffrn_reflns.observed_criterion.
     * @return FloatColumn
     */
    public FloatColumn getPercentPossibleObs() {
        return delegate.getColumn("percent_possible_obs", DelegatingFloatColumn::new);
    }

    /**
     * The R factor for the reflections that satisfy the merging
     * criteria for the resolution shell.
     * @return FloatColumn
     */
    public FloatColumn getRmergeIObs() {
        return delegate.getColumn("Rmerge_I_obs", DelegatingFloatColumn::new);
    }

    /**
     * The R factor for averaging the symmetry related reflections
     * for the resolution shell.
     * @return FloatColumn
     */
    public FloatColumn getRsymValue() {
        return delegate.getColumn("Rsym_value", DelegatingFloatColumn::new);
    }

    /**
     * The overall Chi-squared statistic for the resolution shell.
     * @return FloatColumn
     */
    public FloatColumn getChiSquared() {
        return delegate.getColumn("chi_squared", DelegatingFloatColumn::new);
    }

    /**
     * The overall redundancy for the resolution shell.
     * @return FloatColumn
     */
    public FloatColumn getRedundancy() {
        return delegate.getColumn("redundancy", DelegatingFloatColumn::new);
    }

    /**
     * The number of rejected reflections in the resolution shell
     * @return IntColumn
     */
    public IntColumn getRejects() {
        return delegate.getColumn("rejects", DelegatingIntColumn::new);
    }

    /**
     * The number of observed reflections in the resolution shell.
     * @return IntColumn
     */
    public IntColumn getNumberObs() {
        return delegate.getColumn("number_obs", DelegatingIntColumn::new);
    }

}