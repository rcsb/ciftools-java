package org.rcsb.cif.schema.generated.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_VIEW_CATEGORY_GROUP identify collections
 * of related mmCIF categories.  Views provide a vehicle for
 * presenting different logical arrangements of dictionary contents.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxViewCategoryGroup extends DelegatingCategory {
    public PdbxViewCategoryGroup(Category delegate) {
        super(delegate);
    }

    /**
     * The identifier for a collection of related mmCIF categories.
     * @return StrColumn
     */
    public StrColumn getViewGroupId() {
        return delegate.getColumn("view_group_id", DelegatingStrColumn::new);
    }

    /**
     * A description for this collection of categories.
     * @return StrColumn
     */
    public StrColumn getDescription() {
        return delegate.getColumn("description", DelegatingStrColumn::new);
    }
}
