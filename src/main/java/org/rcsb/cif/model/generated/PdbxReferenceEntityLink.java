package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_REFERENCE_ENTITY_LINK category give details about
 * the linkages between entities within reference molecules.
 */
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
     * @return IntColumn
     */
    public IntColumn getLinkId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("link_id", IntColumn::new) :
                getBinaryColumn("link_id"));
    }

    /**
     * The value of _pdbx_reference_entity_link.prd_id is a reference
     * _pdbx_reference_entity_list.prd_id in the PDBX_REFERENCE_ENTITY_LIST category.
     * @return StrColumn
     */
    public StrColumn getPrdId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("prd_id", StrColumn::new) :
                getBinaryColumn("prd_id"));
    }

    /**
     * A description of special aspects of a linkage between
     * chemical components in the structure.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("ref_entity_id_1", StrColumn::new) :
                getBinaryColumn("ref_entity_id_1"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("ref_entity_id_2", StrColumn::new) :
                getBinaryColumn("ref_entity_id_2"));
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
        return (IntColumn) (isText ? textFields.computeIfAbsent("entity_seq_num_1", IntColumn::new) :
                getBinaryColumn("entity_seq_num_1"));
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
        return (IntColumn) (isText ? textFields.computeIfAbsent("entity_seq_num_2", IntColumn::new) :
                getBinaryColumn("entity_seq_num_2"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("comp_id_1", StrColumn::new) :
                getBinaryColumn("comp_id_1"));
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
     * The residue number for the first of two entities containing the linkage.
     * @return StrColumn
     */
    public StrColumn getNonpolyResNum1() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("nonpoly_res_num_1", StrColumn::new) :
                getBinaryColumn("nonpoly_res_num_1"));
    }

    /**
     * The residue number for the second of two entities containing the linkage.
     * @return StrColumn
     */
    public StrColumn getNonpolyResNum2() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("nonpoly_res_num_2", StrColumn::new) :
                getBinaryColumn("nonpoly_res_num_2"));
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
