package org.rcsb.cif.model.pdbxentitynametaxonomytree;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

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
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }

    /**
     * This data item identifies the nearest parent node in
     * the entity name taxonomy.
     * @return ParentId
     */
    public ParentId getParentId() {
        return (ParentId) (isText ? textFields.computeIfAbsent("parent_id",
                ParentId::new) : getBinaryColumn("parent_id"));
    }
}
