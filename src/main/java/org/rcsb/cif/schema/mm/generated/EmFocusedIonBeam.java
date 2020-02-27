package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Description of sectioning by focused_ion_beam
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return FloatColumn
     */
    public FloatColumn getCurrent() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("current", FloatColumn::new) :
                getBinaryColumn("current"));
    }

    /**
     * Additional details about FIB milling
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * ions per sq centimetre per second
     * @return IntColumn
     */
    public IntColumn getDoseRate() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("dose_rate", IntColumn::new) :
                getBinaryColumn("dose_rate"));
    }

    /**
     * Milling time in seconds (is seconds most appropriate unit?)
     * @return IntColumn
     */
    public IntColumn getDuration() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("duration", IntColumn::new) :
                getBinaryColumn("duration"));
    }

    /**
     * Foreign key relationship to the EM TOMOGRAPHY SPECIMEN category
     * @return StrColumn
     */
    public StrColumn getEmTomographySpecimenId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("em_tomography_specimen_id", StrColumn::new) :
                getBinaryColumn("em_tomography_specimen_id"));
    }

    /**
     * Final sample thickness
     * @return IntColumn
     */
    public IntColumn getFinalThickness() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("final_thickness", IntColumn::new) :
                getBinaryColumn("final_thickness"));
    }

    /**
     * This data item is the primary key of the category.
     * @return StrColumn
     */
    public StrColumn getId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("id", StrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * Initial sample thickness
     * @return IntColumn
     */
    public IntColumn getInitialThickness() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("initial_thickness", IntColumn::new) :
                getBinaryColumn("initial_thickness"));
    }

    /**
     * The instrument used for focused ion beam sectioning
     * @return StrColumn
     */
    public StrColumn getInstrument() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("instrument", StrColumn::new) :
                getBinaryColumn("instrument"));
    }

    /**
     * The ion source used to ablate the specimen
     * @return StrColumn
     */
    public StrColumn getIon() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("ion", StrColumn::new) :
                getBinaryColumn("ion"));
    }

    /**
     * Temperature of the sample during milling, in degrees Kelvin
     * @return IntColumn
     */
    public IntColumn getTemperature() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("temperature", IntColumn::new) :
                getBinaryColumn("temperature"));
    }

    /**
     * Voltage applied to the ion source, in kilovolts
     * @return IntColumn
     */
    public IntColumn getVoltage() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("voltage", IntColumn::new) :
                getBinaryColumn("voltage"));
    }
}
