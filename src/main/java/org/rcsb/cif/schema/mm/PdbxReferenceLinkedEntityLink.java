package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the pdbx_reference_linked_entity_link category enumerate
 * linkages between the entities in common observed interaction patterns
 * described in the pdbx_reference_linked_entity category.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxReferenceLinkedEntityLink extends DelegatingCategory {
    public PdbxReferenceLinkedEntityLink(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "linked_entity_id":
                return getLinkedEntityId();
            case "link_id":
                return getLinkId();
            case "from_list_id":
                return getFromListId();
            case "details":
                return getDetails();
            case "to_comp_id":
                return getToCompId();
            case "from_comp_id":
                return getFromCompId();
            case "to_atom_id":
                return getToAtomId();
            case "from_atom_id":
                return getFromAtomId();
            case "from_leaving_atom_id":
                return getFromLeavingAtomId();
            case "from_atom_stereo_config":
                return getFromAtomStereoConfig();
            case "value_order":
                return getValueOrder();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The value of _pdbx_reference_linked_entity_link.linked_entity_id is a reference
     * _pdbx_reference_linked_entity_comp_list.linked_entity_id in the pdbx_reference_linked_entity_comp_list
     * category.
     * @return IntColumn
     */
    public IntColumn getLinkedEntityId() {
        return delegate.getColumn("linked_entity_id", DelegatingIntColumn::new);
    }

    /**
     * The value of _pdbx_reference_linked_entity_link.link_id uniquely identifies
     * linkages within the linked entity.
     * @return IntColumn
     */
    public IntColumn getLinkId() {
        return delegate.getColumn("link_id", DelegatingIntColumn::new);
    }

    /**
     * The value of _pdbx_reference_linked_entity_link.from_list_id is a reference
     * _pdbx_reference_linked_entity_comp_list.list_id in the pdbx_reference_linked_entity_comp_list
     * category.
     * @return IntColumn
     */
    public IntColumn getFromListId() {
        return delegate.getColumn("from_list_id", DelegatingIntColumn::new);
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
    public StrColumn getToCompId() {
        return delegate.getColumn("to_comp_id", DelegatingStrColumn::new);
    }

    /**
     * The component identifier in the second of the two constituents containing the linkage.
     * @return StrColumn
     */
    public StrColumn getFromCompId() {
        return delegate.getColumn("from_comp_id", DelegatingStrColumn::new);
    }

    /**
     * The atom identifier/name in the first of the two constituents containing the linkage.
     * @return StrColumn
     */
    public StrColumn getToAtomId() {
        return delegate.getColumn("to_atom_id", DelegatingStrColumn::new);
    }

    /**
     * The atom identifier/name in the second of the two constituents containing the linkage.
     * @return StrColumn
     */
    public StrColumn getFromAtomId() {
        return delegate.getColumn("from_atom_id", DelegatingStrColumn::new);
    }

    /**
     * The leaving atom identifier/name bonded to the second atom making the linkage.
     * @return StrColumn
     */
    public StrColumn getFromLeavingAtomId() {
        return delegate.getColumn("from_leaving_atom_id", DelegatingStrColumn::new);
    }

    /**
     * The chiral configuration of the second atom making the linkage.
     * @return StrColumn
     */
    public StrColumn getFromAtomStereoConfig() {
        return delegate.getColumn("from_atom_stereo_config", DelegatingStrColumn::new);
    }

    /**
     * The bond order target for the chemical linkage.
     * @return StrColumn
     */
    public StrColumn getValueOrder() {
        return delegate.getColumn("value_order", DelegatingStrColumn::new);
    }

}