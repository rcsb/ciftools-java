package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the REFLN category record details about the
 * reflection data used to determine the ATOM_SITE data items.
 * 
 * The REFLN data items refer to individual reflections and must
 * be included in looped lists.
 * 
 * The REFLNS data items specify the parameters that apply to all
 * reflections. The REFLNS data items are not looped.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class Refln extends DelegatingCategory {
    public Refln(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "A_calc":
                return getACalc();
            case "A_calc_au":
                return getACalcAu();
            case "A_meas":
                return getAMeas();
            case "A_meas_au":
                return getAMeasAu();
            case "B_calc":
                return getBCalc();
            case "B_calc_au":
                return getBCalcAu();
            case "B_meas":
                return getBMeas();
            case "B_meas_au":
                return getBMeasAu();
            case "crystal_id":
                return getCrystalId();
            case "F_calc":
                return getFCalc();
            case "F_calc_au":
                return getFCalcAu();
            case "F_meas":
                return getFMeas();
            case "F_meas_au":
                return getFMeasAu();
            case "F_meas_sigma":
                return getFMeasSigma();
            case "F_meas_sigma_au":
                return getFMeasSigmaAu();
            case "F_squared_calc":
                return getFSquaredCalc();
            case "F_squared_meas":
                return getFSquaredMeas();
            case "F_squared_sigma":
                return getFSquaredSigma();
            case "fom":
                return getFom();
            case "index_h":
                return getIndexH();
            case "index_k":
                return getIndexK();
            case "index_l":
                return getIndexL();
            case "intensity_calc":
                return getIntensityCalc();
            case "intensity_meas":
                return getIntensityMeas();
            case "intensity_sigma":
                return getIntensitySigma();
            case "status":
                return getStatus();
            case "phase_calc":
                return getPhaseCalc();
            case "phase_meas":
                return getPhaseMeas();
            case "refinement_status":
                return getRefinementStatus();
            case "scale_group_code":
                return getScaleGroupCode();
            case "sint_over_lambda":
                return getSintOverLambda();
            case "symmetry_epsilon":
                return getSymmetryEpsilon();
            case "symmetry_multiplicity":
                return getSymmetryMultiplicity();
            case "wavelength":
                return getWavelength();
            case "wavelength_id":
                return getWavelengthId();
            case "class_code":
                return getClassCode();
            case "d_spacing":
                return getDSpacing();
            case "include_status":
                return getIncludeStatus();
            case "mean_path_length_tbar":
                return getMeanPathLengthTbar();
            case "pdbx_F_calc_part_solvent":
                return getPdbxFCalcPartSolvent();
            case "pdbx_phase_calc_part_solvent":
                return getPdbxPhaseCalcPartSolvent();
            case "pdbx_F_calc_with_solvent":
                return getPdbxFCalcWithSolvent();
            case "pdbx_phase_calc_with_solvent":
                return getPdbxPhaseCalcWithSolvent();
            case "pdbx_anom_difference":
                return getPdbxAnomDifference();
            case "pdbx_anom_difference_sigma":
                return getPdbxAnomDifferenceSigma();
            case "pdbx_I_plus":
                return getPdbxIPlus();
            case "pdbx_I_minus":
                return getPdbxIMinus();
            case "pdbx_F_plus":
                return getPdbxFPlus();
            case "pdbx_F_minus":
                return getPdbxFMinus();
            case "pdbx_I_plus_sigma":
                return getPdbxIPlusSigma();
            case "pdbx_I_minus_sigma":
                return getPdbxIMinusSigma();
            case "pdbx_F_minus_sigma":
                return getPdbxFMinusSigma();
            case "pdbx_F_plus_sigma":
                return getPdbxFPlusSigma();
            case "pdbx_HL_A_iso":
                return getPdbxHLAIso();
            case "pdbx_HL_B_iso":
                return getPdbxHLBIso();
            case "pdbx_HL_C_iso":
                return getPdbxHLCIso();
            case "pdbx_HL_D_iso":
                return getPdbxHLDIso();
            case "pdbx_fiber_layer":
                return getPdbxFiberLayer();
            case "pdbx_fiber_coordinate":
                return getPdbxFiberCoordinate();
            case "pdbx_fiber_F_meas_au":
                return getPdbxFiberFMeasAu();
            case "pdbx_FWT":
                return getPdbxFWT();
            case "pdbx_PHWT":
                return getPdbxPHWT();
            case "pdbx_DELFWT":
                return getPdbxDELFWT();
            case "pdbx_DELPHWT":
                return getPdbxDELPHWT();
            case "pdbx_diffrn_id":
                return getPdbxDiffrnId();
            case "pdbx_r_free_flag":
                return getPdbxRFreeFlag();
            case "pdbx_anomalous_diff":
                return getPdbxAnomalousDiff();
            case "pdbx_anomalous_diff_sigma":
                return getPdbxAnomalousDiffSigma();
            case "pdbx_phase_cycle":
                return getPdbxPhaseCycle();
            case "pdbx_cos_phase_calc":
                return getPdbxCosPhaseCalc();
            case "pdbx_sin_phase_calc":
                return getPdbxSinPhaseCalc();
            case "pdbx_signal":
                return getPdbxSignal();
            case "pdbx_signal_status":
                return getPdbxSignalStatus();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The calculated value of structure-factor component A in
     * electrons.
     * 
     * A = |F|cos(phase)
     * @return FloatColumn
     */
    public FloatColumn getACalc() {
        return delegate.getColumn("A_calc", DelegatingFloatColumn::new);
    }

    /**
     * The calculated value of structure-factor component A in
     * arbitrary units.
     * 
     * A = |F|cos(phase)
     * @return FloatColumn
     */
    public FloatColumn getACalcAu() {
        return delegate.getColumn("A_calc_au", DelegatingFloatColumn::new);
    }

    /**
     * The measured value of structure-factor component A in electrons.
     * 
     * A = |F|cos(phase)
     * @return FloatColumn
     */
    public FloatColumn getAMeas() {
        return delegate.getColumn("A_meas", DelegatingFloatColumn::new);
    }

    /**
     * The measured value of structure-factor component A in
     * arbitrary units.
     * 
     * A = |F|cos(phase)
     * @return FloatColumn
     */
    public FloatColumn getAMeasAu() {
        return delegate.getColumn("A_meas_au", DelegatingFloatColumn::new);
    }

    /**
     * The calculated value of structure-factor component B in
     * electrons.
     * 
     * B = |F|sin(phase)
     * @return FloatColumn
     */
    public FloatColumn getBCalc() {
        return delegate.getColumn("B_calc", DelegatingFloatColumn::new);
    }

    /**
     * The calculated value of structure-factor component B in
     * arbitrary units.
     * 
     * B = |F|sin(phase)
     * @return FloatColumn
     */
    public FloatColumn getBCalcAu() {
        return delegate.getColumn("B_calc_au", DelegatingFloatColumn::new);
    }

    /**
     * The measured value of structure-factor component B in electrons.
     * 
     * B = |F|sin(phase)
     * @return FloatColumn
     */
    public FloatColumn getBMeas() {
        return delegate.getColumn("B_meas", DelegatingFloatColumn::new);
    }

    /**
     * The measured value of structure-factor component B in
     * arbitrary units.
     * 
     * B = |F|sin(phase)
     * @return FloatColumn
     */
    public FloatColumn getBMeasAu() {
        return delegate.getColumn("B_meas_au", DelegatingFloatColumn::new);
    }

    /**
     * This data item is a pointer to _exptl_crystal.id in the
     * EXPTL_CRYSTAL category.
     * @return StrColumn
     */
    public StrColumn getCrystalId() {
        return delegate.getColumn("crystal_id", DelegatingStrColumn::new);
    }

    /**
     * The calculated value of the structure factor in electrons.
     * @return FloatColumn
     */
    public FloatColumn getFCalc() {
        return delegate.getColumn("F_calc", DelegatingFloatColumn::new);
    }

    /**
     * The calculated value of the structure factor in arbitrary
     * units.
     * @return FloatColumn
     */
    public FloatColumn getFCalcAu() {
        return delegate.getColumn("F_calc_au", DelegatingFloatColumn::new);
    }

    /**
     * The measured value of the structure factor in electrons.
     * @return FloatColumn
     */
    public FloatColumn getFMeas() {
        return delegate.getColumn("F_meas", DelegatingFloatColumn::new);
    }

    /**
     * The measured value of the structure factor in arbitrary units.
     * @return FloatColumn
     */
    public FloatColumn getFMeasAu() {
        return delegate.getColumn("F_meas_au", DelegatingFloatColumn::new);
    }

    /**
     * The standard uncertainty (estimated standard deviation) of
     * _refln.F_meas in electrons.
     * @return FloatColumn
     */
    public FloatColumn getFMeasSigma() {
        return delegate.getColumn("F_meas_sigma", DelegatingFloatColumn::new);
    }

    /**
     * The standard uncertainty (estimated standard deviation) of
     * _refln.F_meas_au in arbitrary units.
     * @return FloatColumn
     */
    public FloatColumn getFMeasSigmaAu() {
        return delegate.getColumn("F_meas_sigma_au", DelegatingFloatColumn::new);
    }

    /**
     * The calculated value of the squared structure factor in
     * electrons squared.
     * @return FloatColumn
     */
    public FloatColumn getFSquaredCalc() {
        return delegate.getColumn("F_squared_calc", DelegatingFloatColumn::new);
    }

    /**
     * The measured value of the squared structure factor in electrons
     * squared.
     * @return FloatColumn
     */
    public FloatColumn getFSquaredMeas() {
        return delegate.getColumn("F_squared_meas", DelegatingFloatColumn::new);
    }

    /**
     * The standard uncertainty (derived from measurement) of the
     * squared structure factor in electrons squared.
     * @return FloatColumn
     */
    public FloatColumn getFSquaredSigma() {
        return delegate.getColumn("F_squared_sigma", DelegatingFloatColumn::new);
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
     * @return FloatColumn
     */
    public FloatColumn getFom() {
        return delegate.getColumn("fom", DelegatingFloatColumn::new);
    }

    /**
     * Miller index h of the reflection. The values of the Miller
     * indices in the REFLN category must correspond to the cell
     * defined by cell lengths and cell angles in the CELL category.
     * @return IntColumn
     */
    public IntColumn getIndexH() {
        return delegate.getColumn("index_h", DelegatingIntColumn::new);
    }

    /**
     * Miller index k of the reflection. The values of the Miller
     * indices in the REFLN category must correspond to the cell
     * defined by cell lengths and cell angles in the CELL category.
     * @return IntColumn
     */
    public IntColumn getIndexK() {
        return delegate.getColumn("index_k", DelegatingIntColumn::new);
    }

    /**
     * Miller index l of the reflection. The values of the Miller
     * indices in the REFLN category must correspond to the cell
     * defined by cell lengths and cell angles in the CELL category.
     * @return IntColumn
     */
    public IntColumn getIndexL() {
        return delegate.getColumn("index_l", DelegatingIntColumn::new);
    }

    /**
     * The calculated value of the intensity in the same units as
     * _refln.intensity_meas.
     * @return FloatColumn
     */
    public FloatColumn getIntensityCalc() {
        return delegate.getColumn("intensity_calc", DelegatingFloatColumn::new);
    }

    /**
     * The measured value of the intensity.
     * @return FloatColumn
     */
    public FloatColumn getIntensityMeas() {
        return delegate.getColumn("intensity_meas", DelegatingFloatColumn::new);
    }

    /**
     * The standard uncertainty (derived from measurement) of the
     * intensity in the same units as _refln.intensity_meas.
     * @return FloatColumn
     */
    public FloatColumn getIntensitySigma() {
        return delegate.getColumn("intensity_sigma", DelegatingFloatColumn::new);
    }

    /**
     * Classification of a reflection so as to indicate its status with
     * respect to inclusion in the refinement and the calculation of
     * R factors.
     * @return StrColumn
     */
    public StrColumn getStatus() {
        return delegate.getColumn("status", DelegatingStrColumn::new);
    }

    /**
     * The calculated structure-factor phase in degrees.
     * @return FloatColumn
     */
    public FloatColumn getPhaseCalc() {
        return delegate.getColumn("phase_calc", DelegatingFloatColumn::new);
    }

    /**
     * The measured structure-factor phase in degrees.
     * @return FloatColumn
     */
    public FloatColumn getPhaseMeas() {
        return delegate.getColumn("phase_meas", DelegatingFloatColumn::new);
    }

    /**
     * Status of a reflection in the structure-refinement process.
     * @return StrColumn
     */
    public StrColumn getRefinementStatus() {
        return delegate.getColumn("refinement_status", DelegatingStrColumn::new);
    }

    /**
     * This data item is a pointer to _reflns_scale.group_code in the
     * REFLNS_SCALE category.
     * @return StrColumn
     */
    public StrColumn getScaleGroupCode() {
        return delegate.getColumn("scale_group_code", DelegatingStrColumn::new);
    }

    /**
     * The (sin theta)/lambda value in reciprocal angstroms for this
     * reflection.
     * @return FloatColumn
     */
    public FloatColumn getSintOverLambda() {
        return delegate.getColumn("sint_over_lambda", DelegatingFloatColumn::new);
    }

    /**
     * The symmetry reinforcement factor corresponding to the number of
     * times the reflection indices are generated identically from the
     * space-group symmetry operations.
     * @return IntColumn
     */
    public IntColumn getSymmetryEpsilon() {
        return delegate.getColumn("symmetry_epsilon", DelegatingIntColumn::new);
    }

    /**
     * The number of symmetry-equivalent reflections. The equivalent
     * reflections have the same structure-factor magnitudes because
     * of the space-group symmetry and the Friedel relationship.
     * @return IntColumn
     */
    public IntColumn getSymmetryMultiplicity() {
        return delegate.getColumn("symmetry_multiplicity", DelegatingIntColumn::new);
    }

    /**
     * The mean wavelength in angstroms of radiation used to measure
     * this reflection. This is an important parameter for data
     * collected using energy-dispersive detectors or the Laue
     * method.
     * @return FloatColumn
     */
    public FloatColumn getWavelength() {
        return delegate.getColumn("wavelength", DelegatingFloatColumn::new);
    }

    /**
     * This data item is a pointer to _diffrn_radiation.wavelength_id in
     * the DIFFRN_RADIATION category.
     * @return StrColumn
     */
    public StrColumn getWavelengthId() {
        return delegate.getColumn("wavelength_id", DelegatingStrColumn::new);
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
     * @return StrColumn
     */
    public StrColumn getClassCode() {
        return delegate.getColumn("class_code", DelegatingStrColumn::new);
    }

    /**
     * The d spacing in angstroms for this reflection. This is related
     * to the (sin theta)/lambda value by the expression
     * _refln.d_spacing = 2/(_refln.sint/lambda).
     * @return FloatColumn
     */
    public FloatColumn getDSpacing() {
        return delegate.getColumn("d_spacing", DelegatingFloatColumn::new);
    }

    /**
     * Classification of a reflection so as to indicate its status with
     * respect to inclusion in the refinement and the calculation of
     * R factors.
     * @return StrColumn
     */
    public StrColumn getIncludeStatus() {
        return delegate.getColumn("include_status", DelegatingStrColumn::new);
    }

    /**
     * Mean path length in millimetres through the crystal for this
     * reflection.
     * @return FloatColumn
     */
    public FloatColumn getMeanPathLengthTbar() {
        return delegate.getColumn("mean_path_length_tbar", DelegatingFloatColumn::new);
    }

    /**
     * The calculated value of the structure factor in arbitrary
     * units reflecting only the contribution of the solvent model.
     * @return FloatColumn
     */
    public FloatColumn getPdbxFCalcPartSolvent() {
        return delegate.getColumn("pdbx_F_calc_part_solvent", DelegatingFloatColumn::new);
    }

    /**
     * The calculated structure-factor phase in degrees reflecting
     * only the contribution of the solvent model.
     * @return FloatColumn
     */
    public FloatColumn getPdbxPhaseCalcPartSolvent() {
        return delegate.getColumn("pdbx_phase_calc_part_solvent", DelegatingFloatColumn::new);
    }

    /**
     * The calculated value of the structure factor in arbitrary
     * units including the contribution of the solvent model.
     * @return FloatColumn
     */
    public FloatColumn getPdbxFCalcWithSolvent() {
        return delegate.getColumn("pdbx_F_calc_with_solvent", DelegatingFloatColumn::new);
    }

    /**
     * The calculated structure-factor phase in degrees including
     * the contribution of the solvent model.
     * @return FloatColumn
     */
    public FloatColumn getPdbxPhaseCalcWithSolvent() {
        return delegate.getColumn("pdbx_phase_calc_with_solvent", DelegatingFloatColumn::new);
    }

    /**
     * The amplitude difference of the Friedel pair,
     * D(hkl) = F(hkl) - F(-h-k-l).
     * @return FloatColumn
     */
    public FloatColumn getPdbxAnomDifference() {
        return delegate.getColumn("pdbx_anom_difference", DelegatingFloatColumn::new);
    }

    /**
     * The standard deviation of the amplitude difference
     * of the Friedel pair,  D(hkl) = F(hkl) - F(-h-k-l).
     * @return FloatColumn
     */
    public FloatColumn getPdbxAnomDifferenceSigma() {
        return delegate.getColumn("pdbx_anom_difference_sigma", DelegatingFloatColumn::new);
    }

    /**
     * The intensity of the I(h,k,l) partner of
     * the Friedel pair.
     * @return FloatColumn
     */
    public FloatColumn getPdbxIPlus() {
        return delegate.getColumn("pdbx_I_plus", DelegatingFloatColumn::new);
    }

    /**
     * The intensity of the I(-h,-k,-l) partner
     * of the Friedel pair.
     * @return FloatColumn
     */
    public FloatColumn getPdbxIMinus() {
        return delegate.getColumn("pdbx_I_minus", DelegatingFloatColumn::new);
    }

    /**
     * The structure factor F(h,k,l) of the Friedel pair.
     * @return FloatColumn
     */
    public FloatColumn getPdbxFPlus() {
        return delegate.getColumn("pdbx_F_plus", DelegatingFloatColumn::new);
    }

    /**
     * The structure factor F(-h,-k,-l) of the Friedel pair.
     * @return FloatColumn
     */
    public FloatColumn getPdbxFMinus() {
        return delegate.getColumn("pdbx_F_minus", DelegatingFloatColumn::new);
    }

    /**
     * The standard uncertainty (derived from measurement) of the
     * intensity I(h,k,l) partner of the Friedel pair.
     * @return FloatColumn
     */
    public FloatColumn getPdbxIPlusSigma() {
        return delegate.getColumn("pdbx_I_plus_sigma", DelegatingFloatColumn::new);
    }

    /**
     * The standard uncertainty (derived from measurement) of the
     * intensity I(-h,-k,-l) partner of the Friedel pair.
     * @return FloatColumn
     */
    public FloatColumn getPdbxIMinusSigma() {
        return delegate.getColumn("pdbx_I_minus_sigma", DelegatingFloatColumn::new);
    }

    /**
     * The standard uncertainty (derived from measurement) of the
     * structure factor F(-h,-k,-l) of the Friedel pair.
     * @return FloatColumn
     */
    public FloatColumn getPdbxFMinusSigma() {
        return delegate.getColumn("pdbx_F_minus_sigma", DelegatingFloatColumn::new);
    }

    /**
     * The standard uncertainty (derived from measurement) of the
     * structure factor F(h,k,l) of the Friedel pair.
     * @return FloatColumn
     */
    public FloatColumn getPdbxFPlusSigma() {
        return delegate.getColumn("pdbx_F_plus_sigma", DelegatingFloatColumn::new);
    }

    /**
     * The isomorphous Hendrickson-Lattman coefficient A~iso~ for this
     * reflection.
     * 
     * Ref: Hendrickson, W. A. &amp; Lattman, E. E. (1970). Acta
     * Cryst. B26, 136-143.
     * @return FloatColumn
     */
    public FloatColumn getPdbxHLAIso() {
        return delegate.getColumn("pdbx_HL_A_iso", DelegatingFloatColumn::new);
    }

    /**
     * The isomorphous Hendrickson-Lattman coefficient B~iso~ for this
     * reflection.
     * 
     * Ref: Hendrickson, W. A. &amp; Lattman, E. E. (1970). Acta
     * Cryst. B26, 136-143.
     * @return FloatColumn
     */
    public FloatColumn getPdbxHLBIso() {
        return delegate.getColumn("pdbx_HL_B_iso", DelegatingFloatColumn::new);
    }

    /**
     * The isomorphous Hendrickson-Lattman coefficient C~iso~ for this
     * reflection.
     * 
     * Ref: Hendrickson, W. A. &amp; Lattman, E. E. (1970). Acta
     * Cryst. B26, 136-143.
     * @return FloatColumn
     */
    public FloatColumn getPdbxHLCIso() {
        return delegate.getColumn("pdbx_HL_C_iso", DelegatingFloatColumn::new);
    }

    /**
     * The isomorphous Hendrickson-Lattman coefficient D~iso~ for this
     * reflection.
     * 
     * Ref: Hendrickson, W. A. &amp; Lattman, E. E. (1970). Acta
     * Cryst. B26, 136-143.
     * @return FloatColumn
     */
    public FloatColumn getPdbxHLDIso() {
        return delegate.getColumn("pdbx_HL_D_iso", DelegatingFloatColumn::new);
    }

    /**
     * The fiber layer line for this reflection.
     * @return IntColumn
     */
    public IntColumn getPdbxFiberLayer() {
        return delegate.getColumn("pdbx_fiber_layer", DelegatingIntColumn::new);
    }

    /**
     * The coordinate position in reciprocal space along the fiber layer line
     * for this reflection.
     * @return FloatColumn
     */
    public FloatColumn getPdbxFiberCoordinate() {
        return delegate.getColumn("pdbx_fiber_coordinate", DelegatingFloatColumn::new);
    }

    /**
     * The measured diffraction amplitude for this fiber reflection in arbitrary units.
     * @return FloatColumn
     */
    public FloatColumn getPdbxFiberFMeasAu() {
        return delegate.getColumn("pdbx_fiber_F_meas_au", DelegatingFloatColumn::new);
    }

    /**
     * The weighted structure factor amplitude for the 2mFo-DFc map.
     * @return FloatColumn
     */
    public FloatColumn getPdbxFWT() {
        return delegate.getColumn("pdbx_FWT", DelegatingFloatColumn::new);
    }

    /**
     * The weighted phase for the 2mFo-DFc map.
     * @return FloatColumn
     */
    public FloatColumn getPdbxPHWT() {
        return delegate.getColumn("pdbx_PHWT", DelegatingFloatColumn::new);
    }

    /**
     * The weighted structure factor amplitude for the mFo-DFc map.
     * @return FloatColumn
     */
    public FloatColumn getPdbxDELFWT() {
        return delegate.getColumn("pdbx_DELFWT", DelegatingFloatColumn::new);
    }

    /**
     * The weighted phase for the mFo-DFc map.
     * @return FloatColumn
     */
    public FloatColumn getPdbxDELPHWT() {
        return delegate.getColumn("pdbx_DELPHWT", DelegatingFloatColumn::new);
    }

    /**
     * An optional identifier for the diffraction data set containing this reflection.
     * @return StrColumn
     */
    public StrColumn getPdbxDiffrnId() {
        return delegate.getColumn("pdbx_diffrn_id", DelegatingStrColumn::new);
    }

    /**
     * The R-free flag originally assigned to the reflection.  The convention used for
     * labeling the work and test sets differs depending on choice of data processing
     * software and refinement program.
     * @return IntColumn
     */
    public IntColumn getPdbxRFreeFlag() {
        return delegate.getColumn("pdbx_r_free_flag", DelegatingIntColumn::new);
    }

    /**
     * The measured anomalous difference.
     * @return FloatColumn
     */
    public FloatColumn getPdbxAnomalousDiff() {
        return delegate.getColumn("pdbx_anomalous_diff", DelegatingFloatColumn::new);
    }

    /**
     * The standard deviation in the anomalous difference.
     * @return FloatColumn
     */
    public FloatColumn getPdbxAnomalousDiffSigma() {
        return delegate.getColumn("pdbx_anomalous_diff_sigma", DelegatingFloatColumn::new);
    }

    /**
     * The phasing cycle.
     * @return FloatColumn
     */
    public FloatColumn getPdbxPhaseCycle() {
        return delegate.getColumn("pdbx_phase_cycle", DelegatingFloatColumn::new);
    }

    /**
     * The cosine of the calculated phase
     * @return FloatColumn
     */
    public FloatColumn getPdbxCosPhaseCalc() {
        return delegate.getColumn("pdbx_cos_phase_calc", DelegatingFloatColumn::new);
    }

    /**
     * The sine of the calculated phase.
     * @return FloatColumn
     */
    public FloatColumn getPdbxSinPhaseCalc() {
        return delegate.getColumn("pdbx_sin_phase_calc", DelegatingFloatColumn::new);
    }

    /**
     * The signal value for this reflection as defined by
     * _reflns.pdbx_signal_type and _reflns.pdbx_signal_details
     * as calculated by _reflns.pdbx_signal_software_id.
     * @return FloatColumn
     */
    public FloatColumn getPdbxSignal() {
        return delegate.getColumn("pdbx_signal", DelegatingFloatColumn::new);
    }

    /**
     * The status of a reflection related to _refln.pdbx_signal.
     * 
     * A measured reflection counts as observed if:
     * _refln.pdbx_signal &gt;= _reflns.pdbx_observed_signal_threshold
     * and unobserved if:
     * _refln.pdbx_signal &lt;  _reflns.pdbx_observed_signal_threshold
     * 
     * An unmeasured but observable reflection is one that has not
     * been measured, but the data processing has determined that it
     * would have been expected to be observed had it been measured.
     * 
     * An unmeasured and unobservable reflection is one that the data
     * processing has determined would not have been expected to be
     * observed.
     * 
     * In datasets in which _refln.pdbx_signal has been populated, a null
     * (?) value for this item indicates an unmeasured reflection for
     * which it is not known whether it is observable or not.
     * @return StrColumn
     */
    public StrColumn getPdbxSignalStatus() {
        return delegate.getColumn("pdbx_signal_status", DelegatingStrColumn::new);
    }

}