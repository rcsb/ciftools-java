package org.rcsb.cif.schema.generated.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Provides author supplied evidentiary support for assemblies
 * in pdbx_struct_assembly.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxStructAssemblyAuthEvidenceDepositorInfo extends DelegatingCategory {
    public PdbxStructAssemblyAuthEvidenceDepositorInfo(Category delegate) {
        super(delegate);
    }

    /**
     * Identifies a unique record in pdbx_struct_assembly_auth_evidence_depositor_info.
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * This item references an assembly in pdbx_struct_assembly
     * @return StrColumn
     */
    public StrColumn getAssemblyId() {
        return delegate.getColumn("assembly_id", DelegatingStrColumn::new);
    }

    /**
     * Provides the experimental method to determine the state of this assembly
     * @return StrColumn
     */
    public StrColumn getExperimentalSupport() {
        return delegate.getColumn("experimental_support", DelegatingStrColumn::new);
    }

    /**
     * Provides any additional information regarding the evidence of this assembly
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }
}
