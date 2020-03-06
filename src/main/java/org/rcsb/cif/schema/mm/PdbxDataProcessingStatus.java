package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_DATA_PROCESSING_STATUS category record
 * data processing instructions for workflow processing tasks.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxDataProcessingStatus extends DelegatingCategory {
    public PdbxDataProcessingStatus(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "task_name":
                return getTaskName();
            case "status":
                return getStatus();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * A data processing workflow task name.
     * @return StrColumn
     */
    public StrColumn getTaskName() {
        return delegate.getColumn("task_name", DelegatingStrColumn::new);
    }

    /**
     * A data processing workflow task status code.
     * @return StrColumn
     */
    public StrColumn getStatus() {
        return delegate.getColumn("status", DelegatingStrColumn::new);
    }

}