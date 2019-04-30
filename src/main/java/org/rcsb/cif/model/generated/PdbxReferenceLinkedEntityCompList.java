package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the pdbx_reference_linked_entity_comp_list category lists
 * the constituents of common observed interaction patterns
 * described in the pdbx_reference_linked_entity category.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return IntColumn
     */
    public IntColumn getLinkedEntityId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("linked_entity_id", IntColumn::new) :
                getBinaryColumn("linked_entity_id"));
    }

    /**
     * This data item uniquely identifies a constituent of with the linked entity.
     * @return IntColumn
     */
    public IntColumn getListId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("list_id", IntColumn::new) :
                getBinaryColumn("list_id"));
    }

    /**
     * The name of the constituent withing the linked entity.
     * @return StrColumn
     */
    public StrColumn getName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("name", StrColumn::new) :
                getBinaryColumn("name"));
    }

    /**
     * The component identifer for the constituent within the linked entity..
     * @return StrColumn
     */
    public StrColumn getCompId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("comp_id", StrColumn::new) :
                getBinaryColumn("comp_id"));
    }
}
