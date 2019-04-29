package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_ENTITY_NAME_TAXONOMY_TREE category
 * define the tree structure of the entity name taxonomy.
 */
@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxEntityNameTaxonomyTree extends BaseCategory {
    public PdbxEntityNameTaxonomyTree(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxEntityNameTaxonomyTree(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxEntityNameTaxonomyTree(String name) {
        super(name);
    }

    /**
     * This data item identifies a node in the entity
     * name taxonomy.
     * @return StrColumn
     */
    public StrColumn getId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("id", StrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * This data item identifies the nearest parent node in
     * the entity name taxonomy.
     * @return StrColumn
     */
    public StrColumn getParentId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("parent_id", StrColumn::new) :
                getBinaryColumn("parent_id"));
    }
}
