package org.rcsb.cif.model.generated.pdbxviewcategory;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

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
     * @return ViewGroupId
     */
    public ViewGroupId getViewGroupId() {
        return (ViewGroupId) (isText ? textFields.computeIfAbsent("view_group_id",
                ViewGroupId::new) : getBinaryColumn("view_group_id"));
    }

    /**
     * The mmCIF category identifier.
     * @return CategoryId
     */
    public CategoryId getCategoryId() {
        return (CategoryId) (isText ? textFields.computeIfAbsent("category_id",
                CategoryId::new) : getBinaryColumn("category_id"));
    }

    /**
     * An alias name for the mmCIF category in this view.
     * @return CategoryViewName
     */
    public CategoryViewName getCategoryViewName() {
        return (CategoryViewName) (isText ? textFields.computeIfAbsent("category_view_name",
                CategoryViewName::new) : getBinaryColumn("category_view_name"));
    }
}
