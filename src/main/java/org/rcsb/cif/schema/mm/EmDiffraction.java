package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Microscopy parameters relevant only for crystallography
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class EmDiffraction extends DelegatingCategory {
    public EmDiffraction(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "camera_length":
                return getCameraLength();
            case "id":
                return getId();
            case "imaging_id":
                return getImagingId();
            case "tilt_angle_list":
                return getTiltAngleList();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The camera length (in millimeters). The camera length is the
     * product of the objective focal length and the combined magnification
     * of the intermediate and projector lenses when the microscope is
     * operated in the diffraction mode.
     * @return FloatColumn
     */
    public FloatColumn getCameraLength() {
        return delegate.getColumn("camera_length", DelegatingFloatColumn::new);
    }

    /**
     * PRIMARY KEY
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * Foreign key to the EM_IMAGING category
     * @return StrColumn
     */
    public StrColumn getImagingId() {
        return delegate.getColumn("imaging_id", DelegatingStrColumn::new);
    }

    /**
     * Comma-separated list of tilt angles (in degrees) used in the electron diffraction experiment.
     * @return StrColumn
     */
    public StrColumn getTiltAngleList() {
        return delegate.getColumn("tilt_angle_list", DelegatingStrColumn::new);
    }

}