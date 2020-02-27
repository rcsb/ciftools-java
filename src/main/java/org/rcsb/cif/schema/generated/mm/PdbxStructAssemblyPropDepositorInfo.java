package org.rcsb.cif.schema.generated.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_STRUCT_ASSEMBLY_PROP_DEPOSITOR_INFO category capture
 * depositor provided information related to the archival cateogory
 * PDBX_STRUCT_ASSEMBLY_PROP.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxStructAssemblyPropDepositorInfo extends DelegatingCategory {
    public PdbxStructAssemblyPropDepositorInfo(Category delegate) {
        super(delegate);
    }

    /**
     * The identifier for the assembly used in category STRUCT_BIOL.
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
