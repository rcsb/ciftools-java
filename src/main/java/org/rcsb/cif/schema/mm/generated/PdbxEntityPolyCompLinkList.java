package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_ENTITY_POLY_COMP_LINK_LIST category enumerate the
 * the linkages between components within the polymer entity.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class PdbxEntityPolyCompLinkList extends BaseCategory {
    public PdbxEntityPolyCompLinkList(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxEntityPolyCompLinkList(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxEntityPolyCompLinkList(String name) {
        super(name);
    }

    /**
     * The value of _pdbx_entity_poly_comp_link_list.link_id uniquely identifies
     * linkages within the branched entity.
     * @return IntColumn
     */
    public IntColumn getLinkId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("link_id", IntColumn::new) :
                getBinaryColumn("link_id"));
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
     * The entity id for this branched entity.
     * 
     * This data item is a pointer to _entity_poly_seq.entity_id
     * in the ENTITY_POLY_SEQ category.
     * @return StrColumn
     */
    public StrColumn getEntityId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entity_id", StrColumn::new) :
                getBinaryColumn("entity_id"));
    }

    /**
     * The component number for the first component making the linkage.
     * 
     * This data item is a pointer to _entity_poly_seq.num
     * in the ENTITY_POLY_SEQ category.
     * @return IntColumn
     */
    public IntColumn getEntityCompNum1() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("entity_comp_num_1", IntColumn::new) :
                getBinaryColumn("entity_comp_num_1"));
    }

    /**
     * The component number for the second component making the linkage.
     * 
     * This data item is a pointer to _entity_poly_seq.num
     * in the ENTITY_POLY_SEQ category.
     * @return IntColumn
     */
    public IntColumn getEntityCompNum2() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("entity_comp_num_2", IntColumn::new) :
                getBinaryColumn("entity_comp_num_2"));
    }

    /**
     * The component identifier for the first component making the linkage.
     * 
     * This data item is a pointer to _entity_poly_seq.mon_id
     * in the ENTITY_POLY_SEQ category.
     * @return StrColumn
     */
    public StrColumn getCompId1() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("comp_id_1", StrColumn::new) :
                getBinaryColumn("comp_id_1"));
    }

    /**
     * The component identifier for the second component making the linkage.
     * 
     * This data item is a pointer to _entity_poly_seq.mon_id
     * in the ENTITY_POLY_SEQ category.
     * @return StrColumn
     */
    public StrColumn getCompId2() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("comp_id_2", StrColumn::new) :
                getBinaryColumn("comp_id_2"));
    }

    /**
     * The atom identifier/name for the first atom making the linkage.
     * @return StrColumn
     */
    public StrColumn getAtomId1() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_id_1", StrColumn::new) :
                getBinaryColumn("atom_id_1"));
    }

    /**
     * The leaving atom identifier/name bonded to the first atom making the linkage.
     * @return StrColumn
     */
    public StrColumn getLeavingAtomId1() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("leaving_atom_id_1", StrColumn::new) :
                getBinaryColumn("leaving_atom_id_1"));
    }

    /**
     * The chiral configuration of the first atom making the linkage.
     * @return StrColumn
     */
    public StrColumn getAtomStereoConfig1() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_stereo_config_1", StrColumn::new) :
                getBinaryColumn("atom_stereo_config_1"));
    }

    /**
     * The atom identifier/name for the second atom making the linkage.
     * @return StrColumn
     */
    public StrColumn getAtomId2() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_id_2", StrColumn::new) :
                getBinaryColumn("atom_id_2"));
    }

    /**
     * The leaving atom identifier/name bonded to the second atom making the linkage.
     * @return StrColumn
     */
    public StrColumn getLeavingAtomId2() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("leaving_atom_id_2", StrColumn::new) :
                getBinaryColumn("leaving_atom_id_2"));
    }

    /**
     * The chiral configuration of the second atom making the linkage.
     * @return StrColumn
     */
    public StrColumn getAtomStereoConfig2() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_stereo_config_2", StrColumn::new) :
                getBinaryColumn("atom_stereo_config_2"));
    }

    /**
     * The bond order target for the chemical linkage.
     * @return StrColumn
     */
    public StrColumn getValueOrder() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("value_order", StrColumn::new) :
                getBinaryColumn("value_order"));
    }
}
