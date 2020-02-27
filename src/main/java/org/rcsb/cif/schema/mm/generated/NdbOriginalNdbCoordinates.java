package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Placeholder category for PDB coordinate data.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class NdbOriginalNdbCoordinates extends BaseCategory {
    public NdbOriginalNdbCoordinates(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public NdbOriginalNdbCoordinates(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public NdbOriginalNdbCoordinates(String name) {
        super(name);
    }

    /**
     * Placeholder item to hold unparsed coordinate data.
     * @return StrColumn
     */
    public StrColumn getCoordSection() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("coord_section", StrColumn::new) :
                getBinaryColumn("coord_section"));
    }
}
