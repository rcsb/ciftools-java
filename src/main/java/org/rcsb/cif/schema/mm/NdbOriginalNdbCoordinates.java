package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Placeholder category for PDB coordinate data.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class NdbOriginalNdbCoordinates extends DelegatingCategory {
    public NdbOriginalNdbCoordinates(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "coord_section":
                return getCoordSection();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * Placeholder item to hold unparsed coordinate data.
     * @return StrColumn
     */
    public StrColumn getCoordSection() {
        return delegate.getColumn("coord_section", DelegatingStrColumn::new);
    }

}