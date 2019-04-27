package org.rcsb.cif.model.pdbxdataprocessingstatus;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

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
     * @return TaskName
     */
    public TaskName getTaskName() {
        return (TaskName) (isText ? textFields.computeIfAbsent("task_name",
                TaskName::new) : getBinaryColumn("task_name"));
    }

    /**
     * A data processing workflow task status code.
     * @return Status
     */
    public Status getStatus() {
        return (Status) (isText ? textFields.computeIfAbsent("status",
                Status::new) : getBinaryColumn("status"));
    }
}
