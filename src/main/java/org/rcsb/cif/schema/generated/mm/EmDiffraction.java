package org.rcsb.cif.schema.generated.mm;

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

    /**
     * TODO
     * @return FloatColumn
     */
    public FloatColumn getCameraLength() {
        return delegate.getColumn("camera_length", DelegatingFloatColumn::new);
    }

    /**
     * Primary key
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
