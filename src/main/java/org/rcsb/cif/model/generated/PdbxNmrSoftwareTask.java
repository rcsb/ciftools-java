package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * 
 * Items in the pdbx_nmr_software_task category provide information about software workflow in the NMR experiment.
 */
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
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entry_id", StrColumn::new) :
                getBinaryColumn("entry_id"));
    }

    /**
     * 
     * Pointer to _software.ordinal
     * @return IntColumn
     */
    public IntColumn getSoftwareOrdinal() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("software_ordinal", IntColumn::new) :
                getBinaryColumn("software_ordinal"));
    }

    /**
     * 
     * A word or brief phrase that describes the task that a software application
     * was used to carry out.
     * @return StrColumn
     */
    public StrColumn getTask() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("task", StrColumn::new) :
                getBinaryColumn("task"));
    }
}
