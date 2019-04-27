package org.rcsb.cif.model.pdbxbuffer;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

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
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }

    /**
     * The name of each buffer.
     * @return Name
     */
    public Name getName() {
        return (Name) (isText ? textFields.computeIfAbsent("name",
                Name::new) : getBinaryColumn("name"));
    }

    /**
     * Any additional details to do with buffer.
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
    }
}
