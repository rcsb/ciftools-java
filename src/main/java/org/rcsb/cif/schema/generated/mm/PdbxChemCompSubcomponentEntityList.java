package org.rcsb.cif.schema.generated.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the pdbx_chem_comp_subcomponent_entity_list category
 * list the constituent chemical entities and entity features in this chemical component.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxChemCompSubcomponentEntityList extends DelegatingCategory {
    public PdbxChemCompSubcomponentEntityList(Category delegate) {
        super(delegate);
    }

    /**
     * Ordinal index for the entities listed in this category.
     * @return IntColumn
     */
    public IntColumn getId() {
        return delegate.getColumn("id", DelegatingIntColumn::new);
    }

    /**
     * The parent component identifier corresponding to this entity.
     * @return StrColumn
     */
    public StrColumn getParentCompId() {
        return delegate.getColumn("parent_comp_id", DelegatingStrColumn::new);
    }

    /**
     * Defines the type of the entity.
     * @return StrColumn
     */
    public StrColumn getType() {
        return delegate.getColumn("type", DelegatingStrColumn::new);
    }

    /**
     * Defines the predominant linking type of the entity.
     * @return StrColumn
     */
    public StrColumn getClazz() {
        return delegate.getColumn("class", DelegatingStrColumn::new);
    }
}
