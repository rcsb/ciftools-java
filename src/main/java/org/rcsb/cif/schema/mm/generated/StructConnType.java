package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the STRUCT_CONN_TYPE category record details
 * about the criteria used to identify interactions between
 * portions of the structure.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class StructConnType extends BaseCategory {
    public StructConnType(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public StructConnType(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public StructConnType(String name) {
        super(name);
    }

    /**
     * The criteria used to define the interaction.
     * @return StrColumn
     */
    public StrColumn getCriteria() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("criteria", StrColumn::new) :
                getBinaryColumn("criteria"));
    }

    /**
     * The chemical or structural type of the interaction.
     * @return StrColumn
     */
    public StrColumn getId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("id", StrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * A reference that specifies the criteria used to define the
     * interaction.
     * @return StrColumn
     */
    public StrColumn getReference() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("reference", StrColumn::new) :
                getBinaryColumn("reference"));
    }
}
