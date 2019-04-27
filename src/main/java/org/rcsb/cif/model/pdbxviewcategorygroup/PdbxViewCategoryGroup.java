package org.rcsb.cif.model.pdbxviewcategorygroup;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxViewCategoryGroup extends BaseCategory {
    public PdbxViewCategoryGroup(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxViewCategoryGroup(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxViewCategoryGroup(String name) {
        super(name);
    }

    /**
     * The identifier for a collection of related mmCIF categories.
     * @return ViewGroupId
     */
    public ViewGroupId getViewGroupId() {
        return (ViewGroupId) (isText ? textFields.computeIfAbsent("view_group_id",
                ViewGroupId::new) : getBinaryColumn("view_group_id"));
    }

    /**
     * A description for this collection of categories.
     * @return Description
     */
    public Description getDescription() {
        return (Description) (isText ? textFields.computeIfAbsent("description",
                Description::new) : getBinaryColumn("description"));
    }
}
