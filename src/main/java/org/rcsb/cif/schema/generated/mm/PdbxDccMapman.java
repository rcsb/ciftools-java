package org.rcsb.cif.schema.generated.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the category record details from the output of mapman
 * used by the DCC program.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxDccMapman extends DelegatingCategory {
    public PdbxDccMapman(Category delegate) {
        super(delegate);
    }

    /**
     * The PDB id code.
     * @return StrColumn
     */
    public StrColumn getPdbid() {
        return delegate.getColumn("pdbid", DelegatingStrColumn::new);
    }

    /**
     * The details of the use of mapman by the DCC program.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }
}
