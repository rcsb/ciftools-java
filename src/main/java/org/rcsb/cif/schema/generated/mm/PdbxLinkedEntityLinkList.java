package org.rcsb.cif.schema.generated.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_LINKED_ENTITY_LINK_LIST category give details about
 * the linkages with molecules represented as linked entities.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxLinkedEntityLinkList extends DelegatingCategory {
    public PdbxLinkedEntityLinkList(Category delegate) {
        super(delegate);
    }

    /**
     * The value of _pdbx_linked_entity_link_list.link_id uniquely identifies
     * linkages between entities with a molecule.
     * @return IntColumn
     */
    public IntColumn getLinkId() {
        return delegate.getColumn("link_id", DelegatingIntColumn::new);
    }

    /**
     * The value of _pdbx_linked_entity_link_list.linked_entity_id is a reference
     * _pdbx_linked_entity_list.linked_entity_id in the PDBX_LINKED_ENTITY_LIST category.
     * @return StrColumn
     */
    public StrColumn getLinkedEntityId() {
        return delegate.getColumn("linked_entity_id", DelegatingStrColumn::new);
    }

    /**
     * A description of special aspects of a linkage between
     * these entities in this molecule.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
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
        return delegate.getColumn("entity_id_1", DelegatingStrColumn::new);
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
        return delegate.getColumn("entity_id_2", DelegatingStrColumn::new);
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
        return delegate.getColumn("entity_seq_num_1", DelegatingIntColumn::new);
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
        return delegate.getColumn("entity_seq_num_2", DelegatingIntColumn::new);
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
        return delegate.getColumn("comp_id_1", DelegatingStrColumn::new);
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
        return delegate.getColumn("comp_id_2", DelegatingStrColumn::new);
    }

    /**
     * The atom identifier/name in the first of the two entities containing the linkage.
     * @return StrColumn
     */
    public StrColumn getAtomId1() {
        return delegate.getColumn("atom_id_1", DelegatingStrColumn::new);
    }

    /**
     * The atom identifier/name in the second of the two entities containing the linkage.
     * @return StrColumn
     */
    public StrColumn getAtomId2() {
        return delegate.getColumn("atom_id_2", DelegatingStrColumn::new);
    }

    /**
     * The bond order target for the chemical linkage.
     * @return StrColumn
     */
    public StrColumn getValueOrder() {
        return delegate.getColumn("value_order", DelegatingStrColumn::new);
    }

    /**
     * The entity component identifier for the first of two entities containing the linkage.
     * @return IntColumn
     */
    public IntColumn getComponent1() {
        return delegate.getColumn("component_1", DelegatingIntColumn::new);
    }

    /**
     * The entity component identifier for the second of two entities containing the linkage.
     * @return IntColumn
     */
    public IntColumn getComponent2() {
        return delegate.getColumn("component_2", DelegatingIntColumn::new);
    }

    /**
     * A code indicating the entity types involved in the linkage.
     * @return StrColumn
     */
    public StrColumn getLinkClass() {
        return delegate.getColumn("link_class", DelegatingStrColumn::new);
    }
}
