package org.rcsb.cif.model.exptl;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class Exptl extends BaseCategory {
    public Exptl(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public Exptl(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public Exptl(String name) {
        super(name);
    }

    /**
     * The method used in the experiment.
     * @return Method
     */
    public Method getMethod() {
        return (Method) (isText ? textFields.computeIfAbsent("method",
                Method::new) : getBinaryColumn("method"));
    }
}
