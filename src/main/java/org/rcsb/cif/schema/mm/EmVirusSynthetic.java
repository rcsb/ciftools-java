package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in this category record details of a synthetic virus entity.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class EmVirusSynthetic extends DelegatingCategory {
    public EmVirusSynthetic(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "entity_assembly_id":
                return getEntityAssemblyId();
            case "id":
                return getId();
            case "organism":
                return getOrganism();
            case "ncbi_tax_id":
                return getNcbiTaxId();
            case "strain":
                return getStrain();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * Pointer to _em_entity_assembly.id.
     * @return StrColumn
     */
    public StrColumn getEntityAssemblyId() {
        return delegate.getColumn("entity_assembly_id", DelegatingStrColumn::new);
    }

    /**
     * PRIMARY KEY
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * The host organism from which the virus was isolated.
     * @return StrColumn
     */
    public StrColumn getOrganism() {
        return delegate.getColumn("organism", DelegatingStrColumn::new);
    }

    /**
     * The NCBI taxonomy ID of the host species from which the virus was isolated
     * @return IntColumn
     */
    public IntColumn getNcbiTaxId() {
        return delegate.getColumn("ncbi_tax_id", DelegatingIntColumn::new);
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