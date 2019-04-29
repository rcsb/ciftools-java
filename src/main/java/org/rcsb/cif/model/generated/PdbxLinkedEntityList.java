package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_LINKED_ENTITY_LIST category record
 * the list of entity constituents for this molecule.
 */
@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxLinkedEntityList extends BaseCategory {
    public PdbxLinkedEntityList(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxLinkedEntityList(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxLinkedEntityList(String name) {
        super(name);
    }

    /**
     * The value of _pdbx_linked_entity_list.linked_entity_id is a reference
     * _pdbx_linked_entity.linked_entity_id in the PDBX_LINKED_ENTITY category.
     * @return StrColumn
     */
    public StrColumn getLinkedEntityId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("linked_entity_id", StrColumn::new) :
                getBinaryColumn("linked_entity_id"));
    }

    /**
     * The value of _pdbx_linked_entity_list.ref_entity_id is a unique identifier
     * the a constituent entity within this reference molecule.
     * @return StrColumn
     */
    public StrColumn getEntityId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entity_id", StrColumn::new) :
                getBinaryColumn("entity_id"));
    }

    /**
     * The component number of this entity within the molecule.
     * @return IntColumn
     */
    public IntColumn getComponentId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("component_id", IntColumn::new) :
                getBinaryColumn("component_id"));
    }

    /**
     * Additional details about this entity within this molecule.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }
}
