package org.rcsb.cif.schema.generated.mm;

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
