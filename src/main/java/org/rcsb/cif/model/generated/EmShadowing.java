package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items related to shadowing of an EM specimen
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class EmShadowing extends BaseCategory {
    public EmShadowing(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public EmShadowing(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public EmShadowing(String name) {
        super(name);
    }

    /**
     * The shadowing angle (degrees)
     * @return FloatColumn
     */
    public FloatColumn getAngle() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("angle", FloatColumn::new) :
                getBinaryColumn("angle"));
    }

    /**
     * Additional details about specimen shadowing
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
     * The material used in the shadowing.
     * @return StrColumn
     */
    public StrColumn getMaterial() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("material", StrColumn::new) :
                getBinaryColumn("material"));
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
     * Thickness of the deposited shadow coat, in Angstroms.
     * @return FloatColumn
     */
    public FloatColumn getThickness() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("thickness", FloatColumn::new) :
                getBinaryColumn("thickness"));
    }
}
