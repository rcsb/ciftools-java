package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_LINKED_ENTITY_INSTANCE_LIST category identify instance
 * molecules represented as linked entities within an entry.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxLinkedEntityInstanceList extends DelegatingCategory {
    public PdbxLinkedEntityInstanceList(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "linked_entity_id":
                return getLinkedEntityId();
            case "instance_id":
                return getInstanceId();
            case "asym_id":
                return getAsymId();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The value of _pdbx_linked_entity_instance_list.linked_entity_id is a reference to the
     * identifier for a molecule represented as a linked entity.
     * @return StrColumn
     */
    public StrColumn getLinkedEntityId() {
        return delegate.getColumn("linked_entity_id", DelegatingStrColumn::new);
    }

    /**
     * The value of _pdbx_linked_entity_instance_list.instance_id is identifies a particular molecule
     * instance within an entry.
     * @return IntColumn
     */
    public IntColumn getInstanceId() {
        return delegate.getColumn("instance_id", DelegatingIntColumn::new);
    }

    /**
     * A reference to _struct_asym.id in the STRUCT_ASYM category.
     * @return StrColumn
     */
    public StrColumn getAsymId() {
        return delegate.getColumn("asym_id", DelegatingStrColumn::new);
    }

}