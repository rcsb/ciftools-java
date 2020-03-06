package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_PHASING_MR category record details about
 * molecular replacement.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxPhasingMR extends DelegatingCategory {
    public PdbxPhasingMR(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "entry_id":
                return getEntryId();
            case "method_rotation":
                return getMethodRotation();
            case "d_res_high_rotation":
                return getDResHighRotation();
            case "d_res_low_rotation":
                return getDResLowRotation();
            case "sigma_F_rotation":
                return getSigmaFRotation();
            case "sigma_I_rotation":
                return getSigmaIRotation();
            case "reflns_percent_rotation":
                return getReflnsPercentRotation();
            case "method_translation":
                return getMethodTranslation();
            case "d_res_high_translation":
                return getDResHighTranslation();
            case "d_res_low_translation":
                return getDResLowTranslation();
            case "sigma_F_translation":
                return getSigmaFTranslation();
            case "sigma_I_translation":
                return getSigmaITranslation();
            case "reflns_percent_translation":
                return getReflnsPercentTranslation();
            case "correlation_coeff_Io_to_Ic":
                return getCorrelationCoeffIoToIc();
            case "correlation_coeff_Fo_to_Fc":
                return getCorrelationCoeffFoToFc();
            case "R_factor":
                return getRFactor();
            case "R_rigid_body":
                return getRRigidBody();
            case "packing":
                return getPacking();
            case "model_details":
                return getModelDetails();
            case "native_set_id":
                return getNativeSetId();
            case "d_res_high_fit":
                return getDResHighFit();
            case "d_res_low_fit":
                return getDResLowFit();
            case "zscore_rotation":
                return getZscoreRotation();
            case "LL_gain_rotation":
                return getLLGainRotation();
            case "zscore_translation":
                return getZscoreTranslation();
            case "LL_gain_translation":
                return getLLGainTranslation();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The value of _pdbx_phasing_MR.entry_id identifies the data block.
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return delegate.getColumn("entry_id", DelegatingStrColumn::new);
    }

    /**
     * The value of _pdbx_phasing_MR.method_rotation identifies the method
     * used for rotation search. For example, the rotation method may be
     * realspace,  fastdirect, or direct.
     * .
     * @return StrColumn
     */
    public StrColumn getMethodRotation() {
        return delegate.getColumn("method_rotation", DelegatingStrColumn::new);
    }

    /**
     * The value of _pdbx_phasing_MR.d_res_high_rotation identifies
     * the highest resolution used for rotation search.
     * @return FloatColumn
     */
    public FloatColumn getDResHighRotation() {
        return delegate.getColumn("d_res_high_rotation", DelegatingFloatColumn::new);
    }

    /**
     * The value of _pdbx_phasing_MR.d_res_low_rotation identifies
     * the lowest resolution used for rotation search.
     * @return FloatColumn
     */
    public FloatColumn getDResLowRotation() {
        return delegate.getColumn("d_res_low_rotation", DelegatingFloatColumn::new);
    }

    /**
     * The value of _pdbx_phasing_MR.sigma_F_rotation identifies the
     * sigma cut off of structure factor used for rotation search.
     * @return FloatColumn
     */
    public FloatColumn getSigmaFRotation() {
        return delegate.getColumn("sigma_F_rotation", DelegatingFloatColumn::new);
    }

    /**
     * The value of _pdbx_phasing_MR.sigma_I_rotation identifies the
     * sigma cut off of intensity used for rotation search.
     * @return FloatColumn
     */
    public FloatColumn getSigmaIRotation() {
        return delegate.getColumn("sigma_I_rotation", DelegatingFloatColumn::new);
    }

    /**
     * The value of _pdbx_phasing_MR.reflns_percent_rotation identifies the
     * completness of data used for rotation search.
     * @return FloatColumn
     */
    public FloatColumn getReflnsPercentRotation() {
        return delegate.getColumn("reflns_percent_rotation", DelegatingFloatColumn::new);
    }

    /**
     * The value of _pdbx_phasing_MR.method_translation identifies the method
     * used for translation search. For example in CNS, the translation method
     * may be "general" or "phased" with PC refinement target using
     * "fastf2f2" "e2e2" "e1e1" "f2f2" "f1f1" "residual" "vector".
     * 
     * .
     * @return StrColumn
     */
    public StrColumn getMethodTranslation() {
        return delegate.getColumn("method_translation", DelegatingStrColumn::new);
    }

    /**
     * The value of _pdbx_phasing_MR.d_res_high_translation identifies
     * the highest resolution used for translation search.
     * @return FloatColumn
     */
    public FloatColumn getDResHighTranslation() {
        return delegate.getColumn("d_res_high_translation", DelegatingFloatColumn::new);
    }

    /**
     * The value of _pdbx_phasing_MR.d_res_low_translation identifies
     * the lowest resolution used for translation search.
     * @return FloatColumn
     */
    public FloatColumn getDResLowTranslation() {
        return delegate.getColumn("d_res_low_translation", DelegatingFloatColumn::new);
    }

    /**
     * The value of _pdbx_phasing_MR.sigma_F_translation identifies the
     * sigma cut off of structure factor used for translation search.
     * @return FloatColumn
     */
    public FloatColumn getSigmaFTranslation() {
        return delegate.getColumn("sigma_F_translation", DelegatingFloatColumn::new);
    }

    /**
     * The value of _pdbx_phasing_MR.sigma_I_translation identifies the
     * sigma cut off of intensity used for translation search.
     * @return FloatColumn
     */
    public FloatColumn getSigmaITranslation() {
        return delegate.getColumn("sigma_I_translation", DelegatingFloatColumn::new);
    }

    /**
     * The value of _pdbx_phasing_MR.reflns_percent_translation identifies the
     * completness of data used for translation search.
     * @return FloatColumn
     */
    public FloatColumn getReflnsPercentTranslation() {
        return delegate.getColumn("reflns_percent_translation", DelegatingFloatColumn::new);
    }

    /**
     * The value of _pdbx_phasing_MR.correlation_coeff_Io_to_Ic identifies
     * the correlation between the observed and the calculated intensity
     * (~|F|^2) after rotation and translation.
     * @return FloatColumn
     */
    public FloatColumn getCorrelationCoeffIoToIc() {
        return delegate.getColumn("correlation_coeff_Io_to_Ic", DelegatingFloatColumn::new);
    }

    /**
     * The value of _pdbx_phasing_MR.correlation_coeff_Fo_to_Fc identifies
     * the correlation between the observed and the calculated structure
     * factor after rotation and translation.
     * @return FloatColumn
     */
    public FloatColumn getCorrelationCoeffFoToFc() {
        return delegate.getColumn("correlation_coeff_Fo_to_Fc", DelegatingFloatColumn::new);
    }

    /**
     * The value of _pdbx_phasing_MR.R_factor identifies the R factor
     * (defined as uasual) after rotation and translation.
     * @return FloatColumn
     */
    public FloatColumn getRFactor() {
        return delegate.getColumn("R_factor", DelegatingFloatColumn::new);
    }

    /**
     * The value of _pdbx_phasing_MR.R_rigid_body identifies the R factor
     * for rigid body refinement after rotation and translation.(In general,
     * rigid body refinement has to be carried out after molecular
     * replacement.
     * @return FloatColumn
     */
    public FloatColumn getRRigidBody() {
        return delegate.getColumn("R_rigid_body", DelegatingFloatColumn::new);
    }

    /**
     * The value of _pdbx_phasing_MR.packing identifies the packing of
     * search model in the unit cell. Too many crystallographic contacts
     * may indicate a bad search.
     * @return FloatColumn
     */
    public FloatColumn getPacking() {
        return delegate.getColumn("packing", DelegatingFloatColumn::new);
    }

    /**
     * The value of _pdbx_phasing_MR.model_details records the details of
     * model used. For example, the original model can be truncated by
     * deleting side chains,  doubtful parts, using the monomer if the
     * original model was an oligomer. The search model may be one
     * domain of a large molecule. What is the pdb IDs.
     * @return StrColumn
     */
    public StrColumn getModelDetails() {
        return delegate.getColumn("model_details", DelegatingStrColumn::new);
    }

    /**
     * The data set that was treated as the native in this
     * experiment.
     * 
     * This data item is a pointer to _phasing_set.id in the
     * PHASING_SET category.
     * @return StrColumn
     */
    public StrColumn getNativeSetId() {
        return delegate.getColumn("native_set_id", DelegatingStrColumn::new);
    }

    /**
     * The highest resolution limit used for rigid body
     * refinement after molecular replacement (MR) solution.
     * @return FloatColumn
     */
    public FloatColumn getDResHighFit() {
        return delegate.getColumn("d_res_high_fit", DelegatingFloatColumn::new);
    }

    /**
     * The lowest resolution limit used for rigid body
     * refinement after molecular replacement (MR) solution.
     * @return FloatColumn
     */
    public FloatColumn getDResLowFit() {
        return delegate.getColumn("d_res_low_fit", DelegatingFloatColumn::new);
    }

    /**
     * It is computed by comparing the LLG values from the rotation
     * search with LLG values for a set of random rotations. The mean and
     * the RMS deviation from the mean are computed from the random set,
     * then the Z-score for a search peak is defined as its LLG minus the
     * mean, all divided by the RMS deviation. Read, R.J. (2001). "Pushing
     * the boundaries of molecular replacement with maximum likelihood."
     * Acta Cryst. D57, 1373-1382
     * @return FloatColumn
     */
    public FloatColumn getZscoreRotation() {
        return delegate.getColumn("zscore_rotation", DelegatingFloatColumn::new);
    }

    /**
     * The log-likelihood gain after rotation. Read, R.J. (2001). "Pushing
     * the boundaries of molecular replacement with maximum likelihood."
     * Acta Cryst. D57, 1373-1382
     * @return FloatColumn
     */
    public FloatColumn getLLGainRotation() {
        return delegate.getColumn("LL_gain_rotation", DelegatingFloatColumn::new);
    }

    /**
     * It is computed by comparing the LLG values from the translation
     * search with LLG values for a set of random translations. The mean
     * and the RMS deviation from the mean are computed from the random set,
     * then the Z-score for a search peak is defined as its LLG minus
     * the mean, all divided by the RMS deviation. Read, R.J. (2001). "Pushing
     * the boundaries of molecular replacement with maximum likelihood."
     * Acta Cryst. D57, 1373-1382
     * @return FloatColumn
     */
    public FloatColumn getZscoreTranslation() {
        return delegate.getColumn("zscore_translation", DelegatingFloatColumn::new);
    }

    /**
     * The log-likelihood gain after translation. Read, R.J. (2001). "Pushing
     * the boundaries of molecular replacement with maximum likelihood."
     * Acta Cryst. D57, 1373-1382
     * @return FloatColumn
     */
    public FloatColumn getLLGainTranslation() {
        return delegate.getColumn("LL_gain_translation", DelegatingFloatColumn::new);
    }

}