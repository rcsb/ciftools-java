package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Microscopy parameters only relevant for tomography
 */
@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
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
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getAxis1AngleIncrement() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("axis1_angle_increment", SingleRowFloatColumn::new) :
                getBinaryColumn("axis1_angle_increment"));
    }

    /**
     * The maximum angle at which the specimen was tilted to obtain
     * recorded images (axis 1).
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getAxis1MaxAngle() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("axis1_max_angle", SingleRowFloatColumn::new) :
                getBinaryColumn("axis1_max_angle"));
    }

    /**
     * The minimum angle at which the specimen was tilted to obtain
     * recorded images (axis 1).
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getAxis1MinAngle() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("axis1_min_angle", SingleRowFloatColumn::new) :
                getBinaryColumn("axis1_min_angle"));
    }

    /**
     * The angle increment of specimen tilting to obtain the
     * recorded images (axis 1).
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getAxis2AngleIncrement() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("axis2_angle_increment", SingleRowFloatColumn::new) :
                getBinaryColumn("axis2_angle_increment"));
    }

    /**
     * The maximum angle at which the specimen was tilted to obtain
     * recorded images (axis 1).
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getAxis2MaxAngle() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("axis2_max_angle", SingleRowFloatColumn::new) :
                getBinaryColumn("axis2_max_angle"));
    }

    /**
     * The minimum angle at which the specimen was tilted to obtain
     * recorded images (axis 1).
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getAxis2MinAngle() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("axis2_min_angle", SingleRowFloatColumn::new) :
                getBinaryColumn("axis2_min_angle"));
    }

    /**
     * Angular difference between axis1 and axis2 in degrees
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getDualTiltAxisRotation() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("dual_tilt_axis_rotation", SingleRowFloatColumn::new) :
                getBinaryColumn("dual_tilt_axis_rotation"));
    }

    /**
     * Primary key
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("id", SingleRowStrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * Foreign key to the EM IMAGING category
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getImagingId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("imaging_id", SingleRowStrColumn::new) :
                getBinaryColumn("imaging_id"));
    }
}
