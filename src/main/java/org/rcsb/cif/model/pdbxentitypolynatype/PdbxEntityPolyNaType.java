package org.rcsb.cif.model.pdbxentitypolynatype;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxEntityPolyNaType extends BaseCategory {
    public PdbxEntityPolyNaType(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxEntityPolyNaType(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxEntityPolyNaType(String name) {
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
     * This data item describes the nucleic acid type.
     * @return Type
     */
    public Type getType() {
        return (Type) (isText ? textFields.computeIfAbsent("type",
                Type::new) : getBinaryColumn("type"));
    }
}
