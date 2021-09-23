package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the MA_TARGET_ENTITY_INSTANCE category record details about
 * the instances of target entities modeled.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class MaTargetEntityInstance extends DelegatingCategory {
    public MaTargetEntityInstance(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "asym_id":
                return getAsymId();
            case "entity_id":
                return getEntityId();
            case "details":
                return getDetails();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * A unique identifier for the instance of the entity.
     * @return StrColumn
     */
    public StrColumn getAsymId() {
        return delegate.getColumn("asym_id", DelegatingStrColumn::new);
    }

    /**
     * A unique identifier for the distinct molecular entity of the target.
     * This data item is a pointer to _ma_target_entity.entity_id in the
     * MA_TARGET_ENTITY category.
     * @return StrColumn
     */
    public StrColumn getEntityId() {
        return delegate.getColumn("entity_id", DelegatingStrColumn::new);
    }

    /**
     * Additional details about the entity instance.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

}