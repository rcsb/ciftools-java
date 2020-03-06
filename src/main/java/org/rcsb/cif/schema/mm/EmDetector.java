package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the EM_DETECTOR category record details
 * of the image detector type.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class EmDetector extends DelegatingCategory {
    public EmDetector(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "entry_id":
                return getEntryId();
            case "id":
                return getId();
            case "details":
                return getDetails();
            case "type":
                return getType();
            case "detective_quantum_efficiency":
                return getDetectiveQuantumEfficiency();
            case "mode":
                return getMode();
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
     * The value of _em_detector.id must uniquely identify
     * the detector used for imaging.
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * Any additional information about the detection system.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

    /**
     * The detector type used for recording images.
     * Usually film or CCD camera.
     * @return StrColumn
     */
    public StrColumn getType() {
        return delegate.getColumn("type", DelegatingStrColumn::new);
    }

    /**
     * The detective_quantum_efficiency (DQE)is defined as the
     * square of the signal-to-noise ratio in the recording device
     * divided by the square of the signal-to-ratio in the electron beam:
     * (SIGNAL/NOISE)2 recording device
     * DQE =    -------------------------------
     * (SIGNAL/NOISE)2 electron beam
     * A DQE value of 1 indicates a perfect recorder. "DQE = 0.25" menas
     * that the signal-to-noise ratio is reduced by half in the
     * recording step.
     * (0.5)**2
     * DQE = --------- = 0.25.
     * (1.0)**2
     * @return FloatColumn
     */
    public FloatColumn getDetectiveQuantumEfficiency() {
        return delegate.getColumn("detective_quantum_efficiency", DelegatingFloatColumn::new);
    }

    /**
     * The detector mode used during image recording.
     * @return StrColumn
     */
    public StrColumn getMode() {
        return delegate.getColumn("mode", DelegatingStrColumn::new);
    }

}