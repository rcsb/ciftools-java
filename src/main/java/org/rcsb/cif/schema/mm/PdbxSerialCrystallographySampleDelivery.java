package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_SERIAL_CRYSTALLOGRAPHY_SAMPLE_DELIVERY category
 * record general details about the sample delivery
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxSerialCrystallographySampleDelivery extends DelegatingCategory {
    public PdbxSerialCrystallographySampleDelivery(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "diffrn_id":
                return getDiffrnId();
            case "description":
                return getDescription();
            case "method":
                return getMethod();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The data item is a pointer to _diffrn.id in the DIFFRN
     * category.
     * @return StrColumn
     */
    public StrColumn getDiffrnId() {
        return delegate.getColumn("diffrn_id", DelegatingStrColumn::new);
    }

    /**
     * The description of the mechanism by which the specimen in placed in the path
     * of the source.
     * @return StrColumn
     */
    public StrColumn getDescription() {
        return delegate.getColumn("description", DelegatingStrColumn::new);
    }

    /**
     * The description of the mechanism by which the specimen in placed in the path
     * of the source.
     * @return StrColumn
     */
    public StrColumn getMethod() {
        return delegate.getColumn("method", DelegatingStrColumn::new);
    }

}