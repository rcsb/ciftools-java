package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_ENTITY_BRANCH category specify the list
 * of branched entities and the type.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class PdbxEntityBranch extends BaseCategory {
    public PdbxEntityBranch(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxEntityBranch(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxEntityBranch(String name) {
        super(name);
    }

    /**
     * The entity id for this branched entity.
     * 
     * This data item is a pointer to _entity.id
     * @return StrColumn
     */
    public StrColumn getEntityId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entity_id", StrColumn::new) :
                getBinaryColumn("entity_id"));
    }

    /**
     * The type of this branched oligosaccharide.
     * @return StrColumn
     */
    public StrColumn getType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("type", StrColumn::new) :
                getBinaryColumn("type"));
    }
}
