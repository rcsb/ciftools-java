package org.rcsb.cif.schema.mm.generated;

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
     * @return StrColumn
     */
    public StrColumn getAmplitudeCorrection() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("amplitude_correction", StrColumn::new) :
                getBinaryColumn("amplitude_correction"));
    }

    /**
     * Amplitude correction factor used in CTF correction
     * @return FloatColumn
     */
    public FloatColumn getAmplitudeCorrectionFactor() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("amplitude_correction_factor", FloatColumn::new) :
                getBinaryColumn("amplitude_correction_factor"));
    }

    /**
     * CTF amplitude correction space
     * @return StrColumn
     */
    public StrColumn getAmplitudeCorrectionSpace() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("amplitude_correction_space", StrColumn::new) :
                getBinaryColumn("amplitude_correction_space"));
    }

    /**
     * CTF correction operation
     * @return StrColumn
     */
    public StrColumn getCorrectionOperation() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("correction_operation", StrColumn::new) :
                getBinaryColumn("correction_operation"));
    }

    /**
     * Any additional details about CTF correction
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * Foreign key to the EM_IMAGE_PROCESSING category
     * @return StrColumn
     */
    public StrColumn getEmImageProcessingId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("em_image_processing_id", StrColumn::new) :
                getBinaryColumn("em_image_processing_id"));
    }

    /**
     * Primary key
     * @return StrColumn
     */
    public StrColumn getId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("id", StrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * Yes if Phase reversal (flipping) was performed
     * @return StrColumn
     */
    public StrColumn getPhaseReversal() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("phase_reversal", StrColumn::new) :
                getBinaryColumn("phase_reversal"));
    }

    /**
     * Yes if Anisotropic phase reversal (flipping) was performed
     * @return StrColumn
     */
    public StrColumn getPhaseReversalAnisotropic() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("phase_reversal_anisotropic", StrColumn::new) :
                getBinaryColumn("phase_reversal_anisotropic"));
    }

    /**
     * CTF phase reversal correction space
     * @return StrColumn
     */
    public StrColumn getPhaseReversalCorrectionSpace() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("phase_reversal_correction_space", StrColumn::new) :
                getBinaryColumn("phase_reversal_correction_space"));
    }

    /**
     * Type of CTF correction applied
     * @return StrColumn
     */
    public StrColumn getType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("type", StrColumn::new) :
                getBinaryColumn("type"));
    }
}
