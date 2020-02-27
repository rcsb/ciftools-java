package org.rcsb.cif.schema.generated.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * 
 * Experimental details of the NMR study that have not been
 * described elsewhere in this deposition.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxNmrDetails extends DelegatingCategory {
    public PdbxNmrDetails(Category delegate) {
        super(delegate);
    }

    /**
     * The entry ID for the structure determination.
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return delegate.getColumn("entry_id", DelegatingStrColumn::new);
    }

    /**
     * Additional details describing the NMR experiment.
     * @return StrColumn
     */
    public StrColumn getText() {
        return delegate.getColumn("text", DelegatingStrColumn::new);
    }
}
