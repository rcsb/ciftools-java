package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_VIEW_CATEGORY_GROUP identify collections
 * of related mmCIF categories.  Views provide a vehicle for
 * presenting different logical arrangements of dictionary contents.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return StrColumn
     */
    public StrColumn getViewGroupId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("view_group_id", StrColumn::new) :
                getBinaryColumn("view_group_id"));
    }

    /**
     * A description for this collection of categories.
     * @return StrColumn
     */
    public StrColumn getDescription() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("description", StrColumn::new) :
                getBinaryColumn("description"));
    }
}
