package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Description of growth of a 2D, 3D, or helical crystal array.
 */
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
     * @return StrColumn
     */
    public StrColumn getAtmosphere() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("atmosphere", StrColumn::new) :
                getBinaryColumn("atmosphere"));
    }

    /**
     * Description of growth of a 2D, 3D, or helical crystal array.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
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
     * Instrument used to prepare the crystalline array
     * @return StrColumn
     */
    public StrColumn getInstrument() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("instrument", StrColumn::new) :
                getBinaryColumn("instrument"));
    }

    /**
     * Description of the lipid mixture used for crystallization
     * @return StrColumn
     */
    public StrColumn getLipidMixture() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("lipid_mixture", StrColumn::new) :
                getBinaryColumn("lipid_mixture"));
    }

    /**
     * The molar ratio of lipid to protein in the crystallized sample
     * @return FloatColumn
     */
    public FloatColumn getLipidProteinRatio() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("lipid_protein_ratio", FloatColumn::new) :
                getBinaryColumn("lipid_protein_ratio"));
    }

    /**
     * Foreign key relationship to the EMD SPECIMEN category
     * @return StrColumn
     */
    public StrColumn getSpecimenId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("specimen_id", StrColumn::new) :
                getBinaryColumn("specimen_id"));
    }

    /**
     * The value of the temperature in degrees Kelvin used for
     * growing the crystals.
     * @return IntColumn
     */
    public IntColumn getTemperature() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("temperature", IntColumn::new) :
                getBinaryColumn("temperature"));
    }

    /**
     * Time period for array crystallization, in time unit indicated (min, hr, day, month, year)
     * @return IntColumn
     */
    public IntColumn getTime() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("time", IntColumn::new) :
                getBinaryColumn("time"));
    }

    /**
     * Time unit for array crystallization
     * @return StrColumn
     */
    public StrColumn getTimeUnit() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("time_unit", StrColumn::new) :
                getBinaryColumn("time_unit"));
    }
}
