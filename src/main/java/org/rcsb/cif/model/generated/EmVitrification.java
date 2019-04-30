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
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getEntryId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("entry_id", SingleRowStrColumn::new) :
                getBinaryColumn("entry_id"));
    }

    /**
     * The value of _em_vitrification.id must uniquely identify
     * the vitrification procedure.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("id", SingleRowStrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * This data item is a pointer to _em_sample_preparation.id in the
     * EM_SAMPLE_PREPARATION category.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getSamplePreparationId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("sample_preparation_id", SingleRowStrColumn::new) :
                getBinaryColumn("sample_preparation_id"));
    }

    /**
     * This data item is a pointer to _em_specimen.id
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getSpecimenId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("specimen_id", SingleRowStrColumn::new) :
                getBinaryColumn("specimen_id"));
    }

    /**
     * This is the name of the cryogen.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getCryogenName() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("cryogen_name", SingleRowStrColumn::new) :
                getBinaryColumn("cryogen_name"));
    }

    /**
     * The humidity (%) in the vicinity of the vitrification process.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getHumidity() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("humidity", SingleRowFloatColumn::new) :
                getBinaryColumn("humidity"));
    }

    /**
     * The vitrification temperature (in degrees Kelvin), e.g.,
     * temperature of the plunge instrument cryogen bath.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getTemp() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("temp", SingleRowFloatColumn::new) :
                getBinaryColumn("temp"));
    }

    /**
     * The temperature (in degrees Kelvin) of the sample just prior to vitrification.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getChamberTemperature() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("chamber_temperature", SingleRowFloatColumn::new) :
                getBinaryColumn("chamber_temperature"));
    }

    /**
     * The type of instrument used in the vitrification process.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getInstrument() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("instrument", SingleRowStrColumn::new) :
                getBinaryColumn("instrument"));
    }

    /**
     * The procedure for vitrification.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getMethod() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("method", SingleRowStrColumn::new) :
                getBinaryColumn("method"));
    }

    /**
     * The length of time after an event effecting the sample that
     * vitrification was induced and a description of the event.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getTimeResolvedState() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("time_resolved_state", SingleRowStrColumn::new) :
                getBinaryColumn("time_resolved_state"));
    }

    /**
     * This data item is a pointer to _citation.id in the
     * CITATION category.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getCitationId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("citation_id", SingleRowStrColumn::new) :
                getBinaryColumn("citation_id"));
    }

    /**
     * Any additional details relating to vitrification.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDetails() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("details", SingleRowStrColumn::new) :
                getBinaryColumn("details"));
    }
}
