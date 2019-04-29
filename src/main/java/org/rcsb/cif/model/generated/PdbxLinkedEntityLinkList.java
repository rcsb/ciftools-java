package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_LINKED_ENTITY_LINK_LIST category give details about
 * the linkages with molecules represented as linked entities.
 */
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
     * @return IntColumn
     */
    public IntColumn getLinkId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("link_id", IntColumn::new) :
                getBinaryColumn("link_id"));
    }

    /**
     * The value of _pdbx_linked_entity_link_list.linked_entity_id is a reference
     * _pdbx_linked_entity_list.linked_entity_id in the PDBX_LINKED_ENTITY_LIST category.
     * @return StrColumn
     */
    public StrColumn getLinkedEntityId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("linked_entity_id", StrColumn::new) :
                getBinaryColumn("linked_entity_id"));
    }

    /**
     * A description of special aspects of a linkage between
     * these entities in this molecule.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * The entity id of the first of the two entities joined by the
     * linkage.
     * 
     * This data item is a pointer to _pdbx_linked_entity_list.entity_id
     * in the PDBX_LINKED_ENTITY_LIST category.
     * @return StrColumn
     */
    public StrColumn getEntityId1() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entity_id_1", StrColumn::new) :
                getBinaryColumn("entity_id_1"));
    }

    /**
     * The entity id of the second of the two entities joined by the
     * linkage.
     * 
     * This data item is a pointer to _pdbx_linked_entity_list.entity_id
     * in the PDBX_LINKED_ENTITY_LIST category.
     * @return StrColumn
     */
    public StrColumn getEntityId2() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entity_id_2", StrColumn::new) :
                getBinaryColumn("entity_id_2"));
    }

    /**
     * For a polymer entity, the sequence number in the first of
     * the two entities containing the linkage.
     * 
     * This data item is a pointer to _entity_poly_seq.num
     * in the ENTITY_POLY_SEQ category.
     * @return IntColumn
     */
    public IntColumn getEntitySeqNum1() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("entity_seq_num_1", IntColumn::new) :
                getBinaryColumn("entity_seq_num_1"));
    }

    /**
     * For a polymer entity, the sequence number in the second of
     * the two entities containing the linkage.
     * 
     * This data item is a pointer to _entity_poly_seq.num
     * in the ENTITY_POLY_SEQ category.
     * @return IntColumn
     */
    public IntColumn getEntitySeqNum2() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("entity_seq_num_2", IntColumn::new) :
                getBinaryColumn("entity_seq_num_2"));
    }

    /**
     * The component identifier in the first of the two entities containing the linkage.
     * 
     * For polymer entities, this data item is a pointer to _entity_poly_seq.mon_id
     * in the ENTITY_POLY_SEQ category.
     * 
     * For non-polymer entities, this data item is a pointer to
     * _chem_comp.id in the CHEM_COMP category.
     * @return StrColumn
     */
    public StrColumn getCompId1() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("comp_id_1", StrColumn::new) :
                getBinaryColumn("comp_id_1"));
    }

    /**
     * The component identifier in the second of the two entities containing the linkage.
     * 
     * For polymer entities, this data item is a pointer to _entity_poly_seq.mon_id
     * in the ENTITY_POLY_SEQ category.
     * 
     * For non-polymer entities, this data item is a pointer to
     * _chem_comp.id in the  CHEM_COMP category.
     * @return StrColumn
     */
    public StrColumn getCompId2() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("comp_id_2", StrColumn::new) :
                getBinaryColumn("comp_id_2"));
    }

    /**
     * The atom identifier/name in the first of the two entities containing the linkage.
     * @return StrColumn
     */
    public StrColumn getAtomId1() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_id_1", StrColumn::new) :
                getBinaryColumn("atom_id_1"));
    }

    /**
     * The atom identifier/name in the second of the two entities containing the linkage.
     * @return StrColumn
     */
    public StrColumn getAtomId2() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_id_2", StrColumn::new) :
                getBinaryColumn("atom_id_2"));
    }

    /**
     * The bond order target for the chemical linkage.
     * @return StrColumn
     */
    public StrColumn getValueOrder() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("value_order", StrColumn::new) :
                getBinaryColumn("value_order"));
    }

    /**
     * The entity component identifier for the first of two entities containing the linkage.
     * @return IntColumn
     */
    public IntColumn getComponent1() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("component_1", IntColumn::new) :
                getBinaryColumn("component_1"));
    }

    /**
     * The entity component identifier for the second of two entities containing the linkage.
     * @return IntColumn
     */
    public IntColumn getComponent2() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("component_2", IntColumn::new) :
                getBinaryColumn("component_2"));
    }

    /**
     * A code indicating the entity types involved in the linkage.
     * @return StrColumn
     */
    public StrColumn getLinkClass() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("link_class", StrColumn::new) :
                getBinaryColumn("link_class"));
    }
}
