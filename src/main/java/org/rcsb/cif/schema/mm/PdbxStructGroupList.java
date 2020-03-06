package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_STRUCT_GROUP_LIST define groups of related components
 * or atoms.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxStructGroupList extends DelegatingCategory {
    public PdbxStructGroupList(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "struct_group_id":
                return getStructGroupId();
            case "name":
                return getName();
            case "type":
                return getType();
            case "group_enumeration_type":
                return getGroupEnumerationType();
            case "description":
                return getDescription();
            case "selection":
                return getSelection();
            case "selection_details":
                return getSelectionDetails();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The unique identifier for the group.
     * @return StrColumn
     */
    public StrColumn getStructGroupId() {
        return delegate.getColumn("struct_group_id", DelegatingStrColumn::new);
    }

    /**
     * The name of the group.
     * @return StrColumn
     */
    public StrColumn getName() {
        return delegate.getColumn("name", DelegatingStrColumn::new);
    }

    /**
     * A selected list of group types.
     * @return StrColumn
     */
    public StrColumn getType() {
        return delegate.getColumn("type", DelegatingStrColumn::new);
    }

    /**
     * The manner in which the group is defined.  Groups consist of collections
     * within the set of deposited coordinates which can be defined in terms of
     * a list of chemical components in category PDBX_STRUCT_GROUP_COMPONENTS,
     * ranges of chemical components in PDBX_STRUCT_GROUP_COMPONENT_RANGE,
     * or as individual atoms using _atom_site.pdbx_group_id.
     * 
     * Groups can be composed of selections from multiple categories in which
     * case the enumeration types are separated by commas.
     * @return StrColumn
     */
    public StrColumn getGroupEnumerationType() {
        return delegate.getColumn("group_enumeration_type", DelegatingStrColumn::new);
    }

    /**
     * The description of the group.
     * @return StrColumn
     */
    public StrColumn getDescription() {
        return delegate.getColumn("description", DelegatingStrColumn::new);
    }

    /**
     * A qualification of the subset of atoms in the group.
     * @return StrColumn
     */
    public StrColumn getSelection() {
        return delegate.getColumn("selection", DelegatingStrColumn::new);
    }

    /**
     * A text description of subset of the atom selection in the group.
     * @return StrColumn
     */
    public StrColumn getSelectionDetails() {
        return delegate.getColumn("selection_details", DelegatingStrColumn::new);
    }

}