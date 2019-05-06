package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the IHM_GEOMETRIC_OBJECT_TORUS category records the parameters of
 * a torus. By definition, the base plane of the torus is the XY plane. The
 * `ihm_geometric_object_transformation` category can be used to generate
 * transformations to any other plane.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class IhmGeometricObjectTorus extends BaseCategory {
    public IhmGeometricObjectTorus(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public IhmGeometricObjectTorus(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public IhmGeometricObjectTorus(String name) {
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
     * Major radius "R" of the torus.
     * @return FloatColumn
     */
    public FloatColumn getMajorRadiusR() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("major_radius_R", FloatColumn::new) :
                getBinaryColumn("major_radius_R"));
    }

    /**
     * Minor radius "r" of the torus.
     * @return FloatColumn
     */
    public FloatColumn getMinorRadiusR() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("minor_radius_r", FloatColumn::new) :
                getBinaryColumn("minor_radius_r"));
    }
}
