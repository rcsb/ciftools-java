package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the DATABASE_PDB_CAVEAT category record details
 * about features of the data block flagged as 'caveats' by the
 * Protein Data Bank (PDB).
 * 
 * These data items are included only for consistency with PDB
 * format files. They should appear in a data block only if that
 * data block was created by reformatting a PDB format file.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class DatabasePDBCaveat extends DelegatingCategory {
    public DatabasePDBCaveat(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "id":
                return getId();
            case "text":
                return getText();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * A unique identifier for the PDB caveat record.
     * @return IntColumn
     */
    public IntColumn getId() {
        return delegate.getColumn("id", DelegatingIntColumn::new);
    }

    /**
     * The full text of the PDB caveat record.
     * @return StrColumn
     */
    public StrColumn getText() {
        return delegate.getColumn("text", DelegatingStrColumn::new);
    }

}