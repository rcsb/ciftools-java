package org.rcsb.cif.schema.generated.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * These records give information about residues which do not pair
 * (h-bond) in the asymmetric unit.
 * 
 * The records about Watson-Crick base pairing depend on these
 * records.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxUnpair extends DelegatingCategory {
    public PdbxUnpair(Category delegate) {
        super(delegate);
    }

    /**
     * Strand id.
     * @return StrColumn
     */
    public StrColumn getChainId() {
        return delegate.getColumn("chain_id", DelegatingStrColumn::new);
    }

    /**
     * Name of residue which does not pair.
     * @return StrColumn
     */
    public StrColumn getResidueName() {
        return delegate.getColumn("residue_name", DelegatingStrColumn::new);
    }

    /**
     * Number of residue which does not pair.
     * @return StrColumn
     */
    public StrColumn getResidueNumber() {
        return delegate.getColumn("residue_number", DelegatingStrColumn::new);
    }
}
