package org.rcsb.cif.model.generated.pdbxreferenceentitylink;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxReferenceEntityLink extends BaseCategory {
    public PdbxReferenceEntityLink(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxReferenceEntityLink(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxReferenceEntityLink(String name) {
        super(name);
    }

    /**
     * The value of _pdbx_reference_entity_link.link_id uniquely identifies
     * linkages between entities with a molecule.
     * @return LinkId
     */
    public LinkId getLinkId() {
        return (LinkId) (isText ? textFields.computeIfAbsent("link_id",
                LinkId::new) : getBinaryColumn("link_id"));
    }

    /**
     * The value of _pdbx_reference_entity_link.prd_id is a reference
     * _pdbx_reference_entity_list.prd_id in the PDBX_REFERENCE_ENTITY_LIST category.
     * @return PrdId
     */
    public PrdId getPrdId() {
        return (PrdId) (isText ? textFields.computeIfAbsent("prd_id",
                PrdId::new) : getBinaryColumn("prd_id"));
    }

    /**
     * A description of special aspects of a linkage between
     * chemical components in the structure.
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
    }

    /**
     * The reference entity id of the first of the two entities joined by the
     * linkage.
     * 
     * This data item is a pointer to _pdbx_reference_entity_list.ref_entity_id
     * in the PDBX_REFERENCE_ENTITY_LIST category.
     * @return RefEntityId1
     */
    public RefEntityId1 getRefEntityId1() {
        return (RefEntityId1) (isText ? textFields.computeIfAbsent("ref_entity_id_1",
                RefEntityId1::new) : getBinaryColumn("ref_entity_id_1"));
    }

    /**
     * The reference entity id of the second of the two entities joined by the
     * linkage.
     * 
     * This data item is a pointer to _pdbx_reference_entity_list.ref_entity_id
     * in the PDBX_REFERENCE_ENTITY_LIST category.
     * @return RefEntityId2
     */
    public RefEntityId2 getRefEntityId2() {
        return (RefEntityId2) (isText ? textFields.computeIfAbsent("ref_entity_id_2",
                RefEntityId2::new) : getBinaryColumn("ref_entity_id_2"));
    }

    /**
     * For a polymer entity, the sequence number in the first of
     * the two entities containing the linkage.
     * 
     * This data item is a pointer to _pdbx_reference_entity_poly_seq.num
     * in the PDBX_REFERENCE_ENTITY_POLY_SEQ category.
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
     * This data item is a pointer to _pdbx_reference_entity_poly_seq.num
     * in the PDBX_REFERENCE_ENTITY_POLY_SEQ category.
     * @return EntitySeqNum2
     */
    public EntitySeqNum2 getEntitySeqNum2() {
        return (EntitySeqNum2) (isText ? textFields.computeIfAbsent("entity_seq_num_2",
                EntitySeqNum2::new) : getBinaryColumn("entity_seq_num_2"));
    }

    /**
     * The component identifier in the first of the two entities containing the linkage.
     * 
     * For polymer entities, this data item is a pointer to _pdbx_reference_entity_poly_seq.mon_id
     * in the PDBX_REFERENCE_ENTITY_POLY_SEQ category.
     * 
     * For non-polymer entities, this data item is a pointer to
     * _pdbx_reference_entity_nonpoly.chem_comp_id in the
     * PDBX_REFERENCE_ENTITY_NONPOLY category.
     * @return CompId1
     */
    public CompId1 getCompId1() {
        return (CompId1) (isText ? textFields.computeIfAbsent("comp_id_1",
                CompId1::new) : getBinaryColumn("comp_id_1"));
    }

    /**
     * The component identifier in the second of the two entities containing the linkage.
     * 
     * For polymer entities, this data item is a pointer to _pdbx_reference_entity_poly_seq.mon_id
     * in the PDBX_REFERENCE_ENTITY_POLY_SEQ category.
     * 
     * For non-polymer entities, this data item is a pointer to
     * _pdbx_reference_entity_nonpoly.chem_comp_id in the
     * PDBX_REFERENCE_ENTITY_NONPOLY category.
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
     * The residue number for the first of two entities containing the linkage.
     * @return NonpolyResNum1
     */
    public NonpolyResNum1 getNonpolyResNum1() {
        return (NonpolyResNum1) (isText ? textFields.computeIfAbsent("nonpoly_res_num_1",
                NonpolyResNum1::new) : getBinaryColumn("nonpoly_res_num_1"));
    }

    /**
     * The residue number for the second of two entities containing the linkage.
     * @return NonpolyResNum2
     */
    public NonpolyResNum2 getNonpolyResNum2() {
        return (NonpolyResNum2) (isText ? textFields.computeIfAbsent("nonpoly_res_num_2",
                NonpolyResNum2::new) : getBinaryColumn("nonpoly_res_num_2"));
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
