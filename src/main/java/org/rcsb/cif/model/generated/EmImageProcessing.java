package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the EM_IMAGE_PROCESSING category
 * record details of the EM image processing procedure.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDetails() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("details", SingleRowStrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * This data item provides a unique identifier for each data processing block.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("id", SingleRowStrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * Foreign key to the EM_IMAGE_RECORDING
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getImageRecordingId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("image_recording_id", SingleRowStrColumn::new) :
                getBinaryColumn("image_recording_id"));
    }
}
