package org.rcsb.cif.model.pdbxreferencelinkedentitycomplist;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxReferenceLinkedEntityCompList extends BaseCategory {
    public PdbxReferenceLinkedEntityCompList(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxReferenceLinkedEntityCompList(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxReferenceLinkedEntityCompList(String name) {
        super(name);
    }

    /**
     * This data item is a pointer to _pdbx_reference_linked_entity.id
     * in the pdbx_reference_linked_entity  category.
     * @return LinkedEntityId
     */
    public LinkedEntityId getLinkedEntityId() {
        return (LinkedEntityId) (isText ? textFields.computeIfAbsent("linked_entity_id",
                LinkedEntityId::new) : getBinaryColumn("linked_entity_id"));
    }

    /**
     * This data item uniquely identifies a constituent of with the linked entity.
     * @return ListId
     */
    public ListId getListId() {
        return (ListId) (isText ? textFields.computeIfAbsent("list_id",
                ListId::new) : getBinaryColumn("list_id"));
    }

    /**
     * The name of the constituent withing the linked entity.
     * @return Name
     */
    public Name getName() {
        return (Name) (isText ? textFields.computeIfAbsent("name",
                Name::new) : getBinaryColumn("name"));
    }

    /**
     * The component identifer for the constituent within the linked entity..
     * @return CompId
     */
    public CompId getCompId() {
        return (CompId) (isText ? textFields.computeIfAbsent("comp_id",
                CompId::new) : getBinaryColumn("comp_id"));
    }
}
