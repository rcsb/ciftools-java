package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the ENTITY_NAME_COM category record the common name
 * or names associated with the entity. In some cases, the entity
 * name may not be the same as the name of the biological structure.
 * For example, haemoglobin alpha chain would be the entity common
 * name, not haemoglobin.
 */
@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class EntityNameCom extends BaseCategory {
    public EntityNameCom(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public EntityNameCom(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public EntityNameCom(String name) {
        super(name);
    }

    /**
     * This data item is a pointer to _entity.id in the ENTITY category.
     * @return StrColumn
     */
    public StrColumn getEntityId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entity_id", StrColumn::new) :
                getBinaryColumn("entity_id"));
    }

    /**
     * A common name for the entity.
     * @return StrColumn
     */
    public StrColumn getName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("name", StrColumn::new) :
                getBinaryColumn("name"));
    }
}
