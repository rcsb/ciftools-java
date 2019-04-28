package org.rcsb.cif.model.generated.emultramicrotomy;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class EmUltramicrotomy extends BaseCategory {
    public EmUltramicrotomy(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public EmUltramicrotomy(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public EmUltramicrotomy(String name) {
        super(name);
    }

    /**
     * Additional details about the ultramicrotomy sample preparation
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
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
     * Final thickness of the sectioned sample, in nanometers
     * @return FinalThickness
     */
    public FinalThickness getFinalThickness() {
        return (FinalThickness) (isText ? textFields.computeIfAbsent("final_thickness",
                FinalThickness::new) : getBinaryColumn("final_thickness"));
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
     * Ultramicrotome instrument used for sectioning
     * @return Instrument
     */
    public Instrument getInstrument() {
        return (Instrument) (isText ? textFields.computeIfAbsent("instrument",
                Instrument::new) : getBinaryColumn("instrument"));
    }

    /**
     * Temperature of the sample during microtome sectioning, in degrees Kelvin
     * @return Temperature
     */
    public Temperature getTemperature() {
        return (Temperature) (isText ? textFields.computeIfAbsent("temperature",
                Temperature::new) : getBinaryColumn("temperature"));
    }
}
