package org.rcsb.cif.model.generated.emdetector;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
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
     * @return EntryId
     */
    public EntryId getEntryId() {
        return (EntryId) (isText ? textFields.computeIfAbsent("entry_id",
                EntryId::new) : getBinaryColumn("entry_id"));
    }

    /**
     * The value of _em_detector.id must uniquely identify
     * the detector used for imaging.
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }

    /**
     * Any additional information about the detection system.
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
    }

    /**
     * The detector type used for recording images.
     * Usually film or CCD camera.
     * @return Type
     */
    public Type getType() {
        return (Type) (isText ? textFields.computeIfAbsent("type",
                Type::new) : getBinaryColumn("type"));
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
     * @return DetectiveQuantumEfficiency
     */
    public DetectiveQuantumEfficiency getDetectiveQuantumEfficiency() {
        return (DetectiveQuantumEfficiency) (isText ? textFields.computeIfAbsent("detective_quantum_efficiency",
                DetectiveQuantumEfficiency::new) : getBinaryColumn("detective_quantum_efficiency"));
    }

    /**
     * The detector mode used during image recording.
     * @return Mode
     */
    public Mode getMode() {
        return (Mode) (isText ? textFields.computeIfAbsent("mode",
                Mode::new) : getBinaryColumn("mode"));
    }
}
