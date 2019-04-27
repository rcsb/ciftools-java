package org.rcsb.cif.model.phasing;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
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
     * @return Method
     */
    public Method getMethod() {
        return (Method) (isText ? textFields.computeIfAbsent("method",
                Method::new) : getBinaryColumn("method"));
    }
}
