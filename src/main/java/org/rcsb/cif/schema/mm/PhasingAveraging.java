package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PHASING_AVERAGING category record details
 * about the phasing of the structure where methods involving
 * averaging of multiple observations of the molecule in the
 * asymmetric unit are involved.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PhasingAveraging extends DelegatingCategory {
    public PhasingAveraging(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "details":
                return getDetails();
            case "entry_id":
                return getEntryId();
            case "method":
                return getMethod();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * A description of special aspects of the averaging process.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

    /**
     * This data item is a pointer to _entry.id in the ENTRY category.
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return delegate.getColumn("entry_id", DelegatingStrColumn::new);
    }

    /**
     * A description of the phase-averaging phasing method used to
     * phase this structure.
     * 
     * Note that this is not the computer program used, which is
     * described in the SOFTWARE category, but rather the method
     * itself.
     * 
     * This data item should be used to describe significant
     * methodological options used within the phase-averaging program.
     * @return StrColumn
     */
    public StrColumn getMethod() {
        return delegate.getColumn("method", DelegatingStrColumn::new);
    }

}