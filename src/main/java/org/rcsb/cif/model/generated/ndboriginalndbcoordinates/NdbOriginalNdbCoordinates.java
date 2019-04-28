package org.rcsb.cif.model.generated.ndboriginalndbcoordinates;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
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
     * @return CoordSection
     */
    public CoordSection getCoordSection() {
        return (CoordSection) (isText ? textFields.computeIfAbsent("coord_section",
                CoordSection::new) : getBinaryColumn("coord_section"));
    }
}
