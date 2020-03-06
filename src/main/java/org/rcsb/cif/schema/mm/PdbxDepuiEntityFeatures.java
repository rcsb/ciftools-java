package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_DEPUI_ENTITY_FEATURES category record status
 * details related to the features of individual entities.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxDepuiEntityFeatures extends DelegatingCategory {
    public PdbxDepuiEntityFeatures(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "dep_dataset_id":
                return getDepDatasetId();
            case "entity_id":
                return getEntityId();
            case "type":
                return getType();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The internal identifier assigned to each deposition.
     * @return StrColumn
     */
    public StrColumn getDepDatasetId() {
        return delegate.getColumn("dep_dataset_id", DelegatingStrColumn::new);
    }

    /**
     * A reference to the _entity.id in the ENTITY category
     * @return StrColumn
     */
    public StrColumn getEntityId() {
        return delegate.getColumn("entity_id", DelegatingStrColumn::new);
    }

    /**
     * A flag to indicate the molecule class for the entity.
     * @return StrColumn
     */
    public StrColumn getType() {
        return delegate.getColumn("type", DelegatingStrColumn::new);
    }

}