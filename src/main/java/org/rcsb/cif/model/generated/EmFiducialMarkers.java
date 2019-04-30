package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Description of fiducial markers.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class EmFiducialMarkers extends BaseCategory {
    public EmFiducialMarkers(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public EmFiducialMarkers(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public EmFiducialMarkers(String name) {
        super(name);
    }

    /**
     * Diameter of the fiducial markers
     * @return FloatColumn
     */
    public FloatColumn getDiameter() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("diameter", FloatColumn::new) :
                getBinaryColumn("diameter"));
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
     * Manufacturer source for the fiducial markers
     * @return StrColumn
     */
    public StrColumn getManufacturer() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("manufacturer", StrColumn::new) :
                getBinaryColumn("manufacturer"));
    }
}
