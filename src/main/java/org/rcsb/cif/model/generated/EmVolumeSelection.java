package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Volume selection in image processing
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * Ordinal identifier
     * @return StrColumn
     */
    public StrColumn getId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("id", StrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * The value of _em_volume_selection.image_processing_id points to
     * the EM_IMAGE_PROCESSING category.
     * @return StrColumn
     */
    public StrColumn getImageProcessingId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("image_processing_id", StrColumn::new) :
                getBinaryColumn("image_processing_id"));
    }

    /**
     * The method used for selecting volumes.
     * @return StrColumn
     */
    public StrColumn getMethod() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("method", StrColumn::new) :
                getBinaryColumn("method"));
    }

    /**
     * The number of tomograms used in the extraction/selection
     * @return IntColumn
     */
    public IntColumn getNumTomograms() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("num_tomograms", IntColumn::new) :
                getBinaryColumn("num_tomograms"));
    }

    /**
     * The number of volumes selected from the projection set of images.
     * @return IntColumn
     */
    public IntColumn getNumVolumesExtracted() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("num_volumes_extracted", IntColumn::new) :
                getBinaryColumn("num_volumes_extracted"));
    }

    /**
     * Description of reference model used for volume selection
     * @return StrColumn
     */
    public StrColumn getReferenceModel() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("reference_model", StrColumn::new) :
                getBinaryColumn("reference_model"));
    }
}
