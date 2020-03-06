package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_POST_PROCESS_DETAILS record
 * the status of post-processed entries.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxPostProcessStatus extends DelegatingCategory {
    public PdbxPostProcessStatus(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "entry_id":
                return getEntryId();
            case "cycle_id":
                return getCycleId();
            case "date_begin":
                return getDateBegin();
            case "date_end":
                return getDateEnd();
            case "details":
                return getDetails();
            case "annotator":
                return getAnnotator();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The value of _pdbx_post_process_status.entry_id identifies the data block.
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return delegate.getColumn("entry_id", DelegatingStrColumn::new);
    }

    /**
     * Identifier for the current cycle of post-processing.
     * @return StrColumn
     */
    public StrColumn getCycleId() {
        return delegate.getColumn("cycle_id", DelegatingStrColumn::new);
    }

    /**
     * The starting date for the current post-processing cycle.
     * @return StrColumn
     */
    public StrColumn getDateBegin() {
        return delegate.getColumn("date_begin", DelegatingStrColumn::new);
    }

    /**
     * The completion date for the current post-processing cycle.
     * @return StrColumn
     */
    public StrColumn getDateEnd() {
        return delegate.getColumn("date_end", DelegatingStrColumn::new);
    }

    /**
     * A description of the current post-processing cycle.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

    /**
     * The name of the annotator.
     * @return StrColumn
     */
    public StrColumn getAnnotator() {
        return delegate.getColumn("annotator", DelegatingStrColumn::new);
    }

}