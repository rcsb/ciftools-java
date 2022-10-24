package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Description of the software that was used for data collection, data processing,
 * data analysis, structure calculations and refinement. The description should
 * include the name of the software, the author of the software and the version used.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class EmSoftware extends DelegatingCategory {
    public EmSoftware(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "category":
                return getCategory();
            case "details":
                return getDetails();
            case "id":
                return getId();
            case "image_processing_id":
                return getImageProcessingId();
            case "fitting_id":
                return getFittingId();
            case "imaging_id":
                return getImagingId();
            case "name":
                return getName();
            case "version":
                return getVersion();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The purpose of the software.
     * @return StrColumn
     */
    public StrColumn getCategory() {
        return delegate.getColumn("category", DelegatingStrColumn::new);
    }

    /**
     * Details about the software used.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

    /**
     * PRIMARY KEY
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * pointer to _em_image_processing.id in the EM_IMAGE_PROCESSING category.
     * @return StrColumn
     */
    public StrColumn getImageProcessingId() {
        return delegate.getColumn("image_processing_id", DelegatingStrColumn::new);
    }

    /**
     * pointer to _em_3d_fitting.id in the EM_3D_FITTING category.
     * @return StrColumn
     */
    public StrColumn getFittingId() {
        return delegate.getColumn("fitting_id", DelegatingStrColumn::new);
    }

    /**
     * pointer to _em_imaging.id in the EM_IMAGING category.
     * @return StrColumn
     */
    public StrColumn getImagingId() {
        return delegate.getColumn("imaging_id", DelegatingStrColumn::new);
    }

    /**
     * The name of the software package used, e.g., RELION.  Depositors are strongly
     * encouraged to provide a value in this field.
     * @return StrColumn
     */
    public StrColumn getName() {
        return delegate.getColumn("name", DelegatingStrColumn::new);
    }

    /**
     * The version of the software.
     * @return StrColumn
     */
    public StrColumn getVersion() {
        return delegate.getColumn("version", DelegatingStrColumn::new);
    }

}