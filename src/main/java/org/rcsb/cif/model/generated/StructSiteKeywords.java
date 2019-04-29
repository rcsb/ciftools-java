package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the STRUCT_SITE_KEYWORDS category record
 * keywords describing the site.
 */
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
     * @return StrColumn
     */
    public StrColumn getSiteId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("site_id", StrColumn::new) :
                getBinaryColumn("site_id"));
    }

    /**
     * Keywords describing this site.
     * @return StrColumn
     */
    public StrColumn getText() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("text", StrColumn::new) :
                getBinaryColumn("text"));
    }
}
