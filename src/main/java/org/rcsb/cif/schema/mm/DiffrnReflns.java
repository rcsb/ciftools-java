package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the DIFFRN_REFLNS category record details about
 * the set of intensities measured in the diffraction experiment.
 * 
 * The DIFFRN_REFLN data items refer to individual intensity
 * measurements and must be included in looped lists.
 * 
 * The DIFFRN_REFLNS data items specify the parameters that apply
 * to all intensity measurements in a diffraction data set.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class DiffrnReflns extends DelegatingCategory {
    public DiffrnReflns(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "av_R_equivalents":
                return getAvREquivalents();
            case "av_sigmaI_over_netI":
                return getAvSigmaIOverNetI();
            case "diffrn_id":
                return getDiffrnId();
            case "limit_h_max":
                return getLimitHMax();
            case "limit_h_min":
                return getLimitHMin();
            case "limit_k_max":
                return getLimitKMax();
            case "limit_k_min":
                return getLimitKMin();
            case "limit_l_max":
                return getLimitLMax();
            case "limit_l_min":
                return getLimitLMin();
            case "number":
                return getNumber();
            case "reduction_process":
                return getReductionProcess();
            case "theta_max":
                return getThetaMax();
            case "theta_min":
                return getThetaMin();
            case "transf_matrix[1][1]":
                return getTransfMatrix11();
            case "transf_matrix[1][2]":
                return getTransfMatrix12();
            case "transf_matrix[1][3]":
                return getTransfMatrix13();
            case "transf_matrix[2][1]":
                return getTransfMatrix21();
            case "transf_matrix[2][2]":
                return getTransfMatrix22();
            case "transf_matrix[2][3]":
                return getTransfMatrix23();
            case "transf_matrix[3][1]":
                return getTransfMatrix31();
            case "transf_matrix[3][2]":
                return getTransfMatrix32();
            case "transf_matrix[3][3]":
                return getTransfMatrix33();
            case "av_unetI/netI":
                return getAvUnetI_netI();
            case "pdbx_d_res_low":
                return getPdbxDResLow();
            case "pdbx_d_res_high":
                return getPdbxDResHigh();
            case "pdbx_percent_possible_obs":
                return getPdbxPercentPossibleObs();
            case "pdbx_Rmerge_I_obs":
                return getPdbxRmergeIObs();
            case "pdbx_Rsym_value":
                return getPdbxRsymValue();
            case "pdbx_chi_squared":
                return getPdbxChiSquared();
            case "pdbx_redundancy":
                return getPdbxRedundancy();
            case "pdbx_rejects":
                return getPdbxRejects();
            case "pdbx_observed_criterion":
                return getPdbxObservedCriterion();
            case "pdbx_number_obs":
                return getPdbxNumberObs();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The residual [sum|avdel(I)| / sum|av(I)|] for symmetry-equivalent
     * reflections used to calculate the average intensity av(I). The
     * avdel(I) term is the average absolute difference between av(I)
     * and the individual symmetry-equivalent intensities.
     * @return FloatColumn
     */
    public FloatColumn getAvREquivalents() {
        return delegate.getColumn("av_R_equivalents", DelegatingFloatColumn::new);
    }

    /**
     * Measure [sum|sigma(I)|/sum|net(I)|] for all measured reflections.
     * @return FloatColumn
     */
    public FloatColumn getAvSigmaIOverNetI() {
        return delegate.getColumn("av_sigmaI_over_netI", DelegatingFloatColumn::new);
    }

    /**
     * This data item is a pointer to _diffrn.id in the DIFFRN
     * category.
     * @return StrColumn
     */
    public StrColumn getDiffrnId() {
        return delegate.getColumn("diffrn_id", DelegatingStrColumn::new);
    }

    /**
     * The maximum value of the Miller index h for the
     * reflection data specified by _diffrn_refln.index_h.
     * @return IntColumn
     */
    public IntColumn getLimitHMax() {
        return delegate.getColumn("limit_h_max", DelegatingIntColumn::new);
    }

    /**
     * The minimum value of the Miller index h for the
     * reflection data specified by _diffrn_refln.index_h.
     * @return IntColumn
     */
    public IntColumn getLimitHMin() {
        return delegate.getColumn("limit_h_min", DelegatingIntColumn::new);
    }

    /**
     * The maximum value of the Miller index k for the
     * reflection data specified by _diffrn_refln.index_k.
     * @return IntColumn
     */
    public IntColumn getLimitKMax() {
        return delegate.getColumn("limit_k_max", DelegatingIntColumn::new);
    }

    /**
     * The minimum value of the Miller index k for the
     * reflection data specified by _diffrn_refln.index_k.
     * @return IntColumn
     */
    public IntColumn getLimitKMin() {
        return delegate.getColumn("limit_k_min", DelegatingIntColumn::new);
    }

    /**
     * The maximum value of the Miller index l for the
     * reflection data specified by _diffrn_refln.index_l.
     * @return IntColumn
     */
    public IntColumn getLimitLMax() {
        return delegate.getColumn("limit_l_max", DelegatingIntColumn::new);
    }

    /**
     * The minimum value of the Miller index l for the
     * reflection data specified by _diffrn_refln.index_l.
     * @return IntColumn
     */
    public IntColumn getLimitLMin() {
        return delegate.getColumn("limit_l_min", DelegatingIntColumn::new);
    }

    /**
     * The total number of measured intensities, excluding reflections
     * that are classified as systematically absent.
     * @return IntColumn
     */
    public IntColumn getNumber() {
        return delegate.getColumn("number", DelegatingIntColumn::new);
    }

    /**
     * A description of the process used to reduce the intensity data
     * into structure-factor magnitudes.
     * @return StrColumn
     */
    public StrColumn getReductionProcess() {
        return delegate.getColumn("reduction_process", DelegatingStrColumn::new);
    }

    /**
     * Maximum theta angle in degrees for the measured diffraction
     * intensities.
     * @return FloatColumn
     */
    public FloatColumn getThetaMax() {
        return delegate.getColumn("theta_max", DelegatingFloatColumn::new);
    }

    /**
     * Minimum theta angle in degrees for the measured diffraction
     * intensities.
     * @return FloatColumn
     */
    public FloatColumn getThetaMin() {
        return delegate.getColumn("theta_min", DelegatingFloatColumn::new);
    }

    /**
     * The elements of the 3x3 matrix used to transform Miller
     * indices in the DIFFRN_REFLN category into the Miller indices in
     * the REFLN category.
     * @return FloatColumn
     */
    public FloatColumn getTransfMatrix11() {
        return delegate.getColumn("transf_matrix[1][1]", DelegatingFloatColumn::new);
    }

    /**
     * The elements of the 3x3 matrix used to transform Miller
     * indices in the DIFFRN_REFLN category into the Miller indices in
     * the REFLN category.
     * @return FloatColumn
     */
    public FloatColumn getTransfMatrix12() {
        return delegate.getColumn("transf_matrix[1][2]", DelegatingFloatColumn::new);
    }

    /**
     * The elements of the 3x3 matrix used to transform Miller
     * indices in the DIFFRN_REFLN category into the Miller indices in
     * the REFLN category.
     * @return FloatColumn
     */
    public FloatColumn getTransfMatrix13() {
        return delegate.getColumn("transf_matrix[1][3]", DelegatingFloatColumn::new);
    }

    /**
     * The elements of the 3x3 matrix used to transform Miller
     * indices in the DIFFRN_REFLN category into the Miller indices in
     * the REFLN category.
     * @return FloatColumn
     */
    public FloatColumn getTransfMatrix21() {
        return delegate.getColumn("transf_matrix[2][1]", DelegatingFloatColumn::new);
    }

    /**
     * The elements of the 3x3 matrix used to transform Miller
     * indices in the DIFFRN_REFLN category into the Miller indices in
     * the REFLN category.
     * @return FloatColumn
     */
    public FloatColumn getTransfMatrix22() {
        return delegate.getColumn("transf_matrix[2][2]", DelegatingFloatColumn::new);
    }

    /**
     * The elements of the 3x3 matrix used to transform Miller
     * indices in the DIFFRN_REFLN category into the Miller indices in
     * the REFLN category.
     * @return FloatColumn
     */
    public FloatColumn getTransfMatrix23() {
        return delegate.getColumn("transf_matrix[2][3]", DelegatingFloatColumn::new);
    }

    /**
     * The elements of the 3x3 matrix used to transform Miller
     * indices in the DIFFRN_REFLN category into the Miller indices in
     * the REFLN category.
     * @return FloatColumn
     */
    public FloatColumn getTransfMatrix31() {
        return delegate.getColumn("transf_matrix[3][1]", DelegatingFloatColumn::new);
    }

    /**
     * The elements of the 3x3 matrix used to transform Miller
     * indices in the DIFFRN_REFLN category into the Miller indices in
     * the REFLN category.
     * @return FloatColumn
     */
    public FloatColumn getTransfMatrix32() {
        return delegate.getColumn("transf_matrix[3][2]", DelegatingFloatColumn::new);
    }

    /**
     * The elements of the 3x3 matrix used to transform Miller
     * indices in the DIFFRN_REFLN category into the Miller indices in
     * the REFLN category.
     * @return FloatColumn
     */
    public FloatColumn getTransfMatrix33() {
        return delegate.getColumn("transf_matrix[3][3]", DelegatingFloatColumn::new);
    }

    /**
     * Measure [sum u(net I)|/sum|net I|] for all measured reflections.
     * @return FloatColumn
     */
    public FloatColumn getAvUnetI_netI() {
        return delegate.getColumn("av_unetI/netI", DelegatingFloatColumn::new);
    }

    /**
     * The lowest resolution for the interplanar spacings in the
     * reflection data set. This is the largest d value.
     * @return FloatColumn
     */
    public FloatColumn getPdbxDResLow() {
        return delegate.getColumn("pdbx_d_res_low", DelegatingFloatColumn::new);
    }

    /**
     * The highest resolution for the interplanar spacings in the
     * reflection data set. This is the smallest d value.
     * @return FloatColumn
     */
    public FloatColumn getPdbxDResHigh() {
        return delegate.getColumn("pdbx_d_res_high", DelegatingFloatColumn::new);
    }

    /**
     * The percentage of geometrically possible reflections represented
     * by reflections that satisfy the resolution limits established
     * by _diffrn_reflns.d_resolution_high and _diffrn_reflns.d_resolution_low and
     * the observation limit established by   _diffrn_reflns.observed_criterion.
     * @return FloatColumn
     */
    public FloatColumn getPdbxPercentPossibleObs() {
        return delegate.getColumn("pdbx_percent_possible_obs", DelegatingFloatColumn::new);
    }

    /**
     * The R factor for merging the reflections that satisfy the
     * resolution limits established by _diffrn_reflns.d_resolution_high
     * and _diffrn_reflns.d_resolution_low and the observation limit
     * established by _diffrn_reflns.observed_criterion.
     * 
     * 
     * Rmerge(I) = [sum~i~(sum~j~|I~j~ - |)] / [sum~i~(sum~j~)]
     * 
     * 
     * I~j~ = the intensity of the jth observation of reflection i
     * = the mean of the amplitudes of all observations of
     * reflection i
     * 
     * sum~i~ is taken over all reflections
     * sum~j~ is taken over all observations of each reflection
     * @return FloatColumn
     */
    public FloatColumn getPdbxRmergeIObs() {
        return delegate.getColumn("pdbx_Rmerge_I_obs", DelegatingFloatColumn::new);
    }

    /**
     * The R factor for averaging the symmetry related reflections to a
     * unique data set.
     * @return FloatColumn
     */
    public FloatColumn getPdbxRsymValue() {
        return delegate.getColumn("pdbx_Rsym_value", DelegatingFloatColumn::new);
    }

    /**
     * Overall  Chi-squared statistic for the data set.
     * @return FloatColumn
     */
    public FloatColumn getPdbxChiSquared() {
        return delegate.getColumn("pdbx_chi_squared", DelegatingFloatColumn::new);
    }

    /**
     * The overall redundancy for the data set.
     * @return FloatColumn
     */
    public FloatColumn getPdbxRedundancy() {
        return delegate.getColumn("pdbx_redundancy", DelegatingFloatColumn::new);
    }

    /**
     * The number of rejected reflections in the data set.
     * The reflections may be rejected by setting the
     * observation criterion, _diffrn_reflns.observed_criterion.
     * @return IntColumn
     */
    public IntColumn getPdbxRejects() {
        return delegate.getColumn("pdbx_rejects", DelegatingIntColumn::new);
    }

    /**
     * The criterion used to classify a reflection as 'observed'. This
     * criterion is usually expressed in terms of a sigma(I) or
     * sigma(F) threshold.
     * @return FloatColumn
     */
    public FloatColumn getPdbxObservedCriterion() {
        return delegate.getColumn("pdbx_observed_criterion", DelegatingFloatColumn::new);
    }

    /**
     * The  number of reflections satisfying the observation criterion
     * as in _diffrn_reflns.pdbx_observed_criterion
     * @return IntColumn
     */
    public IntColumn getPdbxNumberObs() {
        return delegate.getColumn("pdbx_number_obs", DelegatingIntColumn::new);
    }

}