package org.rcsb.cif.model.generated.entitylink;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class EntityLink extends BaseCategory {
    public EntityLink(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public EntityLink(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public EntityLink(String name) {
        super(name);
    }

    /**
     * This data item is a pointer to _chem_link.id in the
     * CHEM_LINK category.
     * @return LinkId
     */
    public LinkId getLinkId() {
        return (LinkId) (isText ? textFields.computeIfAbsent("link_id",
                LinkId::new) : getBinaryColumn("link_id"));
    }

    /**
     * A description of special aspects of a link between
     * chemical components in the structure.
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
    }

    /**
     * The entity ID of the first of the two entities joined by the
     * link.
     * 
     * This data item is a pointer to _entity.id in the ENTITY
     * category.
     * @return EntityId1
     */
    public EntityId1 getEntityId1() {
        return (EntityId1) (isText ? textFields.computeIfAbsent("entity_id_1",
                EntityId1::new) : getBinaryColumn("entity_id_1"));
    }

    /**
     * The entity ID of the second of the two entities joined by the
     * link.
     * 
     * This data item is a pointer to _entity.id in the ENTITY
     * category.
     * @return EntityId2
     */
    public EntityId2 getEntityId2() {
        return (EntityId2) (isText ? textFields.computeIfAbsent("entity_id_2",
                EntityId2::new) : getBinaryColumn("entity_id_2"));
    }

    /**
     * For a polymer entity, the sequence number in the first of
     * the two entities containing the link.
     * 
     * This data item is a pointer to _entity_poly_seq.num in the
     * ENTITY_POLY_SEQ category.
     * @return EntitySeqNum1
     */
    public EntitySeqNum1 getEntitySeqNum1() {
        return (EntitySeqNum1) (isText ? textFields.computeIfAbsent("entity_seq_num_1",
                EntitySeqNum1::new) : getBinaryColumn("entity_seq_num_1"));
    }

    /**
     * For a polymer entity, the sequence number in the second of
     * the two entities containing the link.
     * 
     * This data item is a pointer to _entity_poly_seq.num in the
     * ENTITY_POLY_SEQ category.
     * @return EntitySeqNum2
     */
    public EntitySeqNum2 getEntitySeqNum2() {
        return (EntitySeqNum2) (isText ? textFields.computeIfAbsent("entity_seq_num_2",
                EntitySeqNum2::new) : getBinaryColumn("entity_seq_num_2"));
    }
}
