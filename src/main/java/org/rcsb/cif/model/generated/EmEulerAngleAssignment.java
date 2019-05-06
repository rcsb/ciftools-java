package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Category to describe the euler angle assignement
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
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
     * Foreign key to the EM_IMAGE_PROCESSING category
     * @return StrColumn
     */
    public StrColumn getImageProcessingId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("image_processing_id", StrColumn::new) :
                getBinaryColumn("image_processing_id"));
    }

    /**
     * Stage of the reconstruction in which the angle assignments were made.
     * @return StrColumn
     */
    public StrColumn getOrder() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("order", StrColumn::new) :
                getBinaryColumn("order"));
    }

    /**
     * Angular sampling of projection matching
     * @return FloatColumn
     */
    public FloatColumn getProjMatchingAngularSampling() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("proj_matching_angular_sampling", FloatColumn::new) :
                getBinaryColumn("proj_matching_angular_sampling"));
    }

    /**
     * Overall figure of merit for projection matching
     * @return StrColumn
     */
    public StrColumn getProjMatchingMeritFunction() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("proj_matching_merit_function", StrColumn::new) :
                getBinaryColumn("proj_matching_merit_function"));
    }

    /**
     * Number of reference projections used for euler angle assignment
     * @return IntColumn
     */
    public IntColumn getProjMatchingNumProjections() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("proj_matching_num_projections", IntColumn::new) :
                getBinaryColumn("proj_matching_num_projections"));
    }

    /**
     * The procedure used to assigned euler angles.
     * @return StrColumn
     */
    public StrColumn getType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("type", StrColumn::new) :
                getBinaryColumn("type"));
    }
}
