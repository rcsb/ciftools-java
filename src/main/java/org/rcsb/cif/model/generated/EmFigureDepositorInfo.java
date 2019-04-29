package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Listing of image files (figures) associated with an EMDB entry
 */
@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class EmFigureDepositorInfo extends BaseCategory {
    public EmFigureDepositorInfo(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public EmFigureDepositorInfo(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public EmFigureDepositorInfo(String name) {
        super(name);
    }

    /**
     * This data item is the unique identifier for an image file.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("id", SingleRowStrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * This data item optionally associates an image (figure) with an experiment.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getExperimentId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("experiment_id", SingleRowStrColumn::new) :
                getBinaryColumn("experiment_id"));
    }

    /**
     * The name of the image file associated with the map entry
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getUploadFileName() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("upload_file_name", SingleRowStrColumn::new) :
                getBinaryColumn("upload_file_name"));
    }

    /**
     * Details about the image file.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDetails() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("details", SingleRowStrColumn::new) :
                getBinaryColumn("details"));
    }
}
