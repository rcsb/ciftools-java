package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_POST_PROCESS_DETAILS record
 * the status of post-processed entries.
 */
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
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getEntryId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("entry_id", SingleRowStrColumn::new) :
                getBinaryColumn("entry_id"));
    }

    /**
     * Identifier for the current cycle of post-processing.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getCycleId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("cycle_id", SingleRowStrColumn::new) :
                getBinaryColumn("cycle_id"));
    }

    /**
     * The starting date for the current post-processing cycle.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDateBegin() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("date_begin", SingleRowStrColumn::new) :
                getBinaryColumn("date_begin"));
    }

    /**
     * The completion date for the current post-processing cycle.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDateEnd() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("date_end", SingleRowStrColumn::new) :
                getBinaryColumn("date_end"));
    }

    /**
     * A description of the current post-processing cycle.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDetails() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("details", SingleRowStrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * The name of the annotator.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getAnnotator() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("annotator", SingleRowStrColumn::new) :
                getBinaryColumn("annotator"));
    }
}
