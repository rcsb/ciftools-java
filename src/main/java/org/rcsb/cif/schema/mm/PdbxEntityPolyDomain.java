package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_ENTITY_POLY_DOMAIN category specify domains
 * of monomers within a polymer.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxEntityPolyDomain extends DelegatingCategory {
    public PdbxEntityPolyDomain(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "id":
                return getId();
            case "entity_id":
                return getEntityId();
            case "begin_mon_id":
                return getBeginMonId();
            case "begin_seq_num":
                return getBeginSeqNum();
            case "end_mon_id":
                return getEndMonId();
            case "end_seq_num":
                return getEndSeqNum();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The value of _pdbx_entity_poly_domain.id must uniquely identify a
     * domain within an entity.
     * 
     * Note that this item need not be a number; it can be any unique
     * identifier.
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * This data item is a pointer to _entity.id in the ENTITY category.
     * @return StrColumn
     */
    public StrColumn getEntityId() {
        return delegate.getColumn("entity_id", DelegatingStrColumn::new);
    }

    /**
     * The value of _pdbx_entity_poly_domain.begin_mon_id identifies
     * the monomer at the beginning of the domain.  This must
     * correspond to a record in the ENTITY_POLY_SEQ list.
     * @return StrColumn
     */
    public StrColumn getBeginMonId() {
        return delegate.getColumn("begin_mon_id", DelegatingStrColumn::new);
    }

    /**
     * The value of _pdbx_entity_poly_domain.begin_seq_num identifies
     * the sequence position of the beginning of the domain.  This must
     * correspond to a record in the ENTITY_POLY_SEQ list.
     * @return IntColumn
     */
    public IntColumn getBeginSeqNum() {
        return delegate.getColumn("begin_seq_num", DelegatingIntColumn::new);
    }

    /**
     * The value of _pdbx_entity_poly_domain.begin_mon_id identifies
     * the monomer at the end of the domain.  This must
     * correspond to a record in the ENTITY_POLY_SEQ list.
     * @return StrColumn
     */
    public StrColumn getEndMonId() {
        return delegate.getColumn("end_mon_id", DelegatingStrColumn::new);
    }

    /**
     * The value of _pdbx_entity_poly_domain.begin_seq_num identifies
     * the sequence position of the end of the domain.  This must
     * correspond to a record in the ENTITY_POLY_SEQ list.
     * @return IntColumn
     */
    public IntColumn getEndSeqNum() {
        return delegate.getColumn("end_seq_num", DelegatingIntColumn::new);
    }

}