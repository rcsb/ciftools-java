package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_REFERENCE_ENTITY_LIST category record
 * the list of entities within each reference molecule.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxReferenceEntityList extends DelegatingCategory {
    public PdbxReferenceEntityList(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "prd_id":
                return getPrdId();
            case "ref_entity_id":
                return getRefEntityId();
            case "type":
                return getType();
            case "details":
                return getDetails();
            case "component_id":
                return getComponentId();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The value of _pdbx_reference_entity_list.prd_id is a reference
     * _pdbx_reference_molecule.prd_id in the PDBX_REFERENCE_MOLECULE category.
     * @return StrColumn
     */
    public StrColumn getPrdId() {
        return delegate.getColumn("prd_id", DelegatingStrColumn::new);
    }

    /**
     * The value of _pdbx_reference_entity_list.ref_entity_id is a unique identifier
     * the a constituent entity within this reference molecule.
     * @return StrColumn
     */
    public StrColumn getRefEntityId() {
        return delegate.getColumn("ref_entity_id", DelegatingStrColumn::new);
    }

    /**
     * Defines the polymer characteristic of the entity.
     * @return StrColumn
     */
    public StrColumn getType() {
        return delegate.getColumn("type", DelegatingStrColumn::new);
    }

    /**
     * Additional details about this entity.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

    /**
     * The component number of this entity within the molecule.
     * @return IntColumn
     */
    public IntColumn getComponentId() {
        return delegate.getColumn("component_id", DelegatingIntColumn::new);
    }

}