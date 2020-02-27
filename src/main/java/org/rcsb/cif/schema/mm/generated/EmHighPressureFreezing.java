package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Description of high pressure freezing
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class EmHighPressureFreezing extends BaseCategory {
    public EmHighPressureFreezing(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public EmHighPressureFreezing(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public EmHighPressureFreezing(String name) {
        super(name);
    }

    /**
     * Additional details about high pressure freezing.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * Foreign key relationship to the EMD SPECIMEN category
     * @return StrColumn
     */
    public StrColumn getEmTomographySpecimenId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("em_tomography_specimen_id", StrColumn::new) :
                getBinaryColumn("em_tomography_specimen_id"));
    }

    /**
     * This data item is the primary key of the category.
     * @return StrColumn
     */
    public StrColumn getId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("id", StrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * The instrument used for high pressure freezing.
     * @return StrColumn
     */
    public StrColumn getInstrument() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("instrument", StrColumn::new) :
                getBinaryColumn("instrument"));
    }
}
