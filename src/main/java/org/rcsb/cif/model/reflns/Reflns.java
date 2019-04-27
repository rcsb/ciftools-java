package org.rcsb.cif.model.reflns;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class Reflns extends BaseCategory {
    public Reflns(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public Reflns(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public Reflns(String name) {
        super(name);
    }

    /**
     * The value of the overall isotropic displacement parameter
     * estimated from the slope of the Wilson plot.
     * @return BIsoWilsonEstimate
     */
    public BIsoWilsonEstimate getBIsoWilsonEstimate() {
        return (BIsoWilsonEstimate) (isText ? textFields.computeIfAbsent("B_iso_Wilson_estimate",
                BIsoWilsonEstimate::new) : getBinaryColumn("B_iso_Wilson_estimate"));
    }

    /**
     * This data item is a pointer to _entry.id in the ENTRY category.
     * @return EntryId
     */
    public EntryId getEntryId() {
        return (EntryId) (isText ? textFields.computeIfAbsent("entry_id",
                EntryId::new) : getBinaryColumn("entry_id"));
    }

    /**
     * A description of special aspects of the data-reduction
     * procedures.
     * @return DataReductionDetails
     */
    public DataReductionDetails getDataReductionDetails() {
        return (DataReductionDetails) (isText ? textFields.computeIfAbsent("data_reduction_details",
                DataReductionDetails::new) : getBinaryColumn("data_reduction_details"));
    }

    /**
     * The method used for data reduction.
     * 
     * Note that this is not the computer program used, which is
     * described in the SOFTWARE category, but the method
     * itself.
     * 
     * This data item should be used to describe significant
     * methodological options used within the data-reduction programs.
     * @return DataReductionMethod
     */
    public DataReductionMethod getDataReductionMethod() {
        return (DataReductionMethod) (isText ? textFields.computeIfAbsent("data_reduction_method",
                DataReductionMethod::new) : getBinaryColumn("data_reduction_method"));
    }

    /**
     * The smallest value for the interplanar spacings for
     * the reflection data. This is called the highest resolution.
     * @return DResolutionHigh
     */
    public DResolutionHigh getDResolutionHigh() {
        return (DResolutionHigh) (isText ? textFields.computeIfAbsent("d_resolution_high",
                DResolutionHigh::new) : getBinaryColumn("d_resolution_high"));
    }

    /**
     * The largest value for the interplanar spacings for the
     * reflection data. This is called the lowest resolution.
     * @return DResolutionLow
     */
    public DResolutionLow getDResolutionLow() {
        return (DResolutionLow) (isText ? textFields.computeIfAbsent("d_resolution_low",
                DResolutionLow::new) : getBinaryColumn("d_resolution_low"));
    }

    /**
     * A description of reflection data not covered by other data
     * names. This should include details of the Friedel pairs.
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
    }

    /**
     * Maximum value of the Miller index h for the reflection data. This
     * need not have the same value as _diffrn_reflns.limit_h_max.
     * @return LimitHMax
     */
    public LimitHMax getLimitHMax() {
        return (LimitHMax) (isText ? textFields.computeIfAbsent("limit_h_max",
                LimitHMax::new) : getBinaryColumn("limit_h_max"));
    }

    /**
     * Minimum value of the Miller index h for the reflection data. This
     * need not have the same value as _diffrn_reflns.limit_h_min.
     * @return LimitHMin
     */
    public LimitHMin getLimitHMin() {
        return (LimitHMin) (isText ? textFields.computeIfAbsent("limit_h_min",
                LimitHMin::new) : getBinaryColumn("limit_h_min"));
    }

    /**
     * Maximum value of the Miller index k for the reflection data. This
     * need not have the same value as _diffrn_reflns.limit_k_max.
     * @return LimitKMax
     */
    public LimitKMax getLimitKMax() {
        return (LimitKMax) (isText ? textFields.computeIfAbsent("limit_k_max",
                LimitKMax::new) : getBinaryColumn("limit_k_max"));
    }

    /**
     * Minimum value of the Miller index k for the reflection data. This
     * need not have the same value as _diffrn_reflns.limit_k_min.
     * @return LimitKMin
     */
    public LimitKMin getLimitKMin() {
        return (LimitKMin) (isText ? textFields.computeIfAbsent("limit_k_min",
                LimitKMin::new) : getBinaryColumn("limit_k_min"));
    }

    /**
     * Maximum value of the Miller index l for the reflection data. This
     * need not have the same value as _diffrn_reflns.limit_l_max.
     * @return LimitLMax
     */
    public LimitLMax getLimitLMax() {
        return (LimitLMax) (isText ? textFields.computeIfAbsent("limit_l_max",
                LimitLMax::new) : getBinaryColumn("limit_l_max"));
    }

    /**
     * Minimum value of the Miller index l for the reflection data. This
     * need not have the same value as _diffrn_reflns.limit_l_min.
     * @return LimitLMin
     */
    public LimitLMin getLimitLMin() {
        return (LimitLMin) (isText ? textFields.computeIfAbsent("limit_l_min",
                LimitLMin::new) : getBinaryColumn("limit_l_min"));
    }

    /**
     * The total number of reflections in the REFLN list (not the
     * DIFFRN_REFLN list). This number may contain Friedel-equivalent
     * reflections according to the nature of the structure and the
     * procedures used. The item _reflns.details describes the
     * reflection data.
     * @return NumberAll
     */
    public NumberAll getNumberAll() {
        return (NumberAll) (isText ? textFields.computeIfAbsent("number_all",
                NumberAll::new) : getBinaryColumn("number_all"));
    }

    /**
     * The number of reflections in the REFLN list (not the DIFFRN_REFLN
     * list) classified as observed (see _reflns.observed_criterion).
     * This number may contain Friedel-equivalent reflections according
     * to the nature of the structure and the procedures used.
     * @return NumberObs
     */
    public NumberObs getNumberObs() {
        return (NumberObs) (isText ? textFields.computeIfAbsent("number_obs",
                NumberObs::new) : getBinaryColumn("number_obs"));
    }

    /**
     * The criterion used to classify a reflection as 'observed'. This
     * criterion is usually expressed in terms of a sigma(I) or
     * sigma(F) threshold.
     * @return ObservedCriterion
     */
    public ObservedCriterion getObservedCriterion() {
        return (ObservedCriterion) (isText ? textFields.computeIfAbsent("observed_criterion",
                ObservedCriterion::new) : getBinaryColumn("observed_criterion"));
    }

    /**
     * The criterion used to classify a reflection as 'observed'
     * expressed as an upper limit for the value of F.
     * @return ObservedCriterionFMax
     */
    public ObservedCriterionFMax getObservedCriterionFMax() {
        return (ObservedCriterionFMax) (isText ? textFields.computeIfAbsent("observed_criterion_F_max",
                ObservedCriterionFMax::new) : getBinaryColumn("observed_criterion_F_max"));
    }

    /**
     * The criterion used to classify a reflection as 'observed'
     * expressed as a lower limit for the value of F.
     * @return ObservedCriterionFMin
     */
    public ObservedCriterionFMin getObservedCriterionFMin() {
        return (ObservedCriterionFMin) (isText ? textFields.computeIfAbsent("observed_criterion_F_min",
                ObservedCriterionFMin::new) : getBinaryColumn("observed_criterion_F_min"));
    }

    /**
     * The criterion used to classify a reflection as 'observed'
     * expressed as an upper limit for the value of I.
     * @return ObservedCriterionIMax
     */
    public ObservedCriterionIMax getObservedCriterionIMax() {
        return (ObservedCriterionIMax) (isText ? textFields.computeIfAbsent("observed_criterion_I_max",
                ObservedCriterionIMax::new) : getBinaryColumn("observed_criterion_I_max"));
    }

    /**
     * The criterion used to classify a reflection as 'observed'
     * expressed as a lower limit for the value of I.
     * @return ObservedCriterionIMin
     */
    public ObservedCriterionIMin getObservedCriterionIMin() {
        return (ObservedCriterionIMin) (isText ? textFields.computeIfAbsent("observed_criterion_I_min",
                ObservedCriterionIMin::new) : getBinaryColumn("observed_criterion_I_min"));
    }

    /**
     * The criterion used to classify a reflection as 'observed'
     * expressed as a multiple of the value of sigma(F).
     * @return ObservedCriterionSigmaF
     */
    public ObservedCriterionSigmaF getObservedCriterionSigmaF() {
        return (ObservedCriterionSigmaF) (isText ? textFields.computeIfAbsent("observed_criterion_sigma_F",
                ObservedCriterionSigmaF::new) : getBinaryColumn("observed_criterion_sigma_F"));
    }

    /**
     * The criterion used to classify a reflection as 'observed'
     * expressed as a multiple of the value of sigma(I).
     * @return ObservedCriterionSigmaI
     */
    public ObservedCriterionSigmaI getObservedCriterionSigmaI() {
        return (ObservedCriterionSigmaI) (isText ? textFields.computeIfAbsent("observed_criterion_sigma_I",
                ObservedCriterionSigmaI::new) : getBinaryColumn("observed_criterion_sigma_I"));
    }

    /**
     * The percentage of geometrically possible reflections represented
     * by reflections that satisfy the resolution limits established
     * by _reflns.d_resolution_high and _reflns.d_resolution_low and
     * the observation limit established by
     * _reflns.observed_criterion.
     * @return PercentPossibleObs
     */
    public PercentPossibleObs getPercentPossibleObs() {
        return (PercentPossibleObs) (isText ? textFields.computeIfAbsent("percent_possible_obs",
                PercentPossibleObs::new) : getBinaryColumn("percent_possible_obs"));
    }

    /**
     * A description of the method by which a subset of reflections was
     * selected for exclusion from refinement so as to be used in the
     * calculation of a 'free' R factor.
     * @return RFreeDetails
     */
    public RFreeDetails getRFreeDetails() {
        return (RFreeDetails) (isText ? textFields.computeIfAbsent("R_free_details",
                RFreeDetails::new) : getBinaryColumn("R_free_details"));
    }

    /**
     * Residual factor Rmerge for all reflections that satisfy the
     * resolution limits established by _reflns.d_resolution_high
     * and _reflns.d_resolution_low.
     * 
     * sum~i~(sum~j~|F~j~ - <F>|)
     * Rmerge(F) = --------------------------
     * sum~i~(sum~j~<F>)
     * 
     * F~j~ = the amplitude of the jth observation of reflection i
     * <F>  = the mean of the amplitudes of all observations of
     * reflection i
     * 
     * sum~i~ is taken over all reflections
     * sum~j~ is taken over all observations of each reflection
     * @return RmergeFAll
     */
    public RmergeFAll getRmergeFAll() {
        return (RmergeFAll) (isText ? textFields.computeIfAbsent("Rmerge_F_all",
                RmergeFAll::new) : getBinaryColumn("Rmerge_F_all"));
    }

    /**
     * Residual factor Rmerge for reflections that satisfy the
     * resolution limits established by _reflns.d_resolution_high
     * and _reflns.d_resolution_low and the observation limit
     * established by _reflns.observed_criterion.
     * 
     * sum~i~(sum~j~|F~j~ - <F>|)
     * Rmerge(F) = --------------------------
     * sum~i~(sum~j~<F>)
     * 
     * F~j~ = the amplitude of the jth observation of reflection i
     * <F>  = the mean of the amplitudes of all observations of
     * reflection i
     * 
     * sum~i~ is taken over all reflections
     * sum~j~ is taken over all observations of each reflection
     * @return RmergeFObs
     */
    public RmergeFObs getRmergeFObs() {
        return (RmergeFObs) (isText ? textFields.computeIfAbsent("Rmerge_F_obs",
                RmergeFObs::new) : getBinaryColumn("Rmerge_F_obs"));
    }

    /**
     * The proportion of Friedel-related reflections present in
     * the number of  'independent' reflections specified by
     * the item _reflns.number_all.
     * 
     * This proportion is calculated as the ratio:
     * 
     * [N(Crystal class) - N(Laue symmetry)] / N(Laue symmetry)
     * 
     * where, working from the DIFFRN_REFLN list,
     * 
     * N(Crystal class) is the number of reflections obtained on
     * averaging under the symmetry of the crystal class
     * N(Laue symmetry) is the number of reflections obtained on
     * averaging under the Laue symmetry.
     * 
     * Examples:
     * (a) For centrosymmetric structures, the value of
     * _reflns.Friedel_coverage is
     * necessarily equal to 0.0, as the crystal class
     * is identical to the Laue symmetry.
     * (b) For whole-sphere data for a crystal in the space
     * group P1, _reflns.Friedel_coverage is equal to 1.0,
     * as no reflection h k l is equivalent to -h -k -l
     * in the crystal class and all Friedel pairs
     * {h k l; -h -k -l} have been measured.
     * (c) For whole-sphere data in space group Pmm2,
     * _reflns.Friedel_coverage
     * will be < 1.0 because although reflections h k l and
     * -h -k -l are not equivalent when h k l indices are
     * nonzero, they are when l=0.
     * (d) For a crystal in space group Pmm2, measurements of the
     * two inequivalent octants h >= 0, k >=0, l lead to the
     * same value as in (c), whereas measurements of the
     * two equivalent octants h >= 0, k, l >= 0 will lead to
     * a zero value for _reflns.Friedel_coverage.
     * @return FriedelCoverage
     */
    public FriedelCoverage getFriedelCoverage() {
        return (FriedelCoverage) (isText ? textFields.computeIfAbsent("Friedel_coverage",
                FriedelCoverage::new) : getBinaryColumn("Friedel_coverage"));
    }

    /**
     * The number of reflections in the REFLN list (not the
     * DIFFRN_REFLN list) that are significantly intense, satisfying
     * the criterion specified by _reflns.threshold_expression. This may
     * include Friedel-equivalent reflections (i.e. those which are
     * symmetry-equivalent under the Laue symmetry but inequivalent
     * under the crystal class) according to the nature of the
     * structure and the procedures used. Any special characteristics
     * of the reflections included in the REFLN list should be
     * described using the item _reflns.details.
     * @return NumberGt
     */
    public NumberGt getNumberGt() {
        return (NumberGt) (isText ? textFields.computeIfAbsent("number_gt",
                NumberGt::new) : getBinaryColumn("number_gt"));
    }

    /**
     * The threshold, usually based on multiples of u(I), u(F^2^)
     * or u(F), that serves to identify significantly intense
     * reflections, the number of which is given by _reflns.number_gt.
     * These reflections are used in the calculation of
     * _refine.ls_R_factor_gt.
     * @return ThresholdExpression
     */
    public ThresholdExpression getThresholdExpression() {
        return (ThresholdExpression) (isText ? textFields.computeIfAbsent("threshold_expression",
                ThresholdExpression::new) : getBinaryColumn("threshold_expression"));
    }

    /**
     * Overall redundancy for this data set (%).
     * @return PdbxRedundancy
     */
    public PdbxRedundancy getPdbxRedundancy() {
        return (PdbxRedundancy) (isText ? textFields.computeIfAbsent("pdbx_redundancy",
                PdbxRedundancy::new) : getBinaryColumn("pdbx_redundancy"));
    }

    /**
     * The R value for merging intensities satisfying the observed
     * criteria in this data set.
     * @return PdbxRmergeIObs
     */
    public PdbxRmergeIObs getPdbxRmergeIObs() {
        return (PdbxRmergeIObs) (isText ? textFields.computeIfAbsent("pdbx_Rmerge_I_obs",
                PdbxRmergeIObs::new) : getBinaryColumn("pdbx_Rmerge_I_obs"));
    }

    /**
     * The R value for merging all intensities in this data set.
     * @return PdbxRmergeIAll
     */
    public PdbxRmergeIAll getPdbxRmergeIAll() {
        return (PdbxRmergeIAll) (isText ? textFields.computeIfAbsent("pdbx_Rmerge_I_all",
                PdbxRmergeIAll::new) : getBinaryColumn("pdbx_Rmerge_I_all"));
    }

    /**
     * The R sym value as a decimal number.
     * @return PdbxRsymValue
     */
    public PdbxRsymValue getPdbxRsymValue() {
        return (PdbxRsymValue) (isText ? textFields.computeIfAbsent("pdbx_Rsym_value",
                PdbxRsymValue::new) : getBinaryColumn("pdbx_Rsym_value"));
    }

    /**
     * The ratio of the average intensity to the average uncertainty,
     * <I>/<sigma(I)>.
     * @return PdbxNetIOverAvSigmaI
     */
    public PdbxNetIOverAvSigmaI getPdbxNetIOverAvSigmaI() {
        return (PdbxNetIOverAvSigmaI) (isText ? textFields.computeIfAbsent("pdbx_netI_over_av_sigmaI",
                PdbxNetIOverAvSigmaI::new) : getBinaryColumn("pdbx_netI_over_av_sigmaI"));
    }

    /**
     * The mean of the ratio of the intensities to their
     * standard uncertainties, <I/sigma(I)>.
     * @return PdbxNetIOverSigmaI
     */
    public PdbxNetIOverSigmaI getPdbxNetIOverSigmaI() {
        return (PdbxNetIOverSigmaI) (isText ? textFields.computeIfAbsent("pdbx_netI_over_sigmaI",
                PdbxNetIOverSigmaI::new) : getBinaryColumn("pdbx_netI_over_sigmaI"));
    }

    /**
     * Resolution (angstrom) for reflections with  <I>/<sigma(I)> = 2.
     * @return PdbxResNetIOverAvSigmaI2
     */
    public PdbxResNetIOverAvSigmaI2 getPdbxResNetIOverAvSigmaI2() {
        return (PdbxResNetIOverAvSigmaI2) (isText ? textFields.computeIfAbsent("pdbx_res_netI_over_av_sigmaI_2",
                PdbxResNetIOverAvSigmaI2::new) : getBinaryColumn("pdbx_res_netI_over_av_sigmaI_2"));
    }

    /**
     * Resolution (angstroms) for reflections with  <I/sigma(I)> = 2.
     * @return PdbxResNetIOverSigmaI2
     */
    public PdbxResNetIOverSigmaI2 getPdbxResNetIOverSigmaI2() {
        return (PdbxResNetIOverSigmaI2) (isText ? textFields.computeIfAbsent("pdbx_res_netI_over_sigmaI_2",
                PdbxResNetIOverSigmaI2::new) : getBinaryColumn("pdbx_res_netI_over_sigmaI_2"));
    }

    /**
     * Overall  Chi-squared statistic.
     * @return PdbxChiSquared
     */
    public PdbxChiSquared getPdbxChiSquared() {
        return (PdbxChiSquared) (isText ? textFields.computeIfAbsent("pdbx_chi_squared",
                PdbxChiSquared::new) : getBinaryColumn("pdbx_chi_squared"));
    }

    /**
     * Number of reflections rejected in scaling operations.
     * @return PdbxScalingRejects
     */
    public PdbxScalingRejects getPdbxScalingRejects() {
        return (PdbxScalingRejects) (isText ? textFields.computeIfAbsent("pdbx_scaling_rejects",
                PdbxScalingRejects::new) : getBinaryColumn("pdbx_scaling_rejects"));
    }

    /**
     * The highest optical resolution for this reflection data set
     * as determined by computational method _reflns.pdbx_d_res_opt_method.
     * @return PdbxDResHighOpt
     */
    public PdbxDResHighOpt getPdbxDResHighOpt() {
        return (PdbxDResHighOpt) (isText ? textFields.computeIfAbsent("pdbx_d_res_high_opt",
                PdbxDResHighOpt::new) : getBinaryColumn("pdbx_d_res_high_opt"));
    }

    /**
     * The lowest optical resolution for this reflection data set
     * as determined by computational method _reflns.pdbx_d_res_opt_method.
     * @return PdbxDResLowOpt
     */
    public PdbxDResLowOpt getPdbxDResLowOpt() {
        return (PdbxDResLowOpt) (isText ? textFields.computeIfAbsent("pdbx_d_res_low_opt",
                PdbxDResLowOpt::new) : getBinaryColumn("pdbx_d_res_low_opt"));
    }

    /**
     * The computational method used to determine the optical
     * resolution limits _reflns.pdbx_d_res_high_opt and
     * _reflns.pdbx_d_res_low_opt.
     * @return PdbxDResOptMethod
     */
    public PdbxDResOptMethod getPdbxDResOptMethod() {
        return (PdbxDResOptMethod) (isText ? textFields.computeIfAbsent("pdbx_d_res_opt_method",
                PdbxDResOptMethod::new) : getBinaryColumn("pdbx_d_res_opt_method"));
    }

    /**
     * The value of _reflns.phase_calculation_details describes a
     * special details about calculation of phases in _refln.phase_calc.
     * @return PhaseCalculationDetails
     */
    public PhaseCalculationDetails getPhaseCalculationDetails() {
        return (PhaseCalculationDetails) (isText ? textFields.computeIfAbsent("phase_calculation_details",
                PhaseCalculationDetails::new) : getBinaryColumn("phase_calculation_details"));
    }

    /**
     * The redundancy-independent merging R factor value Rrim,
     * also denoted Rmeas, for merging all intensities in this
     * data set.
     * 
     * sum~i~ [N~i~/(N~i~ - 1)]1/2^ sum~j~ | I~j~ - <I~i~> |
     * Rrim = ----------------------------------------------------
     * sum~i~ ( sum~j~ I~j~ )
     * 
     * I~j~   = the intensity of the jth observation of reflection i
     * <I~i~> = the mean of the intensities of all observations of
     * reflection i
     * N~i~   = the redundancy (the number of times reflection i
     * has been measured).
     * 
     * sum~i~ is taken over all reflections
     * sum~j~ is taken over all observations of each reflection.
     * 
     * Ref: Diederichs, K. & Karplus, P. A. (1997). Nature Struct.
     * Biol. 4, 269-275.
     * Weiss, M. S. & Hilgenfeld, R. (1997). J. Appl. Cryst.
     * 30, 203-205.
     * Weiss, M. S. (2001). J. Appl. Cryst. 34, 130-135.
     * @return PdbxRrimIAll
     */
    public PdbxRrimIAll getPdbxRrimIAll() {
        return (PdbxRrimIAll) (isText ? textFields.computeIfAbsent("pdbx_Rrim_I_all",
                PdbxRrimIAll::new) : getBinaryColumn("pdbx_Rrim_I_all"));
    }

    /**
     * The precision-indicating merging R factor value Rpim,
     * for merging all intensities in this data set.
     * 
     * sum~i~ [1/(N~i~ - 1)]1/2^ sum~j~ | I~j~ - <I~i~> |
     * Rpim = --------------------------------------------------
     * sum~i~ ( sum~j~ I~j~ )
     * 
     * I~j~   = the intensity of the jth observation of reflection i
     * <I~i~> = the mean of the intensities of all observations
     * of reflection i
     * N~i~   = the redundancy (the number of times reflection i
     * has been measured).
     * 
     * sum~i~ is taken over all reflections
     * sum~j~ is taken over all observations of each reflection.
     * 
     * Ref: Diederichs, K. & Karplus, P. A. (1997). Nature Struct.
     * Biol. 4, 269-275.
     * Weiss, M. S. & Hilgenfeld, R. (1997). J. Appl. Cryst.
     * 30, 203-205.
     * Weiss, M. S. (2001). J. Appl. Cryst. 34, 130-135.
     * @return PdbxRpimIAll
     */
    public PdbxRpimIAll getPdbxRpimIAll() {
        return (PdbxRpimIAll) (isText ? textFields.computeIfAbsent("pdbx_Rpim_I_all",
                PdbxRpimIAll::new) : getBinaryColumn("pdbx_Rpim_I_all"));
    }

    /**
     * The optical resolution of the data set, d(opt), is the
     * expected minimum distance between two resolved peaks in
     * an electron-density map.
     * 
     * d(opt) = {2[sigma(Patt)2^ + sigma(sph)2^]}1/2^
     * 
     * sigma(Patt) = standard deviation of the Gaussian function
     * fitted to the Patterson origin peak
     * sigma(sph)  = standard deviation of the Gaussian function
     * fitted to the origin peak of the spherical
     * interference function, representing the Fourier
     * transform of a sphere with radius 1/dmin
     * dmin        = nominal resolution (_reflns.d_resolution_high)
     * 
     * Ref: Vaguine, A. A., Richelle, J. & Wodak, S. J. (1999).
     * Acta Cryst. D55, 191-205.
     * (see also http://www.ysbl.york.ac.uk/~alexei/sfcheck.html)
     * Weiss, M. S. (2001). J. Appl. Cryst. 34, 130-135.
     * @return PdbxDOpt
     */
    public PdbxDOpt getPdbxDOpt() {
        return (PdbxDOpt) (isText ? textFields.computeIfAbsent("pdbx_d_opt",
                PdbxDOpt::new) : getBinaryColumn("pdbx_d_opt"));
    }

    /**
     * Total number of measured reflections.
     * @return PdbxNumberMeasuredAll
     */
    public PdbxNumberMeasuredAll getPdbxNumberMeasuredAll() {
        return (PdbxNumberMeasuredAll) (isText ? textFields.computeIfAbsent("pdbx_number_measured_all",
                PdbxNumberMeasuredAll::new) : getBinaryColumn("pdbx_number_measured_all"));
    }

    /**
     * An identifier for the diffraction data set for this set of summary statistics.
     * 
     * Multiple diffraction data sets entered as a comma separated list.
     * @return PdbxDiffrnId
     */
    public PdbxDiffrnId getPdbxDiffrnId() {
        return (PdbxDiffrnId) (isText ? textFields.computeIfAbsent("pdbx_diffrn_id",
                PdbxDiffrnId::new) : getBinaryColumn("pdbx_diffrn_id"));
    }

    /**
     * An ordinal identifier for this set of reflection statistics.
     * @return PdbxOrdinal
     */
    public PdbxOrdinal getPdbxOrdinal() {
        return (PdbxOrdinal) (isText ? textFields.computeIfAbsent("pdbx_ordinal",
                PdbxOrdinal::new) : getBinaryColumn("pdbx_ordinal"));
    }

    /**
     * The Pearson's correlation coefficient expressed as a decimal value
     * between the average intensities from randomly selected
     * half-datasets.
     * 
     * Ref: Karplus & Diederichs (2012), Science 336, 1030-33
     * @return PdbxCCHalf
     */
    public PdbxCCHalf getPdbxCCHalf() {
        return (PdbxCCHalf) (isText ? textFields.computeIfAbsent("pdbx_CC_half",
                PdbxCCHalf::new) : getBinaryColumn("pdbx_CC_half"));
    }

    /**
     * R split measures the agreement between the sets of intensities created by merging
     * odd- and even-numbered images  from the overall data.
     * 
     * Ref: T. A. White, R. A. Kirian, A. V. Martin, A. Aquila, K. Nass, A. Barty
     * and H. N. Chapman (2012), J. Appl. Cryst. 45, 335-341
     * @return PdbxRSplit
     */
    public PdbxRSplit getPdbxRSplit() {
        return (PdbxRSplit) (isText ? textFields.computeIfAbsent("pdbx_R_split",
                PdbxRSplit::new) : getBinaryColumn("pdbx_R_split"));
    }

    /**
     * The redundancy in set of observed reflections.
     * @return PdbxRedundancyReflnsObs
     */
    public PdbxRedundancyReflnsObs getPdbxRedundancyReflnsObs() {
        return (PdbxRedundancyReflnsObs) (isText ? textFields.computeIfAbsent("pdbx_redundancy_reflns_obs",
                PdbxRedundancyReflnsObs::new) : getBinaryColumn("pdbx_redundancy_reflns_obs"));
    }

    /**
     * This item is the same as _reflns.number_obs, but applies to
     * observed Friedel pairs only.
     * @return PdbxNumberAnomalous
     */
    public PdbxNumberAnomalous getPdbxNumberAnomalous() {
        return (PdbxNumberAnomalous) (isText ? textFields.computeIfAbsent("pdbx_number_anomalous",
                PdbxNumberAnomalous::new) : getBinaryColumn("pdbx_number_anomalous"));
    }

    /**
     * This item is the same as _reflns.pdbx_Rrim_I_all,
     * but applies to the observed Friedel pairs only.
     * @return PdbxRrimIAllAnomalous
     */
    public PdbxRrimIAllAnomalous getPdbxRrimIAllAnomalous() {
        return (PdbxRrimIAllAnomalous) (isText ? textFields.computeIfAbsent("pdbx_Rrim_I_all_anomalous",
                PdbxRrimIAllAnomalous::new) : getBinaryColumn("pdbx_Rrim_I_all_anomalous"));
    }

    /**
     * This item is the same as _reflns.pdbx_Rpim_I_all, but applies only
     * to observed Friedel pairs.
     * @return PdbxRpimIAllAnomalous
     */
    public PdbxRpimIAllAnomalous getPdbxRpimIAllAnomalous() {
        return (PdbxRpimIAllAnomalous) (isText ? textFields.computeIfAbsent("pdbx_Rpim_I_all_anomalous",
                PdbxRpimIAllAnomalous::new) : getBinaryColumn("pdbx_Rpim_I_all_anomalous"));
    }

    /**
     * This item is the same as _reflns.pdbx_Rmerge_I, but applies only
     * to observed Friedel pairs.
     * @return PdbxRmergeIAnomalous
     */
    public PdbxRmergeIAnomalous getPdbxRmergeIAnomalous() {
        return (PdbxRmergeIAnomalous) (isText ? textFields.computeIfAbsent("pdbx_Rmerge_I_anomalous",
                PdbxRmergeIAnomalous::new) : getBinaryColumn("pdbx_Rmerge_I_anomalous"));
    }
}
