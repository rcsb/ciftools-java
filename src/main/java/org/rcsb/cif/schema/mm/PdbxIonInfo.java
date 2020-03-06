package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_ION_INFO category are still used until
 * the 'entity' categories are entered into the database, even though the
 * information is repeated.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxIonInfo extends DelegatingCategory {
    public PdbxIonInfo(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "id":
                return getId();
            case "name":
                return getName();
            case "numb_per_asym_unit":
                return getNumbPerAsymUnit();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * Serial number.
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * Name of ion.
     * @return StrColumn
     */
    public StrColumn getName() {
        return delegate.getColumn("name", DelegatingStrColumn::new);
    }

    /**
     * Number of ion molecules per asymmetric unit.
     * @return IntColumn
     */
    public IntColumn getNumbPerAsymUnit() {
        return delegate.getColumn("numb_per_asym_unit", DelegatingIntColumn::new);
    }

}