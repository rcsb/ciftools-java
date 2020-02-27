package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the CELL_MEASUREMENT_REFLN category record
 * details about the reflections used to determine the
 * crystallographic cell parameters.
 * 
 * The CELL_MEASUREMENT_REFLN data items would in general be used
 * only for diffractometer data.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class CellMeasurementRefln extends BaseCategory {
    public CellMeasurementRefln(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public CellMeasurementRefln(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public CellMeasurementRefln(String name) {
        super(name);
    }

    /**
     * Miller index h of a reflection used for measurement of the unit
     * cell.
     * @return IntColumn
     */
    public IntColumn getIndexH() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("index_h", IntColumn::new) :
                getBinaryColumn("index_h"));
    }

    /**
     * Miller index k of a reflection used for measurement of the unit
     * cell.
     * @return IntColumn
     */
    public IntColumn getIndexK() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("index_k", IntColumn::new) :
                getBinaryColumn("index_k"));
    }

    /**
     * Miller index l of a reflection used for measurement of the unit
     * cell.
     * @return IntColumn
     */
    public IntColumn getIndexL() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("index_l", IntColumn::new) :
                getBinaryColumn("index_l"));
    }

    /**
     * Theta angle for a reflection used for measurement of
     * the unit cell in degrees.
     * @return FloatColumn
     */
    public FloatColumn getTheta() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("theta", FloatColumn::new) :
                getBinaryColumn("theta"));
    }
}
