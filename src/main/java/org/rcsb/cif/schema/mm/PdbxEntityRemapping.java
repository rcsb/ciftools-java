package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * When producing a biological assembly model file, data items in the pdbx_entity_remapping provide a mapping
 * from the entity in original model file to this data file.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxEntityRemapping extends DelegatingCategory {
    public PdbxEntityRemapping(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "entity_id":
                return getEntityId();
            case "orig_entity_id":
                return getOrigEntityId();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * Uniquely identifies an _entity.id in this data block.
     * @return StrColumn
     */
    public StrColumn getEntityId() {
        return delegate.getColumn("entity_id", DelegatingStrColumn::new);
    }

    /**
     * Uniquely identifies an _entity.id in the original model data block.
     * @return StrColumn
     */
    public StrColumn getOrigEntityId() {
        return delegate.getColumn("orig_entity_id", DelegatingStrColumn::new);
    }

}