package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_DOMAIN category record information
 * about domain definitions.
 * 
 * A domain need not correspond to a completely polypeptide chain;
 * it can be composed of one or more segments in a single chain,
 * or by segments from more than one chain.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxDomain extends DelegatingCategory {
    public PdbxDomain(Category delegate) {
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
     * A description of special aspects of the structural elements that
     * comprise a domain.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

    /**
     * The value of _pdbx_domain.id must uniquely identify a
     * record in the PDBX_DOMAIN list.
     * 
     * Note that this item need not be a number; it can be any unique
     * identifier.
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

}