package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the REFINE_LS_SHELL category record details about
 * the results of the least-squares refinement broken down into
 * shells of resolution.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class RefineLsShell extends DelegatingCategory {
    public RefineLsShell(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "pdbx_refine_id":
                return getPdbxRefineId();
            case "d_res_high":
                return getDResHigh();
            case "d_res_low":
                return getDResLow();
            case "number_reflns_all":
                return getNumberReflnsAll();
            case "number_reflns_obs":
                return getNumberReflnsObs();
            case "number_reflns_R_free":
                return getNumberReflnsRFree();
            case "number_reflns_R_work":
                return getNumberReflnsRWork();
            case "percent_reflns_obs":
                return getPercentReflnsObs();
            case "percent_reflns_R_free":
                return getPercentReflnsRFree();
            case "R_factor_all":
                return getRFactorAll();
            case "R_factor_obs":
                return getRFactorObs();
            case "R_factor_R_free_error":
                return getRFactorRFreeError();
            case "R_factor_R_work":
                return getRFactorRWork();
            case "redundancy_reflns_all":
                return getRedundancyReflnsAll();
            case "redundancy_reflns_obs":
                return getRedundancyReflnsObs();
            case "wR_factor_all":
                return getWRFactorAll();
            case "wR_factor_obs":
                return getWRFactorObs();
            case "wR_factor_R_free":
                return getWRFactorRFree();
            case "wR_factor_R_work":
                return getWRFactorRWork();
            case "pdbx_R_complete":
                return getPdbxRComplete();
            case "pdbx_total_number_of_bins_used":
                return getPdbxTotalNumberOfBinsUsed();
            case "pdbx_phase_error":
                return getPdbxPhaseError();
            case "pdbx_fsc_work":
                return getPdbxFscWork();
            case "pdbx_fsc_free":
                return getPdbxFscFree();
            case "R_factor_R_free":
                return getRFactorRFree();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * This data item uniquely identifies a refinement within an entry.
     * _refine_ls_shell.pdbx_refine_id can be used to distinguish the results
     * of joint refinements.
     * @return StrColumn
     */
    public StrColumn getPdbxRefineId() {
        return delegate.getColumn("pdbx_refine_id", DelegatingStrColumn::new);
    }

    /**
     * The lowest value for the interplanar spacings for the
     * reflection data in this shell. This is called
     * the highest resolution.
     * @return FloatColumn
     */
    public FloatColumn getDResHigh() {
        return delegate.getColumn("d_res_high", DelegatingFloatColumn::new);
    }

    /**
     * The highest value for the interplanar spacings for the
     * reflection data in this shell. This is called the lowest
     * resolution.
     * @return FloatColumn
     */
    public FloatColumn getDResLow() {
        return delegate.getColumn("d_res_low", DelegatingFloatColumn::new);
    }

    /**
     * The number of reflections that satisfy the resolution limits
     * established by _refine_ls_shell.d_res_high and
     * _refine_ls_shell.d_res_low.
     * @return IntColumn
     */
    public IntColumn getNumberReflnsAll() {
        return delegate.getColumn("number_reflns_all", DelegatingIntColumn::new);
    }

    /**
     * The number of reflections that satisfy the resolution limits
     * established by _refine_ls_shell.d_res_high and
     * _refine_ls_shell.d_res_low and the observation criterion
     * established by _reflns.observed_criterion.
     * @return IntColumn
     */
    public IntColumn getNumberReflnsObs() {
        return delegate.getColumn("number_reflns_obs", DelegatingIntColumn::new);
    }

    /**
     * The number of reflections that satisfy the resolution limits
     * established by _refine_ls_shell.d_res_high and
     * _refine_ls_shell.d_res_low and the observation limit
     * established by _reflns.observed_criterion, and that were used
     * as the test reflections (i.e. were excluded from the refinement)
     * when the refinement included the calculation of a 'free'
     * R factor. Details of how reflections were assigned to the
     * working and test sets are given in _reflns.R_free_details.
     * @return IntColumn
     */
    public IntColumn getNumberReflnsRFree() {
        return delegate.getColumn("number_reflns_R_free", DelegatingIntColumn::new);
    }

    /**
     * The number of reflections that satisfy the resolution limits
     * established by _refine_ls_shell.d_res_high and
     * _refine_ls_shell.d_res_low and the observation limit
     * established by _reflns.observed_criterion, and that were used
     * as the working reflections (i.e. were included in the
     * refinement) when the refinement included the calculation of
     * a 'free' R factor. Details of how reflections were assigned
     * to the working and test sets are given in _reflns.R_free_details.
     * @return IntColumn
     */
    public IntColumn getNumberReflnsRWork() {
        return delegate.getColumn("number_reflns_R_work", DelegatingIntColumn::new);
    }

    /**
     * The number of reflections that satisfy the resolution limits
     * established by _refine_ls_shell.d_res_high and
     * _refine_ls_shell.d_res_low and the observation criterion
     * established by _reflns.observed_criterion, expressed as a
     * percentage of the number of geometrically observable
     * reflections that satisfy the resolution limits.
     * @return FloatColumn
     */
    public FloatColumn getPercentReflnsObs() {
        return delegate.getColumn("percent_reflns_obs", DelegatingFloatColumn::new);
    }

    /**
     * The number of reflections that satisfy the resolution limits
     * established by _refine_ls_shell.d_res_high and
     * _refine_ls_shell.d_res_low and the observation limit
     * established by _reflns.observed_criterion, and that were used
     * as the test reflections (i.e. were excluded from the refinement)
     * when the refinement included the calculation of a 'free'
     * R factor, expressed as a percentage of the number of
     * geometrically observable reflections that satisfy the
     * reflection limits.
     * @return FloatColumn
     */
    public FloatColumn getPercentReflnsRFree() {
        return delegate.getColumn("percent_reflns_R_free", DelegatingFloatColumn::new);
    }

    /**
     * Residual factor R for reflections that satisfy the resolution
     * limits established by _refine_ls_shell.d_res_high and
     * _refine_ls_shell.d_res_low.
     * 
     * sum|F~obs~ - F~calc~|
     * R = ---------------------
     * sum|F~obs~|
     * 
     * F~obs~  = the observed structure-factor amplitudes
     * F~calc~ = the calculated structure-factor amplitudes
     * 
     * sum is taken over the specified reflections
     * @return FloatColumn
     */
    public FloatColumn getRFactorAll() {
        return delegate.getColumn("R_factor_all", DelegatingFloatColumn::new);
    }

    /**
     * Residual factor R for reflections that satisfy the resolution
     * limits established by _refine_ls_shell.d_res_high and
     * _refine_ls_shell.d_res_low and the observation criterion
     * established by _reflns.observed_criterion.
     * 
     * sum|F~obs~ - F~calc~|
     * R = ---------------------
     * sum|F~obs~|
     * 
     * F~obs~  = the observed structure-factor amplitudes
     * F~calc~ = the calculated structure-factor amplitudes
     * 
     * sum is taken over the specified reflections
     * @return FloatColumn
     */
    public FloatColumn getRFactorObs() {
        return delegate.getColumn("R_factor_obs", DelegatingFloatColumn::new);
    }

    /**
     * The estimated error in _refine_ls_shell.R_factor_R_free.
     * The method used to estimate the error is described in the
     * item _refine.ls_R_factor_R_free_error_details.
     * @return FloatColumn
     */
    public FloatColumn getRFactorRFreeError() {
        return delegate.getColumn("R_factor_R_free_error", DelegatingFloatColumn::new);
    }

    /**
     * Residual factor R for reflections that satisfy the resolution
     * limits established by _refine_ls_shell.d_res_high and
     * _refine_ls_shell.d_res_low and the observation limit
     * established by _reflns.observed_criterion, and that were used
     * as the working reflections (i.e. were included in the
     * refinement) when the refinement included the calculation of
     * a 'free' R factor. Details of how reflections were assigned
     * to the working and test sets are given in _reflns.R_free_details.
     * 
     * sum|F~obs~ - F~calc~|
     * R = ---------------------
     * sum|F~obs~|
     * 
     * F~obs~  = the observed structure-factor amplitudes
     * F~calc~ = the calculated structure-factor amplitudes
     * 
     * sum is taken over the specified reflections
     * @return FloatColumn
     */
    public FloatColumn getRFactorRWork() {
        return delegate.getColumn("R_factor_R_work", DelegatingFloatColumn::new);
    }

    /**
     * The ratio of the total number of observations of the reflections
     * that satisfy the resolution limits established by
     * _refine_ls_shell.d_res_high and _refine_ls_shell.d_res_low
     * to the number of crystallographically unique reflections that
     * satisfy the same limits.
     * @return FloatColumn
     */
    public FloatColumn getRedundancyReflnsAll() {
        return delegate.getColumn("redundancy_reflns_all", DelegatingFloatColumn::new);
    }

    /**
     * The ratio of the total number of observations of the
     * reflections that satisfy the resolution limits established by
     * _refine_ls_shell.d_res_high and _refine_ls_shell.d_res_low and
     * the observation criterion established by
     * _reflns.observed_criterion to the number of crystallographically
     * unique reflections that satisfy the same limits.
     * @return FloatColumn
     */
    public FloatColumn getRedundancyReflnsObs() {
        return delegate.getColumn("redundancy_reflns_obs", DelegatingFloatColumn::new);
    }

    /**
     * Weighted residual factor wR for reflections that satisfy the
     * resolution limits established by _refine_ls_shell.d_res_high
     * and _refine_ls_shell.d_res_low.
     * 
     * ( sum|w |Y~obs~ - Y~calc~|^2^| )^1/2^
     * wR = ( ---------------------------- )
     * (        sum|w Y~obs~^2^|      )
     * 
     * Y~obs~  = the observed amplitude specified by
     * _refine.ls_structure_factor_coef
     * Y~calc~ = the calculated amplitude specified by
     * _refine.ls_structure_factor_coef
     * w       = the least-squares weight
     * 
     * sum is taken over the specified reflections
     * @return FloatColumn
     */
    public FloatColumn getWRFactorAll() {
        return delegate.getColumn("wR_factor_all", DelegatingFloatColumn::new);
    }

    /**
     * Weighted residual factor wR for reflections that satisfy the
     * resolution limits established by _refine_ls_shell.d_res_high
     * and _refine_ls_shell.d_res_low and the observation criterion
     * established by _reflns.observed_criterion.
     * 
     * ( sum|w |Y~obs~ - Y~calc~|^2^| )^1/2^
     * wR = ( ---------------------------- )
     * (        sum|w Y~obs~^2^|      )
     * 
     * Y~obs~  = the observed amplitude specified by
     * _refine.ls_structure_factor_coef
     * Y~calc~ = the calculated amplitude specified by
     * _refine.ls_structure_factor_coef
     * w       = the least-squares weight
     * 
     * sum is taken over the specified reflections
     * @return FloatColumn
     */
    public FloatColumn getWRFactorObs() {
        return delegate.getColumn("wR_factor_obs", DelegatingFloatColumn::new);
    }

    /**
     * Weighted residual factor wR for reflections that satisfy the
     * resolution limits established by _refine_ls_shell.d_res_high
     * and _refine_ls_shell.d_res_low and the observation limit
     * established by _reflns.observed_criterion, and that were used
     * as the test reflections (i.e. were excluded from the refinement)
     * when the refinement included the calculation of a 'free'
     * R factor. Details of how reflections were assigned to the
     * working and test sets are given in _reflns.R_free_details.
     * 
     * ( sum|w |Y~obs~ - Y~calc~|^2^| )^1/2^
     * wR = ( ---------------------------- )
     * (        sum|w Y~obs~^2^|      )
     * 
     * Y~obs~  = the observed amplitude specified by
     * _refine.ls_structure_factor_coef
     * Y~calc~ = the calculated amplitude specified by
     * _refine.ls_structure_factor_coef
     * w       = the least-squares weight
     * 
     * sum is taken over the specified reflections
     * @return FloatColumn
     */
    public FloatColumn getWRFactorRFree() {
        return delegate.getColumn("wR_factor_R_free", DelegatingFloatColumn::new);
    }

    /**
     * Weighted residual factor wR for reflections that satisfy the
     * resolution limits established by _refine_ls_shell.d_res_high
     * and _refine_ls_shell.d_res_low and the observation limit
     * established by _reflns.observed_criterion, and that were used
     * as the working reflections (i.e. were included in the
     * refinement) when the refinement included the calculation of
     * a 'free' R factor. Details of how reflections were assigned
     * to the working and test sets are given in _reflns.R_free_details.
     * 
     * ( sum|w |Y~obs~ - Y~calc~|^2^| )^1/2^
     * wR = ( ---------------------------- )
     * (        sum|w Y~obs~^2^|      )
     * 
     * Y~obs~  = the observed amplitude specified by
     * _refine.ls_structure_factor_coef
     * Y~calc~ = the calculated amplitude specified by
     * _refine.ls_structure_factor_coef
     * w       = the least-squares weight
     * 
     * sum is taken over the specified reflections
     * @return FloatColumn
     */
    public FloatColumn getWRFactorRWork() {
        return delegate.getColumn("wR_factor_R_work", DelegatingFloatColumn::new);
    }

    /**
     * The crystallographic reliability index Rcomplete for
     * reflections that satisfy the resolution limits
     * established by _refine_ls_shell.d_res_high and
     * _refine_ls_shell.d_res_low and the observation limit
     * established by _reflns.observed_criterion
     * 
     * Ref: Luebben, J., Gruene, T., (2015). Proc.Nat.Acad.Sci. 112(29) 8999-9003
     * @return FloatColumn
     */
    public FloatColumn getPdbxRComplete() {
        return delegate.getColumn("pdbx_R_complete", DelegatingFloatColumn::new);
    }

    /**
     * Total number of bins used.
     * @return IntColumn
     */
    public IntColumn getPdbxTotalNumberOfBinsUsed() {
        return delegate.getColumn("pdbx_total_number_of_bins_used", DelegatingIntColumn::new);
    }

    /**
     * The average phase error for all reflections in the resolution shell.
     * @return FloatColumn
     */
    public FloatColumn getPdbxPhaseError() {
        return delegate.getColumn("pdbx_phase_error", DelegatingFloatColumn::new);
    }

    /**
     * Fourier Shell Correlation (FSC) between model and
     * observed structure factors for reflections included in refinement.
     * 
     * FSC is a measure of the agreement between observed
     * and calculated structure factors as complex numbers.
     * 
     * (sum(|F~o~| |F~c~| fom cos(phi~c~-phi~o~)))
     * FSC~work~  = --------------------------------------
     * (sum(|F~o~|^2^) (sum(|F~c~|^2^)))^1/2^
     * 
     * |F~o~|   = amplitude of observed structure factor
     * |F~c~|   = amplitude of calculated structure factor
     * phi~o~   = phase of observed structure factor
     * phi~c~   = phase of calculated structure factor
     * fom      = figure of merit of the experimental phases.
     * 
     * Summation is carried over all working reflections in the resolution shell.
     * 
     * Ref:  Rosenthal P.B., Henderson R.
     * "Optimal determination of particle orientation, absolute hand,
     * and contrast loss in single-particle electron cryomicroscopy.
     * Journal of Molecular Biology. 2003;333(4):721-745, equation (A6).
     * @return FloatColumn
     */
    public FloatColumn getPdbxFscWork() {
        return delegate.getColumn("pdbx_fsc_work", DelegatingFloatColumn::new);
    }

    /**
     * Fourier Shell Correlation (FSC) between model and
     * observed structure factors for reflections not included in refinement.
     * 
     * FSC is a measure of the agreement between observed
     * and calculated structure factors as complex numbers.
     * 
     * (sum(|F~o~| |F~c~| fom cos(phi~c~-phi~o~)))
     * FSC~free~  = --------------------------------------
     * (sum(|F~o~|^2^) (sum(|F~c~|^2^)))^1/2^
     * 
     * |F~o~|   = amplitude of observed structure factor
     * |F~c~|   = amplitude of calculated structure factor
     * phi~o~   = phase of observed structure factor
     * phi~c~   = phase of calculated structure factor
     * fom      = figure of merit of the experimental phases.
     * 
     * Summation is carried over all free reflections in the resolution shell.
     * 
     * Ref:  Rosenthal P.B., Henderson R.
     * "Optimal determination of particle orientation, absolute hand,
     * and contrast loss in single-particle electron cryomicroscopy.
     * Journal of Molecular Biology. 2003;333(4):721-745, equation (A6).
     * @return FloatColumn
     */
    public FloatColumn getPdbxFscFree() {
        return delegate.getColumn("pdbx_fsc_free", DelegatingFloatColumn::new);
    }

    /**
     * Residual factor R for reflections that satisfy the resolution
     * limits established by _refine_ls_shell.d_res_high and
     * _refine_ls_shell.d_res_low and the observation limit
     * established by _reflns.observed_criterion, and that were
     * used as the test reflections (i.e. were excluded from the
     * refinement) when the refinement included the calculation
     * of a 'free' R factor. Details of how reflections were assigned
     * to the working and test sets are given in _reflns.R_free_details.
     * 
     * sum|F~obs~ - F~calc~|
     * R = ---------------------
     * sum|F~obs~|
     * 
     * F~obs~  = the observed structure-factor amplitudes
     * F~calc~ = the calculated structure-factor amplitudes
     * 
     * sum is taken over the specified reflections
     * @return FloatColumn
     */
    public FloatColumn getRFactorRFree() {
        return delegate.getColumn("R_factor_R_free", DelegatingFloatColumn::new);
    }

}