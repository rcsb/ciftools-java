package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_BUFFER category
 * record details of the sample buffer.
 */
@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxBuffer extends BaseCategory {
    public PdbxBuffer(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxBuffer(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxBuffer(String name) {
        super(name);
    }

    /**
     * The value of _pdbx_buffer.id must
     * uniquely identify the sample buffer.
     * @return StrColumn
     */
    public StrColumn getId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("id", StrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * The name of each buffer.
     * @return StrColumn
     */
    public StrColumn getName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("name", StrColumn::new) :
                getBinaryColumn("name"));
    }

    /**
     * Any additional details to do with buffer.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }
}
