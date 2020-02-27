package org.rcsb.cif.schema.mm.generated;

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
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * This data item provides a unique identifier for each data processing block.
     * @return StrColumn
     */
    public StrColumn getId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("id", StrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * Foreign key to the EM_IMAGE_RECORDING
     * @return StrColumn
     */
    public StrColumn getImageRecordingId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("image_recording_id", StrColumn::new) :
                getBinaryColumn("image_recording_id"));
    }
}
