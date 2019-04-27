package org.rcsb.cif.model.pdbxlinkedentitylist;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

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
     * @return LinkedEntityId
     */
    public LinkedEntityId getLinkedEntityId() {
        return (LinkedEntityId) (isText ? textFields.computeIfAbsent("linked_entity_id",
                LinkedEntityId::new) : getBinaryColumn("linked_entity_id"));
    }

    /**
     * The value of _pdbx_linked_entity_list.ref_entity_id is a unique identifier
     * the a constituent entity within this reference molecule.
     * @return EntityId
     */
    public EntityId getEntityId() {
        return (EntityId) (isText ? textFields.computeIfAbsent("entity_id",
                EntityId::new) : getBinaryColumn("entity_id"));
    }

    /**
     * The component number of this entity within the molecule.
     * @return ComponentId
     */
    public ComponentId getComponentId() {
        return (ComponentId) (isText ? textFields.computeIfAbsent("component_id",
                ComponentId::new) : getBinaryColumn("component_id"));
    }

    /**
     * Additional details about this entity within this molecule.
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
    }
}
