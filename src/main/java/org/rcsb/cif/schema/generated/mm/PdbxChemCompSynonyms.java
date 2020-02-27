package org.rcsb.cif.schema.generated.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * PDBX_CHEM_COMP_SYNONYMS holds chemical name and synonym correspondences.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxChemCompSynonyms extends DelegatingCategory {
    public PdbxChemCompSynonyms(Category delegate) {
        super(delegate);
    }

    /**
     * The synonym of this particular chemical component.
     * @return StrColumn
     */
    public StrColumn getName() {
        return delegate.getColumn("name", DelegatingStrColumn::new);
    }

    /**
     * The chemical component for which this synonym applies.
     * @return StrColumn
     */
    public StrColumn getCompId() {
        return delegate.getColumn("comp_id", DelegatingStrColumn::new);
    }

    /**
     * The provenance of this synonym.
     * @return StrColumn
     */
    public StrColumn getProvenance() {
        return delegate.getColumn("provenance", DelegatingStrColumn::new);
    }
}
