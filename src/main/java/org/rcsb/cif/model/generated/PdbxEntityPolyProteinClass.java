package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_ENTITY_POLY_PROTEIN_CLASS category
 * provides a top-level protein classification.
 */
@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxEntityPolyProteinClass extends BaseCategory {
    public PdbxEntityPolyProteinClass(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxEntityPolyProteinClass(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxEntityPolyProteinClass(String name) {
        super(name);
    }

    /**
     * This data item is a pointer to _entity.id in the
     * ENTITY category.
     * @return StrColumn
     */
    public StrColumn getEntityId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entity_id", StrColumn::new) :
                getBinaryColumn("entity_id"));
    }

    /**
     * This data item provides a top-level classification
     * of the polymer protein entity.
     * @return StrColumn
     */
    public StrColumn getClazz() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("class", StrColumn::new) :
                getBinaryColumn("class"));
    }
}
