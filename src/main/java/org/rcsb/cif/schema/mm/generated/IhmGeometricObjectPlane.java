package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the IHM_GEOMETRIC_OBJECT_PLANE category records the details of
 * a plane used in a spatial restraint.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class IhmGeometricObjectPlane extends BaseCategory {
    public IhmGeometricObjectPlane(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public IhmGeometricObjectPlane(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public IhmGeometricObjectPlane(String name) {
        super(name);
    }

    /**
     * Identifier to the geometric object.
     * This data item is a pointer to the _ihm_geometric_object_list.object_id in the
     * IHM_GEOMETRIC_OBJECT_LIST category.
     * @return IntColumn
     */
    public IntColumn getObjectId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("object_id", IntColumn::new) :
                getBinaryColumn("object_id"));
    }

    /**
     * The type of plane.
     * @return StrColumn
     */
    public StrColumn getPlaneType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("plane_type", StrColumn::new) :
                getBinaryColumn("plane_type"));
    }

    /**
     * Identifier to the description of the transformation.
     * This data item is a pointer to the _ihm_geometric_object_transformation.id in the
     * IHM_GEOMETRIC_OBJECT_TRANSFORMATION category.
     * If no transformation is provide, identity transformation is assumed.
     * @return IntColumn
     */
    public IntColumn getTransformationId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("transformation_id", IntColumn::new) :
                getBinaryColumn("transformation_id"));
    }
}
