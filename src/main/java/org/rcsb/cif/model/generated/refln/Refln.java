package org.rcsb.cif.model.generated.refln;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class Refln extends BaseCategory {
    public Refln(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public Refln(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public Refln(String name) {
        super(name);
    }

    /**
     * The calculated value of structure-factor component A in
     * electrons.
     * 
     * A = |F|cos(phase)
     * @return ACalc
     */
    public ACalc getACalc() {
        return (ACalc) (isText ? textFields.computeIfAbsent("A_calc",
                ACalc::new) : getBinaryColumn("A_calc"));
    }

    /**
     * The calculated value of structure-factor component A in
     * arbitrary units.
     * 
     * A = |F|cos(phase)
     * @return ACalcAu
     */
    public ACalcAu getACalcAu() {
        return (ACalcAu) (isText ? textFields.computeIfAbsent("A_calc_au",
                ACalcAu::new) : getBinaryColumn("A_calc_au"));
    }

    /**
     * The measured value of structure-factor component A in electrons.
     * 
     * A = |F|cos(phase)
     * @return AMeas
     */
    public AMeas getAMeas() {
        return (AMeas) (isText ? textFields.computeIfAbsent("A_meas",
                AMeas::new) : getBinaryColumn("A_meas"));
    }

    /**
     * The measured value of structure-factor component A in
     * arbitrary units.
     * 
     * A = |F|cos(phase)
     * @return AMeasAu
     */
    public AMeasAu getAMeasAu() {
        return (AMeasAu) (isText ? textFields.computeIfAbsent("A_meas_au",
                AMeasAu::new) : getBinaryColumn("A_meas_au"));
    }

    /**
     * The calculated value of structure-factor component B in
     * electrons.
     * 
     * B = |F|sin(phase)
     * @return BCalc
     */
    public BCalc getBCalc() {
        return (BCalc) (isText ? textFields.computeIfAbsent("B_calc",
                BCalc::new) : getBinaryColumn("B_calc"));
    }

    /**
     * The calculated value of structure-factor component B in
     * arbitrary units.
     * 
     * B = |F|sin(phase)
     * @return BCalcAu
     */
    public BCalcAu getBCalcAu() {
        return (BCalcAu) (isText ? textFields.computeIfAbsent("B_calc_au",
                BCalcAu::new) : getBinaryColumn("B_calc_au"));
    }

    /**
     * The measured value of structure-factor component B in electrons.
     * 
     * B = |F|sin(phase)
     * @return BMeas
     */
    public BMeas getBMeas() {
        return (BMeas) (isText ? textFields.computeIfAbsent("B_meas",
                BMeas::new) : getBinaryColumn("B_meas"));
    }

    /**
     * The measured value of structure-factor component B in
     * arbitrary units.
     * 
     * B = |F|sin(phase)
     * @return BMeasAu
     */
    public BMeasAu getBMeasAu() {
        return (BMeasAu) (isText ? textFields.computeIfAbsent("B_meas_au",
                BMeasAu::new) : getBinaryColumn("B_meas_au"));
    }

    /**
     * This data item is a pointer to _exptl_crystal.id in the
     * EXPTL_CRYSTAL category.
     * @return CrystalId
     */
    public CrystalId getCrystalId() {
        return (CrystalId) (isText ? textFields.computeIfAbsent("crystal_id",
                CrystalId::new) : getBinaryColumn("crystal_id"));
    }

    /**
     * The calculated value of the structure factor in electrons.
     * @return FCalc
     */
    public FCalc getFCalc() {
        return (FCalc) (isText ? textFields.computeIfAbsent("F_calc",
                FCalc::new) : getBinaryColumn("F_calc"));
    }

    /**
     * The calculated value of the structure factor in arbitrary
     * units.
     * @return FCalcAu
     */
    public FCalcAu getFCalcAu() {
        return (FCalcAu) (isText ? textFields.computeIfAbsent("F_calc_au",
                FCalcAu::new) : getBinaryColumn("F_calc_au"));
    }

    /**
     * The measured value of the structure factor in electrons.
     * @return FMeas
     */
    public FMeas getFMeas() {
        return (FMeas) (isText ? textFields.computeIfAbsent("F_meas",
                FMeas::new) : getBinaryColumn("F_meas"));
    }

    /**
     * The measured value of the structure factor in arbitrary units.
     * @return FMeasAu
     */
    public FMeasAu getFMeasAu() {
        return (FMeasAu) (isText ? textFields.computeIfAbsent("F_meas_au",
                FMeasAu::new) : getBinaryColumn("F_meas_au"));
    }

    /**
     * The standard uncertainty (estimated standard deviation) of
     * _refln.F_meas in electrons.
     * @return FMeasSigma
     */
    public FMeasSigma getFMeasSigma() {
        return (FMeasSigma) (isText ? textFields.computeIfAbsent("F_meas_sigma",
                FMeasSigma::new) : getBinaryColumn("F_meas_sigma"));
    }

    /**
     * The standard uncertainty (estimated standard deviation) of
     * _refln.F_meas_au in arbitrary units.
     * @return FMeasSigmaAu
     */
    public FMeasSigmaAu getFMeasSigmaAu() {
        return (FMeasSigmaAu) (isText ? textFields.computeIfAbsent("F_meas_sigma_au",
                FMeasSigmaAu::new) : getBinaryColumn("F_meas_sigma_au"));
    }

    /**
     * The calculated value of the squared structure factor in
     * electrons squared.
     * @return FSquaredCalc
     */
    public FSquaredCalc getFSquaredCalc() {
        return (FSquaredCalc) (isText ? textFields.computeIfAbsent("F_squared_calc",
                FSquaredCalc::new) : getBinaryColumn("F_squared_calc"));
    }

    /**
     * The measured value of the squared structure factor in electrons
     * squared.
     * @return FSquaredMeas
     */
    public FSquaredMeas getFSquaredMeas() {
        return (FSquaredMeas) (isText ? textFields.computeIfAbsent("F_squared_meas",
                FSquaredMeas::new) : getBinaryColumn("F_squared_meas"));
    }

    /**
     * The standard uncertainty (derived from measurement) of the
     * squared structure factor in electrons squared.
     * @return FSquaredSigma
     */
    public FSquaredSigma getFSquaredSigma() {
        return (FSquaredSigma) (isText ? textFields.computeIfAbsent("F_squared_sigma",
                FSquaredSigma::new) : getBinaryColumn("F_squared_sigma"));
    }

    /**
     * The figure of merit m for this reflection.
     * 
     * int P~alpha~ exp(i*alpha) dalpha
     * m = --------------------------------
     * int P~alpha~ dalpha
     * 
     * P~a~ = the probability that the phase angle a is correct
     * 
     * int is taken over the range alpha = 0 to 2 pi.
     * @return Fom
     */
    public Fom getFom() {
        return (Fom) (isText ? textFields.computeIfAbsent("fom",
                Fom::new) : getBinaryColumn("fom"));
    }

    /**
     * Miller index h of the reflection. The values of the Miller
     * indices in the REFLN category must correspond to the cell
     * defined by cell lengths and cell angles in the CELL category.
     * @return IndexH
     */
    public IndexH getIndexH() {
        return (IndexH) (isText ? textFields.computeIfAbsent("index_h",
                IndexH::new) : getBinaryColumn("index_h"));
    }

    /**
     * Miller index k of the reflection. The values of the Miller
     * indices in the REFLN category must correspond to the cell
     * defined by cell lengths and cell angles in the CELL category.
     * @return IndexK
     */
    public IndexK getIndexK() {
        return (IndexK) (isText ? textFields.computeIfAbsent("index_k",
                IndexK::new) : getBinaryColumn("index_k"));
    }

    /**
     * Miller index l of the reflection. The values of the Miller
     * indices in the REFLN category must correspond to the cell
     * defined by cell lengths and cell angles in the CELL category.
     * @return IndexL
     */
    public IndexL getIndexL() {
        return (IndexL) (isText ? textFields.computeIfAbsent("index_l",
                IndexL::new) : getBinaryColumn("index_l"));
    }

    /**
     * The calculated value of the intensity in the same units as
     * _refln.intensity_meas.
     * @return IntensityCalc
     */
    public IntensityCalc getIntensityCalc() {
        return (IntensityCalc) (isText ? textFields.computeIfAbsent("intensity_calc",
                IntensityCalc::new) : getBinaryColumn("intensity_calc"));
    }

    /**
     * The measured value of the intensity.
     * @return IntensityMeas
     */
    public IntensityMeas getIntensityMeas() {
        return (IntensityMeas) (isText ? textFields.computeIfAbsent("intensity_meas",
                IntensityMeas::new) : getBinaryColumn("intensity_meas"));
    }

    /**
     * The standard uncertainty (derived from measurement) of the
     * intensity in the same units as _refln.intensity_meas.
     * @return IntensitySigma
     */
    public IntensitySigma getIntensitySigma() {
        return (IntensitySigma) (isText ? textFields.computeIfAbsent("intensity_sigma",
                IntensitySigma::new) : getBinaryColumn("intensity_sigma"));
    }

    /**
     * Classification of a reflection so as to indicate its status with
     * respect to inclusion in the refinement and the calculation of
     * R factors.
     * @return Status
     */
    public Status getStatus() {
        return (Status) (isText ? textFields.computeIfAbsent("status",
                Status::new) : getBinaryColumn("status"));
    }

    /**
     * The calculated structure-factor phase in degrees.
     * @return PhaseCalc
     */
    public PhaseCalc getPhaseCalc() {
        return (PhaseCalc) (isText ? textFields.computeIfAbsent("phase_calc",
                PhaseCalc::new) : getBinaryColumn("phase_calc"));
    }

    /**
     * The measured structure-factor phase in degrees.
     * @return PhaseMeas
     */
    public PhaseMeas getPhaseMeas() {
        return (PhaseMeas) (isText ? textFields.computeIfAbsent("phase_meas",
                PhaseMeas::new) : getBinaryColumn("phase_meas"));
    }

    /**
     * Status of a reflection in the structure-refinement process.
     * @return RefinementStatus
     */
    public RefinementStatus getRefinementStatus() {
        return (RefinementStatus) (isText ? textFields.computeIfAbsent("refinement_status",
                RefinementStatus::new) : getBinaryColumn("refinement_status"));
    }

    /**
     * This data item is a pointer to _reflns_scale.group_code in the
     * REFLNS_SCALE category.
     * @return ScaleGroupCode
     */
    public ScaleGroupCode getScaleGroupCode() {
        return (ScaleGroupCode) (isText ? textFields.computeIfAbsent("scale_group_code",
                ScaleGroupCode::new) : getBinaryColumn("scale_group_code"));
    }

    /**
     * The (sin theta)/lambda value in reciprocal angstroms for this
     * reflection.
     * @return SintOverLambda
     */
    public SintOverLambda getSintOverLambda() {
        return (SintOverLambda) (isText ? textFields.computeIfAbsent("sint_over_lambda",
                SintOverLambda::new) : getBinaryColumn("sint_over_lambda"));
    }

    /**
     * The symmetry reinforcement factor corresponding to the number of
     * times the reflection indices are generated identically from the
     * space-group symmetry operations.
     * @return SymmetryEpsilon
     */
    public SymmetryEpsilon getSymmetryEpsilon() {
        return (SymmetryEpsilon) (isText ? textFields.computeIfAbsent("symmetry_epsilon",
                SymmetryEpsilon::new) : getBinaryColumn("symmetry_epsilon"));
    }

    /**
     * The number of symmetry-equivalent reflections. The equivalent
     * reflections have the same structure-factor magnitudes because
     * of the space-group symmetry and the Friedel relationship.
     * @return SymmetryMultiplicity
     */
    public SymmetryMultiplicity getSymmetryMultiplicity() {
        return (SymmetryMultiplicity) (isText ? textFields.computeIfAbsent("symmetry_multiplicity",
                SymmetryMultiplicity::new) : getBinaryColumn("symmetry_multiplicity"));
    }

    /**
     * The mean wavelength in angstroms of radiation used to measure
     * this reflection. This is an important parameter for data
     * collected using energy-dispersive detectors or the Laue
     * method.
     * @return Wavelength
     */
    public Wavelength getWavelength() {
        return (Wavelength) (isText ? textFields.computeIfAbsent("wavelength",
                Wavelength::new) : getBinaryColumn("wavelength"));
    }

    /**
     * This data item is a pointer to _diffrn_radiation.wavelength_id in
     * the DIFFRN_RADIATION category.
     * @return WavelengthId
     */
    public WavelengthId getWavelengthId() {
        return (WavelengthId) (isText ? textFields.computeIfAbsent("wavelength_id",
                WavelengthId::new) : getBinaryColumn("wavelength_id"));
    }

    /**
     * The code identifying the class to which this reflection has been
     * assigned. This code must match a value of _reflns_class.code.
     * Reflections may be grouped into classes for a variety of
     * purposes. For example, for modulated structures each reflection
     * class may be defined by the number m=sum|m~i~|, where the m~i~
     * are the integer coefficients that, in addition to h,k,l, index
     * the corresponding diffraction vector in the basis defined
     * for the reciprocal lattice.
     * @return ClassCode
     */
    public ClassCode getClassCode() {
        return (ClassCode) (isText ? textFields.computeIfAbsent("class_code",
                ClassCode::new) : getBinaryColumn("class_code"));
    }

    /**
     * The d spacing in angstroms for this reflection. This is related
     * to the (sin theta)/lambda value by the expression
     * _refln.d_spacing = 2/(_refln.sint/lambda).
     * @return DSpacing
     */
    public DSpacing getDSpacing() {
        return (DSpacing) (isText ? textFields.computeIfAbsent("d_spacing",
                DSpacing::new) : getBinaryColumn("d_spacing"));
    }

    /**
     * Classification of a reflection so as to indicate its status with
     * respect to inclusion in the refinement and the calculation of
     * R factors.
     * @return IncludeStatus
     */
    public IncludeStatus getIncludeStatus() {
        return (IncludeStatus) (isText ? textFields.computeIfAbsent("include_status",
                IncludeStatus::new) : getBinaryColumn("include_status"));
    }

    /**
     * Mean path length in millimetres through the crystal for this
     * reflection.
     * @return MeanPathLengthTbar
     */
    public MeanPathLengthTbar getMeanPathLengthTbar() {
        return (MeanPathLengthTbar) (isText ? textFields.computeIfAbsent("mean_path_length_tbar",
                MeanPathLengthTbar::new) : getBinaryColumn("mean_path_length_tbar"));
    }

    /**
     * The calculated value of the structure factor in arbitrary
     * units reflecting only the contribution of the solvent model.
     * @return PdbxFCalcPartSolvent
     */
    public PdbxFCalcPartSolvent getPdbxFCalcPartSolvent() {
        return (PdbxFCalcPartSolvent) (isText ? textFields.computeIfAbsent("pdbx_F_calc_part_solvent",
                PdbxFCalcPartSolvent::new) : getBinaryColumn("pdbx_F_calc_part_solvent"));
    }

    /**
     * The calculated structure-factor phase in degrees reflecting
     * only the contribution of the solvent model.
     * @return PdbxPhaseCalcPartSolvent
     */
    public PdbxPhaseCalcPartSolvent getPdbxPhaseCalcPartSolvent() {
        return (PdbxPhaseCalcPartSolvent) (isText ? textFields.computeIfAbsent("pdbx_phase_calc_part_solvent",
                PdbxPhaseCalcPartSolvent::new) : getBinaryColumn("pdbx_phase_calc_part_solvent"));
    }

    /**
     * The calculated value of the structure factor in arbitrary
     * units including the contribution of the solvent model.
     * @return PdbxFCalcWithSolvent
     */
    public PdbxFCalcWithSolvent getPdbxFCalcWithSolvent() {
        return (PdbxFCalcWithSolvent) (isText ? textFields.computeIfAbsent("pdbx_F_calc_with_solvent",
                PdbxFCalcWithSolvent::new) : getBinaryColumn("pdbx_F_calc_with_solvent"));
    }

    /**
     * The calculated structure-factor phase in degrees including
     * the contribution of the solvent model.
     * @return PdbxPhaseCalcWithSolvent
     */
    public PdbxPhaseCalcWithSolvent getPdbxPhaseCalcWithSolvent() {
        return (PdbxPhaseCalcWithSolvent) (isText ? textFields.computeIfAbsent("pdbx_phase_calc_with_solvent",
                PdbxPhaseCalcWithSolvent::new) : getBinaryColumn("pdbx_phase_calc_with_solvent"));
    }

    /**
     * The amplitude difference of the Friedel pair,
     * D(hkl) = F(hkl) - F(-h-k-l).
     * @return PdbxAnomDifference
     */
    public PdbxAnomDifference getPdbxAnomDifference() {
        return (PdbxAnomDifference) (isText ? textFields.computeIfAbsent("pdbx_anom_difference",
                PdbxAnomDifference::new) : getBinaryColumn("pdbx_anom_difference"));
    }

    /**
     * The the standard deviation of the amplitude difference
     * of the Friedel pair,  D(hkl) = F(hkl) - F(-h-k-l).
     * @return PdbxAnomDifferenceSigma
     */
    public PdbxAnomDifferenceSigma getPdbxAnomDifferenceSigma() {
        return (PdbxAnomDifferenceSigma) (isText ? textFields.computeIfAbsent("pdbx_anom_difference_sigma",
                PdbxAnomDifferenceSigma::new) : getBinaryColumn("pdbx_anom_difference_sigma"));
    }

    /**
     * The intensity of the I(h,k,l) partner of
     * the Friedel pair.
     * @return PdbxIPlus
     */
    public PdbxIPlus getPdbxIPlus() {
        return (PdbxIPlus) (isText ? textFields.computeIfAbsent("pdbx_I_plus",
                PdbxIPlus::new) : getBinaryColumn("pdbx_I_plus"));
    }

    /**
     * The intensity of the I(-h,-k,-l) partner
     * of the Friedel pair.
     * @return PdbxIMinus
     */
    public PdbxIMinus getPdbxIMinus() {
        return (PdbxIMinus) (isText ? textFields.computeIfAbsent("pdbx_I_minus",
                PdbxIMinus::new) : getBinaryColumn("pdbx_I_minus"));
    }

    /**
     * The structure factor F(h,k,l) of the Friedel pair.
     * @return PdbxFPlus
     */
    public PdbxFPlus getPdbxFPlus() {
        return (PdbxFPlus) (isText ? textFields.computeIfAbsent("pdbx_F_plus",
                PdbxFPlus::new) : getBinaryColumn("pdbx_F_plus"));
    }

    /**
     * The structure factor F(-h,-k,-l) of the Friedel pair.
     * @return PdbxFMinus
     */
    public PdbxFMinus getPdbxFMinus() {
        return (PdbxFMinus) (isText ? textFields.computeIfAbsent("pdbx_F_minus",
                PdbxFMinus::new) : getBinaryColumn("pdbx_F_minus"));
    }

    /**
     * The standard uncertainty (derived from measurement) of the
     * intensity I(h,k,l) partner of the Friedel pair.
     * @return PdbxIPlusSigma
     */
    public PdbxIPlusSigma getPdbxIPlusSigma() {
        return (PdbxIPlusSigma) (isText ? textFields.computeIfAbsent("pdbx_I_plus_sigma",
                PdbxIPlusSigma::new) : getBinaryColumn("pdbx_I_plus_sigma"));
    }

    /**
     * The standard uncertainty (derived from measurement) of the
     * intensity I(-h,-k,-l) partner of the Friedel pair.
     * @return PdbxIMinusSigma
     */
    public PdbxIMinusSigma getPdbxIMinusSigma() {
        return (PdbxIMinusSigma) (isText ? textFields.computeIfAbsent("pdbx_I_minus_sigma",
                PdbxIMinusSigma::new) : getBinaryColumn("pdbx_I_minus_sigma"));
    }

    /**
     * The standard uncertainty (derived from measurement) of the
     * structure factor F(-h,-k,-l) of the Friedel pair.
     * @return PdbxFMinusSigma
     */
    public PdbxFMinusSigma getPdbxFMinusSigma() {
        return (PdbxFMinusSigma) (isText ? textFields.computeIfAbsent("pdbx_F_minus_sigma",
                PdbxFMinusSigma::new) : getBinaryColumn("pdbx_F_minus_sigma"));
    }

    /**
     * The standard uncertainty (derived from measurement) of the
     * structure factor F(h,k,l) of the Friedel pair.
     * @return PdbxFPlusSigma
     */
    public PdbxFPlusSigma getPdbxFPlusSigma() {
        return (PdbxFPlusSigma) (isText ? textFields.computeIfAbsent("pdbx_F_plus_sigma",
                PdbxFPlusSigma::new) : getBinaryColumn("pdbx_F_plus_sigma"));
    }

    /**
     * The isomorphous Hendrickson-Lattman coefficient A~iso~ for this
     * reflection.
     * 
     * Ref: Hendrickson, W. A. & Lattman, E. E. (1970). Acta
     * Cryst. B26, 136-143.
     * @return PdbxHLAIso
     */
    public PdbxHLAIso getPdbxHLAIso() {
        return (PdbxHLAIso) (isText ? textFields.computeIfAbsent("pdbx_HL_A_iso",
                PdbxHLAIso::new) : getBinaryColumn("pdbx_HL_A_iso"));
    }

    /**
     * The isomorphous Hendrickson-Lattman coefficient B~iso~ for this
     * reflection.
     * 
     * Ref: Hendrickson, W. A. & Lattman, E. E. (1970). Acta
     * Cryst. B26, 136-143.
     * @return PdbxHLBIso
     */
    public PdbxHLBIso getPdbxHLBIso() {
        return (PdbxHLBIso) (isText ? textFields.computeIfAbsent("pdbx_HL_B_iso",
                PdbxHLBIso::new) : getBinaryColumn("pdbx_HL_B_iso"));
    }

    /**
     * The isomorphous Hendrickson-Lattman coefficient C~iso~ for this
     * reflection.
     * 
     * Ref: Hendrickson, W. A. & Lattman, E. E. (1970). Acta
     * Cryst. B26, 136-143.
     * @return PdbxHLCIso
     */
    public PdbxHLCIso getPdbxHLCIso() {
        return (PdbxHLCIso) (isText ? textFields.computeIfAbsent("pdbx_HL_C_iso",
                PdbxHLCIso::new) : getBinaryColumn("pdbx_HL_C_iso"));
    }

    /**
     * The isomorphous Hendrickson-Lattman coefficient D~iso~ for this
     * reflection.
     * 
     * Ref: Hendrickson, W. A. & Lattman, E. E. (1970). Acta
     * Cryst. B26, 136-143.
     * @return PdbxHLDIso
     */
    public PdbxHLDIso getPdbxHLDIso() {
        return (PdbxHLDIso) (isText ? textFields.computeIfAbsent("pdbx_HL_D_iso",
                PdbxHLDIso::new) : getBinaryColumn("pdbx_HL_D_iso"));
    }

    /**
     * The fiber layer line for this reflection.
     * @return PdbxFiberLayer
     */
    public PdbxFiberLayer getPdbxFiberLayer() {
        return (PdbxFiberLayer) (isText ? textFields.computeIfAbsent("pdbx_fiber_layer",
                PdbxFiberLayer::new) : getBinaryColumn("pdbx_fiber_layer"));
    }

    /**
     * The coordinate position in reciprocal space along the fiber layer line
     * for this reflection.
     * @return PdbxFiberCoordinate
     */
    public PdbxFiberCoordinate getPdbxFiberCoordinate() {
        return (PdbxFiberCoordinate) (isText ? textFields.computeIfAbsent("pdbx_fiber_coordinate",
                PdbxFiberCoordinate::new) : getBinaryColumn("pdbx_fiber_coordinate"));
    }

    /**
     * The measured diffraction amplitude for this fiber reflection in arbitrary units.
     * @return PdbxFiberFMeasAu
     */
    public PdbxFiberFMeasAu getPdbxFiberFMeasAu() {
        return (PdbxFiberFMeasAu) (isText ? textFields.computeIfAbsent("pdbx_fiber_F_meas_au",
                PdbxFiberFMeasAu::new) : getBinaryColumn("pdbx_fiber_F_meas_au"));
    }

    /**
     * The weighted structure factor amplitude for the 2mFo-DFc map.
     * @return PdbxFWT
     */
    public PdbxFWT getPdbxFWT() {
        return (PdbxFWT) (isText ? textFields.computeIfAbsent("pdbx_FWT",
                PdbxFWT::new) : getBinaryColumn("pdbx_FWT"));
    }

    /**
     * The weighted phase for the 2mFo-DFc map.
     * @return PdbxPHWT
     */
    public PdbxPHWT getPdbxPHWT() {
        return (PdbxPHWT) (isText ? textFields.computeIfAbsent("pdbx_PHWT",
                PdbxPHWT::new) : getBinaryColumn("pdbx_PHWT"));
    }

    /**
     * The weighted structure factor amplitude for the mFo-DFc map.
     * @return PdbxDELFWT
     */
    public PdbxDELFWT getPdbxDELFWT() {
        return (PdbxDELFWT) (isText ? textFields.computeIfAbsent("pdbx_DELFWT",
                PdbxDELFWT::new) : getBinaryColumn("pdbx_DELFWT"));
    }

    /**
     * The weighted phase for the mFo-DFc map.
     * @return PdbxDELPHWT
     */
    public PdbxDELPHWT getPdbxDELPHWT() {
        return (PdbxDELPHWT) (isText ? textFields.computeIfAbsent("pdbx_DELPHWT",
                PdbxDELPHWT::new) : getBinaryColumn("pdbx_DELPHWT"));
    }

    /**
     * An optional identifier for the diffraction data set containing this reflection.
     * @return PdbxDiffrnId
     */
    public PdbxDiffrnId getPdbxDiffrnId() {
        return (PdbxDiffrnId) (isText ? textFields.computeIfAbsent("pdbx_diffrn_id",
                PdbxDiffrnId::new) : getBinaryColumn("pdbx_diffrn_id"));
    }

    /**
     * The R-free flag originally assigned to the reflection.  The convention used for
     * labeling the work and test sets differs depending on choice of data processing
     * software and refinement program.
     * @return PdbxRFreeFlag
     */
    public PdbxRFreeFlag getPdbxRFreeFlag() {
        return (PdbxRFreeFlag) (isText ? textFields.computeIfAbsent("pdbx_r_free_flag",
                PdbxRFreeFlag::new) : getBinaryColumn("pdbx_r_free_flag"));
    }

    /**
     * The measured anomalous difference.
     * @return PdbxAnomalousDiff
     */
    public PdbxAnomalousDiff getPdbxAnomalousDiff() {
        return (PdbxAnomalousDiff) (isText ? textFields.computeIfAbsent("pdbx_anomalous_diff",
                PdbxAnomalousDiff::new) : getBinaryColumn("pdbx_anomalous_diff"));
    }

    /**
     * The standard deviation in the anomalous difference.
     * @return PdbxAnomalousDiffSigma
     */
    public PdbxAnomalousDiffSigma getPdbxAnomalousDiffSigma() {
        return (PdbxAnomalousDiffSigma) (isText ? textFields.computeIfAbsent("pdbx_anomalous_diff_sigma",
                PdbxAnomalousDiffSigma::new) : getBinaryColumn("pdbx_anomalous_diff_sigma"));
    }

    /**
     * The phasing cycle.
     * @return PdbxPhaseCycle
     */
    public PdbxPhaseCycle getPdbxPhaseCycle() {
        return (PdbxPhaseCycle) (isText ? textFields.computeIfAbsent("pdbx_phase_cycle",
                PdbxPhaseCycle::new) : getBinaryColumn("pdbx_phase_cycle"));
    }

    /**
     * The cosine of the calculated phase
     * @return PdbxCosPhaseCalc
     */
    public PdbxCosPhaseCalc getPdbxCosPhaseCalc() {
        return (PdbxCosPhaseCalc) (isText ? textFields.computeIfAbsent("pdbx_cos_phase_calc",
                PdbxCosPhaseCalc::new) : getBinaryColumn("pdbx_cos_phase_calc"));
    }

    /**
     * The sine of the calculated phase.
     * @return PdbxSinPhaseCalc
     */
    public PdbxSinPhaseCalc getPdbxSinPhaseCalc() {
        return (PdbxSinPhaseCalc) (isText ? textFields.computeIfAbsent("pdbx_sin_phase_calc",
                PdbxSinPhaseCalc::new) : getBinaryColumn("pdbx_sin_phase_calc"));
    }
}
