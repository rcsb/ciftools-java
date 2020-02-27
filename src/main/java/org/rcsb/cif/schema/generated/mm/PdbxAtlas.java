package org.rcsb.cif.schema.generated.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Gives information about the organization of the
 * NDB Structural Atlas.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxAtlas extends DelegatingCategory {
    public PdbxAtlas(Category delegate) {
        super(delegate);
    }

    /**
     * Entry ID.
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return delegate.getColumn("entry_id", DelegatingStrColumn::new);
    }

    /**
     * A unique identifier for a NDB ATLAS index page.
     * @return IntColumn
     */
    public IntColumn getPageId() {
        return delegate.getColumn("page_id", DelegatingIntColumn::new);
    }

    /**
     * Text of the Atlas index entry.
     * @return StrColumn
     */
    public StrColumn getPageName() {
        return delegate.getColumn("page_name", DelegatingStrColumn::new);
    }
}
