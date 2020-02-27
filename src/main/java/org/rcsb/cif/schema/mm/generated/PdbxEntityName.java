package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * The PDBX_ENTITY_NAME records additional name information for
 * each entity.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return StrColumn
     */
    public StrColumn getEntityId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entity_id", StrColumn::new) :
                getBinaryColumn("entity_id"));
    }

    /**
     * Entity name.
     * @return StrColumn
     */
    public StrColumn getName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("name", StrColumn::new) :
                getBinaryColumn("name"));
    }

    /**
     * Entity name type.
     * @return StrColumn
     */
    public StrColumn getNameType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("name_type", StrColumn::new) :
                getBinaryColumn("name_type"));
    }
}
