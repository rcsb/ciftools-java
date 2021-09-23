package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the MA_POLY_TEMPLATE_LIBRARY_COMPONENTS category record details about
 * the components in a template library.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class MaPolyTemplateLibraryComponents extends DelegatingCategory {
    public MaPolyTemplateLibraryComponents(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "ordinal_id":
                return getOrdinalId();
            case "template_id":
                return getTemplateId();
            case "library_id":
                return getLibraryId();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * A unique identifier for the category.
     * @return IntColumn
     */
    public IntColumn getOrdinalId() {
        return delegate.getColumn("ordinal_id", DelegatingIntColumn::new);
    }

    /**
     * An identifier for the template in the template library.
     * This data item is a pointer to _ma_poly_template_library_list.template_id
     * in the MA_POLY_TEMPLATE_LIBRARY_LIST category.
     * @return IntColumn
     */
    public IntColumn getTemplateId() {
        return delegate.getColumn("template_id", DelegatingIntColumn::new);
    }

    /**
     * The identifier for the template library.
     * This data item is a pointer to _ma_poly_template_library_details.library_id in the
     * MA_POLY_TEMPLATE_LIBRARY_DETAILS category.
     * @return IntColumn
     */
    public IntColumn getLibraryId() {
        return delegate.getColumn("library_id", DelegatingIntColumn::new);
    }

}