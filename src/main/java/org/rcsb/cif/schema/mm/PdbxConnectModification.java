package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Local data items describing ligand and monomer
 * modifications.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxConnectModification extends DelegatingCategory {
    public PdbxConnectModification(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "res_name":
                return getResName();
            case "modification":
                return getModification();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * Unique (typically 3-letter code) identifier for chemical group.
     * @return StrColumn
     */
    public StrColumn getResName() {
        return delegate.getColumn("res_name", DelegatingStrColumn::new);
    }

    /**
     * Type of modification
     * @return StrColumn
     */
    public StrColumn getModification() {
        return delegate.getColumn("modification", DelegatingStrColumn::new);
    }

}