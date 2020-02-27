package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the IHM_GEOMETRIC_OBJECT_TRANSFORMATION category records the
 * details of the rotation matrix and translation vector applied for transforming
 * the geometric object.
 * If no transformation is provide, identity transformation is assumed.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class IhmGeometricObjectTransformation extends BaseCategory {
    public IhmGeometricObjectTransformation(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public IhmGeometricObjectTransformation(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public IhmGeometricObjectTransformation(String name) {
        super(name);
    }

    /**
     * A unique identifier for the transformation.
     * @return IntColumn
     */
    public IntColumn getId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("id", IntColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * Data item  of the rotation matrix used in the transformation.
     * @return FloatColumn
     */
    public FloatColumn getRotMatrix11() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("rot_matrix[1][1]", FloatColumn::new) :
                getBinaryColumn("rot_matrix[1][1]"));
    }

    /**
     * Data item  of the rotation matrix used in the transformation.
     * @return FloatColumn
     */
    public FloatColumn getRotMatrix21() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("rot_matrix[2][1]", FloatColumn::new) :
                getBinaryColumn("rot_matrix[2][1]"));
    }

    /**
     * Data item  of the rotation matrix used in the transformation.
     * @return FloatColumn
     */
    public FloatColumn getRotMatrix31() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("rot_matrix[3][1]", FloatColumn::new) :
                getBinaryColumn("rot_matrix[3][1]"));
    }

    /**
     * Data item  of the rotation matrix used in the transformation.
     * @return FloatColumn
     */
    public FloatColumn getRotMatrix12() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("rot_matrix[1][2]", FloatColumn::new) :
                getBinaryColumn("rot_matrix[1][2]"));
    }

    /**
     * Data item  of the rotation matrix used in the transformation.
     * @return FloatColumn
     */
    public FloatColumn getRotMatrix22() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("rot_matrix[2][2]", FloatColumn::new) :
                getBinaryColumn("rot_matrix[2][2]"));
    }

    /**
     * Data item  of the rotation matrix used in the transformation.
     * @return FloatColumn
     */
    public FloatColumn getRotMatrix32() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("rot_matrix[3][2]", FloatColumn::new) :
                getBinaryColumn("rot_matrix[3][2]"));
    }

    /**
     * Data item  of the rotation matrix used in the transformation.
     * @return FloatColumn
     */
    public FloatColumn getRotMatrix13() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("rot_matrix[1][3]", FloatColumn::new) :
                getBinaryColumn("rot_matrix[1][3]"));
    }

    /**
     * Data item  of the rotation matrix used in the transformation.
     * @return FloatColumn
     */
    public FloatColumn getRotMatrix23() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("rot_matrix[2][3]", FloatColumn::new) :
                getBinaryColumn("rot_matrix[2][3]"));
    }

    /**
     * Data item  of the rotation matrix used in the transformation.
     * @return FloatColumn
     */
    public FloatColumn getRotMatrix33() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("rot_matrix[3][3]", FloatColumn::new) :
                getBinaryColumn("rot_matrix[3][3]"));
    }

    /**
     * Data item  of the translation vector used in the transformation.
     * @return FloatColumn
     */
    public FloatColumn getTrVector1() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("tr_vector[1]", FloatColumn::new) :
                getBinaryColumn("tr_vector[1]"));
    }

    /**
     * Data item  of the translation vector used in the transformation.
     * @return FloatColumn
     */
    public FloatColumn getTrVector2() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("tr_vector[2]", FloatColumn::new) :
                getBinaryColumn("tr_vector[2]"));
    }

    /**
     * Data item  of the translation vector used in the transformation.
     * @return FloatColumn
     */
    public FloatColumn getTrVector3() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("tr_vector[3]", FloatColumn::new) :
                getBinaryColumn("tr_vector[3]"));
    }
}
