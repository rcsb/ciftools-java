package org.rcsb.cif.model.pdbxdepositgroup;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxDepositGroup extends BaseCategory {
    public PdbxDepositGroup(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxDepositGroup(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxDepositGroup(String name) {
        super(name);
    }

    /**
     * A unique identifier for a group of entries deposited as a collection.
     * @return GroupId
     */
    public GroupId getGroupId() {
        return (GroupId) (isText ? textFields.computeIfAbsent("group_id",
                GroupId::new) : getBinaryColumn("group_id"));
    }

    /**
     * A title to describe the group of entries deposited in the collection.
     * @return GroupTitle
     */
    public GroupTitle getGroupTitle() {
        return (GroupTitle) (isText ? textFields.computeIfAbsent("group_title",
                GroupTitle::new) : getBinaryColumn("group_title"));
    }

    /**
     * A description of the contents of entries in the collection.
     * @return GroupDescription
     */
    public GroupDescription getGroupDescription() {
        return (GroupDescription) (isText ? textFields.computeIfAbsent("group_description",
                GroupDescription::new) : getBinaryColumn("group_description"));
    }

    /**
     * Text to describe a grouping of entries in multiple collections
     * @return GroupType
     */
    public GroupType getGroupType() {
        return (GroupType) (isText ? textFields.computeIfAbsent("group_type",
                GroupType::new) : getBinaryColumn("group_type"));
    }
}
