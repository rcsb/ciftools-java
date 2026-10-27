package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_EXPTL_SUBTYPE category record
 * details about the method subtype under the primary
 * method recorded in _exptl.method
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxExptlSubtype extends DelegatingCategory {
    public PdbxExptlSubtype(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "exptl_method":
                return getExptlMethod();
            case "method_type":
                return getMethodType();
            case "details":
                return getDetails();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * This data item is a pointer to _exptl.method in the EXPTL category.
     * @return StrColumn
     */
    public StrColumn getExptlMethod() {
        return delegate.getColumn("exptl_method", DelegatingStrColumn::new);
    }

    /**
     * The subtype of the method used in the experiment. The
     * subtype should be a variance of the primary method
     * recorded in the _exptl.method item, with distinctive
     * technical applications and significant scientific
     * impacts.
     * @return StrColumn
     */
    public StrColumn getMethodType() {
        return delegate.getColumn("method_type", DelegatingStrColumn::new);
    }

    /**
     * Details about the method subtype.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

}