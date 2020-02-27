package org.rcsb.cif.schema.mm.generated;

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
     * The name of the structure factor file associated with the map entry
     * @return StrColumn
     */
    public StrColumn getFile() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("file", StrColumn::new) :
                getBinaryColumn("file"));
    }

    /**
     * This data item is the unique identifier for the structure factor file.
     * @return StrColumn
     */
    public StrColumn getId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("id", StrColumn::new) :
                getBinaryColumn("id"));
    }
}
