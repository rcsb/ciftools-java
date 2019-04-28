package org.rcsb.cif.model.generated.emsoftware;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class EmSoftware extends BaseCategory {
    public EmSoftware(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public EmSoftware(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public EmSoftware(String name) {
        super(name);
    }

    /**
     * The purpose of the software.
     * @return Category
     */
    public Category getCategory() {
        return (Category) (isText ? textFields.computeIfAbsent("category",
                Category::new) : getBinaryColumn("category"));
    }

    /**
     * Details about the software used.
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
    }

    /**
     * Unique identifier for each software description.
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }

    /**
     * pointer to _em_image_processing.id in the EM_IMAGE_PROCESSING category.
     * @return ImageProcessingId
     */
    public ImageProcessingId getImageProcessingId() {
        return (ImageProcessingId) (isText ? textFields.computeIfAbsent("image_processing_id",
                ImageProcessingId::new) : getBinaryColumn("image_processing_id"));
    }

    /**
     * pointer to _em_3d_fitting.id in the EM_3D_FITTING category.
     * @return FittingId
     */
    public FittingId getFittingId() {
        return (FittingId) (isText ? textFields.computeIfAbsent("fitting_id",
                FittingId::new) : getBinaryColumn("fitting_id"));
    }

    /**
     * pointer to _em_imaging.id in the EM_IMAGING category.
     * @return ImagingId
     */
    public ImagingId getImagingId() {
        return (ImagingId) (isText ? textFields.computeIfAbsent("imaging_id",
                ImagingId::new) : getBinaryColumn("imaging_id"));
    }

    /**
     * The name of the software package used, e.g., RELION.  Depositors are strongly
     * encouraged to provide a value in this field.
     * @return Name
     */
    public Name getName() {
        return (Name) (isText ? textFields.computeIfAbsent("name",
                Name::new) : getBinaryColumn("name"));
    }

    /**
     * The version of the software.
     * @return Version
     */
    public Version getVersion() {
        return (Version) (isText ? textFields.computeIfAbsent("version",
                Version::new) : getBinaryColumn("version"));
    }
}
