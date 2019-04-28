package org.rcsb.cif.model.generated.pdbxnmrspectrometer;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxNmrSpectrometer extends BaseCategory {
    public PdbxNmrSpectrometer(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxNmrSpectrometer(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxNmrSpectrometer(String name) {
        super(name);
    }

    /**
     * 
     * Assign a numerical ID to each instrument.
     * @return SpectrometerId
     */
    public SpectrometerId getSpectrometerId() {
        return (SpectrometerId) (isText ? textFields.computeIfAbsent("spectrometer_id",
                SpectrometerId::new) : getBinaryColumn("spectrometer_id"));
    }

    /**
     * 
     * The model of the NMR spectrometer.
     * @return Model
     */
    public Model getModel() {
        return (Model) (isText ? textFields.computeIfAbsent("model",
                Model::new) : getBinaryColumn("model"));
    }

    /**
     * 
     * Select the instrument manufacturer(s) and the model(s) of the NMR(s)
     * used for this work.
     * @return Type
     */
    public Type getType() {
        return (Type) (isText ? textFields.computeIfAbsent("type",
                Type::new) : getBinaryColumn("type"));
    }

    /**
     * 
     * The name of the manufacturer of the spectrometer.
     * @return Manufacturer
     */
    public Manufacturer getManufacturer() {
        return (Manufacturer) (isText ? textFields.computeIfAbsent("manufacturer",
                Manufacturer::new) : getBinaryColumn("manufacturer"));
    }

    /**
     * 
     * Select the field strength for protons in MHz.
     * @return FieldStrength
     */
    public FieldStrength getFieldStrength() {
        return (FieldStrength) (isText ? textFields.computeIfAbsent("field_strength",
                FieldStrength::new) : getBinaryColumn("field_strength"));
    }

    /**
     * 
     * A text description of the NMR spectrometer.
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
    }

    /**
     * 
     * A label that uniquely identifies the NMR spectrometer from other spectrometers
     * listed in the entry.
     * @return Name
     */
    public Name getName() {
        return (Name) (isText ? textFields.computeIfAbsent("name",
                Name::new) : getBinaryColumn("name"));
    }
}
