package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_REFERENCE_ENTITY_POLY_LINK category give details about
 * polymer linkages including both standard and non-standard linkages between
 * polymer componnents.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxReferenceEntityPolyLink extends DelegatingCategory {
    public PdbxReferenceEntityPolyLink(Category delegate) {
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
            case "ref_entity_id":
                return getRefEntityId();
            case "component_id":
                return getComponentId();
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
            case "insert_code_1":
                return getInsertCode1();
            case "insert_code_2":
                return getInsertCode2();
            case "value_order":
                return getValueOrder();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The value of _pdbx_reference_entity_poly_link.link_id uniquely identifies
     * a linkage within a polymer entity.
     * @return IntColumn
     */
    public IntColumn getLinkId() {
        return delegate.getColumn("link_id", DelegatingIntColumn::new);
    }

    /**
     * The value of _pdbx_reference_entity_poly_link.prd_id is a reference
     * _pdbx_reference_entity_list.prd_id in the PDBX_REFERENCE_ENTITY_POLY category.
     * @return StrColumn
     */
    public StrColumn getPrdId() {
        return delegate.getColumn("prd_id", DelegatingStrColumn::new);
    }

    /**
     * A description of special aspects of this linkage.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

    /**
     * The reference entity id of the polymer entity containing the linkage.
     * 
     * This data item is a pointer to _pdbx_reference_entity_poly.ref_entity_id
     * in the PDBX_REFERENCE_ENTITY_POLY category.
     * @return StrColumn
     */
    public StrColumn getRefEntityId() {
        return delegate.getColumn("ref_entity_id", DelegatingStrColumn::new);
    }

    /**
     * The entity component identifier entity containing the linkage.
     * @return IntColumn
     */
    public IntColumn getComponentId() {
        return delegate.getColumn("component_id", DelegatingIntColumn::new);
    }

    /**
     * For a polymer entity, the sequence number in the first of
     * the two components making the linkage.
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
     * the two components making the linkage.
     * 
     * This data item is a pointer to _pdbx_reference_entity_poly_seq.num
     * in the PDBX_REFERENCE_ENTITY_POLY_SEQ category.
     * @return IntColumn
     */
    public IntColumn getEntitySeqNum2() {
        return delegate.getColumn("entity_seq_num_2", DelegatingIntColumn::new);
    }

    /**
     * The component identifier in the first of the two components making the
     * linkage.
     * 
     * This data item is a pointer to _pdbx_reference_entity_poly_seq.mon_id
     * in the PDBX_REFERENCE_ENTITY_POLY_SEQ category.
     * @return StrColumn
     */
    public StrColumn getCompId1() {
        return delegate.getColumn("comp_id_1", DelegatingStrColumn::new);
    }

    /**
     * The component identifier in the second of the two components making the
     * linkage.
     * 
     * This data item is a pointer to _pdbx_reference_entity_poly_seq.mon_id
     * in the PDBX_REFERENCE_ENTITY_POLY_SEQ category.
     * @return StrColumn
     */
    public StrColumn getCompId2() {
        return delegate.getColumn("comp_id_2", DelegatingStrColumn::new);
    }

    /**
     * The atom identifier/name in the first of the two components making
     * the linkage.
     * @return StrColumn
     */
    public StrColumn getAtomId1() {
        return delegate.getColumn("atom_id_1", DelegatingStrColumn::new);
    }

    /**
     * The atom identifier/name in the second of the two components making
     * the linkage.
     * @return StrColumn
     */
    public StrColumn getAtomId2() {
        return delegate.getColumn("atom_id_2", DelegatingStrColumn::new);
    }

    /**
     * The residue insertion code for the first of the two components making
     * the non-standard linkage.
     * @return StrColumn
     */
    public StrColumn getInsertCode1() {
        return delegate.getColumn("insert_code_1", DelegatingStrColumn::new);
    }

    /**
     * The residue insertion code for the second of the two components making
     * the non-standard linkage.
     * @return StrColumn
     */
    public StrColumn getInsertCode2() {
        return delegate.getColumn("insert_code_2", DelegatingStrColumn::new);
    }

    /**
     * The bond order target for the non-standard linkage.
     * @return StrColumn
     */
    public StrColumn getValueOrder() {
        return delegate.getColumn("value_order", DelegatingStrColumn::new);
    }

}