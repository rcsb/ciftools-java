package org.rcsb.cif.schema.generated.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Local data items describing ligand and monomer
 * modifications.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxConnectModification extends DelegatingCategory {
    public PdbxConnectModification(Category delegate) {
        super(delegate);
    }

    /**
     * Unique (typically 3-letter code) identifier for chemical group.
     * @return StrColumn
     */
    public StrColumn getResName() {
        return delegate.getColumn("res_name", DelegatingStrColumn::new);
    }

    /**
     * Type of modification
     * @return StrColumn
     */
    public StrColumn getModification() {
        return delegate.getColumn("modification", DelegatingStrColumn::new);
    }
}
