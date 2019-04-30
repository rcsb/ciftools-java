package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Description specimen preparation for imaging using tomography.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class EmTomographySpecimen extends BaseCategory {
    public EmTomographySpecimen(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public EmTomographySpecimen(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public EmTomographySpecimen(String name) {
        super(name);
    }

    /**
     * The type of cryo-protectant used during specimen preparation.
     * @return StrColumn
     */
    public StrColumn getCryoProtectant() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("cryo_protectant", StrColumn::new) :
                getBinaryColumn("cryo_protectant"));
    }

    /**
     * Any additional details about specimen preparation.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * 'YES' indicates that fiducial markers were used in the specimen preparation
     * @return StrColumn
     */
    public StrColumn getFiducialMarkers() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("fiducial_markers", StrColumn::new) :
                getBinaryColumn("fiducial_markers"));
    }

    /**
     * 'YES' indicates that high pressure freezing was used in the specimen preparation
     * @return StrColumn
     */
    public StrColumn getHighPressureFreezing() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("high_pressure_freezing", StrColumn::new) :
                getBinaryColumn("high_pressure_freezing"));
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
     * The type of sectioning performed during specimen preparation.
     * @return StrColumn
     */
    public StrColumn getSectioning() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("sectioning", StrColumn::new) :
                getBinaryColumn("sectioning"));
    }

    /**
     * Foreign key relationship to the EMD SPECIMEN category
     * @return StrColumn
     */
    public StrColumn getSpecimenId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("specimen_id", StrColumn::new) :
                getBinaryColumn("specimen_id"));
    }
}
