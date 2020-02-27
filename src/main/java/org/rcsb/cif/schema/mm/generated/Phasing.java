package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PHASING category record details about the
 * phasing of the structure, listing the various methods used in
 * the phasing process. Details about the application of each
 * method are listed in the appropriate subcategories.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class Phasing extends BaseCategory {
    public Phasing(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public Phasing(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public Phasing(String name) {
        super(name);
    }

    /**
     * A listing of the method or methods used to phase this
     * structure.
     * @return StrColumn
     */
    public StrColumn getMethod() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("method", StrColumn::new) :
                getBinaryColumn("method"));
    }
}
