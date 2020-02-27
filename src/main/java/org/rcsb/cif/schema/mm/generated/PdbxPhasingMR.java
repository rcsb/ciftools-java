package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_PHASING_MR category record details about
 * molecular replacement.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entry_id", StrColumn::new) :
                getBinaryColumn("entry_id"));
    }

    /**
     * The value of _pdbx_phasing_MR.method_rotation identifies the method
     * used for rotation search. For example, the rotation method may be
     * realspace,  fastdirect, or direct.
     * .
     * @return StrColumn
     */
    public StrColumn getMethodRotation() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("method_rotation", StrColumn::new) :
                getBinaryColumn("method_rotation"));
    }

    /**
     * The value of _pdbx_phasing_MR.d_res_high_rotation identifies
     * the highest resolution used for rotation search.
     * @return FloatColumn
     */
    public FloatColumn getDResHighRotation() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("d_res_high_rotation", FloatColumn::new) :
                getBinaryColumn("d_res_high_rotation"));
    }

    /**
     * The value of _pdbx_phasing_MR.d_res_low_rotation identifies
     * the lowest resolution used for rotation search.
     * @return FloatColumn
     */
    public FloatColumn getDResLowRotation() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("d_res_low_rotation", FloatColumn::new) :
                getBinaryColumn("d_res_low_rotation"));
    }

    /**
     * The value of _pdbx_phasing_MR.sigma_F_rotation identifies the
     * sigma cut off of structure factor used for rotation search.
     * @return FloatColumn
     */
    public FloatColumn getSigmaFRotation() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("sigma_F_rotation", FloatColumn::new) :
                getBinaryColumn("sigma_F_rotation"));
    }

    /**
     * The value of _pdbx_phasing_MR.sigma_I_rotation identifies the
     * sigma cut off of intensity used for rotation search.
     * @return FloatColumn
     */
    public FloatColumn getSigmaIRotation() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("sigma_I_rotation", FloatColumn::new) :
                getBinaryColumn("sigma_I_rotation"));
    }

    /**
     * The value of _pdbx_phasing_MR.reflns_percent_rotation identifies the
     * completness of data used for rotation search.
     * @return FloatColumn
     */
    public FloatColumn getReflnsPercentRotation() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("reflns_percent_rotation", FloatColumn::new) :
                getBinaryColumn("reflns_percent_rotation"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("method_translation", StrColumn::new) :
                getBinaryColumn("method_translation"));
    }

    /**
     * The value of _pdbx_phasing_MR.d_res_high_translation identifies
     * the highest resolution used for translation search.
     * @return FloatColumn
     */
    public FloatColumn getDResHighTranslation() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("d_res_high_translation", FloatColumn::new) :
                getBinaryColumn("d_res_high_translation"));
    }

    /**
     * The value of _pdbx_phasing_MR.d_res_low_translation identifies
     * the lowest resolution used for translation search.
     * @return FloatColumn
     */
    public FloatColumn getDResLowTranslation() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("d_res_low_translation", FloatColumn::new) :
                getBinaryColumn("d_res_low_translation"));
    }

    /**
     * The value of _pdbx_phasing_MR.sigma_F_translation identifies the
     * sigma cut off of structure factor used for translation search.
     * @return FloatColumn
     */
    public FloatColumn getSigmaFTranslation() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("sigma_F_translation", FloatColumn::new) :
                getBinaryColumn("sigma_F_translation"));
    }

    /**
     * The value of _pdbx_phasing_MR.sigma_I_translation identifies the
     * sigma cut off of intensity used for translation search.
     * @return FloatColumn
     */
    public FloatColumn getSigmaITranslation() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("sigma_I_translation", FloatColumn::new) :
                getBinaryColumn("sigma_I_translation"));
    }

    /**
     * The value of _pdbx_phasing_MR.reflns_percent_translation identifies the
     * completness of data used for translation search.
     * @return FloatColumn
     */
    public FloatColumn getReflnsPercentTranslation() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("reflns_percent_translation", FloatColumn::new) :
                getBinaryColumn("reflns_percent_translation"));
    }

    /**
     * The value of _pdbx_phasing_MR.correlation_coeff_Io_to_Ic identifies
     * the correlation between the observed and the calculated intensity
     * (~|F|^2) after rotation and translation.
     * @return FloatColumn
     */
    public FloatColumn getCorrelationCoeffIoToIc() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("correlation_coeff_Io_to_Ic", FloatColumn::new) :
                getBinaryColumn("correlation_coeff_Io_to_Ic"));
    }

    /**
     * The value of _pdbx_phasing_MR.correlation_coeff_Fo_to_Fc identifies
     * the correlation between the observed and the calculated structure
     * factor after rotation and translation.
     * @return FloatColumn
     */
    public FloatColumn getCorrelationCoeffFoToFc() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("correlation_coeff_Fo_to_Fc", FloatColumn::new) :
                getBinaryColumn("correlation_coeff_Fo_to_Fc"));
    }

    /**
     * The value of _pdbx_phasing_MR.R_factor identifies the R factor
     * (defined as uasual) after rotation and translation.
     * @return FloatColumn
     */
    public FloatColumn getRFactor() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("R_factor", FloatColumn::new) :
                getBinaryColumn("R_factor"));
    }

    /**
     * The value of _pdbx_phasing_MR.R_rigid_body identifies the R factor
     * for rigid body refinement after rotation and translation.(In general,
     * rigid body refinement has to be carried out after molecular
     * replacement.
     * @return FloatColumn
     */
    public FloatColumn getRRigidBody() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("R_rigid_body", FloatColumn::new) :
                getBinaryColumn("R_rigid_body"));
    }

    /**
     * The value of _pdbx_phasing_MR.packing identifies the packing of
     * search model in the unit cell. Too many crystallographic contacts
     * may indicate a bad search.
     * @return FloatColumn
     */
    public FloatColumn getPacking() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("packing", FloatColumn::new) :
                getBinaryColumn("packing"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("model_details", StrColumn::new) :
                getBinaryColumn("model_details"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("native_set_id", StrColumn::new) :
                getBinaryColumn("native_set_id"));
    }

    /**
     * The highest resolution limit used for rigid body
     * refinement after molecular replacement (MR) solution.
     * @return FloatColumn
     */
    public FloatColumn getDResHighFit() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("d_res_high_fit", FloatColumn::new) :
                getBinaryColumn("d_res_high_fit"));
    }

    /**
     * The lowest resolution limit used for rigid body
     * refinement after molecular replacement (MR) solution.
     * @return FloatColumn
     */
    public FloatColumn getDResLowFit() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("d_res_low_fit", FloatColumn::new) :
                getBinaryColumn("d_res_low_fit"));
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
        return (FloatColumn) (isText ? textFields.computeIfAbsent("zscore_rotation", FloatColumn::new) :
                getBinaryColumn("zscore_rotation"));
    }

    /**
     * The log-likelihood gain after rotation. Read, R.J. (2001). "Pushing
     * the boundaries of molecular replacement with maximum likelihood."
     * Acta Cryst. D57, 1373-1382
     * @return FloatColumn
     */
    public FloatColumn getLLGainRotation() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("LL_gain_rotation", FloatColumn::new) :
                getBinaryColumn("LL_gain_rotation"));
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
        return (FloatColumn) (isText ? textFields.computeIfAbsent("zscore_translation", FloatColumn::new) :
                getBinaryColumn("zscore_translation"));
    }

    /**
     * The log-likelihood gain after translation. Read, R.J. (2001). "Pushing
     * the boundaries of molecular replacement with maximum likelihood."
     * Acta Cryst. D57, 1373-1382
     * @return FloatColumn
     */
    public FloatColumn getLLGainTranslation() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("LL_gain_translation", FloatColumn::new) :
                getBinaryColumn("LL_gain_translation"));
    }
}
