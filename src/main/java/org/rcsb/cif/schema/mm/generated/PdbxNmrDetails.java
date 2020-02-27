package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * 
 * Experimental details of the NMR study that have not been
 * described elsewhere in this deposition.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class PdbxNmrDetails extends BaseCategory {
    public PdbxNmrDetails(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxNmrDetails(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxNmrDetails(String name) {
        super(name);
    }

    /**
     * The entry ID for the structure determination.
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entry_id", StrColumn::new) :
                getBinaryColumn("entry_id"));
    }

    /**
     * Additional details describing the NMR experiment.
     * @return StrColumn
     */
    public StrColumn getText() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("text", StrColumn::new) :
                getBinaryColumn("text"));
    }
}
