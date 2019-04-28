package org.rcsb.cif.model.generated.pdbxserialcrystallographymeasurement;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
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
     * @return DiffrnId
     */
    public DiffrnId getDiffrnId() {
        return (DiffrnId) (isText ? textFields.computeIfAbsent("diffrn_id",
                DiffrnId::new) : getBinaryColumn("diffrn_id"));
    }

    /**
     * The energy/pulse of the X-ray pulse impacting the sample measured in microjoules.
     * @return PulseEnergy
     */
    public PulseEnergy getPulseEnergy() {
        return (PulseEnergy) (isText ? textFields.computeIfAbsent("pulse_energy",
                PulseEnergy::new) : getBinaryColumn("pulse_energy"));
    }

    /**
     * The average duration (femtoseconds)
     * of the pulse energy measured at the sample.
     * @return PulseDuration
     */
    public PulseDuration getPulseDuration() {
        return (PulseDuration) (isText ? textFields.computeIfAbsent("pulse_duration",
                PulseDuration::new) : getBinaryColumn("pulse_duration"));
    }

    /**
     * For FEL experiments, the pulse repetition rate measured in cycles per seconds.
     * @return XfelPulseRepetitionRate
     */
    public XfelPulseRepetitionRate getXfelPulseRepetitionRate() {
        return (XfelPulseRepetitionRate) (isText ? textFields.computeIfAbsent("xfel_pulse_repetition_rate",
                XfelPulseRepetitionRate::new) : getBinaryColumn("xfel_pulse_repetition_rate"));
    }

    /**
     * The photon energy of the X-ray pulse measured in KeV.
     * @return PulsePhotonEnergy
     */
    public PulsePhotonEnergy getPulsePhotonEnergy() {
        return (PulsePhotonEnergy) (isText ? textFields.computeIfAbsent("pulse_photon_energy",
                PulsePhotonEnergy::new) : getBinaryColumn("pulse_photon_energy"));
    }

    /**
     * The photons per pulse measured in  (tera photons (10^(12)^)/pulse units).
     * @return PhotonsPerPulse
     */
    public PhotonsPerPulse getPhotonsPerPulse() {
        return (PhotonsPerPulse) (isText ? textFields.computeIfAbsent("photons_per_pulse",
                PhotonsPerPulse::new) : getBinaryColumn("photons_per_pulse"));
    }

    /**
     * The dimension of the source beam measured at the source (micrometres squared).
     * @return SourceSize
     */
    public SourceSize getSourceSize() {
        return (SourceSize) (isText ? textFields.computeIfAbsent("source_size",
                SourceSize::new) : getBinaryColumn("source_size"));
    }

    /**
     * The distance from source to the sample along the optical axis (metres).
     * @return SourceDistance
     */
    public SourceDistance getSourceDistance() {
        return (SourceDistance) (isText ? textFields.computeIfAbsent("source_distance",
                SourceDistance::new) : getBinaryColumn("source_distance"));
    }

    /**
     * The focal spot size of the beam
     * impinging on the sample (micrometres squared).
     * @return FocalSpotSize
     */
    public FocalSpotSize getFocalSpotSize() {
        return (FocalSpotSize) (isText ? textFields.computeIfAbsent("focal_spot_size",
                FocalSpotSize::new) : getBinaryColumn("focal_spot_size"));
    }

    /**
     * The collimation or type of focusing optics applied to the radiation.
     * @return Collimation
     */
    public Collimation getCollimation() {
        return (Collimation) (isText ? textFields.computeIfAbsent("collimation",
                Collimation::new) : getBinaryColumn("collimation"));
    }

    /**
     * The total number of hours required to measure this data set.
     * @return CollectionTimeTotal
     */
    public CollectionTimeTotal getCollectionTimeTotal() {
        return (CollectionTimeTotal) (isText ? textFields.computeIfAbsent("collection_time_total",
                CollectionTimeTotal::new) : getBinaryColumn("collection_time_total"));
    }
}
