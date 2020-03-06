package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_ENTITY_POLY_NA_NONSTANDARD category
 * describe the nonstandard features of the nucleic acid polymer entities.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxEntityPolyNaNonstandard extends DelegatingCategory {
    public PdbxEntityPolyNaNonstandard(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "entity_id":
                return getEntityId();
            case "feature":
                return getFeature();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * This data item is a pointer to _entity.id in the
     * ENTITY category.
     * @return StrColumn
     */
    public StrColumn getEntityId() {
        return delegate.getColumn("entity_id", DelegatingStrColumn::new);
    }

    /**
     * This data item describes the nonstandard feature of
     * the nucleic acid polymer entity.
     * @return StrColumn
     */
    public StrColumn getFeature() {
        return delegate.getColumn("feature", DelegatingStrColumn::new);
    }

}