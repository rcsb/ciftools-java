package org.rcsb.cif.schema.generated.mm;

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
