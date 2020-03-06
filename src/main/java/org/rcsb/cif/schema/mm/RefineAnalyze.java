package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the REFINE_ANALYZE category record details
 * about the refined structure that are often used to analyze the
 * refinement and assess its quality. A given computer program
 * may or may not produce values corresponding to these data
 * names.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class RefineAnalyze extends DelegatingCategory {
    public RefineAnalyze(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "entry_id":
                return getEntryId();
            case "pdbx_refine_id":
                return getPdbxRefineId();
            case "Luzzati_coordinate_error_free":
                return getLuzzatiCoordinateErrorFree();
            case "Luzzati_coordinate_error_obs":
                return getLuzzatiCoordinateErrorObs();
            case "Luzzati_d_res_low_free":
                return getLuzzatiDResLowFree();
            case "Luzzati_d_res_low_obs":
                return getLuzzatiDResLowObs();
            case "Luzzati_sigma_a_free":
                return getLuzzatiSigmaAFree();
            case "Luzzati_sigma_a_free_details":
                return getLuzzatiSigmaAFreeDetails();
            case "Luzzati_sigma_a_obs":
                return getLuzzatiSigmaAObs();
            case "Luzzati_sigma_a_obs_details":
                return getLuzzatiSigmaAObsDetails();
            case "number_disordered_residues":
                return getNumberDisorderedResidues();
            case "occupancy_sum_hydrogen":
                return getOccupancySumHydrogen();
            case "occupancy_sum_non_hydrogen":
                return getOccupancySumNonHydrogen();
            case "RG_d_res_high":
                return getRGDResHigh();
            case "RG_d_res_low":
                return getRGDResLow();
            case "RG_free":
                return getRGFree();
            case "RG_work":
                return getRGWork();
            case "RG_free_work_ratio":
                return getRGFreeWorkRatio();
            case "pdbx_Luzzati_d_res_high_obs":
                return getPdbxLuzzatiDResHighObs();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * This data item is a pointer to _entry.id in the ENTRY category.
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return delegate.getColumn("entry_id", DelegatingStrColumn::new);
    }

    /**
     * This data item uniquely identifies a refinement within an entry.
     * _refine_analyze.pdbx_refine_id can be used to distinguish the results
     * of joint refinements.
     * @return StrColumn
     */
    public StrColumn getPdbxRefineId() {
        return delegate.getColumn("pdbx_refine_id", DelegatingStrColumn::new);
    }

    /**
     * The estimated coordinate error obtained from the plot of
     * the R value versus sin(theta)/lambda for the reflections
     * treated as a test set during refinement.
     * 
     * Ref:  Luzzati, V. (1952). Traitement statistique des erreurs
     * dans la determination des structures cristallines. Acta
     * Cryst. 5, 802-810.
     * @return FloatColumn
     */
    public FloatColumn getLuzzatiCoordinateErrorFree() {
        return delegate.getColumn("Luzzati_coordinate_error_free", DelegatingFloatColumn::new);
    }

    /**
     * The estimated coordinate error obtained from the plot of
     * the R value versus sin(theta)/lambda for reflections classified
     * as observed.
     * 
     * Ref:  Luzzati, V. (1952). Traitement statistique des erreurs
     * dans la determination des structures cristallines. Acta
     * Cryst. 5, 802-810.
     * @return FloatColumn
     */
    public FloatColumn getLuzzatiCoordinateErrorObs() {
        return delegate.getColumn("Luzzati_coordinate_error_obs", DelegatingFloatColumn::new);
    }

    /**
     * The value of the low-resolution cutoff used in constructing the
     * Luzzati plot for reflections treated as a test set during
     * refinement.
     * 
     * Ref:  Luzzati, V. (1952). Traitement statistique des erreurs
     * dans la determination des structures cristallines. Acta
     * Cryst. 5, 802-810.
     * @return FloatColumn
     */
    public FloatColumn getLuzzatiDResLowFree() {
        return delegate.getColumn("Luzzati_d_res_low_free", DelegatingFloatColumn::new);
    }

    /**
     * The value of the low-resolution cutoff used in
     * constructing the Luzzati plot for reflections classified as
     * observed.
     * 
     * Ref:  Luzzati, V. (1952). Traitement statistique des erreurs
     * dans la determination des structures cristallines. Acta
     * Cryst. 5, 802-810.
     * @return FloatColumn
     */
    public FloatColumn getLuzzatiDResLowObs() {
        return delegate.getColumn("Luzzati_d_res_low_obs", DelegatingFloatColumn::new);
    }

    /**
     * The value of sigma~a~ used in constructing the Luzzati plot for
     * the reflections treated as a test set during refinement.
     * Details of the estimation of sigma~a~ can be specified
     * in _refine_analyze.Luzzati_sigma_a_free_details.
     * 
     * Ref:  Luzzati, V. (1952). Traitement statistique des erreurs
     * dans la determination des structures cristallines. Acta
     * Cryst. 5, 802-810.
     * @return FloatColumn
     */
    public FloatColumn getLuzzatiSigmaAFree() {
        return delegate.getColumn("Luzzati_sigma_a_free", DelegatingFloatColumn::new);
    }

    /**
     * Details of the estimation of sigma~a~ for the reflections
     * treated as a test set during refinement.
     * 
     * Ref:  Luzzati, V. (1952). Traitement statistique des erreurs
     * dans la determination des structures cristallines. Acta
     * Cryst. 5, 802-810.
     * @return StrColumn
     */
    public StrColumn getLuzzatiSigmaAFreeDetails() {
        return delegate.getColumn("Luzzati_sigma_a_free_details", DelegatingStrColumn::new);
    }

    /**
     * The value of sigma~a~ used in constructing the Luzzati plot for
     * reflections classified as observed. Details of the
     * estimation of sigma~a~ can be specified in
     * _refine_analyze.Luzzati_sigma_a_obs_details.
     * 
     * Ref:  Luzzati, V. (1952). Traitement statistique des erreurs
     * dans la determination des structures cristallines. Acta
     * Cryst. 5, 802-810.
     * @return FloatColumn
     */
    public FloatColumn getLuzzatiSigmaAObs() {
        return delegate.getColumn("Luzzati_sigma_a_obs", DelegatingFloatColumn::new);
    }

    /**
     * Special aspects of the estimation of sigma~a~ for the
     * reflections classified as observed.
     * 
     * Ref:  Luzzati, V. (1952). Traitement statistique des erreurs
     * dans la determination des structures cristallines. Acta
     * Cryst. 5, 802-810.
     * @return StrColumn
     */
    public StrColumn getLuzzatiSigmaAObsDetails() {
        return delegate.getColumn("Luzzati_sigma_a_obs_details", DelegatingStrColumn::new);
    }

    /**
     * The number of discretely disordered residues in the refined
     * model.
     * @return FloatColumn
     */
    public FloatColumn getNumberDisorderedResidues() {
        return delegate.getColumn("number_disordered_residues", DelegatingFloatColumn::new);
    }

    /**
     * The sum of the occupancies of the hydrogen atoms in the refined
     * model.
     * @return FloatColumn
     */
    public FloatColumn getOccupancySumHydrogen() {
        return delegate.getColumn("occupancy_sum_hydrogen", DelegatingFloatColumn::new);
    }

    /**
     * The sum of the occupancies of the non-hydrogen atoms in the
     * refined model.
     * @return FloatColumn
     */
    public FloatColumn getOccupancySumNonHydrogen() {
        return delegate.getColumn("occupancy_sum_non_hydrogen", DelegatingFloatColumn::new);
    }

    /**
     * The value of the high-resolution cutoff in angstroms
     * used in the calculation of the Hamilton generalized
     * R factor (RG) stored in _refine_analyze.RG_work and
     * _refine_analyze.RG_free.
     * 
     * Ref: Hamilton, W. C. (1965). Acta Cryst. 18, 502-510.
     * @return FloatColumn
     */
    public FloatColumn getRGDResHigh() {
        return delegate.getColumn("RG_d_res_high", DelegatingFloatColumn::new);
    }

    /**
     * The value of the low-resolution cutoff in angstroms
     * used in the calculation of the Hamilton generalized
     * R factor (RG) stored in _refine_analyze.RG_work and
     * _refine_analyze.RG_free.
     * 
     * Ref: Hamilton, W. C. (1965). Acta Cryst. 18, 502-510.
     * @return FloatColumn
     */
    public FloatColumn getRGDResLow() {
        return delegate.getColumn("RG_d_res_low", DelegatingFloatColumn::new);
    }

    /**
     * The Hamilton generalized R factor for all reflections that
     * satisfy the resolution limits established by
     * _refine_analyze.RG_d_res_high and
     * _refine_analyze.RG_d_res_low for the free R set of
     * reflections that were excluded from the refinement.
     * 
     * sum_i sum_j w_{i,j}(|Fobs|_i - G|Fcalc|_i)(|Fobs|_j - G|Fcalc|_j)
     * RG = Sqrt( ----------------------------------------------------------------- )
     * sum_i sum_j w_{i,j} |Fobs|_i |Fobs|_j
     * 
     * where
     * 
     * |Fobs|  = the observed structure-factor amplitudes
     * |Fcalc| = the calculated structure-factor amplitudes
     * G       = the scale factor which puts |Fcalc| on the
     * same scale as |Fobs|
     * w_{i,j} = the weight for the combination of the reflections
     * i and j.
     * 
     * sum_i and sum_j are taken over the specified reflections
     * 
     * When the covariance of the amplitudes of reflection i and
     * reflection j is zero (i.e. the reflections are independent)
     * w{i,i} can be redefined as  w_i and the nested sums collapsed
     * into one sum.
     * 
     * sum_i w_i(|Fobs|_i - G|Fcalc|_i)^2
     * RG = Sqrt( ----------------------------------- )
     * sum_i w_i |Fobs|_i^2
     * 
     * Ref: Hamilton, W. C. (1965). Acta Cryst. 18, 502-510.
     * @return FloatColumn
     */
    public FloatColumn getRGFree() {
        return delegate.getColumn("RG_free", DelegatingFloatColumn::new);
    }

    /**
     * The Hamilton generalized R factor for all reflections
     * that satisfy the resolution limits established by
     * _refine_analyze.RG_d_res_high and
     * _refine_analyze.RG_d_res_low  and for those
     * reflections included in the working set when a free R set
     * of reflections is omitted from the refinement.
     * 
     * sum_i sum_j w_{i,j}(|Fobs|_i - G|Fcalc|_i)(|Fobs|_j - G|Fcalc|_j)
     * RG = Sqrt( ----------------------------------------------------------------- )
     * sum_i sum_j w_{i,j} |Fobs|_i |Fobs|_j
     * 
     * where
     * 
     * |Fobs|  = the observed structure-factor amplitudes
     * |Fcalc| = the calculated structure-factor amplitudes
     * G       = the scale factor which puts |Fcalc| on the
     * same scale as |Fobs|
     * w_{i,j} = the weight for the combination of the reflections
     * i and j.
     * 
     * sum_i and sum_j are taken over the specified reflections
     * 
     * When the covariance of the amplitudes of reflection i and
     * reflection j is zero (i.e. the reflections are independent)
     * w{i,i} can be redefined as w_i and the nested sums collapsed
     * into one sum.
     * 
     * sum_i w_i(|Fobs|_i - G|Fcalc|_i)^2
     * RG = Sqrt( ----------------------------------- )
     * sum_i w_i |Fobs|_i^2
     * 
     * Ref: Hamilton, W. C. (1965). Acta Cryst. 18, 502-510.
     * @return FloatColumn
     */
    public FloatColumn getRGWork() {
        return delegate.getColumn("RG_work", DelegatingFloatColumn::new);
    }

    /**
     * The observed ratio of RGfree to RGwork. The expected RG ratio
     * is the value that should be achievable at the end of a structure
     * refinement when only random uncorrelated errors exist in the data
     * and the model provided that the observations are properly
     * weighted. When compared with the observed RG ratio it may
     * indicate that a structure has not reached convergence or a
     * model has been over-refined with no corresponding improvement
     * in the model.
     * 
     * In an unrestrained refinement, the ratio of RGfree to RGwork with
     * only random uncorrelated errors at convergence depends only
     * on the number of reflections and the number of parameters
     * according to
     * 
     * sqrt[(f + m) / (f - m) ]
     * 
     * where f = the number of included structure amplitudes and
     * target distances, and
     * m = the number of parameters being refined.
     * 
     * In the restrained case, RGfree is calculated from a random
     * selection of residuals including both structure amplitudes
     * and restraints.  When restraints are included in the refinement,
     * the RG ratio requires a term for the contribution to the
     * minimized residual at convergence, D~restr~, due to those
     * restraints:
     * 
     * D~restr~ = r - sum [w_i . (a_i)^t . (H)^-1 a_i]
     * 
     * where
     * 
     * r is the number of geometrical, displacement-parameter and
     * other restraints
     * H is the (m,m) normal matrix given by A^t.W.A
     * W is the (n,n) symmetric weight matrix of the included
     * observations
     * A is the least-squares design matrix of derivatives of
     * order (n,m)
     * a_i is the ith row of A
     * 
     * Then the expected RGratio becomes
     * 
     * sqrt [ (f + (m - r + D~restr~))/ (f - (m - r + D~restr~)) ]
     * 
     * There is no data name for the expected value of RGfree/RGwork yet.
     * 
     * Ref: Tickle, I. J., Laskowski, R. A. &amp; Moss, D. S. (1998).
     * Acta Cryst. D54, 547-557.
     * @return FloatColumn
     */
    public FloatColumn getRGFreeWorkRatio() {
        return delegate.getColumn("RG_free_work_ratio", DelegatingFloatColumn::new);
    }

    /**
     * record the high resolution for calculating Luzzati statistics.
     * @return FloatColumn
     */
    public FloatColumn getPdbxLuzzatiDResHighObs() {
        return delegate.getColumn("pdbx_Luzzati_d_res_high_obs", DelegatingFloatColumn::new);
    }

}