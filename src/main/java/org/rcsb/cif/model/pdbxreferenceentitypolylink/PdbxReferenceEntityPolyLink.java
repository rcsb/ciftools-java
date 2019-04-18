package org.rcsb.cif.model.pdbxreferenceentitypolylink;

import org.rcsb.cif.model.BaseCifCategory;
import org.rcsb.cif.model.CifColumn;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.schema.Schema")
public class PdbxReferenceEntityPolyLink extends BaseCifCategory {
    public PdbxReferenceEntityPolyLink(String name, Map<String, CifColumn> columns) {
        super(name, columns);
    }

    public PdbxReferenceEntityPolyLink(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    /**
     * The value of _pdbx_reference_entity_poly_link.link_id uniquely identifies
     * a linkage within a polymer entity.
     * @return LinkId
     */
    public LinkId getLinkId() {
        return (LinkId) (isText ? getTextColumn("link_id") : getBinaryColumn("link_id"));
    }

    /**
     * The value of _pdbx_reference_entity_poly_link.prd_id is a reference
     * _pdbx_reference_entity_list.prd_id in the PDBX_REFERENCE_ENTITY_POLY category.
     * @return PrdId
     */
    public PrdId getPrdId() {
        return (PrdId) (isText ? getTextColumn("prd_id") : getBinaryColumn("prd_id"));
    }

    /**
     * The reference entity id of the polymer entity containing the linkage.
     * 
     * This data item is a pointer to _pdbx_reference_entity_poly.ref_entity_id
     * in the PDBX_REFERENCE_ENTITY_POLY category.
     * @return RefEntityId
     */
    public RefEntityId getRefEntityId() {
        return (RefEntityId) (isText ? getTextColumn("ref_entity_id") : getBinaryColumn("ref_entity_id"));
    }

    /**
     * The entity component identifier entity containing the linkage.
     * @return ComponentId
     */
    public ComponentId getComponentId() {
        return (ComponentId) (isText ? getTextColumn("component_id") : getBinaryColumn("component_id"));
    }

    /**
     * For a polymer entity, the sequence number in the first of
     * the two components making the linkage.
     * 
     * This data item is a pointer to _pdbx_reference_entity_poly_seq.num
     * in the PDBX_REFERENCE_ENTITY_POLY_SEQ category.
     * @return EntitySeqNum1
     */
    public EntitySeqNum1 getEntitySeqNum1() {
        return (EntitySeqNum1) (isText ? getTextColumn("entity_seq_num_1") : getBinaryColumn("entity_seq_num_1"));
    }

    /**
     * For a polymer entity, the sequence number in the second of
     * the two components making the linkage.
     * 
     * This data item is a pointer to _pdbx_reference_entity_poly_seq.num
     * in the PDBX_REFERENCE_ENTITY_POLY_SEQ category.
     * @return EntitySeqNum2
     */
    public EntitySeqNum2 getEntitySeqNum2() {
        return (EntitySeqNum2) (isText ? getTextColumn("entity_seq_num_2") : getBinaryColumn("entity_seq_num_2"));
    }

    /**
     * The component identifier in the first of the two components making the
     * linkage.
     * 
     * This data item is a pointer to _pdbx_reference_entity_poly_seq.mon_id
     * in the PDBX_REFERENCE_ENTITY_POLY_SEQ category.
     * @return CompId1
     */
    public CompId1 getCompId1() {
        return (CompId1) (isText ? getTextColumn("comp_id_1") : getBinaryColumn("comp_id_1"));
    }

    /**
     * The component identifier in the second of the two components making the
     * linkage.
     * 
     * This data item is a pointer to _pdbx_reference_entity_poly_seq.mon_id
     * in the PDBX_REFERENCE_ENTITY_POLY_SEQ category.
     * @return CompId2
     */
    public CompId2 getCompId2() {
        return (CompId2) (isText ? getTextColumn("comp_id_2") : getBinaryColumn("comp_id_2"));
    }

    /**
     * The atom identifier/name in the first of the two components making
     * the linkage.
     * @return AtomId1
     */
    public AtomId1 getAtomId1() {
        return (AtomId1) (isText ? getTextColumn("atom_id_1") : getBinaryColumn("atom_id_1"));
    }

    /**
     * The atom identifier/name in the second of the two components making
     * the linkage.
     * @return AtomId2
     */
    public AtomId2 getAtomId2() {
        return (AtomId2) (isText ? getTextColumn("atom_id_2") : getBinaryColumn("atom_id_2"));
    }

    /**
     * The bond order target for the non-standard linkage.
     * @return ValueOrder
     */
    public ValueOrder getValueOrder() {
        return (ValueOrder) (isText ? getTextColumn("value_order") : getBinaryColumn("value_order"));
    }
}
