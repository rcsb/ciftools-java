package org.rcsb.cif.model.generated.pdbxlinkedentityinstancelist;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

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
     * @return LinkedEntityId
     */
    public LinkedEntityId getLinkedEntityId() {
        return (LinkedEntityId) (isText ? textFields.computeIfAbsent("linked_entity_id",
                LinkedEntityId::new) : getBinaryColumn("linked_entity_id"));
    }

    /**
     * The value of _pdbx_linked_entity_instance_list.instance_id is identifies a particular molecule
     * instance within an entry.
     * @return InstanceId
     */
    public InstanceId getInstanceId() {
        return (InstanceId) (isText ? textFields.computeIfAbsent("instance_id",
                InstanceId::new) : getBinaryColumn("instance_id"));
    }

    /**
     * A reference to _struct_asym.id in the STRUCT_ASYM category.
     * @return AsymId
     */
    public AsymId getAsymId() {
        return (AsymId) (isText ? textFields.computeIfAbsent("asym_id",
                AsymId::new) : getBinaryColumn("asym_id"));
    }
}
