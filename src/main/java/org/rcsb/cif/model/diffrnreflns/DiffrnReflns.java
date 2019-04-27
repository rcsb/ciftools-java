package org.rcsb.cif.model.diffrnreflns;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class DiffrnReflns extends BaseCategory {
    public DiffrnReflns(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public DiffrnReflns(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public DiffrnReflns(String name) {
        super(name);
    }

    /**
     * The residual [sum|avdel(I)| / sum|av(I)|] for symmetry-equivalent
     * reflections used to calculate the average intensity av(I). The
     * avdel(I) term is the average absolute difference between av(I)
     * and the individual symmetry-equivalent intensities.
     * @return AvREquivalents
     */
    public AvREquivalents getAvREquivalents() {
        return (AvREquivalents) (isText ? textFields.computeIfAbsent("av_R_equivalents",
                AvREquivalents::new) : getBinaryColumn("av_R_equivalents"));
    }

    /**
     * Measure [sum|sigma(I)|/sum|net(I)|] for all measured reflections.
     * @return AvSigmaIOverNetI
     */
    public AvSigmaIOverNetI getAvSigmaIOverNetI() {
        return (AvSigmaIOverNetI) (isText ? textFields.computeIfAbsent("av_sigmaI_over_netI",
                AvSigmaIOverNetI::new) : getBinaryColumn("av_sigmaI_over_netI"));
    }

    /**
     * This data item is a pointer to _diffrn.id in the DIFFRN
     * category.
     * @return DiffrnId
     */
    public DiffrnId getDiffrnId() {
        return (DiffrnId) (isText ? textFields.computeIfAbsent("diffrn_id",
                DiffrnId::new) : getBinaryColumn("diffrn_id"));
    }

    /**
     * The maximum value of the Miller index h for the
     * reflection data specified by _diffrn_refln.index_h.
     * @return LimitHMax
     */
    public LimitHMax getLimitHMax() {
        return (LimitHMax) (isText ? textFields.computeIfAbsent("limit_h_max",
                LimitHMax::new) : getBinaryColumn("limit_h_max"));
    }

    /**
     * The minimum value of the Miller index h for the
     * reflection data specified by _diffrn_refln.index_h.
     * @return LimitHMin
     */
    public LimitHMin getLimitHMin() {
        return (LimitHMin) (isText ? textFields.computeIfAbsent("limit_h_min",
                LimitHMin::new) : getBinaryColumn("limit_h_min"));
    }

    /**
     * The maximum value of the Miller index k for the
     * reflection data specified by _diffrn_refln.index_k.
     * @return LimitKMax
     */
    public LimitKMax getLimitKMax() {
        return (LimitKMax) (isText ? textFields.computeIfAbsent("limit_k_max",
                LimitKMax::new) : getBinaryColumn("limit_k_max"));
    }

    /**
     * The minimum value of the Miller index k for the
     * reflection data specified by _diffrn_refln.index_k.
     * @return LimitKMin
     */
    public LimitKMin getLimitKMin() {
        return (LimitKMin) (isText ? textFields.computeIfAbsent("limit_k_min",
                LimitKMin::new) : getBinaryColumn("limit_k_min"));
    }

    /**
     * The maximum value of the Miller index l for the
     * reflection data specified by _diffrn_refln.index_l.
     * @return LimitLMax
     */
    public LimitLMax getLimitLMax() {
        return (LimitLMax) (isText ? textFields.computeIfAbsent("limit_l_max",
                LimitLMax::new) : getBinaryColumn("limit_l_max"));
    }

    /**
     * The minimum value of the Miller index l for the
     * reflection data specified by _diffrn_refln.index_l.
     * @return LimitLMin
     */
    public LimitLMin getLimitLMin() {
        return (LimitLMin) (isText ? textFields.computeIfAbsent("limit_l_min",
                LimitLMin::new) : getBinaryColumn("limit_l_min"));
    }

    /**
     * The total number of measured intensities, excluding reflections
     * that are classified as systematically absent.
     * @return Number
     */
    public Number getNumber() {
        return (Number) (isText ? textFields.computeIfAbsent("number",
                Number::new) : getBinaryColumn("number"));
    }

    /**
     * A description of the process used to reduce the intensity data
     * into structure-factor magnitudes.
     * @return ReductionProcess
     */
    public ReductionProcess getReductionProcess() {
        return (ReductionProcess) (isText ? textFields.computeIfAbsent("reduction_process",
                ReductionProcess::new) : getBinaryColumn("reduction_process"));
    }

    /**
     * Maximum theta angle in degrees for the measured diffraction
     * intensities.
     * @return ThetaMax
     */
    public ThetaMax getThetaMax() {
        return (ThetaMax) (isText ? textFields.computeIfAbsent("theta_max",
                ThetaMax::new) : getBinaryColumn("theta_max"));
    }

    /**
     * Minimum theta angle in degrees for the measured diffraction
     * intensities.
     * @return ThetaMin
     */
    public ThetaMin getThetaMin() {
        return (ThetaMin) (isText ? textFields.computeIfAbsent("theta_min",
                ThetaMin::new) : getBinaryColumn("theta_min"));
    }

    /**
     * The elements of the 3x3 matrix used to transform Miller
     * indices in the DIFFRN_REFLN category into the Miller indices in
     * the REFLN category.
     * @return TransfMatrix11
     */
    public TransfMatrix11 getTransfMatrix11() {
        return (TransfMatrix11) (isText ? textFields.computeIfAbsent("transf_matrix[1][1]",
                TransfMatrix11::new) : getBinaryColumn("transf_matrix[1][1]"));
    }

    /**
     * The elements of the 3x3 matrix used to transform Miller
     * indices in the DIFFRN_REFLN category into the Miller indices in
     * the REFLN category.
     * @return TransfMatrix12
     */
    public TransfMatrix12 getTransfMatrix12() {
        return (TransfMatrix12) (isText ? textFields.computeIfAbsent("transf_matrix[1][2]",
                TransfMatrix12::new) : getBinaryColumn("transf_matrix[1][2]"));
    }

    /**
     * The elements of the 3x3 matrix used to transform Miller
     * indices in the DIFFRN_REFLN category into the Miller indices in
     * the REFLN category.
     * @return TransfMatrix13
     */
    public TransfMatrix13 getTransfMatrix13() {
        return (TransfMatrix13) (isText ? textFields.computeIfAbsent("transf_matrix[1][3]",
                TransfMatrix13::new) : getBinaryColumn("transf_matrix[1][3]"));
    }

    /**
     * The elements of the 3x3 matrix used to transform Miller
     * indices in the DIFFRN_REFLN category into the Miller indices in
     * the REFLN category.
     * @return TransfMatrix21
     */
    public TransfMatrix21 getTransfMatrix21() {
        return (TransfMatrix21) (isText ? textFields.computeIfAbsent("transf_matrix[2][1]",
                TransfMatrix21::new) : getBinaryColumn("transf_matrix[2][1]"));
    }

    /**
     * The elements of the 3x3 matrix used to transform Miller
     * indices in the DIFFRN_REFLN category into the Miller indices in
     * the REFLN category.
     * @return TransfMatrix22
     */
    public TransfMatrix22 getTransfMatrix22() {
        return (TransfMatrix22) (isText ? textFields.computeIfAbsent("transf_matrix[2][2]",
                TransfMatrix22::new) : getBinaryColumn("transf_matrix[2][2]"));
    }

    /**
     * The elements of the 3x3 matrix used to transform Miller
     * indices in the DIFFRN_REFLN category into the Miller indices in
     * the REFLN category.
     * @return TransfMatrix23
     */
    public TransfMatrix23 getTransfMatrix23() {
        return (TransfMatrix23) (isText ? textFields.computeIfAbsent("transf_matrix[2][3]",
                TransfMatrix23::new) : getBinaryColumn("transf_matrix[2][3]"));
    }

    /**
     * The elements of the 3x3 matrix used to transform Miller
     * indices in the DIFFRN_REFLN category into the Miller indices in
     * the REFLN category.
     * @return TransfMatrix31
     */
    public TransfMatrix31 getTransfMatrix31() {
        return (TransfMatrix31) (isText ? textFields.computeIfAbsent("transf_matrix[3][1]",
                TransfMatrix31::new) : getBinaryColumn("transf_matrix[3][1]"));
    }

    /**
     * The elements of the 3x3 matrix used to transform Miller
     * indices in the DIFFRN_REFLN category into the Miller indices in
     * the REFLN category.
     * @return TransfMatrix32
     */
    public TransfMatrix32 getTransfMatrix32() {
        return (TransfMatrix32) (isText ? textFields.computeIfAbsent("transf_matrix[3][2]",
                TransfMatrix32::new) : getBinaryColumn("transf_matrix[3][2]"));
    }

    /**
     * The elements of the 3x3 matrix used to transform Miller
     * indices in the DIFFRN_REFLN category into the Miller indices in
     * the REFLN category.
     * @return TransfMatrix33
     */
    public TransfMatrix33 getTransfMatrix33() {
        return (TransfMatrix33) (isText ? textFields.computeIfAbsent("transf_matrix[3][3]",
                TransfMatrix33::new) : getBinaryColumn("transf_matrix[3][3]"));
    }

    /**
     * Measure [sum u(net I)|/sum|net I|] for all measured reflections.
     * @return AvUnetI_netI
     */
    public AvUnetI_netI getAvUnetI_netI() {
        return (AvUnetI_netI) (isText ? textFields.computeIfAbsent("av_unetI/netI",
                AvUnetI_netI::new) : getBinaryColumn("av_unetI/netI"));
    }

    /**
     * The lowest resolution for the interplanar spacings in the
     * reflection data set. This is the largest d value.
     * @return PdbxDResLow
     */
    public PdbxDResLow getPdbxDResLow() {
        return (PdbxDResLow) (isText ? textFields.computeIfAbsent("pdbx_d_res_low",
                PdbxDResLow::new) : getBinaryColumn("pdbx_d_res_low"));
    }

    /**
     * The highest resolution for the interplanar spacings in the
     * reflection data set. This is the smallest d value.
     * @return PdbxDResHigh
     */
    public PdbxDResHigh getPdbxDResHigh() {
        return (PdbxDResHigh) (isText ? textFields.computeIfAbsent("pdbx_d_res_high",
                PdbxDResHigh::new) : getBinaryColumn("pdbx_d_res_high"));
    }

    /**
     * The percentage of geometrically possible reflections represented
     * by reflections that satisfy the resolution limits established
     * by _diffrn_reflns.d_resolution_high and _diffrn_reflns.d_resolution_low and
     * the observation limit established by   _diffrn_reflns.observed_criterion.
     * @return PdbxPercentPossibleObs
     */
    public PdbxPercentPossibleObs getPdbxPercentPossibleObs() {
        return (PdbxPercentPossibleObs) (isText ? textFields.computeIfAbsent("pdbx_percent_possible_obs",
                PdbxPercentPossibleObs::new) : getBinaryColumn("pdbx_percent_possible_obs"));
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
     * @return PdbxRmergeIObs
     */
    public PdbxRmergeIObs getPdbxRmergeIObs() {
        return (PdbxRmergeIObs) (isText ? textFields.computeIfAbsent("pdbx_Rmerge_I_obs",
                PdbxRmergeIObs::new) : getBinaryColumn("pdbx_Rmerge_I_obs"));
    }

    /**
     * The R factor for averaging the symmetry related reflections to a
     * unique data set.
     * @return PdbxRsymValue
     */
    public PdbxRsymValue getPdbxRsymValue() {
        return (PdbxRsymValue) (isText ? textFields.computeIfAbsent("pdbx_Rsym_value",
                PdbxRsymValue::new) : getBinaryColumn("pdbx_Rsym_value"));
    }

    /**
     * Overall  Chi-squared statistic for the data set.
     * @return PdbxChiSquared
     */
    public PdbxChiSquared getPdbxChiSquared() {
        return (PdbxChiSquared) (isText ? textFields.computeIfAbsent("pdbx_chi_squared",
                PdbxChiSquared::new) : getBinaryColumn("pdbx_chi_squared"));
    }

    /**
     * The overall redundancy for the data set.
     * @return PdbxRedundancy
     */
    public PdbxRedundancy getPdbxRedundancy() {
        return (PdbxRedundancy) (isText ? textFields.computeIfAbsent("pdbx_redundancy",
                PdbxRedundancy::new) : getBinaryColumn("pdbx_redundancy"));
    }

    /**
     * The number of rejected reflections in the data set.
     * The reflections may be rejected by setting the
     * observation criterion, _diffrn_reflns.observed_criterion.
     * @return PdbxRejects
     */
    public PdbxRejects getPdbxRejects() {
        return (PdbxRejects) (isText ? textFields.computeIfAbsent("pdbx_rejects",
                PdbxRejects::new) : getBinaryColumn("pdbx_rejects"));
    }

    /**
     * The criterion used to classify a reflection as 'observed'. This
     * criterion is usually expressed in terms of a sigma(I) or
     * sigma(F) threshold.
     * @return PdbxObservedCriterion
     */
    public PdbxObservedCriterion getPdbxObservedCriterion() {
        return (PdbxObservedCriterion) (isText ? textFields.computeIfAbsent("pdbx_observed_criterion",
                PdbxObservedCriterion::new) : getBinaryColumn("pdbx_observed_criterion"));
    }

    /**
     * The  number of reflections satisfying the observation criterion
     * as in _diffrn_reflns.pdbx_observed_criterion
     * @return PdbxNumberObs
     */
    public PdbxNumberObs getPdbxNumberObs() {
        return (PdbxNumberObs) (isText ? textFields.computeIfAbsent("pdbx_number_obs",
                PdbxNumberObs::new) : getBinaryColumn("pdbx_number_obs"));
    }
}
