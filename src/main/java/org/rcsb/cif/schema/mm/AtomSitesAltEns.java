package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the ATOM_SITES_ALT_ENS category record details
 * about the ensemble structure generated from atoms with various
 * alternative conformation IDs.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class AtomSitesAltEns extends DelegatingCategory {
    public AtomSitesAltEns(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "details":
                return getDetails();
            case "id":
                return getId();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * A description of special aspects of the ensemble structure
     * generated from atoms with various alternative IDs.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

    /**
     * The value of _atom_sites_alt_ens.id must uniquely identify a
     * record in the ATOM_SITES_ALT_ENS list.
     * 
     * Note that this item need not be a number; it can be any unique
     * identifier.
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

}