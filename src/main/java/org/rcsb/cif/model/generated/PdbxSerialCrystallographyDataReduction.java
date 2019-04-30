package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_SERIAL_CRYSTALLOGRAPHY_DATA_REDUCTION category record
 * details about data processing that are unique to XFEL experiments.
 * These will compliment data recorded in category pdbx_diffrn_merge_stat.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDiffrnId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("diffrn_id", SingleRowStrColumn::new) :
                getBinaryColumn("diffrn_id"));
    }

    /**
     * The total number of data frames collected for this
     * data set.
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getFramesTotal() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("frames_total", SingleRowIntColumn::new) :
                getBinaryColumn("frames_total"));
    }

    /**
     * For FEL experiments, the number of pulse events in the dataset.
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getXfelPulseEvents() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("xfel_pulse_events", SingleRowIntColumn::new) :
                getBinaryColumn("xfel_pulse_events"));
    }

    /**
     * For experiments in which samples are provided in a
     * continuous stream, the total number of data frames collected
     * in which the sample was hit.
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getFrameHits() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("frame_hits", SingleRowIntColumn::new) :
                getBinaryColumn("frame_hits"));
    }

    /**
     * For experiments in which samples are provided in a
     * continuous stream, the total number of frames collected
     * in which the crystal was hit.
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getCrystalHits() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("crystal_hits", SingleRowIntColumn::new) :
                getBinaryColumn("crystal_hits"));
    }

    /**
     * For experiments in which samples are provided in a
     * continuous stream, the total number of frames collected
     * in which a droplet was hit.
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getDropletHits() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("droplet_hits", SingleRowIntColumn::new) :
                getBinaryColumn("droplet_hits"));
    }

    /**
     * For experiments in which samples are provided in a
     * continuous stream, the total number of data frames collected
     * that contained a "hit" but failed to index.
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getFramesFailedIndex() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("frames_failed_index", SingleRowIntColumn::new) :
                getBinaryColumn("frames_failed_index"));
    }

    /**
     * For experiments in which samples are provided in a
     * continuous stream, the total number of data frames collected
     * that were indexed.
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getFramesIndexed() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("frames_indexed", SingleRowIntColumn::new) :
                getBinaryColumn("frames_indexed"));
    }

    /**
     * For experiments in which samples are provided in a
     * continuous stream, the total number of lattices indexed.
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getLatticesIndexed() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("lattices_indexed", SingleRowIntColumn::new) :
                getBinaryColumn("lattices_indexed"));
    }

    /**
     * For FEL experiments, in which data collection was performed
     * in batches, indicates which subset of the data collected
     * were used in producing this dataset.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getXfelRunNumbers() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("xfel_run_numbers", SingleRowStrColumn::new) :
                getBinaryColumn("xfel_run_numbers"));
    }
}
