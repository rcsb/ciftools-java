package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Information about the final image classification
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class EmFinalClassification extends DelegatingCategory {
    public EmFinalClassification(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "avg_num_images_per_class":
                return getAvgNumImagesPerClass();
            case "details":
                return getDetails();
            case "id":
                return getId();
            case "image_processing_id":
                return getImageProcessingId();
            case "num_classes":
                return getNumClasses();
            case "type":
                return getType();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The average number of images per class in the final 2D/3D classification
     * @return IntColumn
     */
    public IntColumn getAvgNumImagesPerClass() {
        return delegate.getColumn("avg_num_images_per_class", DelegatingIntColumn::new);
    }

    /**
     * Additional details about the final 2D/3D classification
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
     * The number of classes used in the final 2D/3D classification
     * @return IntColumn
     */
    public IntColumn getNumClasses() {
        return delegate.getColumn("num_classes", DelegatingIntColumn::new);
    }

    /**
     * Space (2D/3D) for the classification.
     * @return StrColumn
     */
    public StrColumn getType() {
        return delegate.getColumn("type", DelegatingStrColumn::new);
    }

}