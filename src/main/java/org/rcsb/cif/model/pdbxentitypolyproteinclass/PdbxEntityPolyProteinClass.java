package org.rcsb.cif.model.pdbxentitypolyproteinclass;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

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
     * @return EntityId
     */
    public EntityId getEntityId() {
        return (EntityId) (isText ? textFields.computeIfAbsent("entity_id",
                EntityId::new) : getBinaryColumn("entity_id"));
    }

    /**
     * This data item provides a top-level classification
     * of the polymer protein entity.
     * @return Clazz
     */
    public Clazz getClazz() {
        return (Clazz) (isText ? textFields.computeIfAbsent("class",
                Clazz::new) : getBinaryColumn("class"));
    }
}
