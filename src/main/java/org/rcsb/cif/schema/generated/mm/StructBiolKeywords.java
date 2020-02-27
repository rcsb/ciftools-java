package org.rcsb.cif.schema.generated.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the STRUCT_BIOL_KEYWORDS category record
 * keywords that describe each biological unit.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class StructBiolKeywords extends DelegatingCategory {
    public StructBiolKeywords(Category delegate) {
        super(delegate);
    }

    /**
     * This data item is a pointer to _struct_biol.id in the STRUCT_BIOL
     * category.
     * @return StrColumn
     */
    public StrColumn getBiolId() {
        return delegate.getColumn("biol_id", DelegatingStrColumn::new);
    }

    /**
     * Keywords describing this biological entity.
     * @return StrColumn
     */
    public StrColumn getText() {
        return delegate.getColumn("text", DelegatingStrColumn::new);
    }
}
