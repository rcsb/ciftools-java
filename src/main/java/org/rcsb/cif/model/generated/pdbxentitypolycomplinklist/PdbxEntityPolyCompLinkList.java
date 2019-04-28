package org.rcsb.cif.model.generated.pdbxentitypolycomplinklist;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
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
     * @return LinkId
     */
    public LinkId getLinkId() {
        return (LinkId) (isText ? textFields.computeIfAbsent("link_id",
                LinkId::new) : getBinaryColumn("link_id"));
    }

    /**
     * A description of special aspects of this linkage.
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
    }

    /**
     * The entity id for this branched entity.
     * 
     * This data item is a pointer to _entity_poly_seq.entity_id
     * in the ENTITY_POLY_SEQ category.
     * @return EntityId
     */
    public EntityId getEntityId() {
        return (EntityId) (isText ? textFields.computeIfAbsent("entity_id",
                EntityId::new) : getBinaryColumn("entity_id"));
    }

    /**
     * The component number for the first component making the linkage.
     * 
     * This data item is a pointer to _entity_poly_seq.num
     * in the ENTITY_POLY_SEQ category.
     * @return EntityCompNum1
     */
    public EntityCompNum1 getEntityCompNum1() {
        return (EntityCompNum1) (isText ? textFields.computeIfAbsent("entity_comp_num_1",
                EntityCompNum1::new) : getBinaryColumn("entity_comp_num_1"));
    }

    /**
     * The component number for the second component making the linkage.
     * 
     * This data item is a pointer to _entity_poly_seq.num
     * in the ENTITY_POLY_SEQ category.
     * @return EntityCompNum2
     */
    public EntityCompNum2 getEntityCompNum2() {
        return (EntityCompNum2) (isText ? textFields.computeIfAbsent("entity_comp_num_2",
                EntityCompNum2::new) : getBinaryColumn("entity_comp_num_2"));
    }

    /**
     * The component identifier for the first component making the linkage.
     * 
     * This data item is a pointer to _entity_poly_seq.mon_id
     * in the ENTITY_POLY_SEQ category.
     * @return CompId1
     */
    public CompId1 getCompId1() {
        return (CompId1) (isText ? textFields.computeIfAbsent("comp_id_1",
                CompId1::new) : getBinaryColumn("comp_id_1"));
    }

    /**
     * The component identifier for the second component making the linkage.
     * 
     * This data item is a pointer to _entity_poly_seq.mon_id
     * in the ENTITY_POLY_SEQ category.
     * @return CompId2
     */
    public CompId2 getCompId2() {
        return (CompId2) (isText ? textFields.computeIfAbsent("comp_id_2",
                CompId2::new) : getBinaryColumn("comp_id_2"));
    }

    /**
     * The atom identifier/name for the first atom making the linkage.
     * @return AtomId1
     */
    public AtomId1 getAtomId1() {
        return (AtomId1) (isText ? textFields.computeIfAbsent("atom_id_1",
                AtomId1::new) : getBinaryColumn("atom_id_1"));
    }

    /**
     * The leaving atom identifier/name bonded to the first atom making the linkage.
     * @return LeavingAtomId1
     */
    public LeavingAtomId1 getLeavingAtomId1() {
        return (LeavingAtomId1) (isText ? textFields.computeIfAbsent("leaving_atom_id_1",
                LeavingAtomId1::new) : getBinaryColumn("leaving_atom_id_1"));
    }

    /**
     * The chiral configuration of the first atom making the linkage.
     * @return AtomStereoConfig1
     */
    public AtomStereoConfig1 getAtomStereoConfig1() {
        return (AtomStereoConfig1) (isText ? textFields.computeIfAbsent("atom_stereo_config_1",
                AtomStereoConfig1::new) : getBinaryColumn("atom_stereo_config_1"));
    }

    /**
     * The atom identifier/name for the second atom making the linkage.
     * @return AtomId2
     */
    public AtomId2 getAtomId2() {
        return (AtomId2) (isText ? textFields.computeIfAbsent("atom_id_2",
                AtomId2::new) : getBinaryColumn("atom_id_2"));
    }

    /**
     * The leaving atom identifier/name bonded to the second atom making the linkage.
     * @return LeavingAtomId2
     */
    public LeavingAtomId2 getLeavingAtomId2() {
        return (LeavingAtomId2) (isText ? textFields.computeIfAbsent("leaving_atom_id_2",
                LeavingAtomId2::new) : getBinaryColumn("leaving_atom_id_2"));
    }

    /**
     * The chiral configuration of the second atom making the linkage.
     * @return AtomStereoConfig2
     */
    public AtomStereoConfig2 getAtomStereoConfig2() {
        return (AtomStereoConfig2) (isText ? textFields.computeIfAbsent("atom_stereo_config_2",
                AtomStereoConfig2::new) : getBinaryColumn("atom_stereo_config_2"));
    }

    /**
     * The bond order target for the chemical linkage.
     * @return ValueOrder
     */
    public ValueOrder getValueOrder() {
        return (ValueOrder) (isText ? textFields.computeIfAbsent("value_order",
                ValueOrder::new) : getBinaryColumn("value_order"));
    }
}
