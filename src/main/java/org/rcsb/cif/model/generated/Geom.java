package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

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
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class Geom extends BaseCategory {
    public Geom(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public Geom(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public Geom(String name) {
        super(name);
    }

    /**
     * This data item is a pointer to _entry.id in the ENTRY category.
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entry_id", StrColumn::new) :
                getBinaryColumn("entry_id"));
    }

    /**
     * A description of geometry not covered by the
     * existing data names in the GEOM categories, such as
     * least-squares planes.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }
}
