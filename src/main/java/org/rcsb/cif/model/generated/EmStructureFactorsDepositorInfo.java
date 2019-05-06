package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Structure factor files associated with the EM entry
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class EmStructureFactorsDepositorInfo extends BaseCategory {
    public EmStructureFactorsDepositorInfo(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public EmStructureFactorsDepositorInfo(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public EmStructureFactorsDepositorInfo(String name) {
        super(name);
    }

    /**
     * This data item is the unique identifier for the structure factor file.
     * @return StrColumn
     */
    public StrColumn getId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("id", StrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * This data item is an optional pointer to the EM_EXPERIMENT category.
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
    public StrColumn getUploadFileName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("upload_file_name", StrColumn::new) :
                getBinaryColumn("upload_file_name"));
    }

    /**
     * Details about the structure factor file.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }
}
