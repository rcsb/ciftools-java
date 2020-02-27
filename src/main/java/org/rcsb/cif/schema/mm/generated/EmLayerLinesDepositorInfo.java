package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Listing of layer line files associated with the EM entry
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return StrColumn
     */
    public StrColumn getId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("id", StrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * This data item is a pointer to the EMD_STRUCT category.
     * @return StrColumn
     */
    public StrColumn getExperimentId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("experiment_id", StrColumn::new) :
                getBinaryColumn("experiment_id"));
    }

    /**
     * The name of the layer line file associated with the map entry
     * @return StrColumn
     */
    public StrColumn getUploadFileName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("upload_file_name", StrColumn::new) :
                getBinaryColumn("upload_file_name"));
    }

    /**
     * Details about the layer line file.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }
}
