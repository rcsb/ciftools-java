package org.rcsb.cif.model.generated.pdbxreferencelinkedentitylink;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxReferenceLinkedEntityLink extends BaseCategory {
    public PdbxReferenceLinkedEntityLink(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxReferenceLinkedEntityLink(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxReferenceLinkedEntityLink(String name) {
        super(name);
    }

    /**
     * The value of _pdbx_reference_linked_entity_link.linked_entity_id is a reference
     * _pdbx_reference_linked_entity_comp_list.linked_entity_id in the pdbx_reference_linked_entity_comp_list
     * category.
     * @return LinkedEntityId
     */
    public LinkedEntityId getLinkedEntityId() {
        return (LinkedEntityId) (isText ? textFields.computeIfAbsent("linked_entity_id",
                LinkedEntityId::new) : getBinaryColumn("linked_entity_id"));
    }

    /**
     * The value of _pdbx_reference_linked_entity_link.link_id uniquely identifies
     * linkages within the linked entity.
     * @return LinkId
     */
    public LinkId getLinkId() {
        return (LinkId) (isText ? textFields.computeIfAbsent("link_id",
                LinkId::new) : getBinaryColumn("link_id"));
    }

    /**
     * The value of _pdbx_reference_linked_entity_link.from_list_id is a reference
     * _pdbx_reference_linked_entity_comp_list.list_id in the pdbx_reference_linked_entity_comp_list
     * category.
     * @return FromListId
     */
    public FromListId getFromListId() {
        return (FromListId) (isText ? textFields.computeIfAbsent("from_list_id",
                FromListId::new) : getBinaryColumn("from_list_id"));
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
     * @return ToCompId
     */
    public ToCompId getToCompId() {
        return (ToCompId) (isText ? textFields.computeIfAbsent("to_comp_id",
                ToCompId::new) : getBinaryColumn("to_comp_id"));
    }

    /**
     * The component identifier in the second of the two constituents containing the linkage.
     * @return FromCompId
     */
    public FromCompId getFromCompId() {
        return (FromCompId) (isText ? textFields.computeIfAbsent("from_comp_id",
                FromCompId::new) : getBinaryColumn("from_comp_id"));
    }

    /**
     * The atom identifier/name in the first of the two constituents containing the linkage.
     * @return ToAtomId
     */
    public ToAtomId getToAtomId() {
        return (ToAtomId) (isText ? textFields.computeIfAbsent("to_atom_id",
                ToAtomId::new) : getBinaryColumn("to_atom_id"));
    }

    /**
     * The atom identifier/name in the second of the two constituents containing the linkage.
     * @return FromAtomId
     */
    public FromAtomId getFromAtomId() {
        return (FromAtomId) (isText ? textFields.computeIfAbsent("from_atom_id",
                FromAtomId::new) : getBinaryColumn("from_atom_id"));
    }

    /**
     * The leaving atom identifier/name bonded to the second atom making the linkage.
     * @return FromLeavingAtomId
     */
    public FromLeavingAtomId getFromLeavingAtomId() {
        return (FromLeavingAtomId) (isText ? textFields.computeIfAbsent("from_leaving_atom_id",
                FromLeavingAtomId::new) : getBinaryColumn("from_leaving_atom_id"));
    }

    /**
     * The chiral configuration of the second atom making the linkage.
     * @return FromAtomStereoConfig
     */
    public FromAtomStereoConfig getFromAtomStereoConfig() {
        return (FromAtomStereoConfig) (isText ? textFields.computeIfAbsent("from_atom_stereo_config",
                FromAtomStereoConfig::new) : getBinaryColumn("from_atom_stereo_config"));
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
