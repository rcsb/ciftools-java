package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_VIEW_CATEGORY specify the categories
 * belonging to a category view group.  An alias name for the
 * mmCIF category may also be specified for the each category
 * in the view.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxViewCategory extends DelegatingCategory {
    public PdbxViewCategory(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "view_group_id":
                return getViewGroupId();
            case "category_id":
                return getCategoryId();
            case "category_view_name":
                return getCategoryViewName();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * A pointer to the view_group_id in the PDBX_VIEW_CATEGORY_GROUP category.
     * @return StrColumn
     */
    public StrColumn getViewGroupId() {
        return delegate.getColumn("view_group_id", DelegatingStrColumn::new);
    }

    /**
     * The mmCIF category identifier.
     * @return StrColumn
     */
    public StrColumn getCategoryId() {
        return delegate.getColumn("category_id", DelegatingStrColumn::new);
    }

    /**
     * An alias name for the mmCIF category in this view.
     * @return StrColumn
     */
    public StrColumn getCategoryViewName() {
        return delegate.getColumn("category_view_name", DelegatingStrColumn::new);
    }

}