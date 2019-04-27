package org.rcsb.cif.model.pdbxpostprocessstatus;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxPostProcessStatus extends BaseCategory {
    public PdbxPostProcessStatus(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxPostProcessStatus(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxPostProcessStatus(String name) {
        super(name);
    }

    /**
     * The value of _pdbx_post_process_status.entry_id identifies the data block.
     * @return EntryId
     */
    public EntryId getEntryId() {
        return (EntryId) (isText ? textFields.computeIfAbsent("entry_id",
                EntryId::new) : getBinaryColumn("entry_id"));
    }

    /**
     * Identifier for the current cycle of post-processing.
     * @return CycleId
     */
    public CycleId getCycleId() {
        return (CycleId) (isText ? textFields.computeIfAbsent("cycle_id",
                CycleId::new) : getBinaryColumn("cycle_id"));
    }

    /**
     * The starting date for the current post-processing cycle.
     * @return DateBegin
     */
    public DateBegin getDateBegin() {
        return (DateBegin) (isText ? textFields.computeIfAbsent("date_begin",
                DateBegin::new) : getBinaryColumn("date_begin"));
    }

    /**
     * The completion date for the current post-processing cycle.
     * @return DateEnd
     */
    public DateEnd getDateEnd() {
        return (DateEnd) (isText ? textFields.computeIfAbsent("date_end",
                DateEnd::new) : getBinaryColumn("date_end"));
    }

    /**
     * A description of the current post-processing cycle.
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
    }

    /**
     * The name of the annotator.
     * @return Annotator
     */
    public Annotator getAnnotator() {
        return (Annotator) (isText ? textFields.computeIfAbsent("annotator",
                Annotator::new) : getBinaryColumn("annotator"));
    }
}
