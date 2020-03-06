package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_LINKED_ENTITY category record
 * information about molecules composed of linked entities.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxLinkedEntity extends DelegatingCategory {
    public PdbxLinkedEntity(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "linked_entity_id":
                return getLinkedEntityId();
            case "type":
                return getType();
            case "class":
                return getClazz();
            case "name":
                return getName();
            case "description":
                return getDescription();
            case "prd_id":
                return getPrdId();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The value of _pdbx_linked_entity.linked_entity_id is the unique identifier
     * for the molecule represented as a collection of linked entities.
     * @return StrColumn
     */
    public StrColumn getLinkedEntityId() {
        return delegate.getColumn("linked_entity_id", DelegatingStrColumn::new);
    }

    /**
     * Defines the structural classification of this molecule.
     * @return StrColumn
     */
    public StrColumn getType() {
        return delegate.getColumn("type", DelegatingStrColumn::new);
    }

    /**
     * Broadly defines the function of this molecule.
     * @return StrColumn
     */
    public StrColumn getClazz() {
        return delegate.getColumn("class", DelegatingStrColumn::new);
    }

    /**
     * A name of the molecule.
     * @return StrColumn
     */
    public StrColumn getName() {
        return delegate.getColumn("name", DelegatingStrColumn::new);
    }

    /**
     * Description of this molecule.
     * @return StrColumn
     */
    public StrColumn getDescription() {
        return delegate.getColumn("description", DelegatingStrColumn::new);
    }

    /**
     * The identifier used by the PDB corresponding to the chemical definition
     * for the molecule.
     * @return StrColumn
     */
    public StrColumn getPrdId() {
        return delegate.getColumn("prd_id", DelegatingStrColumn::new);
    }

}