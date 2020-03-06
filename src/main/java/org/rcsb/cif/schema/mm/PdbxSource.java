package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data item will still be used until the ENTITY category is fully
 * adopted by NDBQuery.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxSource extends DelegatingCategory {
    public PdbxSource(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "src_method":
                return getSrcMethod();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * Source of biological unit.  Mostly: SYNTHETIC
     * @return StrColumn
     */
    public StrColumn getSrcMethod() {
        return delegate.getColumn("src_method", DelegatingStrColumn::new);
    }

}