package org.rcsb.cif.model.structsitekeywords;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class StructSiteKeywords extends BaseCategory {
    public StructSiteKeywords(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public StructSiteKeywords(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public StructSiteKeywords(String name) {
        super(name);
    }

    /**
     * This data item is a pointer to _struct_site.id in the STRUCT_SITE
     * category.
     * @return SiteId
     */
    public SiteId getSiteId() {
        return (SiteId) (isText ? textFields.computeIfAbsent("site_id",
                SiteId::new) : getBinaryColumn("site_id"));
    }

    /**
     * Keywords describing this site.
     * @return Text
     */
    public Text getText() {
        return (Text) (isText ? textFields.computeIfAbsent("text",
                Text::new) : getBinaryColumn("text"));
    }
}
