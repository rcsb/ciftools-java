package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_CHEM_COMP_MODEL category give details about each
 * of the chemical component model instances.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxChemCompModel extends DelegatingCategory {
    public PdbxChemCompModel(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "id":
                return getId();
            case "comp_id":
                return getCompId();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The value of _pdbx_chem_comp_model.id must uniquely identify each
     * model instance the PDBX_CHEM_COMP_MODEL list.
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * An identifier for chemical component definition.
     * @return StrColumn
     */
    public StrColumn getCompId() {
        return delegate.getColumn("comp_id", DelegatingStrColumn::new);
    }

}