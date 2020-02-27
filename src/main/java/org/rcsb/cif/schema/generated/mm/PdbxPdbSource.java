package org.rcsb.cif.schema.generated.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * This is a place holder for the PDB SOURCE.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxPdbSource extends DelegatingCategory {
    public PdbxPdbSource(Category delegate) {
        super(delegate);
    }

    /**
     * NDB ID.
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * PDB SOURCE record.
     * @return StrColumn
     */
    public StrColumn getText() {
        return delegate.getColumn("text", DelegatingStrColumn::new);
    }
}
