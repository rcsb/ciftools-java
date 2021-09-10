package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the category record various overall metrics
 * calculated by DCC and various wrapped programs (such as Xtriage,
 * pointless, REFMAC ...).
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxDccDensity extends DelegatingCategory {
    public PdbxDccDensity(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "DCC_version":
                return getDCCVersion();
            case "pdbid":
                return getPdbid();
            case "pdbtype":
                return getPdbtype();
            case "unit_cell":
                return getUnitCell();
            case "space_group_name_H-M":
                return getSpaceGroupNameH_M();
            case "space_group_pointless":
                return getSpaceGroupPointless();
            case "ls_d_res_high":
                return getLsDResHigh();
            case "ls_d_res_high_sf":
                return getLsDResHighSf();
            case "ls_d_res_low_sf":
                return getLsDResLowSf();
            case "R_value_R_work":
                return getRValueRWork();
            case "R_value_R_free":
                return getRValueRFree();
            case "working_set_count":
                return getWorkingSetCount();
            case "free_set_count":
                return getFreeSetCount();
            case "occupancy_min":
                return getOccupancyMin();
            case "occupancy_max":
                return getOccupancyMax();
            case "occupancy_mean":
                return getOccupancyMean();
            case "Biso_min":
                return getBisoMin();
            case "Biso_max":
                return getBisoMax();
            case "Biso_mean":
                return getBisoMean();
            case "B_wilson":
                return getBWilson();
            case "B_wilson_scale":
                return getBWilsonScale();
            case "mean_I2_over_mean_I_square":
                return getMeanI2OverMeanISquare();
            case "mean_F_square_over_mean_F2":
                return getMeanFSquareOverMeanF2();
            case "mean_E2_1_abs":
                return getMeanE21Abs();
            case "Padilla-Yeates_L_mean":
                return getPadilla_YeatesLMean();
            case "Padilla-Yeates_L2_mean":
                return getPadilla_YeatesL2Mean();
            case "Padilla-Yeates_L2_mean_pointless":
                return getPadilla_YeatesL2MeanPointless();
            case "Z_score_L_test":
                return getZScoreLTest();
            case "twin_type":
                return getTwinType();
            case "twin_operator_xtriage":
                return getTwinOperatorXtriage();
            case "twin_fraction_xtriage":
                return getTwinFractionXtriage();
            case "twin_Rfactor":
                return getTwinRfactor();
            case "I_over_sigI_resh":
                return getIOverSigIResh();
            case "I_over_sigI_diff":
                return getIOverSigIDiff();
            case "I_over_sigI_mean":
                return getIOverSigIMean();
            case "ice_ring":
                return getIceRing();
            case "anisotropy":
                return getAnisotropy();
            case "Z-score":
                return getZ_score();
            case "prob_peak_value":
                return getProbPeakValue();
            case "translational_pseudo_symmetry":
                return getTranslationalPseudoSymmetry();
            case "wavelength":
                return getWavelength();
            case "B_solvent":
                return getBSolvent();
            case "K_solvent":
                return getKSolvent();
            case "TLS_refinement_reported":
                return getTLSRefinementReported();
            case "partial_B_value_correction_attempted":
                return getPartialBValueCorrectionAttempted();
            case "partial_B_value_correction_success":
                return getPartialBValueCorrectionSuccess();
            case "reflection_status_archived":
                return getReflectionStatusArchived();
            case "reflection_status_used":
                return getReflectionStatusUsed();
            case "iso_B_value_type":
                return getIsoBValueType();
            case "reflns_twin":
                return getReflnsTwin();
            case "twin_by_xtriage":
                return getTwinByXtriage();
            case "twin_operator":
                return getTwinOperator();
            case "twin_fraction":
                return getTwinFraction();
            case "tls_group_number":
                return getTlsGroupNumber();
            case "ncs_group_number":
                return getNcsGroupNumber();
            case "mtrix_number":
                return getMtrixNumber();
            case "Matthew_coeff":
                return getMatthewCoeff();
            case "solvent_content":
                return getSolventContent();
            case "Cruickshank_dpi_xyz":
                return getCruickshankDpiXyz();
            case "dpi_free_R":
                return getDpiFreeR();
            case "fom":
                return getFom();
            case "correlation_overall":
                return getCorrelationOverall();
            case "real_space_R_overall":
                return getRealSpaceROverall();
            case "mFo-DFc-3sigma_positive":
                return getMFo_DFc_3sigmaPositive();
            case "mFo-DFc-6sigma_positive":
                return getMFo_DFc_6sigmaPositive();
            case "mFo-DFc-3sigma_negative":
                return getMFo_DFc_3sigmaNegative();
            case "mFo-DFc-6sigma_negative":
                return getMFo_DFc_6sigmaNegative();
            case "Bmean-Bwilson":
                return getBmean_Bwilson();
            case "Rfree-Rwork":
                return getRfree_Rwork();
            case "error":
                return getError();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The version of the DCC program.
     * @return StrColumn
     */
    public StrColumn getDCCVersion() {
        return delegate.getColumn("DCC_version", DelegatingStrColumn::new);
    }

    /**
     * The PDB id code.
     * @return StrColumn
     */
    public StrColumn getPdbid() {
        return delegate.getColumn("pdbid", DelegatingStrColumn::new);
    }

    /**
     * The keywords of the structure (taken from
     * _struct_keywords.pdbx_keywords).
     * @return StrColumn
     */
    public StrColumn getPdbtype() {
        return delegate.getColumn("pdbtype", DelegatingStrColumn::new);
    }

    /**
     * The unit cell parameters (a b c alpha beta gamma) separated
     * by a space.
     * @return StrColumn
     */
    public StrColumn getUnitCell() {
        return delegate.getColumn("unit_cell", DelegatingStrColumn::new);
    }

    /**
     * Hermann-Mauguin space-group symbol reported in the model file.
     * @return StrColumn
     */
    public StrColumn getSpaceGroupNameH_M() {
        return delegate.getColumn("space_group_name_H-M", DelegatingStrColumn::new);
    }

    /**
     * Hermann-Mauguin space-group symbol calculated by the POINTLESS
     * program using the structure factor file.
     * @return StrColumn
     */
    public StrColumn getSpaceGroupPointless() {
        return delegate.getColumn("space_group_pointless", DelegatingStrColumn::new);
    }

    /**
     * The highest resolution limit reported in the model file.
     * @return FloatColumn
     */
    public FloatColumn getLsDResHigh() {
        return delegate.getColumn("ls_d_res_high", DelegatingFloatColumn::new);
    }

    /**
     * The highest resolution limit calculated from the structure
     * factor file.
     * @return FloatColumn
     */
    public FloatColumn getLsDResHighSf() {
        return delegate.getColumn("ls_d_res_high_sf", DelegatingFloatColumn::new);
    }

    /**
     * The lowest resolution limit calculated from the structure
     * factor file.
     * @return FloatColumn
     */
    public FloatColumn getLsDResLowSf() {
        return delegate.getColumn("ls_d_res_low_sf", DelegatingFloatColumn::new);
    }

    /**
     * The Rwork reported in the model file.
     * @return FloatColumn
     */
    public FloatColumn getRValueRWork() {
        return delegate.getColumn("R_value_R_work", DelegatingFloatColumn::new);
    }

    /**
     * The Rfree reported in the model file.
     * @return FloatColumn
     */
    public FloatColumn getRValueRFree() {
        return delegate.getColumn("R_value_R_free", DelegatingFloatColumn::new);
    }

    /**
     * The number of unique reflections for refinement (working set)
     * reported in the model file.
     * @return IntColumn
     */
    public IntColumn getWorkingSetCount() {
        return delegate.getColumn("working_set_count", DelegatingIntColumn::new);
    }

    /**
     * The number of unique reflections for calculating Rfree
     * (testing set) reported in the model file.
     * @return IntColumn
     */
    public IntColumn getFreeSetCount() {
        return delegate.getColumn("free_set_count", DelegatingIntColumn::new);
    }

    /**
     * The minimum occupancy reported in the model file.
     * @return FloatColumn
     */
    public FloatColumn getOccupancyMin() {
        return delegate.getColumn("occupancy_min", DelegatingFloatColumn::new);
    }

    /**
     * The maximum occupancy reported in the model file.
     * @return FloatColumn
     */
    public FloatColumn getOccupancyMax() {
        return delegate.getColumn("occupancy_max", DelegatingFloatColumn::new);
    }

    /**
     * The averaged occupancy reported in the model file.
     * @return FloatColumn
     */
    public FloatColumn getOccupancyMean() {
        return delegate.getColumn("occupancy_mean", DelegatingFloatColumn::new);
    }

    /**
     * The minimum isotropic B factor reported in the model file.
     * @return FloatColumn
     */
    public FloatColumn getBisoMin() {
        return delegate.getColumn("Biso_min", DelegatingFloatColumn::new);
    }

    /**
     * The maximum isotropic B factor reported in the model file.
     * @return FloatColumn
     */
    public FloatColumn getBisoMax() {
        return delegate.getColumn("Biso_max", DelegatingFloatColumn::new);
    }

    /**
     * The occupancy weighted mean isotropic B factor reported in the
     * model file.
     * @return FloatColumn
     */
    public FloatColumn getBisoMean() {
        return delegate.getColumn("Biso_mean", DelegatingFloatColumn::new);
    }

    /**
     * The estimated B factor from the structure factor file by the
     * Wilson plot (from Xtriage).
     * @return FloatColumn
     */
    public FloatColumn getBWilson() {
        return delegate.getColumn("B_wilson", DelegatingFloatColumn::new);
    }

    /**
     * The scale factor for calculating the B factor by the Wilson plot
     * (from Xtriage).
     * @return FloatColumn
     */
    public FloatColumn getBWilsonScale() {
        return delegate.getColumn("B_wilson_scale", DelegatingFloatColumn::new);
    }

    /**
     * Value of &lt;I^2&gt;/&lt;I&gt;^2 calculated by Xtriage using acentric
     * reflections.(untwinned: 2.000; perfect twin 1.500).
     * @return FloatColumn
     */
    public FloatColumn getMeanI2OverMeanISquare() {
        return delegate.getColumn("mean_I2_over_mean_I_square", DelegatingFloatColumn::new);
    }

    /**
     * Value of &lt;F&gt;^2/&lt;F^2&gt; calculated by Xtriage using acentric
     * reflections.(untwinned: 0.785; perfect twin 0.885).
     * @return FloatColumn
     */
    public FloatColumn getMeanFSquareOverMeanF2() {
        return delegate.getColumn("mean_F_square_over_mean_F2", DelegatingFloatColumn::new);
    }

    /**
     * Value of &lt;|E^2 - 1|&gt; calculated by Xtriage using acentric
     * reflections.(untwinned: 0.736; perfect twin 0.541).
     * @return FloatColumn
     */
    public FloatColumn getMeanE21Abs() {
        return delegate.getColumn("mean_E2_1_abs", DelegatingFloatColumn::new);
    }

    /**
     * Value of &lt;|L|&gt; calculated by Xtriage using acentric reflections.
     * (untwinned: 0.500; perfect twin: 0.375).
     * @return FloatColumn
     */
    public FloatColumn getPadilla_YeatesLMean() {
        return delegate.getColumn("Padilla-Yeates_L_mean", DelegatingFloatColumn::new);
    }

    /**
     * Value of &lt;L^2&gt; calculated by Xtriage using acentric reflections.
     * (untwinned: 0.333; perfect twin: 0.200).
     * @return FloatColumn
     */
    public FloatColumn getPadilla_YeatesL2Mean() {
        return delegate.getColumn("Padilla-Yeates_L2_mean", DelegatingFloatColumn::new);
    }

    /**
     * Value of &lt;L^2&gt; calculated by Pointless using acentric reflections.
     * (untwinned: 0.333; perfect twin: 0.200).
     * @return FloatColumn
     */
    public FloatColumn getPadilla_YeatesL2MeanPointless() {
        return delegate.getColumn("Padilla-Yeates_L2_mean_pointless", DelegatingFloatColumn::new);
    }

    /**
     * Multivariate Z score for the L-test calculated by Xtriage using
     * acentric reflections. It is a quality measure of the given spread
     * in intensities. Good to reasonable data are expected to have a
     * Z score lower than 3.5.
     * @return FloatColumn
     */
    public FloatColumn getZScoreLTest() {
        return delegate.getColumn("Z_score_L_test", DelegatingFloatColumn::new);
    }

    /**
     * Type of twin (merohedral,Pseudo-merohedral or non-merohedral)
     * determined by Xtriage.
     * @return StrColumn
     */
    public StrColumn getTwinType() {
        return delegate.getColumn("twin_type", DelegatingStrColumn::new);
    }

    /**
     * A list of the twin operators determined by Xtriage.
     * @return StrColumn
     */
    public StrColumn getTwinOperatorXtriage() {
        return delegate.getColumn("twin_operator_xtriage", DelegatingStrColumn::new);
    }

    /**
     * The twin fraction determined by Xtriage.
     * @return FloatColumn
     */
    public FloatColumn getTwinFractionXtriage() {
        return delegate.getColumn("twin_fraction_xtriage", DelegatingFloatColumn::new);
    }

    /**
     * The Rfactor calculated by Xtriage using the twin operator related
     * data. (Smaller values indicate twins).
     * @return FloatColumn
     */
    public FloatColumn getTwinRfactor() {
        return delegate.getColumn("twin_Rfactor", DelegatingFloatColumn::new);
    }

    /**
     * The &lt;I/SigmaI&gt; at the highest resolution bin calculated by Xtriage.
     * @return FloatColumn
     */
    public FloatColumn getIOverSigIResh() {
        return delegate.getColumn("I_over_sigI_resh", DelegatingFloatColumn::new);
    }

    /**
     * The difference of the &lt;I/SigmaI&gt; in the last two points of the
     * plot of &lt;I/SigmaI&gt; vs resolution (expected to be negative).
     * @return FloatColumn
     */
    public FloatColumn getIOverSigIDiff() {
        return delegate.getColumn("I_over_sigI_diff", DelegatingFloatColumn::new);
    }

    /**
     * The overall mean value of &lt;I/SigmaI&gt; for the reflections.
     * @return FloatColumn
     */
    public FloatColumn getIOverSigIMean() {
        return delegate.getColumn("I_over_sigI_mean", DelegatingFloatColumn::new);
    }

    /**
     * Boolean whether ice ring exists (Y) or not (N) as determined
     * by Xtriage.
     * @return StrColumn
     */
    public StrColumn getIceRing() {
        return delegate.getColumn("ice_ring", DelegatingStrColumn::new);
    }

    /**
     * The anisotropy ( [MaxAnisoB-MinAnisoB]/[MaxAnisoB] ) calculated
     * by Xtriage.
     * @return FloatColumn
     */
    public FloatColumn getAnisotropy() {
        return delegate.getColumn("anisotropy", DelegatingFloatColumn::new);
    }

    /**
     * Z-scores are computed (by Xtriage) on the basis of a Bernoulli
     * model assuming independence of weak reflections with respect to
     * anisotropy.
     * @return FloatColumn
     */
    public FloatColumn getZ_score() {
        return delegate.getColumn("Z-score", DelegatingFloatColumn::new);
    }

    /**
     * The probability to tell the existence of translational pseudo
     * symmetry. p_values smaller than 0.05 (1e-3) might indicate weak
     * (strong) translational pseudo symmetry (by Xtriage).
     * @return FloatColumn
     */
    public FloatColumn getProbPeakValue() {
        return delegate.getColumn("prob_peak_value", DelegatingFloatColumn::new);
    }

    /**
     * Boolean whether translational pseudo symmetry exist (Y) or
     * not (N) as determined by Xtriage.
     * @return StrColumn
     */
    public StrColumn getTranslationalPseudoSymmetry() {
        return delegate.getColumn("translational_pseudo_symmetry", DelegatingStrColumn::new);
    }

    /**
     * The wavelength reported from the model file.
     * @return FloatColumn
     */
    public FloatColumn getWavelength() {
        return delegate.getColumn("wavelength", DelegatingFloatColumn::new);
    }

    /**
     * One of the scale factors used in the bulk solvent correction
     * (from REFMAC).
     * @return FloatColumn
     */
    public FloatColumn getBSolvent() {
        return delegate.getColumn("B_solvent", DelegatingFloatColumn::new);
    }

    /**
     * One of the scale factors used in the bulk solvent correction
     * (from REFMAC).
     * @return FloatColumn
     */
    public FloatColumn getKSolvent() {
        return delegate.getColumn("K_solvent", DelegatingFloatColumn::new);
    }

    /**
     * Whether TLS was used in refinement. Y for yes, and N for no.
     * @return StrColumn
     */
    public StrColumn getTLSRefinementReported() {
        return delegate.getColumn("TLS_refinement_reported", DelegatingStrColumn::new);
    }

    /**
     * Whether attempt to convert the partial to full B factors before
     * validation.
     * @return StrColumn
     */
    public StrColumn getPartialBValueCorrectionAttempted() {
        return delegate.getColumn("partial_B_value_correction_attempted", DelegatingStrColumn::new);
    }

    /**
     * Whether the conversion of partial B to full B factor is
     * successful (Y) or not (N).
     * @return StrColumn
     */
    public StrColumn getPartialBValueCorrectionSuccess() {
        return delegate.getColumn("partial_B_value_correction_success", DelegatingStrColumn::new);
    }

    /**
     * Whether the status is of reflection is archived (Y) or not (N).
     * @return StrColumn
     */
    public StrColumn getReflectionStatusArchived() {
        return delegate.getColumn("reflection_status_archived", DelegatingStrColumn::new);
    }

    /**
     * Whether the status of the reflection is used (Y) or not (N).
     * @return StrColumn
     */
    public StrColumn getReflectionStatusUsed() {
        return delegate.getColumn("reflection_status_used", DelegatingStrColumn::new);
    }

    /**
     * The type of B factors (partial or full) for the residue.
     * @return StrColumn
     */
    public StrColumn getIsoBValueType() {
        return delegate.getColumn("iso_B_value_type", DelegatingStrColumn::new);
    }

    /**
     * Boolean (Y/N) whether the twin is reported.
     * @return StrColumn
     */
    public StrColumn getReflnsTwin() {
        return delegate.getColumn("reflns_twin", DelegatingStrColumn::new);
    }

    /**
     * Boolean (Y/N) whether twin is detected by Xtriage.
     * @return StrColumn
     */
    public StrColumn getTwinByXtriage() {
        return delegate.getColumn("twin_by_xtriage", DelegatingStrColumn::new);
    }

    /**
     * Twin operators determined by REFMAC.
     * @return StrColumn
     */
    public StrColumn getTwinOperator() {
        return delegate.getColumn("twin_operator", DelegatingStrColumn::new);
    }

    /**
     * Twin fractions determined by REFMAC.
     * @return StrColumn
     */
    public StrColumn getTwinFraction() {
        return delegate.getColumn("twin_fraction", DelegatingStrColumn::new);
    }

    /**
     * Number of TLS groups used in refinement.
     * @return IntColumn
     */
    public IntColumn getTlsGroupNumber() {
        return delegate.getColumn("tls_group_number", DelegatingIntColumn::new);
    }

    /**
     * Number of NCS groups used in refinement.
     * @return IntColumn
     */
    public IntColumn getNcsGroupNumber() {
        return delegate.getColumn("ncs_group_number", DelegatingIntColumn::new);
    }

    /**
     * Number of matrix for the NCS groups used in refinement.
     * @return IntColumn
     */
    public IntColumn getMtrixNumber() {
        return delegate.getColumn("mtrix_number", DelegatingIntColumn::new);
    }

    /**
     * The Matthew coefficient.
     * @return FloatColumn
     */
    public FloatColumn getMatthewCoeff() {
        return delegate.getColumn("Matthew_coeff", DelegatingFloatColumn::new);
    }

    /**
     * The solvent content.
     * @return FloatColumn
     */
    public FloatColumn getSolventContent() {
        return delegate.getColumn("solvent_content", DelegatingFloatColumn::new);
    }

    /**
     * The DPI on the model determined by REFMAC.
     * @return FloatColumn
     */
    public FloatColumn getCruickshankDpiXyz() {
        return delegate.getColumn("Cruickshank_dpi_xyz", DelegatingFloatColumn::new);
    }

    /**
     * The DPI calculated based on the free set, determined by REFMAC.
     * @return FloatColumn
     */
    public FloatColumn getDpiFreeR() {
        return delegate.getColumn("dpi_free_R", DelegatingFloatColumn::new);
    }

    /**
     * The mean figure of merit after refinement.
     * @return FloatColumn
     */
    public FloatColumn getFom() {
        return delegate.getColumn("fom", DelegatingFloatColumn::new);
    }

    /**
     * The overall electron density correlation coefficient.
     * @return FloatColumn
     */
    public FloatColumn getCorrelationOverall() {
        return delegate.getColumn("correlation_overall", DelegatingFloatColumn::new);
    }

    /**
     * The overall real space R factor.
     * @return FloatColumn
     */
    public FloatColumn getRealSpaceROverall() {
        return delegate.getColumn("real_space_R_overall", DelegatingFloatColumn::new);
    }

    /**
     * The number of electron density positive peaks larger than 3 sigma.
     * @return IntColumn
     */
    public IntColumn getMFo_DFc_3sigmaPositive() {
        return delegate.getColumn("mFo-DFc-3sigma_positive", DelegatingIntColumn::new);
    }

    /**
     * The number of electron density positive peaks larger than 6 sigma.
     * @return IntColumn
     */
    public IntColumn getMFo_DFc_6sigmaPositive() {
        return delegate.getColumn("mFo-DFc-6sigma_positive", DelegatingIntColumn::new);
    }

    /**
     * The number of electron density negative peaks less than 3 sigma.
     * @return IntColumn
     */
    public IntColumn getMFo_DFc_3sigmaNegative() {
        return delegate.getColumn("mFo-DFc-3sigma_negative", DelegatingIntColumn::new);
    }

    /**
     * The number of electron density negative peaks less than 6 sigma.
     * @return IntColumn
     */
    public IntColumn getMFo_DFc_6sigmaNegative() {
        return delegate.getColumn("mFo-DFc-6sigma_negative", DelegatingIntColumn::new);
    }

    /**
     * The difference between the isotropic B factor and the Bfators
     * from Wilson plot.
     * @return FloatColumn
     */
    public FloatColumn getBmean_Bwilson() {
        return delegate.getColumn("Bmean-Bwilson", DelegatingFloatColumn::new);
    }

    /**
     * The difference between reported Rfree and reported Rwork.
     * @return FloatColumn
     */
    public FloatColumn getRfree_Rwork() {
        return delegate.getColumn("Rfree-Rwork", DelegatingFloatColumn::new);
    }

    /**
     * Details of any error or warning messages.
     * @return StrColumn
     */
    public StrColumn getError() {
        return delegate.getColumn("error", DelegatingStrColumn::new);
    }

}