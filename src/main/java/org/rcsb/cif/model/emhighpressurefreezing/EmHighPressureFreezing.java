package org.rcsb.cif.model.emhighpressurefreezing;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
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
     * This data item is the primary key of the category.
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }

    /**
     * The instrument used for high pressure freezing.
     * @return Instrument
     */
    public Instrument getInstrument() {
        return (Instrument) (isText ? textFields.computeIfAbsent("instrument",
                Instrument::new) : getBinaryColumn("instrument"));
    }
}
