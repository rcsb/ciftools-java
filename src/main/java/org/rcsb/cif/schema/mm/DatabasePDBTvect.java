package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * The DATABASE_PDB_TVECT category provides placeholders for
 * the TVECT matrices and vectors used by the Protein Data
 * Bank (PDB).
 * 
 * These data items are included only for consistency with older
 * PDB format files. They should appear in a data block only if
 * the data block was created by reformatting a PDB format file.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class DatabasePDBTvect extends DelegatingCategory {
    public DatabasePDBTvect(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "details":
                return getDetails();
            case "id":
                return getId();
            case "vector[1]":
                return getVector1();
            case "vector[2]":
                return getVector2();
            case "vector[3]":
                return getVector3();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * A description of special aspects of this TVECT.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

    /**
     * The value of _database_PDB_tvect.id must uniquely identify a
     * record in the DATABASE_PDB_TVECT list.
     * 
     * Note that this item need not be a number; it can be any unique
     * identifier.
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * The elements of the PDB TVECT vector.
     * @return FloatColumn
     */
    public FloatColumn getVector1() {
        return delegate.getColumn("vector[1]", DelegatingFloatColumn::new);
    }

    /**
     * The elements of the PDB TVECT vector.
     * @return FloatColumn
     */
    public FloatColumn getVector2() {
        return delegate.getColumn("vector[2]", DelegatingFloatColumn::new);
    }

    /**
     * The elements of the PDB TVECT vector.
     * @return FloatColumn
     */
    public FloatColumn getVector3() {
        return delegate.getColumn("vector[3]", DelegatingFloatColumn::new);
    }

}