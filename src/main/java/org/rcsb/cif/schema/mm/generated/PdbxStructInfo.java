package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Special features of this structural entry.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class PdbxStructInfo extends BaseCategory {
    public PdbxStructInfo(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxStructInfo(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxStructInfo(String name) {
        super(name);
    }

    /**
     * The information category/type for this item.
     * @return StrColumn
     */
    public StrColumn getType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("type", StrColumn::new) :
                getBinaryColumn("type"));
    }

    /**
     * The value of this information item.
     * @return StrColumn
     */
    public StrColumn getValue() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("value", StrColumn::new) :
                getBinaryColumn("value"));
    }

    /**
     * Additional details about this information item.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }
}
