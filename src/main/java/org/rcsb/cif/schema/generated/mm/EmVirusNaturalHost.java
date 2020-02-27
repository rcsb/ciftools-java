package org.rcsb.cif.schema.generated.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in this category record details of a virus entity.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class EmVirusNaturalHost extends DelegatingCategory {
    public EmVirusNaturalHost(Category delegate) {
        super(delegate);
    }

    /**
     * Pointer to _em_entity_assembly.id.
     * @return StrColumn
     */
    public StrColumn getEntityAssemblyId() {
        return delegate.getColumn("entity_assembly_id", DelegatingStrColumn::new);
    }

    /**
     * Unique identifier for the virus natural host.
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * The NCBI taxonomy of the host species from which the virus was isolated.
     * @return IntColumn
     */
    public IntColumn getNcbiTaxId() {
        return delegate.getColumn("ncbi_tax_id", DelegatingIntColumn::new);
    }

    /**
     * The host organism from which the virus was isolated.
     * @return StrColumn
     */
    public StrColumn getOrganism() {
        return delegate.getColumn("organism", DelegatingStrColumn::new);
    }

    /**
     * The strain of the host organism from which the virus was
     * obtained, if relevant.
     * @return StrColumn
     */
    public StrColumn getStrain() {
        return delegate.getColumn("strain", DelegatingStrColumn::new);
    }
}
