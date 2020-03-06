package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * The PDBX_DATABASE_PDB_OBS_SPR category provides placeholders
 * for information on obsolete/superseded PDB entries
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxDatabasePDBObsSpr extends DelegatingCategory {
    public PdbxDatabasePDBObsSpr(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "id":
                return getId();
            case "date":
                return getDate();
            case "pdb_id":
                return getPdbId();
            case "replace_pdb_id":
                return getReplacePdbId();
            case "details":
                return getDetails();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * Identifier for the type of obsolete entry to be added to this entry.
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * The date of replacement.
     * @return StrColumn
     */
    public StrColumn getDate() {
        return delegate.getColumn("date", DelegatingStrColumn::new);
    }

    /**
     * The new PDB identifier for the replaced entry.
     * @return StrColumn
     */
    public StrColumn getPdbId() {
        return delegate.getColumn("pdb_id", DelegatingStrColumn::new);
    }

    /**
     * The PDB identifier for the replaced (OLD) entry/entries.
     * @return StrColumn
     */
    public StrColumn getReplacePdbId() {
        return delegate.getColumn("replace_pdb_id", DelegatingStrColumn::new);
    }

    /**
     * Details related to the replaced or replacing entry.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

}