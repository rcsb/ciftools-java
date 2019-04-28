package org.rcsb.cif.model.generated.pdbxphasingmr;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxPhasingMR extends BaseCategory {
    public PdbxPhasingMR(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxPhasingMR(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxPhasingMR(String name) {
        super(name);
    }

    /**
     * The value of _pdbx_phasing_MR.entry_id identifies the data block.
     * @return EntryId
     */
    public EntryId getEntryId() {
        return (EntryId) (isText ? textFields.computeIfAbsent("entry_id",
                EntryId::new) : getBinaryColumn("entry_id"));
    }

    /**
     * The value of _pdbx_phasing_MR.method_rotation identifies the method
     * used for rotation search. For example, the rotation method may be
     * realspace,  fastdirect, or direct.
     * .
     * @return MethodRotation
     */
    public MethodRotation getMethodRotation() {
        return (MethodRotation) (isText ? textFields.computeIfAbsent("method_rotation",
                MethodRotation::new) : getBinaryColumn("method_rotation"));
    }

    /**
     * The value of _pdbx_phasing_MR.d_res_high_rotation identifies
     * the highest resolution used for rotation search.
     * @return DResHighRotation
     */
    public DResHighRotation getDResHighRotation() {
        return (DResHighRotation) (isText ? textFields.computeIfAbsent("d_res_high_rotation",
                DResHighRotation::new) : getBinaryColumn("d_res_high_rotation"));
    }

    /**
     * The value of _pdbx_phasing_MR.d_res_low_rotation identifies
     * the lowest resolution used for rotation search.
     * @return DResLowRotation
     */
    public DResLowRotation getDResLowRotation() {
        return (DResLowRotation) (isText ? textFields.computeIfAbsent("d_res_low_rotation",
                DResLowRotation::new) : getBinaryColumn("d_res_low_rotation"));
    }

    /**
     * The value of _pdbx_phasing_MR.sigma_F_rotation identifies the
     * sigma cut off of structure factor used for rotation search.
     * @return SigmaFRotation
     */
    public SigmaFRotation getSigmaFRotation() {
        return (SigmaFRotation) (isText ? textFields.computeIfAbsent("sigma_F_rotation",
                SigmaFRotation::new) : getBinaryColumn("sigma_F_rotation"));
    }

    /**
     * The value of _pdbx_phasing_MR.sigma_I_rotation identifies the
     * sigma cut off of intensity used for rotation search.
     * @return SigmaIRotation
     */
    public SigmaIRotation getSigmaIRotation() {
        return (SigmaIRotation) (isText ? textFields.computeIfAbsent("sigma_I_rotation",
                SigmaIRotation::new) : getBinaryColumn("sigma_I_rotation"));
    }

    /**
     * The value of _pdbx_phasing_MR.reflns_percent_rotation identifies the
     * completness of data used for rotation search.
     * @return ReflnsPercentRotation
     */
    public ReflnsPercentRotation getReflnsPercentRotation() {
        return (ReflnsPercentRotation) (isText ? textFields.computeIfAbsent("reflns_percent_rotation",
                ReflnsPercentRotation::new) : getBinaryColumn("reflns_percent_rotation"));
    }

    /**
     * The value of _pdbx_phasing_MR.method_translation identifies the method
     * used for translation search. For example in CNS, the translation method
     * may be "general" or "phased" with PC refinement target using
     * "fastf2f2" "e2e2" "e1e1" "f2f2" "f1f1" "residual" "vector".
     * 
     * .
     * @return MethodTranslation
     */
    public MethodTranslation getMethodTranslation() {
        return (MethodTranslation) (isText ? textFields.computeIfAbsent("method_translation",
                MethodTranslation::new) : getBinaryColumn("method_translation"));
    }

    /**
     * The value of _pdbx_phasing_MR.d_res_high_translation identifies
     * the highest resolution used for translation search.
     * @return DResHighTranslation
     */
    public DResHighTranslation getDResHighTranslation() {
        return (DResHighTranslation) (isText ? textFields.computeIfAbsent("d_res_high_translation",
                DResHighTranslation::new) : getBinaryColumn("d_res_high_translation"));
    }

    /**
     * The value of _pdbx_phasing_MR.d_res_low_translation identifies
     * the lowest resolution used for translation search.
     * @return DResLowTranslation
     */
    public DResLowTranslation getDResLowTranslation() {
        return (DResLowTranslation) (isText ? textFields.computeIfAbsent("d_res_low_translation",
                DResLowTranslation::new) : getBinaryColumn("d_res_low_translation"));
    }

    /**
     * The value of _pdbx_phasing_MR.sigma_F_translation identifies the
     * sigma cut off of structure factor used for translation search.
     * @return SigmaFTranslation
     */
    public SigmaFTranslation getSigmaFTranslation() {
        return (SigmaFTranslation) (isText ? textFields.computeIfAbsent("sigma_F_translation",
                SigmaFTranslation::new) : getBinaryColumn("sigma_F_translation"));
    }

    /**
     * The value of _pdbx_phasing_MR.sigma_I_translation identifies the
     * sigma cut off of intensity used for translation search.
     * @return SigmaITranslation
     */
    public SigmaITranslation getSigmaITranslation() {
        return (SigmaITranslation) (isText ? textFields.computeIfAbsent("sigma_I_translation",
                SigmaITranslation::new) : getBinaryColumn("sigma_I_translation"));
    }

    /**
     * The value of _pdbx_phasing_MR.reflns_percent_translation identifies the
     * completness of data used for translation search.
     * @return ReflnsPercentTranslation
     */
    public ReflnsPercentTranslation getReflnsPercentTranslation() {
        return (ReflnsPercentTranslation) (isText ? textFields.computeIfAbsent("reflns_percent_translation",
                ReflnsPercentTranslation::new) : getBinaryColumn("reflns_percent_translation"));
    }

    /**
     * The value of _pdbx_phasing_MR.correlation_coeff_Io_to_Ic identifies
     * the correlation between the observed and the calculated intensity
     * (~|F|^2) after rotation and translation.
     * @return CorrelationCoeffIoToIc
     */
    public CorrelationCoeffIoToIc getCorrelationCoeffIoToIc() {
        return (CorrelationCoeffIoToIc) (isText ? textFields.computeIfAbsent("correlation_coeff_Io_to_Ic",
                CorrelationCoeffIoToIc::new) : getBinaryColumn("correlation_coeff_Io_to_Ic"));
    }

    /**
     * The value of _pdbx_phasing_MR.correlation_coeff_Fo_to_Fc identifies
     * the correlation between the observed and the calculated structure
     * factor after rotation and translation.
     * @return CorrelationCoeffFoToFc
     */
    public CorrelationCoeffFoToFc getCorrelationCoeffFoToFc() {
        return (CorrelationCoeffFoToFc) (isText ? textFields.computeIfAbsent("correlation_coeff_Fo_to_Fc",
                CorrelationCoeffFoToFc::new) : getBinaryColumn("correlation_coeff_Fo_to_Fc"));
    }

    /**
     * The value of _pdbx_phasing_MR.R_factor identifies the R factor
     * (defined as uasual) after rotation and translation.
     * @return RFactor
     */
    public RFactor getRFactor() {
        return (RFactor) (isText ? textFields.computeIfAbsent("R_factor",
                RFactor::new) : getBinaryColumn("R_factor"));
    }

    /**
     * The value of _pdbx_phasing_MR.R_rigid_body identifies the R factor
     * for rigid body refinement after rotation and translation.(In general,
     * rigid body refinement has to be carried out after molecular
     * replacement.
     * @return RRigidBody
     */
    public RRigidBody getRRigidBody() {
        return (RRigidBody) (isText ? textFields.computeIfAbsent("R_rigid_body",
                RRigidBody::new) : getBinaryColumn("R_rigid_body"));
    }

    /**
     * The value of _pdbx_phasing_MR.packing identifies the packing of
     * search model in the unit cell. Too many crystallographic contacts
     * may indicate a bad search.
     * @return Packing
     */
    public Packing getPacking() {
        return (Packing) (isText ? textFields.computeIfAbsent("packing",
                Packing::new) : getBinaryColumn("packing"));
    }

    /**
     * The value of _pdbx_phasing_MR.model_details records the details of
     * model used. For example, the original model can be truncated by
     * deleting side chains,  doubtful parts, using the monomer if the
     * original model was an oligomer. The search model may be one
     * domain of a large molecule. What is the pdb IDs.
     * @return ModelDetails
     */
    public ModelDetails getModelDetails() {
        return (ModelDetails) (isText ? textFields.computeIfAbsent("model_details",
                ModelDetails::new) : getBinaryColumn("model_details"));
    }

    /**
     * The data set that was treated as the native in this
     * experiment.
     * 
     * This data item is a pointer to _phasing_set.id in the
     * PHASING_SET category.
     * @return NativeSetId
     */
    public NativeSetId getNativeSetId() {
        return (NativeSetId) (isText ? textFields.computeIfAbsent("native_set_id",
                NativeSetId::new) : getBinaryColumn("native_set_id"));
    }

    /**
     * The highest resolution limit used for rigid body
     * refinement after molecular replacement (MR) solution.
     * @return DResHighFit
     */
    public DResHighFit getDResHighFit() {
        return (DResHighFit) (isText ? textFields.computeIfAbsent("d_res_high_fit",
                DResHighFit::new) : getBinaryColumn("d_res_high_fit"));
    }

    /**
     * The lowest resolution limit used for rigid body
     * refinement after molecular replacement (MR) solution.
     * @return DResLowFit
     */
    public DResLowFit getDResLowFit() {
        return (DResLowFit) (isText ? textFields.computeIfAbsent("d_res_low_fit",
                DResLowFit::new) : getBinaryColumn("d_res_low_fit"));
    }

    /**
     * It is computed by comparing the LLG values from the rotation
     * search with LLG values for a set of random rotations. The mean and
     * the RMS deviation from the mean are computed from the random set,
     * then the Z-score for a search peak is defined as its LLG minus the
     * mean, all divided by the RMS deviation. Read, R.J. (2001). "Pushing
     * the boundaries of molecular replacement with maximum likelihood."
     * Acta Cryst. D57, 1373-1382
     * @return ZscoreRotation
     */
    public ZscoreRotation getZscoreRotation() {
        return (ZscoreRotation) (isText ? textFields.computeIfAbsent("zscore_rotation",
                ZscoreRotation::new) : getBinaryColumn("zscore_rotation"));
    }

    /**
     * The log-likelihood gain after rotation. Read, R.J. (2001). "Pushing
     * the boundaries of molecular replacement with maximum likelihood."
     * Acta Cryst. D57, 1373-1382
     * @return LLGainRotation
     */
    public LLGainRotation getLLGainRotation() {
        return (LLGainRotation) (isText ? textFields.computeIfAbsent("LL_gain_rotation",
                LLGainRotation::new) : getBinaryColumn("LL_gain_rotation"));
    }

    /**
     * It is computed by comparing the LLG values from the translation
     * search with LLG values for a set of random translations. The mean
     * and the RMS deviation from the mean are computed from the random set,
     * then the Z-score for a search peak is defined as its LLG minus
     * the mean, all divided by the RMS deviation. Read, R.J. (2001). "Pushing
     * the boundaries of molecular replacement with maximum likelihood."
     * Acta Cryst. D57, 1373-1382
     * @return ZscoreTranslation
     */
    public ZscoreTranslation getZscoreTranslation() {
        return (ZscoreTranslation) (isText ? textFields.computeIfAbsent("zscore_translation",
                ZscoreTranslation::new) : getBinaryColumn("zscore_translation"));
    }

    /**
     * The log-likelihood gain after translation. Read, R.J. (2001). "Pushing
     * the boundaries of molecular replacement with maximum likelihood."
     * Acta Cryst. D57, 1373-1382
     * @return LLGainTranslation
     */
    public LLGainTranslation getLLGainTranslation() {
        return (LLGainTranslation) (isText ? textFields.computeIfAbsent("LL_gain_translation",
                LLGainTranslation::new) : getBinaryColumn("LL_gain_translation"));
    }
}
