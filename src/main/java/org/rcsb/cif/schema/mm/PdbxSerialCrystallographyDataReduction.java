package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_SERIAL_CRYSTALLOGRAPHY_DATA_REDUCTION category record
 * details about data processing that are unique to XFEL experiments.
 * These will compliment data recorded in category pdbx_diffrn_merge_stat.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxSerialCrystallographyDataReduction extends DelegatingCategory {
    public PdbxSerialCrystallographyDataReduction(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "diffrn_id":
                return getDiffrnId();
            case "frames_total":
                return getFramesTotal();
            case "xfel_pulse_events":
                return getXfelPulseEvents();
            case "frame_hits":
                return getFrameHits();
            case "crystal_hits":
                return getCrystalHits();
            case "droplet_hits":
                return getDropletHits();
            case "frames_failed_index":
                return getFramesFailedIndex();
            case "frames_indexed":
                return getFramesIndexed();
            case "lattices_indexed":
                return getLatticesIndexed();
            case "xfel_run_numbers":
                return getXfelRunNumbers();
            case "lattices_merged":
                return getLatticesMerged();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The data item is a pointer to _diffrn.id in the DIFFRN
     * category.
     * @return StrColumn
     */
    public StrColumn getDiffrnId() {
        return delegate.getColumn("diffrn_id", DelegatingStrColumn::new);
    }

    /**
     * The total number of data frames collected for this
     * data set.
     * @return IntColumn
     */
    public IntColumn getFramesTotal() {
        return delegate.getColumn("frames_total", DelegatingIntColumn::new);
    }

    /**
     * For FEL experiments, the number of pulse events in the dataset.
     * @return IntColumn
     */
    public IntColumn getXfelPulseEvents() {
        return delegate.getColumn("xfel_pulse_events", DelegatingIntColumn::new);
    }

    /**
     * For experiments in which samples are provided in a
     * continuous stream, the total number of data frames collected
     * in which the sample was hit.
     * @return IntColumn
     */
    public IntColumn getFrameHits() {
        return delegate.getColumn("frame_hits", DelegatingIntColumn::new);
    }

    /**
     * For experiments in which samples are provided in a
     * continuous stream, the total number of frames collected
     * in which the crystal was hit.
     * @return IntColumn
     */
    public IntColumn getCrystalHits() {
        return delegate.getColumn("crystal_hits", DelegatingIntColumn::new);
    }

    /**
     * For experiments in which samples are provided in a
     * continuous stream, the total number of frames collected
     * in which a droplet was hit.
     * @return IntColumn
     */
    public IntColumn getDropletHits() {
        return delegate.getColumn("droplet_hits", DelegatingIntColumn::new);
    }

    /**
     * For experiments in which samples are provided in a
     * continuous stream, the total number of data frames collected
     * that contained a "hit" but failed to index.
     * @return IntColumn
     */
    public IntColumn getFramesFailedIndex() {
        return delegate.getColumn("frames_failed_index", DelegatingIntColumn::new);
    }

    /**
     * For experiments in which samples are provided in a
     * continuous stream, the total number of data frames collected
     * that were indexed.
     * @return IntColumn
     */
    public IntColumn getFramesIndexed() {
        return delegate.getColumn("frames_indexed", DelegatingIntColumn::new);
    }

    /**
     * For experiments in which samples are provided in a
     * continuous stream, the total number of lattices indexed.
     * @return IntColumn
     */
    public IntColumn getLatticesIndexed() {
        return delegate.getColumn("lattices_indexed", DelegatingIntColumn::new);
    }

    /**
     * For FEL experiments, in which data collection was performed
     * in batches, indicates which subset of the data collected
     * were used in producing this dataset.
     * @return StrColumn
     */
    public StrColumn getXfelRunNumbers() {
        return delegate.getColumn("xfel_run_numbers", DelegatingStrColumn::new);
    }

    /**
     * For experiments in which samples are provided in a
     * continuous stream, the total number of crystal lattices
     * that were merged in the final dataset.  Can be
     * less than frames_indexed depending on filtering during merging or
     * can be more than frames_indexed if there are multiple lattices.
     * per frame.
     * @return IntColumn
     */
    public IntColumn getLatticesMerged() {
        return delegate.getColumn("lattices_merged", DelegatingIntColumn::new);
    }

}