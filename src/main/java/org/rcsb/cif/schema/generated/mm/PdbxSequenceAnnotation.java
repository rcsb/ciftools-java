package org.rcsb.cif.schema.generated.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * PDBX_SEQUENCE_ANNOTATION holds internal details about molecular sequences
 * described in the context of PDB chains.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxSequenceAnnotation extends DelegatingCategory {
    public PdbxSequenceAnnotation(Category delegate) {
        super(delegate);
    }

    /**
     * PDB chain ID.
     * @return StrColumn
     */
    public StrColumn getPdbChainId() {
        return delegate.getColumn("pdb_chain_id", DelegatingStrColumn::new);
    }

    /**
     * NCBI TaxID
     * @return StrColumn
     */
    public StrColumn getNcbiTaxid() {
        return delegate.getColumn("ncbi_taxid", DelegatingStrColumn::new);
    }
}
