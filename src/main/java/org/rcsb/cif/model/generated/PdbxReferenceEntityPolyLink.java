package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_REFERENCE_ENTITY_POLY_LINK category give details about
 * polymer linkages including both standard and non-standard linkages between
 * polymer componnents.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class PdbxReferenceEntityPolyLink extends BaseCategory {
    public PdbxReferenceEntityPolyLink(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxReferenceEntityPolyLink(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxReferenceEntityPolyLink(String name) {
        super(name);
    }

    /**
     * The value of _pdbx_reference_entity_poly_link.link_id uniquely identifies
     * a linkage within a polymer entity.
     * @return IntColumn
     */
    public IntColumn getLinkId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("link_id", IntColumn::new) :
                getBinaryColumn("link_id"));
    }

    /**
     * The value of _pdbx_reference_entity_poly_link.prd_id is a reference
     * _pdbx_reference_entity_list.prd_id in the PDBX_REFERENCE_ENTITY_POLY category.
     * @return StrColumn
     */
    public StrColumn getPrdId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("prd_id", StrColumn::new) :
                getBinaryColumn("prd_id"));
    }

    /**
     * A description of special aspects of this linkage.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * The reference entity id of the polymer entity containing the linkage.
     * 
     * This data item is a pointer to _pdbx_reference_entity_poly.ref_entity_id
     * in the PDBX_REFERENCE_ENTITY_POLY category.
     * @return StrColumn
     */
    public StrColumn getRefEntityId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("ref_entity_id", StrColumn::new) :
                getBinaryColumn("ref_entity_id"));
    }

    /**
     * The entity component identifier entity containing the linkage.
     * @return IntColumn
     */
    public IntColumn getComponentId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("component_id", IntColumn::new) :
                getBinaryColumn("component_id"));
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
        return (IntColumn) (isText ? textFields.computeIfAbsent("entity_seq_num_1", IntColumn::new) :
                getBinaryColumn("entity_seq_num_1"));
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
        return (IntColumn) (isText ? textFields.computeIfAbsent("entity_seq_num_2", IntColumn::new) :
                getBinaryColumn("entity_seq_num_2"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("comp_id_1", StrColumn::new) :
                getBinaryColumn("comp_id_1"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("comp_id_2", StrColumn::new) :
                getBinaryColumn("comp_id_2"));
    }

    /**
     * The atom identifier/name in the first of the two components making
     * the linkage.
     * @return StrColumn
     */
    public StrColumn getAtomId1() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_id_1", StrColumn::new) :
                getBinaryColumn("atom_id_1"));
    }

    /**
     * The atom identifier/name in the second of the two components making
     * the linkage.
     * @return StrColumn
     */
    public StrColumn getAtomId2() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_id_2", StrColumn::new) :
                getBinaryColumn("atom_id_2"));
    }

    /**
     * The residue insertion code for the first of the two components making
     * the non-standard linkage.
     * @return StrColumn
     */
    public StrColumn getInsertCode1() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("insert_code_1", StrColumn::new) :
                getBinaryColumn("insert_code_1"));
    }

    /**
     * The residue insertion code for the second of the two components making
     * the non-standard linkage.
     * @return StrColumn
     */
    public StrColumn getInsertCode2() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("insert_code_2", StrColumn::new) :
                getBinaryColumn("insert_code_2"));
    }

    /**
     * The bond order target for the non-standard linkage.
     * @return StrColumn
     */
    public StrColumn getValueOrder() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("value_order", StrColumn::new) :
                getBinaryColumn("value_order"));
    }
}
