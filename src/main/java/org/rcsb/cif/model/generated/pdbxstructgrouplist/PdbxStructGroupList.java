package org.rcsb.cif.model.generated.pdbxstructgrouplist;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxStructGroupList extends BaseCategory {
    public PdbxStructGroupList(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxStructGroupList(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxStructGroupList(String name) {
        super(name);
    }

    /**
     * The unique identifier for the group.
     * @return StructGroupId
     */
    public StructGroupId getStructGroupId() {
        return (StructGroupId) (isText ? textFields.computeIfAbsent("struct_group_id",
                StructGroupId::new) : getBinaryColumn("struct_group_id"));
    }

    /**
     * The name of the group.
     * @return Name
     */
    public Name getName() {
        return (Name) (isText ? textFields.computeIfAbsent("name",
                Name::new) : getBinaryColumn("name"));
    }

    /**
     * A selected list of group types.
     * @return Type
     */
    public Type getType() {
        return (Type) (isText ? textFields.computeIfAbsent("type",
                Type::new) : getBinaryColumn("type"));
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
     * @return GroupEnumerationType
     */
    public GroupEnumerationType getGroupEnumerationType() {
        return (GroupEnumerationType) (isText ? textFields.computeIfAbsent("group_enumeration_type",
                GroupEnumerationType::new) : getBinaryColumn("group_enumeration_type"));
    }

    /**
     * The description of the group.
     * @return Description
     */
    public Description getDescription() {
        return (Description) (isText ? textFields.computeIfAbsent("description",
                Description::new) : getBinaryColumn("description"));
    }

    /**
     * A qualification of the subset of atoms in the group.
     * @return Selection
     */
    public Selection getSelection() {
        return (Selection) (isText ? textFields.computeIfAbsent("selection",
                Selection::new) : getBinaryColumn("selection"));
    }

    /**
     * A text description of subset of the atom selection in the group.
     * @return SelectionDetails
     */
    public SelectionDetails getSelectionDetails() {
        return (SelectionDetails) (isText ? textFields.computeIfAbsent("selection_details",
                SelectionDetails::new) : getBinaryColumn("selection_details"));
    }
}
