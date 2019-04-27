package org.rcsb.cif.model.pdbxreferencelinkedentitycomplink;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxReferenceLinkedEntityCompLink extends BaseCategory {
    public PdbxReferenceLinkedEntityCompLink(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxReferenceLinkedEntityCompLink(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxReferenceLinkedEntityCompLink(String name) {
        super(name);
    }

    /**
     * The value of _pdbx_reference_linked_entity_comp_link.linked_entity_id is a reference
     * _pdbx_reference_linked_entity_comp_list.linked_entity_id in the pdbx_reference_linked_entity_comp_list
     * category.
     * @return LinkedEntityId
     */
    public LinkedEntityId getLinkedEntityId() {
        return (LinkedEntityId) (isText ? textFields.computeIfAbsent("linked_entity_id",
                LinkedEntityId::new) : getBinaryColumn("linked_entity_id"));
    }

    /**
     * The value of _pdbx_reference_linked_entity_comp_link.link_id uniquely identifies
     * linkages within the linked entity.
     * @return LinkId
     */
    public LinkId getLinkId() {
        return (LinkId) (isText ? textFields.computeIfAbsent("link_id",
                LinkId::new) : getBinaryColumn("link_id"));
    }

    /**
     * The value of _pdbx_reference_linked_entity_comp_link.list_id_1 is a reference
     * _pdbx_reference_linked_entity_comp_list.list_id in the pdbx_reference_linked_entity_comp_list
     * category.
     * @return ListId1
     */
    public ListId1 getListId1() {
        return (ListId1) (isText ? textFields.computeIfAbsent("list_id_1",
                ListId1::new) : getBinaryColumn("list_id_1"));
    }

    /**
     * The value of _pdbx_reference_linked_entity_comp_link.list_id_2 is a reference
     * _pdbx_reference_linked_entity_comp_list.list_id in the pdbx_reference_linked_entity_comp_list
     * category.
     * @return ListId2
     */
    public ListId2 getListId2() {
        return (ListId2) (isText ? textFields.computeIfAbsent("list_id_2",
                ListId2::new) : getBinaryColumn("list_id_2"));
    }

    /**
     * A description of special aspects of a linkage between
     * these constituents in this linked entity.
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
    }

    /**
     * The component identifier in the first of the two constituents containing the linkage.
     * @return CompId1
     */
    public CompId1 getCompId1() {
        return (CompId1) (isText ? textFields.computeIfAbsent("comp_id_1",
                CompId1::new) : getBinaryColumn("comp_id_1"));
    }

    /**
     * The component identifier in the second of the two constituents containing the linkage.
     * @return CompId2
     */
    public CompId2 getCompId2() {
        return (CompId2) (isText ? textFields.computeIfAbsent("comp_id_2",
                CompId2::new) : getBinaryColumn("comp_id_2"));
    }

    /**
     * The atom identifier/name in the first of the two constituents containing the linkage.
     * @return AtomId1
     */
    public AtomId1 getAtomId1() {
        return (AtomId1) (isText ? textFields.computeIfAbsent("atom_id_1",
                AtomId1::new) : getBinaryColumn("atom_id_1"));
    }

    /**
     * The atom identifier/name in the second of the two constituents containing the linkage.
     * @return AtomId2
     */
    public AtomId2 getAtomId2() {
        return (AtomId2) (isText ? textFields.computeIfAbsent("atom_id_2",
                AtomId2::new) : getBinaryColumn("atom_id_2"));
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
