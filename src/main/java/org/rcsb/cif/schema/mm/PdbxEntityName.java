package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * The PDBX_ENTITY_NAME records additional name information for
 * each entity.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxEntityName extends DelegatingCategory {
    public PdbxEntityName(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "entity_id":
                return getEntityId();
            case "name":
                return getName();
            case "name_type":
                return getNameType();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * Pointer to _entity.id.
     * @return StrColumn
     */
    public StrColumn getEntityId() {
        return delegate.getColumn("entity_id", DelegatingStrColumn::new);
    }

    /**
     * Entity name.
     * @return StrColumn
     */
    public StrColumn getName() {
        return delegate.getColumn("name", DelegatingStrColumn::new);
    }

    /**
     * Entity name type.
     * @return StrColumn
     */
    public StrColumn getNameType() {
        return delegate.getColumn("name_type", DelegatingStrColumn::new);
    }

}