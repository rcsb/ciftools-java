package org.rcsb.cif.model.generated.emvolumeselection;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class EmVolumeSelection extends BaseCategory {
    public EmVolumeSelection(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public EmVolumeSelection(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public EmVolumeSelection(String name) {
        super(name);
    }

    /**
     * Any additional details used for selecting volumes.
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
    }

    /**
     * Ordinal identifier
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }

    /**
     * The value of _em_volume_selection.image_processing_id points to
     * the EM_IMAGE_PROCESSING category.
     * @return ImageProcessingId
     */
    public ImageProcessingId getImageProcessingId() {
        return (ImageProcessingId) (isText ? textFields.computeIfAbsent("image_processing_id",
                ImageProcessingId::new) : getBinaryColumn("image_processing_id"));
    }

    /**
     * The method used for selecting volumes.
     * @return Method
     */
    public Method getMethod() {
        return (Method) (isText ? textFields.computeIfAbsent("method",
                Method::new) : getBinaryColumn("method"));
    }

    /**
     * The number of tomograms used in the extraction/selection
     * @return NumTomograms
     */
    public NumTomograms getNumTomograms() {
        return (NumTomograms) (isText ? textFields.computeIfAbsent("num_tomograms",
                NumTomograms::new) : getBinaryColumn("num_tomograms"));
    }

    /**
     * The number of volumes selected from the projection set of images.
     * @return NumVolumesExtracted
     */
    public NumVolumesExtracted getNumVolumesExtracted() {
        return (NumVolumesExtracted) (isText ? textFields.computeIfAbsent("num_volumes_extracted",
                NumVolumesExtracted::new) : getBinaryColumn("num_volumes_extracted"));
    }

    /**
     * Description of reference model used for volume selection
     * @return ReferenceModel
     */
    public ReferenceModel getReferenceModel() {
        return (ReferenceModel) (isText ? textFields.computeIfAbsent("reference_model",
                ReferenceModel::new) : getBinaryColumn("reference_model"));
    }
}
