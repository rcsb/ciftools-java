package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the MA_TEMPLATE_CUSTOMIZED category record details about
 * the customized structural templates that are not from a reference database.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class MaTemplateCustomized extends DelegatingCategory {
    public MaTemplateCustomized(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "template_id":
                return getTemplateId();
            case "details":
                return getDetails();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * A unique identifier for this template record.
     * This data item is a pointer to _ma_template_details.template_id
     * in the MA_TEMPLATE_DETAILS category.
     * @return IntColumn
     */
    public IntColumn getTemplateId() {
        return delegate.getColumn("template_id", DelegatingIntColumn::new);
    }

    /**
     * Additional textual details about how the customized template was built.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

}