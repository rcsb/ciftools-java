package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_VIEW_ITEM specify the mmCIF data items
 * belonging to a view category.  An alias name for the
 * mmCIF item may be specified for the each item in the view
 * category.  The role of the item in the view category
 * can be designated as mandatory, optional, or hidden.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxViewItem extends DelegatingCategory {
    public PdbxViewItem(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "item_name":
                return getItemName();
            case "category_id":
                return getCategoryId();
            case "item_view_name":
                return getItemViewName();
            case "item_view_mandatory_code":
                return getItemViewMandatoryCode();
            case "item_view_allow_alternate_value":
                return getItemViewAllowAlternateValue();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The mmCIF item name.
     * @return StrColumn
     */
    public StrColumn getItemName() {
        return delegate.getColumn("item_name", DelegatingStrColumn::new);
    }

    /**
     * A pointer to the category_id in the PDBX_VIEW_CATEGORY category.
     * @return StrColumn
     */
    public StrColumn getCategoryId() {
        return delegate.getColumn("category_id", DelegatingStrColumn::new);
    }

    /**
     * An alias name for the mmCIF item in this view.
     * @return StrColumn
     */
    public StrColumn getItemViewName() {
        return delegate.getColumn("item_view_name", DelegatingStrColumn::new);
    }

    /**
     * A code to indicate the role of the data item in the view.
     * @return StrColumn
     */
    public StrColumn getItemViewMandatoryCode() {
        return delegate.getColumn("item_view_mandatory_code", DelegatingStrColumn::new);
    }

    /**
     * A code to indicate if the view should permit alternatives
     * to enumerated item values.
     * @return StrColumn
     */
    public StrColumn getItemViewAllowAlternateValue() {
        return delegate.getColumn("item_view_allow_alternate_value", DelegatingStrColumn::new);
    }

}