package org.rcsb.cif.model.pdbxlinkedentitylinklist;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxLinkedEntityLinkList extends BaseCategory {
    public PdbxLinkedEntityLinkList(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxLinkedEntityLinkList(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxLinkedEntityLinkList(String name) {
        super(name);
    }

    /**
     * The value of _pdbx_linked_entity_link_list.link_id uniquely identifies
     * linkages between entities with a molecule.
     * @return LinkId
     */
    public LinkId getLinkId() {
        return (LinkId) (isText ? textFields.computeIfAbsent("link_id",
                LinkId::new) : getBinaryColumn("link_id"));
    }

    /**
     * The value of _pdbx_linked_entity_link_list.linked_entity_id is a reference
     * _pdbx_linked_entity_list.linked_entity_id in the PDBX_LINKED_ENTITY_LIST category.
     * @return LinkedEntityId
     */
    public LinkedEntityId getLinkedEntityId() {
        return (LinkedEntityId) (isText ? textFields.computeIfAbsent("linked_entity_id",
                LinkedEntityId::new) : getBinaryColumn("linked_entity_id"));
    }

    /**
     * A description of special aspects of a linkage between
     * these entities in this molecule.
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
    }

    /**
     * The entity id of the first of the two entities joined by the
     * linkage.
     * 
     * This data item is a pointer to _pdbx_linked_entity_list.entity_id
     * in the PDBX_LINKED_ENTITY_LIST category.
     * @return EntityId1
     */
    public EntityId1 getEntityId1() {
        return (EntityId1) (isText ? textFields.computeIfAbsent("entity_id_1",
                EntityId1::new) : getBinaryColumn("entity_id_1"));
    }

    /**
     * The entity id of the second of the two entities joined by the
     * linkage.
     * 
     * This data item is a pointer to _pdbx_linked_entity_list.entity_id
     * in the PDBX_LINKED_ENTITY_LIST category.
     * @return EntityId2
     */
    public EntityId2 getEntityId2() {
        return (EntityId2) (isText ? textFields.computeIfAbsent("entity_id_2",
                EntityId2::new) : getBinaryColumn("entity_id_2"));
    }

    /**
     * For a polymer entity, the sequence number in the first of
     * the two entities containing the linkage.
     * 
     * This data item is a pointer to _entity_poly_seq.num
     * in the ENTITY_POLY_SEQ category.
     * @return EntitySeqNum1
     */
    public EntitySeqNum1 getEntitySeqNum1() {
        return (EntitySeqNum1) (isText ? textFields.computeIfAbsent("entity_seq_num_1",
                EntitySeqNum1::new) : getBinaryColumn("entity_seq_num_1"));
    }

    /**
     * For a polymer entity, the sequence number in the second of
     * the two entities containing the linkage.
     * 
     * This data item is a pointer to _entity_poly_seq.num
     * in the ENTITY_POLY_SEQ category.
     * @return EntitySeqNum2
     */
    public EntitySeqNum2 getEntitySeqNum2() {
        return (EntitySeqNum2) (isText ? textFields.computeIfAbsent("entity_seq_num_2",
                EntitySeqNum2::new) : getBinaryColumn("entity_seq_num_2"));
    }

    /**
     * The component identifier in the first of the two entities containing the linkage.
     * 
     * For polymer entities, this data item is a pointer to _entity_poly_seq.mon_id
     * in the ENTITY_POLY_SEQ category.
     * 
     * For non-polymer entities, this data item is a pointer to
     * _chem_comp.id in the CHEM_COMP category.
     * @return CompId1
     */
    public CompId1 getCompId1() {
        return (CompId1) (isText ? textFields.computeIfAbsent("comp_id_1",
                CompId1::new) : getBinaryColumn("comp_id_1"));
    }

    /**
     * The component identifier in the second of the two entities containing the linkage.
     * 
     * For polymer entities, this data item is a pointer to _entity_poly_seq.mon_id
     * in the ENTITY_POLY_SEQ category.
     * 
     * For non-polymer entities, this data item is a pointer to
     * _chem_comp.id in the  CHEM_COMP category.
     * @return CompId2
     */
    public CompId2 getCompId2() {
        return (CompId2) (isText ? textFields.computeIfAbsent("comp_id_2",
                CompId2::new) : getBinaryColumn("comp_id_2"));
    }

    /**
     * The atom identifier/name in the first of the two entities containing the linkage.
     * @return AtomId1
     */
    public AtomId1 getAtomId1() {
        return (AtomId1) (isText ? textFields.computeIfAbsent("atom_id_1",
                AtomId1::new) : getBinaryColumn("atom_id_1"));
    }

    /**
     * The atom identifier/name in the second of the two entities containing the linkage.
     * @return AtomId2
     */
    public AtomId2 getAtomId2() {
        return (AtomId2) (isText ? textFields.computeIfAbsent("atom_id_2",
                AtomId2::new) : getBinaryColumn("atom_id_2"));
    }

    /**
     * The bond order target for the chemical linkage.
     * @return ValueOrder
     */
    public ValueOrder getValueOrder() {
        return (ValueOrder) (isText ? textFields.computeIfAbsent("value_order",
                ValueOrder::new) : getBinaryColumn("value_order"));
    }

    /**
     * The entity component identifier for the first of two entities containing the linkage.
     * @return Component1
     */
    public Component1 getComponent1() {
        return (Component1) (isText ? textFields.computeIfAbsent("component_1",
                Component1::new) : getBinaryColumn("component_1"));
    }

    /**
     * The entity component identifier for the second of two entities containing the linkage.
     * @return Component2
     */
    public Component2 getComponent2() {
        return (Component2) (isText ? textFields.computeIfAbsent("component_2",
                Component2::new) : getBinaryColumn("component_2"));
    }

    /**
     * A code indicating the entity types involved in the linkage.
     * @return LinkClass
     */
    public LinkClass getLinkClass() {
        return (LinkClass) (isText ? textFields.computeIfAbsent("link_class",
                LinkClass::new) : getBinaryColumn("link_class"));
    }
}
