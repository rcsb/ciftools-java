package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Microscopy parameters only relevant for tomography
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class EmTomography extends BaseCategory {
    public EmTomography(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public EmTomography(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public EmTomography(String name) {
        super(name);
    }

    /**
     * The angle increment of specimen tilting to obtain the
     * recorded images (axis 1).
     * @return FloatColumn
     */
    public FloatColumn getAxis1AngleIncrement() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("axis1_angle_increment", FloatColumn::new) :
                getBinaryColumn("axis1_angle_increment"));
    }

    /**
     * The maximum angle at which the specimen was tilted to obtain
     * recorded images (axis 1).
     * @return FloatColumn
     */
    public FloatColumn getAxis1MaxAngle() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("axis1_max_angle", FloatColumn::new) :
                getBinaryColumn("axis1_max_angle"));
    }

    /**
     * The minimum angle at which the specimen was tilted to obtain
     * recorded images (axis 1).
     * @return FloatColumn
     */
    public FloatColumn getAxis1MinAngle() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("axis1_min_angle", FloatColumn::new) :
                getBinaryColumn("axis1_min_angle"));
    }

    /**
     * The angle increment of specimen tilting to obtain the
     * recorded images (axis 1).
     * @return FloatColumn
     */
    public FloatColumn getAxis2AngleIncrement() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("axis2_angle_increment", FloatColumn::new) :
                getBinaryColumn("axis2_angle_increment"));
    }

    /**
     * The maximum angle at which the specimen was tilted to obtain
     * recorded images (axis 1).
     * @return FloatColumn
     */
    public FloatColumn getAxis2MaxAngle() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("axis2_max_angle", FloatColumn::new) :
                getBinaryColumn("axis2_max_angle"));
    }

    /**
     * The minimum angle at which the specimen was tilted to obtain
     * recorded images (axis 1).
     * @return FloatColumn
     */
    public FloatColumn getAxis2MinAngle() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("axis2_min_angle", FloatColumn::new) :
                getBinaryColumn("axis2_min_angle"));
    }

    /**
     * Angular difference between axis1 and axis2 in degrees
     * @return FloatColumn
     */
    public FloatColumn getDualTiltAxisRotation() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("dual_tilt_axis_rotation", FloatColumn::new) :
                getBinaryColumn("dual_tilt_axis_rotation"));
    }

    /**
     * Primary key
     * @return StrColumn
     */
    public StrColumn getId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("id", StrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * Foreign key to the EM IMAGING category
     * @return StrColumn
     */
    public StrColumn getImagingId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("imaging_id", StrColumn::new) :
                getBinaryColumn("imaging_id"));
    }
}
