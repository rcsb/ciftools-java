package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Volume selection in image processing
 */
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
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDetails() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("details", SingleRowStrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * Ordinal identifier
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("id", SingleRowStrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * The value of _em_volume_selection.image_processing_id points to
     * the EM_IMAGE_PROCESSING category.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getImageProcessingId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("image_processing_id", SingleRowStrColumn::new) :
                getBinaryColumn("image_processing_id"));
    }

    /**
     * The method used for selecting volumes.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getMethod() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("method", SingleRowStrColumn::new) :
                getBinaryColumn("method"));
    }

    /**
     * The number of tomograms used in the extraction/selection
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getNumTomograms() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("num_tomograms", SingleRowIntColumn::new) :
                getBinaryColumn("num_tomograms"));
    }

    /**
     * The number of volumes selected from the projection set of images.
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getNumVolumesExtracted() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("num_volumes_extracted", SingleRowIntColumn::new) :
                getBinaryColumn("num_volumes_extracted"));
    }

    /**
     * Description of reference model used for volume selection
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getReferenceModel() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("reference_model", SingleRowStrColumn::new) :
                getBinaryColumn("reference_model"));
    }
}
