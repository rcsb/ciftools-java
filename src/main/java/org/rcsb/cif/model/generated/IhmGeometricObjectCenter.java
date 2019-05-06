package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the IHM_GEOMETRIC_OBJECT_CENTER category records the center of
 * geometric objects used as restraints in the integrative modeling study.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class IhmGeometricObjectCenter extends BaseCategory {
    public IhmGeometricObjectCenter(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public IhmGeometricObjectCenter(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public IhmGeometricObjectCenter(String name) {
        super(name);
    }

    /**
     * A unique identifier for the center.
     * @return IntColumn
     */
    public IntColumn getId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("id", IntColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * The x-coordinate of the center.
     * @return FloatColumn
     */
    public FloatColumn getXcoord() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("xcoord", FloatColumn::new) :
                getBinaryColumn("xcoord"));
    }

    /**
     * The y-coordinate of the center.
     * @return FloatColumn
     */
    public FloatColumn getYcoord() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("ycoord", FloatColumn::new) :
                getBinaryColumn("ycoord"));
    }

    /**
     * The z-coordinate of the center.
     * @return FloatColumn
     */
    public FloatColumn getZcoord() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("zcoord", FloatColumn::new) :
                getBinaryColumn("zcoord"));
    }
}
