package org.rcsb.cif.schema.generated.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data item will still be used until the ENTITY category is fully
 * adopted by NDBQuery.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxSource extends DelegatingCategory {
    public PdbxSource(Category delegate) {
        super(delegate);
    }

    /**
     * Source of biological unit.  Mostly: SYNTHETIC
     * @return StrColumn
     */
    public StrColumn getSrcMethod() {
        return delegate.getColumn("src_method", DelegatingStrColumn::new);
    }
}
