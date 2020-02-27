package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the ENTITY_LINK category give details about
 * the links between entities.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return StrColumn
     */
    public StrColumn getLinkId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("link_id", StrColumn::new) :
                getBinaryColumn("link_id"));
    }

    /**
     * A description of special aspects of a link between
     * chemical components in the structure.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("entity_id_1", StrColumn::new) :
                getBinaryColumn("entity_id_1"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("entity_id_2", StrColumn::new) :
                getBinaryColumn("entity_id_2"));
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
        return (IntColumn) (isText ? textFields.computeIfAbsent("entity_seq_num_1", IntColumn::new) :
                getBinaryColumn("entity_seq_num_1"));
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
        return (IntColumn) (isText ? textFields.computeIfAbsent("entity_seq_num_2", IntColumn::new) :
                getBinaryColumn("entity_seq_num_2"));
    }
}
