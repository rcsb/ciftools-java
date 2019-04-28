package org.rcsb.cif.model.generated.pdbxviewitem;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

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
     * @return ItemName
     */
    public ItemName getItemName() {
        return (ItemName) (isText ? textFields.computeIfAbsent("item_name",
                ItemName::new) : getBinaryColumn("item_name"));
    }

    /**
     * A pointer to the category_id in the PDBX_VIEW_CATEGORY category.
     * @return CategoryId
     */
    public CategoryId getCategoryId() {
        return (CategoryId) (isText ? textFields.computeIfAbsent("category_id",
                CategoryId::new) : getBinaryColumn("category_id"));
    }

    /**
     * An alias name for the mmCIF item in this view.
     * @return ItemViewName
     */
    public ItemViewName getItemViewName() {
        return (ItemViewName) (isText ? textFields.computeIfAbsent("item_view_name",
                ItemViewName::new) : getBinaryColumn("item_view_name"));
    }

    /**
     * A code to indicate the role of the data item in the view.
     * @return ItemViewMandatoryCode
     */
    public ItemViewMandatoryCode getItemViewMandatoryCode() {
        return (ItemViewMandatoryCode) (isText ? textFields.computeIfAbsent("item_view_mandatory_code",
                ItemViewMandatoryCode::new) : getBinaryColumn("item_view_mandatory_code"));
    }

    /**
     * A code to indicate if the view should permit alternatives
     * to enumerated item values.
     * @return ItemViewAllowAlternateValue
     */
    public ItemViewAllowAlternateValue getItemViewAllowAlternateValue() {
        return (ItemViewAllowAlternateValue) (isText ? textFields.computeIfAbsent("item_view_allow_alternate_value",
                ItemViewAllowAlternateValue::new) : getBinaryColumn("item_view_allow_alternate_value"));
    }
}
