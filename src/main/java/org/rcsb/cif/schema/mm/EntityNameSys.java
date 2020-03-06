package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the ENTITY_NAME_SYS category record the systematic
 * name or names associated with the entity and the system that
 * was used to construct the systematic name. In some cases, the
 * entity name may not be the same as the name of the biological
 * structure.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class EntityNameSys extends DelegatingCategory {
    public EntityNameSys(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "entity_id":
                return getEntityId();
            case "name":
                return getName();
            case "system":
                return getSystem();
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
     * The systematic name for the entity.
     * @return StrColumn
     */
    public StrColumn getName() {
        return delegate.getColumn("name", DelegatingStrColumn::new);
    }

    /**
     * The system used to generate the systematic name of the entity.
     * @return StrColumn
     */
    public StrColumn getSystem() {
        return delegate.getColumn("system", DelegatingStrColumn::new);
    }

}