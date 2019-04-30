package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Description of sectioning by ultramicrotomy
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class EmUltramicrotomy extends BaseCategory {
    public EmUltramicrotomy(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public EmUltramicrotomy(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public EmUltramicrotomy(String name) {
        super(name);
    }

    /**
     * Additional details about the ultramicrotomy sample preparation
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * Foreign key relationship to the EMD SPECIMEN category
     * @return StrColumn
     */
    public StrColumn getEmTomographySpecimenId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("em_tomography_specimen_id", StrColumn::new) :
                getBinaryColumn("em_tomography_specimen_id"));
    }

    /**
     * Final thickness of the sectioned sample, in nanometers
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
     * Ultramicrotome instrument used for sectioning
     * @return StrColumn
     */
    public StrColumn getInstrument() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("instrument", StrColumn::new) :
                getBinaryColumn("instrument"));
    }

    /**
     * Temperature of the sample during microtome sectioning, in degrees Kelvin
     * @return IntColumn
     */
    public IntColumn getTemperature() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("temperature", IntColumn::new) :
                getBinaryColumn("temperature"));
    }
}
