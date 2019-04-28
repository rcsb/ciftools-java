package org.rcsb.cif.model.generated.emtomographyspecimen;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
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
     * @return CryoProtectant
     */
    public CryoProtectant getCryoProtectant() {
        return (CryoProtectant) (isText ? textFields.computeIfAbsent("cryo_protectant",
                CryoProtectant::new) : getBinaryColumn("cryo_protectant"));
    }

    /**
     * Any additional details about specimen preparation.
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
    }

    /**
     * 'YES' indicates that fiducial markers were used in the specimen preparation
     * @return FiducialMarkers
     */
    public FiducialMarkers getFiducialMarkers() {
        return (FiducialMarkers) (isText ? textFields.computeIfAbsent("fiducial_markers",
                FiducialMarkers::new) : getBinaryColumn("fiducial_markers"));
    }

    /**
     * 'YES' indicates that high pressure freezing was used in the specimen preparation
     * @return HighPressureFreezing
     */
    public HighPressureFreezing getHighPressureFreezing() {
        return (HighPressureFreezing) (isText ? textFields.computeIfAbsent("high_pressure_freezing",
                HighPressureFreezing::new) : getBinaryColumn("high_pressure_freezing"));
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
     * The type of sectioning performed during specimen preparation.
     * @return Sectioning
     */
    public Sectioning getSectioning() {
        return (Sectioning) (isText ? textFields.computeIfAbsent("sectioning",
                Sectioning::new) : getBinaryColumn("sectioning"));
    }

    /**
     * Foreign key relationship to the EMD SPECIMEN category
     * @return SpecimenId
     */
    public SpecimenId getSpecimenId() {
        return (SpecimenId) (isText ? textFields.computeIfAbsent("specimen_id",
                SpecimenId::new) : getBinaryColumn("specimen_id"));
    }
}
