package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the MA_TARGET_ENTITY category record details about
 * the target entities. The details are provided for each entity
 * being modeled.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class MaTargetEntity extends DelegatingCategory {
    public MaTargetEntity(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "entity_id":
                return getEntityId();
            case "data_id":
                return getDataId();
            case "origin":
                return getOrigin();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * A unique identifier for the distinct molecular entity of the target.
     * This data item is a pointer to _entity.id in the ENTITY category.
     * @return StrColumn
     */
    public StrColumn getEntityId() {
        return delegate.getColumn("entity_id", DelegatingStrColumn::new);
    }

    /**
     * The data_id identifier. This data item is a pointer to
     * _ma_data.id in the MA_DATA category.
     * @return IntColumn
     */
    public IntColumn getDataId() {
        return delegate.getColumn("data_id", DelegatingIntColumn::new);
    }

    /**
     * The origin of the target entity.
     * @return StrColumn
     */
    public StrColumn getOrigin() {
        return delegate.getColumn("origin", DelegatingStrColumn::new);
    }

}