package org.rcsb.cif.schema.generated.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Properties and features of structural assemblies.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxStructAssemblyProp extends DelegatingCategory {
    public PdbxStructAssemblyProp(Category delegate) {
        super(delegate);
    }

    /**
     * The identifier for the assembly used in category PDBX_STRUCT_ASSEMBLY.
     * @return StrColumn
     */
    public StrColumn getBiolId() {
        return delegate.getColumn("biol_id", DelegatingStrColumn::new);
    }

    /**
     * The property type for the assembly.
     * @return StrColumn
     */
    public StrColumn getType() {
        return delegate.getColumn("type", DelegatingStrColumn::new);
    }

    /**
     * The value of the assembly property.
     * @return StrColumn
     */
    public StrColumn getValue() {
        return delegate.getColumn("value", DelegatingStrColumn::new);
    }

    /**
     * Additional details about this assembly property.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }
}
