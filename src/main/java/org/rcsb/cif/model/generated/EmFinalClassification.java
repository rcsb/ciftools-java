package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Information about the final image classification
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class EmFinalClassification extends BaseCategory {
    public EmFinalClassification(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public EmFinalClassification(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public EmFinalClassification(String name) {
        super(name);
    }

    /**
     * The average number of images per class in the final 2D classification
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getAvgNumImagesPerClass() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("avg_num_images_per_class", SingleRowIntColumn::new) :
                getBinaryColumn("avg_num_images_per_class"));
    }

    /**
     * Additional details about the final 2D classification
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
     * The number of classes used in the final 2D classification
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getNumClasses() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("num_classes", SingleRowIntColumn::new) :
                getBinaryColumn("num_classes"));
    }

    /**
     * Space (2D/3D) for the classification.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getType() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("type", SingleRowStrColumn::new) :
                getBinaryColumn("type"));
    }
}
