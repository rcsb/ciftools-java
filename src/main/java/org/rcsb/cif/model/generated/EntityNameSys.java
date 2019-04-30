package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the ENTITY_NAME_SYS category record the systematic
 * name or names associated with the entity and the system that
 * was used to construct the systematic name. In some cases, the
 * entity name may not be the same as the name of the biological
 * structure.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class EntityNameSys extends BaseCategory {
    public EntityNameSys(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public EntityNameSys(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public EntityNameSys(String name) {
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
     * The systematic name for the entity.
     * @return StrColumn
     */
    public StrColumn getName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("name", StrColumn::new) :
                getBinaryColumn("name"));
    }

    /**
     * The system used to generate the systematic name of the entity.
     * @return StrColumn
     */
    public StrColumn getSystem() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("system", StrColumn::new) :
                getBinaryColumn("system"));
    }
}
