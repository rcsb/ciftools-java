package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the DATABASE_PDB_REMARK category record details
 * about the data block as archived by the Protein Data Bank (PDB).
 * 
 * Some data appearing in PDB REMARK records can be
 * algorithmically extracted into the appropriate data items
 * in the data block.
 * 
 * These data items are included only for consistency with older
 * PDB format files. They should appear in a data block only if
 * that data block was created by reformatting a PDB format file.
 * 
 * NOTE: These remark records in this category are not uniformly
 * annotated by the PDB and may not be consistent with
 * nomenclature or labeling used in the entry.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class DatabasePDBRemark extends DelegatingCategory {
    public DatabasePDBRemark(Category delegate) {
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