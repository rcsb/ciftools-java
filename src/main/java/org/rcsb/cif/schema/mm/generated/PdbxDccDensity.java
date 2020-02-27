package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the category record various overall metrics
 * calculated by DCC and various wrapped programs (such as Xtriage,
 * pointless, REFMAC ...).
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class PdbxDccDensity extends BaseCategory {
    public PdbxDccDensity(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxDccDensity(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxDccDensity(String name) {
        super(name);
    }

    /**
     * The version of the DCC program.
     * @return StrColumn
     */
    public StrColumn getDCCVersion() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("DCC_version", StrColumn::new) :
                getBinaryColumn("DCC_version"));
    }

    /**
     * The PDB id code.
     * @return StrColumn
     */
    public StrColumn getPdbid() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbid", StrColumn::new) :
                getBinaryColumn("pdbid"));
    }

    /**
     * The keywords of the structure (taken from
     * _struct_keywords.pdbx_keywords).
     * @return StrColumn
     */
    public StrColumn getPdbtype() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbtype", StrColumn::new) :
                getBinaryColumn("pdbtype"));
    }

    /**
     * The unit cell parameters (a b c alpha beta gamma) separated
     * by a space.
     * @return StrColumn
     */
    public StrColumn getUnitCell() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("unit_cell", StrColumn::new) :
                getBinaryColumn("unit_cell"));
    }

    /**
     * Hermann-Mauguin space-group symbol reported in the model file.
     * @return StrColumn
     */
    public StrColumn getSpaceGroupNameH_M() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("space_group_name_H-M", StrColumn::new) :
                getBinaryColumn("space_group_name_H-M"));
    }

    /**
     * Hermann-Mauguin space-group symbol calculated by the POINTLESS
     * program using the structure factor file.
     * @return StrColumn
     */
    public StrColumn getSpaceGroupPointless() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("space_group_pointless", StrColumn::new) :
                getBinaryColumn("space_group_pointless"));
    }

    /**
     * The highest resolution limit reported in the model file.
     * @return FloatColumn
     */
    public FloatColumn getLsDResHigh() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("ls_d_res_high", FloatColumn::new) :
                getBinaryColumn("ls_d_res_high"));
    }

    /**
     * The highest resolution limit calculated from the structure
     * factor file.
     * @return FloatColumn
     */
    public FloatColumn getLsDResHighSf() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("ls_d_res_high_sf", FloatColumn::new) :
                getBinaryColumn("ls_d_res_high_sf"));
    }

    /**
     * The lowest resolution limit calculated from the structure
     * factor file.
     * @return FloatColumn
     */
    public FloatColumn getLsDResLowSf() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("ls_d_res_low_sf", FloatColumn::new) :
                getBinaryColumn("ls_d_res_low_sf"));
    }

    /**
     * The Rwork reported in the model file.
     * @return FloatColumn
     */
    public FloatColumn getRValueRWork() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("R_value_R_work", FloatColumn::new) :
                getBinaryColumn("R_value_R_work"));
    }

    /**
     * The Rfree reported in the model file.
     * @return FloatColumn
     */
    public FloatColumn getRValueRFree() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("R_value_R_free", FloatColumn::new) :
                getBinaryColumn("R_value_R_free"));
    }

    /**
     * The number of unique reflections for refinement (working set)
     * reported in the model file.
     * @return IntColumn
     */
    public IntColumn getWorkingSetCount() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("working_set_count", IntColumn::new) :
                getBinaryColumn("working_set_count"));
    }

    /**
     * The number of unique reflections for calculating Rfree
     * (testing set) reported in the model file.
     * @return IntColumn
     */
    public IntColumn getFreeSetCount() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("free_set_count", IntColumn::new) :
                getBinaryColumn("free_set_count"));
    }

    /**
     * The minimum occupancy reported in the model file.
     * @return FloatColumn
     */
    public FloatColumn getOccupancyMin() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("occupancy_min", FloatColumn::new) :
                getBinaryColumn("occupancy_min"));
    }

    /**
     * The maximum occupancy reported in the model file.
     * @return FloatColumn
     */
    public FloatColumn getOccupancyMax() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("occupancy_max", FloatColumn::new) :
                getBinaryColumn("occupancy_max"));
    }

    /**
     * The averaged occupancy reported in the model file.
     * @return FloatColumn
     */
    public FloatColumn getOccupancyMean() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("occupancy_mean", FloatColumn::new) :
                getBinaryColumn("occupancy_mean"));
    }

    /**
     * The minimum isotropic B factor reported in the model file.
     * @return FloatColumn
     */
    public FloatColumn getBisoMin() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("Biso_min", FloatColumn::new) :
                getBinaryColumn("Biso_min"));
    }

    /**
     * The maximum isotropic B factor reported in the model file.
     * @return FloatColumn
     */
    public FloatColumn getBisoMax() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("Biso_max", FloatColumn::new) :
                getBinaryColumn("Biso_max"));
    }

    /**
     * The occupancy weighted mean isotropic B factor reported in the
     * model file.
     * @return FloatColumn
     */
    public FloatColumn getBisoMean() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("Biso_mean", FloatColumn::new) :
                getBinaryColumn("Biso_mean"));
    }

    /**
     * The estimated B factor from the structure factor file by the
     * Wilson plot (from Xtriage).
     * @return FloatColumn
     */
    public FloatColumn getBWilson() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("B_wilson", FloatColumn::new) :
                getBinaryColumn("B_wilson"));
    }

    /**
     * The scale factor for calculating the B factor by the Wilson plot
     * (from Xtriage).
     * @return FloatColumn
     */
    public FloatColumn getBWilsonScale() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("B_wilson_scale", FloatColumn::new) :
                getBinaryColumn("B_wilson_scale"));
    }

    /**
     * Value of &lt;I^2&gt;/&lt;I&gt;^2 calculated by Xtriage using acentric
     * reflections.(untwinned: 2.000; perfect twin 1.500).
     * @return FloatColumn
     */
    public FloatColumn getMeanI2OverMeanISquare() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("mean_I2_over_mean_I_square", FloatColumn::new) :
                getBinaryColumn("mean_I2_over_mean_I_square"));
    }

    /**
     * Value of &lt;F&gt;^2/&lt;F^2&gt; calculated by Xtriage using acentric
     * reflections.(untwinned: 0.785; perfect twin 0.885).
     * @return FloatColumn
     */
    public FloatColumn getMeanFSquareOverMeanF2() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("mean_F_square_over_mean_F2", FloatColumn::new) :
                getBinaryColumn("mean_F_square_over_mean_F2"));
    }

    /**
     * Value of &lt;|E^2 - 1|&gt; calculated by Xtriage using acentric
     * reflections.(untwinned: 0.736; perfect twin 0.541).
     * @return FloatColumn
     */
    public FloatColumn getMeanE21Abs() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("mean_E2_1_abs", FloatColumn::new) :
                getBinaryColumn("mean_E2_1_abs"));
    }

    /**
     * Value of &lt;|L|&gt; calculated by Xtriage using acentric reflections.
     * (untwinned: 0.500; perfect twin: 0.375).
     * @return FloatColumn
     */
    public FloatColumn getPadilla_YeatesLMean() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("Padilla-Yeates_L_mean", FloatColumn::new) :
                getBinaryColumn("Padilla-Yeates_L_mean"));
    }

    /**
     * Value of &lt;L^2&gt; calculated by Xtriage using acentric reflections.
     * (untwinned: 0.333; perfect twin: 0.200).
     * @return FloatColumn
     */
    public FloatColumn getPadilla_YeatesL2Mean() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("Padilla-Yeates_L2_mean", FloatColumn::new) :
                getBinaryColumn("Padilla-Yeates_L2_mean"));
    }

    /**
     * Value of &lt;L^2&gt; calculated by Pointless using acentric reflections.
     * (untwinned: 0.333; perfect twin: 0.200).
     * @return FloatColumn
     */
    public FloatColumn getPadilla_YeatesL2MeanPointless() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("Padilla-Yeates_L2_mean_pointless", FloatColumn::new) :
                getBinaryColumn("Padilla-Yeates_L2_mean_pointless"));
    }

    /**
     * Multivariate Z score for the L-test calculated by Xtriage using
     * acentric reflections. It is a quality measure of the given spread
     * in intensities. Good to reasonable data are expected to have a
     * Z score lower than 3.5.
     * @return FloatColumn
     */
    public FloatColumn getZScoreLTest() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("Z_score_L_test", FloatColumn::new) :
                getBinaryColumn("Z_score_L_test"));
    }

    /**
     * Type of twin (merohedral,Pseudo-merohedral or non-merohedral)
     * determined by Xtriage.
     * @return StrColumn
     */
    public StrColumn getTwinType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("twin_type", StrColumn::new) :
                getBinaryColumn("twin_type"));
    }

    /**
     * A list of the twin operators determined by Xtriage.
     * @return StrColumn
     */
    public StrColumn getTwinOperatorXtriage() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("twin_operator_xtriage", StrColumn::new) :
                getBinaryColumn("twin_operator_xtriage"));
    }

    /**
     * The twin fraction determined by Xtriage.
     * @return FloatColumn
     */
    public FloatColumn getTwinFractionXtriage() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("twin_fraction_xtriage", FloatColumn::new) :
                getBinaryColumn("twin_fraction_xtriage"));
    }

    /**
     * The Rfactor calculated by Xtriage using the twin operator related
     * data. (Smaller values indicate twins).
     * @return FloatColumn
     */
    public FloatColumn getTwinRfactor() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("twin_Rfactor", FloatColumn::new) :
                getBinaryColumn("twin_Rfactor"));
    }

    /**
     * The &lt;I/SigmaI&gt; at the highest resolution bin calculated by Xtriage.
     * @return FloatColumn
     */
    public FloatColumn getIOverSigIResh() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("I_over_sigI_resh", FloatColumn::new) :
                getBinaryColumn("I_over_sigI_resh"));
    }

    /**
     * The difference of the &lt;I/SigmaI&gt; in the last two points of the
     * plot of &lt;I/SigmaI&gt; vs resolution (expected to be negative).
     * @return FloatColumn
     */
    public FloatColumn getIOverSigIDiff() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("I_over_sigI_diff", FloatColumn::new) :
                getBinaryColumn("I_over_sigI_diff"));
    }

    /**
     * The overall mean value of &lt;I/SigmaI&gt; for the reflections.
     * @return FloatColumn
     */
    public FloatColumn getIOverSigIMean() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("I_over_sigI_mean", FloatColumn::new) :
                getBinaryColumn("I_over_sigI_mean"));
    }

    /**
     * Boolean whether ice ring exists (Y) or not (N) as determined
     * by Xtriage.
     * @return StrColumn
     */
    public StrColumn getIceRing() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("ice_ring", StrColumn::new) :
                getBinaryColumn("ice_ring"));
    }

    /**
     * The anisotropy ( [MaxAnisoB-MinAnisoB]/[MaxAnisoB] ) calculated
     * by Xtriage.
     * @return FloatColumn
     */
    public FloatColumn getAnisotropy() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("anisotropy", FloatColumn::new) :
                getBinaryColumn("anisotropy"));
    }

    /**
     * Z-scores are computed (by Xtriage) on the basis of a Bernoulli
     * model assuming independence of weak reflections with respect to
     * anisotropy.
     * @return FloatColumn
     */
    public FloatColumn getZ_score() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("Z-score", FloatColumn::new) :
                getBinaryColumn("Z-score"));
    }

    /**
     * The probability to tell the existence of translational pseudo
     * symmetry. p_values smaller than 0.05 (1e-3) might indicate weak
     * (strong) translational pseudo symmetry (by Xtriage).
     * @return FloatColumn
     */
    public FloatColumn getProbPeakValue() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("prob_peak_value", FloatColumn::new) :
                getBinaryColumn("prob_peak_value"));
    }

    /**
     * Boolean whether translational pseudo symmetry exist (Y) or
     * not (N) as determined by Xtriage.
     * @return StrColumn
     */
    public StrColumn getTranslationalPseudoSymmetry() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("translational_pseudo_symmetry", StrColumn::new) :
                getBinaryColumn("translational_pseudo_symmetry"));
    }

    /**
     * The wavelength reported from the model file.
     * @return FloatColumn
     */
    public FloatColumn getWavelength() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("wavelength", FloatColumn::new) :
                getBinaryColumn("wavelength"));
    }

    /**
     * One of the scale factors used in the bulk solvent correction
     * (from REFMAC).
     * @return FloatColumn
     */
    public FloatColumn getBSolvent() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("B_solvent", FloatColumn::new) :
                getBinaryColumn("B_solvent"));
    }

    /**
     * One of the scale factors used in the bulk solvent correction
     * (from REFMAC).
     * @return FloatColumn
     */
    public FloatColumn getKSolvent() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("K_solvent", FloatColumn::new) :
                getBinaryColumn("K_solvent"));
    }

    /**
     * Whether TLS was used in refinement. Y for yes, and N for no.
     * @return StrColumn
     */
    public StrColumn getTLSRefinementReported() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("TLS_refinement_reported", StrColumn::new) :
                getBinaryColumn("TLS_refinement_reported"));
    }

    /**
     * Whether attempt to convert the partial to full B factors before
     * validation.
     * @return StrColumn
     */
    public StrColumn getPartialBValueCorrectionAttempted() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("partial_B_value_correction_attempted", StrColumn::new) :
                getBinaryColumn("partial_B_value_correction_attempted"));
    }

    /**
     * Whether the the conversion of partial B to full B factor is
     * successful (Y) or not (N).
     * @return StrColumn
     */
    public StrColumn getPartialBValueCorrectionSuccess() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("partial_B_value_correction_success", StrColumn::new) :
                getBinaryColumn("partial_B_value_correction_success"));
    }

    /**
     * Whether the status is of reflection is archived (Y) or not (N).
     * @return StrColumn
     */
    public StrColumn getReflectionStatusArchived() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("reflection_status_archived", StrColumn::new) :
                getBinaryColumn("reflection_status_archived"));
    }

    /**
     * Whether the status of the reflection is used (Y) or not (N).
     * @return StrColumn
     */
    public StrColumn getReflectionStatusUsed() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("reflection_status_used", StrColumn::new) :
                getBinaryColumn("reflection_status_used"));
    }

    /**
     * The type of B factors (partial or full) for the residue.
     * @return StrColumn
     */
    public StrColumn getIsoBValueType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("iso_B_value_type", StrColumn::new) :
                getBinaryColumn("iso_B_value_type"));
    }

    /**
     * Boolean (Y/N) whether the twin is reported.
     * @return StrColumn
     */
    public StrColumn getReflnsTwin() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("reflns_twin", StrColumn::new) :
                getBinaryColumn("reflns_twin"));
    }

    /**
     * Boolean (Y/N) whether twin is detected by Xtriage.
     * @return StrColumn
     */
    public StrColumn getTwinByXtriage() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("twin_by_xtriage", StrColumn::new) :
                getBinaryColumn("twin_by_xtriage"));
    }

    /**
     * Twin operators determined by REFMAC.
     * @return StrColumn
     */
    public StrColumn getTwinOperator() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("twin_operator", StrColumn::new) :
                getBinaryColumn("twin_operator"));
    }

    /**
     * Twin fractions determined by REFMAC.
     * @return StrColumn
     */
    public StrColumn getTwinFraction() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("twin_fraction", StrColumn::new) :
                getBinaryColumn("twin_fraction"));
    }

    /**
     * Number of TLS groups used in refinement.
     * @return IntColumn
     */
    public IntColumn getTlsGroupNumber() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("tls_group_number", IntColumn::new) :
                getBinaryColumn("tls_group_number"));
    }

    /**
     * Number of NCS groups used in refinement.
     * @return IntColumn
     */
    public IntColumn getNcsGroupNumber() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("ncs_group_number", IntColumn::new) :
                getBinaryColumn("ncs_group_number"));
    }

    /**
     * Number of matrix for the NCS groups used in refinement.
     * @return IntColumn
     */
    public IntColumn getMtrixNumber() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("mtrix_number", IntColumn::new) :
                getBinaryColumn("mtrix_number"));
    }

    /**
     * The Matthew coefficient.
     * @return FloatColumn
     */
    public FloatColumn getMatthewCoeff() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("Matthew_coeff", FloatColumn::new) :
                getBinaryColumn("Matthew_coeff"));
    }

    /**
     * The solvent content.
     * @return FloatColumn
     */
    public FloatColumn getSolventContent() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("solvent_content", FloatColumn::new) :
                getBinaryColumn("solvent_content"));
    }

    /**
     * The DPI on the model determined by REFMAC.
     * @return FloatColumn
     */
    public FloatColumn getCruickshankDpiXyz() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("Cruickshank_dpi_xyz", FloatColumn::new) :
                getBinaryColumn("Cruickshank_dpi_xyz"));
    }

    /**
     * The DPI calculated based on the free set, determined by REFMAC.
     * @return FloatColumn
     */
    public FloatColumn getDpiFreeR() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("dpi_free_R", FloatColumn::new) :
                getBinaryColumn("dpi_free_R"));
    }

    /**
     * The mean figure of merit after refinement.
     * @return FloatColumn
     */
    public FloatColumn getFom() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("fom", FloatColumn::new) :
                getBinaryColumn("fom"));
    }

    /**
     * The overall electron density correlation coefficient.
     * @return FloatColumn
     */
    public FloatColumn getCorrelationOverall() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("correlation_overall", FloatColumn::new) :
                getBinaryColumn("correlation_overall"));
    }

    /**
     * The overall real space R factor.
     * @return FloatColumn
     */
    public FloatColumn getRealSpaceROverall() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("real_space_R_overall", FloatColumn::new) :
                getBinaryColumn("real_space_R_overall"));
    }

    /**
     * The number of electron density positive peaks larger than 3 sigma.
     * @return IntColumn
     */
    public IntColumn getMFo_DFc_3sigmaPositive() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("mFo-DFc-3sigma_positive", IntColumn::new) :
                getBinaryColumn("mFo-DFc-3sigma_positive"));
    }

    /**
     * The number of electron density positive peaks larger than 6 sigma.
     * @return IntColumn
     */
    public IntColumn getMFo_DFc_6sigmaPositive() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("mFo-DFc-6sigma_positive", IntColumn::new) :
                getBinaryColumn("mFo-DFc-6sigma_positive"));
    }

    /**
     * The number of electron density negative peaks less than 3 sigma.
     * @return IntColumn
     */
    public IntColumn getMFo_DFc_3sigmaNegative() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("mFo-DFc-3sigma_negative", IntColumn::new) :
                getBinaryColumn("mFo-DFc-3sigma_negative"));
    }

    /**
     * The number of electron density negative peaks less than 6 sigma.
     * @return IntColumn
     */
    public IntColumn getMFo_DFc_6sigmaNegative() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("mFo-DFc-6sigma_negative", IntColumn::new) :
                getBinaryColumn("mFo-DFc-6sigma_negative"));
    }

    /**
     * The difference between the isotropic B factor and the Bfators
     * from Wilson plot.
     * @return FloatColumn
     */
    public FloatColumn getBmean_Bwilson() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("Bmean-Bwilson", FloatColumn::new) :
                getBinaryColumn("Bmean-Bwilson"));
    }

    /**
     * The difference between reported Rfree and reported Rwork.
     * @return FloatColumn
     */
    public FloatColumn getRfree_Rwork() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("Rfree-Rwork", FloatColumn::new) :
                getBinaryColumn("Rfree-Rwork"));
    }

    /**
     * Details of any error or warning messages.
     * @return StrColumn
     */
    public StrColumn getError() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("error", StrColumn::new) :
                getBinaryColumn("error"));
    }
}
