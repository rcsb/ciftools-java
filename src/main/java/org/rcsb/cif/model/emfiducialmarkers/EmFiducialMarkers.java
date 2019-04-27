package org.rcsb.cif.model.emfiducialmarkers;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
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
     * @return Diameter
     */
    public Diameter getDiameter() {
        return (Diameter) (isText ? textFields.computeIfAbsent("diameter",
                Diameter::new) : getBinaryColumn("diameter"));
    }

    /**
     * Foreign key relationship to the EMD SPECIMEN category
     * @return EmTomographySpecimenId
     */
    public EmTomographySpecimenId getEmTomographySpecimenId() {
        return (EmTomographySpecimenId) (isText ? textFields.computeIfAbsent("em_tomography_specimen_id",
                EmTomographySpecimenId::new) : getBinaryColumn("em_tomography_specimen_id"));
    }

    /**
     * This data item is the primary key of the category.
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }

    /**
     * Manufacturer source for the fiducial markers
     * @return Manufacturer
     */
    public Manufacturer getManufacturer() {
        return (Manufacturer) (isText ? textFields.computeIfAbsent("manufacturer",
                Manufacturer::new) : getBinaryColumn("manufacturer"));
    }
}
