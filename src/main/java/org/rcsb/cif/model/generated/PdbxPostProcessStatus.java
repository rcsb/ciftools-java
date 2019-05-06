package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_POST_PROCESS_DETAILS record
 * the status of post-processed entries.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entry_id", StrColumn::new) :
                getBinaryColumn("entry_id"));
    }

    /**
     * Identifier for the current cycle of post-processing.
     * @return StrColumn
     */
    public StrColumn getCycleId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("cycle_id", StrColumn::new) :
                getBinaryColumn("cycle_id"));
    }

    /**
     * The starting date for the current post-processing cycle.
     * @return StrColumn
     */
    public StrColumn getDateBegin() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("date_begin", StrColumn::new) :
                getBinaryColumn("date_begin"));
    }

    /**
     * The completion date for the current post-processing cycle.
     * @return StrColumn
     */
    public StrColumn getDateEnd() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("date_end", StrColumn::new) :
                getBinaryColumn("date_end"));
    }

    /**
     * A description of the current post-processing cycle.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * The name of the annotator.
     * @return StrColumn
     */
    public StrColumn getAnnotator() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("annotator", StrColumn::new) :
                getBinaryColumn("annotator"));
    }
}
