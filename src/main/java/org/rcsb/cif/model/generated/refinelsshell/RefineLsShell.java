package org.rcsb.cif.model.generated.refinelsshell;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class RefineLsShell extends BaseCategory {
    public RefineLsShell(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public RefineLsShell(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public RefineLsShell(String name) {
        super(name);
    }

    /**
     * This data item uniquely identifies a refinement within an entry.
     * _refine_ls_shell.pdbx_refine_id can be used to distinguish the results
     * of joint refinements.
     * @return PdbxRefineId
     */
    public PdbxRefineId getPdbxRefineId() {
        return (PdbxRefineId) (isText ? textFields.computeIfAbsent("pdbx_refine_id",
                PdbxRefineId::new) : getBinaryColumn("pdbx_refine_id"));
    }

    /**
     * The lowest value for the interplanar spacings for the
     * reflection data in this shell. This is called
     * the highest resolution.
     * @return DResHigh
     */
    public DResHigh getDResHigh() {
        return (DResHigh) (isText ? textFields.computeIfAbsent("d_res_high",
                DResHigh::new) : getBinaryColumn("d_res_high"));
    }

    /**
     * The highest value for the interplanar spacings for the
     * reflection data in this shell. This is called the lowest
     * resolution.
     * @return DResLow
     */
    public DResLow getDResLow() {
        return (DResLow) (isText ? textFields.computeIfAbsent("d_res_low",
                DResLow::new) : getBinaryColumn("d_res_low"));
    }

    /**
     * The number of reflections that satisfy the resolution limits
     * established by _refine_ls_shell.d_res_high and
     * _refine_ls_shell.d_res_low.
     * @return NumberReflnsAll
     */
    public NumberReflnsAll getNumberReflnsAll() {
        return (NumberReflnsAll) (isText ? textFields.computeIfAbsent("number_reflns_all",
                NumberReflnsAll::new) : getBinaryColumn("number_reflns_all"));
    }

    /**
     * The number of reflections that satisfy the resolution limits
     * established by _refine_ls_shell.d_res_high and
     * _refine_ls_shell.d_res_low and the observation criterion
     * established by _reflns.observed_criterion.
     * @return NumberReflnsObs
     */
    public NumberReflnsObs getNumberReflnsObs() {
        return (NumberReflnsObs) (isText ? textFields.computeIfAbsent("number_reflns_obs",
                NumberReflnsObs::new) : getBinaryColumn("number_reflns_obs"));
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
     * @return NumberReflnsRFree
     */
    public NumberReflnsRFree getNumberReflnsRFree() {
        return (NumberReflnsRFree) (isText ? textFields.computeIfAbsent("number_reflns_R_free",
                NumberReflnsRFree::new) : getBinaryColumn("number_reflns_R_free"));
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
     * @return NumberReflnsRWork
     */
    public NumberReflnsRWork getNumberReflnsRWork() {
        return (NumberReflnsRWork) (isText ? textFields.computeIfAbsent("number_reflns_R_work",
                NumberReflnsRWork::new) : getBinaryColumn("number_reflns_R_work"));
    }

    /**
     * The number of reflections that satisfy the resolution limits
     * established by _refine_ls_shell.d_res_high and
     * _refine_ls_shell.d_res_low and the observation criterion
     * established by _reflns.observed_criterion, expressed as a
     * percentage of the number of geometrically observable
     * reflections that satisfy the resolution limits.
     * @return PercentReflnsObs
     */
    public PercentReflnsObs getPercentReflnsObs() {
        return (PercentReflnsObs) (isText ? textFields.computeIfAbsent("percent_reflns_obs",
                PercentReflnsObs::new) : getBinaryColumn("percent_reflns_obs"));
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
     * @return PercentReflnsRFree
     */
    public PercentReflnsRFree getPercentReflnsRFree() {
        return (PercentReflnsRFree) (isText ? textFields.computeIfAbsent("percent_reflns_R_free",
                PercentReflnsRFree::new) : getBinaryColumn("percent_reflns_R_free"));
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
     * @return RFactorAll
     */
    public RFactorAll getRFactorAll() {
        return (RFactorAll) (isText ? textFields.computeIfAbsent("R_factor_all",
                RFactorAll::new) : getBinaryColumn("R_factor_all"));
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
     * @return RFactorObs
     */
    public RFactorObs getRFactorObs() {
        return (RFactorObs) (isText ? textFields.computeIfAbsent("R_factor_obs",
                RFactorObs::new) : getBinaryColumn("R_factor_obs"));
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
     * @return RFactorRFree
     */
    public RFactorRFree getRFactorRFree() {
        return (RFactorRFree) (isText ? textFields.computeIfAbsent("R_factor_R_free",
                RFactorRFree::new) : getBinaryColumn("R_factor_R_free"));
    }

    /**
     * The estimated error in _refine_ls_shell.R_factor_R_free.
     * The method used to estimate the error is described in the
     * item _refine.ls_R_factor_R_free_error_details.
     * @return RFactorRFreeError
     */
    public RFactorRFreeError getRFactorRFreeError() {
        return (RFactorRFreeError) (isText ? textFields.computeIfAbsent("R_factor_R_free_error",
                RFactorRFreeError::new) : getBinaryColumn("R_factor_R_free_error"));
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
     * @return RFactorRWork
     */
    public RFactorRWork getRFactorRWork() {
        return (RFactorRWork) (isText ? textFields.computeIfAbsent("R_factor_R_work",
                RFactorRWork::new) : getBinaryColumn("R_factor_R_work"));
    }

    /**
     * The ratio of the total number of observations of the reflections
     * that satisfy the resolution limits established by
     * _refine_ls_shell.d_res_high and _refine_ls_shell.d_res_low
     * to the number of crystallographically unique reflections that
     * satisfy the same limits.
     * @return RedundancyReflnsAll
     */
    public RedundancyReflnsAll getRedundancyReflnsAll() {
        return (RedundancyReflnsAll) (isText ? textFields.computeIfAbsent("redundancy_reflns_all",
                RedundancyReflnsAll::new) : getBinaryColumn("redundancy_reflns_all"));
    }

    /**
     * The ratio of the total number of observations of the
     * reflections that satisfy the resolution limits established by
     * _refine_ls_shell.d_res_high and _refine_ls_shell.d_res_low and
     * the observation criterion established by
     * _reflns.observed_criterion to the number of crystallographically
     * unique reflections that satisfy the same limits.
     * @return RedundancyReflnsObs
     */
    public RedundancyReflnsObs getRedundancyReflnsObs() {
        return (RedundancyReflnsObs) (isText ? textFields.computeIfAbsent("redundancy_reflns_obs",
                RedundancyReflnsObs::new) : getBinaryColumn("redundancy_reflns_obs"));
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
     * @return WRFactorAll
     */
    public WRFactorAll getWRFactorAll() {
        return (WRFactorAll) (isText ? textFields.computeIfAbsent("wR_factor_all",
                WRFactorAll::new) : getBinaryColumn("wR_factor_all"));
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
     * @return WRFactorObs
     */
    public WRFactorObs getWRFactorObs() {
        return (WRFactorObs) (isText ? textFields.computeIfAbsent("wR_factor_obs",
                WRFactorObs::new) : getBinaryColumn("wR_factor_obs"));
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
     * @return WRFactorRFree
     */
    public WRFactorRFree getWRFactorRFree() {
        return (WRFactorRFree) (isText ? textFields.computeIfAbsent("wR_factor_R_free",
                WRFactorRFree::new) : getBinaryColumn("wR_factor_R_free"));
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
     * @return WRFactorRWork
     */
    public WRFactorRWork getWRFactorRWork() {
        return (WRFactorRWork) (isText ? textFields.computeIfAbsent("wR_factor_R_work",
                WRFactorRWork::new) : getBinaryColumn("wR_factor_R_work"));
    }

    /**
     * Total number of bins used.
     * @return PdbxTotalNumberOfBinsUsed
     */
    public PdbxTotalNumberOfBinsUsed getPdbxTotalNumberOfBinsUsed() {
        return (PdbxTotalNumberOfBinsUsed) (isText ? textFields.computeIfAbsent("pdbx_total_number_of_bins_used",
                PdbxTotalNumberOfBinsUsed::new) : getBinaryColumn("pdbx_total_number_of_bins_used"));
    }

    /**
     * The average phase error for all reflections in the resolution shell.
     * @return PdbxPhaseError
     */
    public PdbxPhaseError getPdbxPhaseError() {
        return (PdbxPhaseError) (isText ? textFields.computeIfAbsent("pdbx_phase_error",
                PdbxPhaseError::new) : getBinaryColumn("pdbx_phase_error"));
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
     * @return PdbxFscWork
     */
    public PdbxFscWork getPdbxFscWork() {
        return (PdbxFscWork) (isText ? textFields.computeIfAbsent("pdbx_fsc_work",
                PdbxFscWork::new) : getBinaryColumn("pdbx_fsc_work"));
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
     * @return PdbxFscFree
     */
    public PdbxFscFree getPdbxFscFree() {
        return (PdbxFscFree) (isText ? textFields.computeIfAbsent("pdbx_fsc_free",
                PdbxFscFree::new) : getBinaryColumn("pdbx_fsc_free"));
    }
}
