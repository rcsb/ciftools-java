package org.rcsb.cif.model.emctfcorrection;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class EmCtfCorrection extends BaseCategory {
    public EmCtfCorrection(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public EmCtfCorrection(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public EmCtfCorrection(String name) {
        super(name);
    }

    /**
     * Yes if CTF amplitude correction was performed
     * @return AmplitudeCorrection
     */
    public AmplitudeCorrection getAmplitudeCorrection() {
        return (AmplitudeCorrection) (isText ? textFields.computeIfAbsent("amplitude_correction",
                AmplitudeCorrection::new) : getBinaryColumn("amplitude_correction"));
    }

    /**
     * Amplitude correction factor used in CTF correction
     * @return AmplitudeCorrectionFactor
     */
    public AmplitudeCorrectionFactor getAmplitudeCorrectionFactor() {
        return (AmplitudeCorrectionFactor) (isText ? textFields.computeIfAbsent("amplitude_correction_factor",
                AmplitudeCorrectionFactor::new) : getBinaryColumn("amplitude_correction_factor"));
    }

    /**
     * CTF amplitude correction space
     * @return AmplitudeCorrectionSpace
     */
    public AmplitudeCorrectionSpace getAmplitudeCorrectionSpace() {
        return (AmplitudeCorrectionSpace) (isText ? textFields.computeIfAbsent("amplitude_correction_space",
                AmplitudeCorrectionSpace::new) : getBinaryColumn("amplitude_correction_space"));
    }

    /**
     * CTF correction operation
     * @return CorrectionOperation
     */
    public CorrectionOperation getCorrectionOperation() {
        return (CorrectionOperation) (isText ? textFields.computeIfAbsent("correction_operation",
                CorrectionOperation::new) : getBinaryColumn("correction_operation"));
    }

    /**
     * Any additional details about CTF correction
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
    }

    /**
     * Foreign key to the EM_IMAGE_PROCESSING category
     * @return EmImageProcessingId
     */
    public EmImageProcessingId getEmImageProcessingId() {
        return (EmImageProcessingId) (isText ? textFields.computeIfAbsent("em_image_processing_id",
                EmImageProcessingId::new) : getBinaryColumn("em_image_processing_id"));
    }

    /**
     * Primary key
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }

    /**
     * Yes if Phase reversal (flipping) was performed
     * @return PhaseReversal
     */
    public PhaseReversal getPhaseReversal() {
        return (PhaseReversal) (isText ? textFields.computeIfAbsent("phase_reversal",
                PhaseReversal::new) : getBinaryColumn("phase_reversal"));
    }

    /**
     * Yes if Anisotropic phase reversal (flipping) was performed
     * @return PhaseReversalAnisotropic
     */
    public PhaseReversalAnisotropic getPhaseReversalAnisotropic() {
        return (PhaseReversalAnisotropic) (isText ? textFields.computeIfAbsent("phase_reversal_anisotropic",
                PhaseReversalAnisotropic::new) : getBinaryColumn("phase_reversal_anisotropic"));
    }

    /**
     * CTF phase reversal correction space
     * @return PhaseReversalCorrectionSpace
     */
    public PhaseReversalCorrectionSpace getPhaseReversalCorrectionSpace() {
        return (PhaseReversalCorrectionSpace) (isText ? textFields.computeIfAbsent("phase_reversal_correction_space",
                PhaseReversalCorrectionSpace::new) : getBinaryColumn("phase_reversal_correction_space"));
    }

    /**
     * Type of CTF correction applied
     * @return Type
     */
    public Type getType() {
        return (Type) (isText ? textFields.computeIfAbsent("type",
                Type::new) : getBinaryColumn("type"));
    }
}
