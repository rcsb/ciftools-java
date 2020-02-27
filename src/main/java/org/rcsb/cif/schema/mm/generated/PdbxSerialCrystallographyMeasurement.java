package org.rcsb.cif.schema.mm.generated;

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
     * @return StrColumn
     */
    public StrColumn getDiffrnId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("diffrn_id", StrColumn::new) :
                getBinaryColumn("diffrn_id"));
    }

    /**
     * The energy/pulse of the X-ray pulse impacting the sample measured in microjoules.
     * @return FloatColumn
     */
    public FloatColumn getPulseEnergy() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pulse_energy", FloatColumn::new) :
                getBinaryColumn("pulse_energy"));
    }

    /**
     * The average duration (femtoseconds)
     * of the pulse energy measured at the sample.
     * @return FloatColumn
     */
    public FloatColumn getPulseDuration() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pulse_duration", FloatColumn::new) :
                getBinaryColumn("pulse_duration"));
    }

    /**
     * For FEL experiments, the pulse repetition rate measured in cycles per seconds.
     * @return FloatColumn
     */
    public FloatColumn getXfelPulseRepetitionRate() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("xfel_pulse_repetition_rate", FloatColumn::new) :
                getBinaryColumn("xfel_pulse_repetition_rate"));
    }

    /**
     * The photon energy of the X-ray pulse measured in KeV.
     * @return FloatColumn
     */
    public FloatColumn getPulsePhotonEnergy() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pulse_photon_energy", FloatColumn::new) :
                getBinaryColumn("pulse_photon_energy"));
    }

    /**
     * The photons per pulse measured in  (tera photons (10^(12)^)/pulse units).
     * @return FloatColumn
     */
    public FloatColumn getPhotonsPerPulse() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("photons_per_pulse", FloatColumn::new) :
                getBinaryColumn("photons_per_pulse"));
    }

    /**
     * The dimension of the source beam measured at the source (micrometres squared).
     * @return FloatColumn
     */
    public FloatColumn getSourceSize() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("source_size", FloatColumn::new) :
                getBinaryColumn("source_size"));
    }

    /**
     * The distance from source to the sample along the optical axis (metres).
     * @return FloatColumn
     */
    public FloatColumn getSourceDistance() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("source_distance", FloatColumn::new) :
                getBinaryColumn("source_distance"));
    }

    /**
     * The focal spot size of the beam
     * impinging on the sample (micrometres squared).
     * @return FloatColumn
     */
    public FloatColumn getFocalSpotSize() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("focal_spot_size", FloatColumn::new) :
                getBinaryColumn("focal_spot_size"));
    }

    /**
     * The collimation or type of focusing optics applied to the radiation.
     * @return StrColumn
     */
    public StrColumn getCollimation() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("collimation", StrColumn::new) :
                getBinaryColumn("collimation"));
    }

    /**
     * The total number of hours required to measure this data set.
     * @return FloatColumn
     */
    public FloatColumn getCollectionTimeTotal() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("collection_time_total", FloatColumn::new) :
                getBinaryColumn("collection_time_total"));
    }
}
