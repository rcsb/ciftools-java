package org.rcsb.cif.model.generated.emvitrification;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
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
     * @return EntryId
     */
    public EntryId getEntryId() {
        return (EntryId) (isText ? textFields.computeIfAbsent("entry_id",
                EntryId::new) : getBinaryColumn("entry_id"));
    }

    /**
     * The value of _em_vitrification.id must uniquely identify
     * the vitrification procedure.
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }

    /**
     * This data item is a pointer to _em_sample_preparation.id in the
     * EM_SAMPLE_PREPARATION category.
     * @return SamplePreparationId
     */
    public SamplePreparationId getSamplePreparationId() {
        return (SamplePreparationId) (isText ? textFields.computeIfAbsent("sample_preparation_id",
                SamplePreparationId::new) : getBinaryColumn("sample_preparation_id"));
    }

    /**
     * This data item is a pointer to _em_specimen.id
     * @return SpecimenId
     */
    public SpecimenId getSpecimenId() {
        return (SpecimenId) (isText ? textFields.computeIfAbsent("specimen_id",
                SpecimenId::new) : getBinaryColumn("specimen_id"));
    }

    /**
     * This is the name of the cryogen.
     * @return CryogenName
     */
    public CryogenName getCryogenName() {
        return (CryogenName) (isText ? textFields.computeIfAbsent("cryogen_name",
                CryogenName::new) : getBinaryColumn("cryogen_name"));
    }

    /**
     * The humidity (%) in the vicinity of the vitrification process.
     * @return Humidity
     */
    public Humidity getHumidity() {
        return (Humidity) (isText ? textFields.computeIfAbsent("humidity",
                Humidity::new) : getBinaryColumn("humidity"));
    }

    /**
     * The vitrification temperature (in degrees Kelvin), e.g.,
     * temperature of the plunge instrument cryogen bath.
     * @return Temp
     */
    public Temp getTemp() {
        return (Temp) (isText ? textFields.computeIfAbsent("temp",
                Temp::new) : getBinaryColumn("temp"));
    }

    /**
     * The temperature (in degrees Kelvin) of the sample just prior to vitrification.
     * @return ChamberTemperature
     */
    public ChamberTemperature getChamberTemperature() {
        return (ChamberTemperature) (isText ? textFields.computeIfAbsent("chamber_temperature",
                ChamberTemperature::new) : getBinaryColumn("chamber_temperature"));
    }

    /**
     * The type of instrument used in the vitrification process.
     * @return Instrument
     */
    public Instrument getInstrument() {
        return (Instrument) (isText ? textFields.computeIfAbsent("instrument",
                Instrument::new) : getBinaryColumn("instrument"));
    }

    /**
     * The procedure for vitrification.
     * @return Method
     */
    public Method getMethod() {
        return (Method) (isText ? textFields.computeIfAbsent("method",
                Method::new) : getBinaryColumn("method"));
    }

    /**
     * The length of time after an event effecting the sample that
     * vitrification was induced and a description of the event.
     * @return TimeResolvedState
     */
    public TimeResolvedState getTimeResolvedState() {
        return (TimeResolvedState) (isText ? textFields.computeIfAbsent("time_resolved_state",
                TimeResolvedState::new) : getBinaryColumn("time_resolved_state"));
    }

    /**
     * This data item is a pointer to _citation.id in the
     * CITATION category.
     * @return CitationId
     */
    public CitationId getCitationId() {
        return (CitationId) (isText ? textFields.computeIfAbsent("citation_id",
                CitationId::new) : getBinaryColumn("citation_id"));
    }

    /**
     * Any additional details relating to vitrification.
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
    }
}
