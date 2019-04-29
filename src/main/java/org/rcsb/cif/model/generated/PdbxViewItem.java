package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_VIEW_ITEM specify the mmCIF data items
 * belonging to a view category.  An alias name for the
 * the mmCIF item may be specified for the each item in the
 * view category.  The role of the item in the view category
 * can be designated as mandatory, optional, or hidden.
 */
@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxViewItem extends BaseCategory {
    public PdbxViewItem(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxViewItem(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxViewItem(String name) {
        super(name);
    }

    /**
     * The mmCIF item name.
     * @return StrColumn
     */
    public StrColumn getItemName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("item_name", StrColumn::new) :
                getBinaryColumn("item_name"));
    }

    /**
     * A pointer to the category_id in the PDBX_VIEW_CATEGORY category.
     * @return StrColumn
     */
    public StrColumn getCategoryId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("category_id", StrColumn::new) :
                getBinaryColumn("category_id"));
    }

    /**
     * An alias name for the mmCIF item in this view.
     * @return StrColumn
     */
    public StrColumn getItemViewName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("item_view_name", StrColumn::new) :
                getBinaryColumn("item_view_name"));
    }

    /**
     * A code to indicate the role of the data item in the view.
     * @return StrColumn
     */
    public StrColumn getItemViewMandatoryCode() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("item_view_mandatory_code", StrColumn::new) :
                getBinaryColumn("item_view_mandatory_code"));
    }

    /**
     * A code to indicate if the view should permit alternatives
     * to enumerated item values.
     * @return StrColumn
     */
    public StrColumn getItemViewAllowAlternateValue() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("item_view_allow_alternate_value", StrColumn::new) :
                getBinaryColumn("item_view_allow_alternate_value"));
    }
}
