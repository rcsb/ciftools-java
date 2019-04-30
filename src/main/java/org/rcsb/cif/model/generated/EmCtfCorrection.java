package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Description of the Contrast Transfer Function (CTF) correction
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getAmplitudeCorrection() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("amplitude_correction", SingleRowStrColumn::new) :
                getBinaryColumn("amplitude_correction"));
    }

    /**
     * Amplitude correction factor used in CTF correction
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getAmplitudeCorrectionFactor() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("amplitude_correction_factor", SingleRowFloatColumn::new) :
                getBinaryColumn("amplitude_correction_factor"));
    }

    /**
     * CTF amplitude correction space
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getAmplitudeCorrectionSpace() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("amplitude_correction_space", SingleRowStrColumn::new) :
                getBinaryColumn("amplitude_correction_space"));
    }

    /**
     * CTF correction operation
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getCorrectionOperation() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("correction_operation", SingleRowStrColumn::new) :
                getBinaryColumn("correction_operation"));
    }

    /**
     * Any additional details about CTF correction
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDetails() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("details", SingleRowStrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * Foreign key to the EM_IMAGE_PROCESSING category
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getEmImageProcessingId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("em_image_processing_id", SingleRowStrColumn::new) :
                getBinaryColumn("em_image_processing_id"));
    }

    /**
     * Primary key
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("id", SingleRowStrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * Yes if Phase reversal (flipping) was performed
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getPhaseReversal() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("phase_reversal", SingleRowStrColumn::new) :
                getBinaryColumn("phase_reversal"));
    }

    /**
     * Yes if Anisotropic phase reversal (flipping) was performed
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getPhaseReversalAnisotropic() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("phase_reversal_anisotropic", SingleRowStrColumn::new) :
                getBinaryColumn("phase_reversal_anisotropic"));
    }

    /**
     * CTF phase reversal correction space
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getPhaseReversalCorrectionSpace() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("phase_reversal_correction_space", SingleRowStrColumn::new) :
                getBinaryColumn("phase_reversal_correction_space"));
    }

    /**
     * Type of CTF correction applied
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getType() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("type", SingleRowStrColumn::new) :
                getBinaryColumn("type"));
    }
}
