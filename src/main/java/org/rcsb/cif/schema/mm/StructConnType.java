package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the STRUCT_CONN_TYPE category record details
 * about the criteria used to identify interactions between
 * portions of the structure.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class StructConnType extends DelegatingCategory {
    public StructConnType(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "criteria":
                return getCriteria();
            case "id":
                return getId();
            case "reference":
                return getReference();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The criteria used to define the interaction.
     * @return StrColumn
     */
    public StrColumn getCriteria() {
        return delegate.getColumn("criteria", DelegatingStrColumn::new);
    }

    /**
     * The chemical or structural type of the interaction.
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * A reference that specifies the criteria used to define the
     * interaction.
     * @return StrColumn
     */
    public StrColumn getReference() {
        return delegate.getColumn("reference", DelegatingStrColumn::new);
    }

}