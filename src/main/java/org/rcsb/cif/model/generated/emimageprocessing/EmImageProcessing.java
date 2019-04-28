package org.rcsb.cif.model.generated.emimageprocessing;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class EmImageProcessing extends BaseCategory {
    public EmImageProcessing(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public EmImageProcessing(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public EmImageProcessing(String name) {
        super(name);
    }

    /**
     * Method details.
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
    }

    /**
     * This data item provides a unique identifier for each data processing block.
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }

    /**
     * Foreign key to the EM_IMAGE_RECORDING
     * @return ImageRecordingId
     */
    public ImageRecordingId getImageRecordingId() {
        return (ImageRecordingId) (isText ? textFields.computeIfAbsent("image_recording_id",
                ImageRecordingId::new) : getBinaryColumn("image_recording_id"));
    }
}
