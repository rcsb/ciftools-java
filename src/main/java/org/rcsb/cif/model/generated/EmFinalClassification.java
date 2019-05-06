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
     * @return IntColumn
     */
    public IntColumn getAvgNumImagesPerClass() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("avg_num_images_per_class", IntColumn::new) :
                getBinaryColumn("avg_num_images_per_class"));
    }

    /**
     * Additional details about the final 2D classification
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
     * The number of classes used in the final 2D classification
     * @return IntColumn
     */
    public IntColumn getNumClasses() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("num_classes", IntColumn::new) :
                getBinaryColumn("num_classes"));
    }

    /**
     * Space (2D/3D) for the classification.
     * @return StrColumn
     */
    public StrColumn getType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("type", StrColumn::new) :
                getBinaryColumn("type"));
    }
}
