package org.rcsb.cif.model.pdbxserialcrystallographydatareduction;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxSerialCrystallographyDataReduction extends BaseCategory {
    public PdbxSerialCrystallographyDataReduction(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxSerialCrystallographyDataReduction(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxSerialCrystallographyDataReduction(String name) {
        super(name);
    }

    /**
     * The data item is a pointer to _diffrn.id in the DIFFRN
     * category.
     * @return DiffrnId
     */
    public DiffrnId getDiffrnId() {
        return (DiffrnId) (isText ? textFields.computeIfAbsent("diffrn_id",
                DiffrnId::new) : getBinaryColumn("diffrn_id"));
    }

    /**
     * The total number of data frames collected for this
     * data set.
     * @return FramesTotal
     */
    public FramesTotal getFramesTotal() {
        return (FramesTotal) (isText ? textFields.computeIfAbsent("frames_total",
                FramesTotal::new) : getBinaryColumn("frames_total"));
    }

    /**
     * For FEL experiments, the number of pulse events in the dataset.
     * @return XfelPulseEvents
     */
    public XfelPulseEvents getXfelPulseEvents() {
        return (XfelPulseEvents) (isText ? textFields.computeIfAbsent("xfel_pulse_events",
                XfelPulseEvents::new) : getBinaryColumn("xfel_pulse_events"));
    }

    /**
     * For experiments in which samples are provided in a
     * continuous stream, the total number of data frames collected
     * in which the sample was hit.
     * @return FrameHits
     */
    public FrameHits getFrameHits() {
        return (FrameHits) (isText ? textFields.computeIfAbsent("frame_hits",
                FrameHits::new) : getBinaryColumn("frame_hits"));
    }

    /**
     * For experiments in which samples are provided in a
     * continuous stream, the total number of frames collected
     * in which the crystal was hit.
     * @return CrystalHits
     */
    public CrystalHits getCrystalHits() {
        return (CrystalHits) (isText ? textFields.computeIfAbsent("crystal_hits",
                CrystalHits::new) : getBinaryColumn("crystal_hits"));
    }

    /**
     * For experiments in which samples are provided in a
     * continuous stream, the total number of frames collected
     * in which a droplet was hit.
     * @return DropletHits
     */
    public DropletHits getDropletHits() {
        return (DropletHits) (isText ? textFields.computeIfAbsent("droplet_hits",
                DropletHits::new) : getBinaryColumn("droplet_hits"));
    }

    /**
     * For experiments in which samples are provided in a
     * continuous stream, the total number of data frames collected
     * that contained a "hit" but failed to index.
     * @return FramesFailedIndex
     */
    public FramesFailedIndex getFramesFailedIndex() {
        return (FramesFailedIndex) (isText ? textFields.computeIfAbsent("frames_failed_index",
                FramesFailedIndex::new) : getBinaryColumn("frames_failed_index"));
    }

    /**
     * For experiments in which samples are provided in a
     * continuous stream, the total number of data frames collected
     * that were indexed.
     * @return FramesIndexed
     */
    public FramesIndexed getFramesIndexed() {
        return (FramesIndexed) (isText ? textFields.computeIfAbsent("frames_indexed",
                FramesIndexed::new) : getBinaryColumn("frames_indexed"));
    }

    /**
     * For experiments in which samples are provided in a
     * continuous stream, the total number of lattices indexed.
     * @return LatticesIndexed
     */
    public LatticesIndexed getLatticesIndexed() {
        return (LatticesIndexed) (isText ? textFields.computeIfAbsent("lattices_indexed",
                LatticesIndexed::new) : getBinaryColumn("lattices_indexed"));
    }

    /**
     * For FEL experiments, in which data collection was performed
     * in batches, indicates which subset of the data collected
     * were used in producing this dataset.
     * @return XfelRunNumbers
     */
    public XfelRunNumbers getXfelRunNumbers() {
        return (XfelRunNumbers) (isText ? textFields.computeIfAbsent("xfel_run_numbers",
                XfelRunNumbers::new) : getBinaryColumn("xfel_run_numbers"));
    }
}
