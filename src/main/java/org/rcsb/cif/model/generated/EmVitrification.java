package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the EM_VITRIFICATION category
 * record details about the method and cryogen used in
 * rapid freezing of the sample on the grid prior to its
 * insertion in the electron microscope
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class EmVitrification extends BaseCategory {
    public EmVitrification(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public EmVitrification(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public EmVitrification(String name) {
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
     * The value of _em_vitrification.id must uniquely identify
     * the vitrification procedure.
     * @return StrColumn
     */
    public StrColumn getId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("id", StrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * This data item is a pointer to _em_sample_preparation.id in the
     * EM_SAMPLE_PREPARATION category.
     * @return StrColumn
     */
    public StrColumn getSamplePreparationId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("sample_preparation_id", StrColumn::new) :
                getBinaryColumn("sample_preparation_id"));
    }

    /**
     * This data item is a pointer to _em_specimen.id
     * @return StrColumn
     */
    public StrColumn getSpecimenId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("specimen_id", StrColumn::new) :
                getBinaryColumn("specimen_id"));
    }

    /**
     * This is the name of the cryogen.
     * @return StrColumn
     */
    public StrColumn getCryogenName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("cryogen_name", StrColumn::new) :
                getBinaryColumn("cryogen_name"));
    }

    /**
     * The humidity (%) in the vicinity of the vitrification process.
     * @return FloatColumn
     */
    public FloatColumn getHumidity() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("humidity", FloatColumn::new) :
                getBinaryColumn("humidity"));
    }

    /**
     * The vitrification temperature (in degrees Kelvin), e.g.,
     * temperature of the plunge instrument cryogen bath.
     * @return FloatColumn
     */
    public FloatColumn getTemp() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("temp", FloatColumn::new) :
                getBinaryColumn("temp"));
    }

    /**
     * The temperature (in degrees Kelvin) of the sample just prior to vitrification.
     * @return FloatColumn
     */
    public FloatColumn getChamberTemperature() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("chamber_temperature", FloatColumn::new) :
                getBinaryColumn("chamber_temperature"));
    }

    /**
     * The type of instrument used in the vitrification process.
     * @return StrColumn
     */
    public StrColumn getInstrument() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("instrument", StrColumn::new) :
                getBinaryColumn("instrument"));
    }

    /**
     * The procedure for vitrification.
     * @return StrColumn
     */
    public StrColumn getMethod() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("method", StrColumn::new) :
                getBinaryColumn("method"));
    }

    /**
     * The length of time after an event effecting the sample that
     * vitrification was induced and a description of the event.
     * @return StrColumn
     */
    public StrColumn getTimeResolvedState() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("time_resolved_state", StrColumn::new) :
                getBinaryColumn("time_resolved_state"));
    }

    /**
     * This data item is a pointer to _citation.id in the
     * CITATION category.
     * @return StrColumn
     */
    public StrColumn getCitationId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("citation_id", StrColumn::new) :
                getBinaryColumn("citation_id"));
    }

    /**
     * Any additional details relating to vitrification.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }
}
