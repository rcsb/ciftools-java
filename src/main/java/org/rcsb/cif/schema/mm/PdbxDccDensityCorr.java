package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the category record calculated metrics from various
 * programs (such as phenix, refmac, cns, sfcheck).
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxDccDensityCorr extends DelegatingCategory {
    public PdbxDccDensityCorr(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "ordinal":
                return getOrdinal();
            case "program":
                return getProgram();
            case "ls_d_res_high":
                return getLsDResHigh();
            case "ls_d_res_low":
                return getLsDResLow();
            case "ls_R_factor_R_all":
                return getLsRFactorRAll();
            case "ls_R_factor_R_work":
                return getLsRFactorRWork();
            case "ls_R_factor_R_free":
                return getLsRFactorRFree();
            case "ls_number_reflns_obs":
                return getLsNumberReflnsObs();
            case "ls_percent_reflns_obs":
                return getLsPercentReflnsObs();
            case "ls_number_reflns_R_free":
                return getLsNumberReflnsRFree();
            case "correlation_coeff_Fo_to_Fc":
                return getCorrelationCoeffFoToFc();
            case "real_space_R":
                return getRealSpaceR();
            case "correlation":
                return getCorrelation();
            case "details":
                return getDetails();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The ordered number in the output list.
     * @return IntColumn
     */
    public IntColumn getOrdinal() {
        return delegate.getColumn("ordinal", DelegatingIntColumn::new);
    }

    /**
     * The program used to calculate the metrics in this category.
     * @return StrColumn
     */
    public StrColumn getProgram() {
        return delegate.getColumn("program", DelegatingStrColumn::new);
    }

    /**
     * The highest resolution limit in calculating the metrics in
     * this category.
     * @return FloatColumn
     */
    public FloatColumn getLsDResHigh() {
        return delegate.getColumn("ls_d_res_high", DelegatingFloatColumn::new);
    }

    /**
     * The lowest resolution limit in calculating the metrics in
     * this category.
     * @return FloatColumn
     */
    public FloatColumn getLsDResLow() {
        return delegate.getColumn("ls_d_res_low", DelegatingFloatColumn::new);
    }

    /**
     * The calculated Rfactor using all the data.
     * @return FloatColumn
     */
    public FloatColumn getLsRFactorRAll() {
        return delegate.getColumn("ls_R_factor_R_all", DelegatingFloatColumn::new);
    }

    /**
     * The calculated Rfactor using the working set data.
     * @return FloatColumn
     */
    public FloatColumn getLsRFactorRWork() {
        return delegate.getColumn("ls_R_factor_R_work", DelegatingFloatColumn::new);
    }

    /**
     * The calculated Rfree using the test set data.
     * @return FloatColumn
     */
    public FloatColumn getLsRFactorRFree() {
        return delegate.getColumn("ls_R_factor_R_free", DelegatingFloatColumn::new);
    }

    /**
     * The number of unique reflections (work+test sets).
     * @return IntColumn
     */
    public IntColumn getLsNumberReflnsObs() {
        return delegate.getColumn("ls_number_reflns_obs", DelegatingIntColumn::new);
    }

    /**
     * The percentage of unique reflections (work+test sets).
     * @return FloatColumn
     */
    public FloatColumn getLsPercentReflnsObs() {
        return delegate.getColumn("ls_percent_reflns_obs", DelegatingFloatColumn::new);
    }

    /**
     * The number of reflections for the test set only.
     * @return IntColumn
     */
    public IntColumn getLsNumberReflnsRFree() {
        return delegate.getColumn("ls_number_reflns_R_free", DelegatingIntColumn::new);
    }

    /**
     * The correlations between the observed and calculated structure
     * factors.
     * @return FloatColumn
     */
    public FloatColumn getCorrelationCoeffFoToFc() {
        return delegate.getColumn("correlation_coeff_Fo_to_Fc", DelegatingFloatColumn::new);
    }

    /**
     * The overall real space R factor.
     * @return FloatColumn
     */
    public FloatColumn getRealSpaceR() {
        return delegate.getColumn("real_space_R", DelegatingFloatColumn::new);
    }

    /**
     * The overall real space density correlation coefficient.
     * @return FloatColumn
     */
    public FloatColumn getCorrelation() {
        return delegate.getColumn("correlation", DelegatingFloatColumn::new);
    }

    /**
     * Any additional details of the calculations.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

}