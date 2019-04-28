package org.rcsb.cif.model.generated.emeulerangleassignment;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class EmEulerAngleAssignment extends BaseCategory {
    public EmEulerAngleAssignment(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public EmEulerAngleAssignment(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public EmEulerAngleAssignment(String name) {
        super(name);
    }

    /**
     * Any additional details about euler angle assignment
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
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
     * Foreign key to the EM_IMAGE_PROCESSING category
     * @return ImageProcessingId
     */
    public ImageProcessingId getImageProcessingId() {
        return (ImageProcessingId) (isText ? textFields.computeIfAbsent("image_processing_id",
                ImageProcessingId::new) : getBinaryColumn("image_processing_id"));
    }

    /**
     * Stage of the reconstruction in which the angle assignments were made.
     * @return Order
     */
    public Order getOrder() {
        return (Order) (isText ? textFields.computeIfAbsent("order",
                Order::new) : getBinaryColumn("order"));
    }

    /**
     * Angular sampling of projection matching
     * @return ProjMatchingAngularSampling
     */
    public ProjMatchingAngularSampling getProjMatchingAngularSampling() {
        return (ProjMatchingAngularSampling) (isText ? textFields.computeIfAbsent("proj_matching_angular_sampling",
                ProjMatchingAngularSampling::new) : getBinaryColumn("proj_matching_angular_sampling"));
    }

    /**
     * Overall figure of merit for projection matching
     * @return ProjMatchingMeritFunction
     */
    public ProjMatchingMeritFunction getProjMatchingMeritFunction() {
        return (ProjMatchingMeritFunction) (isText ? textFields.computeIfAbsent("proj_matching_merit_function",
                ProjMatchingMeritFunction::new) : getBinaryColumn("proj_matching_merit_function"));
    }

    /**
     * Number of reference projections used for euler angle assignment
     * @return ProjMatchingNumProjections
     */
    public ProjMatchingNumProjections getProjMatchingNumProjections() {
        return (ProjMatchingNumProjections) (isText ? textFields.computeIfAbsent("proj_matching_num_projections",
                ProjMatchingNumProjections::new) : getBinaryColumn("proj_matching_num_projections"));
    }

    /**
     * The procedure used to assigned euler angles.
     * @return Type
     */
    public Type getType() {
        return (Type) (isText ? textFields.computeIfAbsent("type",
                Type::new) : getBinaryColumn("type"));
    }
}
