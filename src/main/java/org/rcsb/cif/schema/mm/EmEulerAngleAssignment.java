package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Category to describe the euler angle assignement
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class EmEulerAngleAssignment extends DelegatingCategory {
    public EmEulerAngleAssignment(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "details":
                return getDetails();
            case "id":
                return getId();
            case "image_processing_id":
                return getImageProcessingId();
            case "order":
                return getOrder();
            case "proj_matching_angular_sampling":
                return getProjMatchingAngularSampling();
            case "proj_matching_merit_function":
                return getProjMatchingMeritFunction();
            case "proj_matching_num_projections":
                return getProjMatchingNumProjections();
            case "type":
                return getType();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * Any additional details about euler angle assignment
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
     * Foreign key to the EM_IMAGE_PROCESSING category
     * @return StrColumn
     */
    public StrColumn getImageProcessingId() {
        return delegate.getColumn("image_processing_id", DelegatingStrColumn::new);
    }

    /**
     * Stage of the reconstruction in which the angle assignments were made.
     * @return StrColumn
     */
    public StrColumn getOrder() {
        return delegate.getColumn("order", DelegatingStrColumn::new);
    }

    /**
     * Angular sampling of projection matching
     * @return FloatColumn
     */
    public FloatColumn getProjMatchingAngularSampling() {
        return delegate.getColumn("proj_matching_angular_sampling", DelegatingFloatColumn::new);
    }

    /**
     * Overall figure of merit for projection matching
     * @return StrColumn
     */
    public StrColumn getProjMatchingMeritFunction() {
        return delegate.getColumn("proj_matching_merit_function", DelegatingStrColumn::new);
    }

    /**
     * Number of reference projections used for euler angle assignment
     * @return IntColumn
     */
    public IntColumn getProjMatchingNumProjections() {
        return delegate.getColumn("proj_matching_num_projections", DelegatingIntColumn::new);
    }

    /**
     * The procedure used to assigned euler angles.
     * @return StrColumn
     */
    public StrColumn getType() {
        return delegate.getColumn("type", DelegatingStrColumn::new);
    }

}