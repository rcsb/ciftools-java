package org.rcsb.cif.schema.generated.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Category to collect the authors of this entry
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class EmAuthorList extends DelegatingCategory {
    public EmAuthorList(Category delegate) {
        super(delegate);
    }

    /**
     * Author of the EMDB entry in PDB format: Taylor, T.J.
     * @return StrColumn
     */
    public StrColumn getAuthor() {
        return delegate.getColumn("author", DelegatingStrColumn::new);
    }

    /**
     * ID 1 corresponds to the main author of the entry
     * @return IntColumn
     */
    public IntColumn getOrdinal() {
        return delegate.getColumn("ordinal", DelegatingIntColumn::new);
    }
}
