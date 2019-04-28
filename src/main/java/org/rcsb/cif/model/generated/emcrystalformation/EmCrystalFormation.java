package org.rcsb.cif.model.generated.emcrystalformation;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class EmCrystalFormation extends BaseCategory {
    public EmCrystalFormation(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public EmCrystalFormation(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public EmCrystalFormation(String name) {
        super(name);
    }

    /**
     * The type of atmosphere in which crystals were grown
     * @return Atmosphere
     */
    public Atmosphere getAtmosphere() {
        return (Atmosphere) (isText ? textFields.computeIfAbsent("atmosphere",
                Atmosphere::new) : getBinaryColumn("atmosphere"));
    }

    /**
     * Description of growth of a 2D, 3D, or helical crystal array.
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
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
     * Instrument used to prepare the crystalline array
     * @return Instrument
     */
    public Instrument getInstrument() {
        return (Instrument) (isText ? textFields.computeIfAbsent("instrument",
                Instrument::new) : getBinaryColumn("instrument"));
    }

    /**
     * Description of the lipid mixture used for crystallization
     * @return LipidMixture
     */
    public LipidMixture getLipidMixture() {
        return (LipidMixture) (isText ? textFields.computeIfAbsent("lipid_mixture",
                LipidMixture::new) : getBinaryColumn("lipid_mixture"));
    }

    /**
     * The molar ratio of lipid to protein in the crystallized sample
     * @return LipidProteinRatio
     */
    public LipidProteinRatio getLipidProteinRatio() {
        return (LipidProteinRatio) (isText ? textFields.computeIfAbsent("lipid_protein_ratio",
                LipidProteinRatio::new) : getBinaryColumn("lipid_protein_ratio"));
    }

    /**
     * Foreign key relationship to the EMD SPECIMEN category
     * @return SpecimenId
     */
    public SpecimenId getSpecimenId() {
        return (SpecimenId) (isText ? textFields.computeIfAbsent("specimen_id",
                SpecimenId::new) : getBinaryColumn("specimen_id"));
    }

    /**
     * The value of the temperature in degrees Kelvin used for
     * growing the crystals.
     * @return Temperature
     */
    public Temperature getTemperature() {
        return (Temperature) (isText ? textFields.computeIfAbsent("temperature",
                Temperature::new) : getBinaryColumn("temperature"));
    }

    /**
     * Time period for array crystallization, in time unit indicated (min, hr, day, month, year)
     * @return Time
     */
    public Time getTime() {
        return (Time) (isText ? textFields.computeIfAbsent("time",
                Time::new) : getBinaryColumn("time"));
    }

    /**
     * Time unit for array crystallization
     * @return TimeUnit
     */
    public TimeUnit getTimeUnit() {
        return (TimeUnit) (isText ? textFields.computeIfAbsent("time_unit",
                TimeUnit::new) : getBinaryColumn("time_unit"));
    }
}
