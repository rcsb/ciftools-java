package org.rcsb.cif.model.generated.emfocusedionbeam;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class EmFocusedIonBeam extends BaseCategory {
    public EmFocusedIonBeam(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public EmFocusedIonBeam(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public EmFocusedIonBeam(String name) {
        super(name);
    }

    /**
     * Current of the ion beam, in nanoamperes (nA)
     * @return Current
     */
    public Current getCurrent() {
        return (Current) (isText ? textFields.computeIfAbsent("current",
                Current::new) : getBinaryColumn("current"));
    }

    /**
     * Additional details about FIB milling
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
    }

    /**
     * ions per sq centimetre per second
     * @return DoseRate
     */
    public DoseRate getDoseRate() {
        return (DoseRate) (isText ? textFields.computeIfAbsent("dose_rate",
                DoseRate::new) : getBinaryColumn("dose_rate"));
    }

    /**
     * Milling time in seconds (is seconds most appropriate unit?)
     * @return Duration
     */
    public Duration getDuration() {
        return (Duration) (isText ? textFields.computeIfAbsent("duration",
                Duration::new) : getBinaryColumn("duration"));
    }

    /**
     * Foreign key relationship to the EM TOMOGRAPHY SPECIMEN category
     * @return EmTomographySpecimenId
     */
    public EmTomographySpecimenId getEmTomographySpecimenId() {
        return (EmTomographySpecimenId) (isText ? textFields.computeIfAbsent("em_tomography_specimen_id",
                EmTomographySpecimenId::new) : getBinaryColumn("em_tomography_specimen_id"));
    }

    /**
     * Final sample thickness
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
     * Initial sample thickness
     * @return InitialThickness
     */
    public InitialThickness getInitialThickness() {
        return (InitialThickness) (isText ? textFields.computeIfAbsent("initial_thickness",
                InitialThickness::new) : getBinaryColumn("initial_thickness"));
    }

    /**
     * The instrument used for focused ion beam sectioning
     * @return Instrument
     */
    public Instrument getInstrument() {
        return (Instrument) (isText ? textFields.computeIfAbsent("instrument",
                Instrument::new) : getBinaryColumn("instrument"));
    }

    /**
     * The ion source used to ablate the specimen
     * @return Ion
     */
    public Ion getIon() {
        return (Ion) (isText ? textFields.computeIfAbsent("ion",
                Ion::new) : getBinaryColumn("ion"));
    }

    /**
     * Temperature of the sample during milling, in degrees Kelvin
     * @return Temperature
     */
    public Temperature getTemperature() {
        return (Temperature) (isText ? textFields.computeIfAbsent("temperature",
                Temperature::new) : getBinaryColumn("temperature"));
    }

    /**
     * Voltage applied to the ion source, in kilovolts
     * @return Voltage
     */
    public Voltage getVoltage() {
        return (Voltage) (isText ? textFields.computeIfAbsent("voltage",
                Voltage::new) : getBinaryColumn("voltage"));
    }
}
