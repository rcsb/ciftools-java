package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Category to describe the euler angle assignement
 */
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
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDetails() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("details", SingleRowStrColumn::new) :
                getBinaryColumn("details"));
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
     * Foreign key to the EM_IMAGE_PROCESSING category
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getImageProcessingId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("image_processing_id", SingleRowStrColumn::new) :
                getBinaryColumn("image_processing_id"));
    }

    /**
     * Stage of the reconstruction in which the angle assignments were made.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getOrder() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("order", SingleRowStrColumn::new) :
                getBinaryColumn("order"));
    }

    /**
     * Angular sampling of projection matching
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getProjMatchingAngularSampling() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("proj_matching_angular_sampling", SingleRowFloatColumn::new) :
                getBinaryColumn("proj_matching_angular_sampling"));
    }

    /**
     * Overall figure of merit for projection matching
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getProjMatchingMeritFunction() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("proj_matching_merit_function", SingleRowStrColumn::new) :
                getBinaryColumn("proj_matching_merit_function"));
    }

    /**
     * Number of reference projections used for euler angle assignment
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getProjMatchingNumProjections() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("proj_matching_num_projections", SingleRowIntColumn::new) :
                getBinaryColumn("proj_matching_num_projections"));
    }

    /**
     * The procedure used to assigned euler angles.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getType() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("type", SingleRowStrColumn::new) :
                getBinaryColumn("type"));
    }
}
