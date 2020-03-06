package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the STRUCT_KEYWORDS category specify keywords
 * that describe the chemical structure in this entry.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class StructKeywords extends DelegatingCategory {
    public StructKeywords(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "entry_id":
                return getEntryId();
            case "text":
                return getText();
            case "pdbx_keywords":
                return getPdbxKeywords();
            case "pdbx_details":
                return getPdbxDetails();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * This data item is a pointer to _entry.id in the ENTRY category.
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return delegate.getColumn("entry_id", DelegatingStrColumn::new);
    }

    /**
     * Keywords describing this structure.
     * @return StrColumn
     */
    public StrColumn getText() {
        return delegate.getColumn("text", DelegatingStrColumn::new);
    }

    /**
     * Terms characterizing the macromolecular structure.
     * @return StrColumn
     */
    public StrColumn getPdbxKeywords() {
        return delegate.getColumn("pdbx_keywords", DelegatingStrColumn::new);
    }

    /**
     * Keywords describing this structure.  This is constructed by the
     * PROGRAM for the PDB KEYWRD record.
     * @return StrColumn
     */
    public StrColumn getPdbxDetails() {
        return delegate.getColumn("pdbx_details", DelegatingStrColumn::new);
    }

}