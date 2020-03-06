package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the ATOM_SITES_ALT_GEN category record details
 * about the interpretation of multiple conformations in the
 * structure.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class AtomSitesAltGen extends DelegatingCategory {
    public AtomSitesAltGen(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "alt_id":
                return getAltId();
            case "ens_id":
                return getEnsId();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * This data item is a pointer to _atom_sites_alt.id in the
     * ATOM_SITES_ALT category.
     * @return StrColumn
     */
    public StrColumn getAltId() {
        return delegate.getColumn("alt_id", DelegatingStrColumn::new);
    }

    /**
     * This data item is a pointer to _atom_sites_alt_ens.id in the
     * ATOM_SITES_ALT_ENS category.
     * @return StrColumn
     */
    public StrColumn getEnsId() {
        return delegate.getColumn("ens_id", DelegatingStrColumn::new);
    }

}