package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PHASING category record details about the
 * phasing of the structure, listing the various methods used in
 * the phasing process. Details about the application of each
 * method are listed in the appropriate subcategories.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class Phasing extends DelegatingCategory {
    public Phasing(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "method":
                return getMethod();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * A listing of the method or methods used to phase this
     * structure.
     * @return StrColumn
     */
    public StrColumn getMethod() {
        return delegate.getColumn("method", DelegatingStrColumn::new);
    }

}