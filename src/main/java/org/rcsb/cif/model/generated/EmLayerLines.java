package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Listing of all layer line files associated with the EM entry
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class EmLayerLines extends BaseCategory {
    public EmLayerLines(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public EmLayerLines(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public EmLayerLines(String name) {
        super(name);
    }

    /**
     * Details about the layer line file.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * This data item is a pointer to the EM EXPERIMENT category.
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
    public StrColumn getFile() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("file", StrColumn::new) :
                getBinaryColumn("file"));
    }

    /**
     * This data item is the unique identifier for the layer line file.
     * @return StrColumn
     */
    public StrColumn getId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("id", StrColumn::new) :
                getBinaryColumn("id"));
    }
}
