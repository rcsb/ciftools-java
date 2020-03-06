package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * This category contains descriptive protocols for the production
 * of this entity.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxEntityProdProtocol extends DelegatingCategory {
    public PdbxEntityProdProtocol(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "entry_id":
                return getEntryId();
            case "entity_id":
                return getEntityId();
            case "protocol":
                return getProtocol();
            case "protocol_type":
                return getProtocolType();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The value of _pdbx_entity_prod_protocol.entry_id uniquely identifies
     * a sample consisting of one or more proteins whose structure is
     * to be determined. This is a pointer to _entry.id.
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return delegate.getColumn("entry_id", DelegatingStrColumn::new);
    }

    /**
     * The value of _pdbx_entity_prod_protocol.entity_id uniquely identifies
     * each protein contained in the project target protein complex whose
     * structure is to be determined. This data item is a pointer to _entity.id
     * in the ENTITY category.
     * @return StrColumn
     */
    public StrColumn getEntityId() {
        return delegate.getColumn("entity_id", DelegatingStrColumn::new);
    }

    /**
     * The protocol description associated with the protocol_type employed
     * in the production of this entity.
     * @return StrColumn
     */
    public StrColumn getProtocol() {
        return delegate.getColumn("protocol", DelegatingStrColumn::new);
    }

    /**
     * The one of a set of protocol types associated with the production
     * of this entity.
     * @return StrColumn
     */
    public StrColumn getProtocolType() {
        return delegate.getColumn("protocol_type", DelegatingStrColumn::new);
    }

}