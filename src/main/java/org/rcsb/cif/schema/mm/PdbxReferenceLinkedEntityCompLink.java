package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the pdbx_reference_linked_entity_comp_link category enumerate
 * inter-entity linkages between the components of common observed interaction patterns
 * described in the pdbx_reference_linked_entity category.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxReferenceLinkedEntityCompLink extends DelegatingCategory {
    public PdbxReferenceLinkedEntityCompLink(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "linked_entity_id":
                return getLinkedEntityId();
            case "link_id":
                return getLinkId();
            case "list_id_1":
                return getListId1();
            case "list_id_2":
                return getListId2();
            case "details":
                return getDetails();
            case "comp_id_1":
                return getCompId1();
            case "comp_id_2":
                return getCompId2();
            case "atom_id_1":
                return getAtomId1();
            case "atom_id_2":
                return getAtomId2();
            case "leaving_atom_id_1":
                return getLeavingAtomId1();
            case "atom_stereo_config_1":
                return getAtomStereoConfig1();
            case "leaving_atom_id_2":
                return getLeavingAtomId2();
            case "atom_stereo_config_2":
                return getAtomStereoConfig2();
            case "value_order":
                return getValueOrder();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The value of _pdbx_reference_linked_entity_comp_link.linked_entity_id is a reference
     * _pdbx_reference_linked_entity_comp_list.linked_entity_id in the pdbx_reference_linked_entity_comp_list
     * category.
     * @return IntColumn
     */
    public IntColumn getLinkedEntityId() {
        return delegate.getColumn("linked_entity_id", DelegatingIntColumn::new);
    }

    /**
     * The value of _pdbx_reference_linked_entity_comp_link.link_id uniquely identifies
     * linkages within the linked entity.
     * @return IntColumn
     */
    public IntColumn getLinkId() {
        return delegate.getColumn("link_id", DelegatingIntColumn::new);
    }

    /**
     * The value of _pdbx_reference_linked_entity_comp_link.list_id_1 is a reference
     * _pdbx_reference_linked_entity_comp_list.list_id in the pdbx_reference_linked_entity_comp_list
     * category.
     * @return IntColumn
     */
    public IntColumn getListId1() {
        return delegate.getColumn("list_id_1", DelegatingIntColumn::new);
    }

    /**
     * The value of _pdbx_reference_linked_entity_comp_link.list_id_2 is a reference
     * _pdbx_reference_linked_entity_comp_list.list_id in the pdbx_reference_linked_entity_comp_list
     * category.
     * @return IntColumn
     */
    public IntColumn getListId2() {
        return delegate.getColumn("list_id_2", DelegatingIntColumn::new);
    }

    /**
     * A description of special aspects of a linkage between
     * these constituents in this linked entity.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

    /**
     * The component identifier in the first of the two constituents containing the linkage.
     * @return StrColumn
     */
    public StrColumn getCompId1() {
        return delegate.getColumn("comp_id_1", DelegatingStrColumn::new);
    }

    /**
     * The component identifier in the second of the two constituents containing the linkage.
     * @return StrColumn
     */
    public StrColumn getCompId2() {
        return delegate.getColumn("comp_id_2", DelegatingStrColumn::new);
    }

    /**
     * The atom identifier/name in the first of the two constituents containing the linkage.
     * @return StrColumn
     */
    public StrColumn getAtomId1() {
        return delegate.getColumn("atom_id_1", DelegatingStrColumn::new);
    }

    /**
     * The atom identifier/name in the second of the two constituents containing the linkage.
     * @return StrColumn
     */
    public StrColumn getAtomId2() {
        return delegate.getColumn("atom_id_2", DelegatingStrColumn::new);
    }

    /**
     * The leaving atom identifier/name bonded to the first atom making the linkage.
     * @return StrColumn
     */
    public StrColumn getLeavingAtomId1() {
        return delegate.getColumn("leaving_atom_id_1", DelegatingStrColumn::new);
    }

    /**
     * The chiral configuration of the first atom making the linkage.
     * @return StrColumn
     */
    public StrColumn getAtomStereoConfig1() {
        return delegate.getColumn("atom_stereo_config_1", DelegatingStrColumn::new);
    }

    /**
     * The leaving atom identifier/name bonded to the second atom making the linkage.
     * @return StrColumn
     */
    public StrColumn getLeavingAtomId2() {
        return delegate.getColumn("leaving_atom_id_2", DelegatingStrColumn::new);
    }

    /**
     * The chiral configuration of the second atom making the linkage.
     * @return StrColumn
     */
    public StrColumn getAtomStereoConfig2() {
        return delegate.getColumn("atom_stereo_config_2", DelegatingStrColumn::new);
    }

    /**
     * The bond order target for the chemical linkage.
     * @return StrColumn
     */
    public StrColumn getValueOrder() {
        return delegate.getColumn("value_order", DelegatingStrColumn::new);
    }

}