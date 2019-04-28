package org.rcsb.cif.model.generated.pdbxentityname;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxEntityName extends BaseCategory {
    public PdbxEntityName(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxEntityName(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxEntityName(String name) {
        super(name);
    }

    /**
     * Pointer to _entity.id.
     * @return EntityId
     */
    public EntityId getEntityId() {
        return (EntityId) (isText ? textFields.computeIfAbsent("entity_id",
                EntityId::new) : getBinaryColumn("entity_id"));
    }

    /**
     * Entity name.
     * @return Name
     */
    public Name getName() {
        return (Name) (isText ? textFields.computeIfAbsent("name",
                Name::new) : getBinaryColumn("name"));
    }

    /**
     * Entity name type.
     * @return NameType
     */
    public NameType getNameType() {
        return (NameType) (isText ? textFields.computeIfAbsent("name_type",
                NameType::new) : getBinaryColumn("name_type"));
    }
}
