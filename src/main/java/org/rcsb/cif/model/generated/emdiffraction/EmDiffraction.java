package org.rcsb.cif.model.generated.emdiffraction;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class EmDiffraction extends BaseCategory {
    public EmDiffraction(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public EmDiffraction(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public EmDiffraction(String name) {
        super(name);
    }

    /**
     * @return CameraLength
     */
    public CameraLength getCameraLength() {
        return (CameraLength) (isText ? textFields.computeIfAbsent("camera_length",
                CameraLength::new) : getBinaryColumn("camera_length"));
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
     * Foreign key to the EM_IMAGING category
     * @return ImagingId
     */
    public ImagingId getImagingId() {
        return (ImagingId) (isText ? textFields.computeIfAbsent("imaging_id",
                ImagingId::new) : getBinaryColumn("imaging_id"));
    }

    /**
     * Comma-separated list of tilt angles (in degrees) used in the electron diffraction experiment.
     * @return TiltAngleList
     */
    public TiltAngleList getTiltAngleList() {
        return (TiltAngleList) (isText ? textFields.computeIfAbsent("tilt_angle_list",
                TiltAngleList::new) : getBinaryColumn("tilt_angle_list"));
    }
}
