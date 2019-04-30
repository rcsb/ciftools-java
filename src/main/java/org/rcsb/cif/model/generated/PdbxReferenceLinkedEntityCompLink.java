package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the pdbx_reference_linked_entity_comp_link category enumerate
 * inter-entity linkages between the components of common observed interaction patterns
 * described in the pdbx_reference_linked_entity category.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return IntColumn
     */
    public IntColumn getLinkedEntityId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("linked_entity_id", IntColumn::new) :
                getBinaryColumn("linked_entity_id"));
    }

    /**
     * The value of _pdbx_reference_linked_entity_comp_link.link_id uniquely identifies
     * linkages within the linked entity.
     * @return IntColumn
     */
    public IntColumn getLinkId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("link_id", IntColumn::new) :
                getBinaryColumn("link_id"));
    }

    /**
     * The value of _pdbx_reference_linked_entity_comp_link.list_id_1 is a reference
     * _pdbx_reference_linked_entity_comp_list.list_id in the pdbx_reference_linked_entity_comp_list
     * category.
     * @return IntColumn
     */
    public IntColumn getListId1() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("list_id_1", IntColumn::new) :
                getBinaryColumn("list_id_1"));
    }

    /**
     * The value of _pdbx_reference_linked_entity_comp_link.list_id_2 is a reference
     * _pdbx_reference_linked_entity_comp_list.list_id in the pdbx_reference_linked_entity_comp_list
     * category.
     * @return IntColumn
     */
    public IntColumn getListId2() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("list_id_2", IntColumn::new) :
                getBinaryColumn("list_id_2"));
    }

    /**
     * A description of special aspects of a linkage between
     * these constituents in this linked entity.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * The component identifier in the first of the two constituents containing the linkage.
     * @return StrColumn
     */
    public StrColumn getCompId1() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("comp_id_1", StrColumn::new) :
                getBinaryColumn("comp_id_1"));
    }

    /**
     * The component identifier in the second of the two constituents containing the linkage.
     * @return StrColumn
     */
    public StrColumn getCompId2() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("comp_id_2", StrColumn::new) :
                getBinaryColumn("comp_id_2"));
    }

    /**
     * The atom identifier/name in the first of the two constituents containing the linkage.
     * @return StrColumn
     */
    public StrColumn getAtomId1() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_id_1", StrColumn::new) :
                getBinaryColumn("atom_id_1"));
    }

    /**
     * The atom identifier/name in the second of the two constituents containing the linkage.
     * @return StrColumn
     */
    public StrColumn getAtomId2() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_id_2", StrColumn::new) :
                getBinaryColumn("atom_id_2"));
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
