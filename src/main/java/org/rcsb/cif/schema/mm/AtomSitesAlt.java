package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the ATOM_SITES_ALT category record details
 * about the structural ensembles that should be generated from
 * atom sites or groups of atom sites that are modelled in
 * alternative conformations in this data block.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class AtomSitesAlt extends DelegatingCategory {
    public AtomSitesAlt(Category delegate) {
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
     * A description of special aspects of the modelling of atoms in
     * alternative conformations.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

    /**
     * The value of _atom_sites_alt.id must uniquely identify
     * a record in the ATOM_SITES_ALT list.
     * 
     * Note that this item need not be a number; it can be any unique
     * identifier.
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

}