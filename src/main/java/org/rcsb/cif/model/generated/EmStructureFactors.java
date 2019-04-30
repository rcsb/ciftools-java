package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Listing of all structure factor files associated with the EM entry
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class EmStructureFactors extends BaseCategory {
    public EmStructureFactors(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public EmStructureFactors(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public EmStructureFactors(String name) {
        super(name);
    }

    /**
     * Details about the structure factor file.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDetails() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("details", SingleRowStrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * This data item is a pointer to the EM EXPERIMENT category.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getExperimentId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("experiment_id", SingleRowStrColumn::new) :
                getBinaryColumn("experiment_id"));
    }

    /**
     * The name of the structure factor file associated with the map entry
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getFile() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("file", SingleRowStrColumn::new) :
                getBinaryColumn("file"));
    }

    /**
     * This data item is the unique identifier for the structure factor file.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("id", SingleRowStrColumn::new) :
                getBinaryColumn("id"));
    }
}
