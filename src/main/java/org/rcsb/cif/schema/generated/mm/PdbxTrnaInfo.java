package org.rcsb.cif.schema.generated.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_TRNA_INFO category are still used until
 * the 'entity' categories are entered into the database, even though the
 * T-RNA is repeated.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxTrnaInfo extends DelegatingCategory {
    public PdbxTrnaInfo(Category delegate) {
        super(delegate);
    }

    /**
     * Serial number.
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * Name of trna.
     * @return StrColumn
     */
    public StrColumn getName() {
        return delegate.getColumn("name", DelegatingStrColumn::new);
    }

    /**
     * Number of trna molecules per asymmetric unit.
     * @return IntColumn
     */
    public IntColumn getNumPerAsymUnit() {
        return delegate.getColumn("num_per_asym_unit", DelegatingIntColumn::new);
    }
}
