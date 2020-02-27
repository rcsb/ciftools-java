package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_POST_PROCESS_DETAILS identify
 * problems or errors encountered in the post-processing
 * of this entry.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entry_id", StrColumn::new) :
                getBinaryColumn("entry_id"));
    }

    /**
     * The text description of changes required to standardize
     * this entry.   This should include any errors detected
     * or changes in nomenclature.
     * @return StrColumn
     */
    public StrColumn getText() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("text", StrColumn::new) :
                getBinaryColumn("text"));
    }

    /**
     * Details concerning the standardization of the chemical
     * sequence data in this entry.
     * @return StrColumn
     */
    public StrColumn getSeqDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("seq_details", StrColumn::new) :
                getBinaryColumn("seq_details"));
    }
}
