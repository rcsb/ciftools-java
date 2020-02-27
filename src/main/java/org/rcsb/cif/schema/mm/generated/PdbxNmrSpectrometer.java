package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * 
 * The details about each spectrometer used to collect data for this
 * deposition.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return StrColumn
     */
    public StrColumn getSpectrometerId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("spectrometer_id", StrColumn::new) :
                getBinaryColumn("spectrometer_id"));
    }

    /**
     * 
     * The model of the NMR spectrometer.
     * @return StrColumn
     */
    public StrColumn getModel() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("model", StrColumn::new) :
                getBinaryColumn("model"));
    }

    /**
     * 
     * Select the instrument manufacturer(s) and the model(s) of the NMR(s)
     * used for this work.
     * @return StrColumn
     */
    public StrColumn getType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("type", StrColumn::new) :
                getBinaryColumn("type"));
    }

    /**
     * 
     * The name of the manufacturer of the spectrometer.
     * @return StrColumn
     */
    public StrColumn getManufacturer() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("manufacturer", StrColumn::new) :
                getBinaryColumn("manufacturer"));
    }

    /**
     * 
     * Select the field strength for protons in MHz.
     * @return FloatColumn
     */
    public FloatColumn getFieldStrength() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("field_strength", FloatColumn::new) :
                getBinaryColumn("field_strength"));
    }

    /**
     * 
     * A text description of the NMR spectrometer.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * 
     * A label that uniquely identifies the NMR spectrometer from other spectrometers
     * listed in the entry.
     * @return StrColumn
     */
    public StrColumn getName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("name", StrColumn::new) :
                getBinaryColumn("name"));
    }
}
