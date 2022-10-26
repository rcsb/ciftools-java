package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Description of the Contrast Transfer Function (CTF) correction
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class EmCtfCorrection extends DelegatingCategory {
    public EmCtfCorrection(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "amplitude_correction":
                return getAmplitudeCorrection();
            case "amplitude_correction_factor":
                return getAmplitudeCorrectionFactor();
            case "amplitude_correction_space":
                return getAmplitudeCorrectionSpace();
            case "correction_operation":
                return getCorrectionOperation();
            case "details":
                return getDetails();
            case "em_image_processing_id":
                return getEmImageProcessingId();
            case "id":
                return getId();
            case "phase_reversal":
                return getPhaseReversal();
            case "phase_reversal_anisotropic":
                return getPhaseReversalAnisotropic();
            case "phase_reversal_correction_space":
                return getPhaseReversalCorrectionSpace();
            case "type":
                return getType();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * Yes if CTF amplitude correction was performed
     * @return StrColumn
     */
    public StrColumn getAmplitudeCorrection() {
        return delegate.getColumn("amplitude_correction", DelegatingStrColumn::new);
    }

    /**
     * Amplitude correction factor used in CTF correction
     * @return FloatColumn
     */
    public FloatColumn getAmplitudeCorrectionFactor() {
        return delegate.getColumn("amplitude_correction_factor", DelegatingFloatColumn::new);
    }

    /**
     * CTF amplitude correction space
     * @return StrColumn
     */
    public StrColumn getAmplitudeCorrectionSpace() {
        return delegate.getColumn("amplitude_correction_space", DelegatingStrColumn::new);
    }

    /**
     * CTF correction operation
     * @return StrColumn
     */
    public StrColumn getCorrectionOperation() {
        return delegate.getColumn("correction_operation", DelegatingStrColumn::new);
    }

    /**
     * Any additional details about CTF correction
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

    /**
     * Foreign key to the EM_IMAGE_PROCESSING category
     * @return StrColumn
     */
    public StrColumn getEmImageProcessingId() {
        return delegate.getColumn("em_image_processing_id", DelegatingStrColumn::new);
    }

    /**
     * PRIMARY KEY
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * Yes if Phase reversal (flipping) was performed
     * @return StrColumn
     */
    public StrColumn getPhaseReversal() {
        return delegate.getColumn("phase_reversal", DelegatingStrColumn::new);
    }

    /**
     * Yes if Anisotropic phase reversal (flipping) was performed
     * @return StrColumn
     */
    public StrColumn getPhaseReversalAnisotropic() {
        return delegate.getColumn("phase_reversal_anisotropic", DelegatingStrColumn::new);
    }

    /**
     * CTF phase reversal correction space
     * @return StrColumn
     */
    public StrColumn getPhaseReversalCorrectionSpace() {
        return delegate.getColumn("phase_reversal_correction_space", DelegatingStrColumn::new);
    }

    /**
     * Type of CTF correction applied
     * @return StrColumn
     */
    public StrColumn getType() {
        return delegate.getColumn("type", DelegatingStrColumn::new);
    }

}