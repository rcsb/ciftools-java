package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Local data items describing ligand and monomer
 * type information.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxConnectType extends DelegatingCategory {
    public PdbxConnectType(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "res_name":
                return getResName();
            case "ndbTokenType":
                return getNdbTokenType();
            case "modified":
                return getModified();
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
     * Internal chemical type identifier used by NDB.
     * @return StrColumn
     */
    public StrColumn getNdbTokenType() {
        return delegate.getColumn("ndbTokenType", DelegatingStrColumn::new);
    }

    /**
     * Indicates a modified chemical component.
     * @return StrColumn
     */
    public StrColumn getModified() {
        return delegate.getColumn("modified", DelegatingStrColumn::new);
    }

}