package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_SERIAL_CRYSTALLOGRAPHY_MEASUREMENT category record
 * details the beam that is impinging on the sample
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxSerialCrystallographyMeasurement extends DelegatingCategory {
    public PdbxSerialCrystallographyMeasurement(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "diffrn_id":
                return getDiffrnId();
            case "pulse_energy":
                return getPulseEnergy();
            case "pulse_duration":
                return getPulseDuration();
            case "xfel_pulse_repetition_rate":
                return getXfelPulseRepetitionRate();
            case "pulse_photon_energy":
                return getPulsePhotonEnergy();
            case "photons_per_pulse":
                return getPhotonsPerPulse();
            case "source_size":
                return getSourceSize();
            case "source_distance":
                return getSourceDistance();
            case "focal_spot_size":
                return getFocalSpotSize();
            case "collimation":
                return getCollimation();
            case "collection_time_total":
                return getCollectionTimeTotal();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The data item is a pointer to _diffrn.id in the DIFFRN
     * category.
     * @return StrColumn
     */
    public StrColumn getDiffrnId() {
        return delegate.getColumn("diffrn_id", DelegatingStrColumn::new);
    }

    /**
     * The energy/pulse of the X-ray pulse impacting the sample measured in microjoules.
     * @return FloatColumn
     */
    public FloatColumn getPulseEnergy() {
        return delegate.getColumn("pulse_energy", DelegatingFloatColumn::new);
    }

    /**
     * The average duration (femtoseconds)
     * of the pulse energy measured at the sample.
     * @return FloatColumn
     */
    public FloatColumn getPulseDuration() {
        return delegate.getColumn("pulse_duration", DelegatingFloatColumn::new);
    }

    /**
     * For FEL experiments, the pulse repetition rate measured in cycles per seconds.
     * @return FloatColumn
     */
    public FloatColumn getXfelPulseRepetitionRate() {
        return delegate.getColumn("xfel_pulse_repetition_rate", DelegatingFloatColumn::new);
    }

    /**
     * The photon energy of the X-ray pulse measured in KeV.
     * @return FloatColumn
     */
    public FloatColumn getPulsePhotonEnergy() {
        return delegate.getColumn("pulse_photon_energy", DelegatingFloatColumn::new);
    }

    /**
     * The photons per pulse measured in  (tera photons (10^(12)^)/pulse units).
     * @return FloatColumn
     */
    public FloatColumn getPhotonsPerPulse() {
        return delegate.getColumn("photons_per_pulse", DelegatingFloatColumn::new);
    }

    /**
     * The dimension of the source beam measured at the source (micrometres squared).
     * @return FloatColumn
     */
    public FloatColumn getSourceSize() {
        return delegate.getColumn("source_size", DelegatingFloatColumn::new);
    }

    /**
     * The distance from source to the sample along the optical axis (metres).
     * @return FloatColumn
     */
    public FloatColumn getSourceDistance() {
        return delegate.getColumn("source_distance", DelegatingFloatColumn::new);
    }

    /**
     * The focal spot size of the beam
     * impinging on the sample (micrometres squared).
     * @return FloatColumn
     */
    public FloatColumn getFocalSpotSize() {
        return delegate.getColumn("focal_spot_size", DelegatingFloatColumn::new);
    }

    /**
     * The collimation or type of focusing optics applied to the radiation.
     * @return StrColumn
     */
    public StrColumn getCollimation() {
        return delegate.getColumn("collimation", DelegatingStrColumn::new);
    }

    /**
     * The total number of hours required to measure this data set.
     * @return FloatColumn
     */
    public FloatColumn getCollectionTimeTotal() {
        return delegate.getColumn("collection_time_total", DelegatingFloatColumn::new);
    }

}