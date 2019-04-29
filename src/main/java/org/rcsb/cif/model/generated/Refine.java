package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the REFINE category record details about the
 * structure-refinement parameters.
 */
@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class Refine extends BaseCategory {
    public Refine(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public Refine(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public Refine(String name) {
        super(name);
    }

    /**
     * The elements of the matrix that defines the overall
     * anisotropic displacement model if one was refined for this
     * structure.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getAnisoB11() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("aniso_B[1][1]", SingleRowFloatColumn::new) :
                getBinaryColumn("aniso_B[1][1]"));
    }

    /**
     * The elements of the matrix that defines the overall
     * anisotropic displacement model if one was refined for this
     * structure.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getAnisoB12() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("aniso_B[1][2]", SingleRowFloatColumn::new) :
                getBinaryColumn("aniso_B[1][2]"));
    }

    /**
     * The elements of the matrix that defines the overall
     * anisotropic displacement model if one was refined for this
     * structure.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getAnisoB13() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("aniso_B[1][3]", SingleRowFloatColumn::new) :
                getBinaryColumn("aniso_B[1][3]"));
    }

    /**
     * The elements of the matrix that defines the overall
     * anisotropic displacement model if one was refined for this
     * structure.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getAnisoB22() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("aniso_B[2][2]", SingleRowFloatColumn::new) :
                getBinaryColumn("aniso_B[2][2]"));
    }

    /**
     * The elements of the matrix that defines the overall
     * anisotropic displacement model if one was refined for this
     * structure.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getAnisoB23() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("aniso_B[2][3]", SingleRowFloatColumn::new) :
                getBinaryColumn("aniso_B[2][3]"));
    }

    /**
     * The elements of the matrix that defines the overall
     * anisotropic displacement model if one was refined for this
     * structure.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getAnisoB33() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("aniso_B[3][3]", SingleRowFloatColumn::new) :
                getBinaryColumn("aniso_B[3][3]"));
    }

    /**
     * The maximum isotropic displacement parameter (B value)
     * found in the coordinate set.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getBIsoMax() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("B_iso_max", SingleRowFloatColumn::new) :
                getBinaryColumn("B_iso_max"));
    }

    /**
     * The mean isotropic displacement parameter (B value)
     * for the coordinate set.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getBIsoMean() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("B_iso_mean", SingleRowFloatColumn::new) :
                getBinaryColumn("B_iso_mean"));
    }

    /**
     * The minimum isotropic displacement parameter (B value)
     * found in the coordinate set.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getBIsoMin() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("B_iso_min", SingleRowFloatColumn::new) :
                getBinaryColumn("B_iso_min"));
    }

    /**
     * The correlation coefficient between the observed and
     * calculated structure factors for reflections included in
     * the refinement.
     * 
     * The correlation coefficient is scale-independent and gives
     * an idea of the quality of the refined model.
     * 
     * sum~i~(Fo~i~ Fc~i~ - <Fo><Fc>)
     * R~corr~ = ------------------------------------------------------------
     * SQRT{sum~i~(Fo~i~)^2^-<Fo>^2^} SQRT{sum~i~(Fc~i~)^2^-<Fc>^2^}
     * 
     * Fo = observed structure factors
     * Fc = calculated structure factors
     * <>   denotes average value
     * 
     * summation is over reflections included in the refinement
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getCorrelationCoeffFoToFc() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("correlation_coeff_Fo_to_Fc", SingleRowFloatColumn::new) :
                getBinaryColumn("correlation_coeff_Fo_to_Fc"));
    }

    /**
     * The correlation coefficient between the observed and
     * calculated structure factors for reflections not included
     * in the refinement (free reflections).
     * 
     * The correlation coefficient is scale-independent and gives
     * an idea of the quality of the refined model.
     * 
     * sum~i~(Fo~i~ Fc~i~ - <Fo><Fc>)
     * R~corr~ = ------------------------------------------------------------
     * SQRT{sum~i~(Fo~i~)^2^-<Fo>^2^} SQRT{sum~i~(Fc~i~)^2^-<Fc>^2^}
     * 
     * Fo  = observed structure factors
     * Fc  = calculated structure factors
     * <>    denotes average value
     * 
     * summation is over reflections not included
     * in the refinement (free reflections)
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getCorrelationCoeffFoToFcFree() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("correlation_coeff_Fo_to_Fc_free", SingleRowFloatColumn::new) :
                getBinaryColumn("correlation_coeff_Fo_to_Fc_free"));
    }

    /**
     * Description of special aspects of the refinement process.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDetails() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("details", SingleRowStrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * The maximum value of the electron density in the final difference
     * Fourier map.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getDiffDensityMax() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("diff_density_max", SingleRowFloatColumn::new) :
                getBinaryColumn("diff_density_max"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _refine.diff_density_max.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getDiffDensityMaxEsd() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("diff_density_max_esd", SingleRowFloatColumn::new) :
                getBinaryColumn("diff_density_max_esd"));
    }

    /**
     * The minimum value of the electron density in the final difference
     * Fourier map.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getDiffDensityMin() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("diff_density_min", SingleRowFloatColumn::new) :
                getBinaryColumn("diff_density_min"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _refine.diff_density_min.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getDiffDensityMinEsd() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("diff_density_min_esd", SingleRowFloatColumn::new) :
                getBinaryColumn("diff_density_min_esd"));
    }

    /**
     * The root-mean-square-deviation of the electron density in the
     * final difference Fourier map. This value is measured with respect
     * to the arithmetic mean density and is derived from summations
     * over each grid point in the asymmetric unit of the cell. This
     * quantity is useful for assessing the significance of the values
     * of _refine.diff_density_min and _refine.diff_density_max, and
     * also for defining suitable contour levels.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getDiffDensityRms() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("diff_density_rms", SingleRowFloatColumn::new) :
                getBinaryColumn("diff_density_rms"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _refine.diff_density_rms.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getDiffDensityRmsEsd() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("diff_density_rms_esd", SingleRowFloatColumn::new) :
                getBinaryColumn("diff_density_rms_esd"));
    }

    /**
     * This data item is a pointer to _entry.id in the ENTRY category.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getEntryId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("entry_id", SingleRowStrColumn::new) :
                getBinaryColumn("entry_id"));
    }

    /**
     * This data item uniquely identifies a refinement within an entry.
     * _refine.pdbx_refine_id can be used to distinguish the results of
     * joint refinements.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getPdbxRefineId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("pdbx_refine_id", SingleRowStrColumn::new) :
                getBinaryColumn("pdbx_refine_id"));
    }

    /**
     * The nature of the absolute structure and how it was determined.
     * For example, this may describe the Friedel pairs used.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getLsAbsStructureDetails() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("ls_abs_structure_details", SingleRowStrColumn::new) :
                getBinaryColumn("ls_abs_structure_details"));
    }

    /**
     * The measure of absolute structure (enantiomorph or polarity) as
     * defined by Flack (1983).
     * 
     * For centrosymmetric structures, the only permitted value, if the
     * data name is present, is 'inapplicable', represented by '.' .
     * 
     * For noncentrosymmetric structures the value must lie in the
     * 99.97% Gaussian confidence interval  -3u =< x =< 1 + 3u and a
     * standard uncertainty (estimated standard deviation) u must
     * be supplied. The item range of [0.0:1.0] is correctly
     * interpreted as meaning (0.0 - 3u) =< x =< (1.0 + 3u).
     * 
     * Ref: Flack, H. D. (1983). Acta Cryst. A39, 876-881.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getLsAbsStructureFlack() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("ls_abs_structure_Flack", SingleRowFloatColumn::new) :
                getBinaryColumn("ls_abs_structure_Flack"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _refine.ls_abs_structure_Flack.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getLsAbsStructureFlackEsd() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("ls_abs_structure_Flack_esd", SingleRowFloatColumn::new) :
                getBinaryColumn("ls_abs_structure_Flack_esd"));
    }

    /**
     * The measure of absolute structure (enantiomorph or polarity) as
     * defined by Rogers.
     * 
     * 
     * The value must lie in the 99.97% Gaussian confidence interval
     * -1 -3u =< \h =< 1 + 3u and a standard uncertainty (estimated
     * standard deviation) u must be supplied. The item range of
     * [-1.0, 1.0] is correctly interpreted as meaning
     * (-1.0 - 3u) =< \h =< (1.0 + 3u).
     * 
     * Ref: Rogers, D. (1981). Acta Cryst. A37, 734-741.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getLsAbsStructureRogers() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("ls_abs_structure_Rogers", SingleRowFloatColumn::new) :
                getBinaryColumn("ls_abs_structure_Rogers"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _refine.ls_abs_structure_Rogers.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getLsAbsStructureRogersEsd() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("ls_abs_structure_Rogers_esd", SingleRowFloatColumn::new) :
                getBinaryColumn("ls_abs_structure_Rogers_esd"));
    }

    /**
     * The smallest value for the interplanar spacings for the
     * reflection data used in the refinement in angstroms. This is
     * called the highest resolution.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getLsDResHigh() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("ls_d_res_high", SingleRowFloatColumn::new) :
                getBinaryColumn("ls_d_res_high"));
    }

    /**
     * The largest value for the interplanar spacings for
     * the reflection data used in the refinement in angstroms.
     * This is called the lowest resolution.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getLsDResLow() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("ls_d_res_low", SingleRowFloatColumn::new) :
                getBinaryColumn("ls_d_res_low"));
    }

    /**
     * The extinction coefficient used to calculate the correction
     * factor applied to the structure-factor data. The nature of the
     * extinction coefficient is given in the definitions of
     * _refine.ls_extinction_expression and
     * _refine.ls_extinction_method.
     * 
     * For the 'Zachariasen' method it is the r* value; for the
     * 'Becker-Coppens type 1 isotropic' method it is the 'g' value,
     * and for 'Becker-Coppens type 2 isotropic' corrections it is
     * the 'rho' value. Note that the magnitude of these values is
     * usually of the order of 10000.
     * 
     * Ref:  Becker, P. J. & Coppens, P. (1974). Acta Cryst. A30,
     * 129-47, 148-153.
     * Zachariasen, W. H. (1967). Acta Cryst. 23, 558-564.
     * Larson, A. C. (1967). Acta Cryst. 23, 664-665.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getLsExtinctionCoef() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("ls_extinction_coef", SingleRowFloatColumn::new) :
                getBinaryColumn("ls_extinction_coef"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _refine.ls_extinction_coef.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getLsExtinctionCoefEsd() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("ls_extinction_coef_esd", SingleRowFloatColumn::new) :
                getBinaryColumn("ls_extinction_coef_esd"));
    }

    /**
     * A description of or reference to the extinction-correction
     * equation used to apply the data item
     * _refine.ls_extinction_coef. This information must be sufficient
     * to reproduce the extinction-correction factors applied to the
     * structure factors.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getLsExtinctionExpression() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("ls_extinction_expression", SingleRowStrColumn::new) :
                getBinaryColumn("ls_extinction_expression"));
    }

    /**
     * A description of the extinction-correction method applied.
     * This description should
     * include information about the correction method, either
     * 'Becker-Coppens' or 'Zachariasen'.  The latter is sometimes
     * referred to as the 'Larson' method even though it employs
     * Zachariasen's formula.
     * 
     * The Becker-Coppens procedure is referred to as 'type 1' when
     * correcting secondary extinction dominated by the mosaic spread;
     * as 'type 2' when secondary extinction is dominated by particle
     * size and includes a primary extinction component; and as 'mixed'
     * when there is a mixture of types 1 and 2.
     * 
     * For the Becker-Coppens method, it is also necessary to set the
     * mosaic distribution as either 'Gaussian' or 'Lorentzian' and the
     * nature of the extinction as 'isotropic' or 'anisotropic'. Note
     * that if either the 'mixed' or 'anisotropic' corrections are
     * applied, the multiple coefficients cannot be contained in
     * *_extinction_coef and must be listed in _refine.details.
     * 
     * Ref: Becker, P. J. & Coppens, P. (1974). Acta Cryst. A30,
     * 129-147, 148-153.
     * Zachariasen, W. H. (1967). Acta Cryst. 23, 558- 564.
     * Larson, A. C. (1967). Acta Cryst. 23, 664-665.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getLsExtinctionMethod() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("ls_extinction_method", SingleRowStrColumn::new) :
                getBinaryColumn("ls_extinction_method"));
    }

    /**
     * The least-squares goodness-of-fit parameter S for all data
     * after the final cycle of refinement. Ideally, account should be
     * taken of parameters restrained in the least-squares refinement.
     * See also the definition of _refine.ls_restrained_S_all.
     * 
     * ( sum|w |Y~obs~ - Y~calc~|^2^| )^1/2^
     * S = ( ---------------------------- )
     * (       N~ref~ - N~param~      )
     * 
     * Y~obs~   = the observed coefficients
     * (see _refine.ls_structure_factor_coef)
     * Y~calc~  = the calculated coefficients
     * (see _refine.ls_structure_factor_coef)
     * w        = the least-squares reflection weight
     * [1/(e.s.d. squared)]
     * 
     * N~ref~   = the number of reflections used in the refinement
     * N~param~ = the number of refined parameters
     * 
     * sum is taken over the specified reflections
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getLsGoodnessOfFitAll() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("ls_goodness_of_fit_all", SingleRowFloatColumn::new) :
                getBinaryColumn("ls_goodness_of_fit_all"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _refine.ls_goodness_of_fit_all.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getLsGoodnessOfFitAllEsd() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("ls_goodness_of_fit_all_esd", SingleRowFloatColumn::new) :
                getBinaryColumn("ls_goodness_of_fit_all_esd"));
    }

    /**
     * The least-squares goodness-of-fit parameter S for reflection data
     * classified as 'observed' (see _reflns.observed_criterion) after
     * the final cycle of refinement. Ideally, account should be taken
     * of parameters restrained in the least-squares refinement.
     * See also the definition of _refine.ls_restrained_S_obs.
     * 
     * ( sum|w |Y~obs~ - Y~calc~|^2^| )^1/2^
     * S = ( ---------------------------- )
     * (       N~ref~ - N~param~      )
     * 
     * Y~obs~   = the observed coefficients
     * (see _refine.ls_structure_factor_coef)
     * Y~calc~  = the calculated coefficients
     * (see _refine.ls_structure_factor_coef)
     * w        = the least-squares reflection weight
     * [1/(e.s.d. squared)]
     * 
     * N~ref~   = the number of reflections used in the refinement
     * N~param~ = the number of refined parameters
     * 
     * sum is taken over the specified reflections
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getLsGoodnessOfFitObs() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("ls_goodness_of_fit_obs", SingleRowFloatColumn::new) :
                getBinaryColumn("ls_goodness_of_fit_obs"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _refine.ls_goodness_of_fit_obs.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getLsGoodnessOfFitObsEsd() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("ls_goodness_of_fit_obs_esd", SingleRowFloatColumn::new) :
                getBinaryColumn("ls_goodness_of_fit_obs_esd"));
    }

    /**
     * Treatment of hydrogen atoms in the least-squares refinement.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getLsHydrogenTreatment() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("ls_hydrogen_treatment", SingleRowStrColumn::new) :
                getBinaryColumn("ls_hydrogen_treatment"));
    }

    /**
     * Type of matrix used to accumulate the least-squares derivatives.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getLsMatrixType() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("ls_matrix_type", SingleRowStrColumn::new) :
                getBinaryColumn("ls_matrix_type"));
    }

    /**
     * The number of constrained (non-refined or dependent) parameters
     * in the least-squares process. These may be due to symmetry or any
     * other constraint process (e.g. rigid-body refinement). See also
     * _atom_site.constraints and _atom_site.refinement_flags. A general
     * description of constraints may appear in _refine.details.
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getLsNumberConstraints() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("ls_number_constraints", SingleRowIntColumn::new) :
                getBinaryColumn("ls_number_constraints"));
    }

    /**
     * The number of parameters refined in the least-squares process.
     * If possible, this number should include some contribution from
     * the restrained parameters. The restrained parameters are
     * distinct from the constrained parameters (where one or more
     * parameters are linearly dependent on the refined value of
     * another). Least-squares restraints often depend on geometry or
     * energy considerations and this makes their direct contribution
     * to this number, and to the goodness-of-fit calculation,
     * difficult to assess.
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getLsNumberParameters() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("ls_number_parameters", SingleRowIntColumn::new) :
                getBinaryColumn("ls_number_parameters"));
    }

    /**
     * The number of reflections that satisfy the resolution limits
     * established by _refine.ls_d_res_high and _refine.ls_d_res_low.
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getLsNumberReflnsAll() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("ls_number_reflns_all", SingleRowIntColumn::new) :
                getBinaryColumn("ls_number_reflns_all"));
    }

    /**
     * The number of reflections that satisfy the resolution limits
     * established by _refine.ls_d_res_high and _refine.ls_d_res_low
     * and the observation limit established by
     * _reflns.observed_criterion.
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getLsNumberReflnsObs() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("ls_number_reflns_obs", SingleRowIntColumn::new) :
                getBinaryColumn("ls_number_reflns_obs"));
    }

    /**
     * The number of reflections that satisfy the resolution limits
     * established by _refine.ls_d_res_high and _refine.ls_d_res_low
     * and the observation limit established by
     * _reflns.observed_criterion, and that were used as the test
     * reflections (i.e. were excluded from the refinement) when the
     * refinement included the calculation of a 'free' R factor.
     * Details of how reflections were assigned to the working and
     * test sets are given in _reflns.R_free_details.
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getLsNumberReflnsRFree() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("ls_number_reflns_R_free", SingleRowIntColumn::new) :
                getBinaryColumn("ls_number_reflns_R_free"));
    }

    /**
     * The number of reflections that satisfy the resolution limits
     * established by _refine.ls_d_res_high and _refine.ls_d_res_low
     * and the observation limit established by
     * _reflns.observed_criterion, and that were used as the working
     * reflections (i.e. were included in the refinement) when the
     * refinement included the calculation of a 'free' R factor.
     * Details of how reflections were assigned to the working and
     * test sets are given in _reflns.R_free_details.
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getLsNumberReflnsRWork() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("ls_number_reflns_R_work", SingleRowIntColumn::new) :
                getBinaryColumn("ls_number_reflns_R_work"));
    }

    /**
     * The number of restrained parameters. These are parameters which
     * are not directly dependent on another refined parameter.
     * Restrained parameters often involve geometry or energy
     * dependencies.
     * See also _atom_site.constraints and _atom_site.refinement_flags.
     * A general description of refinement constraints may appear in
     * _refine.details.
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getLsNumberRestraints() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("ls_number_restraints", SingleRowIntColumn::new) :
                getBinaryColumn("ls_number_restraints"));
    }

    /**
     * The number of reflections that satisfy the resolution limits
     * established by _refine.ls_d_res_high and _refine.ls_d_res_low
     * and the observation limit established by
     * _reflns.observed_criterion, expressed as a percentage of the
     * number of geometrically observable reflections that satisfy
     * the resolution limits.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getLsPercentReflnsObs() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("ls_percent_reflns_obs", SingleRowFloatColumn::new) :
                getBinaryColumn("ls_percent_reflns_obs"));
    }

    /**
     * The number of reflections that satisfy the resolution limits
     * established by _refine.ls_d_res_high and _refine.ls_d_res_low
     * and the observation limit established by
     * _reflns.observed_criterion, and that were used as the test
     * reflections (i.e. were excluded from the refinement) when the
     * refinement included the calculation of a 'free' R factor,
     * expressed as a percentage of the number of geometrically
     * observable reflections that satisfy the resolution limits.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getLsPercentReflnsRFree() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("ls_percent_reflns_R_free", SingleRowFloatColumn::new) :
                getBinaryColumn("ls_percent_reflns_R_free"));
    }

    /**
     * Residual factor R for all reflections that satisfy the resolution
     * limits established by _refine.ls_d_res_high and
     * _refine.ls_d_res_low.
     * 
     * sum|F~obs~ - F~calc~|
     * R = ---------------------
     * sum|F~obs~|
     * 
     * F~obs~  = the observed structure-factor amplitudes
     * F~calc~ = the calculated structure-factor amplitudes
     * 
     * sum is taken over the specified reflections
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getLsRFactorAll() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("ls_R_factor_all", SingleRowFloatColumn::new) :
                getBinaryColumn("ls_R_factor_all"));
    }

    /**
     * Residual factor R for reflections that satisfy the resolution
     * limits established by _refine.ls_d_res_high and
     * _refine.ls_d_res_low and the observation limit established by
     * _reflns.observed_criterion.
     * 
     * _refine.ls_R_factor_obs should not be confused with
     * _refine.ls_R_factor_R_work; the former reports the results of a
     * refinement in which all observed reflections were used, the
     * latter a refinement in which a subset of the observed
     * reflections were excluded from refinement for the calculation
     * of a 'free' R factor. However, it would be meaningful to quote
     * both values if a 'free' R factor were calculated for most of
     * the refinement, but all of the observed reflections were used
     * in the final rounds of refinement; such a protocol should be
     * explained in _refine.details.
     * 
     * sum|F~obs~ - F~calc~|
     * R = ---------------------
     * sum|F~obs~|
     * 
     * F~obs~  = the observed structure-factor amplitudes
     * F~calc~ = the calculated structure-factor amplitudes
     * 
     * sum is taken over the specified reflections
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getLsRFactorObs() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("ls_R_factor_obs", SingleRowFloatColumn::new) :
                getBinaryColumn("ls_R_factor_obs"));
    }

    /**
     * Residual factor R for reflections that satisfy the resolution
     * limits established by _refine.ls_d_res_high and
     * _refine.ls_d_res_low and the observation limit established by
     * _reflns.observed_criterion, and that were used as the test
     * reflections (i.e. were excluded from the refinement) when the
     * refinement included the calculation of a 'free' R factor.
     * Details of how reflections were assigned to the working and
     * test sets are given in _reflns.R_free_details.
     * 
     * sum|F~obs~ - F~calc~|
     * R = ---------------------
     * sum|F~obs~|
     * 
     * F~obs~  = the observed structure-factor amplitudes
     * F~calc~ = the calculated structure-factor amplitudes
     * 
     * sum is taken over the specified reflections
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getLsRFactorRFree() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("ls_R_factor_R_free", SingleRowFloatColumn::new) :
                getBinaryColumn("ls_R_factor_R_free"));
    }

    /**
     * The estimated error in _refine.ls_R_factor_R_free.
     * The method used to estimate the error is described in the
     * item _refine.ls_R_factor_R_free_error_details.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getLsRFactorRFreeError() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("ls_R_factor_R_free_error", SingleRowFloatColumn::new) :
                getBinaryColumn("ls_R_factor_R_free_error"));
    }

    /**
     * Special aspects of the method used to estimated the error in
     * _refine.ls_R_factor_R_free.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getLsRFactorRFreeErrorDetails() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("ls_R_factor_R_free_error_details", SingleRowStrColumn::new) :
                getBinaryColumn("ls_R_factor_R_free_error_details"));
    }

    /**
     * Residual factor R for reflections that satisfy the resolution
     * limits established by _refine.ls_d_res_high and
     * _refine.ls_d_res_low and the observation limit established by
     * _reflns.observed_criterion, and that were used as the working
     * reflections (i.e. were included in the refinement)  when the
     * refinement included the calculation of a 'free' R factor.
     * Details of how reflections were assigned to the working and
     * test sets are given in _reflns.R_free_details.
     * 
     * _refine.ls_R_factor_obs should not be confused with
     * _refine.ls_R_factor_R_work; the former reports the results of a
     * refinement in which all observed reflections were used, the
     * latter a refinement in which a subset of the observed
     * reflections were excluded from refinement for the calculation
     * of a 'free' R factor. However, it would be meaningful to quote
     * both values if a 'free' R factor were calculated for most of
     * the refinement, but all of the observed reflections were used
     * in the final rounds of refinement; such a protocol should be
     * explained in _refine.details.
     * 
     * sum|F~obs~ - F~calc~|
     * R = ---------------------
     * sum|F~obs~|
     * 
     * F~obs~  = the observed structure-factor amplitudes
     * F~calc~ = the calculated structure-factor amplitudes
     * 
     * sum is taken over the specified reflections
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getLsRFactorRWork() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("ls_R_factor_R_work", SingleRowFloatColumn::new) :
                getBinaryColumn("ls_R_factor_R_work"));
    }

    /**
     * Residual factor R(Fsqd) for reflections that satisfy the
     * resolution limits established by _refine.ls_d_res_high and
     * _refine.ls_d_res_low and the observation limit established by
     * _reflns.observed_criterion, calculated on the squares of the
     * observed and calculated structure-factor amplitudes.
     * 
     * sum|F~obs~^2^ - F~calc~^2^|
     * R(Fsqd) = ---------------------------
     * sum|F~obs~^2^|
     * 
     * F~obs~^2^  = squares of the observed structure-factor amplitudes
     * F~calc~^2^ = squares of the calculated structure-factor
     * amplitudes
     * 
     * sum is taken over the specified reflections
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getLsRFsqdFactorObs() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("ls_R_Fsqd_factor_obs", SingleRowFloatColumn::new) :
                getBinaryColumn("ls_R_Fsqd_factor_obs"));
    }

    /**
     * Residual factor R(I) for reflections that satisfy the
     * resolution limits established by _refine.ls_d_res_high and
     * _refine.ls_d_res_low and the observation limit established by
     * _reflns.observed_criterion, calculated on the estimated
     * reflection intensities.
     * 
     * This is most often calculated in Rietveld refinements against
     * powder data, where it is referred to as R~B~ or R~Bragg~.
     * 
     * sum|I~obs~ - I~calc~|
     * R(I) = ---------------------
     * sum|I~obs~|
     * 
     * I~obs~  = the net observed intensities
     * I~calc~ = the net calculated intensities
     * 
     * sum is taken over the specified reflections
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getLsRIFactorObs() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("ls_R_I_factor_obs", SingleRowFloatColumn::new) :
                getBinaryColumn("ls_R_I_factor_obs"));
    }

    /**
     * The ratio of the total number of observations of the
     * reflections that satisfy the resolution limits established by
     * _refine.ls_d_res_high and _refine.ls_d_res_low to the number
     * of crystallographically unique reflections that satisfy the
     * same limits.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getLsRedundancyReflnsAll() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("ls_redundancy_reflns_all", SingleRowFloatColumn::new) :
                getBinaryColumn("ls_redundancy_reflns_all"));
    }

    /**
     * The ratio of the total number of observations of the
     * reflections that satisfy the resolution limits established by
     * _refine.ls_d_res_high and _refine.ls_d_res_low and the
     * observation limit established by _reflns.observed_criterion to
     * the number of crystallographically unique reflections that
     * satisfy the same limits.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getLsRedundancyReflnsObs() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("ls_redundancy_reflns_obs", SingleRowFloatColumn::new) :
                getBinaryColumn("ls_redundancy_reflns_obs"));
    }

    /**
     * The least-squares goodness-of-fit parameter S' for all
     * reflections after the final cycle of least-squares refinement.
     * This parameter explicitly includes the restraints applied
     * in the least-squares process. See also the definition of
     * _refine.ls_goodness_of_fit_all.
     * 
     * (   sum   |w    |Y~obs~  - Y~calc~|^2^| )^1/2^
     * ( + sum~r~|w~r~ |P~calc~ - P~targ~|^2^| )
     * S' = ( ------------------------------------- )
     * (      N~ref~ + N~restr~ - N~param~     )
     * 
     * Y~obs~   = the observed coefficients
     * (see _refine.ls_structure_factor_coef)
     * Y~calc~  = the calculated coefficients
     * (see _refine.ls_structure_factor_coef)
     * w        = the least-squares reflection weight
     * [1/(e.s.d. squared)]
     * 
     * P~calc~  = the calculated restraint values
     * P~targ~  = the target restraint values
     * w~r~     = the restraint weight
     * 
     * N~ref~   = the number of reflections used in the refinement
     * (see _refine.ls_number_reflns_obs)
     * N~restr~ = the number of restraints
     * (see _refine.ls_number_restraints)
     * N~param~ = the number of refined parameters
     * (see _refine.ls_number_parameters)
     * 
     * sum  is taken over the specified reflections
     * sumr is taken over the restraints
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getLsRestrainedSAll() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("ls_restrained_S_all", SingleRowFloatColumn::new) :
                getBinaryColumn("ls_restrained_S_all"));
    }

    /**
     * The least-squares goodness-of-fit parameter S' for reflection
     * data classified as observed (see _reflns.observed_criterion)
     * after the final cycle of least-squares refinement. This
     * parameter explicitly includes the restraints applied in
     * the least-squares process. See also the definition of
     * _refine.ls_goodness_of_fit_obs.
     * 
     * (   sum   |w    |Y~obs~  - Y~calc~|^2^| )^1/2^
     * ( + sum~r~|w~r~ |P~calc~ - P~targ~|^2^| )
     * S' = ( ------------------------------------- )
     * (      N~ref~ + N~restr~ - N~param~     )
     * 
     * Y~obs~   = the observed coefficients
     * (see _refine.ls_structure_factor_coef)
     * Y~calc~  = the calculated coefficients
     * (see _refine.ls_structure_factor_coef)
     * w        = the least-squares reflection weight
     * [1/(e.s.d. squared)]
     * 
     * P~calc~  = the calculated restraint values
     * P~targ~  = the target restraint values
     * w~r~     = the restraint weight
     * 
     * N~ref~   = the number of reflections used in the refinement
     * (see _refine.ls_number_reflns_obs)
     * N~restr~ = the number of restraints
     * (see _refine.ls_number_restraints)
     * N~param~ = the number of refined parameters
     * (see _refine.ls_number_parameters)
     * 
     * sum  is taken over the specified reflections
     * sumr is taken over the restraints
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getLsRestrainedSObs() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("ls_restrained_S_obs", SingleRowFloatColumn::new) :
                getBinaryColumn("ls_restrained_S_obs"));
    }

    /**
     * The largest ratio of the final least-squares parameter shift
     * to the final standard uncertainty (estimated standard
     * deviation).
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getLsShiftOverEsdMax() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("ls_shift_over_esd_max", SingleRowFloatColumn::new) :
                getBinaryColumn("ls_shift_over_esd_max"));
    }

    /**
     * The average ratio of the final least-squares parameter shift
     * to the final standard uncertainty (estimated standard
     * deviation).
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getLsShiftOverEsdMean() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("ls_shift_over_esd_mean", SingleRowFloatColumn::new) :
                getBinaryColumn("ls_shift_over_esd_mean"));
    }

    /**
     * Structure-factor coefficient |F|, F^2^ or I used in the least-
     * squares refinement process.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getLsStructureFactorCoef() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("ls_structure_factor_coef", SingleRowStrColumn::new) :
                getBinaryColumn("ls_structure_factor_coef"));
    }

    /**
     * A description of special aspects of the weighting scheme used
     * in least-squares refinement. Used to describe the weighting
     * when the value of _refine.ls_weighting_scheme is specified
     * as 'calc'.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getLsWeightingDetails() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("ls_weighting_details", SingleRowStrColumn::new) :
                getBinaryColumn("ls_weighting_details"));
    }

    /**
     * The weighting scheme applied in the least-squares process. The
     * standard code may be followed by a description of the weight
     * (but see _refine.ls_weighting_details for a preferred approach).
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getLsWeightingScheme() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("ls_weighting_scheme", SingleRowStrColumn::new) :
                getBinaryColumn("ls_weighting_scheme"));
    }

    /**
     * Weighted residual factor wR for all reflections that satisfy the
     * resolution limits established by _refine.ls_d_res_high and
     * _refine.ls_d_res_low.
     * 
     * ( sum|w |Y~obs~ - Y~calc~|^2^| )^1/2^
     * wR = ( ---------------------------- )
     * (        sum|w Y~obs~^2^|      )
     * 
     * Y~obs~  = the observed amplitude specified by
     * _refine.ls_structure_factor_coef
     * Y~calc~ = the calculated amplitude specified by
     * _refine.ls_structure_factor_coef
     * w       = the least-squares weight
     * 
     * sum is taken over the specified reflections
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getLsWRFactorAll() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("ls_wR_factor_all", SingleRowFloatColumn::new) :
                getBinaryColumn("ls_wR_factor_all"));
    }

    /**
     * Weighted residual factor wR for reflections that satisfy the
     * resolution limits established by _refine.ls_d_res_high and
     * _refine.ls_d_res_low and the observation limit established by
     * _reflns.observed_criterion.
     * 
     * ( sum|w |Y~obs~ - Y~calc~|^2^| )^1/2^
     * wR = ( ---------------------------- )
     * (        sum|w Y~obs~^2^|      )
     * 
     * Y~obs~  = the observed amplitude specified by
     * _refine.ls_structure_factor_coef
     * Y~calc~ = the calculated amplitude specified by
     * _refine.ls_structure_factor_coef
     * w       = the least-squares weight
     * 
     * sum is taken over the specified reflections
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getLsWRFactorObs() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("ls_wR_factor_obs", SingleRowFloatColumn::new) :
                getBinaryColumn("ls_wR_factor_obs"));
    }

    /**
     * Weighted residual factor wR for reflections that satisfy the
     * resolution limits established by _refine.ls_d_res_high and
     * _refine.ls_d_res_low and the observation limit established by
     * _reflns.observed_criterion, and that were used as the test
     * reflections (i.e. were excluded from the refinement) when the
     * refinement included the calculation of a 'free' R factor.
     * Details of how reflections were assigned to the working and
     * test sets are given in _reflns.R_free_details.
     * 
     * ( sum|w |Y~obs~ - Y~calc~|^2^| )^1/2^
     * wR = ( ---------------------------- )
     * (        sum|w Y~obs~^2^|      )
     * 
     * Y~obs~  = the observed amplitude specified by
     * _refine.ls_structure_factor_coef
     * Y~calc~ = the calculated amplitude specified by
     * _refine.ls_structure_factor_coef
     * w       = the least-squares weight
     * 
     * sum is taken over the specified reflections
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getLsWRFactorRFree() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("ls_wR_factor_R_free", SingleRowFloatColumn::new) :
                getBinaryColumn("ls_wR_factor_R_free"));
    }

    /**
     * Weighted residual factor wR for reflections that satisfy the
     * resolution limits established by _refine.ls_d_res_high and
     * _refine.ls_d_res_low and the observation limit established by
     * _reflns.observed_criterion, and that were used as the working
     * reflections (i.e. were included in the refinement) when the
     * refinement included the calculation of a 'free' R factor.
     * Details of how reflections were assigned to the working and
     * test sets are given in _reflns.R_free_details.
     * 
     * ( sum|w |Y~obs~ - Y~calc~|^2^| )^1/2^
     * wR = ( ---------------------------- )
     * (        sum|w Y~obs~^2^|      )
     * 
     * Y~obs~  = the observed amplitude specified by
     * _refine.ls_structure_factor_coef
     * Y~calc~ = the calculated amplitude specified by
     * _refine.ls_structure_factor_coef
     * w       = the least-squares weight
     * 
     * sum is taken over the specified reflections
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getLsWRFactorRWork() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("ls_wR_factor_R_work", SingleRowFloatColumn::new) :
                getBinaryColumn("ls_wR_factor_R_work"));
    }

    /**
     * The maximum value for occupancy found in the coordinate set.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getOccupancyMax() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("occupancy_max", SingleRowFloatColumn::new) :
                getBinaryColumn("occupancy_max"));
    }

    /**
     * The minimum value for occupancy found in the coordinate set.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getOccupancyMin() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("occupancy_min", SingleRowFloatColumn::new) :
                getBinaryColumn("occupancy_min"));
    }

    /**
     * Special aspects of the solvent model used during refinement.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getSolventModelDetails() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("solvent_model_details", SingleRowStrColumn::new) :
                getBinaryColumn("solvent_model_details"));
    }

    /**
     * The value of the BSOL solvent-model parameter describing
     * the average isotropic displacement parameter of disordered
     * solvent atoms.
     * 
     * This is one of the two parameters (the other is
     * _refine.solvent_model_param_ksol) in Tronrud's method of
     * modelling the contribution of bulk solvent to the
     * scattering. The standard scale factor is modified according
     * to the expression
     * 
     * k0 exp(-B0 * s^2^)[1-KSOL * exp(-BSOL * s^2^)]
     * 
     * where k0 and B0 are the scale factors for the protein.
     * 
     * Ref: Tronrud, D. E. (1997). Methods Enzymol. 277, 243-268.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getSolventModelParamBsol() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("solvent_model_param_bsol", SingleRowFloatColumn::new) :
                getBinaryColumn("solvent_model_param_bsol"));
    }

    /**
     * The value of the KSOL solvent-model parameter describing
     * the ratio of the electron density in the bulk solvent to the
     * electron density in the molecular solute.
     * 
     * This is one of the two parameters (the other is
     * _refine.solvent_model_param_bsol) in Tronrud's method of
     * modelling the contribution of bulk solvent to the
     * scattering. The standard scale factor is modified according
     * to the expression
     * 
     * k0 exp(-B0 * s^2^)[1-KSOL * exp(-BSOL * s^2^)]
     * 
     * where k0 and B0 are the scale factors for the protein.
     * 
     * Ref: Tronrud, D. E. (1997). Methods Enzymol. 277, 243-268.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getSolventModelParamKsol() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("solvent_model_param_ksol", SingleRowFloatColumn::new) :
                getBinaryColumn("solvent_model_param_ksol"));
    }

    /**
     * Residual factor for the reflections (with number given by
     * _reflns.number_gt) judged significantly intense (i.e. satisfying
     * the threshold specified by _reflns.threshold_expression)
     * and included in the refinement. The reflections also satisfy
     * the resolution limits established by _refine.ls_d_res_high and
     * _refine.ls_d_res_low. This is the conventional R
     * factor. See also _refine.ls_wR_factor_ definitions.
     * 
     * sum | F(obs) - F(calc) |
     * R = ------------------------
     * sum | F(obs) |
     * 
     * F(obs)  = the observed structure-factor amplitudes
     * F(calc) = the calculated structure-factor amplitudes
     * 
     * and the sum is taken over the specified reflections
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getLsRFactorGt() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("ls_R_factor_gt", SingleRowFloatColumn::new) :
                getBinaryColumn("ls_R_factor_gt"));
    }

    /**
     * The least-squares goodness-of-fit parameter S for
     * significantly intense reflections (see
     * _reflns.threshold_expression) after the final cycle of
     * refinement. Ideally, account should be taken of parameters
     * restrained in the least-squares refinement. See also
     * _refine.ls_restrained_S_ definitions.
     * 
     * {  sum { w [ Y(obs) - Y(calc) ]^2^ }  }^1/2^
     * S = { ----------------------------------- }
     * {            Nref - Nparam            }
     * 
     * Y(obs)  = the observed coefficients
     * (see _refine_ls_structure_factor_coef)
     * Y(calc) = the calculated coefficients
     * (see _refine_ls_structure_factor_coef)
     * w       = the least-squares reflection weight
     * [1/(u^2^)]
     * u       = standard uncertainty
     * 
     * Nref   = the number of reflections used in the refinement
     * Nparam = the number of refined parameters
     * 
     * and the sum is taken over the specified reflections
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getLsGoodnessOfFitGt() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("ls_goodness_of_fit_gt", SingleRowFloatColumn::new) :
                getBinaryColumn("ls_goodness_of_fit_gt"));
    }

    /**
     * The least-squares goodness-of-fit parameter S for all
     * reflections included in the refinement after the final cycle
     * of refinement. Ideally, account should be taken of parameters
     * restrained in the least-squares refinement. See also
     * _refine_ls_restrained_S_ definitions.
     * 
     * {  sum | w | Y(obs) - Y(calc) |^2^ |  }^1/2^
     * S = { ----------------------------------- }
     * {            Nref - Nparam            }
     * 
     * Y(obs)  = the observed coefficients
     * (see _refine_ls_structure_factor_coef)
     * Y(calc) = the calculated coefficients
     * (see _refine_ls_structure_factor_coef)
     * w       = the least-squares reflection weight
     * [1/(u^2^)]
     * u       = standard uncertainty
     * 
     * Nref   = the number of reflections used in the refinement
     * Nparam = the number of refined parameters
     * 
     * and the sum is taken over the specified reflections
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getLsGoodnessOfFitRef() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("ls_goodness_of_fit_ref", SingleRowFloatColumn::new) :
                getBinaryColumn("ls_goodness_of_fit_ref"));
    }

    /**
     * The largest ratio of the final least-squares parameter
     * shift to the final standard uncertainty.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getLsShiftOverSuMax() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("ls_shift_over_su_max", SingleRowFloatColumn::new) :
                getBinaryColumn("ls_shift_over_su_max"));
    }

    /**
     * An upper limit for the largest ratio of the final
     * least-squares parameter shift to the final
     * standard uncertainty.  This item is used when the largest
     * value of the shift divided by the final standard uncertainty
     * is too small to measure.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getLsShiftOverSuMaxLt() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("ls_shift_over_su_max_lt", SingleRowFloatColumn::new) :
                getBinaryColumn("ls_shift_over_su_max_lt"));
    }

    /**
     * The average ratio of the final least-squares parameter
     * shift to the final standard uncertainty.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getLsShiftOverSuMean() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("ls_shift_over_su_mean", SingleRowFloatColumn::new) :
                getBinaryColumn("ls_shift_over_su_mean"));
    }

    /**
     * An upper limit for the average ratio of the final
     * least-squares parameter shift to the
     * final standard uncertainty.  This
     * item is used when the average value of the shift divided by
     * the final standard uncertainty is too small to measure.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getLsShiftOverSuMeanLt() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("ls_shift_over_su_mean_lt", SingleRowFloatColumn::new) :
                getBinaryColumn("ls_shift_over_su_mean_lt"));
    }

    /**
     * Data cutoff (SIGMA(I))
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getPdbxLsSigmaI() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("pdbx_ls_sigma_I", SingleRowFloatColumn::new) :
                getBinaryColumn("pdbx_ls_sigma_I"));
    }

    /**
     * Data cutoff (SIGMA(F))
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getPdbxLsSigmaF() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("pdbx_ls_sigma_F", SingleRowFloatColumn::new) :
                getBinaryColumn("pdbx_ls_sigma_F"));
    }

    /**
     * Data cutoff (SIGMA(F^2))
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getPdbxLsSigmaFsqd() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("pdbx_ls_sigma_Fsqd", SingleRowFloatColumn::new) :
                getBinaryColumn("pdbx_ls_sigma_Fsqd"));
    }

    /**
     * Value of F at "high end" of data cutoff.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getPdbxDataCutoffHighAbsF() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("pdbx_data_cutoff_high_absF", SingleRowFloatColumn::new) :
                getBinaryColumn("pdbx_data_cutoff_high_absF"));
    }

    /**
     * Value of RMS |F| used as high data cutoff.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getPdbxDataCutoffHighRmsAbsF() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("pdbx_data_cutoff_high_rms_absF", SingleRowFloatColumn::new) :
                getBinaryColumn("pdbx_data_cutoff_high_rms_absF"));
    }

    /**
     * Value of F at "low end" of data cutoff.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getPdbxDataCutoffLowAbsF() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("pdbx_data_cutoff_low_absF", SingleRowFloatColumn::new) :
                getBinaryColumn("pdbx_data_cutoff_low_absF"));
    }

    /**
     * 
     * Whether the structure was refined with indvidual
     * isotropic, anisotropic or overall temperature factor.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getPdbxIsotropicThermalModel() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("pdbx_isotropic_thermal_model", SingleRowStrColumn::new) :
                getBinaryColumn("pdbx_isotropic_thermal_model"));
    }

    /**
     * 
     * Whether the cross validataion method was used through
     * out or only at the end.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getPdbxLsCrossValidMethod() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("pdbx_ls_cross_valid_method", SingleRowStrColumn::new) :
                getBinaryColumn("pdbx_ls_cross_valid_method"));
    }

    /**
     * Method(s) used to determine the structure.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getPdbxMethodToDetermineStruct() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("pdbx_method_to_determine_struct", SingleRowStrColumn::new) :
                getBinaryColumn("pdbx_method_to_determine_struct"));
    }

    /**
     * Starting model for refinement.  Starting model for
     * molecular replacement should refer to a previous
     * structure or experiment.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getPdbxStartingModel() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("pdbx_starting_model", SingleRowStrColumn::new) :
                getBinaryColumn("pdbx_starting_model"));
    }

    /**
     * Stereochemistry target values used in refinement.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getPdbxStereochemistryTargetValues() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("pdbx_stereochemistry_target_values", SingleRowStrColumn::new) :
                getBinaryColumn("pdbx_stereochemistry_target_values"));
    }

    /**
     * Details of the manner in which the cross validation
     * reflections were selected.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getPdbxRFreeSelectionDetails() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("pdbx_R_Free_selection_details", SingleRowStrColumn::new) :
                getBinaryColumn("pdbx_R_Free_selection_details"));
    }

    /**
     * 
     * Special case of stereochemistry target values used
     * in SHELXL refinement.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getPdbxStereochemTargetValSpecCase() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("pdbx_stereochem_target_val_spec_case", SingleRowStrColumn::new) :
                getBinaryColumn("pdbx_stereochem_target_val_spec_case"));
    }

    /**
     * Overall estimated standard uncertainties of positional
     * parameters based on R value.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getPdbxOverallESUR() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("pdbx_overall_ESU_R", SingleRowFloatColumn::new) :
                getBinaryColumn("pdbx_overall_ESU_R"));
    }

    /**
     * Overall estimated standard uncertainties of positional parameters based on R free value.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getPdbxOverallESURFree() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("pdbx_overall_ESU_R_Free", SingleRowFloatColumn::new) :
                getBinaryColumn("pdbx_overall_ESU_R_Free"));
    }

    /**
     * For bulk solvent mask calculation, the value by which the vdw radii of non-ion atoms (like carbon) are increased and used.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getPdbxSolventVdwProbeRadii() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("pdbx_solvent_vdw_probe_radii", SingleRowFloatColumn::new) :
                getBinaryColumn("pdbx_solvent_vdw_probe_radii"));
    }

    /**
     * For bulk solvent mask calculation, the amount that the ionic radii of atoms, which can be ions, are increased used.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getPdbxSolventIonProbeRadii() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("pdbx_solvent_ion_probe_radii", SingleRowFloatColumn::new) :
                getBinaryColumn("pdbx_solvent_ion_probe_radii"));
    }

    /**
     * For bulk solvent mask calculation, amount mask is shrunk after taking away atoms with new radii and a constant value assigned to this new region.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getPdbxSolventShrinkageRadii() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("pdbx_solvent_shrinkage_radii", SingleRowFloatColumn::new) :
                getBinaryColumn("pdbx_solvent_shrinkage_radii"));
    }

    /**
     * 
     * Real space R factor of electron density for all atoms.
     * 
     * The real space R factor is calculated by the equation
     * 
     * R_real = [Sum~i (|Dobs - Dcal|)]/[Sum~i (|Dobs + Dcal|)]
     * 
     * Where:
     * Dobs is the observed  electron density,
     * Dcal is the calculated  electron density,
     * summation is for all the grid points
     * 
     * Ref: Branden, C.I. & Jones, T.A. (1990).  Nature, 343, 687-689
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getPdbxRealSpaceR() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("pdbx_real_space_R", SingleRowFloatColumn::new) :
                getBinaryColumn("pdbx_real_space_R"));
    }

    /**
     * 
     * The density correlation coefficient is calculated from atomic
     * densities of (2Fobs-Fcalc) map - "Robs" and the model
     * map (Fcalc) - "Rcalc" :
     * 
     * D_corr =  <Robs><Rcalc>/sqrt(<Robs**2><Rcalc**2>)
     * 
     * where <Robs> is the mean of "observed" densities of all atoms
     * 
     * <Rcalc> is the mean of "calculated" densities of
     * all atoms.
     * 
     * The value of density for some atom from map R(x) is:
     * 
     * sum_i ( R(xi) * Ratom(xi - xa) )
     * Dens =  ----------------------------------
     * sum_i ( Ratom(xi - xa) )
     * 
     * where  Ratom(x) is atomic electron density for the x-th grid point.
     * xa - vector of the centre of atom.
     * xi - vector of the i-th point of grid.
     * Sum is taken over all grid points which have distance
     * from the center of the atom less than the Radius_limit.
     * For all atoms Radius_limit = 2.5 A.
     * 
     * Ref: Vaguine, A.A., Richelle, J. & Wodak, S.J. (1999). Acta Cryst. D55,199-205
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getPdbxDensityCorrelation() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("pdbx_density_correlation", SingleRowFloatColumn::new) :
                getBinaryColumn("pdbx_density_correlation"));
    }

    /**
     * The total number of powder patterns used.
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getPdbxPdNumberOfPowderPatterns() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("pdbx_pd_number_of_powder_patterns", SingleRowIntColumn::new) :
                getBinaryColumn("pdbx_pd_number_of_powder_patterns"));
    }

    /**
     * The total number of data points in the processed diffractogram.
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getPdbxPdNumberOfPoints() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("pdbx_pd_number_of_points", SingleRowIntColumn::new) :
                getBinaryColumn("pdbx_pd_number_of_points"));
    }

    /**
     * The total number of points in the measured
     * diffractogram.
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getPdbxPdMeasNumberOfPoints() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("pdbx_pd_meas_number_of_points", SingleRowIntColumn::new) :
                getBinaryColumn("pdbx_pd_meas_number_of_points"));
    }

    /**
     * Rietveld/Profile fit R factors.
     * Note that the R factor computed for Rietveld refinements
     * using the extracted reflection intensity values (often
     * called the Rietveld or Bragg R factor, R~B~) is not properly
     * a profile R factor.
     * pdbx_pd_proc_ls_prof_R_factor, often called R~p~, is an
     * unweighted fitness metric for the agreement between the
     * observed and computed diffraction patterns
     * R~p~ = sum~i~ | I~obs~(i) - I~calc~(i) |
     * / sum~i~ ( I~obs~(i) )
     * Note that in the above equations,
     * w(i) is the weight for the ith data point
     * I~obs~(i) is the observed intensity for the ith data
     * point, sometimes referred to as y~i~(obs) or
     * y~oi~.
     * I~calc~(i) is the computed intensity for the ith data
     * point with background and other corrections
     * applied to match the scale of the observed dataset,
     * sometimes referred to as y~i~(calc) or
     * y~ci~.
     * n is the total number of data points (see _refine.pdbx_pd_number_of_points)
     * less the number of data points excluded from the refinement.
     * p is the total number of refined parameters.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getPdbxPdProcLsProfRFactor() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("pdbx_pd_proc_ls_prof_R_factor", SingleRowFloatColumn::new) :
                getBinaryColumn("pdbx_pd_proc_ls_prof_R_factor"));
    }

    /**
     * Rietveld/Profile fit R factors.
     * Note that the R factor computed for Rietveld refinements
     * using the extracted reflection intensity values (often
     * called the Rietveld or Bragg R factor, R~B~) is not properly
     * a profile R factor.
     * pdbx_pd_proc_ls_prof_wR_factor often called R~wp~, is a
     * weighted fitness metric for the agreement between the
     * observed and computed diffraction patterns
     * R~wp~ = SQRT {
     * sum~i~ ( w(i) [ I~obs~(i) - I~calc~(i) ]^2^ )
     * / sum~i~ ( w(i) [I~obs~(i)]^2^ ) }
     * Note that in the above equations,
     * w(i) is the weight for the ith data point
     * I~obs~(i) is the observed intensity for the ith data
     * point, sometimes referred to as y~i~(obs) or
     * y~oi~.
     * I~calc~(i) is the computed intensity for the ith data
     * point with background and other corrections
     * applied to match the scale of the observed dataset,
     * sometimes referred to as y~i~(calc) or
     * y~ci~.
     * n is the total number of data points (see _refine.pdbx_pd_number_of_points)
     * less the number of data points excluded from the refinement.
     * p is the total number of refined parameters.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getPdbxPdProcLsProfWRFactor() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("pdbx_pd_proc_ls_prof_wR_factor", SingleRowFloatColumn::new) :
                getBinaryColumn("pdbx_pd_proc_ls_prof_wR_factor"));
    }

    /**
     * The correlation coefficient between the observed and
     * calculated structure factors for reflections included in
     * the refinement. This correlation factor is found in the
     * fitting using the Levenberg-Marquardt algorithm to search
     * for the minimum value of chisquare. Almost all computer
     * codes for Rietveld refinement employ the Gauss-Newton algorithm
     * to find parameters which minimize the weighted sum of squares
     * of the residuals.
     * A description of the equations is given on
     * http://www.water.hut.fi/~tkarvone/fr_org_s.htm
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getPdbxPdMarquardtCorrelationCoeff() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("pdbx_pd_Marquardt_correlation_coeff", SingleRowFloatColumn::new) :
                getBinaryColumn("pdbx_pd_Marquardt_correlation_coeff"));
    }

    /**
     * Residual factor R for reflections that satisfy the resolution
     * limits established by _refine.ls_d_res_high and
     * _refine.ls_d_res_low and the observation limit established by
     * _reflns.observed_criterion.
     * sum|F~obs~**2 - F~calc~**2|
     * R = ---------------------
     * sum|F~obs~**2|
     * F~obs~  = the observed structure-factor amplitudes
     * F~calc~ = the calculated structure-factor amplitudes
     * sum is taken over the specified reflections
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getPdbxPdFsqrdRFactor() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("pdbx_pd_Fsqrd_R_factor", SingleRowFloatColumn::new) :
                getBinaryColumn("pdbx_pd_Fsqrd_R_factor"));
    }

    /**
     * The least squares refinement "band matrix" approximation to the full matrix.
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getPdbxPdLsMatrixBandWidth() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("pdbx_pd_ls_matrix_band_width", SingleRowIntColumn::new) :
                getBinaryColumn("pdbx_pd_ls_matrix_band_width"));
    }

    /**
     * The overall phase error for all reflections after refinement using
     * the current refinement target.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getPdbxOverallPhaseError() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("pdbx_overall_phase_error", SingleRowFloatColumn::new) :
                getBinaryColumn("pdbx_overall_phase_error"));
    }

    /**
     * The overall standard uncertainty (estimated standard deviation)
     * of the displacement parameters based on the crystallographic
     * R-free value, expressed in a formalism known as the dispersion
     * precision indicator (DPI).
     * 
     * Ref: Cruickshank, D. W. J. (1999). Acta Cryst. D55, 583-601.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getPdbxOverallSURFreeCruickshankDPI() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("pdbx_overall_SU_R_free_Cruickshank_DPI", SingleRowFloatColumn::new) :
                getBinaryColumn("pdbx_overall_SU_R_free_Cruickshank_DPI"));
    }

    /**
     * The overall standard uncertainty (estimated standard deviation)
     * of the displacement parameters based on the crystallographic
     * R-free value, expressed in a formalism known as the dispersion
     * precision indicator (DPI).
     * 
     * Ref: Blow, D (2002) Acta Cryst. D58, 792-797
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getPdbxOverallSURFreeBlowDPI() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("pdbx_overall_SU_R_free_Blow_DPI", SingleRowFloatColumn::new) :
                getBinaryColumn("pdbx_overall_SU_R_free_Blow_DPI"));
    }

    /**
     * The overall standard uncertainty (estimated standard deviation)
     * of the displacement parameters based on the crystallographic
     * R value, expressed in a formalism known as the dispersion
     * precision indicator (DPI).
     * 
     * Ref: Blow, D (2002) Acta Cryst. D58, 792-797
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getPdbxOverallSURBlowDPI() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("pdbx_overall_SU_R_Blow_DPI", SingleRowFloatColumn::new) :
                getBinaryColumn("pdbx_overall_SU_R_Blow_DPI"));
    }

    /**
     * A flag for TLS refinements identifying the type of atomic displacement parameters stored
     * in _atom_site.B_iso_or_equiv.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getPdbxTLSResidualADPFlag() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("pdbx_TLS_residual_ADP_flag", SingleRowStrColumn::new) :
                getBinaryColumn("pdbx_TLS_residual_ADP_flag"));
    }

    /**
     * An identifier for the diffraction data set used in this refinement.
     * 
     * Multiple diffraction data sets specified as a comma separated list.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getPdbxDiffrnId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("pdbx_diffrn_id", SingleRowStrColumn::new) :
                getBinaryColumn("pdbx_diffrn_id"));
    }

    /**
     * The overall standard uncertainty (estimated standard deviation)
     * of the displacement parameters based on a maximum-likelihood
     * residual.
     * 
     * The overall standard uncertainty (sigma~B~)^2^ gives an idea
     * of the uncertainty in the B values of averagely defined
     * atoms (atoms with B values equal to the average B value).
     * 
     * N~a~
     * (sigma~B~)^2^ = 8 ----------------------------------------------
     * sum~i~ {[1/Sigma - (E~o~)^2^ (1-m^2^)](SUM_AS)s^4^}
     * 
     * N~a~           = number of atoms
     * E~o~           = normalized structure factors
     * m              = figure of merit of phases of reflections
     * included in the summation
     * s              = reciprocal-space vector
     * 
     * SUM_AS         = (sigma~A~)^2^/Sigma^2^
     * Sigma          = (sigma~{E;exp}~)^2^ + epsilon [1-(sigma~A~)^2^]
     * sigma~{E;exp}~  = experimental uncertainties of normalized
     * structure factors
     * sigma~A~        = <cos 2 pi s delta~x~> SQRT(Sigma~P~/Sigma~N~)
     * estimated using maximum likelihood
     * Sigma~P~        = sum~{atoms in model}~ f^2^
     * Sigma~N~        = sum~{atoms in crystal}~ f^2^
     * f               = atom form factor
     * delta~x~        = expected error
     * epsilon         = multiplicity of diffracting plane
     * 
     * summation is over all reflections included in refinement
     * 
     * Ref: (sigma~A~ estimation) "Refinement of macromolecular
     * structures by the maximum-likelihood method",
     * Murshudov, G. N., Vagin, A. A. & Dodson, E. J. (1997).
     * Acta Cryst. D53, 240-255.
     * 
     * (SU B estimation) Murshudov, G. N. & Dodson,
     * E. J. (1997). Simplified error estimation a la
     * Cruickshank in macromolecular crystallography.
     * CCP4 Newsletter on Protein Crystallography, No. 33,
     * January 1997, pp. 31-39.
     * 
     * http://www.ccp4.ac.uk/newsletters/newsletter33/murshudov.html
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getOverallSUB() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("overall_SU_B", SingleRowFloatColumn::new) :
                getBinaryColumn("overall_SU_B"));
    }

    /**
     * The overall standard uncertainty (estimated standard deviation)
     * of the positional parameters based on a maximum likelihood
     * residual.
     * 
     * The overall standard uncertainty (sigma~X~)^2^ gives an
     * idea of the uncertainty in the position of averagely
     * defined atoms (atoms with B values equal to average B value)
     * 
     * 3                         N~a~
     * (sigma~X~)^2^  = ---------------------------------------------------------
     * 8 pi^2^ sum~i~ {[1/Sigma - (E~o~)^2^ (1-m^2^)](SUM_AS)s^2^}
     * 
     * N~a~           = number of atoms
     * E~o~           = normalized structure factors
     * m              = figure of merit of phases of reflections
     * included in the summation
     * s              = reciprocal-space vector
     * 
     * SUM_AS         = (sigma~A~)^2^/Sigma^2^
     * Sigma          = (sigma~{E;exp}~)^2^ + epsilon [1-(sigma~A~)^2^]
     * sigma~{E;exp}~  = experimental uncertainties of normalized
     * structure factors
     * sigma~A~        = <cos 2 pi s delta~x~> SQRT(Sigma~P~/Sigma~N~)
     * estimated using maximum likelihood
     * Sigma~P~        = sum~{atoms in model}~ f^2^
     * Sigma~N~        = sum~{atoms in crystal}~ f^2^
     * f               = atom form factor
     * delta~x~        = expected error
     * epsilon         = multiplicity of diffracting plane
     * 
     * summation is over all reflections included in refinement
     * 
     * Ref: (sigma_A estimation) "Refinement of macromolecular
     * structures by the maximum-likelihood method",
     * Murshudov, G. N., Vagin, A. A. & Dodson, E. J. (1997).
     * Acta Cryst. D53, 240-255.
     * 
     * (SU ML estimation) Murshudov, G. N. & Dodson,
     * E. J. (1997). Simplified error estimation a la
     * Cruickshank in macromolecular crystallography.
     * CCP4 Newsletter on Protein Crystallography, No. 33,
     * January 1997, pp. 31-39.
     * 
     * http://www.ccp4.ac.uk/newsletters/newsletter33/murshudov.html
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getOverallSUML() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("overall_SU_ML", SingleRowFloatColumn::new) :
                getBinaryColumn("overall_SU_ML"));
    }

    /**
     * The overall standard uncertainty (estimated standard deviation)
     * of the displacement parameters based on the crystallographic
     * R value, expressed in a formalism known as the dispersion
     * precision indicator (DPI).
     * 
     * The overall standard uncertainty (sigma~B~) gives an idea
     * of the uncertainty in the B values of averagely defined
     * atoms (atoms with B values equal to the average B value).
     * 
     * N~a~
     * (sigma~B~)^2^ = 0.65 ---------- (R~value~)^2^ (D~min~)^2^ C^-2/3^
     * (N~o~-N~p~)
     * 
     * 
     * N~a~     = number of atoms included in refinement
     * N~o~     = number of observations
     * N~p~     = number of parameters refined
     * R~value~ = conventional crystallographic R value
     * D~min~   = maximum resolution
     * C        = completeness of data
     * 
     * Ref: Cruickshank, D. W. J. (1999). Acta Cryst. D55, 583-601.
     * 
     * Murshudov, G. N. & Dodson,
     * E. J. (1997). Simplified error estimation a la
     * Cruickshank in macromolecular crystallography.
     * CCP4 Newsletter on Protein Crystallography, No. 33,
     * January 1997, pp. 31-39.
     * 
     * http://www.ccp4.ac.uk/newsletters/newsletter33/murshudov.html
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getOverallSURCruickshankDPI() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("overall_SU_R_Cruickshank_DPI", SingleRowFloatColumn::new) :
                getBinaryColumn("overall_SU_R_Cruickshank_DPI"));
    }

    /**
     * The overall standard uncertainty (estimated standard deviation)
     * of the displacement parameters based on the free R value.
     * 
     * The overall standard uncertainty (sigma~B~) gives an idea
     * of the uncertainty in the B values of averagely defined
     * atoms (atoms with B values equal to the average B value).
     * 
     * N~a~
     * (sigma~B~)^2^ = 0.65 ---------- (R~free~)^2^ (D~min~)^2^ C^-2/3^
     * (N~o~-N~p~)
     * 
     * 
     * N~a~     = number of atoms included in refinement
     * N~o~     = number of observations
     * N~p~     = number of parameters refined
     * R~free~  = conventional free crystallographic R value calculated
     * using reflections not included in refinement
     * D~min~   = maximum resolution
     * C        = completeness of data
     * 
     * Ref: Cruickshank, D. W. J. (1999). Acta Cryst. D55, 583-601.
     * 
     * Murshudov, G. N. & Dodson,
     * E. J. (1997). Simplified error estimation a la
     * Cruickshank in macromolecular crystallography.
     * CCP4 Newsletter on Protein Crystallography, No. 33,
     * January 1997, pp. 31-39.
     * 
     * http://www.ccp4.ac.uk/newsletters/newsletter33/murshudov.html
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getOverallSURFree() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("overall_SU_R_free", SingleRowFloatColumn::new) :
                getBinaryColumn("overall_SU_R_free"));
    }

    /**
     * Average figure of merit of phases of reflections not included
     * in the refinement.
     * 
     * This value is derived from the likelihood function.
     * 
     * FOM           = I~1~(X)/I~0~(X)
     * 
     * I~0~, I~1~     = zero- and first-order modified Bessel functions
     * of the first kind
     * X              = sigma~A~ |E~o~| |E~c~|/SIGMA
     * E~o~, E~c~     = normalized observed and calculated structure
     * factors
     * sigma~A~       = <cos 2 pi s delta~x~> SQRT(Sigma~P~/Sigma~N~)
     * estimated using maximum likelihood
     * Sigma~P~       = sum~{atoms in model}~ f^2^
     * Sigma~N~       = sum~{atoms in crystal}~ f^2^
     * f              = form factor of atoms
     * delta~x~       = expected error
     * SIGMA          = (sigma~{E;exp}~)^2^ + epsilon [1-(sigma~A~)^2^]
     * sigma~{E;exp}~ = uncertainties of normalized observed
     * structure factors
     * epsilon       = multiplicity of the diffracting plane
     * 
     * Ref: Murshudov, G. N., Vagin, A. A. & Dodson, E. J. (1997).
     * Acta Cryst. D53, 240-255.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getOverallFOMFreeRSet() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("overall_FOM_free_R_set", SingleRowFloatColumn::new) :
                getBinaryColumn("overall_FOM_free_R_set"));
    }

    /**
     * Average figure of merit of phases of reflections included in
     * the refinement.
     * 
     * This value is derived from the likelihood function.
     * 
     * FOM           = I~1~(X)/I~0~(X)
     * 
     * I~0~, I~1~     = zero- and first-order modified Bessel functions
     * of the first kind
     * X              = sigma~A~ |E~o~| |E~c~|/SIGMA
     * E~o~, E~c~     = normalized observed and calculated structure
     * factors
     * sigma~A~       = <cos 2 pi s delta~x~> SQRT(Sigma~P~/Sigma~N~)
     * estimated using maximum likelihood
     * Sigma~P~       = sum~{atoms in model}~ f^2^
     * Sigma~N~       = sum~{atoms in crystal}~ f^2^
     * f              = form factor of atoms
     * delta~x~       = expected error
     * SIGMA          = (sigma~{E;exp}~)^2^ + epsilon [1-(sigma~A~)^2^]
     * sigma~{E;exp}~ = uncertainties of normalized observed
     * structure factors
     * epsilon       = multiplicity of the diffracting plane
     * 
     * Ref: Murshudov, G. N., Vagin, A. A. & Dodson, E. J. (1997).
     * Acta Cryst. D53, 240-255.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getOverallFOMWorkRSet() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("overall_FOM_work_R_set", SingleRowFloatColumn::new) :
                getBinaryColumn("overall_FOM_work_R_set"));
    }

    /**
     * Overall average Fourier Shell Correlation (avgFSC) between model and
     * observed structure factors for all reflections.
     * 
     * The average FSC is a measure of the agreement between observed
     * and calculated structure factors.
     * 
     * sum(N~i~ FSC~i~)
     * avgFSC   = ----------------
     * sum(N~i~)
     * 
     * 
     * N~i~     = the number of all reflections in the resolution shell i
     * FSC~i~   = FSC for all reflections in the i-th resolution shell calculated as:
     * 
     * (sum(|F~o~| |F~c~| fom cos(phi~c~-phi~o~)))
     * FSC~i~  = -------------------------------------------
     * (sum(|F~o~|^2^) (sum(|F~c~|^2^)))^1/2^
     * 
     * |F~o~|   = amplitude of observed structure factor
     * |F~c~|   = amplitude of calculated structure factor
     * phi~o~   = phase of observed structure factor
     * phi~c~   = phase of calculated structure factor
     * fom      = figure of merit of the experimental phases.
     * 
     * Summation of FSC~i~ is carried over all reflections in the resolution shell.
     * 
     * Summation of avgFSC is carried over all resolution shells.
     * 
     * 
     * Ref:  Rosenthal P.B., Henderson R.
     * "Optimal determination of particle orientation, absolute hand,
     * and contrast loss in single-particle electron cryomicroscopy.
     * Journal of Molecular Biology. 2003;333(4):721-745, equation (A6).
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getPdbxAverageFscOverall() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("pdbx_average_fsc_overall", SingleRowFloatColumn::new) :
                getBinaryColumn("pdbx_average_fsc_overall"));
    }

    /**
     * Average Fourier Shell Correlation (avgFSC) between model and
     * observed structure factors for reflections included in refinement.
     * 
     * The average FSC is a measure of the agreement between observed
     * and calculated structure factors.
     * 
     * sum(N~i~ FSC~work-i~)
     * avgFSC~work~   = ---------------------
     * sum(N~i~)
     * 
     * 
     * N~i~          = the number of working reflections in the resolution shell i
     * FSC~work-i~   = FSC for working reflections in the i-th resolution shell calculated as:
     * 
     * (sum(|F~o~| |F~c~| fom cos(phi~c~-phi~o~)))
     * FSC~work-i~  = -------------------------------------------
     * (sum(|F~o~|^2^) (sum(|F~c~|^2^)))^1/2^
     * 
     * |F~o~|   = amplitude of observed structure factor
     * |F~c~|   = amplitude of calculated structure factor
     * phi~o~   = phase of observed structure factor
     * phi~c~   = phase of calculated structure factor
     * fom      = figure of merit of the experimental phases.
     * 
     * Summation of FSC~work-i~ is carried over all working reflections in the resolution shell.
     * 
     * Summation of avgFSC~work~ is carried over all resolution shells.
     * 
     * 
     * Ref:  Rosenthal P.B., Henderson R.
     * "Optimal determination of particle orientation, absolute hand,
     * and contrast loss in single-particle electron cryomicroscopy.
     * Journal of Molecular Biology. 2003;333(4):721-745, equation (A6).
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getPdbxAverageFscWork() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("pdbx_average_fsc_work", SingleRowFloatColumn::new) :
                getBinaryColumn("pdbx_average_fsc_work"));
    }

    /**
     * Average Fourier Shell Correlation (avgFSC) between model and
     * observed structure factors for reflections not included in refinement.
     * 
     * The average FSC is a measure of the agreement between observed
     * and calculated structure factors.
     * 
     * sum(N~i~ FSC~free-i~)
     * avgFSC~free~   = ---------------------
     * sum(N~i~)
     * 
     * 
     * N~i~          = the number of free reflections in the resolution shell i
     * FSC~free-i~   = FSC for free reflections in the i-th resolution shell calculated as:
     * 
     * (sum(|F~o~| |F~c~| fom cos(phi~c~-phi~o~)))
     * FSC~free-i~  = -------------------------------------------
     * (sum(|F~o~|^2^) (sum(|F~c~|^2^)))^1/2^
     * 
     * |F~o~|   = amplitude of observed structure factor
     * |F~c~|   = amplitude of calculated structure factor
     * phi~o~   = phase of observed structure factor
     * phi~c~   = phase of calculated structure factor
     * fom      = figure of merit of the experimental phases.
     * 
     * Summation of FSC~free-i~ is carried over all free reflections in the resolution shell.
     * 
     * Summation of avgFSC~free~ is carried over all resolution shells.
     * 
     * 
     * Ref:  Rosenthal P.B., Henderson R.
     * "Optimal determination of particle orientation, absolute hand,
     * and contrast loss in single-particle electron cryomicroscopy.
     * Journal of Molecular Biology. 2003;333(4):721-745, equation (A6).
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getPdbxAverageFscFree() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("pdbx_average_fsc_free", SingleRowFloatColumn::new) :
                getBinaryColumn("pdbx_average_fsc_free"));
    }

    /**
     * Overall estimated standard uncertainties of thermal parameters
     * based on Maximum likelihood residual.
     * 
     * Overall ESU gives an idea about uncertainties of B-values of
     * averagely defined atoms (atoms with B-values equal to average
     * B-value)
     * 
     * N_a
     * (sigma_B)^2  = 8 ----------------------------------------------
     * sum~i~ {(1/Sigma - (E_o)^2 (1-m^2)(SUM_AS)s^4}
     * 
     * SUM_AS         = (sigma_A)^2/Sigma^2)
     * N_a            = number of atoms
     * Sigma          = (sigma_{E;exp})^2 + epsilon (1-{sigma_A)^2)
     * E_o            = normalized structure factors
     * sigma_{E;exp}  = experimental uncertainties of normalized
     * structure factors
     * sigma_A        = <cos 2 pi s delta_x> SQRT(Sigma_P/Sigma_N)
     * estimated using maximum likelihood
     * Sigma_P        = sum_{atoms in model} f^2
     * Sigma_N        = sum_{atoms in crystal} f^2
     * f              = is form factor of atoms
     * delta_x        = expected error
     * m              = is figure of merit of phases of reflection
     * included in summation delta_x expected error
     * s              = reciprocal space vector
     * epsilon        = multiplicity of diffracting plane
     * 
     * summation is over all reflections included in refinement
     * 
     * Reference for sigma_A estimation:
     * 
     * "Refinement of Macromolecular Structures by the
     * Maximum-Likelihood Method:"  G.N. Murshudov, A.A.Vagin and
     * E.J.Dodson,(1997) Acta Crystallogr. D53, 240-255
     * 
     * Reference for ESU_ML estimation:
     * 
     * "Simplified error estimation a la Cruickshank in macromolecular
     * crystallography",  Murshudov G.N. & Dodson E.J.  in the "CCP4
     * Newsletter on protein crystallography" Number 33 ed. M.Winn
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getPdbxOverallESUB() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("pdbx_overall_ESU_B", SingleRowFloatColumn::new) :
                getBinaryColumn("pdbx_overall_ESU_B"));
    }

    /**
     * Overall estimated standard uncertainties of positional
     * parameters based on Maximum likelihood residual.
     * 
     * Overall ESU gives an idea about uncertainties in the position
     * of averagely defined atoms (atoms with B-values equal to
     * average B-value)
     * 
     * 3                         N_a
     * (sigma_X)^2  = -----------------------------------------------------
     * 8 pi^2 sum~i~ {(1/Sigma - (E_o)^2 (1-m^2)(SUM_AS)s^2}
     * 
     * SUM_AS         = (sigma_A)^2/Sigma^2)
     * N_a            = number of atoms
     * Sigma          = (sigma_{E;exp})^2 + epsilon (1-{sigma_A)^2)
     * E_o            = normalized structure factors
     * 
     * sigma_{E;exp}  = experimental uncertainties of normalized
     * structure factors
     * sigma_A        = <cos 2 pi s delta_x> SQRT(Sigma_P/Sigma_N)
     * estimated using maximum likelihood
     * Sigma_P        = sum_{atoms in model} f^2
     * Sigma_N        = sum_{atoms in crystal} f^2
     * f              = is formfactor of atoms
     * delta_x        = expected error
     * m              = is figure of merit of phases of reflection
     * included in summation delta_x expected error
     * s              = reciprocal space vector
     * epsilon        = multiplicity of diffracting plane
     * 
     * summation is over all reflections included in refinement
     * 
     * Reference for sigma_A estimation:
     * 
     * "Refinement of Macromolecular Structures by the
     * Maximum-Likelihood Method:" G.N. Murshudov, A.A.Vagin and
     * E.J.Dodson,(1997)  Acta Crystallogr. D53, 240-255
     * 
     * Reference for ESU_ML estimation:
     * 
     * Simplified error estimation a la Cruickshank in macromolecular
     * crystallograpy  Murshudov G.N. & Dodson E.J.  in the "CCP4
     * Newsletter on protein crystallography" Number 33 ed. M.Winn
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getPdbxOverallESUML() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("pdbx_overall_ESU_ML", SingleRowFloatColumn::new) :
                getBinaryColumn("pdbx_overall_ESU_ML"));
    }
}
