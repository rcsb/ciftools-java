package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_ENTITY_NAME_TAXONOMY_TREE category
 * define the tree structure of the entity name taxonomy.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxEntityNameTaxonomyTree extends DelegatingCategory {
    public PdbxEntityNameTaxonomyTree(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "id":
                return getId();
            case "parent_id":
                return getParentId();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * This data item identifies a node in the entity
     * name taxonomy.
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * This data item identifies the nearest parent node in
     * the entity name taxonomy.
     * @return StrColumn
     */
    public StrColumn getParentId() {
        return delegate.getColumn("parent_id", DelegatingStrColumn::new);
    }

}