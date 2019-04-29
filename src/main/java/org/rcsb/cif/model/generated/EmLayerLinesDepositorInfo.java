package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Listing of layer line files associated with the EM entry
 */
@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class EmLayerLinesDepositorInfo extends BaseCategory {
    public EmLayerLinesDepositorInfo(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public EmLayerLinesDepositorInfo(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public EmLayerLinesDepositorInfo(String name) {
        super(name);
    }

    /**
     * This data item is the unique identifier for the layer line file.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("id", SingleRowStrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * This data item is a pointer to the EMD_STRUCT category.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getExperimentId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("experiment_id", SingleRowStrColumn::new) :
                getBinaryColumn("experiment_id"));
    }

    /**
     * The name of the layer line file associated with the map entry
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getUploadFileName() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("upload_file_name", SingleRowStrColumn::new) :
                getBinaryColumn("upload_file_name"));
    }

    /**
     * Details about the layer line file.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDetails() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("details", SingleRowStrColumn::new) :
                getBinaryColumn("details"));
    }
}
