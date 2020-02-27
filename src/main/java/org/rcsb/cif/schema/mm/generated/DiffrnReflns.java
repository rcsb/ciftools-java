package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

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
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return FloatColumn
     */
    public FloatColumn getAvREquivalents() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("av_R_equivalents", FloatColumn::new) :
                getBinaryColumn("av_R_equivalents"));
    }

    /**
     * Measure [sum|sigma(I)|/sum|net(I)|] for all measured reflections.
     * @return FloatColumn
     */
    public FloatColumn getAvSigmaIOverNetI() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("av_sigmaI_over_netI", FloatColumn::new) :
                getBinaryColumn("av_sigmaI_over_netI"));
    }

    /**
     * This data item is a pointer to _diffrn.id in the DIFFRN
     * category.
     * @return StrColumn
     */
    public StrColumn getDiffrnId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("diffrn_id", StrColumn::new) :
                getBinaryColumn("diffrn_id"));
    }

    /**
     * The maximum value of the Miller index h for the
     * reflection data specified by _diffrn_refln.index_h.
     * @return IntColumn
     */
    public IntColumn getLimitHMax() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("limit_h_max", IntColumn::new) :
                getBinaryColumn("limit_h_max"));
    }

    /**
     * The minimum value of the Miller index h for the
     * reflection data specified by _diffrn_refln.index_h.
     * @return IntColumn
     */
    public IntColumn getLimitHMin() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("limit_h_min", IntColumn::new) :
                getBinaryColumn("limit_h_min"));
    }

    /**
     * The maximum value of the Miller index k for the
     * reflection data specified by _diffrn_refln.index_k.
     * @return IntColumn
     */
    public IntColumn getLimitKMax() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("limit_k_max", IntColumn::new) :
                getBinaryColumn("limit_k_max"));
    }

    /**
     * The minimum value of the Miller index k for the
     * reflection data specified by _diffrn_refln.index_k.
     * @return IntColumn
     */
    public IntColumn getLimitKMin() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("limit_k_min", IntColumn::new) :
                getBinaryColumn("limit_k_min"));
    }

    /**
     * The maximum value of the Miller index l for the
     * reflection data specified by _diffrn_refln.index_l.
     * @return IntColumn
     */
    public IntColumn getLimitLMax() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("limit_l_max", IntColumn::new) :
                getBinaryColumn("limit_l_max"));
    }

    /**
     * The minimum value of the Miller index l for the
     * reflection data specified by _diffrn_refln.index_l.
     * @return IntColumn
     */
    public IntColumn getLimitLMin() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("limit_l_min", IntColumn::new) :
                getBinaryColumn("limit_l_min"));
    }

    /**
     * The total number of measured intensities, excluding reflections
     * that are classified as systematically absent.
     * @return IntColumn
     */
    public IntColumn getNumber() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("number", IntColumn::new) :
                getBinaryColumn("number"));
    }

    /**
     * A description of the process used to reduce the intensity data
     * into structure-factor magnitudes.
     * @return StrColumn
     */
    public StrColumn getReductionProcess() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("reduction_process", StrColumn::new) :
                getBinaryColumn("reduction_process"));
    }

    /**
     * Maximum theta angle in degrees for the measured diffraction
     * intensities.
     * @return FloatColumn
     */
    public FloatColumn getThetaMax() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("theta_max", FloatColumn::new) :
                getBinaryColumn("theta_max"));
    }

    /**
     * Minimum theta angle in degrees for the measured diffraction
     * intensities.
     * @return FloatColumn
     */
    public FloatColumn getThetaMin() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("theta_min", FloatColumn::new) :
                getBinaryColumn("theta_min"));
    }

    /**
     * The elements of the 3x3 matrix used to transform Miller
     * indices in the DIFFRN_REFLN category into the Miller indices in
     * the REFLN category.
     * @return FloatColumn
     */
    public FloatColumn getTransfMatrix11() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("transf_matrix[1][1]", FloatColumn::new) :
                getBinaryColumn("transf_matrix[1][1]"));
    }

    /**
     * The elements of the 3x3 matrix used to transform Miller
     * indices in the DIFFRN_REFLN category into the Miller indices in
     * the REFLN category.
     * @return FloatColumn
     */
    public FloatColumn getTransfMatrix12() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("transf_matrix[1][2]", FloatColumn::new) :
                getBinaryColumn("transf_matrix[1][2]"));
    }

    /**
     * The elements of the 3x3 matrix used to transform Miller
     * indices in the DIFFRN_REFLN category into the Miller indices in
     * the REFLN category.
     * @return FloatColumn
     */
    public FloatColumn getTransfMatrix13() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("transf_matrix[1][3]", FloatColumn::new) :
                getBinaryColumn("transf_matrix[1][3]"));
    }

    /**
     * The elements of the 3x3 matrix used to transform Miller
     * indices in the DIFFRN_REFLN category into the Miller indices in
     * the REFLN category.
     * @return FloatColumn
     */
    public FloatColumn getTransfMatrix21() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("transf_matrix[2][1]", FloatColumn::new) :
                getBinaryColumn("transf_matrix[2][1]"));
    }

    /**
     * The elements of the 3x3 matrix used to transform Miller
     * indices in the DIFFRN_REFLN category into the Miller indices in
     * the REFLN category.
     * @return FloatColumn
     */
    public FloatColumn getTransfMatrix22() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("transf_matrix[2][2]", FloatColumn::new) :
                getBinaryColumn("transf_matrix[2][2]"));
    }

    /**
     * The elements of the 3x3 matrix used to transform Miller
     * indices in the DIFFRN_REFLN category into the Miller indices in
     * the REFLN category.
     * @return FloatColumn
     */
    public FloatColumn getTransfMatrix23() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("transf_matrix[2][3]", FloatColumn::new) :
                getBinaryColumn("transf_matrix[2][3]"));
    }

    /**
     * The elements of the 3x3 matrix used to transform Miller
     * indices in the DIFFRN_REFLN category into the Miller indices in
     * the REFLN category.
     * @return FloatColumn
     */
    public FloatColumn getTransfMatrix31() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("transf_matrix[3][1]", FloatColumn::new) :
                getBinaryColumn("transf_matrix[3][1]"));
    }

    /**
     * The elements of the 3x3 matrix used to transform Miller
     * indices in the DIFFRN_REFLN category into the Miller indices in
     * the REFLN category.
     * @return FloatColumn
     */
    public FloatColumn getTransfMatrix32() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("transf_matrix[3][2]", FloatColumn::new) :
                getBinaryColumn("transf_matrix[3][2]"));
    }

    /**
     * The elements of the 3x3 matrix used to transform Miller
     * indices in the DIFFRN_REFLN category into the Miller indices in
     * the REFLN category.
     * @return FloatColumn
     */
    public FloatColumn getTransfMatrix33() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("transf_matrix[3][3]", FloatColumn::new) :
                getBinaryColumn("transf_matrix[3][3]"));
    }

    /**
     * Measure [sum u(net I)|/sum|net I|] for all measured reflections.
     * @return FloatColumn
     */
    public FloatColumn getAvUnetI_netI() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("av_unetI/netI", FloatColumn::new) :
                getBinaryColumn("av_unetI/netI"));
    }

    /**
     * The lowest resolution for the interplanar spacings in the
     * reflection data set. This is the largest d value.
     * @return FloatColumn
     */
    public FloatColumn getPdbxDResLow() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_d_res_low", FloatColumn::new) :
                getBinaryColumn("pdbx_d_res_low"));
    }

    /**
     * The highest resolution for the interplanar spacings in the
     * reflection data set. This is the smallest d value.
     * @return FloatColumn
     */
    public FloatColumn getPdbxDResHigh() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_d_res_high", FloatColumn::new) :
                getBinaryColumn("pdbx_d_res_high"));
    }

    /**
     * The percentage of geometrically possible reflections represented
     * by reflections that satisfy the resolution limits established
     * by _diffrn_reflns.d_resolution_high and _diffrn_reflns.d_resolution_low and
     * the observation limit established by   _diffrn_reflns.observed_criterion.
     * @return FloatColumn
     */
    public FloatColumn getPdbxPercentPossibleObs() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_percent_possible_obs", FloatColumn::new) :
                getBinaryColumn("pdbx_percent_possible_obs"));
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
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_Rmerge_I_obs", FloatColumn::new) :
                getBinaryColumn("pdbx_Rmerge_I_obs"));
    }

    /**
     * The R factor for averaging the symmetry related reflections to a
     * unique data set.
     * @return FloatColumn
     */
    public FloatColumn getPdbxRsymValue() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_Rsym_value", FloatColumn::new) :
                getBinaryColumn("pdbx_Rsym_value"));
    }

    /**
     * Overall  Chi-squared statistic for the data set.
     * @return FloatColumn
     */
    public FloatColumn getPdbxChiSquared() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_chi_squared", FloatColumn::new) :
                getBinaryColumn("pdbx_chi_squared"));
    }

    /**
     * The overall redundancy for the data set.
     * @return FloatColumn
     */
    public FloatColumn getPdbxRedundancy() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_redundancy", FloatColumn::new) :
                getBinaryColumn("pdbx_redundancy"));
    }

    /**
     * The number of rejected reflections in the data set.
     * The reflections may be rejected by setting the
     * observation criterion, _diffrn_reflns.observed_criterion.
     * @return IntColumn
     */
    public IntColumn getPdbxRejects() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("pdbx_rejects", IntColumn::new) :
                getBinaryColumn("pdbx_rejects"));
    }

    /**
     * The criterion used to classify a reflection as 'observed'. This
     * criterion is usually expressed in terms of a sigma(I) or
     * sigma(F) threshold.
     * @return FloatColumn
     */
    public FloatColumn getPdbxObservedCriterion() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_observed_criterion", FloatColumn::new) :
                getBinaryColumn("pdbx_observed_criterion"));
    }

    /**
     * The  number of reflections satisfying the observation criterion
     * as in _diffrn_reflns.pdbx_observed_criterion
     * @return IntColumn
     */
    public IntColumn getPdbxNumberObs() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("pdbx_number_obs", IntColumn::new) :
                getBinaryColumn("pdbx_number_obs"));
    }
}
