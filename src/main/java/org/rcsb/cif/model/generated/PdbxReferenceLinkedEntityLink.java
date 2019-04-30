package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the pdbx_reference_linked_entity_link category enumerate
 * linkages between the entities in common observed interaction patterns
 * described in the pdbx_reference_linked_entity category.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return IntColumn
     */
    public IntColumn getLinkedEntityId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("linked_entity_id", IntColumn::new) :
                getBinaryColumn("linked_entity_id"));
    }

    /**
     * The value of _pdbx_reference_linked_entity_link.link_id uniquely identifies
     * linkages within the linked entity.
     * @return IntColumn
     */
    public IntColumn getLinkId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("link_id", IntColumn::new) :
                getBinaryColumn("link_id"));
    }

    /**
     * The value of _pdbx_reference_linked_entity_link.from_list_id is a reference
     * _pdbx_reference_linked_entity_comp_list.list_id in the pdbx_reference_linked_entity_comp_list
     * category.
     * @return IntColumn
     */
    public IntColumn getFromListId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("from_list_id", IntColumn::new) :
                getBinaryColumn("from_list_id"));
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
    public StrColumn getToCompId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("to_comp_id", StrColumn::new) :
                getBinaryColumn("to_comp_id"));
    }

    /**
     * The component identifier in the second of the two constituents containing the linkage.
     * @return StrColumn
     */
    public StrColumn getFromCompId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("from_comp_id", StrColumn::new) :
                getBinaryColumn("from_comp_id"));
    }

    /**
     * The atom identifier/name in the first of the two constituents containing the linkage.
     * @return StrColumn
     */
    public StrColumn getToAtomId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("to_atom_id", StrColumn::new) :
                getBinaryColumn("to_atom_id"));
    }

    /**
     * The atom identifier/name in the second of the two constituents containing the linkage.
     * @return StrColumn
     */
    public StrColumn getFromAtomId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("from_atom_id", StrColumn::new) :
                getBinaryColumn("from_atom_id"));
    }

    /**
     * The leaving atom identifier/name bonded to the second atom making the linkage.
     * @return StrColumn
     */
    public StrColumn getFromLeavingAtomId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("from_leaving_atom_id", StrColumn::new) :
                getBinaryColumn("from_leaving_atom_id"));
    }

    /**
     * The chiral configuration of the second atom making the linkage.
     * @return StrColumn
     */
    public StrColumn getFromAtomStereoConfig() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("from_atom_stereo_config", StrColumn::new) :
                getBinaryColumn("from_atom_stereo_config"));
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
