package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the EM_DETECTOR category record details
 * of the image detector type.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class EmDetector extends BaseCategory {
    public EmDetector(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public EmDetector(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public EmDetector(String name) {
        super(name);
    }

    /**
     * This data item is a pointer to _entry.id in the ENTRY category.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getEntryId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("entry_id", SingleRowStrColumn::new) :
                getBinaryColumn("entry_id"));
    }

    /**
     * The value of _em_detector.id must uniquely identify
     * the detector used for imaging.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("id", SingleRowStrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * Any additional information about the detection system.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDetails() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("details", SingleRowStrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * The detector type used for recording images.
     * Usually film or CCD camera.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getType() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("type", SingleRowStrColumn::new) :
                getBinaryColumn("type"));
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
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getDetectiveQuantumEfficiency() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("detective_quantum_efficiency", SingleRowFloatColumn::new) :
                getBinaryColumn("detective_quantum_efficiency"));
    }

    /**
     * The detector mode used during image recording.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getMode() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("mode", SingleRowStrColumn::new) :
                getBinaryColumn("mode"));
    }
}
