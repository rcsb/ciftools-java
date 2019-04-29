package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_POST_PROCESS_DETAILS identify
 * problems or errors encountered in the post-processing
 * of this entry.
 */
@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxPostProcessDetails extends BaseCategory {
    public PdbxPostProcessDetails(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxPostProcessDetails(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxPostProcessDetails(String name) {
        super(name);
    }

    /**
     * The value of _pdbx_post_process_details.entry_id identifies the data block.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getEntryId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("entry_id", SingleRowStrColumn::new) :
                getBinaryColumn("entry_id"));
    }

    /**
     * The text description of changes required to standardize
     * this entry.   This should include any errors detected
     * or changes in nomenclature.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getText() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("text", SingleRowStrColumn::new) :
                getBinaryColumn("text"));
    }

    /**
     * Details concerning the standardization of the chemical
     * sequence data in this entry.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getSeqDetails() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("seq_details", SingleRowStrColumn::new) :
                getBinaryColumn("seq_details"));
    }
}
