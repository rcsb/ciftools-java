package org.rcsb.cif.schema.generated.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the CHEM_LINK category give details about
 * the links between chemical components.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class ChemLink extends DelegatingCategory {
    public ChemLink(Category delegate) {
        super(delegate);
    }

    /**
     * The value of _chem_link.id must uniquely identify each
     * item in the CHEM_LINK list.
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * A description of special aspects of a link between
     * chemical components in the structure.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }
}
