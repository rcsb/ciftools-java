package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the REFLNS category record details about the
 * reflection data used to determine the ATOM_SITE data items.
 * 
 * The REFLN data items refer to individual reflections and must
 * be included in looped lists.
 * 
 * The REFLNS data items specify the parameters that apply to all
 * reflections. The REFLNS data items are not looped.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class Reflns extends DelegatingCategory {
    public Reflns(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "B_iso_Wilson_estimate":
                return getBIsoWilsonEstimate();
            case "entry_id":
                return getEntryId();
            case "data_reduction_details":
                return getDataReductionDetails();
            case "data_reduction_method":
                return getDataReductionMethod();
            case "d_resolution_high":
                return getDResolutionHigh();
            case "d_resolution_low":
                return getDResolutionLow();
            case "details":
                return getDetails();
            case "limit_h_max":
                return getLimitHMax();
            case "limit_h_min":
                return getLimitHMin();
            case "limit_k_max":
                return getLimitKMax();
            case "limit_k_min":
                return getLimitKMin();
            case "limit_l_max":
                return getLimitLMax();
            case "limit_l_min":
                return getLimitLMin();
            case "number_all":
                return getNumberAll();
            case "number_obs":
                return getNumberObs();
            case "observed_criterion":
                return getObservedCriterion();
            case "observed_criterion_F_max":
                return getObservedCriterionFMax();
            case "observed_criterion_F_min":
                return getObservedCriterionFMin();
            case "observed_criterion_I_max":
                return getObservedCriterionIMax();
            case "observed_criterion_I_min":
                return getObservedCriterionIMin();
            case "observed_criterion_sigma_F":
                return getObservedCriterionSigmaF();
            case "observed_criterion_sigma_I":
                return getObservedCriterionSigmaI();
            case "percent_possible_obs":
                return getPercentPossibleObs();
            case "R_free_details":
                return getRFreeDetails();
            case "Rmerge_F_all":
                return getRmergeFAll();
            case "Rmerge_F_obs":
                return getRmergeFObs();
            case "Friedel_coverage":
                return getFriedelCoverage();
            case "number_gt":
                return getNumberGt();
            case "threshold_expression":
                return getThresholdExpression();
            case "pdbx_redundancy":
                return getPdbxRedundancy();
            case "pdbx_netI_over_av_sigmaI":
                return getPdbxNetIOverAvSigmaI();
            case "pdbx_netI_over_sigmaI":
                return getPdbxNetIOverSigmaI();
            case "pdbx_res_netI_over_av_sigmaI_2":
                return getPdbxResNetIOverAvSigmaI2();
            case "pdbx_res_netI_over_sigmaI_2":
                return getPdbxResNetIOverSigmaI2();
            case "pdbx_chi_squared":
                return getPdbxChiSquared();
            case "pdbx_scaling_rejects":
                return getPdbxScalingRejects();
            case "pdbx_d_res_high_opt":
                return getPdbxDResHighOpt();
            case "pdbx_d_res_low_opt":
                return getPdbxDResLowOpt();
            case "pdbx_d_res_opt_method":
                return getPdbxDResOptMethod();
            case "phase_calculation_details":
                return getPhaseCalculationDetails();
            case "pdbx_Rrim_I_all":
                return getPdbxRrimIAll();
            case "pdbx_Rpim_I_all":
                return getPdbxRpimIAll();
            case "pdbx_d_opt":
                return getPdbxDOpt();
            case "pdbx_number_measured_all":
                return getPdbxNumberMeasuredAll();
            case "pdbx_diffrn_id":
                return getPdbxDiffrnId();
            case "pdbx_ordinal":
                return getPdbxOrdinal();
            case "pdbx_CC_half":
                return getPdbxCCHalf();
            case "pdbx_CC_star":
                return getPdbxCCStar();
            case "pdbx_R_split":
                return getPdbxRSplit();
            case "pdbx_redundancy_reflns_obs":
                return getPdbxRedundancyReflnsObs();
            case "pdbx_number_anomalous":
                return getPdbxNumberAnomalous();
            case "pdbx_Rrim_I_all_anomalous":
                return getPdbxRrimIAllAnomalous();
            case "pdbx_Rpim_I_all_anomalous":
                return getPdbxRpimIAllAnomalous();
            case "pdbx_Rmerge_I_anomalous":
                return getPdbxRmergeIAnomalous();
            case "pdbx_Rmerge_I_obs":
                return getPdbxRmergeIObs();
            case "pdbx_Rmerge_I_all":
                return getPdbxRmergeIAll();
            case "pdbx_Rsym_value":
                return getPdbxRsymValue();
            case "pdbx_aniso_diffraction_limit_axis_1_ortho[1]":
                return getPdbxAnisoDiffractionLimitAxis1Ortho1();
            case "pdbx_aniso_diffraction_limit_axis_1_ortho[2]":
                return getPdbxAnisoDiffractionLimitAxis1Ortho2();
            case "pdbx_aniso_diffraction_limit_axis_1_ortho[3]":
                return getPdbxAnisoDiffractionLimitAxis1Ortho3();
            case "pdbx_aniso_diffraction_limit_axis_2_ortho[1]":
                return getPdbxAnisoDiffractionLimitAxis2Ortho1();
            case "pdbx_aniso_diffraction_limit_axis_2_ortho[2]":
                return getPdbxAnisoDiffractionLimitAxis2Ortho2();
            case "pdbx_aniso_diffraction_limit_axis_2_ortho[3]":
                return getPdbxAnisoDiffractionLimitAxis2Ortho3();
            case "pdbx_aniso_diffraction_limit_axis_3_ortho[1]":
                return getPdbxAnisoDiffractionLimitAxis3Ortho1();
            case "pdbx_aniso_diffraction_limit_axis_3_ortho[2]":
                return getPdbxAnisoDiffractionLimitAxis3Ortho2();
            case "pdbx_aniso_diffraction_limit_axis_3_ortho[3]":
                return getPdbxAnisoDiffractionLimitAxis3Ortho3();
            case "pdbx_aniso_diffraction_limit_1":
                return getPdbxAnisoDiffractionLimit1();
            case "pdbx_aniso_diffraction_limit_2":
                return getPdbxAnisoDiffractionLimit2();
            case "pdbx_aniso_diffraction_limit_3":
                return getPdbxAnisoDiffractionLimit3();
            case "pdbx_aniso_B_tensor_eigenvector_1_ortho[1]":
                return getPdbxAnisoBTensorEigenvector1Ortho1();
            case "pdbx_aniso_B_tensor_eigenvector_1_ortho[2]":
                return getPdbxAnisoBTensorEigenvector1Ortho2();
            case "pdbx_aniso_B_tensor_eigenvector_1_ortho[3]":
                return getPdbxAnisoBTensorEigenvector1Ortho3();
            case "pdbx_aniso_B_tensor_eigenvector_2_ortho[1]":
                return getPdbxAnisoBTensorEigenvector2Ortho1();
            case "pdbx_aniso_B_tensor_eigenvector_2_ortho[2]":
                return getPdbxAnisoBTensorEigenvector2Ortho2();
            case "pdbx_aniso_B_tensor_eigenvector_2_ortho[3]":
                return getPdbxAnisoBTensorEigenvector2Ortho3();
            case "pdbx_aniso_B_tensor_eigenvector_3_ortho[1]":
                return getPdbxAnisoBTensorEigenvector3Ortho1();
            case "pdbx_aniso_B_tensor_eigenvector_3_ortho[2]":
                return getPdbxAnisoBTensorEigenvector3Ortho2();
            case "pdbx_aniso_B_tensor_eigenvector_3_ortho[3]":
                return getPdbxAnisoBTensorEigenvector3Ortho3();
            case "pdbx_aniso_B_tensor_eigenvalue_1":
                return getPdbxAnisoBTensorEigenvalue1();
            case "pdbx_aniso_B_tensor_eigenvalue_2":
                return getPdbxAnisoBTensorEigenvalue2();
            case "pdbx_aniso_B_tensor_eigenvalue_3":
                return getPdbxAnisoBTensorEigenvalue3();
            case "pdbx_orthogonalization_convention":
                return getPdbxOrthogonalizationConvention();
            case "pdbx_percent_possible_ellipsoidal":
                return getPdbxPercentPossibleEllipsoidal();
            case "pdbx_percent_possible_spherical":
                return getPdbxPercentPossibleSpherical();
            case "pdbx_percent_possible_ellipsoidal_anomalous":
                return getPdbxPercentPossibleEllipsoidalAnomalous();
            case "pdbx_percent_possible_spherical_anomalous":
                return getPdbxPercentPossibleSphericalAnomalous();
            case "pdbx_redundancy_anomalous":
                return getPdbxRedundancyAnomalous();
            case "pdbx_CC_half_anomalous":
                return getPdbxCCHalfAnomalous();
            case "pdbx_absDiff_over_sigma_anomalous":
                return getPdbxAbsDiffOverSigmaAnomalous();
            case "pdbx_percent_possible_anomalous":
                return getPdbxPercentPossibleAnomalous();
            case "pdbx_observed_signal_threshold":
                return getPdbxObservedSignalThreshold();
            case "pdbx_signal_type":
                return getPdbxSignalType();
            case "pdbx_signal_details":
                return getPdbxSignalDetails();
            case "pdbx_signal_software_id":
                return getPdbxSignalSoftwareId();
            case "pdbx_CC_split_method":
                return getPdbxCCSplitMethod();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The value of the overall isotropic displacement parameter
     * estimated from the slope of the Wilson plot.
     * @return FloatColumn
     */
    public FloatColumn getBIsoWilsonEstimate() {
        return delegate.getColumn("B_iso_Wilson_estimate", DelegatingFloatColumn::new);
    }

    /**
     * This data item is a pointer to _entry.id in the ENTRY category.
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return delegate.getColumn("entry_id", DelegatingStrColumn::new);
    }

    /**
     * A description of special aspects of the data-reduction
     * procedures.
     * @return StrColumn
     */
    public StrColumn getDataReductionDetails() {
        return delegate.getColumn("data_reduction_details", DelegatingStrColumn::new);
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
     * @return StrColumn
     */
    public StrColumn getDataReductionMethod() {
        return delegate.getColumn("data_reduction_method", DelegatingStrColumn::new);
    }

    /**
     * The smallest value in angstroms for the interplanar spacings
     * for the reflection data. This is called the highest resolution.
     * @return FloatColumn
     */
    public FloatColumn getDResolutionHigh() {
        return delegate.getColumn("d_resolution_high", DelegatingFloatColumn::new);
    }

    /**
     * The largest value in angstroms for the interplanar spacings
     * for the reflection data. This is called the lowest resolution.
     * @return FloatColumn
     */
    public FloatColumn getDResolutionLow() {
        return delegate.getColumn("d_resolution_low", DelegatingFloatColumn::new);
    }

    /**
     * A description of reflection data not covered by other data
     * names. This should include details of the Friedel pairs.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

    /**
     * Maximum value of the Miller index h for the reflection data. This
     * need not have the same value as _diffrn_reflns.limit_h_max.
     * @return IntColumn
     */
    public IntColumn getLimitHMax() {
        return delegate.getColumn("limit_h_max", DelegatingIntColumn::new);
    }

    /**
     * Minimum value of the Miller index h for the reflection data. This
     * need not have the same value as _diffrn_reflns.limit_h_min.
     * @return IntColumn
     */
    public IntColumn getLimitHMin() {
        return delegate.getColumn("limit_h_min", DelegatingIntColumn::new);
    }

    /**
     * Maximum value of the Miller index k for the reflection data. This
     * need not have the same value as _diffrn_reflns.limit_k_max.
     * @return IntColumn
     */
    public IntColumn getLimitKMax() {
        return delegate.getColumn("limit_k_max", DelegatingIntColumn::new);
    }

    /**
     * Minimum value of the Miller index k for the reflection data. This
     * need not have the same value as _diffrn_reflns.limit_k_min.
     * @return IntColumn
     */
    public IntColumn getLimitKMin() {
        return delegate.getColumn("limit_k_min", DelegatingIntColumn::new);
    }

    /**
     * Maximum value of the Miller index l for the reflection data. This
     * need not have the same value as _diffrn_reflns.limit_l_max.
     * @return IntColumn
     */
    public IntColumn getLimitLMax() {
        return delegate.getColumn("limit_l_max", DelegatingIntColumn::new);
    }

    /**
     * Minimum value of the Miller index l for the reflection data. This
     * need not have the same value as _diffrn_reflns.limit_l_min.
     * @return IntColumn
     */
    public IntColumn getLimitLMin() {
        return delegate.getColumn("limit_l_min", DelegatingIntColumn::new);
    }

    /**
     * The total number of reflections in the REFLN list (not the
     * DIFFRN_REFLN list). This number may contain Friedel-equivalent
     * reflections according to the nature of the structure and the
     * procedures used. The item _reflns.details describes the
     * reflection data.
     * @return IntColumn
     */
    public IntColumn getNumberAll() {
        return delegate.getColumn("number_all", DelegatingIntColumn::new);
    }

    /**
     * The number of reflections in the REFLN list (not the DIFFRN_REFLN
     * list) classified as observed (see _reflns.observed_criterion).
     * This number may contain Friedel-equivalent reflections according
     * to the nature of the structure and the procedures used.
     * @return IntColumn
     */
    public IntColumn getNumberObs() {
        return delegate.getColumn("number_obs", DelegatingIntColumn::new);
    }

    /**
     * The criterion used to classify a reflection as 'observed'. This
     * criterion is usually expressed in terms of a sigma(I) or
     * sigma(F) threshold.
     * @return StrColumn
     */
    public StrColumn getObservedCriterion() {
        return delegate.getColumn("observed_criterion", DelegatingStrColumn::new);
    }

    /**
     * The criterion used to classify a reflection as 'observed'
     * expressed as an upper limit for the value of F.
     * @return FloatColumn
     */
    public FloatColumn getObservedCriterionFMax() {
        return delegate.getColumn("observed_criterion_F_max", DelegatingFloatColumn::new);
    }

    /**
     * The criterion used to classify a reflection as 'observed'
     * expressed as a lower limit for the value of F.
     * @return FloatColumn
     */
    public FloatColumn getObservedCriterionFMin() {
        return delegate.getColumn("observed_criterion_F_min", DelegatingFloatColumn::new);
    }

    /**
     * The criterion used to classify a reflection as 'observed'
     * expressed as an upper limit for the value of I.
     * @return FloatColumn
     */
    public FloatColumn getObservedCriterionIMax() {
        return delegate.getColumn("observed_criterion_I_max", DelegatingFloatColumn::new);
    }

    /**
     * The criterion used to classify a reflection as 'observed'
     * expressed as a lower limit for the value of I.
     * @return FloatColumn
     */
    public FloatColumn getObservedCriterionIMin() {
        return delegate.getColumn("observed_criterion_I_min", DelegatingFloatColumn::new);
    }

    /**
     * The criterion used to classify a reflection as 'observed'
     * expressed as a multiple of the value of sigma(F).
     * @return FloatColumn
     */
    public FloatColumn getObservedCriterionSigmaF() {
        return delegate.getColumn("observed_criterion_sigma_F", DelegatingFloatColumn::new);
    }

    /**
     * The criterion used to classify a reflection as 'observed'
     * expressed as a multiple of the value of sigma(I).
     * @return FloatColumn
     */
    public FloatColumn getObservedCriterionSigmaI() {
        return delegate.getColumn("observed_criterion_sigma_I", DelegatingFloatColumn::new);
    }

    /**
     * The percentage of geometrically possible reflections represented
     * by reflections that satisfy the resolution limits established
     * by _reflns.d_resolution_high and _reflns.d_resolution_low and
     * the observation limit established by
     * _reflns.observed_criterion.
     * @return FloatColumn
     */
    public FloatColumn getPercentPossibleObs() {
        return delegate.getColumn("percent_possible_obs", DelegatingFloatColumn::new);
    }

    /**
     * A description of the method by which a subset of reflections was
     * selected for exclusion from refinement so as to be used in the
     * calculation of a 'free' R factor.
     * @return StrColumn
     */
    public StrColumn getRFreeDetails() {
        return delegate.getColumn("R_free_details", DelegatingStrColumn::new);
    }

    /**
     * Residual factor Rmerge for all reflections that satisfy the
     * resolution limits established by _reflns.d_resolution_high
     * and _reflns.d_resolution_low.
     * 
     * sum~i~(sum~j~|F~j~ - &lt;F&gt;|)
     * Rmerge(F) = --------------------------
     * sum~i~(sum~j~&lt;F&gt;)
     * 
     * F~j~ = the amplitude of the jth observation of reflection i
     * &lt;F&gt;  = the mean of the amplitudes of all observations of
     * reflection i
     * 
     * sum~i~ is taken over all reflections
     * sum~j~ is taken over all observations of each reflection
     * @return FloatColumn
     */
    public FloatColumn getRmergeFAll() {
        return delegate.getColumn("Rmerge_F_all", DelegatingFloatColumn::new);
    }

    /**
     * Residual factor Rmerge for reflections that satisfy the
     * resolution limits established by _reflns.d_resolution_high
     * and _reflns.d_resolution_low and the observation limit
     * established by _reflns.observed_criterion.
     * 
     * sum~i~(sum~j~|F~j~ - &lt;F&gt;|)
     * Rmerge(F) = --------------------------
     * sum~i~(sum~j~&lt;F&gt;)
     * 
     * F~j~ = the amplitude of the jth observation of reflection i
     * &lt;F&gt;  = the mean of the amplitudes of all observations of
     * reflection i
     * 
     * sum~i~ is taken over all reflections
     * sum~j~ is taken over all observations of each reflection
     * @return FloatColumn
     */
    public FloatColumn getRmergeFObs() {
        return delegate.getColumn("Rmerge_F_obs", DelegatingFloatColumn::new);
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
     * will be &lt; 1.0 because although reflections h k l and
     * -h -k -l are not equivalent when h k l indices are
     * nonzero, they are when l=0.
     * (d) For a crystal in space group Pmm2, measurements of the
     * two inequivalent octants h &gt;= 0, k &gt;=0, l lead to the
     * same value as in (c), whereas measurements of the
     * two equivalent octants h &gt;= 0, k, l &gt;= 0 will lead to
     * a zero value for _reflns.Friedel_coverage.
     * @return FloatColumn
     */
    public FloatColumn getFriedelCoverage() {
        return delegate.getColumn("Friedel_coverage", DelegatingFloatColumn::new);
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
     * @return IntColumn
     */
    public IntColumn getNumberGt() {
        return delegate.getColumn("number_gt", DelegatingIntColumn::new);
    }

    /**
     * The threshold, usually based on multiples of u(I), u(F^2^)
     * or u(F), that serves to identify significantly intense
     * reflections, the number of which is given by _reflns.number_gt.
     * These reflections are used in the calculation of
     * _refine.ls_R_factor_gt.
     * @return StrColumn
     */
    public StrColumn getThresholdExpression() {
        return delegate.getColumn("threshold_expression", DelegatingStrColumn::new);
    }

    /**
     * Overall redundancy for this data set.
     * @return FloatColumn
     */
    public FloatColumn getPdbxRedundancy() {
        return delegate.getColumn("pdbx_redundancy", DelegatingFloatColumn::new);
    }

    /**
     * The ratio of the average intensity to the average uncertainty,
     * &lt;I&gt;/&lt;sigma(I)&gt;.
     * @return FloatColumn
     */
    public FloatColumn getPdbxNetIOverAvSigmaI() {
        return delegate.getColumn("pdbx_netI_over_av_sigmaI", DelegatingFloatColumn::new);
    }

    /**
     * The mean of the ratio of the intensities to their
     * standard uncertainties, &lt;I/sigma(I)&gt;.
     * @return FloatColumn
     */
    public FloatColumn getPdbxNetIOverSigmaI() {
        return delegate.getColumn("pdbx_netI_over_sigmaI", DelegatingFloatColumn::new);
    }

    /**
     * Resolution (angstrom) for reflections with  &lt;I&gt;/&lt;sigma(I)&gt; = 2.
     * @return FloatColumn
     */
    public FloatColumn getPdbxResNetIOverAvSigmaI2() {
        return delegate.getColumn("pdbx_res_netI_over_av_sigmaI_2", DelegatingFloatColumn::new);
    }

    /**
     * Resolution (angstroms) for reflections with  &lt;I/sigma(I)&gt; = 2.
     * @return FloatColumn
     */
    public FloatColumn getPdbxResNetIOverSigmaI2() {
        return delegate.getColumn("pdbx_res_netI_over_sigmaI_2", DelegatingFloatColumn::new);
    }

    /**
     * Overall  Chi-squared statistic.
     * @return FloatColumn
     */
    public FloatColumn getPdbxChiSquared() {
        return delegate.getColumn("pdbx_chi_squared", DelegatingFloatColumn::new);
    }

    /**
     * Number of reflections rejected in scaling operations.
     * @return IntColumn
     */
    public IntColumn getPdbxScalingRejects() {
        return delegate.getColumn("pdbx_scaling_rejects", DelegatingIntColumn::new);
    }

    /**
     * The highest optical resolution for this reflection data set
     * as determined by computational method _reflns.pdbx_d_res_opt_method.
     * @return FloatColumn
     */
    public FloatColumn getPdbxDResHighOpt() {
        return delegate.getColumn("pdbx_d_res_high_opt", DelegatingFloatColumn::new);
    }

    /**
     * The lowest optical resolution for this reflection data set
     * as determined by computational method _reflns.pdbx_d_res_opt_method.
     * @return FloatColumn
     */
    public FloatColumn getPdbxDResLowOpt() {
        return delegate.getColumn("pdbx_d_res_low_opt", DelegatingFloatColumn::new);
    }

    /**
     * The computational method used to determine the optical
     * resolution limits _reflns.pdbx_d_res_high_opt and
     * _reflns.pdbx_d_res_low_opt.
     * @return StrColumn
     */
    public StrColumn getPdbxDResOptMethod() {
        return delegate.getColumn("pdbx_d_res_opt_method", DelegatingStrColumn::new);
    }

    /**
     * The value of _reflns.phase_calculation_details describes a
     * special details about calculation of phases in _refln.phase_calc.
     * @return StrColumn
     */
    public StrColumn getPhaseCalculationDetails() {
        return delegate.getColumn("phase_calculation_details", DelegatingStrColumn::new);
    }

    /**
     * The redundancy-independent merging R factor value Rrim,
     * also denoted Rmeas, for merging all intensities in this
     * data set.
     * 
     * sum~i~ [N~i~/(N~i~ - 1)]1/2^ sum~j~ | I~j~ - &lt;I~i~&gt; |
     * Rrim = ----------------------------------------------------
     * sum~i~ ( sum~j~ I~j~ )
     * 
     * I~j~   = the intensity of the jth observation of reflection i
     * &lt;I~i~&gt; = the mean of the intensities of all observations of
     * reflection i
     * N~i~   = the redundancy (the number of times reflection i
     * has been measured).
     * 
     * sum~i~ is taken over all reflections
     * sum~j~ is taken over all observations of each reflection.
     * 
     * Ref: Diederichs, K. &amp; Karplus, P. A. (1997). Nature Struct.
     * Biol. 4, 269-275.
     * Weiss, M. S. &amp; Hilgenfeld, R. (1997). J. Appl. Cryst.
     * 30, 203-205.
     * Weiss, M. S. (2001). J. Appl. Cryst. 34, 130-135.
     * @return FloatColumn
     */
    public FloatColumn getPdbxRrimIAll() {
        return delegate.getColumn("pdbx_Rrim_I_all", DelegatingFloatColumn::new);
    }

    /**
     * The precision-indicating merging R factor value Rpim,
     * for merging all intensities in this data set.
     * 
     * sum~i~ [1/(N~i~ - 1)]1/2^ sum~j~ | I~j~ - &lt;I~i~&gt; |
     * Rpim = --------------------------------------------------
     * sum~i~ ( sum~j~ I~j~ )
     * 
     * I~j~   = the intensity of the jth observation of reflection i
     * &lt;I~i~&gt; = the mean of the intensities of all observations
     * of reflection i
     * N~i~   = the redundancy (the number of times reflection i
     * has been measured).
     * 
     * sum~i~ is taken over all reflections
     * sum~j~ is taken over all observations of each reflection.
     * 
     * Ref: Diederichs, K. &amp; Karplus, P. A. (1997). Nature Struct.
     * Biol. 4, 269-275.
     * Weiss, M. S. &amp; Hilgenfeld, R. (1997). J. Appl. Cryst.
     * 30, 203-205.
     * Weiss, M. S. (2001). J. Appl. Cryst. 34, 130-135.
     * @return FloatColumn
     */
    public FloatColumn getPdbxRpimIAll() {
        return delegate.getColumn("pdbx_Rpim_I_all", DelegatingFloatColumn::new);
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
     * Ref: Vaguine, A. A., Richelle, J. &amp; Wodak, S. J. (1999).
     * Acta Cryst. D55, 191-205.
     * (see also http://www.ysbl.york.ac.uk/~alexei/sfcheck.html)
     * Weiss, M. S. (2001). J. Appl. Cryst. 34, 130-135.
     * @return FloatColumn
     */
    public FloatColumn getPdbxDOpt() {
        return delegate.getColumn("pdbx_d_opt", DelegatingFloatColumn::new);
    }

    /**
     * Total number of measured reflections.
     * @return IntColumn
     */
    public IntColumn getPdbxNumberMeasuredAll() {
        return delegate.getColumn("pdbx_number_measured_all", DelegatingIntColumn::new);
    }

    /**
     * An identifier for the diffraction data set for this set of summary statistics.
     * 
     * Multiple diffraction data sets entered as a comma separated list.
     * @return StrColumn
     */
    public StrColumn getPdbxDiffrnId() {
        return delegate.getColumn("pdbx_diffrn_id", DelegatingStrColumn::new);
    }

    /**
     * An ordinal identifier for this set of reflection statistics.
     * @return IntColumn
     */
    public IntColumn getPdbxOrdinal() {
        return delegate.getColumn("pdbx_ordinal", DelegatingIntColumn::new);
    }

    /**
     * The Pearson's correlation coefficient expressed as a decimal value
     * between the average intensities from randomly selected
     * half-datasets.
     * 
     * Ref: Karplus &amp; Diederichs (2012), Science 336, 1030-33
     * @return FloatColumn
     */
    public FloatColumn getPdbxCCHalf() {
        return delegate.getColumn("pdbx_CC_half", DelegatingFloatColumn::new);
    }

    /**
     * Estimates the value of CC_true, the true correlation coefficient between
     * the average intensities from randomly selected half-datasets.
     * 
     * CC_star = sqrt(2*CC_half/(1+CC_half)), where both CC_star and CC_half (CC1/2)
     * 
     * Ref: Karplus &amp; Diederichs (2012), Science 336, 1030-33
     * @return FloatColumn
     */
    public FloatColumn getPdbxCCStar() {
        return delegate.getColumn("pdbx_CC_star", DelegatingFloatColumn::new);
    }

    /**
     * R split measures the agreement between the sets of intensities created by merging
     * odd- and even-numbered images  from the overall data.
     * 
     * Ref: T. A. White, R. A. Kirian, A. V. Martin, A. Aquila, K. Nass, A. Barty
     * and H. N. Chapman (2012), J. Appl. Cryst. 45, 335-341
     * @return FloatColumn
     */
    public FloatColumn getPdbxRSplit() {
        return delegate.getColumn("pdbx_R_split", DelegatingFloatColumn::new);
    }

    /**
     * The redundancy in set of observed reflections.
     * @return FloatColumn
     */
    public FloatColumn getPdbxRedundancyReflnsObs() {
        return delegate.getColumn("pdbx_redundancy_reflns_obs", DelegatingFloatColumn::new);
    }

    /**
     * This item is the same as _reflns.number_obs, but applies to
     * observed Friedel pairs only.
     * @return IntColumn
     */
    public IntColumn getPdbxNumberAnomalous() {
        return delegate.getColumn("pdbx_number_anomalous", DelegatingIntColumn::new);
    }

    /**
     * This item is the same as _reflns.pdbx_Rrim_I_all,
     * but applies to the observed Friedel pairs only.
     * @return FloatColumn
     */
    public FloatColumn getPdbxRrimIAllAnomalous() {
        return delegate.getColumn("pdbx_Rrim_I_all_anomalous", DelegatingFloatColumn::new);
    }

    /**
     * This item is the same as _reflns.pdbx_Rpim_I_all, but applies only
     * to observed Friedel pairs.
     * @return FloatColumn
     */
    public FloatColumn getPdbxRpimIAllAnomalous() {
        return delegate.getColumn("pdbx_Rpim_I_all_anomalous", DelegatingFloatColumn::new);
    }

    /**
     * This item is the same as _reflns.pdbx_Rmerge_I, but applies only
     * to observed Friedel pairs.
     * @return FloatColumn
     */
    public FloatColumn getPdbxRmergeIAnomalous() {
        return delegate.getColumn("pdbx_Rmerge_I_anomalous", DelegatingFloatColumn::new);
    }

    /**
     * The R value for merging intensities satisfying the observed
     * criteria in this data set.
     * @return FloatColumn
     */
    public FloatColumn getPdbxRmergeIObs() {
        return delegate.getColumn("pdbx_Rmerge_I_obs", DelegatingFloatColumn::new);
    }

    /**
     * The R value for merging all intensities in this data set.
     * @return FloatColumn
     */
    public FloatColumn getPdbxRmergeIAll() {
        return delegate.getColumn("pdbx_Rmerge_I_all", DelegatingFloatColumn::new);
    }

    /**
     * The R sym value as a decimal number.
     * @return FloatColumn
     */
    public FloatColumn getPdbxRsymValue() {
        return delegate.getColumn("pdbx_Rsym_value", DelegatingFloatColumn::new);
    }

    /**
     * Principal axis 1 (X component) of ellipsoid fitted to the
     * diffraction cut-off surface. The applicable orthogonalization
     * convention is that specified by
     * _reflns.pdbx_orthogonalization_convention.
     * @return FloatColumn
     */
    public FloatColumn getPdbxAnisoDiffractionLimitAxis1Ortho1() {
        return delegate.getColumn("pdbx_aniso_diffraction_limit_axis_1_ortho[1]", DelegatingFloatColumn::new);
    }

    /**
     * Principal axis 1 (Y component) of ellipsoid fitted to the
     * diffraction cut-off surface. The applicable orthogonalization
     * convention is that specified by
     * _reflns.pdbx_orthogonalization_convention.
     * @return FloatColumn
     */
    public FloatColumn getPdbxAnisoDiffractionLimitAxis1Ortho2() {
        return delegate.getColumn("pdbx_aniso_diffraction_limit_axis_1_ortho[2]", DelegatingFloatColumn::new);
    }

    /**
     * Principal axis 1 (Z component) of ellipsoid fitted to the
     * diffraction cut-off surface. The applicable orthogonalization
     * convention is that specified by
     * _reflns.pdbx_orthogonalization_convention.
     * @return FloatColumn
     */
    public FloatColumn getPdbxAnisoDiffractionLimitAxis1Ortho3() {
        return delegate.getColumn("pdbx_aniso_diffraction_limit_axis_1_ortho[3]", DelegatingFloatColumn::new);
    }

    /**
     * Principal axis 2 (X component) of ellipsoid fitted to the
     * diffraction cut-off surface. The applicable orthogonalization
     * convention is that specified by
     * _reflns.pdbx_orthogonalization_convention.
     * @return FloatColumn
     */
    public FloatColumn getPdbxAnisoDiffractionLimitAxis2Ortho1() {
        return delegate.getColumn("pdbx_aniso_diffraction_limit_axis_2_ortho[1]", DelegatingFloatColumn::new);
    }

    /**
     * Principal axis 2 (Y component) of ellipsoid fitted to the
     * diffraction cut-off surface. The applicable orthogonalization
     * convention is that specified by
     * _reflns.pdbx_orthogonalization_convention.
     * @return FloatColumn
     */
    public FloatColumn getPdbxAnisoDiffractionLimitAxis2Ortho2() {
        return delegate.getColumn("pdbx_aniso_diffraction_limit_axis_2_ortho[2]", DelegatingFloatColumn::new);
    }

    /**
     * Principal axis 2 (Z component) of ellipsoid fitted to the
     * diffraction cut-off surface. The applicable orthogonalization
     * convention is that specified by
     * _reflns.pdbx_orthogonalization_convention.
     * @return FloatColumn
     */
    public FloatColumn getPdbxAnisoDiffractionLimitAxis2Ortho3() {
        return delegate.getColumn("pdbx_aniso_diffraction_limit_axis_2_ortho[3]", DelegatingFloatColumn::new);
    }

    /**
     * Principal axis 3 (X component) of ellipsoid fitted to the
     * diffraction cut-off surface. The applicable orthogonalization
     * convention is that specified by
     * _reflns.pdbx_orthogonalization_convention.
     * @return FloatColumn
     */
    public FloatColumn getPdbxAnisoDiffractionLimitAxis3Ortho1() {
        return delegate.getColumn("pdbx_aniso_diffraction_limit_axis_3_ortho[1]", DelegatingFloatColumn::new);
    }

    /**
     * Principal axis 3 (Y component) of ellipsoid fitted to the
     * diffraction cut-off surface. The applicable orthogonalization
     * convention is that specified by
     * _reflns.pdbx_orthogonalization_convention.
     * @return FloatColumn
     */
    public FloatColumn getPdbxAnisoDiffractionLimitAxis3Ortho2() {
        return delegate.getColumn("pdbx_aniso_diffraction_limit_axis_3_ortho[2]", DelegatingFloatColumn::new);
    }

    /**
     * Principal axis 3 (Z component) of ellipsoid fitted to the
     * diffraction cut-off surface. The applicable orthogonalization
     * convention is that specified by
     * _reflns.pdbx_orthogonalization_convention.
     * @return FloatColumn
     */
    public FloatColumn getPdbxAnisoDiffractionLimitAxis3Ortho3() {
        return delegate.getColumn("pdbx_aniso_diffraction_limit_axis_3_ortho[3]", DelegatingFloatColumn::new);
    }

    /**
     * Anisotropic diffraction limit along principal axis 1 (of
     * ellipsoid fitted to the diffraction cut-off surface).
     * @return FloatColumn
     */
    public FloatColumn getPdbxAnisoDiffractionLimit1() {
        return delegate.getColumn("pdbx_aniso_diffraction_limit_1", DelegatingFloatColumn::new);
    }

    /**
     * Anisotropic diffraction limit along principal axis 2 (of
     * ellipsoid fitted to the diffraction cut-off surface)
     * @return FloatColumn
     */
    public FloatColumn getPdbxAnisoDiffractionLimit2() {
        return delegate.getColumn("pdbx_aniso_diffraction_limit_2", DelegatingFloatColumn::new);
    }

    /**
     * Anisotropic diffraction limit along principal axis 3 (of
     * ellipsoid fitted to the diffraction cut-off surface)
     * @return FloatColumn
     */
    public FloatColumn getPdbxAnisoDiffractionLimit3() {
        return delegate.getColumn("pdbx_aniso_diffraction_limit_3", DelegatingFloatColumn::new);
    }

    /**
     * X component of the first eigenvector of the diffraction
     * anisotropy tensor. The applicable orthogonalization
     * convention is that specified by
     * _reflns.pdbx_orthogonalization_convention.
     * @return FloatColumn
     */
    public FloatColumn getPdbxAnisoBTensorEigenvector1Ortho1() {
        return delegate.getColumn("pdbx_aniso_B_tensor_eigenvector_1_ortho[1]", DelegatingFloatColumn::new);
    }

    /**
     * Y component of the first eigenvector of the diffraction
     * anisotropy tensor. The applicable orthogonalization
     * convention is that specified by
     * _reflns.pdbx_orthogonalization_convention.
     * @return FloatColumn
     */
    public FloatColumn getPdbxAnisoBTensorEigenvector1Ortho2() {
        return delegate.getColumn("pdbx_aniso_B_tensor_eigenvector_1_ortho[2]", DelegatingFloatColumn::new);
    }

    /**
     * Z component of the first eigenvector of the diffraction
     * anisotropy tensor. The applicable orthogonalization
     * convention is that specified by
     * _reflns.pdbx_orthogonalization_convention.
     * @return FloatColumn
     */
    public FloatColumn getPdbxAnisoBTensorEigenvector1Ortho3() {
        return delegate.getColumn("pdbx_aniso_B_tensor_eigenvector_1_ortho[3]", DelegatingFloatColumn::new);
    }

    /**
     * X component of the second eigenvector of the diffraction
     * anisotropy tensor. The applicable orthogonalization
     * convention is that specified by
     * _reflns.pdbx_orthogonalization_convention.
     * @return FloatColumn
     */
    public FloatColumn getPdbxAnisoBTensorEigenvector2Ortho1() {
        return delegate.getColumn("pdbx_aniso_B_tensor_eigenvector_2_ortho[1]", DelegatingFloatColumn::new);
    }

    /**
     * Y component of the second eigenvector of the diffraction
     * anisotropy tensor. The applicable orthogonalization
     * convention is that specified by
     * _reflns.pdbx_orthogonalization_convention.
     * @return FloatColumn
     */
    public FloatColumn getPdbxAnisoBTensorEigenvector2Ortho2() {
        return delegate.getColumn("pdbx_aniso_B_tensor_eigenvector_2_ortho[2]", DelegatingFloatColumn::new);
    }

    /**
     * Z component of the second eigenvector of the diffraction
     * anisotropy tensor. The applicable orthogonalization
     * convention is that specified by
     * _reflns.pdbx_orthogonalization_convention.
     * @return FloatColumn
     */
    public FloatColumn getPdbxAnisoBTensorEigenvector2Ortho3() {
        return delegate.getColumn("pdbx_aniso_B_tensor_eigenvector_2_ortho[3]", DelegatingFloatColumn::new);
    }

    /**
     * X component of the third eigenvector of the diffraction
     * anisotropy tensor. The applicable orthogonalization
     * convention is that specified by
     * _reflns.pdbx_orthogonalization_convention.
     * @return FloatColumn
     */
    public FloatColumn getPdbxAnisoBTensorEigenvector3Ortho1() {
        return delegate.getColumn("pdbx_aniso_B_tensor_eigenvector_3_ortho[1]", DelegatingFloatColumn::new);
    }

    /**
     * Y component of the third eigenvector of the diffraction
     * anisotropy tensor. The applicable orthogonalization
     * convention is that specified by
     * _reflns.pdbx_orthogonalization_convention.
     * @return FloatColumn
     */
    public FloatColumn getPdbxAnisoBTensorEigenvector3Ortho2() {
        return delegate.getColumn("pdbx_aniso_B_tensor_eigenvector_3_ortho[2]", DelegatingFloatColumn::new);
    }

    /**
     * Z component of the third eigenvector of the diffraction
     * anisotropy tensor. The applicable orthogonalization
     * convention is that specified by
     * _reflns.pdbx_orthogonalization_convention.
     * @return FloatColumn
     */
    public FloatColumn getPdbxAnisoBTensorEigenvector3Ortho3() {
        return delegate.getColumn("pdbx_aniso_B_tensor_eigenvector_3_ortho[3]", DelegatingFloatColumn::new);
    }

    /**
     * Eigen-B-factor along the first eigenvector of the
     * diffraction anisotropy tensor
     * @return FloatColumn
     */
    public FloatColumn getPdbxAnisoBTensorEigenvalue1() {
        return delegate.getColumn("pdbx_aniso_B_tensor_eigenvalue_1", DelegatingFloatColumn::new);
    }

    /**
     * Eigen-B-factor along the second eigenvector of the
     * diffraction anisotropy tensor
     * @return FloatColumn
     */
    public FloatColumn getPdbxAnisoBTensorEigenvalue2() {
        return delegate.getColumn("pdbx_aniso_B_tensor_eigenvalue_2", DelegatingFloatColumn::new);
    }

    /**
     * Eigen-B-factor along the third eigenvector of the
     * diffraction anisotropy tensor
     * @return FloatColumn
     */
    public FloatColumn getPdbxAnisoBTensorEigenvalue3() {
        return delegate.getColumn("pdbx_aniso_B_tensor_eigenvalue_3", DelegatingFloatColumn::new);
    }

    /**
     * Description of orthogonalization convention used. The
     * notation can make use of unit cell axes "a", "b" and "c"
     * and the reciprocal unit cell axes "astar", "bstar" and
     * "cstar". Upper case letters "X", "Y" and "Z" denote the
     * orthogonal axes, while lower case "x" stands for "cross
     * product".
     * @return StrColumn
     */
    public StrColumn getPdbxOrthogonalizationConvention() {
        return delegate.getColumn("pdbx_orthogonalization_convention", DelegatingStrColumn::new);
    }

    /**
     * Completeness (as a percentage) of symmetry-unique data
     * within the intersection of (1) a sphere (defined by the
     * diffraction limits, _reflns.d_resolution_high and
     * _reflns.d_resolution_low) and (2) the ellipsoid
     * (described by __reflns.pdbx_aniso_diffraction_limit_*
     * items), relative to all possible symmetry-unique
     * reflections within that intersection.
     * @return FloatColumn
     */
    public FloatColumn getPdbxPercentPossibleEllipsoidal() {
        return delegate.getColumn("pdbx_percent_possible_ellipsoidal", DelegatingFloatColumn::new);
    }

    /**
     * Completeness (as a percentage) of symmetry-unique data
     * within the sphere defined by the diffraction limits
     * (_reflns.d_resolution_high and
     * _reflns.d_resolution_low) relative to all possible
     * symmetry-unique reflections within that sphere.
     * 
     * In the absence of an anisotropy description this is
     * identical to _reflns.percent_possible_obs.
     * @return FloatColumn
     */
    public FloatColumn getPdbxPercentPossibleSpherical() {
        return delegate.getColumn("pdbx_percent_possible_spherical", DelegatingFloatColumn::new);
    }

    /**
     * Completeness (as a percentage) of symmetry-unique
     * anomalous difference data within the intersection of
     * (1) a sphere (defined by the diffraction limits,
     * _reflns.d_resolution_high and _reflns.d_resolution_low)
     * and (2) the ellipsoid (described by
     * __reflns.pdbx_aniso_diffraction_limit_* items),
     * relative to all possible symmetry-unique anomalous
     * difference data within that intersection.
     * @return FloatColumn
     */
    public FloatColumn getPdbxPercentPossibleEllipsoidalAnomalous() {
        return delegate.getColumn("pdbx_percent_possible_ellipsoidal_anomalous", DelegatingFloatColumn::new);
    }

    /**
     * Completeness (as a percentage) of symmetry-unique
     * anomalous difference data within the sphere defined by
     * the diffraction limits (_reflns.d_resolution_high and
     * _reflns.d_resolution_low) relative to all possible
     * symmetry-unique anomalous difference data within that
     * sphere.
     * 
     * In the absence of an anisotropy description this is
     * identical to _reflns.pdbx_percent_possible_anomalous.
     * @return FloatColumn
     */
    public FloatColumn getPdbxPercentPossibleSphericalAnomalous() {
        return delegate.getColumn("pdbx_percent_possible_spherical_anomalous", DelegatingFloatColumn::new);
    }

    /**
     * The overall redundancy of anomalous difference data
     * within the sphere defined by the diffraction limits
     * (_reflns.d_resolution_high and
     * _reflns.d_resolution_low), i.e. data for which
     * intensities for both instances of a Friedel pair are
     * available for an acentric reflection.
     * @return FloatColumn
     */
    public FloatColumn getPdbxRedundancyAnomalous() {
        return delegate.getColumn("pdbx_redundancy_anomalous", DelegatingFloatColumn::new);
    }

    /**
     * The overall correlation coefficient between two randomly
     * chosen half-sets of anomalous intensity differences,
     * I(+)-I(-) for anomalous data within the sphere defined
     * by the diffraction limits (_reflns.d_resolution_high and
     * _reflns.d_resolution_low), i.e. data for which
     * intensities for both instances of a Friedel pair are
     * available for an acentric reflection.
     * @return FloatColumn
     */
    public FloatColumn getPdbxCCHalfAnomalous() {
        return delegate.getColumn("pdbx_CC_half_anomalous", DelegatingFloatColumn::new);
    }

    /**
     * The overall mean ratio of absolute anomalous intensity
     * differences to their standard deviation within the
     * sphere defined by the diffraction limits
     * (_reflns.d_resolution_high and
     * _reflns.d_resolution_low) and using data for which
     * intensities for both instances of a Friedel pair are
     * available for an acentric reflection.
     * 
     * |Dano|
     * -------------
     * sigma(Dano)
     * 
     * with
     * 
     * Dano        = I(+) - I(-)
     * sigma(Dano) = sqrt( sigma(I(+))^2 + sigma(I(-))^2 )
     * @return FloatColumn
     */
    public FloatColumn getPdbxAbsDiffOverSigmaAnomalous() {
        return delegate.getColumn("pdbx_absDiff_over_sigma_anomalous", DelegatingFloatColumn::new);
    }

    /**
     * Completeness (as a percentage) of symmetry-unique
     * anomalous difference data within the sphere defined by
     * the diffraction limits (_reflns.d_resolution_high and
     * _reflns.d_resolution_low) relative to all possible
     * symmetry-unique anomalous difference data within that
     * sphere.
     * @return FloatColumn
     */
    public FloatColumn getPdbxPercentPossibleAnomalous() {
        return delegate.getColumn("pdbx_percent_possible_anomalous", DelegatingFloatColumn::new);
    }

    /**
     * The threshold value for _refln.pdbx_signal as used to
     * define the status of an individual reflection according
     * to the description in _refln.pdbx_signal_status.
     * @return FloatColumn
     */
    public FloatColumn getPdbxObservedSignalThreshold() {
        return delegate.getColumn("pdbx_observed_signal_threshold", DelegatingFloatColumn::new);
    }

    /**
     * Type of signal used for
     * _reflns.pdbx_observed_signal_threshold and _refln.pdbx_signal
     * 
     * In the enumeration details:
     * 
     * Imean is the inverse-variance weighted mean intensity of all
     * measurements for a given symmetry-unique reflection
     * 
     * Ihalf is the inverse-variance weighted mean intensity of a
     * random half-selection of all measurements for a
     * given symmetry-unique reflection
     * @return StrColumn
     */
    public StrColumn getPdbxSignalType() {
        return delegate.getColumn("pdbx_signal_type", DelegatingStrColumn::new);
    }

    /**
     * Further details about the calculation of the values
     * assigned to _refln.pdbx_signal
     * @return StrColumn
     */
    public StrColumn getPdbxSignalDetails() {
        return delegate.getColumn("pdbx_signal_details", DelegatingStrColumn::new);
    }

    /**
     * The software used to calculate the values of _refln.pdbx_signal
     * @return StrColumn
     */
    public StrColumn getPdbxSignalSoftwareId() {
        return delegate.getColumn("pdbx_signal_software_id", DelegatingStrColumn::new);
    }

    /**
     * Method for selecting half datasets used in computing Rsplit,
     * CC1/2 and CCstar.
     * 
     * The following enumerated values are used:
     * 
     * by_observation: unmerged reflection intensities are randomly
     * divided into two half-sets of nearly equal size. As recommended
     * in Karplus PA, Diederichs K. Linking crystallographic model and
     * data quality. Science. 2012;336(6084):1030-1033.
     * 
     * by_lattice: often used in serial crystallography, crystals are
     * pre-sorted into two half datasets of nearly equal size (such as
     * by odd vs. even crystal number).
     * @return StrColumn
     */
    public StrColumn getPdbxCCSplitMethod() {
        return delegate.getColumn("pdbx_CC_split_method", DelegatingStrColumn::new);
    }

}