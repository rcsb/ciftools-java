package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * There is only one item in the ENTRY category, _entry.id. This
 * data item gives a name to this entry and is indirectly a key to
 * the categories (such as CELL, GEOM, EXPTL) that describe
 * information pertinent to the entire data block.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class Entry extends DelegatingCategory {
    public Entry(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "id":
                return getId();
            case "pdbx_DOI":
                return getPdbxDOI();
            case "ma_collection_id":
                return getMaCollectionId();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The value of _entry.id identifies the data block.
     * 
     * Note that this item need not be a number; it can be any unique
     * identifier.
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * Document Object Identifier (DOI) for this entry registered
     * with http://crossref.org.
     * @return StrColumn
     */
    public StrColumn getPdbxDOI() {
        return delegate.getColumn("pdbx_DOI", DelegatingStrColumn::new);
    }

    /**
     * An identifier for the model collection associated with the entry.
     * @return StrColumn
     */
    public StrColumn getMaCollectionId() {
        return delegate.getColumn("ma_collection_id", DelegatingStrColumn::new);
    }

}