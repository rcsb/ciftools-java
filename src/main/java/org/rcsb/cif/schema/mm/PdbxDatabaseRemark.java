package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_DATABASE_REMARK category record keep additional
 * information about the entry.  They are mostly used to create
 * 'non-standard' PDB REMARK annotations (6-99).
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxDatabaseRemark extends DelegatingCategory {
    public PdbxDatabaseRemark(Category delegate) {
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
     * A unique identifier for the PDB remark record.
     * @return IntColumn
     */
    public IntColumn getId() {
        return delegate.getColumn("id", DelegatingIntColumn::new);
    }

    /**
     * The full text of the PDB remark record.
     * @return StrColumn
     */
    public StrColumn getText() {
        return delegate.getColumn("text", DelegatingStrColumn::new);
    }

}