package org.rcsb.cif.model.pdbxdccdensity;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
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
     * @return DCCVersion
     */
    public DCCVersion getDCCVersion() {
        return (DCCVersion) (isText ? textFields.computeIfAbsent("DCC_version",
                DCCVersion::new) : getBinaryColumn("DCC_version"));
    }

    /**
     * The PDB id code.
     * @return Pdbid
     */
    public Pdbid getPdbid() {
        return (Pdbid) (isText ? textFields.computeIfAbsent("pdbid",
                Pdbid::new) : getBinaryColumn("pdbid"));
    }

    /**
     * The keywords of the structure (taken from
     * _struct_keywords.pdbx_keywords).
     * @return Pdbtype
     */
    public Pdbtype getPdbtype() {
        return (Pdbtype) (isText ? textFields.computeIfAbsent("pdbtype",
                Pdbtype::new) : getBinaryColumn("pdbtype"));
    }

    /**
     * The unit cell parameters (a b c alpha beta gamma) separated
     * by a space.
     * @return UnitCell
     */
    public UnitCell getUnitCell() {
        return (UnitCell) (isText ? textFields.computeIfAbsent("unit_cell",
                UnitCell::new) : getBinaryColumn("unit_cell"));
    }

    /**
     * Hermann-Mauguin space-group symbol reported in the model file.
     * @return SpaceGroupNameH_M
     */
    public SpaceGroupNameH_M getSpaceGroupNameH_M() {
        return (SpaceGroupNameH_M) (isText ? textFields.computeIfAbsent("space_group_name_H-M",
                SpaceGroupNameH_M::new) : getBinaryColumn("space_group_name_H-M"));
    }

    /**
     * Hermann-Mauguin space-group symbol calculated by the POINTLESS
     * program using the structure factor file.
     * @return SpaceGroupPointless
     */
    public SpaceGroupPointless getSpaceGroupPointless() {
        return (SpaceGroupPointless) (isText ? textFields.computeIfAbsent("space_group_pointless",
                SpaceGroupPointless::new) : getBinaryColumn("space_group_pointless"));
    }

    /**
     * The highest resolution limit reported in the model file.
     * @return LsDResHigh
     */
    public LsDResHigh getLsDResHigh() {
        return (LsDResHigh) (isText ? textFields.computeIfAbsent("ls_d_res_high",
                LsDResHigh::new) : getBinaryColumn("ls_d_res_high"));
    }

    /**
     * The highest resolution limit calculated from the structure
     * factor file.
     * @return LsDResHighSf
     */
    public LsDResHighSf getLsDResHighSf() {
        return (LsDResHighSf) (isText ? textFields.computeIfAbsent("ls_d_res_high_sf",
                LsDResHighSf::new) : getBinaryColumn("ls_d_res_high_sf"));
    }

    /**
     * The lowest resolution limit calculated from the structure
     * factor file.
     * @return LsDResLowSf
     */
    public LsDResLowSf getLsDResLowSf() {
        return (LsDResLowSf) (isText ? textFields.computeIfAbsent("ls_d_res_low_sf",
                LsDResLowSf::new) : getBinaryColumn("ls_d_res_low_sf"));
    }

    /**
     * The Rwork reported in the model file.
     * @return RValueRWork
     */
    public RValueRWork getRValueRWork() {
        return (RValueRWork) (isText ? textFields.computeIfAbsent("R_value_R_work",
                RValueRWork::new) : getBinaryColumn("R_value_R_work"));
    }

    /**
     * The Rfree reported in the model file.
     * @return RValueRFree
     */
    public RValueRFree getRValueRFree() {
        return (RValueRFree) (isText ? textFields.computeIfAbsent("R_value_R_free",
                RValueRFree::new) : getBinaryColumn("R_value_R_free"));
    }

    /**
     * The number of unique reflections for refinement (working set)
     * reported in the model file.
     * @return WorkingSetCount
     */
    public WorkingSetCount getWorkingSetCount() {
        return (WorkingSetCount) (isText ? textFields.computeIfAbsent("working_set_count",
                WorkingSetCount::new) : getBinaryColumn("working_set_count"));
    }

    /**
     * The number of unique reflections for calculating Rfree
     * (testing set) reported in the model file.
     * @return FreeSetCount
     */
    public FreeSetCount getFreeSetCount() {
        return (FreeSetCount) (isText ? textFields.computeIfAbsent("free_set_count",
                FreeSetCount::new) : getBinaryColumn("free_set_count"));
    }

    /**
     * The minimum occupancy reported in the model file.
     * @return OccupancyMin
     */
    public OccupancyMin getOccupancyMin() {
        return (OccupancyMin) (isText ? textFields.computeIfAbsent("occupancy_min",
                OccupancyMin::new) : getBinaryColumn("occupancy_min"));
    }

    /**
     * The maximum occupancy reported in the model file.
     * @return OccupancyMax
     */
    public OccupancyMax getOccupancyMax() {
        return (OccupancyMax) (isText ? textFields.computeIfAbsent("occupancy_max",
                OccupancyMax::new) : getBinaryColumn("occupancy_max"));
    }

    /**
     * The averaged occupancy reported in the model file.
     * @return OccupancyMean
     */
    public OccupancyMean getOccupancyMean() {
        return (OccupancyMean) (isText ? textFields.computeIfAbsent("occupancy_mean",
                OccupancyMean::new) : getBinaryColumn("occupancy_mean"));
    }

    /**
     * The minimum isotropic B factor reported in the model file.
     * @return BisoMin
     */
    public BisoMin getBisoMin() {
        return (BisoMin) (isText ? textFields.computeIfAbsent("Biso_min",
                BisoMin::new) : getBinaryColumn("Biso_min"));
    }

    /**
     * The maximum isotropic B factor reported in the model file.
     * @return BisoMax
     */
    public BisoMax getBisoMax() {
        return (BisoMax) (isText ? textFields.computeIfAbsent("Biso_max",
                BisoMax::new) : getBinaryColumn("Biso_max"));
    }

    /**
     * The occupancy weighted mean isotropic B factor reported in the
     * model file.
     * @return BisoMean
     */
    public BisoMean getBisoMean() {
        return (BisoMean) (isText ? textFields.computeIfAbsent("Biso_mean",
                BisoMean::new) : getBinaryColumn("Biso_mean"));
    }

    /**
     * The estimated B factor from the structure factor file by the
     * Wilson plot (from Xtriage).
     * @return BWilson
     */
    public BWilson getBWilson() {
        return (BWilson) (isText ? textFields.computeIfAbsent("B_wilson",
                BWilson::new) : getBinaryColumn("B_wilson"));
    }

    /**
     * The scale factor for calculating the B factor by the Wilson plot
     * (from Xtriage).
     * @return BWilsonScale
     */
    public BWilsonScale getBWilsonScale() {
        return (BWilsonScale) (isText ? textFields.computeIfAbsent("B_wilson_scale",
                BWilsonScale::new) : getBinaryColumn("B_wilson_scale"));
    }

    /**
     * Value of <I^2>/<I>^2 calculated by Xtriage using acentric
     * reflections.(untwinned: 2.000; perfect twin 1.500).
     * @return MeanI2OverMeanISquare
     */
    public MeanI2OverMeanISquare getMeanI2OverMeanISquare() {
        return (MeanI2OverMeanISquare) (isText ? textFields.computeIfAbsent("mean_I2_over_mean_I_square",
                MeanI2OverMeanISquare::new) : getBinaryColumn("mean_I2_over_mean_I_square"));
    }

    /**
     * Value of <F>^2/<F^2> calculated by Xtriage using acentric
     * reflections.(untwinned: 0.785; perfect twin 0.885).
     * @return MeanFSquareOverMeanF2
     */
    public MeanFSquareOverMeanF2 getMeanFSquareOverMeanF2() {
        return (MeanFSquareOverMeanF2) (isText ? textFields.computeIfAbsent("mean_F_square_over_mean_F2",
                MeanFSquareOverMeanF2::new) : getBinaryColumn("mean_F_square_over_mean_F2"));
    }

    /**
     * Value of <|E^2 - 1|> calculated by Xtriage using acentric
     * reflections.(untwinned: 0.736; perfect twin 0.541).
     * @return MeanE21Abs
     */
    public MeanE21Abs getMeanE21Abs() {
        return (MeanE21Abs) (isText ? textFields.computeIfAbsent("mean_E2_1_abs",
                MeanE21Abs::new) : getBinaryColumn("mean_E2_1_abs"));
    }

    /**
     * Value of <|L|> calculated by Xtriage using acentric reflections.
     * (untwinned: 0.500; perfect twin: 0.375).
     * @return Padilla_YeatesLMean
     */
    public Padilla_YeatesLMean getPadilla_YeatesLMean() {
        return (Padilla_YeatesLMean) (isText ? textFields.computeIfAbsent("Padilla-Yeates_L_mean",
                Padilla_YeatesLMean::new) : getBinaryColumn("Padilla-Yeates_L_mean"));
    }

    /**
     * Value of <L^2> calculated by Xtriage using acentric reflections.
     * (untwinned: 0.333; perfect twin: 0.200).
     * @return Padilla_YeatesL2Mean
     */
    public Padilla_YeatesL2Mean getPadilla_YeatesL2Mean() {
        return (Padilla_YeatesL2Mean) (isText ? textFields.computeIfAbsent("Padilla-Yeates_L2_mean",
                Padilla_YeatesL2Mean::new) : getBinaryColumn("Padilla-Yeates_L2_mean"));
    }

    /**
     * Value of <L^2> calculated by Pointless using acentric reflections.
     * (untwinned: 0.333; perfect twin: 0.200).
     * @return Padilla_YeatesL2MeanPointless
     */
    public Padilla_YeatesL2MeanPointless getPadilla_YeatesL2MeanPointless() {
        return (Padilla_YeatesL2MeanPointless) (isText ? textFields.computeIfAbsent("Padilla-Yeates_L2_mean_pointless",
                Padilla_YeatesL2MeanPointless::new) : getBinaryColumn("Padilla-Yeates_L2_mean_pointless"));
    }

    /**
     * Multivariate Z score for the L-test calculated by Xtriage using
     * acentric reflections. It is a quality measure of the given spread
     * in intensities. Good to reasonable data are expected to have a
     * Z score lower than 3.5.
     * @return ZScoreLTest
     */
    public ZScoreLTest getZScoreLTest() {
        return (ZScoreLTest) (isText ? textFields.computeIfAbsent("Z_score_L_test",
                ZScoreLTest::new) : getBinaryColumn("Z_score_L_test"));
    }

    /**
     * Type of twin (merohedral,Pseudo-merohedral or non-merohedral)
     * determined by Xtriage.
     * @return TwinType
     */
    public TwinType getTwinType() {
        return (TwinType) (isText ? textFields.computeIfAbsent("twin_type",
                TwinType::new) : getBinaryColumn("twin_type"));
    }

    /**
     * A list of the twin operators determined by Xtriage.
     * @return TwinOperatorXtriage
     */
    public TwinOperatorXtriage getTwinOperatorXtriage() {
        return (TwinOperatorXtriage) (isText ? textFields.computeIfAbsent("twin_operator_xtriage",
                TwinOperatorXtriage::new) : getBinaryColumn("twin_operator_xtriage"));
    }

    /**
     * The twin fraction determined by Xtriage.
     * @return TwinFractionXtriage
     */
    public TwinFractionXtriage getTwinFractionXtriage() {
        return (TwinFractionXtriage) (isText ? textFields.computeIfAbsent("twin_fraction_xtriage",
                TwinFractionXtriage::new) : getBinaryColumn("twin_fraction_xtriage"));
    }

    /**
     * The Rfactor calculated by Xtriage using the twin operator related
     * data. (Smaller values indicate twins).
     * @return TwinRfactor
     */
    public TwinRfactor getTwinRfactor() {
        return (TwinRfactor) (isText ? textFields.computeIfAbsent("twin_Rfactor",
                TwinRfactor::new) : getBinaryColumn("twin_Rfactor"));
    }

    /**
     * The <I/SigmaI> at the highest resolution bin calculated by Xtriage.
     * @return IOverSigIResh
     */
    public IOverSigIResh getIOverSigIResh() {
        return (IOverSigIResh) (isText ? textFields.computeIfAbsent("I_over_sigI_resh",
                IOverSigIResh::new) : getBinaryColumn("I_over_sigI_resh"));
    }

    /**
     * The difference of the <I/SigmaI> in the last two points of the
     * plot of <I/SigmaI> vs resolution (expected to be negative).
     * @return IOverSigIDiff
     */
    public IOverSigIDiff getIOverSigIDiff() {
        return (IOverSigIDiff) (isText ? textFields.computeIfAbsent("I_over_sigI_diff",
                IOverSigIDiff::new) : getBinaryColumn("I_over_sigI_diff"));
    }

    /**
     * The overall mean value of <I/SigmaI> for the reflections.
     * @return IOverSigIMean
     */
    public IOverSigIMean getIOverSigIMean() {
        return (IOverSigIMean) (isText ? textFields.computeIfAbsent("I_over_sigI_mean",
                IOverSigIMean::new) : getBinaryColumn("I_over_sigI_mean"));
    }

    /**
     * Boolean whether ice ring exists (Y) or not (N) as determined
     * by Xtriage.
     * @return IceRing
     */
    public IceRing getIceRing() {
        return (IceRing) (isText ? textFields.computeIfAbsent("ice_ring",
                IceRing::new) : getBinaryColumn("ice_ring"));
    }

    /**
     * The anisotropy ( [MaxAnisoB-MinAnisoB]/[MaxAnisoB] ) calculated
     * by Xtriage.
     * @return Anisotropy
     */
    public Anisotropy getAnisotropy() {
        return (Anisotropy) (isText ? textFields.computeIfAbsent("anisotropy",
                Anisotropy::new) : getBinaryColumn("anisotropy"));
    }

    /**
     * Z-scores are computed (by Xtriage) on the basis of a Bernoulli
     * model assuming independence of weak reflections with respect to
     * anisotropy.
     * @return Z_score
     */
    public Z_score getZ_score() {
        return (Z_score) (isText ? textFields.computeIfAbsent("Z-score",
                Z_score::new) : getBinaryColumn("Z-score"));
    }

    /**
     * The probability to tell the existence of translational pseudo
     * symmetry. p_values smaller than 0.05 (1e-3) might indicate weak
     * (strong) translational pseudo symmetry (by Xtriage).
     * @return ProbPeakValue
     */
    public ProbPeakValue getProbPeakValue() {
        return (ProbPeakValue) (isText ? textFields.computeIfAbsent("prob_peak_value",
                ProbPeakValue::new) : getBinaryColumn("prob_peak_value"));
    }

    /**
     * Boolean whether translational pseudo symmetry exist (Y) or
     * not (N) as determined by Xtriage.
     * @return TranslationalPseudoSymmetry
     */
    public TranslationalPseudoSymmetry getTranslationalPseudoSymmetry() {
        return (TranslationalPseudoSymmetry) (isText ? textFields.computeIfAbsent("translational_pseudo_symmetry",
                TranslationalPseudoSymmetry::new) : getBinaryColumn("translational_pseudo_symmetry"));
    }

    /**
     * The wavelength reported from the model file.
     * @return Wavelength
     */
    public Wavelength getWavelength() {
        return (Wavelength) (isText ? textFields.computeIfAbsent("wavelength",
                Wavelength::new) : getBinaryColumn("wavelength"));
    }

    /**
     * One of the scale factors used in the bulk solvent correction
     * (from REFMAC).
     * @return BSolvent
     */
    public BSolvent getBSolvent() {
        return (BSolvent) (isText ? textFields.computeIfAbsent("B_solvent",
                BSolvent::new) : getBinaryColumn("B_solvent"));
    }

    /**
     * One of the scale factors used in the bulk solvent correction
     * (from REFMAC).
     * @return KSolvent
     */
    public KSolvent getKSolvent() {
        return (KSolvent) (isText ? textFields.computeIfAbsent("K_solvent",
                KSolvent::new) : getBinaryColumn("K_solvent"));
    }

    /**
     * Whether TLS was used in refinement. Y for yes, and N for no.
     * @return TLSRefinementReported
     */
    public TLSRefinementReported getTLSRefinementReported() {
        return (TLSRefinementReported) (isText ? textFields.computeIfAbsent("TLS_refinement_reported",
                TLSRefinementReported::new) : getBinaryColumn("TLS_refinement_reported"));
    }

    /**
     * Whether attempt to convert the partial to full B factors before
     * validation.
     * @return PartialBValueCorrectionAttempted
     */
    public PartialBValueCorrectionAttempted getPartialBValueCorrectionAttempted() {
        return (PartialBValueCorrectionAttempted) (isText ? textFields.computeIfAbsent("partial_B_value_correction_attempted",
                PartialBValueCorrectionAttempted::new) : getBinaryColumn("partial_B_value_correction_attempted"));
    }

    /**
     * Whether the the conversion of partial B to full B factor is
     * successful (Y) or not (N).
     * @return PartialBValueCorrectionSuccess
     */
    public PartialBValueCorrectionSuccess getPartialBValueCorrectionSuccess() {
        return (PartialBValueCorrectionSuccess) (isText ? textFields.computeIfAbsent("partial_B_value_correction_success",
                PartialBValueCorrectionSuccess::new) : getBinaryColumn("partial_B_value_correction_success"));
    }

    /**
     * Whether the status is of reflection is archived (Y) or not (N).
     * @return ReflectionStatusArchived
     */
    public ReflectionStatusArchived getReflectionStatusArchived() {
        return (ReflectionStatusArchived) (isText ? textFields.computeIfAbsent("reflection_status_archived",
                ReflectionStatusArchived::new) : getBinaryColumn("reflection_status_archived"));
    }

    /**
     * Whether the status of the reflection is used (Y) or not (N).
     * @return ReflectionStatusUsed
     */
    public ReflectionStatusUsed getReflectionStatusUsed() {
        return (ReflectionStatusUsed) (isText ? textFields.computeIfAbsent("reflection_status_used",
                ReflectionStatusUsed::new) : getBinaryColumn("reflection_status_used"));
    }

    /**
     * The type of B factors (partial or full) for the residue.
     * @return IsoBValueType
     */
    public IsoBValueType getIsoBValueType() {
        return (IsoBValueType) (isText ? textFields.computeIfAbsent("iso_B_value_type",
                IsoBValueType::new) : getBinaryColumn("iso_B_value_type"));
    }

    /**
     * Boolean (Y/N) whether the twin is reported.
     * @return ReflnsTwin
     */
    public ReflnsTwin getReflnsTwin() {
        return (ReflnsTwin) (isText ? textFields.computeIfAbsent("reflns_twin",
                ReflnsTwin::new) : getBinaryColumn("reflns_twin"));
    }

    /**
     * Boolean (Y/N) whether twin is detected by Xtriage.
     * @return TwinByXtriage
     */
    public TwinByXtriage getTwinByXtriage() {
        return (TwinByXtriage) (isText ? textFields.computeIfAbsent("twin_by_xtriage",
                TwinByXtriage::new) : getBinaryColumn("twin_by_xtriage"));
    }

    /**
     * Twin operators determined by REFMAC.
     * @return TwinOperator
     */
    public TwinOperator getTwinOperator() {
        return (TwinOperator) (isText ? textFields.computeIfAbsent("twin_operator",
                TwinOperator::new) : getBinaryColumn("twin_operator"));
    }

    /**
     * Twin fractions determined by REFMAC.
     * @return TwinFraction
     */
    public TwinFraction getTwinFraction() {
        return (TwinFraction) (isText ? textFields.computeIfAbsent("twin_fraction",
                TwinFraction::new) : getBinaryColumn("twin_fraction"));
    }

    /**
     * Number of TLS groups used in refinement.
     * @return TlsGroupNumber
     */
    public TlsGroupNumber getTlsGroupNumber() {
        return (TlsGroupNumber) (isText ? textFields.computeIfAbsent("tls_group_number",
                TlsGroupNumber::new) : getBinaryColumn("tls_group_number"));
    }

    /**
     * Number of NCS groups used in refinement.
     * @return NcsGroupNumber
     */
    public NcsGroupNumber getNcsGroupNumber() {
        return (NcsGroupNumber) (isText ? textFields.computeIfAbsent("ncs_group_number",
                NcsGroupNumber::new) : getBinaryColumn("ncs_group_number"));
    }

    /**
     * Number of matrix for the NCS groups used in refinement.
     * @return MtrixNumber
     */
    public MtrixNumber getMtrixNumber() {
        return (MtrixNumber) (isText ? textFields.computeIfAbsent("mtrix_number",
                MtrixNumber::new) : getBinaryColumn("mtrix_number"));
    }

    /**
     * The Matthew coefficient.
     * @return MatthewCoeff
     */
    public MatthewCoeff getMatthewCoeff() {
        return (MatthewCoeff) (isText ? textFields.computeIfAbsent("Matthew_coeff",
                MatthewCoeff::new) : getBinaryColumn("Matthew_coeff"));
    }

    /**
     * The solvent content.
     * @return SolventContent
     */
    public SolventContent getSolventContent() {
        return (SolventContent) (isText ? textFields.computeIfAbsent("solvent_content",
                SolventContent::new) : getBinaryColumn("solvent_content"));
    }

    /**
     * The DPI on the model determined by REFMAC.
     * @return CruickshankDpiXyz
     */
    public CruickshankDpiXyz getCruickshankDpiXyz() {
        return (CruickshankDpiXyz) (isText ? textFields.computeIfAbsent("Cruickshank_dpi_xyz",
                CruickshankDpiXyz::new) : getBinaryColumn("Cruickshank_dpi_xyz"));
    }

    /**
     * The DPI calculated based on the free set, determined by REFMAC.
     * @return DpiFreeR
     */
    public DpiFreeR getDpiFreeR() {
        return (DpiFreeR) (isText ? textFields.computeIfAbsent("dpi_free_R",
                DpiFreeR::new) : getBinaryColumn("dpi_free_R"));
    }

    /**
     * The mean figure of merit after refinement.
     * @return Fom
     */
    public Fom getFom() {
        return (Fom) (isText ? textFields.computeIfAbsent("fom",
                Fom::new) : getBinaryColumn("fom"));
    }

    /**
     * The overall electron density correlation coefficient.
     * @return CorrelationOverall
     */
    public CorrelationOverall getCorrelationOverall() {
        return (CorrelationOverall) (isText ? textFields.computeIfAbsent("correlation_overall",
                CorrelationOverall::new) : getBinaryColumn("correlation_overall"));
    }

    /**
     * The overall real space R factor.
     * @return RealSpaceROverall
     */
    public RealSpaceROverall getRealSpaceROverall() {
        return (RealSpaceROverall) (isText ? textFields.computeIfAbsent("real_space_R_overall",
                RealSpaceROverall::new) : getBinaryColumn("real_space_R_overall"));
    }

    /**
     * The number of electron density positive peaks larger than 3 sigma.
     * @return MFo_DFc_3sigmaPositive
     */
    public MFo_DFc_3sigmaPositive getMFo_DFc_3sigmaPositive() {
        return (MFo_DFc_3sigmaPositive) (isText ? textFields.computeIfAbsent("mFo-DFc-3sigma_positive",
                MFo_DFc_3sigmaPositive::new) : getBinaryColumn("mFo-DFc-3sigma_positive"));
    }

    /**
     * The number of electron density positive peaks larger than 6 sigma.
     * @return MFo_DFc_6sigmaPositive
     */
    public MFo_DFc_6sigmaPositive getMFo_DFc_6sigmaPositive() {
        return (MFo_DFc_6sigmaPositive) (isText ? textFields.computeIfAbsent("mFo-DFc-6sigma_positive",
                MFo_DFc_6sigmaPositive::new) : getBinaryColumn("mFo-DFc-6sigma_positive"));
    }

    /**
     * The number of electron density negative peaks less than 3 sigma.
     * @return MFo_DFc_3sigmaNegative
     */
    public MFo_DFc_3sigmaNegative getMFo_DFc_3sigmaNegative() {
        return (MFo_DFc_3sigmaNegative) (isText ? textFields.computeIfAbsent("mFo-DFc-3sigma_negative",
                MFo_DFc_3sigmaNegative::new) : getBinaryColumn("mFo-DFc-3sigma_negative"));
    }

    /**
     * The number of electron density negative peaks less than 6 sigma.
     * @return MFo_DFc_6sigmaNegative
     */
    public MFo_DFc_6sigmaNegative getMFo_DFc_6sigmaNegative() {
        return (MFo_DFc_6sigmaNegative) (isText ? textFields.computeIfAbsent("mFo-DFc-6sigma_negative",
                MFo_DFc_6sigmaNegative::new) : getBinaryColumn("mFo-DFc-6sigma_negative"));
    }

    /**
     * The difference between the isotropic B factor and the Bfators
     * from Wilson plot.
     * @return Bmean_Bwilson
     */
    public Bmean_Bwilson getBmean_Bwilson() {
        return (Bmean_Bwilson) (isText ? textFields.computeIfAbsent("Bmean-Bwilson",
                Bmean_Bwilson::new) : getBinaryColumn("Bmean-Bwilson"));
    }

    /**
     * The difference between reported Rfree and reported Rwork.
     * @return Rfree_Rwork
     */
    public Rfree_Rwork getRfree_Rwork() {
        return (Rfree_Rwork) (isText ? textFields.computeIfAbsent("Rfree-Rwork",
                Rfree_Rwork::new) : getBinaryColumn("Rfree-Rwork"));
    }

    /**
     * Details of any error or warning messages.
     * @return Error
     */
    public Error getError() {
        return (Error) (isText ? textFields.computeIfAbsent("error",
                Error::new) : getBinaryColumn("error"));
    }
}
