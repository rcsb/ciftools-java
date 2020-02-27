package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data item will still be used until the ENTITY category is fully
 * adopted by NDBQuery.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class PdbxSource extends BaseCategory {
    public PdbxSource(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxSource(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxSource(String name) {
        super(name);
    }

    /**
     * Source of biological unit.  Mostly: SYNTHETIC
     * @return StrColumn
     */
    public StrColumn getSrcMethod() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("src_method", StrColumn::new) :
                getBinaryColumn("src_method"));
    }
}
