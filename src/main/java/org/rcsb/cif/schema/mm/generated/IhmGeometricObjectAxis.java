package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the IHM_GEOMETRIC_OBJECT_AXIS category records the details of
 * an axis used in a spatial restraint.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class IhmGeometricObjectAxis extends BaseCategory {
    public IhmGeometricObjectAxis(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public IhmGeometricObjectAxis(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public IhmGeometricObjectAxis(String name) {
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
     * The type of axis.
     * @return StrColumn
     */
    public StrColumn getAxisType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("axis_type", StrColumn::new) :
                getBinaryColumn("axis_type"));
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
