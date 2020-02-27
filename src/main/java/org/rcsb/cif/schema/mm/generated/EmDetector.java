package org.rcsb.cif.schema.mm.generated;

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
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entry_id", StrColumn::new) :
                getBinaryColumn("entry_id"));
    }

    /**
     * The value of _em_detector.id must uniquely identify
     * the detector used for imaging.
     * @return StrColumn
     */
    public StrColumn getId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("id", StrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * Any additional information about the detection system.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * The detector type used for recording images.
     * Usually film or CCD camera.
     * @return StrColumn
     */
    public StrColumn getType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("type", StrColumn::new) :
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
     * @return FloatColumn
     */
    public FloatColumn getDetectiveQuantumEfficiency() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("detective_quantum_efficiency", FloatColumn::new) :
                getBinaryColumn("detective_quantum_efficiency"));
    }

    /**
     * The detector mode used during image recording.
     * @return StrColumn
     */
    public StrColumn getMode() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("mode", StrColumn::new) :
                getBinaryColumn("mode"));
    }
}
