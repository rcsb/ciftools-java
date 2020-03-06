package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Items in the pdbx_nmr_software_task category provide information about software workflow in the NMR experiment.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxNmrSoftwareTask extends DelegatingCategory {
    public PdbxNmrSoftwareTask(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "entry_id":
                return getEntryId();
            case "software_ordinal":
                return getSoftwareOrdinal();
            case "task":
                return getTask();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * Pointer to '_entry.id'
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return delegate.getColumn("entry_id", DelegatingStrColumn::new);
    }

    /**
     * Pointer to _software.ordinal
     * @return IntColumn
     */
    public IntColumn getSoftwareOrdinal() {
        return delegate.getColumn("software_ordinal", DelegatingIntColumn::new);
    }

    /**
     * A word or brief phrase that describes the task that a software application
     * was used to carry out.
     * @return StrColumn
     */
    public StrColumn getTask() {
        return delegate.getColumn("task", DelegatingStrColumn::new);
    }

}