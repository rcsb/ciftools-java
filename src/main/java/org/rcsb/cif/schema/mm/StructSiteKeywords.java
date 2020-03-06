package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the STRUCT_SITE_KEYWORDS category record
 * keywords describing the site.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class StructSiteKeywords extends DelegatingCategory {
    public StructSiteKeywords(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "site_id":
                return getSiteId();
            case "text":
                return getText();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * This data item is a pointer to _struct_site.id in the STRUCT_SITE
     * category.
     * @return StrColumn
     */
    public StrColumn getSiteId() {
        return delegate.getColumn("site_id", DelegatingStrColumn::new);
    }

    /**
     * Keywords describing this site.
     * @return StrColumn
     */
    public StrColumn getText() {
        return delegate.getColumn("text", DelegatingStrColumn::new);
    }

}