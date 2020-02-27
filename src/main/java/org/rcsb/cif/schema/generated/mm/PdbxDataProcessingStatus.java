package org.rcsb.cif.schema.generated.mm;

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
