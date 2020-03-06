package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the pdbx_reference_linked_entity_comp_list category lists
 * the constituents of common observed interaction patterns
 * described in the pdbx_reference_linked_entity category.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxReferenceLinkedEntityCompList extends DelegatingCategory {
    public PdbxReferenceLinkedEntityCompList(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "linked_entity_id":
                return getLinkedEntityId();
            case "list_id":
                return getListId();
            case "name":
                return getName();
            case "comp_id":
                return getCompId();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * This data item is a pointer to _pdbx_reference_linked_entity.id
     * in the pdbx_reference_linked_entity  category.
     * @return IntColumn
     */
    public IntColumn getLinkedEntityId() {
        return delegate.getColumn("linked_entity_id", DelegatingIntColumn::new);
    }

    /**
     * This data item uniquely identifies a constituent of with the linked entity.
     * @return IntColumn
     */
    public IntColumn getListId() {
        return delegate.getColumn("list_id", DelegatingIntColumn::new);
    }

    /**
     * The name of the constituent withing the linked entity.
     * @return StrColumn
     */
    public StrColumn getName() {
        return delegate.getColumn("name", DelegatingStrColumn::new);
    }

    /**
     * The component identifer for the constituent within the linked entity..
     * @return StrColumn
     */
    public StrColumn getCompId() {
        return delegate.getColumn("comp_id", DelegatingStrColumn::new);
    }

}