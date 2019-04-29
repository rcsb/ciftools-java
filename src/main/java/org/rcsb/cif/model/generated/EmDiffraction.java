package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Microscopy parameters relevant only for crystallography
 */
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
     * @return FloatColumn
     */
    public FloatColumn getCameraLength() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("camera_length", FloatColumn::new) :
                getBinaryColumn("camera_length"));
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
     * Foreign key to the EM_IMAGING category
     * @return StrColumn
     */
    public StrColumn getImagingId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("imaging_id", StrColumn::new) :
                getBinaryColumn("imaging_id"));
    }

    /**
     * Comma-separated list of tilt angles (in degrees) used in the electron diffraction experiment.
     * @return StrColumn
     */
    public StrColumn getTiltAngleList() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("tilt_angle_list", StrColumn::new) :
                getBinaryColumn("tilt_angle_list"));
    }
}
