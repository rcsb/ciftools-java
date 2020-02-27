package org.rcsb.cif.schema.generated.mm;

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

    /**
     * Placeholder item to hold unparsed coordinate data.
     * @return StrColumn
     */
    public StrColumn getCoordSection() {
        return delegate.getColumn("coord_section", DelegatingStrColumn::new);
    }
}
