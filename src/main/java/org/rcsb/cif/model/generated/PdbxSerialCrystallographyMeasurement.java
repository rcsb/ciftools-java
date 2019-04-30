package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_SERIAL_CRYSTALLOGRAPHY_MEASUREMENT category record
 * details the beam that is impinging on the sample
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class PdbxSerialCrystallographyMeasurement extends BaseCategory {
    public PdbxSerialCrystallographyMeasurement(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxSerialCrystallographyMeasurement(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxSerialCrystallographyMeasurement(String name) {
        super(name);
    }

    /**
     * The data item is a pointer to _diffrn.id in the DIFFRN
     * category.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDiffrnId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("diffrn_id", SingleRowStrColumn::new) :
                getBinaryColumn("diffrn_id"));
    }

    /**
     * The energy/pulse of the X-ray pulse impacting the sample measured in microjoules.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getPulseEnergy() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("pulse_energy", SingleRowFloatColumn::new) :
                getBinaryColumn("pulse_energy"));
    }

    /**
     * The average duration (femtoseconds)
     * of the pulse energy measured at the sample.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getPulseDuration() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("pulse_duration", SingleRowFloatColumn::new) :
                getBinaryColumn("pulse_duration"));
    }

    /**
     * For FEL experiments, the pulse repetition rate measured in cycles per seconds.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getXfelPulseRepetitionRate() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("xfel_pulse_repetition_rate", SingleRowFloatColumn::new) :
                getBinaryColumn("xfel_pulse_repetition_rate"));
    }

    /**
     * The photon energy of the X-ray pulse measured in KeV.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getPulsePhotonEnergy() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("pulse_photon_energy", SingleRowFloatColumn::new) :
                getBinaryColumn("pulse_photon_energy"));
    }

    /**
     * The photons per pulse measured in  (tera photons (10^(12)^)/pulse units).
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getPhotonsPerPulse() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("photons_per_pulse", SingleRowFloatColumn::new) :
                getBinaryColumn("photons_per_pulse"));
    }

    /**
     * The dimension of the source beam measured at the source (micrometres squared).
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getSourceSize() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("source_size", SingleRowFloatColumn::new) :
                getBinaryColumn("source_size"));
    }

    /**
     * The distance from source to the sample along the optical axis (metres).
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getSourceDistance() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("source_distance", SingleRowFloatColumn::new) :
                getBinaryColumn("source_distance"));
    }

    /**
     * The focal spot size of the beam
     * impinging on the sample (micrometres squared).
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getFocalSpotSize() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("focal_spot_size", SingleRowFloatColumn::new) :
                getBinaryColumn("focal_spot_size"));
    }

    /**
     * The collimation or type of focusing optics applied to the radiation.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getCollimation() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("collimation", SingleRowStrColumn::new) :
                getBinaryColumn("collimation"));
    }

    /**
     * The total number of hours required to measure this data set.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getCollectionTimeTotal() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("collection_time_total", SingleRowFloatColumn::new) :
                getBinaryColumn("collection_time_total"));
    }
}
