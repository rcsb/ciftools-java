package org.rcsb.cif.schema.generated.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_PROTEIN_INFO category are still used until
 * the 'entity' categories are entered into the database, even though the
 * information is repeated.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxProteinInfo extends DelegatingCategory {
    public PdbxProteinInfo(Category delegate) {
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
     * Name of protein.
     * @return StrColumn
     */
    public StrColumn getName() {
        return delegate.getColumn("name", DelegatingStrColumn::new);
    }

    /**
     * Number of protein molecules per asymmetric unit.
     * @return IntColumn
     */
    public IntColumn getNumPerAsymUnit() {
        return delegate.getColumn("num_per_asym_unit", DelegatingIntColumn::new);
    }
}
