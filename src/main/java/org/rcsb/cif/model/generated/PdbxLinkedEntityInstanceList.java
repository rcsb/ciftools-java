package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_LINKED_ENTITY_INSTANCE_LIST category identify instance
 * molecules represented as linked entities within an entry.
 */
@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxLinkedEntityInstanceList extends BaseCategory {
    public PdbxLinkedEntityInstanceList(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxLinkedEntityInstanceList(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxLinkedEntityInstanceList(String name) {
        super(name);
    }

    /**
     * The value of _pdbx_linked_entity_instance_list.linked_entity_id is a reference to the
     * identifier for a molecule represented as a linked entity.
     * @return StrColumn
     */
    public StrColumn getLinkedEntityId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("linked_entity_id", StrColumn::new) :
                getBinaryColumn("linked_entity_id"));
    }

    /**
     * The value of _pdbx_linked_entity_instance_list.instance_id is identifies a particular molecule
     * instance within an entry.
     * @return IntColumn
     */
    public IntColumn getInstanceId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("instance_id", IntColumn::new) :
                getBinaryColumn("instance_id"));
    }

    /**
     * A reference to _struct_asym.id in the STRUCT_ASYM category.
     * @return StrColumn
     */
    public StrColumn getAsymId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("asym_id", StrColumn::new) :
                getBinaryColumn("asym_id"));
    }
}
