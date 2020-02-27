package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the IHM_GEOMETRIC_OBJECT_HALF_TORUS category records the parameters of
 * half-torus that represents a membrane.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class IhmGeometricObjectHalfTorus extends BaseCategory {
    public IhmGeometricObjectHalfTorus(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public IhmGeometricObjectHalfTorus(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public IhmGeometricObjectHalfTorus(String name) {
        super(name);
    }

    /**
     * Identifier to the geometric object.
     * This data item is a pointer to the _ihm_geometric_object_torus.object_id in the
     * IHM_GEOMETRIC_OBJECT_TORUS category.
     * @return IntColumn
     */
    public IntColumn getObjectId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("object_id", IntColumn::new) :
                getBinaryColumn("object_id"));
    }

    /**
     * Thickness "th" of the half-torus.
     * @return FloatColumn
     */
    public FloatColumn getThicknessTh() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("thickness_th", FloatColumn::new) :
                getBinaryColumn("thickness_th"));
    }

    /**
     * The section of the torus representing the half-torus.
     * @return StrColumn
     */
    public StrColumn getSection() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("section", StrColumn::new) :
                getBinaryColumn("section"));
    }
}
