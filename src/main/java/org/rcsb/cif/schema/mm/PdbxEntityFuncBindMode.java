package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_ENTITY_FUNC_BIND_MODE category describe
 * characteristics of protein oligonucleotide binding.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxEntityFuncBindMode extends DelegatingCategory {
    public PdbxEntityFuncBindMode(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "id":
                return getId();
            case "domain_id":
                return getDomainId();
            case "entity_id":
                return getEntityId();
            case "protein_binds_to":
                return getProteinBindsTo();
            case "type":
                return getType();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The value of _pdbx_entity_func_bind_mode.id is a unique identifier
     * for a binding mode within a domain within an entity.
     * 
     * Note that this item need not be a number; it can be any unique
     * identifier.
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * This data item is a pointer to _pdbx_entity_poly_domain.id in the
     * PDBX_ENTITY_POLY_DOMAIN category.
     * @return StrColumn
     */
    public StrColumn getDomainId() {
        return delegate.getColumn("domain_id", DelegatingStrColumn::new);
    }

    /**
     * This data item is a pointer to _entity.id in the ENTITY category.
     * @return StrColumn
     */
    public StrColumn getEntityId() {
        return delegate.getColumn("entity_id", DelegatingStrColumn::new);
    }

    /**
     * This data item identifies the type of oligonucleotide to which
     * the protein binds.
     * @return StrColumn
     */
    public StrColumn getProteinBindsTo() {
        return delegate.getColumn("protein_binds_to", DelegatingStrColumn::new);
    }

    /**
     * This data item describes the functional type of the
     * protein oligonucleotide binding interaction.
     * @return StrColumn
     */
    public StrColumn getType() {
        return delegate.getColumn("type", DelegatingStrColumn::new);
    }

}