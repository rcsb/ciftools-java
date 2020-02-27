package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the IHM_GEOMETRIC_OBJECT_SPHERE category records the parameters of
 * a sphere.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class IhmGeometricObjectSphere extends BaseCategory {
    public IhmGeometricObjectSphere(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public IhmGeometricObjectSphere(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public IhmGeometricObjectSphere(String name) {
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
     * Identifier to the description of the center.
     * This data item is a pointer to the _ihm_geometric_object_center.id in the
     * IHM_GEOMETRIC_OBJECT_CENTER category.
     * @return IntColumn
     */
    public IntColumn getCenterId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("center_id", IntColumn::new) :
                getBinaryColumn("center_id"));
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

    /**
     * Radius "r" of the sphere.
     * @return FloatColumn
     */
    public FloatColumn getRadiusR() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("radius_r", FloatColumn::new) :
                getBinaryColumn("radius_r"));
    }
}
