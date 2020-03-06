package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the STRUCT_NCS_DOM category record information
 * about the domains in an ensemble of domains related by one or
 * more noncrystallographic symmetry operators.
 * 
 * A domain need not correspond to a complete polypeptide chain;
 * it can be composed of one or more segments in a single chain,
 * or by segments from more than one chain.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class StructNcsDom extends DelegatingCategory {
    public StructNcsDom(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "details":
                return getDetails();
            case "id":
                return getId();
            case "pdbx_ens_id":
                return getPdbxEnsId();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * A description of special aspects of the structural elements that
     * comprise a domain in an ensemble of domains related by
     * noncrystallographic symmetry.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

    /**
     * The value of _struct_ncs_dom.id must uniquely identify a
     * record in the STRUCT_NCS_DOM list.
     * 
     * Note that this item need not be a number; it can be any unique
     * identifier.
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * This is a unique identifier for a collection NCS related domains.
     * This references item '_struct_ncs_ens.id'.
     * @return StrColumn
     */
    public StrColumn getPdbxEnsId() {
        return delegate.getColumn("pdbx_ens_id", DelegatingStrColumn::new);
    }

}