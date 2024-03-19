package org.rcsb.cif.schema.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * The CATEGORY of data items used to describe the reflection data
 * used in the refinement of a crystallographic structure model.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class Refln extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "refln";

    public Refln(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
    }

    /**
     * The calculated real structure-factor component A =|Fcalc|cos(phase)
     * @return FloatColumn
     */
    public FloatColumn getACalc() {
        return new DelegatingFloatColumn(parentBlock.getColumn("refln_a_calc"));
    }

    /**
     * Standard uncertainty of _refln.A_calc.
     * @return FloatColumn
     */
    public FloatColumn getACalcSu() {
        return new DelegatingFloatColumn(parentBlock.getColumn("refln_a_calc_su"));
    }

    /**
     * The measured real structure-factor component A =|Fmeas|cos(phase)
     * @return FloatColumn
     */
    public FloatColumn getAMeas() {
        return new DelegatingFloatColumn(parentBlock.getColumn("refln_a_meas"));
    }

    /**
     * Standard uncertainty of _refln.A_meas.
     * @return FloatColumn
     */
    public FloatColumn getAMeasSu() {
        return new DelegatingFloatColumn(parentBlock.getColumn("refln_a_meas_su"));
    }

    /**
     * The calculated imaginary structure-factor component B =|Fcalc|sin(phase)
     * @return FloatColumn
     */
    public FloatColumn getBCalc() {
        return new DelegatingFloatColumn(parentBlock.getColumn("refln_b_calc"));
    }

    /**
     * Standard uncertainty of _refln.B_calc.
     * @return FloatColumn
     */
    public FloatColumn getBCalcSu() {
        return new DelegatingFloatColumn(parentBlock.getColumn("refln_b_calc_su"));
    }

    /**
     * The measured imaginary structure-factor component B =|Fmeas|sin(phase)
     * @return FloatColumn
     */
    public FloatColumn getBMeas() {
        return new DelegatingFloatColumn(parentBlock.getColumn("refln_b_meas"));
    }

    /**
     * Standard uncertainty of _refln.B_meas.
     * @return FloatColumn
     */
    public FloatColumn getBMeasSu() {
        return new DelegatingFloatColumn(parentBlock.getColumn("refln_b_meas_su"));
    }

    /**
     * Code identifying the class to which this reflection has been
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
        return new DelegatingStrColumn(parentBlock.getColumn("refln_class_code"));
    }

    /**
     * The distance in angstroms between lattice planes in the crystal
     * with the indices _refln.hkl for this reflection.
     * @return FloatColumn
     */
    public FloatColumn getDSpacing() {
        return new DelegatingFloatColumn(parentBlock.getColumn("refln_d_spacing"));
    }

    /**
     * The structure factor amplitude for the reflection calculated from
     * the atom site data.
     * @return FloatColumn
     */
    public FloatColumn getFCalc() {
        return new DelegatingFloatColumn(parentBlock.getColumn("refln_f_calc"));
    }

    /**
     * Standard uncertainty of _refln.F_calc.
     * @return FloatColumn
     */
    public FloatColumn getFCalcSu() {
        return new DelegatingFloatColumn(parentBlock.getColumn("refln_f_calc_su"));
    }

    /**
     * The structure factor vector for the reflection calculated from
     * the atom site data.
     * @return StrColumn
     */
    public StrColumn getFComplex() {
        return new DelegatingStrColumn(parentBlock.getColumn("refln_f_complex"));
    }

    /**
     * Standard uncertainty of _refln.F_complex.
     * @return StrColumn
     */
    public StrColumn getFComplexSu() {
        return new DelegatingStrColumn(parentBlock.getColumn("refln_f_complex_su"));
    }

    /**
     * The structure factor amplitude for the reflection derived from the
     * measured intensities.
     * @return FloatColumn
     */
    public FloatColumn getFMeas() {
        return new DelegatingFloatColumn(parentBlock.getColumn("refln_f_meas"));
    }

    /**
     * The structure factor amplitude squared for the reflection calculated from
     * the atom site data.
     * @return FloatColumn
     */
    public FloatColumn getFSquaredCalc() {
        return new DelegatingFloatColumn(parentBlock.getColumn("refln_f_squared_calc"));
    }

    /**
     * Standard uncertainty of _refln.F_squared_calc.
     * @return FloatColumn
     */
    public FloatColumn getFSquaredCalcSu() {
        return new DelegatingFloatColumn(parentBlock.getColumn("refln_f_squared_calc_su"));
    }

    /**
     * The structure factor amplitude for the reflection derived from the
     * measured intensities.
     * @return FloatColumn
     */
    public FloatColumn getFSquaredMeas() {
        return new DelegatingFloatColumn(parentBlock.getColumn("refln_f_squared_meas"));
    }

    /**
     * The figure of merit m for this reflection.
     * 
     * int P~α~ exp(i*α) dα
     * m = --------------------
     * int P~α~ dα
     * 
     * P~α~ = the probability that the phase angle α is correct
     * 
     * int is taken over the range α = 0 to 2 π.
     * @return FloatColumn
     */
    public FloatColumn getFom() {
        return new DelegatingFloatColumn(parentBlock.getColumn("refln_fom"));
    }

    /**
     * Atomic scattering factor table for the scattering angle
     * of this diffraction vector and atom types in structure.
     * @return FloatColumn
     */
    public FloatColumn getFormFactorTable() {
        return new DelegatingFloatColumn(parentBlock.getColumn("refln_form_factor_table"));
    }

    /**
     * The Miller indices as a reciprocal space vector.
     * @return IntColumn
     */
    public IntColumn getHkl() {
        return new DelegatingIntColumn(parentBlock.getColumn("refln_hkl"));
    }

    /**
     * The index of a reciprocal space vector.
     * @return IntColumn
     */
    public IntColumn getIndexH() {
        return new DelegatingIntColumn(parentBlock.getColumn("refln_index_h"));
    }

    /**
     * The index of a reciprocal space vector.
     * @return IntColumn
     */
    public IntColumn getIndexK() {
        return new DelegatingIntColumn(parentBlock.getColumn("refln_index_k"));
    }

    /**
     * The index of a reciprocal space vector.
     * @return IntColumn
     */
    public IntColumn getIndexL() {
        return new DelegatingIntColumn(parentBlock.getColumn("refln_index_l"));
    }

    /**
     * The intensity of the reflection calculated from the atom site data.
     * @return FloatColumn
     */
    public FloatColumn getIntensityCalc() {
        return new DelegatingFloatColumn(parentBlock.getColumn("refln_intensity_calc"));
    }

    /**
     * Standard uncertainty of _refln.intensity_calc.
     * @return FloatColumn
     */
    public FloatColumn getIntensityCalcSu() {
        return new DelegatingFloatColumn(parentBlock.getColumn("refln_intensity_calc_su"));
    }

    /**
     * The intensity of the reflection derived from the diffraction measurements.
     * @return FloatColumn
     */
    public FloatColumn getIntensityMeas() {
        return new DelegatingFloatColumn(parentBlock.getColumn("refln_intensity_meas"));
    }

    /**
     * The Lorentz-polarization factor appropriate for the instrument
     * used to measure the diffraction intensity. This is applied to
     * convert the net intensity into the measured F squared.
     * @return FloatColumn
     */
    public FloatColumn getLpFactor() {
        return new DelegatingFloatColumn(parentBlock.getColumn("refln_lp_factor"));
    }

    /**
     * Mean path length through the crystal for this diffraction vector.
     * @return FloatColumn
     */
    public FloatColumn getMeanPathLengthTbar() {
        return new DelegatingFloatColumn(parentBlock.getColumn("refln_mean_path_length_tbar"));
    }

    /**
     * The phase of the calculated structure-factor.
     * @return FloatColumn
     */
    public FloatColumn getPhaseCalc() {
        return new DelegatingFloatColumn(parentBlock.getColumn("refln_phase_calc"));
    }

    /**
     * Standard uncertainty of _refln.phase_calc.
     * @return FloatColumn
     */
    public FloatColumn getPhaseCalcSu() {
        return new DelegatingFloatColumn(parentBlock.getColumn("refln_phase_calc_su"));
    }

    /**
     * The phase of the measured structure-factor. This may be derived from
     * the atom site data if available or from the phase solution process
     * prior to determination of the structure.
     * @return FloatColumn
     */
    public FloatColumn getPhaseMeas() {
        return new DelegatingFloatColumn(parentBlock.getColumn("refln_phase_meas"));
    }

    /**
     * Standard uncertainty of _refln.phase_meas.
     * @return FloatColumn
     */
    public FloatColumn getPhaseMeasSu() {
        return new DelegatingFloatColumn(parentBlock.getColumn("refln_phase_meas_su"));
    }

    /**
     * Status code of reflection in the structure refinement process.
     * @return StrColumn
     */
    public StrColumn getRefinementStatus() {
        return new DelegatingStrColumn(parentBlock.getColumn("refln_refinement_status"));
    }

    /**
     * Code identifying the scale (if there is more than one scale) used
     * convert the measured structure factor to a common absolute value.
     * @return StrColumn
     */
    public StrColumn getScaleGroupCode() {
        return new DelegatingStrColumn(parentBlock.getColumn("refln_scale_group_code"));
    }

    /**
     * The symmetry reinforcement factor corresponding to the number of
     * times the reflection indices are generated identically from the
     * space-group symmetry operations.
     * @return IntColumn
     */
    public IntColumn getSymmetryEpsilon() {
        return new DelegatingIntColumn(parentBlock.getColumn("refln_symmetry_epsilon"));
    }

    /**
     * The number of reflections symmetry-equivalent under the Laue
     * symmetry to the present reflection. In the Laue symmetry, Friedel
     * opposites (h k l and -h -k -l) are equivalent. Tables of
     * symmetry-equivalent reflections are available in International
     * Tables for Crystallography, Volume A (1987), section 10.2.
     * @return IntColumn
     */
    public IntColumn getSymmetryMultiplicity() {
        return new DelegatingIntColumn(parentBlock.getColumn("refln_symmetry_multiplicity"));
    }

    /**
     * The mean wavelength in angstroms of radiation used to measure
     * this reflection. This is an important parameter for data
     * collected using energy-dispersive detectors or the Laue method.
     * @return FloatColumn
     */
    public FloatColumn getWavelength() {
        return new DelegatingFloatColumn(parentBlock.getColumn("refln_wavelength"));
    }

    /**
     * Code identifying the wavelength in DIFFRN_RADIATION_WAVELENGTH list.
     * @return StrColumn
     */
    public StrColumn getWavelengthId() {
        return new DelegatingStrColumn(parentBlock.getColumn("refln_wavelength_id"));
    }

    /**
     * Standard uncertainty of the measured structure factor amplitude.
     * @return FloatColumn
     */
    public FloatColumn getFMeasSigma() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("refln_F_meas_sigma", "refln_f_meas_su"));
    }

    /**
     * Standard uncertainty of the measured structure factor amplitude.
     * @return FloatColumn
     */
    public FloatColumn getFMeasSu() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("refln_F_meas_sigma", "refln_f_meas_su"));
    }

    /**
     * Standard uncertainty of the measured structure factor squared.
     * @return FloatColumn
     */
    public FloatColumn getFSquaredSigma() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("refln_F_squared_sigma", "refln_f_squared_meas_su"));
    }

    /**
     * Standard uncertainty of the measured structure factor squared.
     * @return FloatColumn
     */
    public FloatColumn getFSquaredMeasSu() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("refln_F_squared_sigma", "refln_f_squared_meas_su"));
    }

    /**
     * Code indicating how the reflection was included in the refinement
     * and R-factor calculations.
     * @return StrColumn
     */
    public StrColumn getObservedStatus() {
        return new DelegatingStrColumn(parentBlock.getAliasedColumn("refln_observed_status", "refln_status", "refln_include_status"));
    }

    /**
     * Code indicating how the reflection was included in the refinement
     * and R-factor calculations.
     * @return StrColumn
     */
    public StrColumn getStatus() {
        return new DelegatingStrColumn(parentBlock.getAliasedColumn("refln_observed_status", "refln_status", "refln_include_status"));
    }

    /**
     * Code indicating how the reflection was included in the refinement
     * and R-factor calculations.
     * @return StrColumn
     */
    public StrColumn getIncludeStatus() {
        return new DelegatingStrColumn(parentBlock.getAliasedColumn("refln_observed_status", "refln_status", "refln_include_status"));
    }

    /**
     * Standard uncertainty of the measured intensity.
     * @return FloatColumn
     */
    public FloatColumn getIntensitySigma() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("refln_intensity_sigma", "refln_intensity_meas_su"));
    }

    /**
     * Standard uncertainty of the measured intensity.
     * @return FloatColumn
     */
    public FloatColumn getIntensityMeasSu() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("refln_intensity_sigma", "refln_intensity_meas_su"));
    }

    /**
     * The sin(θ)/λ value for this reflection.
     * @return FloatColumn
     */
    public FloatColumn getSintOverLambda() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("refln_sint_over_lambda", "refln_sin_theta_over_lambda"));
    }

    /**
     * The sin(θ)/λ value for this reflection.
     * @return FloatColumn
     */
    public FloatColumn getSinThetaOverLambda() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("refln_sint_over_lambda", "refln_sin_theta_over_lambda"));
    }

}