package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_STRUCT_ENTITY_INST category record details about the
 * structural elements in the deposited entry.  The entity instance is a method
 * neutral identifier for the observed molecular entities in the deposited coordinate
 * set.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxStructEntityInst extends DelegatingCategory {
    public PdbxStructEntityInst(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "details":
                return getDetails();
            case "entity_id":
                return getEntityId();
            case "id":
                return getId();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * A description of special aspects of this portion of the contents
     * of the deposited unit.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

    /**
     * This data item is a pointer to _entity.id in the ENTITY category.
     * @return StrColumn
     */
    public StrColumn getEntityId() {
        return delegate.getColumn("entity_id", DelegatingStrColumn::new);
    }

    /**
     * The value of _pdbx_struct_entity_inst.id must uniquely identify a record in
     * the PDBX_STRUCT_ENTITY_INST list.
     * 
     * The entity instance is a method neutral identifier for the observed
     * molecular entities in the deposited coordinate set.
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

}