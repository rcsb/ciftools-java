package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * The PDBX_ENTITY_NONPOLY category provides a mapping between
 * entity and the nonpolymer component
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxEntityNonpoly extends DelegatingCategory {
    public PdbxEntityNonpoly(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "entity_id":
                return getEntityId();
            case "comp_id":
                return getCompId();
            case "name":
                return getName();
            case "ma_model_mode":
                return getMaModelMode();
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
     * This data item is a pointer to _chem_comp.id in the CHEM_COMP category.
     * @return StrColumn
     */
    public StrColumn getCompId() {
        return delegate.getColumn("comp_id", DelegatingStrColumn::new);
    }

    /**
     * A name for the non-polymer entity
     * @return StrColumn
     */
    public StrColumn getName() {
        return delegate.getColumn("name", DelegatingStrColumn::new);
    }

    /**
     * The data item provides information on whether the non-polymeric entity
     * was explicitly modeled or implicitly derived from the template.
     * @return StrColumn
     */
    public StrColumn getMaModelMode() {
        return delegate.getColumn("ma_model_mode", DelegatingStrColumn::new);
    }

}