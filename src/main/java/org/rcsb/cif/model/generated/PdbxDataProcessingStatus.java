package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_DATA_PROCESSING_STATUS category record
 * data processing instructions for workflow processing tasks.
 */
@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxDataProcessingStatus extends BaseCategory {
    public PdbxDataProcessingStatus(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxDataProcessingStatus(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxDataProcessingStatus(String name) {
        super(name);
    }

    /**
     * A data processing workflow task name.
     * @return StrColumn
     */
    public StrColumn getTaskName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("task_name", StrColumn::new) :
                getBinaryColumn("task_name"));
    }

    /**
     * A data processing workflow task status code.
     * @return StrColumn
     */
    public StrColumn getStatus() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("status", StrColumn::new) :
                getBinaryColumn("status"));
    }
}
