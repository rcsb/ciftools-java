package org.rcsb.cif.model.generated.entitynamesys;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
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
     * @return EntityId
     */
    public EntityId getEntityId() {
        return (EntityId) (isText ? textFields.computeIfAbsent("entity_id",
                EntityId::new) : getBinaryColumn("entity_id"));
    }

    /**
     * The systematic name for the entity.
     * @return Name
     */
    public Name getName() {
        return (Name) (isText ? textFields.computeIfAbsent("name",
                Name::new) : getBinaryColumn("name"));
    }

    /**
     * The system used to generate the systematic name of the entity.
     * @return System
     */
    public System getSystem() {
        return (System) (isText ? textFields.computeIfAbsent("system",
                System::new) : getBinaryColumn("system"));
    }
}
