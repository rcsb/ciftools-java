package org.rcsb.cif.model.pdbxsource;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
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
     * @return SrcMethod
     */
    public SrcMethod getSrcMethod() {
        return (SrcMethod) (isText ? textFields.computeIfAbsent("src_method",
                SrcMethod::new) : getBinaryColumn("src_method"));
    }
}
