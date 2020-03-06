package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_LINKED_ENTITY_LIST category record
 * the list of entity constituents for this molecule.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxLinkedEntityList extends DelegatingCategory {
    public PdbxLinkedEntityList(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "linked_entity_id":
                return getLinkedEntityId();
            case "entity_id":
                return getEntityId();
            case "component_id":
                return getComponentId();
            case "details":
                return getDetails();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The value of _pdbx_linked_entity_list.linked_entity_id is a reference
     * _pdbx_linked_entity.linked_entity_id in the PDBX_LINKED_ENTITY category.
     * @return StrColumn
     */
    public StrColumn getLinkedEntityId() {
        return delegate.getColumn("linked_entity_id", DelegatingStrColumn::new);
    }

    /**
     * The value of _pdbx_linked_entity_list.ref_entity_id is a unique identifier
     * the a constituent entity within this reference molecule.
     * @return StrColumn
     */
    public StrColumn getEntityId() {
        return delegate.getColumn("entity_id", DelegatingStrColumn::new);
    }

    /**
     * The component number of this entity within the molecule.
     * @return IntColumn
     */
    public IntColumn getComponentId() {
        return delegate.getColumn("component_id", DelegatingIntColumn::new);
    }

    /**
     * Additional details about this entity within this molecule.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

}