package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Staining category
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class EmStaining extends DelegatingCategory {
    public EmStaining(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "details":
                return getDetails();
            case "id":
                return getId();
            case "material":
                return getMaterial();
            case "specimen_id":
                return getSpecimenId();
            case "type":
                return getType();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * Staining procedure used in the specimen preparation.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

    /**
     * PRIMARY KEY
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * The staining  material.
     * @return StrColumn
     */
    public StrColumn getMaterial() {
        return delegate.getColumn("material", DelegatingStrColumn::new);
    }

    /**
     * Foreign key relationship to the EM SPECIMEN category
     * @return StrColumn
     */
    public StrColumn getSpecimenId() {
        return delegate.getColumn("specimen_id", DelegatingStrColumn::new);
    }

    /**
     * type of staining
     * @return StrColumn
     */
    public StrColumn getType() {
        return delegate.getColumn("type", DelegatingStrColumn::new);
    }

}