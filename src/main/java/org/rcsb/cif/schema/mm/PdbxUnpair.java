package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * These records give information about residues which do not pair
 * (h-bond) in the asymmetric unit.
 * 
 * The records about Watson-Crick base pairing depend on these
 * records.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxUnpair extends DelegatingCategory {
    public PdbxUnpair(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "chain_id":
                return getChainId();
            case "residue_name":
                return getResidueName();
            case "residue_number":
                return getResidueNumber();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * Strand id.
     * @return StrColumn
     */
    public StrColumn getChainId() {
        return delegate.getColumn("chain_id", DelegatingStrColumn::new);
    }

    /**
     * Name of residue which does not pair.
     * @return StrColumn
     */
    public StrColumn getResidueName() {
        return delegate.getColumn("residue_name", DelegatingStrColumn::new);
    }

    /**
     * Number of residue which does not pair.
     * @return StrColumn
     */
    public StrColumn getResidueNumber() {
        return delegate.getColumn("residue_number", DelegatingStrColumn::new);
    }

}