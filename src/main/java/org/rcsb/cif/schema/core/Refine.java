package org.rcsb.cif.schema.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * The CATEGORY of data items used to specify information about the
 * refinement of the structural model.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class Refine extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "refine";

    public Refine(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
    }

    /**
     * Details of the refinement not specified by other data items.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return new DelegatingStrColumn(parentBlock.getAliasedColumn("refine_details", "refine_special_details"));
    }

    /**
     * Details of the refinement not specified by other data items.
     * @return StrColumn
     */
    public StrColumn getSpecialDetails() {
        return new DelegatingStrColumn(parentBlock.getAliasedColumn("refine_details", "refine_special_details"));
    }

    /**
     * Maximum density value in a difference Fourier map.
     * @return FloatColumn
     */
    public FloatColumn getDiffDensityMax() {
        return new DelegatingFloatColumn(parentBlock.getColumn("refine_diff_density_max"));
    }

    /**
     * Maximum density value in a difference Fourier map.
     * @return FloatColumn
     */
    public FloatColumn getDensityMax() {
        return new DelegatingFloatColumn(parentBlock.getColumn("refine_diff_density_max"));
    }

    /**
     * Standard uncertainty of the maximum density value
     * in a difference Fourier map.
     * @return FloatColumn
     */
    public FloatColumn getDiffDensityMaxEsd() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("refine_diff_density_max_esd", "refine_diff_density_max_su"));
    }

    /**
     * Standard uncertainty of the maximum density value
     * in a difference Fourier map.
     * @return FloatColumn
     */
    public FloatColumn getDensityMaxSu() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("refine_diff_density_max_esd", "refine_diff_density_max_su"));
    }

    /**
     * Minimum density value in a difference Fourier map.
     * @return FloatColumn
     */
    public FloatColumn getDiffDensityMin() {
        return new DelegatingFloatColumn(parentBlock.getColumn("refine_diff_density_min"));
    }

    /**
     * Minimum density value in a difference Fourier map.
     * @return FloatColumn
     */
    public FloatColumn getDensityMin() {
        return new DelegatingFloatColumn(parentBlock.getColumn("refine_diff_density_min"));
    }

    /**
     * Standard uncertainty of the minimum density value
     * in a difference Fourier map.
     * @return FloatColumn
     */
    public FloatColumn getDiffDensityMinEsd() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("refine_diff_density_min_esd", "refine_diff_density_min_su"));
    }

    /**
     * Standard uncertainty of the minimum density value
     * in a difference Fourier map.
     * @return FloatColumn
     */
    public FloatColumn getDensityMinSu() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("refine_diff_density_min_esd", "refine_diff_density_min_su"));
    }

    /**
     * Root mean square density value in a difference Fourier map.
     * This value is measured with respect to the arithmetic mean
     * density and is derived from summations over each grid point
     * in the asymmetric unit of the cell. This quantity is useful
     * for assessing the significance of *_min and *_max values,
     * and also for defining suitable contour levels.
     * @return FloatColumn
     */
    public FloatColumn getDiffDensityRMS() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("refine_diff_density_RMS", "refine_diff_density_rms"));
    }

    /**
     * Root mean square density value in a difference Fourier map.
     * This value is measured with respect to the arithmetic mean
     * density and is derived from summations over each grid point
     * in the asymmetric unit of the cell. This quantity is useful
     * for assessing the significance of *_min and *_max values,
     * and also for defining suitable contour levels.
     * @return FloatColumn
     */
    public FloatColumn getDensityRms() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("refine_diff_density_RMS", "refine_diff_density_rms"));
    }

    /**
     * Standard uncertainty of the root mean square density value
     * in a difference Fourier map.
     * @return FloatColumn
     */
    public FloatColumn getDiffDensityRMSEsd() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("refine_diff_density_RMS_esd", "refine_diff_density_rms_su"));
    }

    /**
     * Standard uncertainty of the root mean square density value
     * in a difference Fourier map.
     * @return FloatColumn
     */
    public FloatColumn getDensityRmsSu() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("refine_diff_density_RMS_esd", "refine_diff_density_rms_su"));
    }

    /**
     * Details on the absolute structure and how it was determined.
     * @return StrColumn
     */
    public StrColumn getLsAbsStructureDetails() {
        return new DelegatingStrColumn(parentBlock.getColumn("refine_ls_abs_structure_details"));
    }

    /**
     * Details on the absolute structure and how it was determined.
     * @return StrColumn
     */
    public StrColumn getAbsStructureDetails() {
        return new DelegatingStrColumn(parentBlock.getColumn("refine_ls_abs_structure_details"));
    }

    /**
     * The measure of absolute structure as defined by Flack (1983).
     * For centrosymmetric structures, the only permitted value, if
     * the data item is present, is 'inapplicable', represented by '.' .
     * For noncentrosymmetric structures, the value must lie in the
     * 99.97% Gaussian confidence interval  -3u =&lt; x =&lt; 1 + 3u and a
     * standard uncertainty (e.s.d.) u must be supplied. The
     * _enumeration.range of 0.0:1.0 is correctly interpreted as
     * meaning (0.0 - 3u) =&lt; x =&lt; (1.0 + 3u).
     * Ref: Flack, H. D. (1983). Acta Cryst. A39, 876-881.
     * @return FloatColumn
     */
    public FloatColumn getLsAbsStructureFlack() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("refine_ls_abs_structure_Flack", "refine_ls_abs_structure_flack"));
    }

    /**
     * The measure of absolute structure as defined by Flack (1983).
     * For centrosymmetric structures, the only permitted value, if
     * the data item is present, is 'inapplicable', represented by '.' .
     * For noncentrosymmetric structures, the value must lie in the
     * 99.97% Gaussian confidence interval  -3u =&lt; x =&lt; 1 + 3u and a
     * standard uncertainty (e.s.d.) u must be supplied. The
     * _enumeration.range of 0.0:1.0 is correctly interpreted as
     * meaning (0.0 - 3u) =&lt; x =&lt; (1.0 + 3u).
     * Ref: Flack, H. D. (1983). Acta Cryst. A39, 876-881.
     * @return FloatColumn
     */
    public FloatColumn getAbsStructureFlack() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("refine_ls_abs_structure_Flack", "refine_ls_abs_structure_flack"));
    }

    /**
     * Standard uncertainty of the measure of absolute structure
     * as defined by Flack (1983).
     * @return FloatColumn
     */
    public FloatColumn getLsAbsStructureFlackEsd() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("refine_ls_abs_structure_Flack_esd", "refine_ls_abs_structure_flack_su"));
    }

    /**
     * Standard uncertainty of the measure of absolute structure
     * as defined by Flack (1983).
     * @return FloatColumn
     */
    public FloatColumn getAbsStructureFlackSu() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("refine_ls_abs_structure_Flack_esd", "refine_ls_abs_structure_flack_su"));
    }

    /**
     * The measure of absolute structure as defined by Rogers (1981).
     * The value must lie in the 99.97% Gaussian confidence interval
     * -1 -3u =&lt; η =&lt; 1 + 3u and a standard uncertainty (e.s.d.) u must
     * be supplied. The _enumeration.range of -1.0:1.0 is correctly
     * interpreted as meaning (-1.0 - 3u) =&lt; η =&lt; (1.0 + 3u).
     * Ref: Rogers, D. (1981). Acta Cryst. A37, 734-741.
     * @return FloatColumn
     */
    public FloatColumn getLsAbsStructureRogers() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("refine_ls_abs_structure_Rogers", "refine_ls_abs_structure_rogers"));
    }

    /**
     * The measure of absolute structure as defined by Rogers (1981).
     * The value must lie in the 99.97% Gaussian confidence interval
     * -1 -3u =&lt; η =&lt; 1 + 3u and a standard uncertainty (e.s.d.) u must
     * be supplied. The _enumeration.range of -1.0:1.0 is correctly
     * interpreted as meaning (-1.0 - 3u) =&lt; η =&lt; (1.0 + 3u).
     * Ref: Rogers, D. (1981). Acta Cryst. A37, 734-741.
     * @return FloatColumn
     */
    public FloatColumn getAbsStructureRogers() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("refine_ls_abs_structure_Rogers", "refine_ls_abs_structure_rogers"));
    }

    /**
     * Standard uncertainty of the measure of absolute structure
     * as defined by Rogers (1981).
     * @return FloatColumn
     */
    public FloatColumn getLsAbsStructureRogersEsd() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("refine_ls_abs_structure_Rogers_esd", "refine_ls_abs_structure_rogers_su"));
    }

    /**
     * Standard uncertainty of the measure of absolute structure
     * as defined by Rogers (1981).
     * @return FloatColumn
     */
    public FloatColumn getAbsStructureRogersSu() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("refine_ls_abs_structure_Rogers_esd", "refine_ls_abs_structure_rogers_su"));
    }

    /**
     * Highest resolution for the reflections used in refinement.
     * This corresponds to the smallest interplanar d value.
     * @return FloatColumn
     */
    public FloatColumn getLsDResHigh() {
        return new DelegatingFloatColumn(parentBlock.getColumn("refine_ls_d_res_high"));
    }

    /**
     * Highest resolution for the reflections used in refinement.
     * This corresponds to the smallest interplanar d value.
     * @return FloatColumn
     */
    public FloatColumn getDResHigh() {
        return new DelegatingFloatColumn(parentBlock.getColumn("refine_ls_d_res_high"));
    }

    /**
     * Lowest resolution for the reflections used in refinement.
     * This corresponds to the largest interplanar d value.
     * @return FloatColumn
     */
    public FloatColumn getLsDResLow() {
        return new DelegatingFloatColumn(parentBlock.getColumn("refine_ls_d_res_low"));
    }

    /**
     * Lowest resolution for the reflections used in refinement.
     * This corresponds to the largest interplanar d value.
     * @return FloatColumn
     */
    public FloatColumn getDResLow() {
        return new DelegatingFloatColumn(parentBlock.getColumn("refine_ls_d_res_low"));
    }

    /**
     * The extinction coefficient used to calculate the correction
     * factor applied to the structure-factor data. The nature of the
     * extinction coefficient is given in the definitions of
     * _refine_ls.extinction_expression and _refine_ls.extinction_method.
     * For the 'Zachariasen' method it is the r* value; for the
     * 'Becker-Coppens type 1 isotropic' method it is the 'g' value.
     * For 'Becker-Coppens type 2 isotropic' corrections it is
     * the 'rho' value. Note that the magnitude of these values is
     * usually of the order of 10000.
     * Ref:  Becker, P. J. &amp; Coppens, P. (1974). Acta Cryst. A30,
     * 129-147, 148-153.
     * Zachariasen, W. H. (1967). Acta Cryst. 23, 558-564.
     * Larson, A. C. (1967). Acta Cryst. 23, 664-665.
     * @return FloatColumn
     */
    public FloatColumn getLsExtinctionCoef() {
        return new DelegatingFloatColumn(parentBlock.getColumn("refine_ls_extinction_coef"));
    }

    /**
     * The extinction coefficient used to calculate the correction
     * factor applied to the structure-factor data. The nature of the
     * extinction coefficient is given in the definitions of
     * _refine_ls.extinction_expression and _refine_ls.extinction_method.
     * For the 'Zachariasen' method it is the r* value; for the
     * 'Becker-Coppens type 1 isotropic' method it is the 'g' value.
     * For 'Becker-Coppens type 2 isotropic' corrections it is
     * the 'rho' value. Note that the magnitude of these values is
     * usually of the order of 10000.
     * Ref:  Becker, P. J. &amp; Coppens, P. (1974). Acta Cryst. A30,
     * 129-147, 148-153.
     * Zachariasen, W. H. (1967). Acta Cryst. 23, 558-564.
     * Larson, A. C. (1967). Acta Cryst. 23, 664-665.
     * @return FloatColumn
     */
    public FloatColumn getExtinctionCoef() {
        return new DelegatingFloatColumn(parentBlock.getColumn("refine_ls_extinction_coef"));
    }

    /**
     * Standard uncertainty of the extinction coefficient.
     * @return FloatColumn
     */
    public FloatColumn getLsExtinctionCoefEsd() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("refine_ls_extinction_coef_esd", "refine_ls_extinction_coef_su"));
    }

    /**
     * Standard uncertainty of the extinction coefficient.
     * @return FloatColumn
     */
    public FloatColumn getExtinctionCoefSu() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("refine_ls_extinction_coef_esd", "refine_ls_extinction_coef_su"));
    }

    /**
     * Description of or reference to the extinction-correction equation
     * used to apply the data item  _refine_ls.extinction_coef. This
     * information should be sufficient to reproduce the extinction-correction
     * factors applied to the structure factors.
     * @return StrColumn
     */
    public StrColumn getLsExtinctionExpression() {
        return new DelegatingStrColumn(parentBlock.getColumn("refine_ls_extinction_expression"));
    }

    /**
     * Description of or reference to the extinction-correction equation
     * used to apply the data item  _refine_ls.extinction_coef. This
     * information should be sufficient to reproduce the extinction-correction
     * factors applied to the structure factors.
     * @return StrColumn
     */
    public StrColumn getExtinctionExpression() {
        return new DelegatingStrColumn(parentBlock.getColumn("refine_ls_extinction_expression"));
    }

    /**
     * Description of the extinction correction method applied with the
     * data item _refine_ls.extinction_coef. This description should
     * include information about the correction method, either 'Becker-
     * Coppens' or 'Zachariasen'. The latter is sometimes referred to as
     * the 'Larson' method even though it employs Zachariasen's formula.
     * 
     * The Becker-Coppens procedure is referred to as 'type 1' when
     * correcting secondary extinction dominated by the mosaic spread;
     * as 'type 2' when secondary extinction is dominated by particle
     * size and includes a primary extinction component; and as 'mixed'
     * when there are types 1 and 2.
     * 
     * For the Becker-Coppens method it is also necessary to set the
     * mosaic distribution as either 'Gaussian' or 'Lorentzian'; and the
     * nature of the extinction as 'isotropic' or 'anisotropic'. Note
     * that if either the 'mixed' or 'anisotropic' corrections are applied
     * the multiple coefficients cannot be contained in the
     * _refine_ls.extinction_coef and must be listed in _refine.special_details.
     * 
     * Ref:  Becker, P. J. &amp; Coppens, P. (1974). Acta Cryst. A30, 129-153.
     * Zachariasen, W. H. (1967). Acta Cryst. 23, 558-564.
     * Larson, A. C. (1967). Acta Cryst. 23, 664-665.
     * @return StrColumn
     */
    public StrColumn getLsExtinctionMethod() {
        return new DelegatingStrColumn(parentBlock.getColumn("refine_ls_extinction_method"));
    }

    /**
     * Description of the extinction correction method applied with the
     * data item _refine_ls.extinction_coef. This description should
     * include information about the correction method, either 'Becker-
     * Coppens' or 'Zachariasen'. The latter is sometimes referred to as
     * the 'Larson' method even though it employs Zachariasen's formula.
     * 
     * The Becker-Coppens procedure is referred to as 'type 1' when
     * correcting secondary extinction dominated by the mosaic spread;
     * as 'type 2' when secondary extinction is dominated by particle
     * size and includes a primary extinction component; and as 'mixed'
     * when there are types 1 and 2.
     * 
     * For the Becker-Coppens method it is also necessary to set the
     * mosaic distribution as either 'Gaussian' or 'Lorentzian'; and the
     * nature of the extinction as 'isotropic' or 'anisotropic'. Note
     * that if either the 'mixed' or 'anisotropic' corrections are applied
     * the multiple coefficients cannot be contained in the
     * _refine_ls.extinction_coef and must be listed in _refine.special_details.
     * 
     * Ref:  Becker, P. J. &amp; Coppens, P. (1974). Acta Cryst. A30, 129-153.
     * Zachariasen, W. H. (1967). Acta Cryst. 23, 558-564.
     * Larson, A. C. (1967). Acta Cryst. 23, 664-665.
     * @return StrColumn
     */
    public StrColumn getExtinctionMethod() {
        return new DelegatingStrColumn(parentBlock.getColumn("refine_ls_extinction_method"));
    }

    /**
     * Least-squares goodness-of-fit parameter S for all reflections after
     * the final cycle of refinement. Ideally, account should be taken of
     * parameters restrained in the least squares.
     * 
     * {  sum { w [ Y(meas) - Y(calc) ]^2^ }  }^1/2^
     * S = { ------------------------------------ }
     * {            Nref - Nparam             }
     * 
     * Y(meas) = the measured coefficients
     * (see _refine_ls.structure_factor_coef)
     * Y(calc) = the calculated coefficients
     * (see _refine_ls.structure_factor_coef)
     * w       = the least-squares reflection weight
     * [1/(u^2^)]
     * u       = standard uncertainty
     * Nref   = the number of reflections used in the refinement
     * Nparam = the number of refined parameters
     * and the sum is taken over the specified reflections
     * @return FloatColumn
     */
    public FloatColumn getLsGoodnessOfFitAll() {
        return new DelegatingFloatColumn(parentBlock.getColumn("refine_ls_goodness_of_fit_all"));
    }

    /**
     * Least-squares goodness-of-fit parameter S for all reflections after
     * the final cycle of refinement. Ideally, account should be taken of
     * parameters restrained in the least squares.
     * 
     * {  sum { w [ Y(meas) - Y(calc) ]^2^ }  }^1/2^
     * S = { ------------------------------------ }
     * {            Nref - Nparam             }
     * 
     * Y(meas) = the measured coefficients
     * (see _refine_ls.structure_factor_coef)
     * Y(calc) = the calculated coefficients
     * (see _refine_ls.structure_factor_coef)
     * w       = the least-squares reflection weight
     * [1/(u^2^)]
     * u       = standard uncertainty
     * Nref   = the number of reflections used in the refinement
     * Nparam = the number of refined parameters
     * and the sum is taken over the specified reflections
     * @return FloatColumn
     */
    public FloatColumn getGoodnessOfFitAll() {
        return new DelegatingFloatColumn(parentBlock.getColumn("refine_ls_goodness_of_fit_all"));
    }

    /**
     * Standard uncertainty of the least-squares goodness-of-fit
     * parameter S for all reflections after the final cycle of refinement.
     * @return FloatColumn
     */
    public FloatColumn getLsGoodnessOfFitAllEsd() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("refine_ls_goodness_of_fit_all_esd", "refine_ls_goodness_of_fit_all_su"));
    }

    /**
     * Standard uncertainty of the least-squares goodness-of-fit
     * parameter S for all reflections after the final cycle of refinement.
     * @return FloatColumn
     */
    public FloatColumn getGoodnessOfFitAllSu() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("refine_ls_goodness_of_fit_all_esd", "refine_ls_goodness_of_fit_all_su"));
    }

    /**
     * Least-squares goodness-of-fit parameter S for significantly
     * intense reflections, (i.e. 'observed' reflections with values
     * greater-than the threshold set in _reflns.threshold_expression),
     * after the final cycle. Ideally, account should be taken of
     * parameters restrained in the least-squares refinement.
     * 
     * {  sum { w [ Y(meas_gt) - Y(calc) ]^2^ }  }^1/2^
     * S = { --------------------------------------- }
     * {           Nref - Nparam                 }
     * 
     * Y(meas_gt)  = the 'observed' coefficients
     * (see _refine_ls.structure_factor_coef)
     * Y(calc)     = the calculated coefficients
     * (see _refine_ls.structure_factor_coef)
     * w       = the least-squares reflection weight
     * [1/(u^2^)]
     * u       = standard uncertainty
     * Nref   = the number of reflections used in the refinement
     * Nparam = the number of refined parameters
     * and the sum is taken over the specified reflections
     * @return FloatColumn
     */
    public FloatColumn getLsGoodnessOfFitObs() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("refine_ls_goodness_of_fit_obs", "refine_ls_goodness_of_fit_gt"));
    }

    /**
     * Least-squares goodness-of-fit parameter S for significantly
     * intense reflections, (i.e. 'observed' reflections with values
     * greater-than the threshold set in _reflns.threshold_expression),
     * after the final cycle. Ideally, account should be taken of
     * parameters restrained in the least-squares refinement.
     * 
     * {  sum { w [ Y(meas_gt) - Y(calc) ]^2^ }  }^1/2^
     * S = { --------------------------------------- }
     * {           Nref - Nparam                 }
     * 
     * Y(meas_gt)  = the 'observed' coefficients
     * (see _refine_ls.structure_factor_coef)
     * Y(calc)     = the calculated coefficients
     * (see _refine_ls.structure_factor_coef)
     * w       = the least-squares reflection weight
     * [1/(u^2^)]
     * u       = standard uncertainty
     * Nref   = the number of reflections used in the refinement
     * Nparam = the number of refined parameters
     * and the sum is taken over the specified reflections
     * @return FloatColumn
     */
    public FloatColumn getLsGoodnessOfFitGt() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("refine_ls_goodness_of_fit_obs", "refine_ls_goodness_of_fit_gt"));
    }

    /**
     * Least-squares goodness-of-fit parameter S for significantly
     * intense reflections, (i.e. 'observed' reflections with values
     * greater-than the threshold set in _reflns.threshold_expression),
     * after the final cycle. Ideally, account should be taken of
     * parameters restrained in the least-squares refinement.
     * 
     * {  sum { w [ Y(meas_gt) - Y(calc) ]^2^ }  }^1/2^
     * S = { --------------------------------------- }
     * {           Nref - Nparam                 }
     * 
     * Y(meas_gt)  = the 'observed' coefficients
     * (see _refine_ls.structure_factor_coef)
     * Y(calc)     = the calculated coefficients
     * (see _refine_ls.structure_factor_coef)
     * w       = the least-squares reflection weight
     * [1/(u^2^)]
     * u       = standard uncertainty
     * Nref   = the number of reflections used in the refinement
     * Nparam = the number of refined parameters
     * and the sum is taken over the specified reflections
     * @return FloatColumn
     */
    public FloatColumn getGoodnessOfFitGt() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("refine_ls_goodness_of_fit_obs", "refine_ls_goodness_of_fit_gt"));
    }

    /**
     * Standard uncertainty of the least-squares goodness-of-fit
     * parameter S for gt reflections after the final cycle of refinement.
     * @return FloatColumn
     */
    public FloatColumn getLsGoodnessOfFitGtEsd() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("refine_ls_goodness_of_fit_gt_esd", "refine_ls_goodness_of_fit_obs_esd", "refine_ls_goodness_of_fit_gt_su"));
    }

    /**
     * Standard uncertainty of the least-squares goodness-of-fit
     * parameter S for gt reflections after the final cycle of refinement.
     * @return FloatColumn
     */
    public FloatColumn getLsGoodnessOfFitObsEsd() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("refine_ls_goodness_of_fit_gt_esd", "refine_ls_goodness_of_fit_obs_esd", "refine_ls_goodness_of_fit_gt_su"));
    }

    /**
     * Standard uncertainty of the least-squares goodness-of-fit
     * parameter S for gt reflections after the final cycle of refinement.
     * @return FloatColumn
     */
    public FloatColumn getGoodnessOfFitGtSu() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("refine_ls_goodness_of_fit_gt_esd", "refine_ls_goodness_of_fit_obs_esd", "refine_ls_goodness_of_fit_gt_su"));
    }

    /**
     * Least-squares goodness-of-fit parameter S for those reflections
     * included in the final cycle of refinement. Account should be
     * taken of restrained parameters.
     * 
     * {  sum { w [ Y(meas) - Y(calc) ]^2^ }  }^1/2^
     * S = { ------------------------------------ }
     * {            Nref - Nparam             }
     * 
     * Y(meas) = the measured coefficients
     * (see _refine_ls.structure_factor_coef)
     * Y(calc) = the calculated coefficients
     * (see _refine_ls.structure_factor_coef)
     * w       = the least-squares reflection weight
     * [1/(u^2^)]
     * u       = standard uncertainty
     * Nref   = the number of reflections used in the refinement
     * Nparam = the number of refined parameters
     * and the sum is taken over the specified reflections
     * @return FloatColumn
     */
    public FloatColumn getLsGoodnessOfFitRef() {
        return new DelegatingFloatColumn(parentBlock.getColumn("refine_ls_goodness_of_fit_ref"));
    }

    /**
     * Least-squares goodness-of-fit parameter S for those reflections
     * included in the final cycle of refinement. Account should be
     * taken of restrained parameters.
     * 
     * {  sum { w [ Y(meas) - Y(calc) ]^2^ }  }^1/2^
     * S = { ------------------------------------ }
     * {            Nref - Nparam             }
     * 
     * Y(meas) = the measured coefficients
     * (see _refine_ls.structure_factor_coef)
     * Y(calc) = the calculated coefficients
     * (see _refine_ls.structure_factor_coef)
     * w       = the least-squares reflection weight
     * [1/(u^2^)]
     * u       = standard uncertainty
     * Nref   = the number of reflections used in the refinement
     * Nparam = the number of refined parameters
     * and the sum is taken over the specified reflections
     * @return FloatColumn
     */
    public FloatColumn getGoodnessOfFitRef() {
        return new DelegatingFloatColumn(parentBlock.getColumn("refine_ls_goodness_of_fit_ref"));
    }

    /**
     * Code identifying how hydrogen atoms were treated in the refinement.
     * @return StrColumn
     */
    public StrColumn getLsHydrogenTreatment() {
        return new DelegatingStrColumn(parentBlock.getColumn("refine_ls_hydrogen_treatment"));
    }

    /**
     * Code identifying how hydrogen atoms were treated in the refinement.
     * @return StrColumn
     */
    public StrColumn getHydrogenTreatment() {
        return new DelegatingStrColumn(parentBlock.getColumn("refine_ls_hydrogen_treatment"));
    }

    /**
     * Code identifying the matrix type used for least-squares derivatives.
     * @return StrColumn
     */
    public StrColumn getLsMatrixType() {
        return new DelegatingStrColumn(parentBlock.getColumn("refine_ls_matrix_type"));
    }

    /**
     * Code identifying the matrix type used for least-squares derivatives.
     * @return StrColumn
     */
    public StrColumn getMatrixType() {
        return new DelegatingStrColumn(parentBlock.getColumn("refine_ls_matrix_type"));
    }

    /**
     * Number of constrained (non-refined or dependent) parameters
     * in the least-squares process. These may be due to symmetry or any
     * other constraint process (e.g. rigid-body refinement). See also
     * _atom_site.constraints and _atom_site.refinement_flags_*. A general
     * description of constraints may appear in _refine.special_details.
     * @return IntColumn
     */
    public IntColumn getLsNumberConstraints() {
        return new DelegatingIntColumn(parentBlock.getColumn("refine_ls_number_constraints"));
    }

    /**
     * Number of constrained (non-refined or dependent) parameters
     * in the least-squares process. These may be due to symmetry or any
     * other constraint process (e.g. rigid-body refinement). See also
     * _atom_site.constraints and _atom_site.refinement_flags_*. A general
     * description of constraints may appear in _refine.special_details.
     * @return IntColumn
     */
    public IntColumn getNumberConstraints() {
        return new DelegatingIntColumn(parentBlock.getColumn("refine_ls_number_constraints"));
    }

    /**
     * Number of parameters refined in the least-squares process. If
     * possible this number should include the restrained parameters.
     * The restrained parameters are distinct from the constrained
     * parameters (where one or more parameters are linearly dependent
     * on the refined value of another).  Least-squares restraints
     * often depend on geometry or energy considerations and this
     * makes their direct contribution to this number, and to the
     * goodness-of-fit calculation, difficult to assess.
     * @return IntColumn
     */
    public IntColumn getLsNumberParameters() {
        return new DelegatingIntColumn(parentBlock.getColumn("refine_ls_number_parameters"));
    }

    /**
     * Number of parameters refined in the least-squares process. If
     * possible this number should include the restrained parameters.
     * The restrained parameters are distinct from the constrained
     * parameters (where one or more parameters are linearly dependent
     * on the refined value of another).  Least-squares restraints
     * often depend on geometry or energy considerations and this
     * makes their direct contribution to this number, and to the
     * goodness-of-fit calculation, difficult to assess.
     * @return IntColumn
     */
    public IntColumn getNumberParameters() {
        return new DelegatingIntColumn(parentBlock.getColumn("refine_ls_number_parameters"));
    }

    /**
     * Number of unique reflections used in the least-squares refinement.
     * @return IntColumn
     */
    public IntColumn getLsNumberReflnsAll() {
        return new DelegatingIntColumn(parentBlock.getAliasedColumn("refine_ls_number_reflns_all", "refine_ls_number_reflns"));
    }

    /**
     * Number of unique reflections used in the least-squares refinement.
     * @return IntColumn
     */
    public IntColumn getNumberReflns() {
        return new DelegatingIntColumn(parentBlock.getAliasedColumn("refine_ls_number_reflns_all", "refine_ls_number_reflns"));
    }

    /**
     * The number of reflections that satisfy the resolution limits
     * established by _refine_ls.d_res_high and _refine_ls.d_res_low
     * and the observation limit established by
     * _reflns.observed_criterion.
     * @return IntColumn
     */
    public IntColumn getLsNumberReflnsObs() {
        return new DelegatingIntColumn(parentBlock.getAliasedColumn("refine_ls_number_reflns_obs", "refine_ls_number_reflns_gt"));
    }

    /**
     * The number of reflections that satisfy the resolution limits
     * established by _refine_ls.d_res_high and _refine_ls.d_res_low
     * and the observation limit established by
     * _reflns.observed_criterion.
     * @return IntColumn
     */
    public IntColumn getNumberReflnsGt() {
        return new DelegatingIntColumn(parentBlock.getAliasedColumn("refine_ls_number_reflns_obs", "refine_ls_number_reflns_gt"));
    }

    /**
     * Number of restrained parameters in the least-squares refinement. These
     * parameters do not directly dependent on another refined parameter. Often
     * restrained parameters involve geometry or energy dependencies. See also
     * _atom_site.constraints and _atom_site.refinement_flags_*. A description
     * of refinement constraints may appear in _refine.special_details.
     * @return IntColumn
     */
    public IntColumn getLsNumberRestraints() {
        return new DelegatingIntColumn(parentBlock.getColumn("refine_ls_number_restraints"));
    }

    /**
     * Number of restrained parameters in the least-squares refinement. These
     * parameters do not directly dependent on another refined parameter. Often
     * restrained parameters involve geometry or energy dependencies. See also
     * _atom_site.constraints and _atom_site.refinement_flags_*. A description
     * of refinement constraints may appear in _refine.special_details.
     * @return IntColumn
     */
    public IntColumn getNumberRestraints() {
        return new DelegatingIntColumn(parentBlock.getColumn("refine_ls_number_restraints"));
    }

    /**
     * Residual factor for all reflections satisfying the resolution limits
     * specified by _refine_ls.d_res_high and _refine_ls.d_res_low. This is
     * the conventional R factor. See also wR factor definitions.
     * 
     * sum | F(meas) - F(calc) |
     * R = ------------------------
     * sum | F(meas) |
     * 
     * F(meas) = the measured structure-factor amplitudes
     * F(calc) = the calculated structure-factor amplitudes
     * and the sum is taken over the specified reflections
     * @return FloatColumn
     */
    public FloatColumn getLsRFactorAll() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("refine_ls_R_factor_all", "refine_ls_r_factor_all"));
    }

    /**
     * Residual factor for all reflections satisfying the resolution limits
     * specified by _refine_ls.d_res_high and _refine_ls.d_res_low. This is
     * the conventional R factor. See also wR factor definitions.
     * 
     * sum | F(meas) - F(calc) |
     * R = ------------------------
     * sum | F(meas) |
     * 
     * F(meas) = the measured structure-factor amplitudes
     * F(calc) = the calculated structure-factor amplitudes
     * and the sum is taken over the specified reflections
     * @return FloatColumn
     */
    public FloatColumn getRFactorAll() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("refine_ls_R_factor_all", "refine_ls_r_factor_all"));
    }

    /**
     * Residual factor for the reflections judged significantly intense
     * (see _reflns.number_gt and _reflns.threshold_expression) and included
     * in the refinement. The reflections also satisfy the resolution limits
     * specified by _refine_ls.d_res_high and _refine_ls.d_res_low. This is
     * the conventional R factor.
     * 
     * sum | F(meas_gt) - F(calc) |
     * R = -----------------------------
     * sum | F(meas_gt) |
     * 
     * F(meas_gt) = the 'observed' structure-factor amplitudes
     * F(calc)    = the calculated structure-factor amplitudes
     * and the sum is taken over the specified reflections
     * @return FloatColumn
     */
    public FloatColumn getLsRFactorObs() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("refine_ls_R_factor_obs", "refine_ls_R_factor_gt", "refine_ls_r_factor_gt"));
    }

    /**
     * Residual factor for the reflections judged significantly intense
     * (see _reflns.number_gt and _reflns.threshold_expression) and included
     * in the refinement. The reflections also satisfy the resolution limits
     * specified by _refine_ls.d_res_high and _refine_ls.d_res_low. This is
     * the conventional R factor.
     * 
     * sum | F(meas_gt) - F(calc) |
     * R = -----------------------------
     * sum | F(meas_gt) |
     * 
     * F(meas_gt) = the 'observed' structure-factor amplitudes
     * F(calc)    = the calculated structure-factor amplitudes
     * and the sum is taken over the specified reflections
     * @return FloatColumn
     */
    public FloatColumn getLsRFactorGt() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("refine_ls_R_factor_obs", "refine_ls_R_factor_gt", "refine_ls_r_factor_gt"));
    }

    /**
     * Residual factor for the reflections judged significantly intense
     * (see _reflns.number_gt and _reflns.threshold_expression) and included
     * in the refinement. The reflections also satisfy the resolution limits
     * specified by _refine_ls.d_res_high and _refine_ls.d_res_low. This is
     * the conventional R factor.
     * 
     * sum | F(meas_gt) - F(calc) |
     * R = -----------------------------
     * sum | F(meas_gt) |
     * 
     * F(meas_gt) = the 'observed' structure-factor amplitudes
     * F(calc)    = the calculated structure-factor amplitudes
     * and the sum is taken over the specified reflections
     * @return FloatColumn
     */
    public FloatColumn getRFactorGt() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("refine_ls_R_factor_obs", "refine_ls_R_factor_gt", "refine_ls_r_factor_gt"));
    }

    /**
     * Residual factor R(Fsqd), calculated on the squared amplitudes of the
     * measured and calculated structure factors, for significantly intense
     * reflections (satisfying _reflns.threshold_expression) and included in
     * the refinement. The reflections also satisfy the resolution limits
     * specified by _refine_ls.d_res_high and _refine_ls.d_res_low.
     * 
     * sum | F(meas_gt)^2^ - F(calc)^2^ |
     * R(Fsqd) = ------------------------------------
     * sum F(meas_gt)^2^
     * 
     * F(meas_gt)^2^ = squares of the 'observed' structure-factor
     * F(calc)^2^    = squares of the calculated structure-factor
     * and the sum is taken over the specified reflections
     * @return FloatColumn
     */
    public FloatColumn getLsRFsqdFactorObs() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("refine_ls_R_Fsqd_factor_obs", "refine_ls_r_fsqd_factor"));
    }

    /**
     * Residual factor R(Fsqd), calculated on the squared amplitudes of the
     * measured and calculated structure factors, for significantly intense
     * reflections (satisfying _reflns.threshold_expression) and included in
     * the refinement. The reflections also satisfy the resolution limits
     * specified by _refine_ls.d_res_high and _refine_ls.d_res_low.
     * 
     * sum | F(meas_gt)^2^ - F(calc)^2^ |
     * R(Fsqd) = ------------------------------------
     * sum F(meas_gt)^2^
     * 
     * F(meas_gt)^2^ = squares of the 'observed' structure-factor
     * F(calc)^2^    = squares of the calculated structure-factor
     * and the sum is taken over the specified reflections
     * @return FloatColumn
     */
    public FloatColumn getRFsqdFactor() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("refine_ls_R_Fsqd_factor_obs", "refine_ls_r_fsqd_factor"));
    }

    /**
     * Residual factor R(I) for significantly intense reflections (satisfying
     * _reflns.threshold_expression) and included in the refinement. This is
     * most often calculated in Rietveld refinements of powder data, where it
     * is referred to as R~B~ or R~Bragg~.
     * 
     * sum | I(meas_gt) - I(calc) |
     * R(I) =  -----------------------------
     * sum | I(meas_gt) |
     * 
     * I(meas_gt) = the net 'observed' intensities
     * I(calc)    = the net calculated intensities
     * and the sum is taken over the specified reflections
     * @return FloatColumn
     */
    public FloatColumn getLsRIFactorObs() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("refine_ls_R_I_factor_obs", "refine_ls_r_i_factor"));
    }

    /**
     * Residual factor R(I) for significantly intense reflections (satisfying
     * _reflns.threshold_expression) and included in the refinement. This is
     * most often calculated in Rietveld refinements of powder data, where it
     * is referred to as R~B~ or R~Bragg~.
     * 
     * sum | I(meas_gt) - I(calc) |
     * R(I) =  -----------------------------
     * sum | I(meas_gt) |
     * 
     * I(meas_gt) = the net 'observed' intensities
     * I(calc)    = the net calculated intensities
     * and the sum is taken over the specified reflections
     * @return FloatColumn
     */
    public FloatColumn getRIFactor() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("refine_ls_R_I_factor_obs", "refine_ls_r_i_factor"));
    }

    /**
     * Least-squares goodness-of-fit parameter S' for all reflections after
     * the final cycle of least squares. This parameter explicitly includes
     * the restraints applied in the least-squares process. See also
     * _refine_ls.goodness_of_fit_all definition.
     * 
     * {sum { w [ Y(meas) - Y(calc) ]^2^ }                  }^1/2^
     * {         + sum~r~ { w~r~ [ P(calc) - P(targ) ]^2^ } }
     * S' = { -------------------------------------------------- }
     * {            N~ref~ + N~restr~ - N~param~            }
     * 
     * Y(meas)  = the measured coefficients
     * (see _refine_ls.structure_factor_coef)
     * Y(calc)  = the calculated coefficients
     * (see _refine_ls.structure_factor_coef)
     * w        = the least-squares reflection weight
     * [1/square of standard uncertainty (e.s.d.)]
     * P(calc)  = the calculated restraint values
     * P(targ)  = the target restraint values
     * w~r~     = the restraint weight
     * 
     * N~ref~   = the number of reflections used in the refinement
     * (see _refine_ls.number_reflns)
     * N~restr~ = the number of restraints
     * (see _refine_ls.number_restraints)
     * N~param~ = the number of refined parameters
     * (see _refine_ls.number_parameters)
     * 
     * sum     is taken over the specified reflections
     * sum~r~  is taken over the restraints
     * @return FloatColumn
     */
    public FloatColumn getLsRestrainedSAll() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("refine_ls_restrained_S_all", "refine_ls_restrained_s_all"));
    }

    /**
     * Least-squares goodness-of-fit parameter S' for all reflections after
     * the final cycle of least squares. This parameter explicitly includes
     * the restraints applied in the least-squares process. See also
     * _refine_ls.goodness_of_fit_all definition.
     * 
     * {sum { w [ Y(meas) - Y(calc) ]^2^ }                  }^1/2^
     * {         + sum~r~ { w~r~ [ P(calc) - P(targ) ]^2^ } }
     * S' = { -------------------------------------------------- }
     * {            N~ref~ + N~restr~ - N~param~            }
     * 
     * Y(meas)  = the measured coefficients
     * (see _refine_ls.structure_factor_coef)
     * Y(calc)  = the calculated coefficients
     * (see _refine_ls.structure_factor_coef)
     * w        = the least-squares reflection weight
     * [1/square of standard uncertainty (e.s.d.)]
     * P(calc)  = the calculated restraint values
     * P(targ)  = the target restraint values
     * w~r~     = the restraint weight
     * 
     * N~ref~   = the number of reflections used in the refinement
     * (see _refine_ls.number_reflns)
     * N~restr~ = the number of restraints
     * (see _refine_ls.number_restraints)
     * N~param~ = the number of refined parameters
     * (see _refine_ls.number_parameters)
     * 
     * sum     is taken over the specified reflections
     * sum~r~  is taken over the restraints
     * @return FloatColumn
     */
    public FloatColumn getRestrainedSAll() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("refine_ls_restrained_S_all", "refine_ls_restrained_s_all"));
    }

    /**
     * Least-squares goodness-of-fit parameter S' for significantly intense
     * reflections (satisfying _reflns.threshold_expression) after the final
     * cycle of least squares. This parameter explicitly includes the restraints
     * applied. The expression for S' is given in _refine_ls.restrained_S_all.
     * 
     * {sum { w [ Y(meas_gt) - Y(calc) ]^2^ }               }^1/2^
     * {         + sum~r~ { w~r~ [ P(calc) - P(targ) ]^2^ } }
     * S' = { -------------------------------------------------- }
     * {            N~ref~ + N~restr~ - N~param~            }
     * 
     * Y(meas_gt) = the 'observed' coefficients
     * (see _refine_ls.structure_factor_coef)
     * Y(calc)    = the calculated coefficients
     * (see _refine_ls.structure_factor_coef)
     * w        = the least-squares reflection weight
     * [1/square of standard uncertainty (e.s.d.)]
     * P(calc)  = the calculated restraint values
     * P(targ)  = the target restraint values
     * w~r~     = the restraint weight
     * 
     * N~ref~   = the number of reflections used in the refinement
     * (see _refine_ls.number_reflns)
     * N~restr~ = the number of restraints
     * (see _refine_ls.number_restraints)
     * N~param~ = the number of refined parameters
     * (see _refine_ls.number_parameters)
     * 
     * sum     is taken over the specified reflections
     * sum~r~  is taken over the restraints
     * @return FloatColumn
     */
    public FloatColumn getLsRestrainedSObs() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("refine_ls_restrained_S_obs", "refine_ls_restrained_s_gt"));
    }

    /**
     * Least-squares goodness-of-fit parameter S' for significantly intense
     * reflections (satisfying _reflns.threshold_expression) after the final
     * cycle of least squares. This parameter explicitly includes the restraints
     * applied. The expression for S' is given in _refine_ls.restrained_S_all.
     * 
     * {sum { w [ Y(meas_gt) - Y(calc) ]^2^ }               }^1/2^
     * {         + sum~r~ { w~r~ [ P(calc) - P(targ) ]^2^ } }
     * S' = { -------------------------------------------------- }
     * {            N~ref~ + N~restr~ - N~param~            }
     * 
     * Y(meas_gt) = the 'observed' coefficients
     * (see _refine_ls.structure_factor_coef)
     * Y(calc)    = the calculated coefficients
     * (see _refine_ls.structure_factor_coef)
     * w        = the least-squares reflection weight
     * [1/square of standard uncertainty (e.s.d.)]
     * P(calc)  = the calculated restraint values
     * P(targ)  = the target restraint values
     * w~r~     = the restraint weight
     * 
     * N~ref~   = the number of reflections used in the refinement
     * (see _refine_ls.number_reflns)
     * N~restr~ = the number of restraints
     * (see _refine_ls.number_restraints)
     * N~param~ = the number of refined parameters
     * (see _refine_ls.number_parameters)
     * 
     * sum     is taken over the specified reflections
     * sum~r~  is taken over the restraints
     * @return FloatColumn
     */
    public FloatColumn getRestrainedSGt() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("refine_ls_restrained_S_obs", "refine_ls_restrained_s_gt"));
    }

    /**
     * The largest ratio of the final least-squares parameter shift
     * to the final standard uncertainty (s.u., formerly described
     * as estimated standard deviation, e.s.d.).
     * @return FloatColumn
     */
    public FloatColumn getLsShiftOverEsdMax() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("refine_ls_shift_over_esd_max", "refine_ls_shift_over_su_max"));
    }

    /**
     * The largest ratio of the final least-squares parameter shift
     * to the final standard uncertainty (s.u., formerly described
     * as estimated standard deviation, e.s.d.).
     * @return FloatColumn
     */
    public FloatColumn getLsShiftOverSuMax() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("refine_ls_shift_over_esd_max", "refine_ls_shift_over_su_max"));
    }

    /**
     * The largest ratio of the final least-squares parameter shift
     * to the final standard uncertainty (s.u., formerly described
     * as estimated standard deviation, e.s.d.).
     * @return FloatColumn
     */
    public FloatColumn getShiftOverSuMax() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("refine_ls_shift_over_esd_max", "refine_ls_shift_over_su_max"));
    }

    /**
     * Upper limit for the largest ratio of the final l-s parameter
     * shift divided by the final standard uncertainty. This item is
     * used when the largest value of the shift divided by the final
     * standard uncertainty is too small to measure.
     * @return FloatColumn
     */
    public FloatColumn getLsShiftOverSuMaxLt() {
        return new DelegatingFloatColumn(parentBlock.getColumn("refine_ls_shift_over_su_max_lt"));
    }

    /**
     * Upper limit for the largest ratio of the final l-s parameter
     * shift divided by the final standard uncertainty. This item is
     * used when the largest value of the shift divided by the final
     * standard uncertainty is too small to measure.
     * @return FloatColumn
     */
    public FloatColumn getShiftOverSuMaxLt() {
        return new DelegatingFloatColumn(parentBlock.getColumn("refine_ls_shift_over_su_max_lt"));
    }

    /**
     * The average ratio of the final least-squares parameter shift
     * to the final standard uncertainty (s.u., formerly described
     * as estimated standard deviation, e.s.d.).
     * @return FloatColumn
     */
    public FloatColumn getLsShiftOverEsdMean() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("refine_ls_shift_over_esd_mean", "refine_ls_shift_over_su_mean"));
    }

    /**
     * The average ratio of the final least-squares parameter shift
     * to the final standard uncertainty (s.u., formerly described
     * as estimated standard deviation, e.s.d.).
     * @return FloatColumn
     */
    public FloatColumn getLsShiftOverSuMean() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("refine_ls_shift_over_esd_mean", "refine_ls_shift_over_su_mean"));
    }

    /**
     * The average ratio of the final least-squares parameter shift
     * to the final standard uncertainty (s.u., formerly described
     * as estimated standard deviation, e.s.d.).
     * @return FloatColumn
     */
    public FloatColumn getShiftOverSuMean() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("refine_ls_shift_over_esd_mean", "refine_ls_shift_over_su_mean"));
    }

    /**
     * Upper limit for the average ratio of the final l-s parameter
     * shift divided by the final standard uncertainty. This item is
     * used when the average value of the shift divided by the final
     * standard uncertainty is too small to measure.
     * @return FloatColumn
     */
    public FloatColumn getLsShiftOverSuMeanLt() {
        return new DelegatingFloatColumn(parentBlock.getColumn("refine_ls_shift_over_su_mean_lt"));
    }

    /**
     * Upper limit for the average ratio of the final l-s parameter
     * shift divided by the final standard uncertainty. This item is
     * used when the average value of the shift divided by the final
     * standard uncertainty is too small to measure.
     * @return FloatColumn
     */
    public FloatColumn getShiftOverSuMeanLt() {
        return new DelegatingFloatColumn(parentBlock.getColumn("refine_ls_shift_over_su_mean_lt"));
    }

    /**
     * Structure-factor coefficient used in the least-squares process.
     * @return StrColumn
     */
    public StrColumn getLsStructureFactorCoef() {
        return new DelegatingStrColumn(parentBlock.getColumn("refine_ls_structure_factor_coef"));
    }

    /**
     * Structure-factor coefficient used in the least-squares process.
     * @return StrColumn
     */
    public StrColumn getStructureFactorCoef() {
        return new DelegatingStrColumn(parentBlock.getColumn("refine_ls_structure_factor_coef"));
    }

    /**
     * Description of special aspects of the weighting scheme used in the
     * least-squares refinement. Used to describe the weighting when the
     * value of _refine_ls.weighting_scheme is specified as 'calc'.
     * @return StrColumn
     */
    public StrColumn getLsWeightingDetails() {
        return new DelegatingStrColumn(parentBlock.getColumn("refine_ls_weighting_details"));
    }

    /**
     * Description of special aspects of the weighting scheme used in the
     * least-squares refinement. Used to describe the weighting when the
     * value of _refine_ls.weighting_scheme is specified as 'calc'.
     * @return StrColumn
     */
    public StrColumn getWeightingDetails() {
        return new DelegatingStrColumn(parentBlock.getColumn("refine_ls_weighting_details"));
    }

    /**
     * General description of the weighting scheme used in the least-squares.
     * An enumerated code should be contained in this description.
     * @return StrColumn
     */
    public StrColumn getLsWeightingScheme() {
        return new DelegatingStrColumn(parentBlock.getColumn("refine_ls_weighting_scheme"));
    }

    /**
     * General description of the weighting scheme used in the least-squares.
     * An enumerated code should be contained in this description.
     * @return StrColumn
     */
    public StrColumn getWeightingScheme() {
        return new DelegatingStrColumn(parentBlock.getColumn("refine_ls_weighting_scheme"));
    }

    /**
     * Weighted residual factors for all reflections satisfying the resolution
     * limits specified by _refine_ls.d_res_high and _refine_ls.d_res_low.
     * See also the _refine_ls.R_factor_all definition.
     * 
     * ( sum w [ Y(meas) - Y(calc) ]^2^ )^1/2^
     * wR = ( ------------------------------ )
     * (         sum w Y(meas)^2^       )
     * 
     * Y(meas) = the measured   amplitude _refine_ls.structure_factor_coef
     * Y(calc) = the calculated amplitude _refine_ls.structure_factor_coef
     * w       = the least-squares weight
     * and the sum is taken over the specified reflections
     * @return FloatColumn
     */
    public FloatColumn getLsWRFactorAll() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("refine_ls_wR_factor_all", "refine_ls_wr_factor_all"));
    }

    /**
     * Weighted residual factors for all reflections satisfying the resolution
     * limits specified by _refine_ls.d_res_high and _refine_ls.d_res_low.
     * See also the _refine_ls.R_factor_all definition.
     * 
     * ( sum w [ Y(meas) - Y(calc) ]^2^ )^1/2^
     * wR = ( ------------------------------ )
     * (         sum w Y(meas)^2^       )
     * 
     * Y(meas) = the measured   amplitude _refine_ls.structure_factor_coef
     * Y(calc) = the calculated amplitude _refine_ls.structure_factor_coef
     * w       = the least-squares weight
     * and the sum is taken over the specified reflections
     * @return FloatColumn
     */
    public FloatColumn getWrFactorAll() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("refine_ls_wR_factor_all", "refine_ls_wr_factor_all"));
    }

    /**
     * Weighted residual factors for significantly intense reflections
     * (satisfying _reflns.threshold_expression) included in the refinement.
     * The reflections must also satisfy the resolution limits established by
     * _refine_ls.d_res_high and _refine_ls.d_res_low.
     * 
     * ( sum w [ Y(meas_gt) - Y(calc) ]^2^  )^1/2^
     * wR = ( ---------------------------------- )
     * (         sum w Y(meas_gt)^2^        )
     * 
     * Y(meas_gt) = the 'observed' amplitude _refine_ls.structure_factor_coef
     * Y(calc)    = the calculated amplitude _refine_ls.structure_factor_coef
     * w        = the least-squares weight
     * and the sum is taken over the specified reflections
     * @return FloatColumn
     */
    public FloatColumn getLsWRFactorObs() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("refine_ls_wR_factor_obs", "refine_ls_wr_factor_gt"));
    }

    /**
     * Weighted residual factors for significantly intense reflections
     * (satisfying _reflns.threshold_expression) included in the refinement.
     * The reflections must also satisfy the resolution limits established by
     * _refine_ls.d_res_high and _refine_ls.d_res_low.
     * 
     * ( sum w [ Y(meas_gt) - Y(calc) ]^2^  )^1/2^
     * wR = ( ---------------------------------- )
     * (         sum w Y(meas_gt)^2^        )
     * 
     * Y(meas_gt) = the 'observed' amplitude _refine_ls.structure_factor_coef
     * Y(calc)    = the calculated amplitude _refine_ls.structure_factor_coef
     * w        = the least-squares weight
     * and the sum is taken over the specified reflections
     * @return FloatColumn
     */
    public FloatColumn getWrFactorGt() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("refine_ls_wR_factor_obs", "refine_ls_wr_factor_gt"));
    }

}