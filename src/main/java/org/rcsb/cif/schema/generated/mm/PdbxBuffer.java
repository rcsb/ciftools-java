package org.rcsb.cif.schema.generated.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_BUFFER category
 * record details of the sample buffer.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxBuffer extends DelegatingCategory {
    public PdbxBuffer(Category delegate) {
        super(delegate);
    }

    /**
     * The value of _pdbx_buffer.id must
     * uniquely identify the sample buffer.
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * The name of each buffer.
     * @return StrColumn
     */
    public StrColumn getName() {
        return delegate.getColumn("name", DelegatingStrColumn::new);
    }

    /**
     * Any additional details to do with buffer.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }
}
