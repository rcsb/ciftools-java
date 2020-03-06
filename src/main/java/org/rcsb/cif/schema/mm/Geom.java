package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the GEOM and related (GEOM_ANGLE,
 * GEOM_BOND, GEOM_CONTACT, GEOM_HBOND and GEOM_TORSION)
 * categories record details about the molecular
 * geometry as calculated from the contents of the ATOM, CELL
 * and SYMMETRY data.
 * 
 * Geometry data are therefore redundant, in that they can be
 * calculated from other more fundamental quantities in the data
 * block. However, they provide a check on the correctness of
 * both sets of data and enable the most important geometric data
 * to be identified for publication by setting the appropriate
 * publication flag.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class Geom extends DelegatingCategory {
    public Geom(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "entry_id":
                return getEntryId();
            case "details":
                return getDetails();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * This data item is a pointer to _entry.id in the ENTRY category.
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return delegate.getColumn("entry_id", DelegatingStrColumn::new);
    }

    /**
     * A description of geometry not covered by the
     * existing data names in the GEOM categories, such as
     * least-squares planes.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

}