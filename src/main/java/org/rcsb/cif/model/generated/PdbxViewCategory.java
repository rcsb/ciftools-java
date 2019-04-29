package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_VIEW_CATEGORY specify the categories
 * belonging to a category view group.  An alias name for the
 * the mmCIF category may also be specified for the each
 * category in the view.
 */
@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxViewCategory extends BaseCategory {
    public PdbxViewCategory(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxViewCategory(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxViewCategory(String name) {
        super(name);
    }

    /**
     * A pointer to the view_group_id in the PDBX_VIEW_CATEGORY_GROUP category.
     * @return StrColumn
     */
    public StrColumn getViewGroupId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("view_group_id", StrColumn::new) :
                getBinaryColumn("view_group_id"));
    }

    /**
     * The mmCIF category identifier.
     * @return StrColumn
     */
    public StrColumn getCategoryId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("category_id", StrColumn::new) :
                getBinaryColumn("category_id"));
    }

    /**
     * An alias name for the mmCIF category in this view.
     * @return StrColumn
     */
    public StrColumn getCategoryViewName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("category_view_name", StrColumn::new) :
                getBinaryColumn("category_view_name"));
    }
}
