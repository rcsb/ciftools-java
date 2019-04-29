package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items related to shadowing of an EM specimen
 */
@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
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
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getAngle() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("angle", SingleRowFloatColumn::new) :
                getBinaryColumn("angle"));
    }

    /**
     * Additional details about specimen shadowing
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDetails() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("details", SingleRowStrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * This data item is the primary key of the category.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("id", SingleRowStrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * The material used in the shadowing.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getMaterial() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("material", SingleRowStrColumn::new) :
                getBinaryColumn("material"));
    }

    /**
     * Foreign key relationship to the EMD SPECIMEN category
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getSpecimenId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("specimen_id", SingleRowStrColumn::new) :
                getBinaryColumn("specimen_id"));
    }

    /**
     * Thickness of the deposited shadow coat, in Angstroms.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getThickness() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("thickness", SingleRowFloatColumn::new) :
                getBinaryColumn("thickness"));
    }
}
