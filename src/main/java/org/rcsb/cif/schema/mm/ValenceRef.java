package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the VALENCE_REF category list the references
 * from which the bond-valence parameters have been taken.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class ValenceRef extends DelegatingCategory {
    public ValenceRef(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "id":
                return getId();
            case "reference":
                return getReference();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * An identifier for items in this category. Parent of
     * _valence_param.ref_id, which must have the same value.
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * Literature reference from which the valence parameters
     * identified by _valence_param.id were taken.
     * @return StrColumn
     */
    public StrColumn getReference() {
        return delegate.getColumn("reference", DelegatingStrColumn::new);
    }

}