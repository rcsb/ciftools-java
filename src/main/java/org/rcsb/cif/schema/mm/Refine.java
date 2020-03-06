package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the REFINE category record details about the
 * structure-refinement parameters.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class Refine extends DelegatingCategory {
    public Refine(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "aniso_B[1][1]":
                return getAnisoB11();
            case "aniso_B[1][2]":
                return getAnisoB12();
            case "aniso_B[1][3]":
                return getAnisoB13();
            case "aniso_B[2][2]":
                return getAnisoB22();
            case "aniso_B[2][3]":
                return getAnisoB23();
            case "aniso_B[3][3]":
                return getAnisoB33();
            case "B_iso_max":
                return getBIsoMax();
            case "B_iso_mean":
                return getBIsoMean();
            case "B_iso_min":
                return getBIsoMin();
            case "correlation_coeff_Fo_to_Fc":
                return getCorrelationCoeffFoToFc();
            case "correlation_coeff_Fo_to_Fc_free":
                return getCorrelationCoeffFoToFcFree();
            case "details":
                return getDetails();
            case "diff_density_max":
                return getDiffDensityMax();
            case "diff_density_max_esd":
                return getDiffDensityMaxEsd();
            case "diff_density_min":
                return getDiffDensityMin();
            case "diff_density_min_esd":
                return getDiffDensityMinEsd();
            case "diff_density_rms":
                return getDiffDensityRms();
            case "diff_density_rms_esd":
                return getDiffDensityRmsEsd();
            case "entry_id":
                return getEntryId();
            case "pdbx_refine_id":
                return getPdbxRefineId();
            case "ls_abs_structure_details":
                return getLsAbsStructureDetails();
            case "ls_abs_structure_Flack":
                return getLsAbsStructureFlack();
            case "ls_abs_structure_Flack_esd":
                return getLsAbsStructureFlackEsd();
            case "ls_abs_structure_Rogers":
                return getLsAbsStructureRogers();
            case "ls_abs_structure_Rogers_esd":
                return getLsAbsStructureRogersEsd();
            case "ls_d_res_high":
                return getLsDResHigh();
            case "ls_d_res_low":
                return getLsDResLow();
            case "ls_extinction_coef":
                return getLsExtinctionCoef();
            case "ls_extinction_coef_esd":
                return getLsExtinctionCoefEsd();
            case "ls_extinction_expression":
                return getLsExtinctionExpression();
            case "ls_extinction_method":
                return getLsExtinctionMethod();
            case "ls_goodness_of_fit_all":
                return getLsGoodnessOfFitAll();
            case "ls_goodness_of_fit_all_esd":
                return getLsGoodnessOfFitAllEsd();
            case "ls_goodness_of_fit_obs":
                return getLsGoodnessOfFitObs();
            case "ls_goodness_of_fit_obs_esd":
                return getLsGoodnessOfFitObsEsd();
            case "ls_hydrogen_treatment":
                return getLsHydrogenTreatment();
            case "ls_matrix_type":
                return getLsMatrixType();
            case "ls_number_constraints":
                return getLsNumberConstraints();
            case "ls_number_parameters":
                return getLsNumberParameters();
            case "ls_number_reflns_all":
                return getLsNumberReflnsAll();
            case "ls_number_reflns_obs":
                return getLsNumberReflnsObs();
            case "ls_number_reflns_R_free":
                return getLsNumberReflnsRFree();
            case "ls_number_reflns_R_work":
                return getLsNumberReflnsRWork();
            case "ls_number_restraints":
                return getLsNumberRestraints();
            case "ls_percent_reflns_obs":
                return getLsPercentReflnsObs();
            case "ls_percent_reflns_R_free":
                return getLsPercentReflnsRFree();
            case "ls_R_factor_all":
                return getLsRFactorAll();
            case "ls_R_factor_obs":
                return getLsRFactorObs();
            case "ls_R_factor_R_free":
                return getLsRFactorRFree();
            case "ls_R_factor_R_free_error":
                return getLsRFactorRFreeError();
            case "ls_R_factor_R_free_error_details":
                return getLsRFactorRFreeErrorDetails();
            case "ls_R_factor_R_work":
                return getLsRFactorRWork();
            case "ls_R_Fsqd_factor_obs":
                return getLsRFsqdFactorObs();
            case "ls_R_I_factor_obs":
                return getLsRIFactorObs();
            case "ls_redundancy_reflns_all":
                return getLsRedundancyReflnsAll();
            case "ls_redundancy_reflns_obs":
                return getLsRedundancyReflnsObs();
            case "ls_restrained_S_all":
                return getLsRestrainedSAll();
            case "ls_restrained_S_obs":
                return getLsRestrainedSObs();
            case "ls_shift_over_esd_max":
                return getLsShiftOverEsdMax();
            case "ls_shift_over_esd_mean":
                return getLsShiftOverEsdMean();
            case "ls_structure_factor_coef":
                return getLsStructureFactorCoef();
            case "ls_weighting_details":
                return getLsWeightingDetails();
            case "ls_weighting_scheme":
                return getLsWeightingScheme();
            case "ls_wR_factor_all":
                return getLsWRFactorAll();
            case "ls_wR_factor_obs":
                return getLsWRFactorObs();
            case "ls_wR_factor_R_free":
                return getLsWRFactorRFree();
            case "ls_wR_factor_R_work":
                return getLsWRFactorRWork();
            case "occupancy_max":
                return getOccupancyMax();
            case "occupancy_min":
                return getOccupancyMin();
            case "solvent_model_details":
                return getSolventModelDetails();
            case "solvent_model_param_bsol":
                return getSolventModelParamBsol();
            case "solvent_model_param_ksol":
                return getSolventModelParamKsol();
            case "pdbx_R_complete":
                return getPdbxRComplete();
            case "ls_R_factor_gt":
                return getLsRFactorGt();
            case "ls_goodness_of_fit_gt":
                return getLsGoodnessOfFitGt();
            case "ls_goodness_of_fit_ref":
                return getLsGoodnessOfFitRef();
            case "ls_shift_over_su_max":
                return getLsShiftOverSuMax();
            case "ls_shift_over_su_max_lt":
                return getLsShiftOverSuMaxLt();
            case "ls_shift_over_su_mean":
                return getLsShiftOverSuMean();
            case "ls_shift_over_su_mean_lt":
                return getLsShiftOverSuMeanLt();
            case "pdbx_ls_sigma_I":
                return getPdbxLsSigmaI();
            case "pdbx_ls_sigma_F":
                return getPdbxLsSigmaF();
            case "pdbx_ls_sigma_Fsqd":
                return getPdbxLsSigmaFsqd();
            case "pdbx_data_cutoff_high_absF":
                return getPdbxDataCutoffHighAbsF();
            case "pdbx_data_cutoff_high_rms_absF":
                return getPdbxDataCutoffHighRmsAbsF();
            case "pdbx_data_cutoff_low_absF":
                return getPdbxDataCutoffLowAbsF();
            case "pdbx_isotropic_thermal_model":
                return getPdbxIsotropicThermalModel();
            case "pdbx_ls_cross_valid_method":
                return getPdbxLsCrossValidMethod();
            case "pdbx_method_to_determine_struct":
                return getPdbxMethodToDetermineStruct();
            case "pdbx_starting_model":
                return getPdbxStartingModel();
            case "pdbx_stereochemistry_target_values":
                return getPdbxStereochemistryTargetValues();
            case "pdbx_R_Free_selection_details":
                return getPdbxRFreeSelectionDetails();
            case "pdbx_stereochem_target_val_spec_case":
                return getPdbxStereochemTargetValSpecCase();
            case "pdbx_overall_ESU_R":
                return getPdbxOverallESUR();
            case "pdbx_overall_ESU_R_Free":
                return getPdbxOverallESURFree();
            case "pdbx_solvent_vdw_probe_radii":
                return getPdbxSolventVdwProbeRadii();
            case "pdbx_solvent_ion_probe_radii":
                return getPdbxSolventIonProbeRadii();
            case "pdbx_solvent_shrinkage_radii":
                return getPdbxSolventShrinkageRadii();
            case "pdbx_real_space_R":
                return getPdbxRealSpaceR();
            case "pdbx_density_correlation":
                return getPdbxDensityCorrelation();
            case "pdbx_pd_number_of_powder_patterns":
                return getPdbxPdNumberOfPowderPatterns();
            case "pdbx_pd_number_of_points":
                return getPdbxPdNumberOfPoints();
            case "pdbx_pd_meas_number_of_points":
                return getPdbxPdMeasNumberOfPoints();
            case "pdbx_pd_proc_ls_prof_R_factor":
                return getPdbxPdProcLsProfRFactor();
            case "pdbx_pd_proc_ls_prof_wR_factor":
                return getPdbxPdProcLsProfWRFactor();
            case "pdbx_pd_Marquardt_correlation_coeff":
                return getPdbxPdMarquardtCorrelationCoeff();
            case "pdbx_pd_Fsqrd_R_factor":
                return getPdbxPdFsqrdRFactor();
            case "pdbx_pd_ls_matrix_band_width":
                return getPdbxPdLsMatrixBandWidth();
            case "pdbx_overall_phase_error":
                return getPdbxOverallPhaseError();
            case "pdbx_overall_SU_R_free_Cruickshank_DPI":
                return getPdbxOverallSURFreeCruickshankDPI();
            case "pdbx_overall_SU_R_free_Blow_DPI":
                return getPdbxOverallSURFreeBlowDPI();
            case "pdbx_overall_SU_R_Blow_DPI":
                return getPdbxOverallSURBlowDPI();
            case "pdbx_TLS_residual_ADP_flag":
                return getPdbxTLSResidualADPFlag();
            case "pdbx_diffrn_id":
                return getPdbxDiffrnId();
            case "overall_SU_B":
                return getOverallSUB();
            case "overall_SU_ML":
                return getOverallSUML();
            case "overall_SU_R_Cruickshank_DPI":
                return getOverallSURCruickshankDPI();
            case "overall_SU_R_free":
                return getOverallSURFree();
            case "overall_FOM_free_R_set":
                return getOverallFOMFreeRSet();
            case "overall_FOM_work_R_set":
                return getOverallFOMWorkRSet();
            case "pdbx_average_fsc_overall":
                return getPdbxAverageFscOverall();
            case "pdbx_average_fsc_work":
                return getPdbxAverageFscWork();
            case "pdbx_average_fsc_free":
                return getPdbxAverageFscFree();
            case "pdbx_overall_ESU_B":
                return getPdbxOverallESUB();
            case "pdbx_overall_ESU_ML":
                return getPdbxOverallESUML();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The elements of the matrix that defines the overall
     * anisotropic displacement model if one was refined for this
     * structure.
     * @return FloatColumn
     */
    public FloatColumn getAnisoB11() {
        return delegate.getColumn("aniso_B[1][1]", DelegatingFloatColumn::new);
    }

    /**
     * The elements of the matrix that defines the overall
     * anisotropic displacement model if one was refined for this
     * structure.
     * @return FloatColumn
     */
    public FloatColumn getAnisoB12() {
        return delegate.getColumn("aniso_B[1][2]", DelegatingFloatColumn::new);
    }

    /**
     * The elements of the matrix that defines the overall
     * anisotropic displacement model if one was refined for this
     * structure.
     * @return FloatColumn
     */
    public FloatColumn getAnisoB13() {
        return delegate.getColumn("aniso_B[1][3]", DelegatingFloatColumn::new);
    }

    /**
     * The elements of the matrix that defines the overall
     * anisotropic displacement model if one was refined for this
     * structure.
     * @return FloatColumn
     */
    public FloatColumn getAnisoB22() {
        return delegate.getColumn("aniso_B[2][2]", DelegatingFloatColumn::new);
    }

    /**
     * The elements of the matrix that defines the overall
     * anisotropic displacement model if one was refined for this
     * structure.
     * @return FloatColumn
     */
    public FloatColumn getAnisoB23() {
        return delegate.getColumn("aniso_B[2][3]", DelegatingFloatColumn::new);
    }

    /**
     * The elements of the matrix that defines the overall
     * anisotropic displacement model if one was refined for this
     * structure.
     * @return FloatColumn
     */
    public FloatColumn getAnisoB33() {
        return delegate.getColumn("aniso_B[3][3]", DelegatingFloatColumn::new);
    }

    /**
     * The maximum isotropic displacement parameter (B value)
     * found in the coordinate set.
     * @return FloatColumn
     */
    public FloatColumn getBIsoMax() {
        return delegate.getColumn("B_iso_max", DelegatingFloatColumn::new);
    }

    /**
     * The mean isotropic displacement parameter (B value)
     * for the coordinate set.
     * @return FloatColumn
     */
    public FloatColumn getBIsoMean() {
        return delegate.getColumn("B_iso_mean", DelegatingFloatColumn::new);
    }

    /**
     * The minimum isotropic displacement parameter (B value)
     * found in the coordinate set.
     * @return FloatColumn
     */
    public FloatColumn getBIsoMin() {
        return delegate.getColumn("B_iso_min", DelegatingFloatColumn::new);
    }

    /**
     * The correlation coefficient between the observed and
     * calculated structure factors for reflections included in
     * the refinement.
     * 
     * The correlation coefficient is scale-independent and gives
     * an idea of the quality of the refined model.
     * 
     * sum~i~(Fo~i~ Fc~i~ - &lt;Fo&gt;&lt;Fc&gt;)
     * R~corr~ = ------------------------------------------------------------
     * SQRT{sum~i~(Fo~i~)^2^-&lt;Fo&gt;^2^} SQRT{sum~i~(Fc~i~)^2^-&lt;Fc&gt;^2^}
     * 
     * Fo = observed structure factors
     * Fc = calculated structure factors
     * &lt;&gt;   denotes average value
     * 
     * summation is over reflections included in the refinement
     * @return FloatColumn
     */
    public FloatColumn getCorrelationCoeffFoToFc() {
        return delegate.getColumn("correlation_coeff_Fo_to_Fc", DelegatingFloatColumn::new);
    }

    /**
     * The correlation coefficient between the observed and
     * calculated structure factors for reflections not included
     * in the refinement (free reflections).
     * 
     * The correlation coefficient is scale-independent and gives
     * an idea of the quality of the refined model.
     * 
     * sum~i~(Fo~i~ Fc~i~ - &lt;Fo&gt;&lt;Fc&gt;)
     * R~corr~ = ------------------------------------------------------------
     * SQRT{sum~i~(Fo~i~)^2^-&lt;Fo&gt;^2^} SQRT{sum~i~(Fc~i~)^2^-&lt;Fc&gt;^2^}
     * 
     * Fo  = observed structure factors
     * Fc  = calculated structure factors
     * &lt;&gt;    denotes average value
     * 
     * summation is over reflections not included
     * in the refinement (free reflections)
     * @return FloatColumn
     */
    public FloatColumn getCorrelationCoeffFoToFcFree() {
        return delegate.getColumn("correlation_coeff_Fo_to_Fc_free", DelegatingFloatColumn::new);
    }

    /**
     * Description of special aspects of the refinement process.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

    /**
     * The maximum value of the electron density in the final difference
     * Fourier map.
     * @return FloatColumn
     */
    public FloatColumn getDiffDensityMax() {
        return delegate.getColumn("diff_density_max", DelegatingFloatColumn::new);
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _refine.diff_density_max.
     * @return FloatColumn
     */
    public FloatColumn getDiffDensityMaxEsd() {
        return delegate.getColumn("diff_density_max_esd", DelegatingFloatColumn::new);
    }

    /**
     * The minimum value of the electron density in the final difference
     * Fourier map.
     * @return FloatColumn
     */
    public FloatColumn getDiffDensityMin() {
        return delegate.getColumn("diff_density_min", DelegatingFloatColumn::new);
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _refine.diff_density_min.
     * @return FloatColumn
     */
    public FloatColumn getDiffDensityMinEsd() {
        return delegate.getColumn("diff_density_min_esd", DelegatingFloatColumn::new);
    }

    /**
     * The root-mean-square-deviation of the electron density in the
     * final difference Fourier map. This value is measured with respect
     * to the arithmetic mean density and is derived from summations
     * over each grid point in the asymmetric unit of the cell. This
     * quantity is useful for assessing the significance of the values
     * of _refine.diff_density_min and _refine.diff_density_max, and
     * also for defining suitable contour levels.
     * @return FloatColumn
     */
    public FloatColumn getDiffDensityRms() {
        return delegate.getColumn("diff_density_rms", DelegatingFloatColumn::new);
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _refine.diff_density_rms.
     * @return FloatColumn
     */
    public FloatColumn getDiffDensityRmsEsd() {
        return delegate.getColumn("diff_density_rms_esd", DelegatingFloatColumn::new);
    }

    /**
     * This data item is a pointer to _entry.id in the ENTRY category.
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return delegate.getColumn("entry_id", DelegatingStrColumn::new);
    }

    /**
     * This data item uniquely identifies a refinement within an entry.
     * _refine.pdbx_refine_id can be used to distinguish the results of
     * joint refinements.
     * @return StrColumn
     */
    public StrColumn getPdbxRefineId() {
        return delegate.getColumn("pdbx_refine_id", DelegatingStrColumn::new);
    }

    /**
     * The nature of the absolute structure and how it was determined.
     * For example, this may describe the Friedel pairs used.
     * @return StrColumn
     */
    public StrColumn getLsAbsStructureDetails() {
        return delegate.getColumn("ls_abs_structure_details", DelegatingStrColumn::new);
    }

    /**
     * The measure of absolute structure (enantiomorph or polarity) as
     * defined by Flack (1983).
     * 
     * For centrosymmetric structures, the only permitted value, if the
     * data name is present, is 'inapplicable', represented by '.' .
     * 
     * For noncentrosymmetric structures the value must lie in the
     * 99.97% Gaussian confidence interval  -3u =&lt; x =&lt; 1 + 3u and a
     * standard uncertainty (estimated standard deviation) u must
     * be supplied. The item range of [0.0:1.0] is correctly
     * interpreted as meaning (0.0 - 3u) =&lt; x =&lt; (1.0 + 3u).
     * 
     * Ref: Flack, H. D. (1983). Acta Cryst. A39, 876-881.
     * @return FloatColumn
     */
    public FloatColumn getLsAbsStructureFlack() {
        return delegate.getColumn("ls_abs_structure_Flack", DelegatingFloatColumn::new);
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _refine.ls_abs_structure_Flack.
     * @return FloatColumn
     */
    public FloatColumn getLsAbsStructureFlackEsd() {
        return delegate.getColumn("ls_abs_structure_Flack_esd", DelegatingFloatColumn::new);
    }

    /**
     * The measure of absolute structure (enantiomorph or polarity) as
     * defined by Rogers.
     * 
     * 
     * The value must lie in the 99.97% Gaussian confidence interval
     * -1 -3u =&lt; \h =&lt; 1 + 3u and a standard uncertainty (estimated
     * standard deviation) u must be supplied. The item range of
     * [-1.0, 1.0] is correctly interpreted as meaning
     * (-1.0 - 3u) =&lt; \h =&lt; (1.0 + 3u).
     * 
     * Ref: Rogers, D. (1981). Acta Cryst. A37, 734-741.
     * @return FloatColumn
     */
    public FloatColumn getLsAbsStructureRogers() {
        return delegate.getColumn("ls_abs_structure_Rogers", DelegatingFloatColumn::new);
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _refine.ls_abs_structure_Rogers.
     * @return FloatColumn
     */
    public FloatColumn getLsAbsStructureRogersEsd() {
        return delegate.getColumn("ls_abs_structure_Rogers_esd", DelegatingFloatColumn::new);
    }

    /**
     * The smallest value for the interplanar spacings for the
     * reflection data used in the refinement in angstroms. This is
     * called the highest resolution.
     * @return FloatColumn
     */
    public FloatColumn getLsDResHigh() {
        return delegate.getColumn("ls_d_res_high", DelegatingFloatColumn::new);
    }

    /**
     * The largest value for the interplanar spacings for
     * the reflection data used in the refinement in angstroms.
     * This is called the lowest resolution.
     * @return FloatColumn
     */
    public FloatColumn getLsDResLow() {
        return delegate.getColumn("ls_d_res_low", DelegatingFloatColumn::new);
    }

    /**
     * The extinction coefficient used to calculate the correction
     * factor applied to the structure-factor data. The nature of the
     * extinction coefficient is given in the definitions of
     * _refine.ls_extinction_expression and
     * _refine.ls_extinction_method.
     * 
     * For the 'Zachariasen' method it is the r* value; for the
     * 'Becker-Coppens type 1 isotropic' method it is the 'g' value,
     * and for 'Becker-Coppens type 2 isotropic' corrections it is
     * the 'rho' value. Note that the magnitude of these values is
     * usually of the order of 10000.
     * 
     * Ref:  Becker, P. J. &amp; Coppens, P. (1974). Acta Cryst. A30,
     * 129-47, 148-153.
     * Zachariasen, W. H. (1967). Acta Cryst. 23, 558-564.
     * Larson, A. C. (1967). Acta Cryst. 23, 664-665.
     * @return FloatColumn
     */
    public FloatColumn getLsExtinctionCoef() {
        return delegate.getColumn("ls_extinction_coef", DelegatingFloatColumn::new);
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _refine.ls_extinction_coef.
     * @return FloatColumn
     */
    public FloatColumn getLsExtinctionCoefEsd() {
        return delegate.getColumn("ls_extinction_coef_esd", DelegatingFloatColumn::new);
    }

    /**
     * A description of or reference to the extinction-correction
     * equation used to apply the data item
     * _refine.ls_extinction_coef. This information must be sufficient
     * to reproduce the extinction-correction factors applied to the
     * structure factors.
     * @return StrColumn
     */
    public StrColumn getLsExtinctionExpression() {
        return delegate.getColumn("ls_extinction_expression", DelegatingStrColumn::new);
    }

    /**
     * A description of the extinction-correction method applied.
     * This description should
     * include information about the correction method, either
     * 'Becker-Coppens' or 'Zachariasen'.  The latter is sometimes
     * referred to as the 'Larson' method even though it employs
     * Zachariasen's formula.
     * 
     * The Becker-Coppens procedure is referred to as 'type 1' when
     * correcting secondary extinction dominated by the mosaic spread;
     * as 'type 2' when secondary extinction is dominated by particle
     * size and includes a primary extinction component; and as 'mixed'
     * when there is a mixture of types 1 and 2.
     * 
     * For the Becker-Coppens method, it is also necessary to set the
     * mosaic distribution as either 'Gaussian' or 'Lorentzian' and the
     * nature of the extinction as 'isotropic' or 'anisotropic'. Note
     * that if either the 'mixed' or 'anisotropic' corrections are
     * applied, the multiple coefficients cannot be contained in
     * *_extinction_coef and must be listed in _refine.details.
     * 
     * Ref: Becker, P. J. &amp; Coppens, P. (1974). Acta Cryst. A30,
     * 129-147, 148-153.
     * Zachariasen, W. H. (1967). Acta Cryst. 23, 558- 564.
     * Larson, A. C. (1967). Acta Cryst. 23, 664-665.
     * @return StrColumn
     */
    public StrColumn getLsExtinctionMethod() {
        return delegate.getColumn("ls_extinction_method", DelegatingStrColumn::new);
    }

    /**
     * The least-squares goodness-of-fit parameter S for all data
     * after the final cycle of refinement. Ideally, account should be
     * taken of parameters restrained in the least-squares refinement.
     * See also the definition of _refine.ls_restrained_S_all.
     * 
     * ( sum|w |Y~obs~ - Y~calc~|^2^| )^1/2^
     * S = ( ---------------------------- )
     * (       N~ref~ - N~param~      )
     * 
     * Y~obs~   = the observed coefficients
     * (see _refine.ls_structure_factor_coef)
     * Y~calc~  = the calculated coefficients
     * (see _refine.ls_structure_factor_coef)
     * w        = the least-squares reflection weight
     * [1/(e.s.d. squared)]
     * 
     * N~ref~   = the number of reflections used in the refinement
     * N~param~ = the number of refined parameters
     * 
     * sum is taken over the specified reflections
     * @return FloatColumn
     */
    public FloatColumn getLsGoodnessOfFitAll() {
        return delegate.getColumn("ls_goodness_of_fit_all", DelegatingFloatColumn::new);
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _refine.ls_goodness_of_fit_all.
     * @return FloatColumn
     */
    public FloatColumn getLsGoodnessOfFitAllEsd() {
        return delegate.getColumn("ls_goodness_of_fit_all_esd", DelegatingFloatColumn::new);
    }

    /**
     * The least-squares goodness-of-fit parameter S for reflection data
     * classified as 'observed' (see _reflns.observed_criterion) after
     * the final cycle of refinement. Ideally, account should be taken
     * of parameters restrained in the least-squares refinement.
     * See also the definition of _refine.ls_restrained_S_obs.
     * 
     * ( sum|w |Y~obs~ - Y~calc~|^2^| )^1/2^
     * S = ( ---------------------------- )
     * (       N~ref~ - N~param~      )
     * 
     * Y~obs~   = the observed coefficients
     * (see _refine.ls_structure_factor_coef)
     * Y~calc~  = the calculated coefficients
     * (see _refine.ls_structure_factor_coef)
     * w        = the least-squares reflection weight
     * [1/(e.s.d. squared)]
     * 
     * N~ref~   = the number of reflections used in the refinement
     * N~param~ = the number of refined parameters
     * 
     * sum is taken over the specified reflections
     * @return FloatColumn
     */
    public FloatColumn getLsGoodnessOfFitObs() {
        return delegate.getColumn("ls_goodness_of_fit_obs", DelegatingFloatColumn::new);
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _refine.ls_goodness_of_fit_obs.
     * @return FloatColumn
     */
    public FloatColumn getLsGoodnessOfFitObsEsd() {
        return delegate.getColumn("ls_goodness_of_fit_obs_esd", DelegatingFloatColumn::new);
    }

    /**
     * Treatment of hydrogen atoms in the least-squares refinement.
     * @return StrColumn
     */
    public StrColumn getLsHydrogenTreatment() {
        return delegate.getColumn("ls_hydrogen_treatment", DelegatingStrColumn::new);
    }

    /**
     * Type of matrix used to accumulate the least-squares derivatives.
     * @return StrColumn
     */
    public StrColumn getLsMatrixType() {
        return delegate.getColumn("ls_matrix_type", DelegatingStrColumn::new);
    }

    /**
     * The number of constrained (non-refined or dependent) parameters
     * in the least-squares process. These may be due to symmetry or any
     * other constraint process (e.g. rigid-body refinement). See also
     * _atom_site.constraints and _atom_site.refinement_flags. A general
     * description of constraints may appear in _refine.details.
     * @return IntColumn
     */
    public IntColumn getLsNumberConstraints() {
        return delegate.getColumn("ls_number_constraints", DelegatingIntColumn::new);
    }

    /**
     * The number of parameters refined in the least-squares process.
     * If possible, this number should include some contribution from
     * the restrained parameters. The restrained parameters are
     * distinct from the constrained parameters (where one or more
     * parameters are linearly dependent on the refined value of
     * another). Least-squares restraints often depend on geometry or
     * energy considerations and this makes their direct contribution
     * to this number, and to the goodness-of-fit calculation,
     * difficult to assess.
     * @return IntColumn
     */
    public IntColumn getLsNumberParameters() {
        return delegate.getColumn("ls_number_parameters", DelegatingIntColumn::new);
    }

    /**
     * The number of reflections that satisfy the resolution limits
     * established by _refine.ls_d_res_high and _refine.ls_d_res_low.
     * @return IntColumn
     */
    public IntColumn getLsNumberReflnsAll() {
        return delegate.getColumn("ls_number_reflns_all", DelegatingIntColumn::new);
    }

    /**
     * The number of reflections that satisfy the resolution limits
     * established by _refine.ls_d_res_high and _refine.ls_d_res_low
     * and the observation limit established by
     * _reflns.observed_criterion.
     * @return IntColumn
     */
    public IntColumn getLsNumberReflnsObs() {
        return delegate.getColumn("ls_number_reflns_obs", DelegatingIntColumn::new);
    }

    /**
     * The number of reflections that satisfy the resolution limits
     * established by _refine.ls_d_res_high and _refine.ls_d_res_low
     * and the observation limit established by
     * _reflns.observed_criterion, and that were used as the test
     * reflections (i.e. were excluded from the refinement) when the
     * refinement included the calculation of a 'free' R factor.
     * Details of how reflections were assigned to the working and
     * test sets are given in _reflns.R_free_details.
     * @return IntColumn
     */
    public IntColumn getLsNumberReflnsRFree() {
        return delegate.getColumn("ls_number_reflns_R_free", DelegatingIntColumn::new);
    }

    /**
     * The number of reflections that satisfy the resolution limits
     * established by _refine.ls_d_res_high and _refine.ls_d_res_low
     * and the observation limit established by
     * _reflns.observed_criterion, and that were used as the working
     * reflections (i.e. were included in the refinement) when the
     * refinement included the calculation of a 'free' R factor.
     * Details of how reflections were assigned to the working and
     * test sets are given in _reflns.R_free_details.
     * @return IntColumn
     */
    public IntColumn getLsNumberReflnsRWork() {
        return delegate.getColumn("ls_number_reflns_R_work", DelegatingIntColumn::new);
    }

    /**
     * The number of restrained parameters. These are parameters which
     * are not directly dependent on another refined parameter.
     * Restrained parameters often involve geometry or energy
     * dependencies.
     * See also _atom_site.constraints and _atom_site.refinement_flags.
     * A general description of refinement constraints may appear in
     * _refine.details.
     * @return IntColumn
     */
    public IntColumn getLsNumberRestraints() {
        return delegate.getColumn("ls_number_restraints", DelegatingIntColumn::new);
    }

    /**
     * The number of reflections that satisfy the resolution limits
     * established by _refine.ls_d_res_high and _refine.ls_d_res_low
     * and the observation limit established by
     * _reflns.observed_criterion, expressed as a percentage of the
     * number of geometrically observable reflections that satisfy
     * the resolution limits.
     * @return FloatColumn
     */
    public FloatColumn getLsPercentReflnsObs() {
        return delegate.getColumn("ls_percent_reflns_obs", DelegatingFloatColumn::new);
    }

    /**
     * The number of reflections that satisfy the resolution limits
     * established by _refine.ls_d_res_high and _refine.ls_d_res_low
     * and the observation limit established by
     * _reflns.observed_criterion, and that were used as the test
     * reflections (i.e. were excluded from the refinement) when the
     * refinement included the calculation of a 'free' R factor,
     * expressed as a percentage of the number of geometrically
     * observable reflections that satisfy the resolution limits.
     * @return FloatColumn
     */
    public FloatColumn getLsPercentReflnsRFree() {
        return delegate.getColumn("ls_percent_reflns_R_free", DelegatingFloatColumn::new);
    }

    /**
     * Residual factor R for all reflections that satisfy the resolution
     * limits established by _refine.ls_d_res_high and
     * _refine.ls_d_res_low.
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
    public FloatColumn getLsRFactorAll() {
        return delegate.getColumn("ls_R_factor_all", DelegatingFloatColumn::new);
    }

    /**
     * Residual factor R for reflections that satisfy the resolution
     * limits established by _refine.ls_d_res_high and
     * _refine.ls_d_res_low and the observation limit established by
     * _reflns.observed_criterion.
     * 
     * _refine.ls_R_factor_obs should not be confused with
     * _refine.ls_R_factor_R_work; the former reports the results of a
     * refinement in which all observed reflections were used, the
     * latter a refinement in which a subset of the observed
     * reflections were excluded from refinement for the calculation
     * of a 'free' R factor. However, it would be meaningful to quote
     * both values if a 'free' R factor were calculated for most of
     * the refinement, but all of the observed reflections were used
     * in the final rounds of refinement; such a protocol should be
     * explained in _refine.details.
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
    public FloatColumn getLsRFactorObs() {
        return delegate.getColumn("ls_R_factor_obs", DelegatingFloatColumn::new);
    }

    /**
     * Residual factor R for reflections that satisfy the resolution
     * limits established by _refine.ls_d_res_high and
     * _refine.ls_d_res_low and the observation limit established by
     * _reflns.observed_criterion, and that were used as the test
     * reflections (i.e. were excluded from the refinement) when the
     * refinement included the calculation of a 'free' R factor.
     * Details of how reflections were assigned to the working and
     * test sets are given in _reflns.R_free_details.
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
    public FloatColumn getLsRFactorRFree() {
        return delegate.getColumn("ls_R_factor_R_free", DelegatingFloatColumn::new);
    }

    /**
     * The estimated error in _refine.ls_R_factor_R_free.
     * The method used to estimate the error is described in the
     * item _refine.ls_R_factor_R_free_error_details.
     * @return FloatColumn
     */
    public FloatColumn getLsRFactorRFreeError() {
        return delegate.getColumn("ls_R_factor_R_free_error", DelegatingFloatColumn::new);
    }

    /**
     * Special aspects of the method used to estimated the error in
     * _refine.ls_R_factor_R_free.
     * @return StrColumn
     */
    public StrColumn getLsRFactorRFreeErrorDetails() {
        return delegate.getColumn("ls_R_factor_R_free_error_details", DelegatingStrColumn::new);
    }

    /**
     * Residual factor R for reflections that satisfy the resolution
     * limits established by _refine.ls_d_res_high and
     * _refine.ls_d_res_low and the observation limit established by
     * _reflns.observed_criterion, and that were used as the working
     * reflections (i.e. were included in the refinement)  when the
     * refinement included the calculation of a 'free' R factor.
     * Details of how reflections were assigned to the working and
     * test sets are given in _reflns.R_free_details.
     * 
     * _refine.ls_R_factor_obs should not be confused with
     * _refine.ls_R_factor_R_work; the former reports the results of a
     * refinement in which all observed reflections were used, the
     * latter a refinement in which a subset of the observed
     * reflections were excluded from refinement for the calculation
     * of a 'free' R factor. However, it would be meaningful to quote
     * both values if a 'free' R factor were calculated for most of
     * the refinement, but all of the observed reflections were used
     * in the final rounds of refinement; such a protocol should be
     * explained in _refine.details.
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
    public FloatColumn getLsRFactorRWork() {
        return delegate.getColumn("ls_R_factor_R_work", DelegatingFloatColumn::new);
    }

    /**
     * Residual factor R(Fsqd) for reflections that satisfy the
     * resolution limits established by _refine.ls_d_res_high and
     * _refine.ls_d_res_low and the observation limit established by
     * _reflns.observed_criterion, calculated on the squares of the
     * observed and calculated structure-factor amplitudes.
     * 
     * sum|F~obs~^2^ - F~calc~^2^|
     * R(Fsqd) = ---------------------------
     * sum|F~obs~^2^|
     * 
     * F~obs~^2^  = squares of the observed structure-factor amplitudes
     * F~calc~^2^ = squares of the calculated structure-factor
     * amplitudes
     * 
     * sum is taken over the specified reflections
     * @return FloatColumn
     */
    public FloatColumn getLsRFsqdFactorObs() {
        return delegate.getColumn("ls_R_Fsqd_factor_obs", DelegatingFloatColumn::new);
    }

    /**
     * Residual factor R(I) for reflections that satisfy the
     * resolution limits established by _refine.ls_d_res_high and
     * _refine.ls_d_res_low and the observation limit established by
     * _reflns.observed_criterion, calculated on the estimated
     * reflection intensities.
     * 
     * This is most often calculated in Rietveld refinements against
     * powder data, where it is referred to as R~B~ or R~Bragg~.
     * 
     * sum|I~obs~ - I~calc~|
     * R(I) = ---------------------
     * sum|I~obs~|
     * 
     * I~obs~  = the net observed intensities
     * I~calc~ = the net calculated intensities
     * 
     * sum is taken over the specified reflections
     * @return FloatColumn
     */
    public FloatColumn getLsRIFactorObs() {
        return delegate.getColumn("ls_R_I_factor_obs", DelegatingFloatColumn::new);
    }

    /**
     * The ratio of the total number of observations of the
     * reflections that satisfy the resolution limits established by
     * _refine.ls_d_res_high and _refine.ls_d_res_low to the number
     * of crystallographically unique reflections that satisfy the
     * same limits.
     * @return FloatColumn
     */
    public FloatColumn getLsRedundancyReflnsAll() {
        return delegate.getColumn("ls_redundancy_reflns_all", DelegatingFloatColumn::new);
    }

    /**
     * The ratio of the total number of observations of the
     * reflections that satisfy the resolution limits established by
     * _refine.ls_d_res_high and _refine.ls_d_res_low and the
     * observation limit established by _reflns.observed_criterion to
     * the number of crystallographically unique reflections that
     * satisfy the same limits.
     * @return FloatColumn
     */
    public FloatColumn getLsRedundancyReflnsObs() {
        return delegate.getColumn("ls_redundancy_reflns_obs", DelegatingFloatColumn::new);
    }

    /**
     * The least-squares goodness-of-fit parameter S' for all
     * reflections after the final cycle of least-squares refinement.
     * This parameter explicitly includes the restraints applied
     * in the least-squares process. See also the definition of
     * _refine.ls_goodness_of_fit_all.
     * 
     * (   sum   |w    |Y~obs~  - Y~calc~|^2^| )^1/2^
     * ( + sum~r~|w~r~ |P~calc~ - P~targ~|^2^| )
     * S' = ( ------------------------------------- )
     * (      N~ref~ + N~restr~ - N~param~     )
     * 
     * Y~obs~   = the observed coefficients
     * (see _refine.ls_structure_factor_coef)
     * Y~calc~  = the calculated coefficients
     * (see _refine.ls_structure_factor_coef)
     * w        = the least-squares reflection weight
     * [1/(e.s.d. squared)]
     * 
     * P~calc~  = the calculated restraint values
     * P~targ~  = the target restraint values
     * w~r~     = the restraint weight
     * 
     * N~ref~   = the number of reflections used in the refinement
     * (see _refine.ls_number_reflns_obs)
     * N~restr~ = the number of restraints
     * (see _refine.ls_number_restraints)
     * N~param~ = the number of refined parameters
     * (see _refine.ls_number_parameters)
     * 
     * sum  is taken over the specified reflections
     * sumr is taken over the restraints
     * @return FloatColumn
     */
    public FloatColumn getLsRestrainedSAll() {
        return delegate.getColumn("ls_restrained_S_all", DelegatingFloatColumn::new);
    }

    /**
     * The least-squares goodness-of-fit parameter S' for reflection
     * data classified as observed (see _reflns.observed_criterion)
     * after the final cycle of least-squares refinement. This
     * parameter explicitly includes the restraints applied in
     * the least-squares process. See also the definition of
     * _refine.ls_goodness_of_fit_obs.
     * 
     * (   sum   |w    |Y~obs~  - Y~calc~|^2^| )^1/2^
     * ( + sum~r~|w~r~ |P~calc~ - P~targ~|^2^| )
     * S' = ( ------------------------------------- )
     * (      N~ref~ + N~restr~ - N~param~     )
     * 
     * Y~obs~   = the observed coefficients
     * (see _refine.ls_structure_factor_coef)
     * Y~calc~  = the calculated coefficients
     * (see _refine.ls_structure_factor_coef)
     * w        = the least-squares reflection weight
     * [1/(e.s.d. squared)]
     * 
     * P~calc~  = the calculated restraint values
     * P~targ~  = the target restraint values
     * w~r~     = the restraint weight
     * 
     * N~ref~   = the number of reflections used in the refinement
     * (see _refine.ls_number_reflns_obs)
     * N~restr~ = the number of restraints
     * (see _refine.ls_number_restraints)
     * N~param~ = the number of refined parameters
     * (see _refine.ls_number_parameters)
     * 
     * sum  is taken over the specified reflections
     * sumr is taken over the restraints
     * @return FloatColumn
     */
    public FloatColumn getLsRestrainedSObs() {
        return delegate.getColumn("ls_restrained_S_obs", DelegatingFloatColumn::new);
    }

    /**
     * The largest ratio of the final least-squares parameter shift
     * to the final standard uncertainty (estimated standard
     * deviation).
     * @return FloatColumn
     */
    public FloatColumn getLsShiftOverEsdMax() {
        return delegate.getColumn("ls_shift_over_esd_max", DelegatingFloatColumn::new);
    }

    /**
     * The average ratio of the final least-squares parameter shift
     * to the final standard uncertainty (estimated standard
     * deviation).
     * @return FloatColumn
     */
    public FloatColumn getLsShiftOverEsdMean() {
        return delegate.getColumn("ls_shift_over_esd_mean", DelegatingFloatColumn::new);
    }

    /**
     * Structure-factor coefficient |F|, F^2^ or I used in the least-
     * squares refinement process.
     * @return StrColumn
     */
    public StrColumn getLsStructureFactorCoef() {
        return delegate.getColumn("ls_structure_factor_coef", DelegatingStrColumn::new);
    }

    /**
     * A description of special aspects of the weighting scheme used
     * in least-squares refinement. Used to describe the weighting
     * when the value of _refine.ls_weighting_scheme is specified
     * as 'calc'.
     * @return StrColumn
     */
    public StrColumn getLsWeightingDetails() {
        return delegate.getColumn("ls_weighting_details", DelegatingStrColumn::new);
    }

    /**
     * The weighting scheme applied in the least-squares process. The
     * standard code may be followed by a description of the weight
     * (but see _refine.ls_weighting_details for a preferred approach).
     * @return StrColumn
     */
    public StrColumn getLsWeightingScheme() {
        return delegate.getColumn("ls_weighting_scheme", DelegatingStrColumn::new);
    }

    /**
     * Weighted residual factor wR for all reflections that satisfy the
     * resolution limits established by _refine.ls_d_res_high and
     * _refine.ls_d_res_low.
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
    public FloatColumn getLsWRFactorAll() {
        return delegate.getColumn("ls_wR_factor_all", DelegatingFloatColumn::new);
    }

    /**
     * Weighted residual factor wR for reflections that satisfy the
     * resolution limits established by _refine.ls_d_res_high and
     * _refine.ls_d_res_low and the observation limit established by
     * _reflns.observed_criterion.
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
    public FloatColumn getLsWRFactorObs() {
        return delegate.getColumn("ls_wR_factor_obs", DelegatingFloatColumn::new);
    }

    /**
     * Weighted residual factor wR for reflections that satisfy the
     * resolution limits established by _refine.ls_d_res_high and
     * _refine.ls_d_res_low and the observation limit established by
     * _reflns.observed_criterion, and that were used as the test
     * reflections (i.e. were excluded from the refinement) when the
     * refinement included the calculation of a 'free' R factor.
     * Details of how reflections were assigned to the working and
     * test sets are given in _reflns.R_free_details.
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
    public FloatColumn getLsWRFactorRFree() {
        return delegate.getColumn("ls_wR_factor_R_free", DelegatingFloatColumn::new);
    }

    /**
     * Weighted residual factor wR for reflections that satisfy the
     * resolution limits established by _refine.ls_d_res_high and
     * _refine.ls_d_res_low and the observation limit established by
     * _reflns.observed_criterion, and that were used as the working
     * reflections (i.e. were included in the refinement) when the
     * refinement included the calculation of a 'free' R factor.
     * Details of how reflections were assigned to the working and
     * test sets are given in _reflns.R_free_details.
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
    public FloatColumn getLsWRFactorRWork() {
        return delegate.getColumn("ls_wR_factor_R_work", DelegatingFloatColumn::new);
    }

    /**
     * The maximum value for occupancy found in the coordinate set.
     * @return FloatColumn
     */
    public FloatColumn getOccupancyMax() {
        return delegate.getColumn("occupancy_max", DelegatingFloatColumn::new);
    }

    /**
     * The minimum value for occupancy found in the coordinate set.
     * @return FloatColumn
     */
    public FloatColumn getOccupancyMin() {
        return delegate.getColumn("occupancy_min", DelegatingFloatColumn::new);
    }

    /**
     * Special aspects of the solvent model used during refinement.
     * @return StrColumn
     */
    public StrColumn getSolventModelDetails() {
        return delegate.getColumn("solvent_model_details", DelegatingStrColumn::new);
    }

    /**
     * The value of the BSOL solvent-model parameter describing
     * the average isotropic displacement parameter of disordered
     * solvent atoms.
     * 
     * This is one of the two parameters (the other is
     * _refine.solvent_model_param_ksol) in Tronrud's method of
     * modelling the contribution of bulk solvent to the
     * scattering. The standard scale factor is modified according
     * to the expression
     * 
     * k0 exp(-B0 * s^2^)[1-KSOL * exp(-BSOL * s^2^)]
     * 
     * where k0 and B0 are the scale factors for the protein.
     * 
     * Ref: Tronrud, D. E. (1997). Methods Enzymol. 277, 243-268.
     * @return FloatColumn
     */
    public FloatColumn getSolventModelParamBsol() {
        return delegate.getColumn("solvent_model_param_bsol", DelegatingFloatColumn::new);
    }

    /**
     * The value of the KSOL solvent-model parameter describing
     * the ratio of the electron density in the bulk solvent to the
     * electron density in the molecular solute.
     * 
     * This is one of the two parameters (the other is
     * _refine.solvent_model_param_bsol) in Tronrud's method of
     * modelling the contribution of bulk solvent to the
     * scattering. The standard scale factor is modified according
     * to the expression
     * 
     * k0 exp(-B0 * s^2^)[1-KSOL * exp(-BSOL * s^2^)]
     * 
     * where k0 and B0 are the scale factors for the protein.
     * 
     * Ref: Tronrud, D. E. (1997). Methods Enzymol. 277, 243-268.
     * @return FloatColumn
     */
    public FloatColumn getSolventModelParamKsol() {
        return delegate.getColumn("solvent_model_param_ksol", DelegatingFloatColumn::new);
    }

    /**
     * The crystallographic reliability index Rcomplete for
     * reflections that satisfy the resolution limits
     * established by _refine.ls_d_res_high and
     * _refine.ls_d_res_low and the observation limit
     * established by _reflns.observed_criterion
     * 
     * Ref: Luebben, J., Gruene, T., (2015). Proc.Nat.Acad.Sci. 112(29) 8999-9003
     * @return FloatColumn
     */
    public FloatColumn getPdbxRComplete() {
        return delegate.getColumn("pdbx_R_complete", DelegatingFloatColumn::new);
    }

    /**
     * Residual factor for the reflections (with number given by
     * _reflns.number_gt) judged significantly intense (i.e. satisfying
     * the threshold specified by _reflns.threshold_expression)
     * and included in the refinement. The reflections also satisfy
     * the resolution limits established by _refine.ls_d_res_high and
     * _refine.ls_d_res_low. This is the conventional R
     * factor. See also _refine.ls_wR_factor_ definitions.
     * 
     * sum | F(obs) - F(calc) |
     * R = ------------------------
     * sum | F(obs) |
     * 
     * F(obs)  = the observed structure-factor amplitudes
     * F(calc) = the calculated structure-factor amplitudes
     * 
     * and the sum is taken over the specified reflections
     * @return FloatColumn
     */
    public FloatColumn getLsRFactorGt() {
        return delegate.getColumn("ls_R_factor_gt", DelegatingFloatColumn::new);
    }

    /**
     * The least-squares goodness-of-fit parameter S for
     * significantly intense reflections (see
     * _reflns.threshold_expression) after the final cycle of
     * refinement. Ideally, account should be taken of parameters
     * restrained in the least-squares refinement. See also
     * _refine.ls_restrained_S_ definitions.
     * 
     * {  sum { w [ Y(obs) - Y(calc) ]^2^ }  }^1/2^
     * S = { ----------------------------------- }
     * {            Nref - Nparam            }
     * 
     * Y(obs)  = the observed coefficients
     * (see _refine_ls_structure_factor_coef)
     * Y(calc) = the calculated coefficients
     * (see _refine_ls_structure_factor_coef)
     * w       = the least-squares reflection weight
     * [1/(u^2^)]
     * u       = standard uncertainty
     * 
     * Nref   = the number of reflections used in the refinement
     * Nparam = the number of refined parameters
     * 
     * and the sum is taken over the specified reflections
     * @return FloatColumn
     */
    public FloatColumn getLsGoodnessOfFitGt() {
        return delegate.getColumn("ls_goodness_of_fit_gt", DelegatingFloatColumn::new);
    }

    /**
     * The least-squares goodness-of-fit parameter S for all
     * reflections included in the refinement after the final cycle
     * of refinement. Ideally, account should be taken of parameters
     * restrained in the least-squares refinement. See also
     * _refine_ls_restrained_S_ definitions.
     * 
     * {  sum | w | Y(obs) - Y(calc) |^2^ |  }^1/2^
     * S = { ----------------------------------- }
     * {            Nref - Nparam            }
     * 
     * Y(obs)  = the observed coefficients
     * (see _refine_ls_structure_factor_coef)
     * Y(calc) = the calculated coefficients
     * (see _refine_ls_structure_factor_coef)
     * w       = the least-squares reflection weight
     * [1/(u^2^)]
     * u       = standard uncertainty
     * 
     * Nref   = the number of reflections used in the refinement
     * Nparam = the number of refined parameters
     * 
     * and the sum is taken over the specified reflections
     * @return FloatColumn
     */
    public FloatColumn getLsGoodnessOfFitRef() {
        return delegate.getColumn("ls_goodness_of_fit_ref", DelegatingFloatColumn::new);
    }

    /**
     * The largest ratio of the final least-squares parameter
     * shift to the final standard uncertainty.
     * @return FloatColumn
     */
    public FloatColumn getLsShiftOverSuMax() {
        return delegate.getColumn("ls_shift_over_su_max", DelegatingFloatColumn::new);
    }

    /**
     * An upper limit for the largest ratio of the final
     * least-squares parameter shift to the final
     * standard uncertainty.  This item is used when the largest
     * value of the shift divided by the final standard uncertainty
     * is too small to measure.
     * @return FloatColumn
     */
    public FloatColumn getLsShiftOverSuMaxLt() {
        return delegate.getColumn("ls_shift_over_su_max_lt", DelegatingFloatColumn::new);
    }

    /**
     * The average ratio of the final least-squares parameter
     * shift to the final standard uncertainty.
     * @return FloatColumn
     */
    public FloatColumn getLsShiftOverSuMean() {
        return delegate.getColumn("ls_shift_over_su_mean", DelegatingFloatColumn::new);
    }

    /**
     * An upper limit for the average ratio of the final
     * least-squares parameter shift to the
     * final standard uncertainty.  This
     * item is used when the average value of the shift divided by
     * the final standard uncertainty is too small to measure.
     * @return FloatColumn
     */
    public FloatColumn getLsShiftOverSuMeanLt() {
        return delegate.getColumn("ls_shift_over_su_mean_lt", DelegatingFloatColumn::new);
    }

    /**
     * Data cutoff (SIGMA(I))
     * @return FloatColumn
     */
    public FloatColumn getPdbxLsSigmaI() {
        return delegate.getColumn("pdbx_ls_sigma_I", DelegatingFloatColumn::new);
    }

    /**
     * Data cutoff (SIGMA(F))
     * @return FloatColumn
     */
    public FloatColumn getPdbxLsSigmaF() {
        return delegate.getColumn("pdbx_ls_sigma_F", DelegatingFloatColumn::new);
    }

    /**
     * Data cutoff (SIGMA(F^2))
     * @return FloatColumn
     */
    public FloatColumn getPdbxLsSigmaFsqd() {
        return delegate.getColumn("pdbx_ls_sigma_Fsqd", DelegatingFloatColumn::new);
    }

    /**
     * Value of F at "high end" of data cutoff.
     * @return FloatColumn
     */
    public FloatColumn getPdbxDataCutoffHighAbsF() {
        return delegate.getColumn("pdbx_data_cutoff_high_absF", DelegatingFloatColumn::new);
    }

    /**
     * Value of RMS |F| used as high data cutoff.
     * @return FloatColumn
     */
    public FloatColumn getPdbxDataCutoffHighRmsAbsF() {
        return delegate.getColumn("pdbx_data_cutoff_high_rms_absF", DelegatingFloatColumn::new);
    }

    /**
     * Value of F at "low end" of data cutoff.
     * @return FloatColumn
     */
    public FloatColumn getPdbxDataCutoffLowAbsF() {
        return delegate.getColumn("pdbx_data_cutoff_low_absF", DelegatingFloatColumn::new);
    }

    /**
     * Whether the structure was refined with indvidual
     * isotropic, anisotropic or overall temperature factor.
     * @return StrColumn
     */
    public StrColumn getPdbxIsotropicThermalModel() {
        return delegate.getColumn("pdbx_isotropic_thermal_model", DelegatingStrColumn::new);
    }

    /**
     * Whether the cross validataion method was used through
     * out or only at the end.
     * @return StrColumn
     */
    public StrColumn getPdbxLsCrossValidMethod() {
        return delegate.getColumn("pdbx_ls_cross_valid_method", DelegatingStrColumn::new);
    }

    /**
     * Method(s) used to determine the structure.
     * @return StrColumn
     */
    public StrColumn getPdbxMethodToDetermineStruct() {
        return delegate.getColumn("pdbx_method_to_determine_struct", DelegatingStrColumn::new);
    }

    /**
     * Starting model for refinement.  Starting model for
     * molecular replacement should refer to a previous
     * structure or experiment.
     * @return StrColumn
     */
    public StrColumn getPdbxStartingModel() {
        return delegate.getColumn("pdbx_starting_model", DelegatingStrColumn::new);
    }

    /**
     * Stereochemistry target values used in refinement.
     * @return StrColumn
     */
    public StrColumn getPdbxStereochemistryTargetValues() {
        return delegate.getColumn("pdbx_stereochemistry_target_values", DelegatingStrColumn::new);
    }

    /**
     * Details of the manner in which the cross validation
     * reflections were selected.
     * @return StrColumn
     */
    public StrColumn getPdbxRFreeSelectionDetails() {
        return delegate.getColumn("pdbx_R_Free_selection_details", DelegatingStrColumn::new);
    }

    /**
     * Special case of stereochemistry target values used
     * in SHELXL refinement.
     * @return StrColumn
     */
    public StrColumn getPdbxStereochemTargetValSpecCase() {
        return delegate.getColumn("pdbx_stereochem_target_val_spec_case", DelegatingStrColumn::new);
    }

    /**
     * Overall estimated standard uncertainties of positional
     * parameters based on R value.
     * @return FloatColumn
     */
    public FloatColumn getPdbxOverallESUR() {
        return delegate.getColumn("pdbx_overall_ESU_R", DelegatingFloatColumn::new);
    }

    /**
     * Overall estimated standard uncertainties of positional parameters based on R free value.
     * @return FloatColumn
     */
    public FloatColumn getPdbxOverallESURFree() {
        return delegate.getColumn("pdbx_overall_ESU_R_Free", DelegatingFloatColumn::new);
    }

    /**
     * For bulk solvent mask calculation, the value by which the vdw radii of non-ion atoms (like carbon) are increased and used.
     * @return FloatColumn
     */
    public FloatColumn getPdbxSolventVdwProbeRadii() {
        return delegate.getColumn("pdbx_solvent_vdw_probe_radii", DelegatingFloatColumn::new);
    }

    /**
     * For bulk solvent mask calculation, the amount that the ionic radii of atoms, which can be ions, are increased used.
     * @return FloatColumn
     */
    public FloatColumn getPdbxSolventIonProbeRadii() {
        return delegate.getColumn("pdbx_solvent_ion_probe_radii", DelegatingFloatColumn::new);
    }

    /**
     * For bulk solvent mask calculation, amount mask is shrunk after taking away atoms with new radii and a constant value assigned to this new region.
     * @return FloatColumn
     */
    public FloatColumn getPdbxSolventShrinkageRadii() {
        return delegate.getColumn("pdbx_solvent_shrinkage_radii", DelegatingFloatColumn::new);
    }

    /**
     * Real space R factor of electron density for all atoms.
     * 
     * The real space R factor is calculated by the equation
     * 
     * R_real = [Sum~i (|Dobs - Dcal|)]/[Sum~i (|Dobs + Dcal|)]
     * 
     * Where:
     * Dobs is the observed  electron density,
     * Dcal is the calculated  electron density,
     * summation is for all the grid points
     * 
     * Ref: Branden, C.I. &amp; Jones, T.A. (1990).  Nature, 343, 687-689
     * @return FloatColumn
     */
    public FloatColumn getPdbxRealSpaceR() {
        return delegate.getColumn("pdbx_real_space_R", DelegatingFloatColumn::new);
    }

    /**
     * The density correlation coefficient is calculated from atomic
     * densities of (2Fobs-Fcalc) map - "Robs" and the model
     * map (Fcalc) - "Rcalc" :
     * 
     * D_corr =  &lt;Robs&gt;&lt;Rcalc&gt;/sqrt(&lt;Robs**2&gt;&lt;Rcalc**2&gt;)
     * 
     * where &lt;Robs&gt; is the mean of "observed" densities of all atoms
     * 
     * &lt;Rcalc&gt; is the mean of "calculated" densities of
     * all atoms.
     * 
     * The value of density for some atom from map R(x) is:
     * 
     * sum_i ( R(xi) * Ratom(xi - xa) )
     * Dens =  ----------------------------------
     * sum_i ( Ratom(xi - xa) )
     * 
     * where  Ratom(x) is atomic electron density for the x-th grid point.
     * xa - vector of the centre of atom.
     * xi - vector of the i-th point of grid.
     * Sum is taken over all grid points which have distance
     * from the center of the atom less than the Radius_limit.
     * For all atoms Radius_limit = 2.5 A.
     * 
     * Ref: Vaguine, A.A., Richelle, J. &amp; Wodak, S.J. (1999). Acta Cryst. D55,199-205
     * @return FloatColumn
     */
    public FloatColumn getPdbxDensityCorrelation() {
        return delegate.getColumn("pdbx_density_correlation", DelegatingFloatColumn::new);
    }

    /**
     * The total number of powder patterns used.
     * @return IntColumn
     */
    public IntColumn getPdbxPdNumberOfPowderPatterns() {
        return delegate.getColumn("pdbx_pd_number_of_powder_patterns", DelegatingIntColumn::new);
    }

    /**
     * The total number of data points in the processed diffractogram.
     * @return IntColumn
     */
    public IntColumn getPdbxPdNumberOfPoints() {
        return delegate.getColumn("pdbx_pd_number_of_points", DelegatingIntColumn::new);
    }

    /**
     * The total number of points in the measured
     * diffractogram.
     * @return IntColumn
     */
    public IntColumn getPdbxPdMeasNumberOfPoints() {
        return delegate.getColumn("pdbx_pd_meas_number_of_points", DelegatingIntColumn::new);
    }

    /**
     * Rietveld/Profile fit R factors.
     * Note that the R factor computed for Rietveld refinements
     * using the extracted reflection intensity values (often
     * called the Rietveld or Bragg R factor, R~B~) is not properly
     * a profile R factor.
     * pdbx_pd_proc_ls_prof_R_factor, often called R~p~, is an
     * unweighted fitness metric for the agreement between the
     * observed and computed diffraction patterns
     * R~p~ = sum~i~ | I~obs~(i) - I~calc~(i) |
     * / sum~i~ ( I~obs~(i) )
     * Note that in the above equations,
     * w(i) is the weight for the ith data point
     * I~obs~(i) is the observed intensity for the ith data
     * point, sometimes referred to as y~i~(obs) or
     * y~oi~.
     * I~calc~(i) is the computed intensity for the ith data
     * point with background and other corrections
     * applied to match the scale of the observed dataset,
     * sometimes referred to as y~i~(calc) or
     * y~ci~.
     * n is the total number of data points (see _refine.pdbx_pd_number_of_points)
     * less the number of data points excluded from the refinement.
     * p is the total number of refined parameters.
     * @return FloatColumn
     */
    public FloatColumn getPdbxPdProcLsProfRFactor() {
        return delegate.getColumn("pdbx_pd_proc_ls_prof_R_factor", DelegatingFloatColumn::new);
    }

    /**
     * Rietveld/Profile fit R factors.
     * Note that the R factor computed for Rietveld refinements
     * using the extracted reflection intensity values (often
     * called the Rietveld or Bragg R factor, R~B~) is not properly
     * a profile R factor.
     * pdbx_pd_proc_ls_prof_wR_factor often called R~wp~, is a
     * weighted fitness metric for the agreement between the
     * observed and computed diffraction patterns
     * R~wp~ = SQRT {
     * sum~i~ ( w(i) [ I~obs~(i) - I~calc~(i) ]^2^ )
     * / sum~i~ ( w(i) [I~obs~(i)]^2^ ) }
     * Note that in the above equations,
     * w(i) is the weight for the ith data point
     * I~obs~(i) is the observed intensity for the ith data
     * point, sometimes referred to as y~i~(obs) or
     * y~oi~.
     * I~calc~(i) is the computed intensity for the ith data
     * point with background and other corrections
     * applied to match the scale of the observed dataset,
     * sometimes referred to as y~i~(calc) or
     * y~ci~.
     * n is the total number of data points (see _refine.pdbx_pd_number_of_points)
     * less the number of data points excluded from the refinement.
     * p is the total number of refined parameters.
     * @return FloatColumn
     */
    public FloatColumn getPdbxPdProcLsProfWRFactor() {
        return delegate.getColumn("pdbx_pd_proc_ls_prof_wR_factor", DelegatingFloatColumn::new);
    }

    /**
     * The correlation coefficient between the observed and
     * calculated structure factors for reflections included in
     * the refinement. This correlation factor is found in the
     * fitting using the Levenberg-Marquardt algorithm to search
     * for the minimum value of chisquare. Almost all computer
     * codes for Rietveld refinement employ the Gauss-Newton algorithm
     * to find parameters which minimize the weighted sum of squares
     * of the residuals.
     * A description of the equations is given on
     * http://www.water.hut.fi/~tkarvone/fr_org_s.htm
     * @return FloatColumn
     */
    public FloatColumn getPdbxPdMarquardtCorrelationCoeff() {
        return delegate.getColumn("pdbx_pd_Marquardt_correlation_coeff", DelegatingFloatColumn::new);
    }

    /**
     * Residual factor R for reflections that satisfy the resolution
     * limits established by _refine.ls_d_res_high and
     * _refine.ls_d_res_low and the observation limit established by
     * _reflns.observed_criterion.
     * sum|F~obs~**2 - F~calc~**2|
     * R = ---------------------
     * sum|F~obs~**2|
     * F~obs~  = the observed structure-factor amplitudes
     * F~calc~ = the calculated structure-factor amplitudes
     * sum is taken over the specified reflections
     * @return FloatColumn
     */
    public FloatColumn getPdbxPdFsqrdRFactor() {
        return delegate.getColumn("pdbx_pd_Fsqrd_R_factor", DelegatingFloatColumn::new);
    }

    /**
     * The least squares refinement "band matrix" approximation to the full matrix.
     * @return IntColumn
     */
    public IntColumn getPdbxPdLsMatrixBandWidth() {
        return delegate.getColumn("pdbx_pd_ls_matrix_band_width", DelegatingIntColumn::new);
    }

    /**
     * The overall phase error for all reflections after refinement using
     * the current refinement target.
     * @return FloatColumn
     */
    public FloatColumn getPdbxOverallPhaseError() {
        return delegate.getColumn("pdbx_overall_phase_error", DelegatingFloatColumn::new);
    }

    /**
     * The overall standard uncertainty (estimated standard deviation)
     * of the displacement parameters based on the crystallographic
     * R-free value, expressed in a formalism known as the dispersion
     * precision indicator (DPI).
     * 
     * Ref: Cruickshank, D. W. J. (1999). Acta Cryst. D55, 583-601.
     * @return FloatColumn
     */
    public FloatColumn getPdbxOverallSURFreeCruickshankDPI() {
        return delegate.getColumn("pdbx_overall_SU_R_free_Cruickshank_DPI", DelegatingFloatColumn::new);
    }

    /**
     * The overall standard uncertainty (estimated standard deviation)
     * of the displacement parameters based on the crystallographic
     * R-free value, expressed in a formalism known as the dispersion
     * precision indicator (DPI).
     * 
     * Ref: Blow, D (2002) Acta Cryst. D58, 792-797
     * @return FloatColumn
     */
    public FloatColumn getPdbxOverallSURFreeBlowDPI() {
        return delegate.getColumn("pdbx_overall_SU_R_free_Blow_DPI", DelegatingFloatColumn::new);
    }

    /**
     * The overall standard uncertainty (estimated standard deviation)
     * of the displacement parameters based on the crystallographic
     * R value, expressed in a formalism known as the dispersion
     * precision indicator (DPI).
     * 
     * Ref: Blow, D (2002) Acta Cryst. D58, 792-797
     * @return FloatColumn
     */
    public FloatColumn getPdbxOverallSURBlowDPI() {
        return delegate.getColumn("pdbx_overall_SU_R_Blow_DPI", DelegatingFloatColumn::new);
    }

    /**
     * A flag for TLS refinements identifying the type of atomic displacement parameters stored
     * in _atom_site.B_iso_or_equiv.
     * @return StrColumn
     */
    public StrColumn getPdbxTLSResidualADPFlag() {
        return delegate.getColumn("pdbx_TLS_residual_ADP_flag", DelegatingStrColumn::new);
    }

    /**
     * An identifier for the diffraction data set used in this refinement.
     * 
     * Multiple diffraction data sets specified as a comma separated list.
     * @return StrColumn
     */
    public StrColumn getPdbxDiffrnId() {
        return delegate.getColumn("pdbx_diffrn_id", DelegatingStrColumn::new);
    }

    /**
     * The overall standard uncertainty (estimated standard deviation)
     * of the displacement parameters based on a maximum-likelihood
     * residual.
     * 
     * The overall standard uncertainty (sigma~B~)^2^ gives an idea
     * of the uncertainty in the B values of averagely defined
     * atoms (atoms with B values equal to the average B value).
     * 
     * N~a~
     * (sigma~B~)^2^ = 8 ----------------------------------------------
     * sum~i~ {[1/Sigma - (E~o~)^2^ (1-m^2^)](SUM_AS)s^4^}
     * 
     * N~a~           = number of atoms
     * E~o~           = normalized structure factors
     * m              = figure of merit of phases of reflections
     * included in the summation
     * s              = reciprocal-space vector
     * 
     * SUM_AS         = (sigma~A~)^2^/Sigma^2^
     * Sigma          = (sigma~{E;exp}~)^2^ + epsilon [1-(sigma~A~)^2^]
     * sigma~{E;exp}~  = experimental uncertainties of normalized
     * structure factors
     * sigma~A~        = &lt;cos 2 pi s delta~x~&gt; SQRT(Sigma~P~/Sigma~N~)
     * estimated using maximum likelihood
     * Sigma~P~        = sum~{atoms in model}~ f^2^
     * Sigma~N~        = sum~{atoms in crystal}~ f^2^
     * f               = atom form factor
     * delta~x~        = expected error
     * epsilon         = multiplicity of diffracting plane
     * 
     * summation is over all reflections included in refinement
     * 
     * Ref: (sigma~A~ estimation) "Refinement of macromolecular
     * structures by the maximum-likelihood method",
     * Murshudov, G. N., Vagin, A. A. &amp; Dodson, E. J. (1997).
     * Acta Cryst. D53, 240-255.
     * 
     * (SU B estimation) Murshudov, G. N. &amp; Dodson,
     * E. J. (1997). Simplified error estimation a la
     * Cruickshank in macromolecular crystallography.
     * CCP4 Newsletter on Protein Crystallography, No. 33,
     * January 1997, pp. 31-39.
     * 
     * http://www.ccp4.ac.uk/newsletters/newsletter33/murshudov.html
     * @return FloatColumn
     */
    public FloatColumn getOverallSUB() {
        return delegate.getColumn("overall_SU_B", DelegatingFloatColumn::new);
    }

    /**
     * The overall standard uncertainty (estimated standard deviation)
     * of the positional parameters based on a maximum likelihood
     * residual.
     * 
     * The overall standard uncertainty (sigma~X~)^2^ gives an
     * idea of the uncertainty in the position of averagely
     * defined atoms (atoms with B values equal to average B value)
     * 
     * 3                         N~a~
     * (sigma~X~)^2^  = ---------------------------------------------------------
     * 8 pi^2^ sum~i~ {[1/Sigma - (E~o~)^2^ (1-m^2^)](SUM_AS)s^2^}
     * 
     * N~a~           = number of atoms
     * E~o~           = normalized structure factors
     * m              = figure of merit of phases of reflections
     * included in the summation
     * s              = reciprocal-space vector
     * 
     * SUM_AS         = (sigma~A~)^2^/Sigma^2^
     * Sigma          = (sigma~{E;exp}~)^2^ + epsilon [1-(sigma~A~)^2^]
     * sigma~{E;exp}~  = experimental uncertainties of normalized
     * structure factors
     * sigma~A~        = &lt;cos 2 pi s delta~x~&gt; SQRT(Sigma~P~/Sigma~N~)
     * estimated using maximum likelihood
     * Sigma~P~        = sum~{atoms in model}~ f^2^
     * Sigma~N~        = sum~{atoms in crystal}~ f^2^
     * f               = atom form factor
     * delta~x~        = expected error
     * epsilon         = multiplicity of diffracting plane
     * 
     * summation is over all reflections included in refinement
     * 
     * Ref: (sigma_A estimation) "Refinement of macromolecular
     * structures by the maximum-likelihood method",
     * Murshudov, G. N., Vagin, A. A. &amp; Dodson, E. J. (1997).
     * Acta Cryst. D53, 240-255.
     * 
     * (SU ML estimation) Murshudov, G. N. &amp; Dodson,
     * E. J. (1997). Simplified error estimation a la
     * Cruickshank in macromolecular crystallography.
     * CCP4 Newsletter on Protein Crystallography, No. 33,
     * January 1997, pp. 31-39.
     * 
     * http://www.ccp4.ac.uk/newsletters/newsletter33/murshudov.html
     * @return FloatColumn
     */
    public FloatColumn getOverallSUML() {
        return delegate.getColumn("overall_SU_ML", DelegatingFloatColumn::new);
    }

    /**
     * The overall standard uncertainty (estimated standard deviation)
     * of the displacement parameters based on the crystallographic
     * R value, expressed in a formalism known as the dispersion
     * precision indicator (DPI).
     * 
     * The overall standard uncertainty (sigma~B~) gives an idea
     * of the uncertainty in the B values of averagely defined
     * atoms (atoms with B values equal to the average B value).
     * 
     * N~a~
     * (sigma~B~)^2^ = 0.65 ---------- (R~value~)^2^ (D~min~)^2^ C^-2/3^
     * (N~o~-N~p~)
     * 
     * 
     * N~a~     = number of atoms included in refinement
     * N~o~     = number of observations
     * N~p~     = number of parameters refined
     * R~value~ = conventional crystallographic R value
     * D~min~   = maximum resolution
     * C        = completeness of data
     * 
     * Ref: Cruickshank, D. W. J. (1999). Acta Cryst. D55, 583-601.
     * 
     * Murshudov, G. N. &amp; Dodson,
     * E. J. (1997). Simplified error estimation a la
     * Cruickshank in macromolecular crystallography.
     * CCP4 Newsletter on Protein Crystallography, No. 33,
     * January 1997, pp. 31-39.
     * 
     * http://www.ccp4.ac.uk/newsletters/newsletter33/murshudov.html
     * @return FloatColumn
     */
    public FloatColumn getOverallSURCruickshankDPI() {
        return delegate.getColumn("overall_SU_R_Cruickshank_DPI", DelegatingFloatColumn::new);
    }

    /**
     * The overall standard uncertainty (estimated standard deviation)
     * of the displacement parameters based on the free R value.
     * 
     * The overall standard uncertainty (sigma~B~) gives an idea
     * of the uncertainty in the B values of averagely defined
     * atoms (atoms with B values equal to the average B value).
     * 
     * N~a~
     * (sigma~B~)^2^ = 0.65 ---------- (R~free~)^2^ (D~min~)^2^ C^-2/3^
     * (N~o~-N~p~)
     * 
     * 
     * N~a~     = number of atoms included in refinement
     * N~o~     = number of observations
     * N~p~     = number of parameters refined
     * R~free~  = conventional free crystallographic R value calculated
     * using reflections not included in refinement
     * D~min~   = maximum resolution
     * C        = completeness of data
     * 
     * Ref: Cruickshank, D. W. J. (1999). Acta Cryst. D55, 583-601.
     * 
     * Murshudov, G. N. &amp; Dodson,
     * E. J. (1997). Simplified error estimation a la
     * Cruickshank in macromolecular crystallography.
     * CCP4 Newsletter on Protein Crystallography, No. 33,
     * January 1997, pp. 31-39.
     * 
     * http://www.ccp4.ac.uk/newsletters/newsletter33/murshudov.html
     * @return FloatColumn
     */
    public FloatColumn getOverallSURFree() {
        return delegate.getColumn("overall_SU_R_free", DelegatingFloatColumn::new);
    }

    /**
     * Average figure of merit of phases of reflections not included
     * in the refinement.
     * 
     * This value is derived from the likelihood function.
     * 
     * FOM           = I~1~(X)/I~0~(X)
     * 
     * I~0~, I~1~     = zero- and first-order modified Bessel functions
     * of the first kind
     * X              = sigma~A~ |E~o~| |E~c~|/SIGMA
     * E~o~, E~c~     = normalized observed and calculated structure
     * factors
     * sigma~A~       = &lt;cos 2 pi s delta~x~&gt; SQRT(Sigma~P~/Sigma~N~)
     * estimated using maximum likelihood
     * Sigma~P~       = sum~{atoms in model}~ f^2^
     * Sigma~N~       = sum~{atoms in crystal}~ f^2^
     * f              = form factor of atoms
     * delta~x~       = expected error
     * SIGMA          = (sigma~{E;exp}~)^2^ + epsilon [1-(sigma~A~)^2^]
     * sigma~{E;exp}~ = uncertainties of normalized observed
     * structure factors
     * epsilon       = multiplicity of the diffracting plane
     * 
     * Ref: Murshudov, G. N., Vagin, A. A. &amp; Dodson, E. J. (1997).
     * Acta Cryst. D53, 240-255.
     * @return FloatColumn
     */
    public FloatColumn getOverallFOMFreeRSet() {
        return delegate.getColumn("overall_FOM_free_R_set", DelegatingFloatColumn::new);
    }

    /**
     * Average figure of merit of phases of reflections included in
     * the refinement.
     * 
     * This value is derived from the likelihood function.
     * 
     * FOM           = I~1~(X)/I~0~(X)
     * 
     * I~0~, I~1~     = zero- and first-order modified Bessel functions
     * of the first kind
     * X              = sigma~A~ |E~o~| |E~c~|/SIGMA
     * E~o~, E~c~     = normalized observed and calculated structure
     * factors
     * sigma~A~       = &lt;cos 2 pi s delta~x~&gt; SQRT(Sigma~P~/Sigma~N~)
     * estimated using maximum likelihood
     * Sigma~P~       = sum~{atoms in model}~ f^2^
     * Sigma~N~       = sum~{atoms in crystal}~ f^2^
     * f              = form factor of atoms
     * delta~x~       = expected error
     * SIGMA          = (sigma~{E;exp}~)^2^ + epsilon [1-(sigma~A~)^2^]
     * sigma~{E;exp}~ = uncertainties of normalized observed
     * structure factors
     * epsilon       = multiplicity of the diffracting plane
     * 
     * Ref: Murshudov, G. N., Vagin, A. A. &amp; Dodson, E. J. (1997).
     * Acta Cryst. D53, 240-255.
     * @return FloatColumn
     */
    public FloatColumn getOverallFOMWorkRSet() {
        return delegate.getColumn("overall_FOM_work_R_set", DelegatingFloatColumn::new);
    }

    /**
     * Overall average Fourier Shell Correlation (avgFSC) between model and
     * observed structure factors for all reflections.
     * 
     * The average FSC is a measure of the agreement between observed
     * and calculated structure factors.
     * 
     * sum(N~i~ FSC~i~)
     * avgFSC   = ----------------
     * sum(N~i~)
     * 
     * 
     * N~i~     = the number of all reflections in the resolution shell i
     * FSC~i~   = FSC for all reflections in the i-th resolution shell calculated as:
     * 
     * (sum(|F~o~| |F~c~| fom cos(phi~c~-phi~o~)))
     * FSC~i~  = -------------------------------------------
     * (sum(|F~o~|^2^) (sum(|F~c~|^2^)))^1/2^
     * 
     * |F~o~|   = amplitude of observed structure factor
     * |F~c~|   = amplitude of calculated structure factor
     * phi~o~   = phase of observed structure factor
     * phi~c~   = phase of calculated structure factor
     * fom      = figure of merit of the experimental phases.
     * 
     * Summation of FSC~i~ is carried over all reflections in the resolution shell.
     * 
     * Summation of avgFSC is carried over all resolution shells.
     * 
     * 
     * Ref:  Rosenthal P.B., Henderson R.
     * "Optimal determination of particle orientation, absolute hand,
     * and contrast loss in single-particle electron cryomicroscopy.
     * Journal of Molecular Biology. 2003;333(4):721-745, equation (A6).
     * @return FloatColumn
     */
    public FloatColumn getPdbxAverageFscOverall() {
        return delegate.getColumn("pdbx_average_fsc_overall", DelegatingFloatColumn::new);
    }

    /**
     * Average Fourier Shell Correlation (avgFSC) between model and
     * observed structure factors for reflections included in refinement.
     * 
     * The average FSC is a measure of the agreement between observed
     * and calculated structure factors.
     * 
     * sum(N~i~ FSC~work-i~)
     * avgFSC~work~   = ---------------------
     * sum(N~i~)
     * 
     * 
     * N~i~          = the number of working reflections in the resolution shell i
     * FSC~work-i~   = FSC for working reflections in the i-th resolution shell calculated as:
     * 
     * (sum(|F~o~| |F~c~| fom cos(phi~c~-phi~o~)))
     * FSC~work-i~  = -------------------------------------------
     * (sum(|F~o~|^2^) (sum(|F~c~|^2^)))^1/2^
     * 
     * |F~o~|   = amplitude of observed structure factor
     * |F~c~|   = amplitude of calculated structure factor
     * phi~o~   = phase of observed structure factor
     * phi~c~   = phase of calculated structure factor
     * fom      = figure of merit of the experimental phases.
     * 
     * Summation of FSC~work-i~ is carried over all working reflections in the resolution shell.
     * 
     * Summation of avgFSC~work~ is carried over all resolution shells.
     * 
     * 
     * Ref:  Rosenthal P.B., Henderson R.
     * "Optimal determination of particle orientation, absolute hand,
     * and contrast loss in single-particle electron cryomicroscopy.
     * Journal of Molecular Biology. 2003;333(4):721-745, equation (A6).
     * @return FloatColumn
     */
    public FloatColumn getPdbxAverageFscWork() {
        return delegate.getColumn("pdbx_average_fsc_work", DelegatingFloatColumn::new);
    }

    /**
     * Average Fourier Shell Correlation (avgFSC) between model and
     * observed structure factors for reflections not included in refinement.
     * 
     * The average FSC is a measure of the agreement between observed
     * and calculated structure factors.
     * 
     * sum(N~i~ FSC~free-i~)
     * avgFSC~free~   = ---------------------
     * sum(N~i~)
     * 
     * 
     * N~i~          = the number of free reflections in the resolution shell i
     * FSC~free-i~   = FSC for free reflections in the i-th resolution shell calculated as:
     * 
     * (sum(|F~o~| |F~c~| fom cos(phi~c~-phi~o~)))
     * FSC~free-i~  = -------------------------------------------
     * (sum(|F~o~|^2^) (sum(|F~c~|^2^)))^1/2^
     * 
     * |F~o~|   = amplitude of observed structure factor
     * |F~c~|   = amplitude of calculated structure factor
     * phi~o~   = phase of observed structure factor
     * phi~c~   = phase of calculated structure factor
     * fom      = figure of merit of the experimental phases.
     * 
     * Summation of FSC~free-i~ is carried over all free reflections in the resolution shell.
     * 
     * Summation of avgFSC~free~ is carried over all resolution shells.
     * 
     * 
     * Ref:  Rosenthal P.B., Henderson R.
     * "Optimal determination of particle orientation, absolute hand,
     * and contrast loss in single-particle electron cryomicroscopy.
     * Journal of Molecular Biology. 2003;333(4):721-745, equation (A6).
     * @return FloatColumn
     */
    public FloatColumn getPdbxAverageFscFree() {
        return delegate.getColumn("pdbx_average_fsc_free", DelegatingFloatColumn::new);
    }

    /**
     * Overall estimated standard uncertainties of thermal parameters
     * based on Maximum likelihood residual.
     * 
     * Overall ESU gives an idea about uncertainties of B-values of
     * averagely defined atoms (atoms with B-values equal to average
     * B-value)
     * 
     * N_a
     * (sigma_B)^2  = 8 ----------------------------------------------
     * sum~i~ {(1/Sigma - (E_o)^2 (1-m^2)(SUM_AS)s^4}
     * 
     * SUM_AS         = (sigma_A)^2/Sigma^2)
     * N_a            = number of atoms
     * Sigma          = (sigma_{E;exp})^2 + epsilon (1-{sigma_A)^2)
     * E_o            = normalized structure factors
     * sigma_{E;exp}  = experimental uncertainties of normalized
     * structure factors
     * sigma_A        = &lt;cos 2 pi s delta_x&gt; SQRT(Sigma_P/Sigma_N)
     * estimated using maximum likelihood
     * Sigma_P        = sum_{atoms in model} f^2
     * Sigma_N        = sum_{atoms in crystal} f^2
     * f              = is form factor of atoms
     * delta_x        = expected error
     * m              = is figure of merit of phases of reflection
     * included in summation delta_x expected error
     * s              = reciprocal space vector
     * epsilon        = multiplicity of diffracting plane
     * 
     * summation is over all reflections included in refinement
     * 
     * Reference for sigma_A estimation:
     * 
     * "Refinement of Macromolecular Structures by the
     * Maximum-Likelihood Method:"  G.N. Murshudov, A.A.Vagin and
     * E.J.Dodson,(1997) Acta Crystallogr. D53, 240-255
     * 
     * Reference for ESU_ML estimation:
     * 
     * "Simplified error estimation a la Cruickshank in macromolecular
     * crystallography",  Murshudov G.N. &amp; Dodson E.J.  in the "CCP4
     * Newsletter on protein crystallography" Number 33 ed. M.Winn
     * @return FloatColumn
     */
    public FloatColumn getPdbxOverallESUB() {
        return delegate.getColumn("pdbx_overall_ESU_B", DelegatingFloatColumn::new);
    }

    /**
     * Overall estimated standard uncertainties of positional
     * parameters based on Maximum likelihood residual.
     * 
     * Overall ESU gives an idea about uncertainties in the position
     * of averagely defined atoms (atoms with B-values equal to
     * average B-value)
     * 
     * 3                         N_a
     * (sigma_X)^2  = -----------------------------------------------------
     * 8 pi^2 sum~i~ {(1/Sigma - (E_o)^2 (1-m^2)(SUM_AS)s^2}
     * 
     * SUM_AS         = (sigma_A)^2/Sigma^2)
     * N_a            = number of atoms
     * Sigma          = (sigma_{E;exp})^2 + epsilon (1-{sigma_A)^2)
     * E_o            = normalized structure factors
     * 
     * sigma_{E;exp}  = experimental uncertainties of normalized
     * structure factors
     * sigma_A        = &lt;cos 2 pi s delta_x&gt; SQRT(Sigma_P/Sigma_N)
     * estimated using maximum likelihood
     * Sigma_P        = sum_{atoms in model} f^2
     * Sigma_N        = sum_{atoms in crystal} f^2
     * f              = is formfactor of atoms
     * delta_x        = expected error
     * m              = is figure of merit of phases of reflection
     * included in summation delta_x expected error
     * s              = reciprocal space vector
     * epsilon        = multiplicity of diffracting plane
     * 
     * summation is over all reflections included in refinement
     * 
     * Reference for sigma_A estimation:
     * 
     * "Refinement of Macromolecular Structures by the
     * Maximum-Likelihood Method:" G.N. Murshudov, A.A.Vagin and
     * E.J.Dodson,(1997)  Acta Crystallogr. D53, 240-255
     * 
     * Reference for ESU_ML estimation:
     * 
     * Simplified error estimation a la Cruickshank in macromolecular
     * crystallograpy  Murshudov G.N. &amp; Dodson E.J.  in the "CCP4
     * Newsletter on protein crystallography" Number 33 ed. M.Winn
     * @return FloatColumn
     */
    public FloatColumn getPdbxOverallESUML() {
        return delegate.getColumn("pdbx_overall_ESU_ML", DelegatingFloatColumn::new);
    }

}