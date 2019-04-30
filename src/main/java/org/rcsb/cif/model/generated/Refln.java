package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

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
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return FloatColumn
     */
    public FloatColumn getACalc() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("A_calc", FloatColumn::new) :
                getBinaryColumn("A_calc"));
    }

    /**
     * The calculated value of structure-factor component A in
     * arbitrary units.
     * 
     * A = |F|cos(phase)
     * @return FloatColumn
     */
    public FloatColumn getACalcAu() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("A_calc_au", FloatColumn::new) :
                getBinaryColumn("A_calc_au"));
    }

    /**
     * The measured value of structure-factor component A in electrons.
     * 
     * A = |F|cos(phase)
     * @return FloatColumn
     */
    public FloatColumn getAMeas() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("A_meas", FloatColumn::new) :
                getBinaryColumn("A_meas"));
    }

    /**
     * The measured value of structure-factor component A in
     * arbitrary units.
     * 
     * A = |F|cos(phase)
     * @return FloatColumn
     */
    public FloatColumn getAMeasAu() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("A_meas_au", FloatColumn::new) :
                getBinaryColumn("A_meas_au"));
    }

    /**
     * The calculated value of structure-factor component B in
     * electrons.
     * 
     * B = |F|sin(phase)
     * @return FloatColumn
     */
    public FloatColumn getBCalc() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("B_calc", FloatColumn::new) :
                getBinaryColumn("B_calc"));
    }

    /**
     * The calculated value of structure-factor component B in
     * arbitrary units.
     * 
     * B = |F|sin(phase)
     * @return FloatColumn
     */
    public FloatColumn getBCalcAu() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("B_calc_au", FloatColumn::new) :
                getBinaryColumn("B_calc_au"));
    }

    /**
     * The measured value of structure-factor component B in electrons.
     * 
     * B = |F|sin(phase)
     * @return FloatColumn
     */
    public FloatColumn getBMeas() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("B_meas", FloatColumn::new) :
                getBinaryColumn("B_meas"));
    }

    /**
     * The measured value of structure-factor component B in
     * arbitrary units.
     * 
     * B = |F|sin(phase)
     * @return FloatColumn
     */
    public FloatColumn getBMeasAu() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("B_meas_au", FloatColumn::new) :
                getBinaryColumn("B_meas_au"));
    }

    /**
     * This data item is a pointer to _exptl_crystal.id in the
     * EXPTL_CRYSTAL category.
     * @return StrColumn
     */
    public StrColumn getCrystalId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("crystal_id", StrColumn::new) :
                getBinaryColumn("crystal_id"));
    }

    /**
     * The calculated value of the structure factor in electrons.
     * @return FloatColumn
     */
    public FloatColumn getFCalc() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("F_calc", FloatColumn::new) :
                getBinaryColumn("F_calc"));
    }

    /**
     * The calculated value of the structure factor in arbitrary
     * units.
     * @return FloatColumn
     */
    public FloatColumn getFCalcAu() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("F_calc_au", FloatColumn::new) :
                getBinaryColumn("F_calc_au"));
    }

    /**
     * The measured value of the structure factor in electrons.
     * @return FloatColumn
     */
    public FloatColumn getFMeas() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("F_meas", FloatColumn::new) :
                getBinaryColumn("F_meas"));
    }

    /**
     * The measured value of the structure factor in arbitrary units.
     * @return FloatColumn
     */
    public FloatColumn getFMeasAu() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("F_meas_au", FloatColumn::new) :
                getBinaryColumn("F_meas_au"));
    }

    /**
     * The standard uncertainty (estimated standard deviation) of
     * _refln.F_meas in electrons.
     * @return FloatColumn
     */
    public FloatColumn getFMeasSigma() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("F_meas_sigma", FloatColumn::new) :
                getBinaryColumn("F_meas_sigma"));
    }

    /**
     * The standard uncertainty (estimated standard deviation) of
     * _refln.F_meas_au in arbitrary units.
     * @return FloatColumn
     */
    public FloatColumn getFMeasSigmaAu() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("F_meas_sigma_au", FloatColumn::new) :
                getBinaryColumn("F_meas_sigma_au"));
    }

    /**
     * The calculated value of the squared structure factor in
     * electrons squared.
     * @return FloatColumn
     */
    public FloatColumn getFSquaredCalc() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("F_squared_calc", FloatColumn::new) :
                getBinaryColumn("F_squared_calc"));
    }

    /**
     * The measured value of the squared structure factor in electrons
     * squared.
     * @return FloatColumn
     */
    public FloatColumn getFSquaredMeas() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("F_squared_meas", FloatColumn::new) :
                getBinaryColumn("F_squared_meas"));
    }

    /**
     * The standard uncertainty (derived from measurement) of the
     * squared structure factor in electrons squared.
     * @return FloatColumn
     */
    public FloatColumn getFSquaredSigma() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("F_squared_sigma", FloatColumn::new) :
                getBinaryColumn("F_squared_sigma"));
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
        return (FloatColumn) (isText ? textFields.computeIfAbsent("fom", FloatColumn::new) :
                getBinaryColumn("fom"));
    }

    /**
     * Miller index h of the reflection. The values of the Miller
     * indices in the REFLN category must correspond to the cell
     * defined by cell lengths and cell angles in the CELL category.
     * @return IntColumn
     */
    public IntColumn getIndexH() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("index_h", IntColumn::new) :
                getBinaryColumn("index_h"));
    }

    /**
     * Miller index k of the reflection. The values of the Miller
     * indices in the REFLN category must correspond to the cell
     * defined by cell lengths and cell angles in the CELL category.
     * @return IntColumn
     */
    public IntColumn getIndexK() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("index_k", IntColumn::new) :
                getBinaryColumn("index_k"));
    }

    /**
     * Miller index l of the reflection. The values of the Miller
     * indices in the REFLN category must correspond to the cell
     * defined by cell lengths and cell angles in the CELL category.
     * @return IntColumn
     */
    public IntColumn getIndexL() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("index_l", IntColumn::new) :
                getBinaryColumn("index_l"));
    }

    /**
     * The calculated value of the intensity in the same units as
     * _refln.intensity_meas.
     * @return FloatColumn
     */
    public FloatColumn getIntensityCalc() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("intensity_calc", FloatColumn::new) :
                getBinaryColumn("intensity_calc"));
    }

    /**
     * The measured value of the intensity.
     * @return FloatColumn
     */
    public FloatColumn getIntensityMeas() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("intensity_meas", FloatColumn::new) :
                getBinaryColumn("intensity_meas"));
    }

    /**
     * The standard uncertainty (derived from measurement) of the
     * intensity in the same units as _refln.intensity_meas.
     * @return FloatColumn
     */
    public FloatColumn getIntensitySigma() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("intensity_sigma", FloatColumn::new) :
                getBinaryColumn("intensity_sigma"));
    }

    /**
     * Classification of a reflection so as to indicate its status with
     * respect to inclusion in the refinement and the calculation of
     * R factors.
     * @return StrColumn
     */
    public StrColumn getStatus() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("status", StrColumn::new) :
                getBinaryColumn("status"));
    }

    /**
     * The calculated structure-factor phase in degrees.
     * @return FloatColumn
     */
    public FloatColumn getPhaseCalc() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("phase_calc", FloatColumn::new) :
                getBinaryColumn("phase_calc"));
    }

    /**
     * The measured structure-factor phase in degrees.
     * @return FloatColumn
     */
    public FloatColumn getPhaseMeas() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("phase_meas", FloatColumn::new) :
                getBinaryColumn("phase_meas"));
    }

    /**
     * Status of a reflection in the structure-refinement process.
     * @return StrColumn
     */
    public StrColumn getRefinementStatus() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("refinement_status", StrColumn::new) :
                getBinaryColumn("refinement_status"));
    }

    /**
     * This data item is a pointer to _reflns_scale.group_code in the
     * REFLNS_SCALE category.
     * @return StrColumn
     */
    public StrColumn getScaleGroupCode() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("scale_group_code", StrColumn::new) :
                getBinaryColumn("scale_group_code"));
    }

    /**
     * The (sin theta)/lambda value in reciprocal angstroms for this
     * reflection.
     * @return FloatColumn
     */
    public FloatColumn getSintOverLambda() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("sint_over_lambda", FloatColumn::new) :
                getBinaryColumn("sint_over_lambda"));
    }

    /**
     * The symmetry reinforcement factor corresponding to the number of
     * times the reflection indices are generated identically from the
     * space-group symmetry operations.
     * @return IntColumn
     */
    public IntColumn getSymmetryEpsilon() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("symmetry_epsilon", IntColumn::new) :
                getBinaryColumn("symmetry_epsilon"));
    }

    /**
     * The number of symmetry-equivalent reflections. The equivalent
     * reflections have the same structure-factor magnitudes because
     * of the space-group symmetry and the Friedel relationship.
     * @return IntColumn
     */
    public IntColumn getSymmetryMultiplicity() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("symmetry_multiplicity", IntColumn::new) :
                getBinaryColumn("symmetry_multiplicity"));
    }

    /**
     * The mean wavelength in angstroms of radiation used to measure
     * this reflection. This is an important parameter for data
     * collected using energy-dispersive detectors or the Laue
     * method.
     * @return FloatColumn
     */
    public FloatColumn getWavelength() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("wavelength", FloatColumn::new) :
                getBinaryColumn("wavelength"));
    }

    /**
     * This data item is a pointer to _diffrn_radiation.wavelength_id in
     * the DIFFRN_RADIATION category.
     * @return StrColumn
     */
    public StrColumn getWavelengthId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("wavelength_id", StrColumn::new) :
                getBinaryColumn("wavelength_id"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("class_code", StrColumn::new) :
                getBinaryColumn("class_code"));
    }

    /**
     * The d spacing in angstroms for this reflection. This is related
     * to the (sin theta)/lambda value by the expression
     * _refln.d_spacing = 2/(_refln.sint/lambda).
     * @return FloatColumn
     */
    public FloatColumn getDSpacing() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("d_spacing", FloatColumn::new) :
                getBinaryColumn("d_spacing"));
    }

    /**
     * Classification of a reflection so as to indicate its status with
     * respect to inclusion in the refinement and the calculation of
     * R factors.
     * @return StrColumn
     */
    public StrColumn getIncludeStatus() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("include_status", StrColumn::new) :
                getBinaryColumn("include_status"));
    }

    /**
     * Mean path length in millimetres through the crystal for this
     * reflection.
     * @return FloatColumn
     */
    public FloatColumn getMeanPathLengthTbar() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("mean_path_length_tbar", FloatColumn::new) :
                getBinaryColumn("mean_path_length_tbar"));
    }

    /**
     * The calculated value of the structure factor in arbitrary
     * units reflecting only the contribution of the solvent model.
     * @return FloatColumn
     */
    public FloatColumn getPdbxFCalcPartSolvent() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_F_calc_part_solvent", FloatColumn::new) :
                getBinaryColumn("pdbx_F_calc_part_solvent"));
    }

    /**
     * The calculated structure-factor phase in degrees reflecting
     * only the contribution of the solvent model.
     * @return FloatColumn
     */
    public FloatColumn getPdbxPhaseCalcPartSolvent() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_phase_calc_part_solvent", FloatColumn::new) :
                getBinaryColumn("pdbx_phase_calc_part_solvent"));
    }

    /**
     * The calculated value of the structure factor in arbitrary
     * units including the contribution of the solvent model.
     * @return FloatColumn
     */
    public FloatColumn getPdbxFCalcWithSolvent() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_F_calc_with_solvent", FloatColumn::new) :
                getBinaryColumn("pdbx_F_calc_with_solvent"));
    }

    /**
     * The calculated structure-factor phase in degrees including
     * the contribution of the solvent model.
     * @return FloatColumn
     */
    public FloatColumn getPdbxPhaseCalcWithSolvent() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_phase_calc_with_solvent", FloatColumn::new) :
                getBinaryColumn("pdbx_phase_calc_with_solvent"));
    }

    /**
     * The amplitude difference of the Friedel pair,
     * D(hkl) = F(hkl) - F(-h-k-l).
     * @return FloatColumn
     */
    public FloatColumn getPdbxAnomDifference() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_anom_difference", FloatColumn::new) :
                getBinaryColumn("pdbx_anom_difference"));
    }

    /**
     * The the standard deviation of the amplitude difference
     * of the Friedel pair,  D(hkl) = F(hkl) - F(-h-k-l).
     * @return FloatColumn
     */
    public FloatColumn getPdbxAnomDifferenceSigma() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_anom_difference_sigma", FloatColumn::new) :
                getBinaryColumn("pdbx_anom_difference_sigma"));
    }

    /**
     * The intensity of the I(h,k,l) partner of
     * the Friedel pair.
     * @return FloatColumn
     */
    public FloatColumn getPdbxIPlus() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_I_plus", FloatColumn::new) :
                getBinaryColumn("pdbx_I_plus"));
    }

    /**
     * The intensity of the I(-h,-k,-l) partner
     * of the Friedel pair.
     * @return FloatColumn
     */
    public FloatColumn getPdbxIMinus() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_I_minus", FloatColumn::new) :
                getBinaryColumn("pdbx_I_minus"));
    }

    /**
     * The structure factor F(h,k,l) of the Friedel pair.
     * @return FloatColumn
     */
    public FloatColumn getPdbxFPlus() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_F_plus", FloatColumn::new) :
                getBinaryColumn("pdbx_F_plus"));
    }

    /**
     * The structure factor F(-h,-k,-l) of the Friedel pair.
     * @return FloatColumn
     */
    public FloatColumn getPdbxFMinus() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_F_minus", FloatColumn::new) :
                getBinaryColumn("pdbx_F_minus"));
    }

    /**
     * The standard uncertainty (derived from measurement) of the
     * intensity I(h,k,l) partner of the Friedel pair.
     * @return FloatColumn
     */
    public FloatColumn getPdbxIPlusSigma() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_I_plus_sigma", FloatColumn::new) :
                getBinaryColumn("pdbx_I_plus_sigma"));
    }

    /**
     * The standard uncertainty (derived from measurement) of the
     * intensity I(-h,-k,-l) partner of the Friedel pair.
     * @return FloatColumn
     */
    public FloatColumn getPdbxIMinusSigma() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_I_minus_sigma", FloatColumn::new) :
                getBinaryColumn("pdbx_I_minus_sigma"));
    }

    /**
     * The standard uncertainty (derived from measurement) of the
     * structure factor F(-h,-k,-l) of the Friedel pair.
     * @return FloatColumn
     */
    public FloatColumn getPdbxFMinusSigma() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_F_minus_sigma", FloatColumn::new) :
                getBinaryColumn("pdbx_F_minus_sigma"));
    }

    /**
     * The standard uncertainty (derived from measurement) of the
     * structure factor F(h,k,l) of the Friedel pair.
     * @return FloatColumn
     */
    public FloatColumn getPdbxFPlusSigma() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_F_plus_sigma", FloatColumn::new) :
                getBinaryColumn("pdbx_F_plus_sigma"));
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
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_HL_A_iso", FloatColumn::new) :
                getBinaryColumn("pdbx_HL_A_iso"));
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
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_HL_B_iso", FloatColumn::new) :
                getBinaryColumn("pdbx_HL_B_iso"));
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
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_HL_C_iso", FloatColumn::new) :
                getBinaryColumn("pdbx_HL_C_iso"));
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
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_HL_D_iso", FloatColumn::new) :
                getBinaryColumn("pdbx_HL_D_iso"));
    }

    /**
     * The fiber layer line for this reflection.
     * @return IntColumn
     */
    public IntColumn getPdbxFiberLayer() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("pdbx_fiber_layer", IntColumn::new) :
                getBinaryColumn("pdbx_fiber_layer"));
    }

    /**
     * The coordinate position in reciprocal space along the fiber layer line
     * for this reflection.
     * @return FloatColumn
     */
    public FloatColumn getPdbxFiberCoordinate() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_fiber_coordinate", FloatColumn::new) :
                getBinaryColumn("pdbx_fiber_coordinate"));
    }

    /**
     * The measured diffraction amplitude for this fiber reflection in arbitrary units.
     * @return FloatColumn
     */
    public FloatColumn getPdbxFiberFMeasAu() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_fiber_F_meas_au", FloatColumn::new) :
                getBinaryColumn("pdbx_fiber_F_meas_au"));
    }

    /**
     * The weighted structure factor amplitude for the 2mFo-DFc map.
     * @return FloatColumn
     */
    public FloatColumn getPdbxFWT() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_FWT", FloatColumn::new) :
                getBinaryColumn("pdbx_FWT"));
    }

    /**
     * The weighted phase for the 2mFo-DFc map.
     * @return FloatColumn
     */
    public FloatColumn getPdbxPHWT() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_PHWT", FloatColumn::new) :
                getBinaryColumn("pdbx_PHWT"));
    }

    /**
     * The weighted structure factor amplitude for the mFo-DFc map.
     * @return FloatColumn
     */
    public FloatColumn getPdbxDELFWT() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_DELFWT", FloatColumn::new) :
                getBinaryColumn("pdbx_DELFWT"));
    }

    /**
     * The weighted phase for the mFo-DFc map.
     * @return FloatColumn
     */
    public FloatColumn getPdbxDELPHWT() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_DELPHWT", FloatColumn::new) :
                getBinaryColumn("pdbx_DELPHWT"));
    }

    /**
     * An optional identifier for the diffraction data set containing this reflection.
     * @return StrColumn
     */
    public StrColumn getPdbxDiffrnId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_diffrn_id", StrColumn::new) :
                getBinaryColumn("pdbx_diffrn_id"));
    }

    /**
     * The R-free flag originally assigned to the reflection.  The convention used for
     * labeling the work and test sets differs depending on choice of data processing
     * software and refinement program.
     * @return IntColumn
     */
    public IntColumn getPdbxRFreeFlag() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("pdbx_r_free_flag", IntColumn::new) :
                getBinaryColumn("pdbx_r_free_flag"));
    }

    /**
     * The measured anomalous difference.
     * @return FloatColumn
     */
    public FloatColumn getPdbxAnomalousDiff() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_anomalous_diff", FloatColumn::new) :
                getBinaryColumn("pdbx_anomalous_diff"));
    }

    /**
     * The standard deviation in the anomalous difference.
     * @return FloatColumn
     */
    public FloatColumn getPdbxAnomalousDiffSigma() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_anomalous_diff_sigma", FloatColumn::new) :
                getBinaryColumn("pdbx_anomalous_diff_sigma"));
    }

    /**
     * The phasing cycle.
     * @return FloatColumn
     */
    public FloatColumn getPdbxPhaseCycle() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_phase_cycle", FloatColumn::new) :
                getBinaryColumn("pdbx_phase_cycle"));
    }

    /**
     * The cosine of the calculated phase
     * @return FloatColumn
     */
    public FloatColumn getPdbxCosPhaseCalc() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_cos_phase_calc", FloatColumn::new) :
                getBinaryColumn("pdbx_cos_phase_calc"));
    }

    /**
     * The sine of the calculated phase.
     * @return FloatColumn
     */
    public FloatColumn getPdbxSinPhaseCalc() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_sin_phase_calc", FloatColumn::new) :
                getBinaryColumn("pdbx_sin_phase_calc"));
    }
}
