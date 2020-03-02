package org.rcsb.cif.schema.generated.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * 
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
     * 
     * The calculated real structure-factor component A =|Fcalc|cos(phase)
     * @return StrColumn
     */
    public StrColumn getACalc() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_A_calc"));
    }

    /**
     * 
     * The measured real structure-factor component A =|Fmeas|cos(phase)
     * @return StrColumn
     */
    public StrColumn getAMeas() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_A_meas"));
    }

    /**
     * 
     * The calculated imaginary structure-factor component B =|Fcalc|sin(phase)
     * @return StrColumn
     */
    public StrColumn getBCalc() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_B_calc"));
    }

    /**
     * 
     * The measured imaginary structure-factor component B =|Fmeas|sin(phase)
     * @return StrColumn
     */
    public StrColumn getBMeas() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_B_meas"));
    }

    /**
     * 
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
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_class_code"));
    }

    /**
     * 
     * The distance in angstroms between lattice planes in the crystal
     * with the indices _refln.hkl for this reflection.
     * @return StrColumn
     */
    public StrColumn getDSpacing() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_d_spacing"));
    }

    /**
     * 
     * The structure factor amplitude for the reflection calculated from
     * the atom site data.
     * @return StrColumn
     */
    public StrColumn getFCalc() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_F_calc"));
    }

    /**
     * 
     * The structure factor vector for the reflection calculated from
     * the atom site data.
     * @return StrColumn
     */
    public StrColumn getFComplex() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_F_complex"));
    }

    /**
     * 
     * The structure factor amplitude for the reflection derived from the
     * measured intensities.
     * @return StrColumn
     */
    public StrColumn getFMeas() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_F_meas"));
    }

    /**
     * 
     * The standard uncertainty of the measured structure factor amplitude.
     * @return StrColumn
     */
    public StrColumn getFMeasSu() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_F_meas_su"));
    }

    /**
     * 
     * The structure factor amplitude squared for the reflection calculated from
     * the atom site data.
     * @return StrColumn
     */
    public StrColumn getFSquaredCalc() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_F_squared_calc"));
    }

    /**
     * 
     * The structure factor amplitude for the reflection derived from the
     * measured intensities.
     * @return StrColumn
     */
    public StrColumn getFSquaredMeas() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_F_squared_meas"));
    }

    /**
     * 
     * The standard uncertainty of the measured structure factor squared.
     * @return StrColumn
     */
    public StrColumn getFSquaredMeasSu() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_F_squared_meas_su"));
    }

    /**
     * 
     * The figure of merit m for this reflection.
     * 
     * int P~alpha~ exp(i*alpha) dalpha
     * m = --------------------------------
     * int P~alpha~ dalpha
     * 
     * P~a~ = the probability that the phase angle a is correct
     * 
     * int is taken over the range alpha = 0 to 2 pi.
     * @return StrColumn
     */
    public StrColumn getFom() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_fom"));
    }

    /**
     * 
     * Atomic scattering factor table for the scattering angle
     * of this diffraction vector and atom types in structure.
     * @return StrColumn
     */
    public StrColumn getFormFactorTable() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_form_factor_table"));
    }

    /**
     * 
     * The Miller indices as a reciprocal space vector.
     * @return StrColumn
     */
    public StrColumn getHkl() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_hkl"));
    }

    /**
     * 
     * Code indicating how the reflection was included in the refinement
     * and R-factor calculations.
     * @return StrColumn
     */
    public StrColumn getIncludeStatus() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_include_status"));
    }

    /**
     * 
     * The index of a reciprocal space vector.
     * @return StrColumn
     */
    public StrColumn getIndexH() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_index_h"));
    }

    /**
     * 
     * The index of a reciprocal space vector.
     * @return StrColumn
     */
    public StrColumn getIndexK() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_index_k"));
    }

    /**
     * 
     * The index of a reciprocal space vector.
     * @return StrColumn
     */
    public StrColumn getIndexL() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_index_l"));
    }

    /**
     * 
     * The intensity of the reflection calculated from the atom site data.
     * @return StrColumn
     */
    public StrColumn getIntensityCalc() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_intensity_calc"));
    }

    /**
     * 
     * The intensity of the reflection derived from the diffraction measurements.
     * @return StrColumn
     */
    public StrColumn getIntensityMeas() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_intensity_meas"));
    }

    /**
     * 
     * standard uncertainty of the measured intensity.
     * @return StrColumn
     */
    public StrColumn getIntensityMeasSu() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_intensity_meas_su"));
    }

    /**
     * 
     * The Lorentz-polarization factor appropriate for the instrument
     * used to measure the diffraction intensity. This is applied to
     * convert the net intensity into the measured F squared.
     * @return StrColumn
     */
    public StrColumn getLpFactor() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_Lp_factor"));
    }

    /**
     * 
     * Mean path length through the crystal for this diffraction vector.
     * @return StrColumn
     */
    public StrColumn getMeanPathLengthTbar() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_mean_path_length_tbar"));
    }

    /**
     * 
     * The phase of the calculated structure-factor.
     * @return StrColumn
     */
    public StrColumn getPhaseCalc() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_phase_calc"));
    }

    /**
     * 
     * The phase of the measured structure-factor. This may be derived from
     * the atom site data if available or from the phase solution process
     * prior to determination of the structure.
     * @return StrColumn
     */
    public StrColumn getPhaseMeas() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_phase_meas"));
    }

    /**
     * 
     * Status code of reflection in the structure refinement process.
     * @return StrColumn
     */
    public StrColumn getRefinementStatus() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_refinement_status"));
    }

    /**
     * 
     * Code identifying the scale (if there is more than one scale) used
     * convert the measured structure factor to a common absolute value.
     * @return StrColumn
     */
    public StrColumn getScaleGroupCode() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_scale_group_code"));
    }

    /**
     * 
     * The (sin theta)/lambda value for this reflection.
     * @return StrColumn
     */
    public StrColumn getSinThetaOverLambda() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_sin_theta_over_lambda"));
    }

    /**
     * 
     * The symmetry reinforcement factor corresponding to the number of
     * times the reflection indices are generated identically from the
     * space-group symmetry operations.
     * @return StrColumn
     */
    public StrColumn getSymmetryEpsilon() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_symmetry_epsilon"));
    }

    /**
     * 
     * The number of reflections symmetry-equivalent under the Laue
     * symmetry to the present reflection. In the Laue symmetry, Friedel
     * opposites (h k l and -h -k -l) are equivalent. Tables of
     * symmetry-equivalent reflections are available in International
     * Tables for Crystallography, Volume A (1987), section 10.2.
     * @return StrColumn
     */
    public StrColumn getSymmetryMultiplicity() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_symmetry_multiplicity"));
    }

    /**
     * 
     * The mean wavelength in angstroms of radiation used to measure
     * this reflection. This is an important parameter for data
     * collected using energy-dispersive detectors or the Laue method.
     * @return StrColumn
     */
    public StrColumn getWavelength() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_wavelength"));
    }

    /**
     * 
     * Code identifying the wavelength in DIFFRN_RADIATION_WAVELENGTH list.
     * @return StrColumn
     */
    public StrColumn getWavelengthId() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_wavelength_id"));
    }
}
