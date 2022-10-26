package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the REFLNS_SHELL category record details about
 * the reflection data used to determine the ATOM_SITE data items
 * broken down into shells of resolution.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class ReflnsShell extends DelegatingCategory {
    public ReflnsShell(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "d_res_high":
                return getDResHigh();
            case "d_res_low":
                return getDResLow();
            case "meanI_over_sigI_all":
                return getMeanIOverSigIAll();
            case "meanI_over_sigI_obs":
                return getMeanIOverSigIObs();
            case "number_measured_all":
                return getNumberMeasuredAll();
            case "number_measured_obs":
                return getNumberMeasuredObs();
            case "number_possible":
                return getNumberPossible();
            case "number_unique_all":
                return getNumberUniqueAll();
            case "number_unique_obs":
                return getNumberUniqueObs();
            case "percent_possible_obs":
                return getPercentPossibleObs();
            case "Rmerge_F_all":
                return getRmergeFAll();
            case "Rmerge_F_obs":
                return getRmergeFObs();
            case "meanI_over_sigI_gt":
                return getMeanIOverSigIGt();
            case "meanI_over_uI_all":
                return getMeanIOverUIAll();
            case "meanI_over_uI_gt":
                return getMeanIOverUIGt();
            case "number_measured_gt":
                return getNumberMeasuredGt();
            case "number_unique_gt":
                return getNumberUniqueGt();
            case "percent_possible_gt":
                return getPercentPossibleGt();
            case "Rmerge_F_gt":
                return getRmergeFGt();
            case "Rmerge_I_gt":
                return getRmergeIGt();
            case "pdbx_redundancy":
                return getPdbxRedundancy();
            case "pdbx_chi_squared":
                return getPdbxChiSquared();
            case "pdbx_netI_over_sigmaI_all":
                return getPdbxNetIOverSigmaIAll();
            case "pdbx_netI_over_sigmaI_obs":
                return getPdbxNetIOverSigmaIObs();
            case "pdbx_Rrim_I_all":
                return getPdbxRrimIAll();
            case "pdbx_Rpim_I_all":
                return getPdbxRpimIAll();
            case "pdbx_rejects":
                return getPdbxRejects();
            case "pdbx_ordinal":
                return getPdbxOrdinal();
            case "pdbx_diffrn_id":
                return getPdbxDiffrnId();
            case "pdbx_CC_half":
                return getPdbxCCHalf();
            case "pdbx_CC_star":
                return getPdbxCCStar();
            case "pdbx_R_split":
                return getPdbxRSplit();
            case "pdbx_redundancy_reflns_obs":
                return getPdbxRedundancyReflnsObs();
            case "pdbx_number_anomalous":
                return getPdbxNumberAnomalous();
            case "pdbx_Rrim_I_all_anomalous":
                return getPdbxRrimIAllAnomalous();
            case "pdbx_Rpim_I_all_anomalous":
                return getPdbxRpimIAllAnomalous();
            case "pdbx_Rmerge_I_all_anomalous":
                return getPdbxRmergeIAllAnomalous();
            case "percent_possible_all":
                return getPercentPossibleAll();
            case "Rmerge_I_all":
                return getRmergeIAll();
            case "Rmerge_I_obs":
                return getRmergeIObs();
            case "pdbx_Rsym_value":
                return getPdbxRsymValue();
            case "pdbx_percent_possible_ellipsoidal":
                return getPdbxPercentPossibleEllipsoidal();
            case "pdbx_percent_possible_spherical":
                return getPdbxPercentPossibleSpherical();
            case "pdbx_percent_possible_ellipsoidal_anomalous":
                return getPdbxPercentPossibleEllipsoidalAnomalous();
            case "pdbx_percent_possible_spherical_anomalous":
                return getPdbxPercentPossibleSphericalAnomalous();
            case "pdbx_redundancy_anomalous":
                return getPdbxRedundancyAnomalous();
            case "pdbx_CC_half_anomalous":
                return getPdbxCCHalfAnomalous();
            case "pdbx_absDiff_over_sigma_anomalous":
                return getPdbxAbsDiffOverSigmaAnomalous();
            case "pdbx_percent_possible_anomalous":
                return getPdbxPercentPossibleAnomalous();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The smallest value in angstroms for the interplanar spacings
     * for the reflections in this shell. This is called the highest
     * resolution.
     * @return FloatColumn
     */
    public FloatColumn getDResHigh() {
        return delegate.getColumn("d_res_high", DelegatingFloatColumn::new);
    }

    /**
     * The highest value in angstroms for the interplanar spacings
     * for the reflections in this shell. This is called the lowest
     * resolution.
     * @return FloatColumn
     */
    public FloatColumn getDResLow() {
        return delegate.getColumn("d_res_low", DelegatingFloatColumn::new);
    }

    /**
     * The ratio of the mean of the intensities of all reflections
     * in this shell to the mean of the standard uncertainties of the
     * intensities of all reflections in this shell.
     * @return FloatColumn
     */
    public FloatColumn getMeanIOverSigIAll() {
        return delegate.getColumn("meanI_over_sigI_all", DelegatingFloatColumn::new);
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
        return delegate.getColumn("meanI_over_sigI_obs", DelegatingFloatColumn::new);
    }

    /**
     * The total number of reflections measured for this
     * shell.
     * @return IntColumn
     */
    public IntColumn getNumberMeasuredAll() {
        return delegate.getColumn("number_measured_all", DelegatingIntColumn::new);
    }

    /**
     * The number of reflections classified as 'observed'
     * (see _reflns.observed_criterion) for this
     * shell.
     * @return IntColumn
     */
    public IntColumn getNumberMeasuredObs() {
        return delegate.getColumn("number_measured_obs", DelegatingIntColumn::new);
    }

    /**
     * The number of unique reflections it is possible to measure in
     * this shell.
     * @return IntColumn
     */
    public IntColumn getNumberPossible() {
        return delegate.getColumn("number_possible", DelegatingIntColumn::new);
    }

    /**
     * The total number of measured reflections which are symmetry-
     * unique after merging for this shell.
     * @return IntColumn
     */
    public IntColumn getNumberUniqueAll() {
        return delegate.getColumn("number_unique_all", DelegatingIntColumn::new);
    }

    /**
     * The total number of measured reflections classified as 'observed'
     * (see _reflns.observed_criterion) which are symmetry-unique
     * after merging for this shell.
     * @return IntColumn
     */
    public IntColumn getNumberUniqueObs() {
        return delegate.getColumn("number_unique_obs", DelegatingIntColumn::new);
    }

    /**
     * The percentage of geometrically possible reflections represented
     * by reflections classified as 'observed' (see
     * _reflns.observed_criterion) for this shell.
     * @return FloatColumn
     */
    public FloatColumn getPercentPossibleObs() {
        return delegate.getColumn("percent_possible_obs", DelegatingFloatColumn::new);
    }

    /**
     * Residual factor Rmerge for all reflections that satisfy the
     * resolution limits established by _reflns_shell.d_res_high and
     * _reflns_shell.d_res_low.
     * 
     * sum~i~(sum~j~|F~j~ - &lt;F&gt;|)
     * Rmerge(F) = --------------------------
     * sum~i~(sum~j~&lt;F&gt;)
     * 
     * F~j~ = the amplitude of the jth observation of reflection i
     * &lt;F&gt;  = the mean of the amplitudes of all observations of
     * reflection i
     * 
     * sum~i~ is taken over all reflections
     * sum~j~ is taken over all observations of each reflection
     * @return FloatColumn
     */
    public FloatColumn getRmergeFAll() {
        return delegate.getColumn("Rmerge_F_all", DelegatingFloatColumn::new);
    }

    /**
     * Residual factor Rmerge for reflections that satisfy the
     * resolution limits established by _reflns_shell.d_res_high and
     * _reflns_shell.d_res_low and the observation criterion
     * established by _reflns.observed_criterion.
     * 
     * sum~i~(sum~j~|F~j~ - &lt;F&gt;|)
     * Rmerge(F) = --------------------------
     * sum~i~(sum~j~&lt;F&gt;)
     * 
     * F~j~ = the amplitude of the jth observation of reflection i
     * &lt;F&gt;  = the mean of the amplitudes of all observations of
     * reflection i
     * 
     * sum~i~ is taken over all reflections
     * sum~j~ is taken over all observations of each reflection
     * @return FloatColumn
     */
    public FloatColumn getRmergeFObs() {
        return delegate.getColumn("Rmerge_F_obs", DelegatingFloatColumn::new);
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
        return delegate.getColumn("meanI_over_sigI_gt", DelegatingFloatColumn::new);
    }

    /**
     * The ratio of the mean of the intensities of all reflections
     * in this shell to the mean of the standard uncertainties of the
     * intensities of all reflections in this shell.
     * @return FloatColumn
     */
    public FloatColumn getMeanIOverUIAll() {
        return delegate.getColumn("meanI_over_uI_all", DelegatingFloatColumn::new);
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
        return delegate.getColumn("meanI_over_uI_gt", DelegatingFloatColumn::new);
    }

    /**
     * The number of significantly intense reflections
     * (see _reflns.threshold_expression) measured for this
     * shell.
     * @return IntColumn
     */
    public IntColumn getNumberMeasuredGt() {
        return delegate.getColumn("number_measured_gt", DelegatingIntColumn::new);
    }

    /**
     * The total number of significantly intense reflections
     * (see _reflns.threshold_expression) resulting from merging
     * measured symmetry-equivalent reflections for this resolution
     * shell.
     * @return IntColumn
     */
    public IntColumn getNumberUniqueGt() {
        return delegate.getColumn("number_unique_gt", DelegatingIntColumn::new);
    }

    /**
     * The percentage of geometrically possible reflections
     * represented by significantly intense reflections
     * (see _reflns.threshold_expression) measured for this
     * shell.
     * @return FloatColumn
     */
    public FloatColumn getPercentPossibleGt() {
        return delegate.getColumn("percent_possible_gt", DelegatingFloatColumn::new);
    }

    /**
     * The value of Rmerge(F) for significantly intense reflections
     * (see _reflns.threshold_expression) in a given shell.
     * 
     * sum~i~ ( sum~j~ | F~j~ - &lt;F&gt; | )
     * Rmerge(F) = --------------------------------
     * sum~i~ ( sum~j~ &lt;F&gt; )
     * 
     * F~j~  = the amplitude of the jth observation of reflection i
     * &lt;F&gt; = the mean of the amplitudes of all observations of
     * reflection i
     * 
     * sum~i~ is taken over all reflections
     * sum~j~ is taken over all observations of each reflection.
     * @return FloatColumn
     */
    public FloatColumn getRmergeFGt() {
        return delegate.getColumn("Rmerge_F_gt", DelegatingFloatColumn::new);
    }

    /**
     * The value of Rmerge(I) for significantly intense reflections
     * (see _reflns.threshold_expression) in a given shell.
     * 
     * sum~i~ ( sum~j~ | I~j~ - &lt;I&gt; | )
     * Rmerge(I) = --------------------------------
     * sum~i~ ( sum~j~ &lt;I&gt; )
     * 
     * I~j~  = the intensity of the jth observation of reflection i
     * &lt;I&gt; = the mean of the intensities of all observations of
     * reflection i
     * 
     * sum~i~ is taken over all reflections
     * sum~j~ is taken over all observations of each reflection.
     * @return FloatColumn
     */
    public FloatColumn getRmergeIGt() {
        return delegate.getColumn("Rmerge_I_gt", DelegatingFloatColumn::new);
    }

    /**
     * Redundancy for the current shell.
     * @return FloatColumn
     */
    public FloatColumn getPdbxRedundancy() {
        return delegate.getColumn("pdbx_redundancy", DelegatingFloatColumn::new);
    }

    /**
     * Chi-squared statistic for this resolution shell.
     * @return FloatColumn
     */
    public FloatColumn getPdbxChiSquared() {
        return delegate.getColumn("pdbx_chi_squared", DelegatingFloatColumn::new);
    }

    /**
     * The mean of the ratio of the intensities to their
     * standard uncertainties of all reflections in the
     * resolution shell.
     * 
     * _reflns_shell.pdbx_netI_over_sigmaI_all =  &lt;I/sigma(I)&gt;
     * @return FloatColumn
     */
    public FloatColumn getPdbxNetIOverSigmaIAll() {
        return delegate.getColumn("pdbx_netI_over_sigmaI_all", DelegatingFloatColumn::new);
    }

    /**
     * The mean of the ratio of the intensities to their
     * standard uncertainties of observed reflections
     * (see _reflns.observed_criterion) in the resolution shell.
     * 
     * _reflns_shell.pdbx_netI_over_sigmaI_obs =  &lt;I/sigma(I)&gt;
     * @return FloatColumn
     */
    public FloatColumn getPdbxNetIOverSigmaIObs() {
        return delegate.getColumn("pdbx_netI_over_sigmaI_obs", DelegatingFloatColumn::new);
    }

    /**
     * The redundancy-independent merging R factor value Rrim,
     * also denoted Rmeas, for merging all intensities in a
     * given shell.
     * 
     * sum~i~ [N~i~ /( N~i~ - 1)]1/2^ sum~j~ | I~j~ - &lt;I~i~&gt; |
     * Rrim = --------------------------------------------------------
     * sum~i~ ( sum~j~ I~j~ )
     * 
     * I~j~   = the intensity of the jth observation of reflection i
     * &lt;I~i~&gt; = the mean of the intensities of all observations of
     * reflection i
     * N~i~   = the redundancy (the number of times reflection i
     * has been measured).
     * 
     * sum~i~ is taken over all reflections
     * sum~j~ is taken over all observations of each reflection.
     * 
     * Ref: Diederichs, K. &amp; Karplus, P. A. (1997). Nature Struct.
     * Biol. 4, 269-275.
     * Weiss, M. S. &amp; Hilgenfeld, R. (1997). J. Appl. Cryst.
     * 30, 203-205.
     * Weiss, M. S. (2001). J. Appl. Cryst. 34, 130-135.
     * @return FloatColumn
     */
    public FloatColumn getPdbxRrimIAll() {
        return delegate.getColumn("pdbx_Rrim_I_all", DelegatingFloatColumn::new);
    }

    /**
     * The precision-indicating merging R factor value Rpim,
     * for merging all intensities in a given shell.
     * 
     * sum~i~ [1/(N~i~ - 1)]1/2^ sum~j~ | I~j~ - &lt;I~i~&gt; |
     * Rpim = --------------------------------------------------
     * sum~i~ ( sum~j~ I~j~ )
     * 
     * I~j~   = the intensity of the jth observation of reflection i
     * &lt;I~i~&gt; = the mean of the intensities of all observations of
     * reflection i
     * N~i~   = the redundancy (the number of times reflection i
     * has been measured).
     * 
     * sum~i~ is taken over all reflections
     * sum~j~ is taken over all observations of each reflection.
     * 
     * Ref: Diederichs, K. &amp; Karplus, P. A. (1997). Nature Struct.
     * Biol. 4, 269-275.
     * Weiss, M. S. &amp; Hilgenfeld, R. (1997). J. Appl. Cryst.
     * 30, 203-205.
     * Weiss, M. S. (2001). J. Appl. Cryst. 34, 130-135.
     * @return FloatColumn
     */
    public FloatColumn getPdbxRpimIAll() {
        return delegate.getColumn("pdbx_Rpim_I_all", DelegatingFloatColumn::new);
    }

    /**
     * The number of rejected reflections in the resolution
     * shell.  Reflections may be rejected from scaling
     * by setting the observation criterion,
     * _reflns.observed_criterion.
     * @return IntColumn
     */
    public IntColumn getPdbxRejects() {
        return delegate.getColumn("pdbx_rejects", DelegatingIntColumn::new);
    }

    /**
     * An ordinal identifier for this resolution shell.
     * @return IntColumn
     */
    public IntColumn getPdbxOrdinal() {
        return delegate.getColumn("pdbx_ordinal", DelegatingIntColumn::new);
    }

    /**
     * An identifier for the diffraction data set corresponding to this resolution shell.
     * 
     * Multiple diffraction data sets specified as a comma separated list.
     * @return StrColumn
     */
    public StrColumn getPdbxDiffrnId() {
        return delegate.getColumn("pdbx_diffrn_id", DelegatingStrColumn::new);
    }

    /**
     * The Pearson's correlation coefficient expressed as a decimal value
     * between the average intensities from randomly selected
     * half-datasets within the resolution shell.
     * 
     * Ref: Karplus &amp; Diederichs (2012), Science 336, 1030-33
     * @return FloatColumn
     */
    public FloatColumn getPdbxCCHalf() {
        return delegate.getColumn("pdbx_CC_half", DelegatingFloatColumn::new);
    }

    /**
     * Estimates the value of CC_true, the true correlation coefficient
     * between the average intensities from randomly selected half-datasets
     * within the resolution shell.
     * 
     * CC_star = sqrt(2*CC_half/(1+CC_half))
     * 
     * Ref: Karplus &amp; Diederichs (2012), Science 336, 1030-33
     * @return FloatColumn
     */
    public FloatColumn getPdbxCCStar() {
        return delegate.getColumn("pdbx_CC_star", DelegatingFloatColumn::new);
    }

    /**
     * R split measures the agreement between the sets of intensities created by merging
     * odd- and even-numbered images from the data within the resolution shell.
     * 
     * Ref: T. A. White, R. A. Kirian, A. V. Martin, A. Aquila, K. Nass,
     * A. Barty and H. N. Chapman (2012), J. Appl. Cryst. 45, 335-341
     * @return FloatColumn
     */
    public FloatColumn getPdbxRSplit() {
        return delegate.getColumn("pdbx_R_split", DelegatingFloatColumn::new);
    }

    /**
     * For this shell, the redundancy in the observed reflections.
     * @return FloatColumn
     */
    public FloatColumn getPdbxRedundancyReflnsObs() {
        return delegate.getColumn("pdbx_redundancy_reflns_obs", DelegatingFloatColumn::new);
    }

    /**
     * This item is a duplicate of _reflns_shell.number_unique_all,
     * but only for the observed Friedel pairs.
     * @return IntColumn
     */
    public IntColumn getPdbxNumberAnomalous() {
        return delegate.getColumn("pdbx_number_anomalous", DelegatingIntColumn::new);
    }

    /**
     * This item is the duplicate of _reflns_shell.pdbx_Rrim_I_all, but
     * is limited to observed Friedel pairs.
     * @return FloatColumn
     */
    public FloatColumn getPdbxRrimIAllAnomalous() {
        return delegate.getColumn("pdbx_Rrim_I_all_anomalous", DelegatingFloatColumn::new);
    }

    /**
     * This item serves the same purpose as
     * _reflns_shell.pdbx_Rpim_I_all, but applies to observed Friedel pairs
     * only.
     * @return FloatColumn
     */
    public FloatColumn getPdbxRpimIAllAnomalous() {
        return delegate.getColumn("pdbx_Rpim_I_all_anomalous", DelegatingFloatColumn::new);
    }

    /**
     * This item is the same as _reflns_shell.pdbx_Rmerge_I_all, but
     * applies to observed Friedel pairs only.
     * @return FloatColumn
     */
    public FloatColumn getPdbxRmergeIAllAnomalous() {
        return delegate.getColumn("pdbx_Rmerge_I_all_anomalous", DelegatingFloatColumn::new);
    }

    /**
     * The percentage of geometrically possible reflections represented
     * by all reflections measured for this shell.
     * @return FloatColumn
     */
    public FloatColumn getPercentPossibleAll() {
        return delegate.getColumn("percent_possible_all", DelegatingFloatColumn::new);
    }

    /**
     * The value of Rmerge(I) for all reflections in a given shell.
     * 
     * sum~i~(sum~j~|I~j~ - &lt;I&gt;|)
     * Rmerge(I) = --------------------------
     * sum~i~(sum~j~&lt;I&gt;)
     * 
     * I~j~ = the intensity of the jth observation of reflection i
     * &lt;I&gt;  = the mean of the intensities of all observations of
     * reflection i
     * 
     * sum~i~ is taken over all reflections
     * sum~j~ is taken over all observations of each reflection
     * @return FloatColumn
     */
    public FloatColumn getRmergeIAll() {
        return delegate.getColumn("Rmerge_I_all", DelegatingFloatColumn::new);
    }

    /**
     * The value of Rmerge(I) for reflections classified as 'observed'
     * (see _reflns.observed_criterion) in a given shell.
     * 
     * sum~i~(sum~j~|I~j~ - &lt;I&gt;|)
     * Rmerge(I) = --------------------------
     * sum~i~(sum~j~&lt;I&gt;)
     * 
     * I~j~ = the intensity of the jth observation of reflection i
     * &lt;I&gt;  = the mean of the intensities of all observations of
     * reflection i
     * 
     * sum~i~ is taken over all reflections
     * sum~j~ is taken over all observations of each reflection
     * @return FloatColumn
     */
    public FloatColumn getRmergeIObs() {
        return delegate.getColumn("Rmerge_I_obs", DelegatingFloatColumn::new);
    }

    /**
     * R sym value in percent.
     * @return FloatColumn
     */
    public FloatColumn getPdbxRsymValue() {
        return delegate.getColumn("pdbx_Rsym_value", DelegatingFloatColumn::new);
    }

    /**
     * Completeness (as a percentage) of symmetry-unique data
     * within the intersection of (1) a spherical shell
     * (defined by its diffraction limits,
     * _reflns_shell.d_resolution_high and
     * _reflns_shell.d_resolution_low) and (2) the ellipsoid
     * (described by __reflns.pdbx_aniso_diffraction_limit_*
     * items), relative to all possible symmetry-unique
     * reflections within that intersection.
     * @return FloatColumn
     */
    public FloatColumn getPdbxPercentPossibleEllipsoidal() {
        return delegate.getColumn("pdbx_percent_possible_ellipsoidal", DelegatingFloatColumn::new);
    }

    /**
     * Completeness (as a percentage) of symmetry-unique data
     * within the spherical shell defined by its diffraction
     * limits (_reflns_shell.d_resolution_high and
     * _reflns_shell.d_resolution_low) relative to all
     * possible symmetry-unique reflections within that shell.
     * 
     * In the absence of an anisotropy description this is
     * identical to _reflns_shell.percent_possible_all.
     * @return FloatColumn
     */
    public FloatColumn getPdbxPercentPossibleSpherical() {
        return delegate.getColumn("pdbx_percent_possible_spherical", DelegatingFloatColumn::new);
    }

    /**
     * Completeness (as a percentage) of symmetry-unique
     * anomalous difference data within the intersection of
     * (1) a spherical shell (defined by its diffraction
     * limits, _reflns_shell.d_resolution_high and
     * _reflns_shell.d_resolution_low) and (2) the ellipsoid
     * (described by __reflns.pdbx_aniso_diffraction_limit_*
     * items), relative to all possible symmetry-unique
     * anomalous difference data within that intersection.
     * @return FloatColumn
     */
    public FloatColumn getPdbxPercentPossibleEllipsoidalAnomalous() {
        return delegate.getColumn("pdbx_percent_possible_ellipsoidal_anomalous", DelegatingFloatColumn::new);
    }

    /**
     * Completeness (as a percentage) of symmetry-unique
     * anomalous difference data within the spherical shell
     * defined by its diffraction limits
     * (_reflns_shell.d_resolution_high and
     * _reflns_shell.d_resolution_low) relative to all
     * possible symmetry-unique anomalous difference data
     * within that shell.
     * 
     * In the absence of an anisotropy description this is
     * identical to _reflns.pdbx_percent_possible_anomalous.
     * @return FloatColumn
     */
    public FloatColumn getPdbxPercentPossibleSphericalAnomalous() {
        return delegate.getColumn("pdbx_percent_possible_spherical_anomalous", DelegatingFloatColumn::new);
    }

    /**
     * The redundancy of anomalous difference data within the
     * spherical shell (defined by its diffraction limits
     * _reflns_shell.d_resolution_high and
     * _reflns_shell.d_resolution_low), i.e. data for which
     * intensities for both instances of a Friedel pair are
     * available for an acentric reflection.
     * @return FloatColumn
     */
    public FloatColumn getPdbxRedundancyAnomalous() {
        return delegate.getColumn("pdbx_redundancy_anomalous", DelegatingFloatColumn::new);
    }

    /**
     * The correlation coefficient within the spherical shell
     * (defined by its diffraction limits
     * _reflns_shell.d_resolution_high and
     * _reflns_shell.d_resolution_low) between two randomly
     * chosen half-sets of anomalous intensity differences,
     * I(+)-I(-) for anomalous data, i.e. data for which
     * intensities for both instances of a Friedel pair are
     * available for an acentric reflection.
     * @return FloatColumn
     */
    public FloatColumn getPdbxCCHalfAnomalous() {
        return delegate.getColumn("pdbx_CC_half_anomalous", DelegatingFloatColumn::new);
    }

    /**
     * The mean ratio of absolute anomalous intensity
     * differences to their standard deviation within the
     * spherical shell (defined by its diffraction limits
     * _reflns_shell.d_resolution_high and
     * _reflns_shell.d_resolution_low).
     * 
     * |Dano|
     * -------------
     * sigma(Dano)
     * 
     * with
     * 
     * Dano        = I(+) - I(-)
     * sigma(Dano) = sqrt( sigma(I(+))^2 + sigma(I(-))^2 )
     * @return FloatColumn
     */
    public FloatColumn getPdbxAbsDiffOverSigmaAnomalous() {
        return delegate.getColumn("pdbx_absDiff_over_sigma_anomalous", DelegatingFloatColumn::new);
    }

    /**
     * Completeness (as a percentage) of symmetry-unique
     * anomalous difference data within the spherical shell
     * defined by its diffraction limits
     * (_reflns_shell.d_resolution_high and
     * _reflns_shell.d_resolution_low) relative to all
     * possible symmetry-unique anomalous difference data
     * within that shell.
     * @return FloatColumn
     */
    public FloatColumn getPdbxPercentPossibleAnomalous() {
        return delegate.getColumn("pdbx_percent_possible_anomalous", DelegatingFloatColumn::new);
    }

}