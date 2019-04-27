package org.rcsb.cif.model.emfinalclassification;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
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
     * @return AvgNumImagesPerClass
     */
    public AvgNumImagesPerClass getAvgNumImagesPerClass() {
        return (AvgNumImagesPerClass) (isText ? textFields.computeIfAbsent("avg_num_images_per_class",
                AvgNumImagesPerClass::new) : getBinaryColumn("avg_num_images_per_class"));
    }

    /**
     * Additional details about the final 2D classification
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
     * The number of classes used in the final 2D classification
     * @return NumClasses
     */
    public NumClasses getNumClasses() {
        return (NumClasses) (isText ? textFields.computeIfAbsent("num_classes",
                NumClasses::new) : getBinaryColumn("num_classes"));
    }

    /**
     * Space (2D/3D) for the classification.
     * @return Type
     */
    public Type getType() {
        return (Type) (isText ? textFields.computeIfAbsent("type",
                Type::new) : getBinaryColumn("type"));
    }
}
