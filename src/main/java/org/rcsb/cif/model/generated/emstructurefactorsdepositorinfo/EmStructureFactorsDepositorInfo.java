package org.rcsb.cif.model.generated.emstructurefactorsdepositorinfo;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
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
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }

    /**
     * This data item is an optional pointer to the EM_EXPERIMENT category.
     * @return ExperimentId
     */
    public ExperimentId getExperimentId() {
        return (ExperimentId) (isText ? textFields.computeIfAbsent("experiment_id",
                ExperimentId::new) : getBinaryColumn("experiment_id"));
    }

    /**
     * The name of the structure factor file associated with the map entry
     * @return UploadFileName
     */
    public UploadFileName getUploadFileName() {
        return (UploadFileName) (isText ? textFields.computeIfAbsent("upload_file_name",
                UploadFileName::new) : getBinaryColumn("upload_file_name"));
    }

    /**
     * Details about the structure factor file.
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
    }
}
