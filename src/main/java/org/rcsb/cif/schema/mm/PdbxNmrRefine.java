package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Describe the method and details of the refinement of the deposited structure.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxNmrRefine extends DelegatingCategory {
    public PdbxNmrRefine(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "entry_id":
                return getEntryId();
            case "method":
                return getMethod();
            case "details":
                return getDetails();
            case "software_ordinal":
                return getSoftwareOrdinal();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * You can leave this blank as an ID will be assigned by the RCSB
     * to the constraint file.
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return delegate.getColumn("entry_id", DelegatingStrColumn::new);
    }

    /**
     * The method used to determine the structure.
     * @return StrColumn
     */
    public StrColumn getMethod() {
        return delegate.getColumn("method", DelegatingStrColumn::new);
    }

    /**
     * Additional details about the NMR refinement.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

    /**
     * Pointer to _software.ordinal
     * @return IntColumn
     */
    public IntColumn getSoftwareOrdinal() {
        return delegate.getColumn("software_ordinal", DelegatingIntColumn::new);
    }

}