package org.rcsb.cif.model.generated.emtomography;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

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
     * @return Axis1AngleIncrement
     */
    public Axis1AngleIncrement getAxis1AngleIncrement() {
        return (Axis1AngleIncrement) (isText ? textFields.computeIfAbsent("axis1_angle_increment",
                Axis1AngleIncrement::new) : getBinaryColumn("axis1_angle_increment"));
    }

    /**
     * The maximum angle at which the specimen was tilted to obtain
     * recorded images (axis 1).
     * @return Axis1MaxAngle
     */
    public Axis1MaxAngle getAxis1MaxAngle() {
        return (Axis1MaxAngle) (isText ? textFields.computeIfAbsent("axis1_max_angle",
                Axis1MaxAngle::new) : getBinaryColumn("axis1_max_angle"));
    }

    /**
     * The minimum angle at which the specimen was tilted to obtain
     * recorded images (axis 1).
     * @return Axis1MinAngle
     */
    public Axis1MinAngle getAxis1MinAngle() {
        return (Axis1MinAngle) (isText ? textFields.computeIfAbsent("axis1_min_angle",
                Axis1MinAngle::new) : getBinaryColumn("axis1_min_angle"));
    }

    /**
     * The angle increment of specimen tilting to obtain the
     * recorded images (axis 1).
     * @return Axis2AngleIncrement
     */
    public Axis2AngleIncrement getAxis2AngleIncrement() {
        return (Axis2AngleIncrement) (isText ? textFields.computeIfAbsent("axis2_angle_increment",
                Axis2AngleIncrement::new) : getBinaryColumn("axis2_angle_increment"));
    }

    /**
     * The maximum angle at which the specimen was tilted to obtain
     * recorded images (axis 1).
     * @return Axis2MaxAngle
     */
    public Axis2MaxAngle getAxis2MaxAngle() {
        return (Axis2MaxAngle) (isText ? textFields.computeIfAbsent("axis2_max_angle",
                Axis2MaxAngle::new) : getBinaryColumn("axis2_max_angle"));
    }

    /**
     * The minimum angle at which the specimen was tilted to obtain
     * recorded images (axis 1).
     * @return Axis2MinAngle
     */
    public Axis2MinAngle getAxis2MinAngle() {
        return (Axis2MinAngle) (isText ? textFields.computeIfAbsent("axis2_min_angle",
                Axis2MinAngle::new) : getBinaryColumn("axis2_min_angle"));
    }

    /**
     * Angular difference between axis1 and axis2 in degrees
     * @return DualTiltAxisRotation
     */
    public DualTiltAxisRotation getDualTiltAxisRotation() {
        return (DualTiltAxisRotation) (isText ? textFields.computeIfAbsent("dual_tilt_axis_rotation",
                DualTiltAxisRotation::new) : getBinaryColumn("dual_tilt_axis_rotation"));
    }

    /**
     * Primary key
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }

    /**
     * Foreign key to the EM IMAGING category
     * @return ImagingId
     */
    public ImagingId getImagingId() {
        return (ImagingId) (isText ? textFields.computeIfAbsent("imaging_id",
                ImagingId::new) : getBinaryColumn("imaging_id"));
    }
}
