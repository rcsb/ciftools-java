package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the ENTITY_LINK category give details about
 * the links between entities.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class EntityLink extends DelegatingCategory {
    public EntityLink(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "link_id":
                return getLinkId();
            case "details":
                return getDetails();
            case "entity_id_1":
                return getEntityId1();
            case "entity_id_2":
                return getEntityId2();
            case "entity_seq_num_1":
                return getEntitySeqNum1();
            case "entity_seq_num_2":
                return getEntitySeqNum2();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * This data item is a pointer to _chem_link.id in the
     * CHEM_LINK category.
     * @return StrColumn
     */
    public StrColumn getLinkId() {
        return delegate.getColumn("link_id", DelegatingStrColumn::new);
    }

    /**
     * A description of special aspects of a link between
     * chemical components in the structure.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

    /**
     * The entity ID of the first of the two entities joined by the
     * link.
     * 
     * This data item is a pointer to _entity.id in the ENTITY
     * category.
     * @return StrColumn
     */
    public StrColumn getEntityId1() {
        return delegate.getColumn("entity_id_1", DelegatingStrColumn::new);
    }

    /**
     * The entity ID of the second of the two entities joined by the
     * link.
     * 
     * This data item is a pointer to _entity.id in the ENTITY
     * category.
     * @return StrColumn
     */
    public StrColumn getEntityId2() {
        return delegate.getColumn("entity_id_2", DelegatingStrColumn::new);
    }

    /**
     * For a polymer entity, the sequence number in the first of
     * the two entities containing the link.
     * 
     * This data item is a pointer to _entity_poly_seq.num in the
     * ENTITY_POLY_SEQ category.
     * @return IntColumn
     */
    public IntColumn getEntitySeqNum1() {
        return delegate.getColumn("entity_seq_num_1", DelegatingIntColumn::new);
    }

    /**
     * For a polymer entity, the sequence number in the second of
     * the two entities containing the link.
     * 
     * This data item is a pointer to _entity_poly_seq.num in the
     * ENTITY_POLY_SEQ category.
     * @return IntColumn
     */
    public IntColumn getEntitySeqNum2() {
        return delegate.getColumn("entity_seq_num_2", DelegatingIntColumn::new);
    }

}