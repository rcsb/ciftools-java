package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the ENTITY_NAME_COM category record the common name
 * or names associated with the entity. In some cases, the entity
 * name may not be the same as the name of the biological structure.
 * For example, haemoglobin alpha chain would be the entity common
 * name, not haemoglobin.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class EntityNameCom extends DelegatingCategory {
    public EntityNameCom(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "entity_id":
                return getEntityId();
            case "name":
                return getName();
            case "pdbx_provenance":
                return getPdbxProvenance();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * This data item is a pointer to _entity.id in the ENTITY category.
     * @return StrColumn
     */
    public StrColumn getEntityId() {
        return delegate.getColumn("entity_id", DelegatingStrColumn::new);
    }

    /**
     * A common name for the entity.
     * @return StrColumn
     */
    public StrColumn getName() {
        return delegate.getColumn("name", DelegatingStrColumn::new);
    }

    /**
     * Provides the provenance of the name in the _entity_name_com.name field
     * @return StrColumn
     */
    public StrColumn getPdbxProvenance() {
        return delegate.getColumn("pdbx_provenance", DelegatingStrColumn::new);
    }

}