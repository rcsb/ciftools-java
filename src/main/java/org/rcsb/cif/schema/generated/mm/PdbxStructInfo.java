package org.rcsb.cif.schema.generated.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Special features of this structural entry.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxStructInfo extends DelegatingCategory {
    public PdbxStructInfo(Category delegate) {
        super(delegate);
    }

    /**
     * The information category/type for this item.
     * @return StrColumn
     */
    public StrColumn getType() {
        return delegate.getColumn("type", DelegatingStrColumn::new);
    }

    /**
     * The value of this information item.
     * @return StrColumn
     */
    public StrColumn getValue() {
        return delegate.getColumn("value", DelegatingStrColumn::new);
    }

    /**
     * Additional details about this information item.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }
}
