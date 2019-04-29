package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the REFLNS_SHELL category record details about
 * the reflection data used to determine the ATOM_SITE data items
 * broken down into shells of resolution.
 */
@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class ReflnsShell extends BaseCategory {
    public ReflnsShell(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public ReflnsShell(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public ReflnsShell(String name) {
        super(name);
    }

    /**
     * The smallest value in angstroms for the interplanar spacings
     * for the reflections in this shell. This is called the highest
     * resolution.
     * @return FloatColumn
     */
    public FloatColumn getDResHigh() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("d_res_high", FloatColumn::new) :
                getBinaryColumn("d_res_high"));
    }

    /**
     * The highest value in angstroms for the interplanar spacings
     * for the reflections in this shell. This is called the lowest
     * resolution.
     * @return FloatColumn
     */
    public FloatColumn getDResLow() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("d_res_low", FloatColumn::new) :
                getBinaryColumn("d_res_low"));
    }

    /**
     * The ratio of the mean of the intensities of all reflections
     * in this shell to the mean of the standard uncertainties of the
     * intensities of all reflections in this shell.
     * @return FloatColumn
     */
    public FloatColumn getMeanIOverSigIAll() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("meanI_over_sigI_all", FloatColumn::new) :
                getBinaryColumn("meanI_over_sigI_all"));
    }

    /**
     * The ratio of the mean of the intensities of the reflections
     * classified as 'observed' (see _reflns.observed_criterion) in
     * this shell to the mean of the standard uncertainties of the
     * intensities of the 'observed' reflections in this
     * shell.
     * @return FloatColumn
     */
    public FloatColumn getMeanIOverSigIObs() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("meanI_over_sigI_obs", FloatColumn::new) :
                getBinaryColumn("meanI_over_sigI_obs"));
    }

    /**
     * The total number of reflections measured for this
     * shell.
     * @return IntColumn
     */
    public IntColumn getNumberMeasuredAll() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("number_measured_all", IntColumn::new) :
                getBinaryColumn("number_measured_all"));
    }

    /**
     * The number of reflections classified as 'observed'
     * (see _reflns.observed_criterion) for this
     * shell.
     * @return IntColumn
     */
    public IntColumn getNumberMeasuredObs() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("number_measured_obs", IntColumn::new) :
                getBinaryColumn("number_measured_obs"));
    }

    /**
     * The number of unique reflections it is possible to measure in
     * this shell.
     * @return IntColumn
     */
    public IntColumn getNumberPossible() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("number_possible", IntColumn::new) :
                getBinaryColumn("number_possible"));
    }

    /**
     * The total number of measured reflections which are symmetry-
     * unique after merging for this shell.
     * @return IntColumn
     */
    public IntColumn getNumberUniqueAll() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("number_unique_all", IntColumn::new) :
                getBinaryColumn("number_unique_all"));
    }

    /**
     * The total number of measured reflections classified as 'observed'
     * (see _reflns.observed_criterion) which are symmetry-unique
     * after merging for this shell.
     * @return IntColumn
     */
    public IntColumn getNumberUniqueObs() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("number_unique_obs", IntColumn::new) :
                getBinaryColumn("number_unique_obs"));
    }

    /**
     * The percentage of geometrically possible reflections represented
     * by all reflections measured for this shell.
     * @return FloatColumn
     */
    public FloatColumn getPercentPossibleAll() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("percent_possible_all", FloatColumn::new) :
                getBinaryColumn("percent_possible_all"));
    }

    /**
     * The percentage of geometrically possible reflections represented
     * by reflections classified as 'observed' (see
     * _reflns.observed_criterion) for this shell.
     * @return FloatColumn
     */
    public FloatColumn getPercentPossibleObs() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("percent_possible_obs", FloatColumn::new) :
                getBinaryColumn("percent_possible_obs"));
    }

    /**
     * Residual factor Rmerge for all reflections that satisfy the
     * resolution limits established by _reflns_shell.d_res_high and
     * _reflns_shell.d_res_low.
     * 
     * sum~i~(sum~j~|F~j~ - <F>|)
     * Rmerge(F) = --------------------------
     * sum~i~(sum~j~<F>)
     * 
     * F~j~ = the amplitude of the jth observation of reflection i
     * <F>  = the mean of the amplitudes of all observations of
     * reflection i
     * 
     * sum~i~ is taken over all reflections
     * sum~j~ is taken over all observations of each reflection
     * @return FloatColumn
     */
    public FloatColumn getRmergeFAll() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("Rmerge_F_all", FloatColumn::new) :
                getBinaryColumn("Rmerge_F_all"));
    }

    /**
     * Residual factor Rmerge for reflections that satisfy the
     * resolution limits established by _reflns_shell.d_res_high and
     * _reflns_shell.d_res_low and the observation criterion
     * established by _reflns.observed_criterion.
     * 
     * sum~i~(sum~j~|F~j~ - <F>|)
     * Rmerge(F) = --------------------------
     * sum~i~(sum~j~<F>)
     * 
     * F~j~ = the amplitude of the jth observation of reflection i
     * <F>  = the mean of the amplitudes of all observations of
     * reflection i
     * 
     * sum~i~ is taken over all reflections
     * sum~j~ is taken over all observations of each reflection
     * @return FloatColumn
     */
    public FloatColumn getRmergeFObs() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("Rmerge_F_obs", FloatColumn::new) :
                getBinaryColumn("Rmerge_F_obs"));
    }

    /**
     * The value of Rmerge(I) for all reflections in a given shell.
     * 
     * sum~i~(sum~j~|I~j~ - <I>|)
     * Rmerge(I) = --------------------------
     * sum~i~(sum~j~<I>)
     * 
     * I~j~ = the intensity of the jth observation of reflection i
     * <I>  = the mean of the intensities of all observations of
     * reflection i
     * 
     * sum~i~ is taken over all reflections
     * sum~j~ is taken over all observations of each reflection
     * @return FloatColumn
     */
    public FloatColumn getRmergeIAll() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("Rmerge_I_all", FloatColumn::new) :
                getBinaryColumn("Rmerge_I_all"));
    }

    /**
     * The value of Rmerge(I) for reflections classified as 'observed'
     * (see _reflns.observed_criterion) in a given shell.
     * 
     * sum~i~(sum~j~|I~j~ - <I>|)
     * Rmerge(I) = --------------------------
     * sum~i~(sum~j~<I>)
     * 
     * I~j~ = the intensity of the jth observation of reflection i
     * <I>  = the mean of the intensities of all observations of
     * reflection i
     * 
     * sum~i~ is taken over all reflections
     * sum~j~ is taken over all observations of each reflection
     * @return FloatColumn
     */
    public FloatColumn getRmergeIObs() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("Rmerge_I_obs", FloatColumn::new) :
                getBinaryColumn("Rmerge_I_obs"));
    }

    /**
     * The ratio of the mean of the intensities of the significantly
     * intense reflections (see _reflns.threshold_expression) in
     * this shell to the mean of the standard uncertainties of the
     * intensities of the significantly intense reflections in this
     * shell.
     * @return FloatColumn
     */
    public FloatColumn getMeanIOverSigIGt() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("meanI_over_sigI_gt", FloatColumn::new) :
                getBinaryColumn("meanI_over_sigI_gt"));
    }

    /**
     * The ratio of the mean of the intensities of all reflections
     * in this shell to the mean of the standard uncertainties of the
     * intensities of all reflections in this shell.
     * @return FloatColumn
     */
    public FloatColumn getMeanIOverUIAll() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("meanI_over_uI_all", FloatColumn::new) :
                getBinaryColumn("meanI_over_uI_all"));
    }

    /**
     * The ratio of the mean of the intensities of the significantly
     * intense reflections (see _reflns.threshold_expression) in
     * this shell to the mean of the standard uncertainties of the
     * intensities of the significantly intense reflections in this
     * shell.
     * @return FloatColumn
     */
    public FloatColumn getMeanIOverUIGt() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("meanI_over_uI_gt", FloatColumn::new) :
                getBinaryColumn("meanI_over_uI_gt"));
    }

    /**
     * The number of significantly intense reflections
     * (see _reflns.threshold_expression) measured for this
     * shell.
     * @return IntColumn
     */
    public IntColumn getNumberMeasuredGt() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("number_measured_gt", IntColumn::new) :
                getBinaryColumn("number_measured_gt"));
    }

    /**
     * The total number of significantly intense reflections
     * (see _reflns.threshold_expression) resulting from merging
     * measured symmetry-equivalent reflections for this resolution
     * shell.
     * @return IntColumn
     */
    public IntColumn getNumberUniqueGt() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("number_unique_gt", IntColumn::new) :
                getBinaryColumn("number_unique_gt"));
    }

    /**
     * The percentage of geometrically possible reflections
     * represented by significantly intense reflections
     * (see _reflns.threshold_expression) measured for this
     * shell.
     * @return FloatColumn
     */
    public FloatColumn getPercentPossibleGt() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("percent_possible_gt", FloatColumn::new) :
                getBinaryColumn("percent_possible_gt"));
    }

    /**
     * The value of Rmerge(F) for significantly intense reflections
     * (see _reflns.threshold_expression) in a given shell.
     * 
     * sum~i~ ( sum~j~ | F~j~ - <F> | )
     * Rmerge(F) = --------------------------------
     * sum~i~ ( sum~j~ <F> )
     * 
     * F~j~  = the amplitude of the jth observation of reflection i
     * <F> = the mean of the amplitudes of all observations of
     * reflection i
     * 
     * sum~i~ is taken over all reflections
     * sum~j~ is taken over all observations of each reflection.
     * @return FloatColumn
     */
    public FloatColumn getRmergeFGt() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("Rmerge_F_gt", FloatColumn::new) :
                getBinaryColumn("Rmerge_F_gt"));
    }

    /**
     * The value of Rmerge(I) for significantly intense reflections
     * (see _reflns.threshold_expression) in a given shell.
     * 
     * sum~i~ ( sum~j~ | I~j~ - <I> | )
     * Rmerge(I) = --------------------------------
     * sum~i~ ( sum~j~ <I> )
     * 
     * I~j~  = the intensity of the jth observation of reflection i
     * <I> = the mean of the intensities of all observations of
     * reflection i
     * 
     * sum~i~ is taken over all reflections
     * sum~j~ is taken over all observations of each reflection.
     * @return FloatColumn
     */
    public FloatColumn getRmergeIGt() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("Rmerge_I_gt", FloatColumn::new) :
                getBinaryColumn("Rmerge_I_gt"));
    }

    /**
     * Redundancy for the current shell.
     * @return FloatColumn
     */
    public FloatColumn getPdbxRedundancy() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_redundancy", FloatColumn::new) :
                getBinaryColumn("pdbx_redundancy"));
    }

    /**
     * R sym value in percent.
     * @return FloatColumn
     */
    public FloatColumn getPdbxRsymValue() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_Rsym_value", FloatColumn::new) :
                getBinaryColumn("pdbx_Rsym_value"));
    }

    /**
     * Chi-squared statistic for this resolution shell.
     * @return FloatColumn
     */
    public FloatColumn getPdbxChiSquared() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_chi_squared", FloatColumn::new) :
                getBinaryColumn("pdbx_chi_squared"));
    }

    /**
     * The mean of the ratio of the intensities to their
     * standard uncertainties of all reflections in the
     * resolution shell.
     * 
     * _reflns_shell.pdbx_netI_over_sigmaI_all =  <I/sigma(I)>
     * @return FloatColumn
     */
    public FloatColumn getPdbxNetIOverSigmaIAll() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_netI_over_sigmaI_all", FloatColumn::new) :
                getBinaryColumn("pdbx_netI_over_sigmaI_all"));
    }

    /**
     * The mean of the ratio of the intensities to their
     * standard uncertainties of observed reflections
     * (see _reflns.observed_criterion) in the resolution shell.
     * 
     * _reflns_shell.pdbx_netI_over_sigmaI_obs =  <I/sigma(I)>
     * @return FloatColumn
     */
    public FloatColumn getPdbxNetIOverSigmaIObs() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_netI_over_sigmaI_obs", FloatColumn::new) :
                getBinaryColumn("pdbx_netI_over_sigmaI_obs"));
    }

    /**
     * The redundancy-independent merging R factor value Rrim,
     * also denoted Rmeas, for merging all intensities in a
     * given shell.
     * 
     * sum~i~ [N~i~ /( N~i~ - 1)]1/2^ sum~j~ | I~j~ - <I~i~> |
     * Rrim = --------------------------------------------------------
     * sum~i~ ( sum~j~ I~j~ )
     * 
     * I~j~   = the intensity of the jth observation of reflection i
     * <I~i~> = the mean of the intensities of all observations of
     * reflection i
     * N~i~   = the redundancy (the number of times reflection i
     * has been measured).
     * 
     * sum~i~ is taken over all reflections
     * sum~j~ is taken over all observations of each reflection.
     * 
     * Ref: Diederichs, K. & Karplus, P. A. (1997). Nature Struct.
     * Biol. 4, 269-275.
     * Weiss, M. S. & Hilgenfeld, R. (1997). J. Appl. Cryst.
     * 30, 203-205.
     * Weiss, M. S. (2001). J. Appl. Cryst. 34, 130-135.
     * @return FloatColumn
     */
    public FloatColumn getPdbxRrimIAll() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_Rrim_I_all", FloatColumn::new) :
                getBinaryColumn("pdbx_Rrim_I_all"));
    }

    /**
     * The precision-indicating merging R factor value Rpim,
     * for merging all intensities in a given shell.
     * 
     * sum~i~ [1/(N~i~ - 1)]1/2^ sum~j~ | I~j~ - <I~i~> |
     * Rpim = --------------------------------------------------
     * sum~i~ ( sum~j~ I~j~ )
     * 
     * I~j~   = the intensity of the jth observation of reflection i
     * <I~i~> = the mean of the intensities of all observations of
     * reflection i
     * N~i~   = the redundancy (the number of times reflection i
     * has been measured).
     * 
     * sum~i~ is taken over all reflections
     * sum~j~ is taken over all observations of each reflection.
     * 
     * Ref: Diederichs, K. & Karplus, P. A. (1997). Nature Struct.
     * Biol. 4, 269-275.
     * Weiss, M. S. & Hilgenfeld, R. (1997). J. Appl. Cryst.
     * 30, 203-205.
     * Weiss, M. S. (2001). J. Appl. Cryst. 34, 130-135.
     * @return FloatColumn
     */
    public FloatColumn getPdbxRpimIAll() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_Rpim_I_all", FloatColumn::new) :
                getBinaryColumn("pdbx_Rpim_I_all"));
    }

    /**
     * The number of rejected reflections in the resolution
     * shell.  Reflections may be rejected from scaling
     * by setting the observation criterion,
     * _reflns.observed_criterion.
     * @return IntColumn
     */
    public IntColumn getPdbxRejects() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("pdbx_rejects", IntColumn::new) :
                getBinaryColumn("pdbx_rejects"));
    }

    /**
     * An ordinal identifier for this resolution shell.
     * @return IntColumn
     */
    public IntColumn getPdbxOrdinal() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("pdbx_ordinal", IntColumn::new) :
                getBinaryColumn("pdbx_ordinal"));
    }

    /**
     * An identifier for the diffraction data set corresponding to this resolution shell.
     * 
     * Multiple diffraction data sets specified as a comma separated list.
     * @return StrColumn
     */
    public StrColumn getPdbxDiffrnId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_diffrn_id", StrColumn::new) :
                getBinaryColumn("pdbx_diffrn_id"));
    }

    /**
     * The Pearson's correlation coefficient expressed as a decimal value
     * between the average intensities from randomly selected
     * half-datasets within the resolution shell.
     * 
     * Ref: Karplus & Diederichs (2012), Science 336, 1030-33
     * @return FloatColumn
     */
    public FloatColumn getPdbxCCHalf() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_CC_half", FloatColumn::new) :
                getBinaryColumn("pdbx_CC_half"));
    }

    /**
     * 
     * R split measures the agreement between the sets of intensities created by merging
     * odd- and even-numbered images from the data within the resolution shell.
     * 
     * Ref: T. A. White, R. A. Kirian, A. V. Martin, A. Aquila, K. Nass,
     * A. Barty and H. N. Chapman (2012), J. Appl. Cryst. 45, 335-341
     * @return FloatColumn
     */
    public FloatColumn getPdbxRSplit() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_R_split", FloatColumn::new) :
                getBinaryColumn("pdbx_R_split"));
    }

    /**
     * For this shell, the redundancy in the observed reflections.
     * @return FloatColumn
     */
    public FloatColumn getPdbxRedundancyReflnsObs() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_redundancy_reflns_obs", FloatColumn::new) :
                getBinaryColumn("pdbx_redundancy_reflns_obs"));
    }

    /**
     * This item is a duplicate of _reflns_shell.number_unique_all,
     * but only for the observed Friedel pairs.
     * @return IntColumn
     */
    public IntColumn getPdbxNumberAnomalous() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("pdbx_number_anomalous", IntColumn::new) :
                getBinaryColumn("pdbx_number_anomalous"));
    }

    /**
     * This item is the duplicate of _reflns_shell.pdbx_Rrim_I_all, but
     * is limited to observed Friedel pairs.
     * @return FloatColumn
     */
    public FloatColumn getPdbxRrimIAllAnomalous() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_Rrim_I_all_anomalous", FloatColumn::new) :
                getBinaryColumn("pdbx_Rrim_I_all_anomalous"));
    }

    /**
     * This item serves the same purpose as
     * _reflns_shell.pdbx_Rpim_I_all, but applies to observed Friedel pairs
     * only.
     * @return FloatColumn
     */
    public FloatColumn getPdbxRpimIAllAnomalous() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_Rpim_I_all_anomalous", FloatColumn::new) :
                getBinaryColumn("pdbx_Rpim_I_all_anomalous"));
    }

    /**
     * This item is the same as _reflns_shell.pdbx_Rmerge_I_all, but
     * applies to observed Friedel pairs only.
     * @return FloatColumn
     */
    public FloatColumn getPdbxRmergeIAllAnomalous() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_Rmerge_I_all_anomalous", FloatColumn::new) :
                getBinaryColumn("pdbx_Rmerge_I_all_anomalous"));
    }
}
