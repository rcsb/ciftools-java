package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Listing of image files (figures) associated with an EMDB entry
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return StrColumn
     */
    public StrColumn getId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("id", StrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * This data item optionally associates an image (figure) with an experiment.
     * @return StrColumn
     */
    public StrColumn getExperimentId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("experiment_id", StrColumn::new) :
                getBinaryColumn("experiment_id"));
    }

    /**
     * The name of the image file associated with the map entry
     * @return StrColumn
     */
    public StrColumn getUploadFileName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("upload_file_name", StrColumn::new) :
                getBinaryColumn("upload_file_name"));
    }

    /**
     * Details about the image file.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }
}
