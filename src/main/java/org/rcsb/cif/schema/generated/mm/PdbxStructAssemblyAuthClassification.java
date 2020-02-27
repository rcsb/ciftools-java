package org.rcsb.cif.schema.generated.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Provides reason a particular assembly in pdbx_struct_assembly is
 * of interest.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxStructAssemblyAuthClassification extends DelegatingCategory {
    public PdbxStructAssemblyAuthClassification(Category delegate) {
        super(delegate);
    }

    /**
     * This item references an assembly in pdbx_struct_assembly
     * @return StrColumn
     */
    public StrColumn getAssemblyId() {
        return delegate.getColumn("assembly_id", DelegatingStrColumn::new);
    }

    /**
     * Provides the reason that a particular assembly is being studied
     * @return StrColumn
     */
    public StrColumn getReasonForInterest() {
        return delegate.getColumn("reason_for_interest", DelegatingStrColumn::new);
    }
}
