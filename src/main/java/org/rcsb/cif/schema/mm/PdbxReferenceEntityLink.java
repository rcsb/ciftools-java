package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_REFERENCE_ENTITY_LINK category give details about
 * the linkages between entities within reference molecules.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxReferenceEntityLink extends DelegatingCategory {
    public PdbxReferenceEntityLink(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "link_id":
                return getLinkId();
            case "prd_id":
                return getPrdId();
            case "details":
                return getDetails();
            case "ref_entity_id_1":
                return getRefEntityId1();
            case "ref_entity_id_2":
                return getRefEntityId2();
            case "entity_seq_num_1":
                return getEntitySeqNum1();
            case "entity_seq_num_2":
                return getEntitySeqNum2();
            case "comp_id_1":
                return getCompId1();
            case "comp_id_2":
                return getCompId2();
            case "atom_id_1":
                return getAtomId1();
            case "atom_id_2":
                return getAtomId2();
            case "value_order":
                return getValueOrder();
            case "component_1":
                return getComponent1();
            case "component_2":
                return getComponent2();
            case "nonpoly_res_num_1":
                return getNonpolyResNum1();
            case "nonpoly_res_num_2":
                return getNonpolyResNum2();
            case "link_class":
                return getLinkClass();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The value of _pdbx_reference_entity_link.link_id uniquely identifies
     * linkages between entities with a molecule.
     * @return IntColumn
     */
    public IntColumn getLinkId() {
        return delegate.getColumn("link_id", DelegatingIntColumn::new);
    }

    /**
     * The value of _pdbx_reference_entity_link.prd_id is a reference
     * _pdbx_reference_entity_list.prd_id in the PDBX_REFERENCE_ENTITY_LIST category.
     * @return StrColumn
     */
    public StrColumn getPrdId() {
        return delegate.getColumn("prd_id", DelegatingStrColumn::new);
    }

    /**
     * A description of special aspects of a linkage between
     * chemical components in the structure.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

    /**
     * The reference entity id of the first of the two entities joined by the
     * linkage.
     * 
     * This data item is a pointer to _pdbx_reference_entity_list.ref_entity_id
     * in the PDBX_REFERENCE_ENTITY_LIST category.
     * @return StrColumn
     */
    public StrColumn getRefEntityId1() {
        return delegate.getColumn("ref_entity_id_1", DelegatingStrColumn::new);
    }

    /**
     * The reference entity id of the second of the two entities joined by the
     * linkage.
     * 
     * This data item is a pointer to _pdbx_reference_entity_list.ref_entity_id
     * in the PDBX_REFERENCE_ENTITY_LIST category.
     * @return StrColumn
     */
    public StrColumn getRefEntityId2() {
        return delegate.getColumn("ref_entity_id_2", DelegatingStrColumn::new);
    }

    /**
     * For a polymer entity, the sequence number in the first of
     * the two entities containing the linkage.
     * 
     * This data item is a pointer to _pdbx_reference_entity_poly_seq.num
     * in the PDBX_REFERENCE_ENTITY_POLY_SEQ category.
     * @return IntColumn
     */
    public IntColumn getEntitySeqNum1() {
        return delegate.getColumn("entity_seq_num_1", DelegatingIntColumn::new);
    }

    /**
     * For a polymer entity, the sequence number in the second of
     * the two entities containing the linkage.
     * 
     * This data item is a pointer to _pdbx_reference_entity_poly_seq.num
     * in the PDBX_REFERENCE_ENTITY_POLY_SEQ category.
     * @return IntColumn
     */
    public IntColumn getEntitySeqNum2() {
        return delegate.getColumn("entity_seq_num_2", DelegatingIntColumn::new);
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
     * @return StrColumn
     */
    public StrColumn getCompId1() {
        return delegate.getColumn("comp_id_1", DelegatingStrColumn::new);
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
     * The residue number for the first of two entities containing the linkage.
     * @return StrColumn
     */
    public StrColumn getNonpolyResNum1() {
        return delegate.getColumn("nonpoly_res_num_1", DelegatingStrColumn::new);
    }

    /**
     * The residue number for the second of two entities containing the linkage.
     * @return StrColumn
     */
    public StrColumn getNonpolyResNum2() {
        return delegate.getColumn("nonpoly_res_num_2", DelegatingStrColumn::new);
    }

    /**
     * A code indicating the entity types involved in the linkage.
     * @return StrColumn
     */
    public StrColumn getLinkClass() {
        return delegate.getColumn("link_class", DelegatingStrColumn::new);
    }

}