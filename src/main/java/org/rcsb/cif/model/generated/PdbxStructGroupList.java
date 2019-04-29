package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_STRUCT_GROUP_LIST define groups of related components
 * or atoms.
 */
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
     * @return StrColumn
     */
    public StrColumn getStructGroupId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("struct_group_id", StrColumn::new) :
                getBinaryColumn("struct_group_id"));
    }

    /**
     * The name of the group.
     * @return StrColumn
     */
    public StrColumn getName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("name", StrColumn::new) :
                getBinaryColumn("name"));
    }

    /**
     * A selected list of group types.
     * @return StrColumn
     */
    public StrColumn getType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("type", StrColumn::new) :
                getBinaryColumn("type"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("group_enumeration_type", StrColumn::new) :
                getBinaryColumn("group_enumeration_type"));
    }

    /**
     * The description of the group.
     * @return StrColumn
     */
    public StrColumn getDescription() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("description", StrColumn::new) :
                getBinaryColumn("description"));
    }

    /**
     * A qualification of the subset of atoms in the group.
     * @return StrColumn
     */
    public StrColumn getSelection() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("selection", StrColumn::new) :
                getBinaryColumn("selection"));
    }

    /**
     * A text description of subset of the atom selection in the group.
     * @return StrColumn
     */
    public StrColumn getSelectionDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("selection_details", StrColumn::new) :
                getBinaryColumn("selection_details"));
    }
}
