package org.rcsb.cif.model.generated.pdbxnmrsoftwaretask;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxNmrSoftwareTask extends BaseCategory {
    public PdbxNmrSoftwareTask(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxNmrSoftwareTask(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxNmrSoftwareTask(String name) {
        super(name);
    }

    /**
     * 
     * Pointer to '_entry.id'
     * @return EntryId
     */
    public EntryId getEntryId() {
        return (EntryId) (isText ? textFields.computeIfAbsent("entry_id",
                EntryId::new) : getBinaryColumn("entry_id"));
    }

    /**
     * 
     * Pointer to _software.ordinal
     * @return SoftwareOrdinal
     */
    public SoftwareOrdinal getSoftwareOrdinal() {
        return (SoftwareOrdinal) (isText ? textFields.computeIfAbsent("software_ordinal",
                SoftwareOrdinal::new) : getBinaryColumn("software_ordinal"));
    }

    /**
     * 
     * A word or brief phrase that describes the task that a software application
     * was used to carry out.
     * @return Task
     */
    public Task getTask() {
        return (Task) (isText ? textFields.computeIfAbsent("task",
                Task::new) : getBinaryColumn("task"));
    }
}
